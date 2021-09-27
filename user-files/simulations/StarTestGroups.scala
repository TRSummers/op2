package StarTest.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object StarTestGroups {

  val default_header = Map(
    "Content-Type" -> "application/json",
    "X-PAM-CLIENT-ID" -> "4bc2c1c7af8c461ca06f25b0a5066629",
    "X-PAM-CLIENT-SECRET" -> "9010247FC29246ccB16632FB6D321B39",
    "ESB-CARRIER-RESPONDER" -> "ON"
  )

//exec(http("") .get("/api/v1/star-note/${ClinicalReviewId}/true"))
//s3 = ["ApiLionRum_GetClinicianReview.csv"]
//useJWT = true 
//.baseUrl("https://coho-api-star-stg.origin-ctc-core.optum.com")
//PikeJWTToken { url = "https://pike-api-star-stg.origin-ctc-core.optum.com/api/v1/security/portal/api/v1/star-note/${ClinicalReviewId}/true"
//actor = ""
//userName = "1033320638"
//prprid = "FAC600130300"
//s3 = ["ApiLionRum_GetEpisodeOfCare.csv"]
//s3 = ["ApiJarJar_MemberSearch.csv"]
//useJWT = true
//header: { 'content-type': 'application/json', 'x-site-code': pm.environment.get("x-site-code") }
//GetStarUIMemberDetail:  exec(http("") .get("/api/v1/episode-of-care/members/${memberId}/census?size=5&page=0&sort=createDateTime,desc,"))
//****
//GetStarNote: exec(http("GetStarNote") .get("/api/v1/star-note/${ClinicalReviewId}/true") .headers(StarHeaders.headers_2))
//	      .exec(http("GetStarNote") .get("/api/v1/star-note/55192/true") .headers(StarHeaders.headers_2))
//****
//GetChatTranscript: exec(http("") .get("/api/v1/chat-transcript/${ClinicalReviewId}"))

	val LOW = System.getenv("LOW").toInt
	val HIGH = System.getenv("HIGH").toInt

//Setting common pause between user actions
        val CommonPause = pause(LOW,HIGH)

//Login(authenticate)
	val Authenticate=group("Authenticate"){
		exec(http("Authenticate") .post("https://pike-api-star-stg.origin-ctc-core.optum.com/api/v1/security/portal/") .headers(StarHeaders.headers_1)  .body(ElFileBody("Pikerequest.json"))
			 .check(regex("""token":"(.+?)",""") .saveAs("auth_token")))
	}

//GetStarNote 
	val GetStarNote=group("GetStarNote"){
      		exec(http("GetStarNote") .get("/api/v1/star-note/${ClinicalReviewId}/true") .headers(StarHeaders.headers_2))
	}

//GetEpisodeOfCare 
	val GetEpisodeOfCare=group("GetEpisodeOfCare"){
		exec(http("GetEpisodeOfCare") .get("/api/v1/episode-of-care/${episodeId}/census") .headers(StarHeaders.headers_2))
	}

//GetStarUIMemberList 
	val GetStarUIMemberList=group("GetStarUIMemberList"){
		exec(http("GetStarUIMemberList") .get("/api/v1/episode-of-care/search/members?searchTerm=&size=50&page=0&sort=member_last_name,asc") .headers(StarHeaders.headers_2))
	}

//GetStarUIMemberDetail 
	val GetStarUIMemberDetail=group("GetStarUIMemberDetail"){
		exec(http("GetStarUIMemberDetail") .get("/api/v1/episode-of-care/members/${memberId}/census?size=5&page=0&sort=createDateTime,desc") .headers(StarHeaders.headers_2))
	}

// GetChatTranscript 
	val GetChatTranscript=group("ChatTranscript"){
		exec(http("ChatTranscript") .get("/api/v1/chat-transcript/${ClinicalReviewId}") .headers(StarHeaders.headers_2))
	}
}
