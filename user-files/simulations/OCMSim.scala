package OCM.Framework

import io.gatling.commons.validation._
import org.apache.commons._
import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


class OCMSim extends Simulation {

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
       // val ITR = System.getenv("ITERATIONS").toInt
       // val ITR2 = System.getenv("ITERATIONS").toInt
       // val RAMP = System.getenv("RAMP").toInt 
       // val Users_1 = System.getenv("SIMULATION_1").toInt
       // val Users_2 = System.getenv("SIMULATION_2").toInt
       // val Users_3 = System.getenv("SIMULATION_3").toInt


//****************************************************
//****************************************************
//These users do the following
//****************************************************
//****************************************************


        val scen_all = scenario("Users_1").repeat(1,"x"){

                group("OCM"){
                    exec(
                                OCMPages.Login)
                        }
        }



        val httpProtocol = http
                .baseUrl("https://siteintercept.qualtrics.com")
                .inferHtmlResources()
                .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36")

	//setUp(  scen_all.inject(rampUsers(Users_1) during (RAMP seconds)))
	setUp(  scen_all.inject(rampUsers(1) during (1 seconds))).protocols(httpProtocol)

}
