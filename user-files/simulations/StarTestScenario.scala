package StarTest.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object StarTestScenario{

//GetStarNote
//GetEpisodeOfCare
//GetStarUIMemberList
//GetStarUIMemberDetail
//GetChatTranscript

	val  PAUSE = pause(1, 1)

	val ITR = System.getenv("ITERATIONS").toInt
	//val api = System.getenv("API").toInt

	val StarTestALL = scenario("StarTestALL").repeat(ITR){
		group("StarTestALL / APIs"){
			exec(
				StarTestGroups.GetStarNote,
				PAUSE,
				StarTestGroups.GetEpisodeOfCare,
				PAUSE,
				StarTestGroups.GetStarUIMemberList,
				PAUSE,
				StarTestGroups.GetStarUIMemberDetail,
				PAUSE,
				StarTestGroups.GetChatTranscript
			)
		}
  	}

	val StarTestApi1 = scenario("StarTestApi1").repeat(ITR){
		group("StarTestApi / API"){
			exec(
				StarTestGroups.GetStarNote,
				PAUSE
      			)
   		}
	}  	

	val StarTestApi2 = scenario("StarTestApi2").repeat(ITR){
		group("StarTestApi / API"){
			exec(
				StarTestGroups.GetEpisodeOfCare,
				PAUSE
			)
		}
    	}  	


	val StarTestApi3 = scenario("StarTestApi3").repeat(ITR){
		group("StarTestApi / API"){
			exec(
				StarTestGroups.GetStarUIMemberList,
				PAUSE
			)
		}
    	}  	

	val StarTestApi4 = scenario("StarTestApi4").repeat(ITR){
		group("StarTestApi / API"){
			exec(
				StarTestGroups.GetStarUIMemberDetail,
				PAUSE
			)
		}
    	}  	

	val StarTestApi5 = scenario("StarTestApi5").repeat(ITR){
		group("StarTestApi / API"){
			exec(
				StarTestGroups.GetChatTranscript,
				PAUSE
			)
		}
    	}  	
}
