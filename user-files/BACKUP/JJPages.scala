package JJ.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object JJPages{

        val uri2 = "http://search.lookupmanager.com/glg"
        val uri3 = "http://my.datameer.com/rest/external/v1/available"

//************************************************************************************ 
//**** Sets the common pause, commonly referred to as "Think Time" between 35 and 60 sconds
//************************************************************************************ 

	val CommonPause = pause(1,2)

//*********************
//***** NPI
//*********************

val NPI=group("NPI"){
                exec(http("NPI") .get("/api/v1/md-search?npi=1922555846") .headers(headers_0) .resources(http("request_1") .get("/favicon.ico") .headers(JJHeaders.headers_0))
	}
//*********************
//***** TIN
//*********************


//*********************
//***** LastName
//*********************

}

