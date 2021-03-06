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

	val CommonPause = pause(1,2)

//*********************
//***** Landing Page, Login
//*********************

	val Login=group("Login"){
                 exec(http("BasePage") .get("/member/search") .headers(OptumHeaders.headers_0)) 
                  .exec(http("BasePage_1") .get("/assets/application.json") .headers(OptumHeaders.headers_1))
                  .exec(http("BasePage_2") .get("/assets/application.json") .headers(OptumHeaders.headers_1))
                  .exec(http("BasePage_3") .get("/3-es2015.62eec2aa178c07cbaa37.js") .headers(OptumHeaders.headers_3))
                  .exec(http("BasePage_4") .get("/micro-interaction-icons.b0f34942364beb255599.woff") .headers(OptumHeaders.headers_4))
                  .exec(http("BasePage_5") .get("/star/api/v1/api/v1/episode-of-care/search/members?searchTerm=&size=10&page=0&sort=ecv.create_date_time,desc&userLogin=null") .headers(OptumHeaders.headers_5))

	}
                //.pause(1)
                //.pause(1)
                //.pause(1)
                //.exec(http("Search_4") .get("/2-es2015.d0c15ccc1765470f3ac7.js") .headers(OptumHeaders.headers_9) .resources(http("request_10") .get("/1-es2015.f79d52455e4ede2e6e1b.js") .headers(OptumHeaders.headers_9),
            //http("request_11") .get("/9-es2015.9fd2d8af57b901a523b8.js") .headers(OptumHeaders.headers_9),
            //http("request_12") .get("/star/api/v1/api/v1/concierge-accounts") .headers(OptumHeaders.headers_1),
            //http("request_13") .get("/star/api/v1/api/v1/episode-of-care/members/census?memberCdbXrefId=457805839&memberPartitionId=139&condensedView=true&size=5&page=0&sort=createDateTime,desc&regularSort=false&formType=null") .headers(OptumHeaders.headers_5)))
        //.pause(1)
        //.exec(http("request_14") .get("/star/api/v1/api/v1/episode-of-care/members/census?memberCdbXrefId=457805839&memberPartitionId=139&condensedView=true&size=5&page=1&sort=createDateTime,desc&regularSort=true&formType=null") .headers(OptumHeaders.headers_5))

        .pause(1)
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
																					
																	//.check(regex("CSRF.token = '(.+?)'").saveAs("p_csrf"))
																	//.check(regex("memberId":'(+?)'")'saveAs("p_memberId"))
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
                .exec(http("request_1") .get("/jjb/api/v1/rest/member-search?memberId=${p_memberId}") .headers(OptumHeaders.headers_0))
            	.exec(http("request_${p_memberId}") .get("/star/api/v1/api/v1/episode-of-care/members/census?id=${p_memberId}&condensedView=true&size=5&page=0&sort=createDateTime,desc&regularSort=false&formType=null").check(regex("""clinicalReviewId":(.+?),""").saveAs("p_clinicalReviewId")) .headers(OptumHeaders.headers_2))
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

