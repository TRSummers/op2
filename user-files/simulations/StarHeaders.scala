package StarTest.Framework
  
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


object StarHeaders{ val headers_1 = Map("content-type" -> "application/json", "x-site-code" -> "pm.environment.get(x-site-code)")
		    val headers_2 =  Map( "content-Type" -> "application/json", "x-auth-token" -> "Bearer ${auth_token}")
}
