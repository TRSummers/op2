package JJ.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object JJPages{

        val uri2 = "http://search.lookupmanager.com/glg"

//************************************************************************************ 
//**** Sets the common pause, commonly referred to as "Think Time" between 35 and 60 sconds
//************************************************************************************ 

	val CommonPause = pause(1,2)

//*********************
//***** NPI
//*********************

        val NPI=group("NPI"){
                exec(http("NPI_${NPI}") .get("/api/v1/md-search?npi=${NPI}").check(regex("""lastName":"(.+?)",""").saveAs("p_NPIName")) .headers(JJHeaders.headers_0))
        }

//*********************
//***** TIN
//*********************

        val TIN=group("TIN"){
                exec(http("TIN_${TIN}") .get("/api/v1/md-search?tin=${TIN}").check(regex("""lastName":"(.+?)",""").saveAs("p_TIN")) .headers(JJHeaders.headers_0))
        }


//*********************
//***** LN
//*********************

        val LN=group("LN"){
                 exec(http("LName_${LastName}") .get("/api/v1/md-search?lastName=${LastName}&stateCode=WI").check(regex("""lastName":"(.+?)",""").saveAs("p_Lname")) .headers(JJHeaders.headers_0))
	}

}

