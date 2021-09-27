
package JJ.Framework
  
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


object JJHeaders{


        val headers_0 = Map( "Sec-Fetch-Dest" -> "document", "Sec-Fetch-Mode" -> "navigate", "Sec-Fetch-Site" -> "none", "Sec-Fetch-User" -> "?1", "Upgrade-Insecure-Requests" -> "1", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

        val headers_1 = Map( "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "Sec-Fetch-Dest" -> "image", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")


}
