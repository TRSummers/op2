package MarsTest.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object MarsTestScenario{

//1 SearchByMetaData
// GetAttachmentById 
//2 GetDocumentById
//3 FindAllStates
//4 GetClusterByProviderType
//5 GetProviderAddress
//6 GetProviderName
//7 GetCensus
//8 findMemberLinxById

	val ITR = System.getenv("ITERATIONS").toInt
	val api = System.getenv("API").toInt

	val MarsTestALL = scenario("MarsTestALL").repeat(ITR){
		group("MarsTestALL / APIs"){
			exec(
				MarsTestGroups.GetDocumentById,
				MarsTestGroups.CommonPause,
				MarsTestGroups.FindAllStates,
				MarsTestGroups.CommonPause,
				MarsTestGroups.GetClusterByProviderType,
				MarsTestGroups.CommonPause,
				MarsTestGroups.GetProviderAddress,
				MarsTestGroups.CommonPause,
				MarsTestGroups.GetProviderName,
				MarsTestGroups.CommonPause,
				MarsTestGroups.GetCensus,
				MarsTestGroups.CommonPause,
				MarsTestGroups.findMemberLinxById,
				MarsTestGroups.CommonPause
			)
		}
  	}

	val MarsTestApi1 = scenario("MarsTestApi1").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.SearchByMetaData,
				MarsTestGroups.CommonPause
      			)
   		}
	}  	

	val MarsTestApi2 = scenario("MarsTestApi2").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.GetDocumentById,
				MarsTestGroups.CommonPause
			)
		}
    	}  	


	val MarsTestApi3 = scenario("MarsTestApi3").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.FindAllStates,
				MarsTestGroups.CommonPause
			)
		}
    	}  	

	val MarsTestApi4 = scenario("MarsTestApi4").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.GetClusterByProviderType,
				MarsTestGroups.CommonPause
			)
		}
    	}  	

	val MarsTestApi5 = scenario("MarsTestApi5").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.GetProviderAddress,
				MarsTestGroups.CommonPause
			)
		}
    	}  	

	val MarsTestApi6 = scenario("MarsTestApi6").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.GetProviderName,
				MarsTestGroups.CommonPause
			)
		}
    	}  	

	val MarsTestApi7 = scenario("MarsTestApi7").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.GetCensus,
				MarsTestGroups.CommonPause
			)
		}
    	}  	

	val MarsTestApi8 = scenario("MarsTestApi8").repeat(ITR){
		group("MarsTestApi / API"){
			exec(
				MarsTestGroups.findMemberLinxById,
				MarsTestGroups.CommonPause
			)
		}
    	}  	
}
