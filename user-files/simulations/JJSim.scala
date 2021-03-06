package JJ.Framework

import io.gatling.commons.validation._
import org.apache.commons._
import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


class JJSim extends Simulation {

//****************************************************
//****************************************************
// HOSTNAME = Hostname of the test system
// ITR = Number of iterations
// RAMP = Rampup speed
// Users_1 = Number of users executing the Users_1 scenario
// Users_2 = Number of users executing the Users_2 scenario
// Users_3 = Number of users executing the Users_3 scenario
// Users_4 = Number of users executing the Users_4 scenario
//****************************************************
//****************************************************
//        val HOSTNAME = "coho-advocate-ui-coho-qa3.origin-elr-core-nonprod.optum.com"
        val ITR = System.getenv("ITERATIONS").toInt
        val ITR2 = System.getenv("ITERATIONS").toInt
        val RAMP = System.getenv("RAMP").toInt 
        val Users_1 = System.getenv("SIMULATION_1").toInt
        val Users_2 = System.getenv("SIMULATION_2").toInt
        val Users_3 = System.getenv("SIMULATION_3").toInt


//****************************************************
//****************************************************
//These users do the following
//****************************************************
//****************************************************


        val scen_all = scenario("Users_1").repeat(ITR,"x"){

                val JJfeeder = csv("JJ.CSV").circular

                group("JJ"){
                    exec(
                                feed(JJfeeder),
                                JJPages.NPI, JJPages.CommonPause,
                                JJPages.TIN, JJPages.CommonPause,
                                JJPages.LN, JJPages.CommonPause)
                        }
        }

        val scen_1 = scenario("Users_1").repeat(ITR,"x"){

                val NPIfeeder = csv("NPI.CSV").circular

                group("NPI"){
                    exec(
                                feed(NPIfeeder),
                                JJPages.NPI, JJPages.CommonPause)
                        }
        }

        val scen_2 = scenario("Users_2").repeat(ITR,"x"){

                val TINfeeder = csv("TIN.CSV").circular

                group("TIN"){
                    exec(
                                feed(TINfeeder),
                                JJPages.TIN, JJPages.CommonPause)
                        }
        }

        val scen_3 = scenario("Users_3").repeat(ITR,"x"){

                val LNfeeder = csv("LastName.CSV").circular

                group("LName"){
                    exec(
                                feed(LNfeeder),
                                JJPages.LN, JJPages.CommonPause)
                        }
        }


        val httpProtocol = http
                .baseUrl("https://jj-binks-cbasstg.origin-ctc-core.optum.com")
                .inferHtmlResources()
                .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .acceptEncodingHeader("gzip, deflate")
                .acceptLanguageHeader("en-US,en;q=0.9")
                .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	setUp(  scen_all.inject(rampUsers(Users_1) during (RAMP seconds)),
		scen_2.inject(rampUsers(Users_2) during (RAMP seconds)),
		scen_3.inject(rampUsers(Users_3) during (RAMP seconds))).protocols(httpProtocol)

}
