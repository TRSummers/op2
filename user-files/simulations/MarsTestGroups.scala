package MarsTest.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object MarsTestGroups {

  val default_header = Map(
    "Content-Type" -> "application/json",
    "X-PAM-CLIENT-ID" -> "4bc2c1c7af8c461ca06f25b0a5066629",
    "X-PAM-CLIENT-SECRET" -> "9010247FC29246ccB16632FB6D321B39",
    "ESB-CARRIER-RESPONDER" -> "ON"
  )

//SearchByMetaData
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/search/byMetaData?query=metadata.firstname=Pitt
////GetAttachmentById {
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/attachment/4fd2ba02-4eb2-436a-b2e2-ffa131d7a9e4
//GetDocumentById
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/document/602669adf8a69e00507ba230
//FindAllStates
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/states
//GetClusterByProviderType 
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/providerclusters?providerType=UM01&npi=1750816427
//GetProviderAddress 
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/provider-info?practiceId=GRP300604498&addressId=GRP300604498&addressSubId=001&addressEffDate=2020-01-01%2000%253A00%253A00.0
//GetProviderName 
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/provider-name/GRP300604498
//GetCensus 
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/census?monthsAgo=3&facilityId=FAC000139900
//findMemberLinxById 
//https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/memberlinx/1

        val LOW = System.getenv("LOW").toInt
        val HIGH = System.getenv("HIGH").toInt

//Setting common pause between user actions
        val CommonPause = pause(LOW,HIGH)

val uri1="pike-api-star-stg.origin-ctc-core.optum.com/api/v1/security/portal"

val SearchByMetaData=group("STAR1"){
	exec(http("") .get(uri1 + "/api/v1/star-note/0000202020/true"))
}
//  val SearchByMetaData=group("SearchByMetaData"){
//    exec(http("") .get("/search/byMetaData?query=metadata.firstname=Pitt"))
//  }
  val GetAttachmentById = group("GetAttachmentById") {
    exec(http("") .get("/attachment/4fd2ba02-4eb2-436a-b2e2-ffa131d7a9e4"))
  }
  val GetDocumentById = group("GetDocumentById") {
    exec(http("") .get("/document/602669adf8a69e00507ba230"))
  }
  val FindAllStates = group("FindAllStates") {
    exec(http("") .get("/states"))
  }
  val GetClusterByProviderType = group("GetClusterByProviderType") {
    exec(http("") .get("/providerclusters?providerType=UM01&npi=1750816427"))
  }
  val GetProviderAddress = group("GetProviderAddress") {
    exec(http("") .get("/provider-info?practiceId=GRP300604498&addressId=GRP300604498&addressSubId=001&addressEffDate=2020-01-01%2000%253A00%253A00.0"))
  }
  val GetProviderName = group("GetProviderName") {
    exec(http("") .get("/provider-name/GRP300604498"))
  }
  val GetCensus = group("GetCensus") {
    exec(http("") .get("/census?monthsAgo=3&facilityId=FAC000139900"))
  }
  val findMemberLinxById = group("findMemberLinxById") {
    exec(http("") .get("/memberlinx/1"))
  }
}
