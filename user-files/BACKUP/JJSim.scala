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
	val HOSTNAME = "coho-advocate-ui-coho-qa3.origin-elr-core-nonprod.optum.com"
	val ITR = System.getenv("ITERATIONS").toInt
	val ITR2 = System.getenv("ITERATIONS").toInt
	val RAMP = System.getenv("RAMP").toInt
	val Users_1  = System.getenv("SIMULATION_1").toInt
	val Users_2  = 0
	val Users_3  = 0
	val Users_4  = 0

//****************************************************
//****************************************************
//These users do the following
//****************************************************
//****************************************************

	val scen_1 = scenario("Users_1").repeat(ITR,"x"){

		val feeder = csv("optumnames.txt").circular

		group("Scen_1"){
			exec(
				JJPages.SearchByActiveMember, OptumPages.CommonPause, 
				mPages.SearchMembers, OptumPages.CommonPause,
				OptumPages.SelectMemberbyMemberID, OptumPages.CommonPause,
				OptumPages.MemberDrillDown, OptumPages.CommonPause)
			}
		}
	}

//****************************************************
//****************************************************
// These users do the following:
//  Call JJ-Binks: NPI search
//  Call JJ-Binks: TIN search
//  Call JJ-Binks: LastName search
//****************************************************
//****************************************************


	val httpProtocol=http.baseUrl("https://" + HOSTNAME) .inferHtmlResources() .acceptHeader("*/*") .acceptEncodingHeader("gzip, deflate") .acceptLanguageHeader("en-US,en;q=0.9") 
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36")

	setUp(
    		scen_1.inject(rampUsers(Users_1) during (RAMP seconds))).protocols(httpProtocol)
}
