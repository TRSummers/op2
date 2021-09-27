package Optum.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object OptumPages{

        val uri2 = "http://search.lookupmanager.com/glg"
        val uri3 = "http://my.datameer.com/rest/external/v1/available"

//************************************************************************************ 
//**** Sets the common pause, commonly referred to as "Think Time" between 35 and 60 sconds
//************************************************************************************ 

        val LOW = System.getenv("LOW").toInt
        val HIGH = System.getenv("HIGH").toInt

//Setting common pause between user actions
        val CommonPause = pause(LOW,HIGH)

//*********************
//***** Landing Page, Login
//*********************

	val Login=group("Login"){
                 exec(http("") .get("/trans/member/search") .headers(OptumHeaders.headers_0)) 
                  .exec(http("") .get("/assets/application.json") .headers(OptumHeaders.headers_1))
                  .exec(http("") .get("/assets/application.json") .headers(OptumHeaders.headers_1))
                  .exec(http("") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null") .headers(OptumHeaders.headers_5))

	}

//*********************
//***** Search1 Search by Active Member
//*********************

	val SearchByActiveMember=group("SearchByActiveMember"){
                exec(http("Select_SearchByActiveMember") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=catholic&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null") .headers(OptumHeaders.headers_5))
	}

//*********************
//***** SearchMembers
//*********************

	val SearchMembers=group("SearchName_${name}"){
                exec(http("Search_1") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=${name}&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null").check(regex("""memberId":"(.+?)",""").saveAs("p_memberId")) .headers(OptumHeaders.headers_1))
                .exec(http("Search_${p_memberId}") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=${name}&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null") .headers(OptumHeaders.headers_1))
        //        exec(http("Search_2") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null") .headers(OptumHeaders.headers_5))
	}

//*********************
//***** Search3
//*********************

	val Search3=group("Search3"){
                exec(http("Search_3") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=morton&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null") .headers(OptumHeaders.headers_5))
	}

//**************************
//***** Select Member by ID
//**************************

	val SelectMemberbyMemberID=group("S_${p_memberId}"){
                exec(http("Select_${name}") .get("/star/api/v1/api/v1/concierge-accounts") .headers(OptumHeaders.headers_0))
                .exec(http("") .get("/jjb/api/v1/rest/member-search?memberId=${p_memberId}") .headers(OptumHeaders.headers_0))
            	.exec(http("MemberId:${p_memberId}") .get("/star/api/v1/api/v1/episode-of-care/members/census?id=${p_memberId}&condensedView=true&size=5&page=0&sort=createDateTime,desc&regularSort=false&formType=null").check(regex("""clinicalReviewId":(.+?),""").saveAs("p_clinicalReviewId")) .headers(OptumHeaders.headers_2))
	}

//**********************
//***** DrillDown Detail
//**********************

	val MemberDrillDown=group("DrillDown_${name}"){
                exec(http("${p_clinicalReviewId}") .get("/star/api/v1/api/v1/clinical-review/${p_clinicalReviewId}") .headers(OptumHeaders.headers_0))
	}

//*********************
//***** Logout
//*********************

	val Logout=group("Logout"){
                exec(http("Logout") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=morton&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null") .headers(OptumHeaders.headers_5))
	}
}

