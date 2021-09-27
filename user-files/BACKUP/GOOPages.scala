package GOO.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object GOOPages{

        val uri2 = "http://search.lookupmanager.com/glg"

//************************************************************************************ 
//**** Sets the common pause, commonly referred to as "Think Time" between 35 and 60 sconds
//************************************************************************************ 

	val CommonPause = pause(1,2)

//*********************
//***** NPI
//*********************

        val NPI=group("NPI"){
                exec(http("NPI_${NPI}") .get("/api/v1/md-search?npi=${NPI}").check(regex("""lastName":"(.+?)",""").saveAs("p_NPIName")) .headers(GOOHeaders.headers_0))
        }

//*********************
//***** TIN
//*********************

        val TIN=group("TIN"){
                exec(http("TIN_391139101") .get("/api/v1/md-search?tin=391139101").check(regex("""lastName":"(.+?)",""").saveAs("p_TIN")) .headers(GOOHeaders.headers_0))
        }


//*********************
//***** LN
//*********************

        val LN=group("LN"){
                 exec(http("LName_Smith_WI") .get("/api/v1/md-search?lastName=Smith&stateCode=WI").check(regex("""lastName":"(.+?)",""").saveAs("p_Lname")) .headers(GOOHeaders.headers_0))
	}

}

