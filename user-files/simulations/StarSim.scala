package StarTest.Framework
  
import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import io.gatling.commons.validation._
import org.apache.commons._

class StarSim extends Simulation {

        val ITR = System.getenv("ITERATIONS").toInt
        val RAMP = System.getenv("RAMP").toInt
        val Users_1 = System.getenv("SIMULATION_1").toInt
        val Users_2 = System.getenv("SIMULATION_2").toInt
        val Users_3 = System.getenv("SIMULATION_3").toInt
        val API = 0


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
//	HOSTNAME is used for running remotely
//        val HOSTNAME = "coho-advocate-ui-coho-qa3.origin-elr-core-nonprod.optum.com"

//****************************************************
//APIs Tested
//****************************************************

//GetStarNote
//GetEpisodeOfCare
//GetStarUIMemberList
//GetStarUIMemberDetail
//GetChatTranscript

//****************************************************
//****************************************************
//These users do the following
//****************************************************
//****************************************************

        val scen_1 = scenario("Users_1").repeat(1,"x"){

                val Starfeeder = csv("Star1.csv").circular

                        repeat(1){
                                exec(
                                StarTestGroups.Authenticate)
                        }
			.repeat(ITR){
				feed(Starfeeder)
				.exec(
                                StarTestGroups.GetStarNote,
				StarTestGroups.CommonPause,
                                StarTestGroups.GetEpisodeOfCare,
				StarTestGroups.CommonPause,
                                StarTestGroups.GetStarUIMemberList,
				StarTestGroups.CommonPause,
                                StarTestGroups.GetStarUIMemberDetail,
				StarTestGroups.CommonPause,
                                StarTestGroups.GetChatTranscript,
				StarTestGroups.CommonPause)
                        }
	}

        val httpProtocol = http
                .baseUrl("https://coho-api-star-stg.origin-ctc-core.optum.com")
                .acceptHeader("application/json;q=0.9,*/*;q=0.8")
                .acceptLanguageHeader("en-US,en;q=0.5")
                .acceptEncodingHeader("gzip, deflate")

//   setUp(  scen_1.inject(rampUsers(Users_1) during (RAMP seconds)),
//                scen_2.inject(rampUsers(Users_2) during (RAMP seconds)),
//                scen_3.inject(rampUsers(Users_3) during (RAMP seconds))).protocols(httpProtocol)
//
        setUp(  scen_1.inject(rampUsers(Users_1) during (RAMP seconds))).protocols(httpProtocol)
//		scen_2.inject(rampUsers(Users_2) during (RAMP seconds)),
//		scen_3.inject(rampUsers(Users_3) during (RAMP seconds))).protocols(httpProtocol)
//	setUp(scen_1.inject(atOnceUsers(1)),
//	setUp(scen_2.inject(atOnceUsers(1))).protocols(httpProtocol)
}
