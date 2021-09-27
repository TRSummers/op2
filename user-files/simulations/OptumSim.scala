package Optum.Framework

import io.gatling.commons.validation._
import org.apache.commons._
import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


class OptumSim extends Simulation {

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
	val Users_1 = System.getenv("SIMULATION_1").toInt

//****************************************************
//****************************************************
//These users do the following
//****************************************************
//****************************************************

	val scen_1 = scenario("Users_1").repeat(1,"x"){

  		val names = csv("optumnames.txt").circular
		group(""){
			repeat(1){
				exec(
       			 	OptumPages.Login)
			}
      			.repeat(ITR2){
				exec(
				feed(names),
				OptumPages.SearchByActiveMember, OptumPages.CommonPause, 
				OptumPages.SearchMembers, OptumPages.CommonPause,
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

//****************************************************
//****************************************************
// These users do the following:
//****************************************************
//****************************************************

  	val scen_3 = scenario("Users_3").repeat(ITR,"x"){

  		//val feeder = csv("anna.csv").circular

		group("Scen_3") {
			exec(
			//feed(feeder),
			OptumPages.Login)
		}
	}

//****************************************************
//****************************************************
// These users do the following:
// Log in to Datameer
// Select Filebrowser
// Select a workbook
// Rearrange columns
// Run the workbook
// Log out
//****************************************************
//****************************************************

	val scen_4 = scenario("Users_4").repeat(ITR,"x"){

		val r = scala.util.Random

//		var f1 = Iterator.continually(Map("f1" -> (r.nextInt(16))))
//		var f2 = Iterator.continually(Map("f2" -> (r.nextInt(16))))
////		var f3 = Iterator.continually(Map("f3" -> (r.nextInt(16))))
//		var f4 = Iterator.continually(Map("f4" -> (r.nextInt(16))))

		group("Scen_4") {
			exec(
//			feed(f1),
//			feed(f2),
//			feed(f3),
//			feed(f4),
//			OptumPages2.ChangeColumns, OptumPages.CommonPause, 
			OptumPages.Logout)
		}
	}

	val httpProtocol=http.baseUrl("https://" + HOSTNAME) .inferHtmlResources() .acceptHeader("*/*") .acceptEncodingHeader("gzip, deflate") .acceptLanguageHeader("en-US,en;q=0.9") 
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36")

	setUp(
    		scen_1.inject(rampUsers(Users_1) during (RAMP seconds))).protocols(httpProtocol)
}
