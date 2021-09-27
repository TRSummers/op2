package Optum.Framework

import io.gatling.commons.validation._
import org.apache.commons._
import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


class OptumSim extends Simulation{

	val HOSTNAME = "coho-advocate-ui-coho-qa3.origin-elr-core-nonprod.optum.com"
	val ITR = System.getenv("ITERATIONS").toInt
	val ITR2 = System.getenv("ITERATIONS").toInt
	val RAMP = System.getenv("RAMP").toInt
	val Users_1  = System.getenv("SIMULATION_1").toInt
	val Users_2  = 0
	val Users_3  = 0
	val Users_4  = 0

	val scen_1 = scenario("Users_1").repeat(ITR,"x"){

		val feeder = csv("optumnames.txt").circular

		group("Scen_1"){
			repeat(1){
				exec(
       			 	OptumPages.Login)
			}
      			.repeat(ITR2){
				exec(
       				feed(feeder),
				OptumPages.SearchByActiveMember, OptumPages.CommonPause, 
				OptumPages.SearchMembers, OptumPages.CommonPause,
				OptumPages.SelectMemberbyMemberID, OptumPages.CommonPause,
				OptumPages.MemberDrillDown, OptumPages.CommonPause)
			}
		}
	}

	val httpProtocol=http.baseUrl("https://" + HOSTNAME) .inferHtmlResources() .acceptHeader("*/*") .acceptEncodingHeader("gzip, deflate") .acceptLanguageHeader("en-US,en;q=0.9") 
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36")

	setUp( scen_1.inject(rampUsers(Users_1) during (RAMP seconds))).protocols(httpProtocol)
}
