
package Optum.Framework
  
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


object OptumHeaders{

        val headers_0 = Map( "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "Cache-Control" -> "max-age=0", "If-Modified-Since" -> "Fri, 19 Mar 2021 22:05:16 GMT", "Sec-Fetch-Dest" -> "document", "Sec-Fetch-Mode" -> "navigate", "Sec-Fetch-Site" -> "same-origin", "Sec-Fetch-User" -> "?1", "Upgrade-Insecure-Requests" -> "1", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")
        val headers_1 = Map( "Cache-Control" -> "no-cache", "Content-Type" -> "application/json", "Expires" -> "Sat, 01 Jan 2000 00:00:00 GMT", "Pragma" -> "no-cache", "Sec-Fetch-Dest" -> "empty", "Sec-Fetch-Mode" -> "cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")
        val headers_2 = Map( "Cache-Control" -> "no-cache", "Content-Type" -> "application/json,application/json;charset=utf8,application/json", "Expires" -> "Sat, 01 Jan 2000 00:00:00 GMT", "Pragma" -> "no-cache", "Sec-Fetch-Dest" -> "empty", "Sec-Fetch-Mode" -> "cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")
        val headers_3 = Map( "Accept" -> "*/*", "If-Modified-Since" -> "Fri, 19 Mar 2021 22:04:26 GMT", "Sec-Fetch-Dest" -> "script", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")
        val headers_4 = Map( "Accept" -> "*/*", "If-Modified-Since" -> "Fri, 19 Mar 2021 22:04:14 GMT", "Origin" -> "https://coho-advocate-ui-coho-qa3.origin-elr-core-nonprod.optum.com", "Sec-Fetch-Dest" -> "font", "Sec-Fetch-Mode" -> "cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")
        val headers_5 = Map( "Cache-Control" -> "no-cache", "Content-Type" -> "application/json,application/json;charset=utf8,application/json", "Expires" -> "Sat, 01 Jan 2000 00:00:00 GMT", "Pragma" -> "no-cache", "Sec-Fetch-Dest" -> "empty", "Sec-Fetch-Mode" -> "cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0") 
        val headers_9 = Map( "Accept" -> "*/*", "Sec-Fetch-Dest" -> "script", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

}
