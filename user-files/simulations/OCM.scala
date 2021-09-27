
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class OCM extends Simulation {

	val httpProtocol = http
		.baseUrl("https://siteintercept.qualtrics.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://stage-clinical.optum.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_2 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_3 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_4 = Map(
		"Origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_7 = Map(
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_23 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_27 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_34 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_35 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_36 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_37 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJraWQiOiI3OWNkMmZkMy1iMTIxLTRmNjQtYjZhOS0xNDU3ZTQ0NDkzZWIiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnsiYXR0cmlidXRlcyI6e319LCJ4LWVjcC1hbHQtdXNlci1pZCI6InRzdW1tZTE3IiwieC1lY3AtY2xpLW9yZ3MiOlt7Im9yZy1pZCI6Im9iaF9hZHZjIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX2NhIiwiYXBwbC1yb2xlcyI6WyJjcmlzaXNfc3VwcG9ydF91c2VyIiwibWJyX21nbXRfd3JpdGUiLCJzZG9oX2JoX2NhIiwic3lzdGVtX21nbXRfdXNlciJdfV19XSwieC1lY3AtZmlyc3QtbmFtZSI6IlRob21hcyIsIngtZWNwLXR5cGUiOiJQQVNTV09SRCIsIngtZWNwLXVzZXItaWQiOiIwMDE2NzkzMzEiLCJ4LWVjcC1lbWFpbCI6InRob21hcy5zdW1tZXJzQG9wdHVtLmNvbSIsIngtZWNwLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWVjcC1zb3VyY2UiOiJtc2lkIn0sImh0dHBzOlwvXC9oYXN1cmEuaW9cL2p3dFwvY2xhaW1zIjp7IngtaGFzdXJhLWRlZmF1bHQtcm9sZSI6ImNyaXNpc19zdXBwb3J0X3VzZXIiLCJ4LWhhc3VyYS1mdWxsLW5hbWUiOiJUaG9tYXMgU3VtbWVycyIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWhhc3VyYS1hdHRycyI6InsgfSIsIngtaGFzdXJhLWNsaS1vcmciOiJvYmhfYWR2YyIsIngtaGFzdXJhLXVzZXItaWQiOiIwMDE2NzkzMzEiLCJ4LWhhc3VyYS1hbHQtdXNlci1pZCI6InRzdW1tZTE3IiwieC1oYXN1cmEtZmlyc3QtbmFtZSI6IlRob21hcyIsIngtaGFzdXJhLWZ1bmMtcm9sZSI6ImNyaXNpc19jYSIsIngtaGFzdXJhLWFsbG93ZWQtcm9sZXMiOlsiY3Jpc2lzX3N1cHBvcnRfdXNlciIsIm1icl9tZ210X3dyaXRlIiwic2RvaF9iaF9jYSIsInN5c3RlbV9tZ210X3VzZXIiXX0sInNjb3BlIjoib3BlbmlkIiwiaXNzIjoiZWNwLXN0YWdlIiwiZXhwIjoxNjMwMTc5Mjc4LCJjbGllbnRfaWQiOiJlY3BfcGxhdGZvcm0ifQ.WkvYLitL8lhN_-X1yYSZNNZI15GgsCBMPZh69VLZEnBhfNe6vKrI90YP-J7HEXLRJMHy6UPbEV83Bs_BIxAMcN_0FGwJjOrQq-W0yqrlnIBjQ8WeZHu6mfWwdPKYZTRIHZdIVLknGrD318cfw5z-QzGzwvRBraeut33U2DE47LUcwJSXlJkgNXYyRS12ynJEUJJXXUJt_1hNrsATnrzY0tqLeAjYEjMSi6vUU0CwnJQ75YwuZV5S4da5R7NUJ-yzWzy7jNBeZjv6JYutsJDfUKW7QZdej8uu46m4-Xiwj4NJZH-HlXcE6fL7SfAmZtKmdnNZVJ1hjPUBT2YU6YRH1Q",
		"content-type" -> "text/plain",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-role" -> "system_mgmt_user")

	val headers_40 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-hasura-admin-secret" -> "usermanagementsecretkey")

	val headers_49 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_50 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "authorization,content-type,x-hasura-func-role",
		"access-control-request-method" -> "POST",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_51 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJraWQiOiI3OWNkMmZkMy1iMTIxLTRmNjQtYjZhOS0xNDU3ZTQ0NDkzZWIiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnt9LCJ4LWVjcC1hbHQtdXNlci1pZCI6ImNyaXNpc19jbGllbnQiLCJ4LWVjcC1jbGktb3JncyI6W3sib3JnLWlkIjoiZWNwIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX3VpX3JvbGUiLCJhcHBsLXJvbGVzIjpbImNyaXNpc19zdXBwb3J0X3VzZXIiLCJzeXN0ZW1fbWdtdF91c2VyIl19XX1dLCJ4LWVjcC1maXJzdC1uYW1lIjoiQ3Jpc2lzIFN1cHBvcnQiLCJ4LWVjcC10eXBlIjoiQ0xJRU5UX0NSRURFTlRJQUxTIiwieC1lY3AtdXNlci1pZCI6ImNyaXNpc19jbGllbnQiLCJ4LWVjcC1sYXN0LW5hbWUiOiJDbGllbnQifSwiaHR0cHM6XC9cL2hhc3VyYS5pb1wvand0XC9jbGFpbXMiOnsieC1oYXN1cmEtZGVmYXVsdC1yb2xlIjoiY3Jpc2lzX3N1cHBvcnRfdXNlciIsIngtaGFzdXJhLWZ1bGwtbmFtZSI6IkNyaXNpcyBTdXBwb3J0IENsaWVudCIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IkNsaWVudCIsIngtaGFzdXJhLWF0dHJzIjoieyB9IiwieC1oYXN1cmEtY2xpLW9yZyI6ImVjcCIsIngtaGFzdXJhLXVzZXItaWQiOiJjcmlzaXNfY2xpZW50IiwieC1oYXN1cmEtYWx0LXVzZXItaWQiOiIiLCJ4LWhhc3VyYS1maXJzdC1uYW1lIjoiQ3Jpc2lzIFN1cHBvcnQiLCJ4LWhhc3VyYS1mdW5jLXJvbGUiOiJjcmlzaXNfdWlfcm9sZSIsIngtaGFzdXJhLWFsbG93ZWQtcm9sZXMiOlsiY3Jpc2lzX3N1cHBvcnRfdXNlciIsInN5c3RlbV9tZ210X3VzZXIiXX0sInNjb3BlIjoib3BlbmlkIiwiaXNzIjoiZWNwLXN0YWdlIiwiZXhwIjoxNjMwMTc5Mjk5LCJjbGllbnRfaWQiOiJjcmlzaXNfY2xpZW50In0.XqBpM7RSph7IMJ_z5IliW6AgxYXf722AfsfYGoOr2vtsLCFTlXgrbGJXWQb3PNL2zGsZqyX1PMDBzDi028_rH07EdiSZA3j4tNAJv2uj4XLY1Fe_nGuV3F4mRwIIOOnWvKTYwTmT06XLLBCyR8P4_VdIKZv4KMcImL8QpKaVkz0AZ9Ret_JmrKLIiMKOk2VEKEMWDM3LdZ82yi72wWOni-tr0FhUkWl3e8MTcya1YBtjzPifDhVWWuyW5wl1WxF8U6cawmE2Pd3_pw3CDjI4Dd4EhJ-wwNyrNDY6by5Ubl8dGPymvV55nIVrRSzV9o_aBj2xsl48O5Zk-NKQaY0BWg",
		"content-type" -> "application/json",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-func-role" -> "crisis_support_user")

	val headers_52 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJraWQiOiI3OWNkMmZkMy1iMTIxLTRmNjQtYjZhOS0xNDU3ZTQ0NDkzZWIiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnsiYXR0cmlidXRlcyI6e319LCJ4LWVjcC1hbHQtdXNlci1pZCI6InRzdW1tZTE3IiwieC1lY3AtY2xpLW9yZ3MiOlt7Im9yZy1pZCI6Im9iaF9hZHZjIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX2NhIiwiYXBwbC1yb2xlcyI6WyJjcmlzaXNfc3VwcG9ydF91c2VyIiwibWJyX21nbXRfd3JpdGUiLCJzZG9oX2JoX2NhIiwic3lzdGVtX21nbXRfdXNlciJdfV19XSwieC1lY3AtZmlyc3QtbmFtZSI6IlRob21hcyIsIngtZWNwLXR5cGUiOiJQQVNTV09SRCIsIngtZWNwLXVzZXItaWQiOiIwMDE2NzkzMzEiLCJ4LWVjcC1lbWFpbCI6InRob21hcy5zdW1tZXJzQG9wdHVtLmNvbSIsIngtZWNwLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWVjcC1zb3VyY2UiOiJtc2lkIn0sImh0dHBzOlwvXC9oYXN1cmEuaW9cL2p3dFwvY2xhaW1zIjp7IngtaGFzdXJhLWRlZmF1bHQtcm9sZSI6ImNyaXNpc19zdXBwb3J0X3VzZXIiLCJ4LWhhc3VyYS1mdWxsLW5hbWUiOiJUaG9tYXMgU3VtbWVycyIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWhhc3VyYS1hdHRycyI6InsgfSIsIngtaGFzdXJhLWNsaS1vcmciOiJvYmhfYWR2YyIsIngtaGFzdXJhLXVzZXItaWQiOiIwMDE2NzkzMzEiLCJ4LWhhc3VyYS1hbHQtdXNlci1pZCI6InRzdW1tZTE3IiwieC1oYXN1cmEtZmlyc3QtbmFtZSI6IlRob21hcyIsIngtaGFzdXJhLWZ1bmMtcm9sZSI6ImNyaXNpc19jYSIsIngtaGFzdXJhLWFsbG93ZWQtcm9sZXMiOlsiY3Jpc2lzX3N1cHBvcnRfdXNlciIsIm1icl9tZ210X3dyaXRlIiwic2RvaF9iaF9jYSIsInN5c3RlbV9tZ210X3VzZXIiXX0sInNjb3BlIjoib3BlbmlkIiwiaXNzIjoiZWNwLXN0YWdlIiwiZXhwIjoxNjMwMTc5Mjc4LCJjbGllbnRfaWQiOiJlY3BfcGxhdGZvcm0ifQ.WkvYLitL8lhN_-X1yYSZNNZI15GgsCBMPZh69VLZEnBhfNe6vKrI90YP-J7HEXLRJMHy6UPbEV83Bs_BIxAMcN_0FGwJjOrQq-W0yqrlnIBjQ8WeZHu6mfWwdPKYZTRIHZdIVLknGrD318cfw5z-QzGzwvRBraeut33U2DE47LUcwJSXlJkgNXYyRS12ynJEUJJXXUJt_1hNrsATnrzY0tqLeAjYEjMSi6vUU0CwnJQ75YwuZV5S4da5R7NUJ-yzWzy7jNBeZjv6JYutsJDfUKW7QZdej8uu46m4-Xiwj4NJZH-HlXcE6fL7SfAmZtKmdnNZVJ1hjPUBT2YU6YRH1Q",
		"content-type" -> "application/json",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-func-role" -> "crisis_support_user")

	val headers_53 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CKG1yQEIi7bJAQiktskBCMS2yQEIqZ3KAQiN0coBCKCgywEI7/LLAQjO9ssBCLT4ywEInvnLAQjy+csBGJCeywE=")

    val uri01 = "https://stage-clinical.optum.com"
    val uri02 = "https://code.jquery.com"
    val uri03 = "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    val uri04 = "https://znelyuf0uplzmy0bi-uhg1.siteintercept.qualtrics.com/SIE"
    val uri05 = "https://authgateway3-stg.entiam.uhg.com"
    val uri06 = "https://fonts.googleapis.com"
    val uri08 = "https://maps.googleapis.com/maps/api/geocode/json"
    val uri09 = "https://stage-ecp-api.optum.com"
    val uri10 = "https://d3js.org/d3.v3.min.js"
    val uri11 = "https://stage-ecp-drupal.optum.com/jsonapi/node/crisis_support"
    val uri12 = "https://unpkg.com/@ungap/global-this"
    val uri13 = "https://stg-omnidigital.uhc.com/OptumVirtualCare"
    val uri14 = "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    val uri15 = "https://cdn.jsdelivr.net/npm"

	val scn = scenario("OCM")
		.exec(http("request_0") .get(uri05 + "/.well-known/openid-configuration") .headers(headers_0))
		.exec(http("request_1") .get(uri05 + "/pf/JWKS") .headers(headers_0))
            	.exec(http("request_2") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/login"))
            	.exec(http("request_3") .get(uri05 + "/as/authorization.oauth2?response_type=code&client_id=Reg3Stg_ECP&state=bnZpenBGd0hfZjNXengyUnB-UDNHcEpXWG9pNUg1UEt3YU5oOXZZLkhMdTFk&redirect_uri=https%3A%2F%2Fstage-clinical.optum.com&scope=openid%20profile%20address%20email%20phone&code_challenge=5etYd9u9tKA18ukSrwq5T5Mjc4gs8-GrIOnOm-gRXAg&code_challenge_method=S256&nonce=bnZpenBGd0hfZjNXengyUnB-UDNHcEpXWG9pNUg1UEt3YU5oOXZZLkhMdTFk&acr_values=R3_AAL2_RBA_EXT_INT") .headers(headers_3))
            	.exec(http("request_4") .get(uri02 + "/jquery-3.3.1.slim.min.js") .headers(headers_4))
            	.exec(http("request_5") .get(uri03) .headers(headers_4))
            	.exec(http("request_6") .get(uri14) .headers(headers_4))
            	.exec(http("request_7") .get(uri15 + "/zone.js@0.10.3/dist/zone.min.js") .headers(headers_7))
            	.exec(http("request_8") .get(uri15 + "/zone.js@0.10.3/dist/webapis-rtc-peer-connection.min.js") .headers(headers_7))
            	.exec(http("request_9") .get(uri15 + "/zone.js@0.10.3/dist/zone-patch-user-media.js") .headers(headers_7))
            	.exec(http("request_10") .get(uri06 + "/css2?family=Roboto:wght@300;400;500&display=swap") .headers(headers_7))
            	.exec(http("request_11") .get(uri10) .headers(headers_7))
            	.exec(http("request_12") .get(uri15 + "/regenerator-runtime@0.13.5/runtime.min.js") .headers(headers_7))
            	.exec(http("request_13") .get(uri02 + "/jquery-2.2.4.min.js") .headers(headers_7))
            	.exec(http("request_14") .get(uri15 + "/import-map-overrides@1.14.6/dist/import-map-overrides.js") .headers(headers_7))
            	.exec(http("request_15") .get(uri15 + "/systemjs@6.3.1/dist/system.min.js") .headers(headers_7))
            	.exec(http("request_16") .get(uri15 + "/systemjs@6.3.1/dist/extras/amd.min.js") .headers(headers_7))
            	.exec(http("request_17") .get(uri15 + "/systemjs@6.3.1/dist/extras/named-exports.min.js") .headers(headers_7))
            	.exec(http("request_18") .get(uri15 + "/core-js-bundle@3.6.5/minified.min.js") .headers(headers_7))
            	.exec(http("request_19") .get(uri06 + "/icon?family=Material+Icons") .headers(headers_7))
            	.exec(http("request_20") .get(uri13 + "/styles/omni-chat-widget.css") .headers(headers_7))
            	.exec(http("request_21") .get(uri13 + "/scripts/omni-chat-widget-settings.js") .headers(headers_7))
            	.exec(http("request_22") .get(uri13 + "/scripts/omni-chat-widget.js") .headers(headers_7))
            	.exec(http("request_23") .get(uri12) .headers(headers_23))
            	.exec(http("request_24") .get(uri01 + "/ecp-root-config.js") .headers(headers_4))
            	.exec(http("request_25") .get(uri15 + "/single-spa@5.5.0/lib/system/single-spa.min.js") .headers(headers_4))
            	.exec(http("request_26") .get(uri01 + "/microproduct/user-management-ui-service.default.svc.cluster.local/main.js") .headers(headers_4))
            	.exec(http("request_27") .get(uri01 + "/microproduct/user-management-ui-service.default.svc.cluster.local/micro-interaction-icons.woff") .headers(headers_27))
            	.exec(http("request_28") .get(uri05 + "/.well-known/openid-configuration") .headers(headers_0))
            	.exec(http("request_29") .get(uri04 + "/?Q_ZID=ZN_elYUf0UpLzmy0bI") .headers(headers_23))
            	.exec(http("request_30") .get("/dxjsmodule/11.50cce3eb2b28e5784da7.chunk.js?Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web&Q_BRANDID=stage-clinical.optum.com") .headers(headers_7))
            	.exec(http("request_31") .get(uri05 + "/pf/JWKS") .headers(headers_0))
            	.exec(http("request_32") .post(uri05 + "/as/token.oauth2") .headers(headers_0)
			.formParam("grant_type", "authorization_code")
			.formParam("code", "-nGT0KVI3wLWIEUavs3SDR_rp0qPupRZ-9QAAAEz")
			.formParam("redirect_uri", "https://stage-clinical.optum.com")
			.formParam("code_verifier", "fkticG9ZMzZaSUpfYUVUWmhVbjlXcWV0RHMwMzNyLlBqWlp6b0dmU01VTU43")
			.formParam("client_id", "Reg3Stg_ECP")
			.formParam("client_secret", "QQ8C0orMt8hgwiobotPjVm2oFzm3orxp6gRB6vwZGhbBXAscB41GBwsg4ztbCQVX")
			.formParam("acr_values", "R3_AAL2_RBA_EXT_INT"))
            	.exec(http("request_33") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/?code=-nGT0KVI3wLWIEUavs3SDR_rp0qPupRZ-9QAAAEz&state=bnZpenBGd0hfZjNXengyUnB-UDNHcEpXWG9pNUg1UEt3YU5oOXZZLkhMdTFk"))
            	.exec(http("request_34") .options(uri09 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDE3OTI3N30.TrrKGyY7gCHsWADfDkzQTna5NkXg6kOFitbyiVHHFHMTPVUPtv_eZcBgc8WKzrRg_rkYQc09aFMzu77AYNOGRERhqrbsK6IO6RwY0hqPv_PMS7dJaK6iyq6n0tVpvhlq1LhJUm4VbGVib4B8FU7a87Aaa6e4ts7vDgokk6Bl0XhrZWr8u4siw-BbQVrqCHkHLRA7B6pzTJWpF_kwtDe5PY_dHm3SIaGA-NMJW6kvEtSoEFSc2225GPB7yz2w0pFmLaY9fKfj1WkpWp2P885qQWeD6THVW7AhBMdE8CIRlXqs0ilH31HbdYjGP8gzkvaWUyYlBXZDI-5XsFpt16sQTw&org=obh_advc&role=crisis_ca") .headers(headers_34))
            	.exec(http("request_35") .get(uri01 + "/microproduct/user-management-ui-service.default.svc.cluster.local/assets/images/optum-logo.png") .headers(headers_35))
            	.exec(http("request_36")
			.post(uri09 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDE3OTI3N30.TrrKGyY7gCHsWADfDkzQTna5NkXg6kOFitbyiVHHFHMTPVUPtv_eZcBgc8WKzrRg_rkYQc09aFMzu77AYNOGRERhqrbsK6IO6RwY0hqPv_PMS7dJaK6iyq6n0tVpvhlq1LhJUm4VbGVib4B8FU7a87Aaa6e4ts7vDgokk6Bl0XhrZWr8u4siw-BbQVrqCHkHLRA7B6pzTJWpF_kwtDe5PY_dHm3SIaGA-NMJW6kvEtSoEFSc2225GPB7yz2w0pFmLaY9fKfj1WkpWp2P885qQWeD6THVW7AhBMdE8CIRlXqs0ilH31HbdYjGP8gzkvaWUyYlBXZDI-5XsFpt16sQTw&org=obh_advc&role=crisis_ca")
			.headers(headers_36)
			.body(RawFileBody("resources/ocm/0036_request.json"))) .exec(http("request_37") .post(uri09 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocm/0037_request.txt")))
            	.exec(http("request_38") .post(uri09 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocm/0038_request.txt")))
            	.exec(http("request_39") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/user-dashboard-v2"))
            	.exec(http("request_40") .post(uri01 + "/rootconfig") .headers(headers_40) .body(RawFileBody("resources/ocm/0040_request.json")))
            	.exec(http("request_41") .post(uri09 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocm/0041_request.txt")))
            	.exec(http("request_42") .post(uri09 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocm/0042_request.txt")))
            	.exec(http("request_43") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/user/dashboard/apps"))
            	.exec(http("request_44") .post(uri09 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocm/0044_request.txt")))
		.pause(20)
		.exec(http("request_45") .get(uri01 + "/microproduct/crisis-support-ui-service.crisis-support.svc.cluster.local/ecp-crisis-support-ui.js") .headers(headers_4))
		.exec(http("request_46") .get(uri15 + "/react@16.13.1/umd/react.production.min.js") .headers(headers_4))
            	.exec(http("request_47") .get(uri15 + "/react-dom@16.13.1/umd/react-dom.production.min.js") .headers(headers_4))
            	.exec(http("request_48") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/crisis"))
            	.exec(http("request_49") .post(uri09 + "/auth/oauth/token") .headers(headers_49) .formParam("grant_type", "client_credentials") .formParam("client_id", "crisis_client") .formParam("client_secret", "oVzyCAgVEJc61jBtk93Q"))
            	.exec(http("request_50") .options(uri09 + "/member-search/graphql") .headers(headers_50))
            	.exec(http("request_51") .post(uri09 + "/provnew/v1/graphql") .headers(headers_51) .body(RawFileBody("resources/ocm/0051_request.json")))
            	.exec(http("request_52") .post(uri09 + "/member-search/graphql") .headers(headers_52) .body(RawFileBody("resources/ocm/0052_request.json")))
            	.exec(http("request_53") .get(uri08 + "?address=Delhi&key=AIzaSyAdLczqmIB8mu9yYJvCbTXRSFItLNVdXz4") .headers(headers_53))
            	.exec(http("request_54") .get(uri11) .headers(headers_49) .basicAuth("admin","rGbKzixPsMb0CgvBs1tu!"))
		.pause(37)
		.exec(http("request_55") .get(uri08 + "?address=123+4th+St+Atlanta,+Georgia,+&key=AIzaSyAdLczqmIB8mu9yYJvCbTXRSFItLNVdXz4") .headers(headers_53))
		.exec(http("request_56") .post(uri09 + "/provnew/v1/graphql") .headers(headers_51) .body(RawFileBody("resources/ocm/0056_request.json")))
		.pause(20)
		.exec(http("request_57") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/user/dashboard/apps"))
		.exec(http("request_58") .post(uri09 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocm/0058_request.txt")))
            	.exec(http("request_59") .post(uri09 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocm/0059_request.txt")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
