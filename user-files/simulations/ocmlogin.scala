
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ocmlogin extends Simulation {

	val httpProtocol = http
		.baseUrl("https://authgateway3-stg.entiam.uhg.com")
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

	val headers_1 = Map("content-type" -> "application/json", "x-site-code" -> "pm.environment.get(x-site-code)")

	val headers_2 = Map(
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

	val headers_3 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_4 = Map(
		"Origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_7 = Map(
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

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

	val headers_29 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_32 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

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
		//"authorization" -> "Bearer eyJraWQiOiI3OWNkMmZkMy1iMTIxLTRmNjQtYjZhOS0xNDU3ZTQ0NDkzZWIiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnsiYXR0cmlidXRlcyI6e319LCJ4LWVjcC1hbHQtdXNlci1pZCI6InRzdW1tZTE3IiwieC1lY3AtY2xpLW9yZ3MiOlt7Im9yZy1pZCI6Im9iaF9hZHZjIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX2NhIiwiYXBwbC1yb2xlcyI6WyJjcmlzaXNfc3VwcG9ydF91c2VyIiwibWJyX21nbXRfd3JpdGUiLCJzZG9oX2JoX2NhIiwic3lzdGVtX21nbXRfdXNlciJdfV19XSwieC1lY3AtZmlyc3QtbmFtZSI6IlRob21hcyIsIngtZWNwLXR5cGUiOiJQQVNTV09SRCIsIngtZWNwLXVzZXItaWQiOiIwMDE2NzkzMzEiLCJ4LWVjcC1lbWFpbCI6InRob21hcy5zdW1tZXJzQG9wdHVtLmNvbSIsIngtZWNwLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWVjcC1zb3VyY2UiOiJtc2lkIn0sImh0dHBzOlwvXC9oYXN1cmEuaW9cL2p3dFwvY2xhaW1zIjp7IngtaGFzdXJhLWRlZmF1bHQtcm9sZSI6ImNyaXNpc19zdXBwb3J0X3VzZXIiLCJ4LWhhc3VyYS1mdWxsLW5hbWUiOiJUaG9tYXMgU3VtbWVycyIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWhhc3VyYS1hdHRycyI6InsgfSIsIngtaGFzdXJhLWNsaS1vcmciOiJvYmhfYWR2YyIsIngtaGFzdXJhLXVzZXItaWQiOiIwMDE2NzkzMzEiLCJ4LWhhc3VyYS1hbHQtdXNlci1pZCI6InRzdW1tZTE3IiwieC1oYXN1cmEtZmlyc3QtbmFtZSI6IlRob21hcyIsIngtaGFzdXJhLWZ1bmMtcm9sZSI6ImNyaXNpc19jYSIsIngtaGFzdXJhLWFsbG93ZWQtcm9sZXMiOlsiY3Jpc2lzX3N1cHBvcnRfdXNlciIsIm1icl9tZ210X3dyaXRlIiwic2RvaF9iaF9jYSIsInN5c3RlbV9tZ210X3VzZXIiXX0sInNjb3BlIjoib3BlbmlkIiwiaXNzIjoiZWNwLXN0YWdlIiwiZXhwIjoxNjMwMTg2ODQxLCJjbGllbnRfaWQiOiJlY3BfcGxhdGZvcm0ifQ.kZlFZgo4oEsMyNBGs202OOJYUvlAkgj0AwDFm9R5J0Fr0-oEOVYAuzucSBYB7W0mMxnH5jatJExO1yhuKbVjY0OvJiXVu9L3bAJdsdzND3gqPAdzCxB47zlZ6XRg2E7pdWvvS8a9XYT4JIeN9TLeLgGc30yGzssOfmoCkqtq9_-5uvlhRQRpVELj8W3gXnyUJ9oDwdsOz23RlILlJnT3v_uC4O75dAaMkVg-3lyvw8boac7bkgSSycz3VeNZq1OziK-aQq6de-h-bOsy5dY12dCSSGWlLLHRiQ3EEyRnLBo2uMClRL7WN4AkU2O8ReGTX8WNew0h_DA39gVTOU48qg",
		"authorization" -> "Bearer ${auth_token}",
		"content-type" -> "text/plain",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-role" -> "system_mgmt_user")

	val headers_38 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_39 = Map(
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

    val uri01 = "https://stage-ecp-api.optum.com"
    val uri02 = "https://stage-clinical.optum.com"
    val uri03 = "https://d3js.org/d3.v3.min.js"
    val uri04 = "https://code.jquery.com"
    val uri05 = "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    val uri06 = "https://znelyuf0uplzmy0bi-uhg1.siteintercept.qualtrics.com/SIE"
    val uri08 = "https://fonts.googleapis.com"
    val uri09 = "https://siteintercept.qualtrics.com"
    val uri10 = "https://unpkg.com/@ungap/global-this@0.4.4/min.js"
    val uri11 = "https://stg-omnidigital.uhc.com/OptumVirtualCare"
    val uri12 = "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    val uri13 = "https://cdn.jsdelivr.net/npm"

	val scn = scenario("ocmlogin")
		//experiment with authentication
                .exec(http("Authenticate") .post("https://pike-api-star-stg.origin-ctc-core.optum.com/api/v1/security/portal/") .headers(headers_1)  .body(ElFileBody("Pikerequest.json"))
                         .check(regex("""token":"(.+?)",""") .saveAs("auth_token")))
		.exec(http("request_0") .get("/.well-known/openid-configuration") .headers(headers_0))
		.exec(http("request_1") .get("/pf/JWKS") .headers(headers_0))
            	.exec(http("request_2") .get("/as/authorization.oauth2?response_type=code&client_id=Reg3Stg_ECP&state=YW5mRTh0WXFDdkp6blAzYVY2Nk1Fc3dXajBzQjN3b3N1ZTEzSzMzUlNOZm15&redirect_uri=https%3A%2F%2Fstage-clinical.optum.com&scope=openid%20profile%20address%20email%20phone&code_challenge=PkbEWpxvZmCN0hinrFAPaJPgDrD4W188NeHlpSUU26s&code_challenge_method=S256&nonce=YW5mRTh0WXFDdkp6blAzYVY2Nk1Fc3dXajBzQjN3b3N1ZTEzSzMzUlNOZm15&acr_values=R3_AAL2_RBA_EXT_INT") .headers(headers_37))
            	.exec(http("request_3") .get(uri02 + "/?code=6uDDsUin9ivFvYSNb1KT5jwzK-cTJ6V2jr4AAAEz&state=YW5mRTh0WXFDdkp6blAzYVY2Nk1Fc3dXajBzQjN3b3N1ZTEzSzMzUlNOZm15") .headers(headers_3))
            	.exec(http("request_4") .get(uri04 + "/jquery-3.3.1.slim.min.js") .headers(headers_4))
            	.exec(http("request_5") .get(uri05) .headers(headers_4))
            	.exec(http("request_6") .get(uri12) .headers(headers_4))
            	.exec(http("request_7") .get(uri13 + "/zone.js@0.10.3/dist/zone.min.js") .headers(headers_7))
            	.exec(http("request_8") .get(uri13 + "/zone.js@0.10.3/dist/webapis-rtc-peer-connection.min.js") .headers(headers_7))
            	.exec(http("request_9") .get(uri13 + "/zone.js@0.10.3/dist/zone-patch-user-media.js") .headers(headers_7))
            	.exec(http("request_10") .get(uri03) .headers(headers_7))
            	.exec(http("request_11") .get(uri10) .headers(headers_7))
            	.exec(http("request_12") .get(uri13 + "/regenerator-runtime@0.13.5/runtime.min.js") .headers(headers_7))
            	.exec(http("request_13") .get(uri04 + "/jquery-2.2.4.min.js") .headers(headers_7))
            	.exec(http("request_14") .get(uri08 + "/css2?family=Roboto:wght@300;400;500&display=swap") .headers(headers_7))
            	.exec(http("request_15") .get(uri13 + "/import-map-overrides@1.14.6/dist/import-map-overrides.js") .headers(headers_7))
            	.exec(http("request_16") .get(uri13 + "/systemjs@6.3.1/dist/extras/amd.min.js") .headers(headers_7))
            	.exec(http("request_18") .get(uri13 + "/systemjs@6.3.1/dist/extras/named-exports.min.js") .headers(headers_7))
            	.exec(http("request_19") .get(uri13 + "/core-js-bundle@3.6.5/minified.min.js") .headers(headers_7))
            	.exec(http("request_20") .get(uri08 + "/icon?family=Material+Icons") .headers(headers_7))
            	.exec(http("request_21") .get(uri11 + "/styles/omni-chat-widget.css") .headers(headers_7))
            	.exec(http("request_22") .get(uri11 + "/scripts/omni-chat-widget-settings.js") .headers(headers_7))
            	.exec(http("request_23") .get(uri11 + "/scripts/omni-chat-widget.js") .headers(headers_7))
            	.exec(http("request_24") .get(uri02 + "/ecp-root-config.js") .headers(headers_4))
            	.exec(http("request_25") .get(uri13 + "/single-spa@5.5.0/lib/system/single-spa.min.js") .headers(headers_4))
            	.exec(http("request_26") .get(uri02 + "/microproduct/user-management-ui-service.default.svc.cluster.local/main.js") .headers(headers_4))
            	.exec(http("request_27") .get(uri02 + "/microproduct/user-management-ui-service.default.svc.cluster.local/micro-interaction-icons.woff") .headers(headers_27))
            	.exec(http("request_28") .get("/.well-known/openid-configuration") .headers(headers_0))
            	.exec(http("request_29") .get(uri06 + "/?Q_ZID=ZN_elYUf0UpLzmy0bI") .headers(headers_29))
            	.exec(http("request_30") .get(uri09 + "/dxjsmodule/11.50cce3eb2b28e5784da7.chunk.js?Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web&Q_BRANDID=stage-clinical.optum.com") .headers(headers_7))
            	.exec(http("request_31") .get("/pf/JWKS") .headers(headers_0))
            	.exec(http("request_32") .post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_32) 
			.formParam("Q_LOC", "https://stage-clinical.optum.com/?code=6uDDsUin9ivFvYSNb1KT5jwzK-cTJ6V2jr4AAAEz&state=YW5mRTh0WXFDdkp6blAzYVY2Nk1Fc3dXajBzQjN3b3N1ZTEzSzMzUlNOZm15"))
			//.formParam("code", "6uDDsUin9ivFvYSNb1KT5jwzK-cTJ6V2jr4AAAEz")
			//.formParam("code", "yeFolJz38JecbvsXrwn1dIprab12Gef9BCBdWOebN4")
            	.exec(http("request_33") .post("/as/token.oauth2") .headers(headers_0)
			.formParam("grant_type", "authorization_code")
			.formParam("code", "6uDDsUin9ivFvYSNb1KT5jwzK-cTJ6V2jr4AAAEz")
			.formParam("redirect_uri", "https://stage-clinical.optum.com")
			.formParam("code_verifier","YWhCYjNJNVZwMVlLaH5zbS5CRVlEY05iWVJKaUx4RHg3ZkVHam1kUjFRei1j")
			//.formParam("code_verifier", "MVhDZjlYemhOU1ZVaWxfRkdicE5GMWg2eU1hOFo1VjJPcUtpZXZpaFBmdkZo")
			.formParam("client_id", "Reg3Stg_ECP")
			.formParam("client_secret", "QQ8C0orMt8hgwiobotPjVm2oFzm3orxp6gRB6vwZGhbBXAscB41GBwsg4ztbCQVX")
			.formParam("acr_values", "R3_AAL2_RBA_EXT_INT"))
            	.exec(http("request_34") .options(uri01 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDE4Njg0MH0.c2N0T5nhFkiZv-Kwq2SJKwKFzwlugF3PrkNoa_KZoWrQFD51k4CKUEDWyXCOumhh2oZWCKLzJOJCn62EQoxf_dt7TnHRg-liPFJINYVY238hJj3fu-ktlRRwgdkcHU3v0yXI0-QwHNUmSQyafhn7hQ8WlkyjItJXWpz5vFxlUGOZiiLjJiBR14g1Lm4kSo0AFGwmrAxZ4tvREl5T2vLQqI2_RM1Qfv1vIUmYMRFnF-O7WaJpxAOum-CJtjwrwQfULY2S81dPzsKLYw2gg6t4IiyHy3L1NMnE036lsaVyZHTuKViP6zz4m53eEe8OhmW5KfAAf75p64G9xF-vTtmtVQ&org=obh_advc&role=crisis_ca") .headers(headers_34))
            	.exec(http("request_35") .post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_32)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/login"))
            	.exec(http("request_36")
			.post(uri01 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDE4Njg0MH0.c2N0T5nhFkiZv-Kwq2SJKwKFzwlugF3PrkNoa_KZoWrQFD51k4CKUEDWyXCOumhh2oZWCKLzJOJCn62EQoxf_dt7TnHRg-liPFJINYVY238hJj3fu-ktlRRwgdkcHU3v0yXI0-QwHNUmSQyafhn7hQ8WlkyjItJXWpz5vFxlUGOZiiLjJiBR14g1Lm4kSo0AFGwmrAxZ4tvREl5T2vLQqI2_RM1Qfv1vIUmYMRFnF-O7WaJpxAOum-CJtjwrwQfULY2S81dPzsKLYw2gg6t4IiyHy3L1NMnE036lsaVyZHTuKViP6zz4m53eEe8OhmW5KfAAf75p64G9xF-vTtmtVQ&org=obh_advc&role=crisis_ca")
			.headers(headers_36)
			.body(RawFileBody("resources/ocmlogin/0036_request.json")))
            	.exec(http("request_37") .post(uri01 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocmlogin/0037_request.txt")))
            	.exec(http("request_38") .get(uri02 + "/microproduct/user-management-ui-service.default.svc.cluster.local/assets/images/optum-logo.png") .headers(headers_38))
            	.exec(http("request_39") .post(uri02 + "/rootconfig") .headers(headers_39) .body(RawFileBody("resources/ocmlogin/0039_request.json")))
            	.exec(http("request_40") .post(uri01 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocmlogin/0040_request.txt")))
            	.exec(http("request_41") .post(uri01 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocmlogin/0041_request.txt")))
            	.exec(http("request_42") .post(uri01 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocmlogin/0042_request.txt")))
            	.exec(http("request_43") .post(uri01 + "/user/v1/graphql") .headers(headers_37) .body(RawFileBody("resources/ocmlogin/0043_request.txt")))
            	.exec(http("request_44") .post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_32) .formParam("Q_LOC", "https://stage-clinical.optum.com/user-dashboard-v2"))
            	.exec(http("request_45") .post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(headers_32) .formParam("Q_LOC", "https://stage-clinical.optum.com/user/dashboard/apps"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
