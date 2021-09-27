
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ocm4 extends Simulation {

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

	val headers_6 = Map(
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_20 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_33 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_34 = Map(
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

	val headers_36 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_37 = Map(
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

	val headers_38 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJraWQiOiJlNTUwNWFhYy0yM2EwLTQ5NjktYWZlYS1lNzcwNDJiMGU2ZGMiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnsiYXR0cmlidXRlcyI6e319LCJ4LWVjcC1hbHQtdXNlci1pZCI6InRzdW1tZTE3IiwieC1lY3AtY2xpLW9yZ3MiOlt7Im9yZy1pZCI6Im9iaF9hZHZjIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX2NhIiwiYXBwbC1yb2xlcyI6WyJjcmlzaXNfc3VwcG9ydF91c2VyIiwibWJyX21nbXRfd3JpdGUiLCJzZG9oX2JoX2NhIiwic3lzdGVtX21nbXRfdXNlciJdfV19XSwieC1lY3AtZmlyc3QtbmFtZSI6IlRob21hcyIsIngtZWNwLXR5cGUiOiJQQVNTV09SRCIsIngtZWNwLXVzZXItaWQiOiIwMDE2NzkzMzEiLCJ4LWVjcC1lbWFpbCI6InRob21hcy5zdW1tZXJzQG9wdHVtLmNvbSIsIngtZWNwLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWVjcC1zb3VyY2UiOiJtc2lkIn0sImh0dHBzOlwvXC9oYXN1cmEuaW9cL2p3dFwvY2xhaW1zIjp7IngtaGFzdXJhLWRlZmF1bHQtcm9sZSI6ImNyaXNpc19zdXBwb3J0X3VzZXIiLCJ4LWhhc3VyYS1mdWxsLW5hbWUiOiJUaG9tYXMgU3VtbWVycyIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IlN1bW1lcnMiLCJ4LWhhc3VyYS1jbGktb3JnIjoib2JoX2FkdmMiLCJ4LWhhc3VyYS11c2VyLWlkIjoiMDAxNjc5MzMxIiwieC1oYXN1cmEtYWx0LXVzZXItaWQiOiJ0c3VtbWUxNyIsIngtaGFzdXJhLWZpcnN0LW5hbWUiOiJUaG9tYXMiLCJ4LWhhc3VyYS1mdW5jLXJvbGUiOiJjcmlzaXNfY2EiLCJ4LWhhc3VyYS1hbGxvd2VkLXJvbGVzIjpbImNyaXNpc19zdXBwb3J0X3VzZXIiLCJtYnJfbWdtdF93cml0ZSIsInNkb2hfYmhfY2EiLCJzeXN0ZW1fbWdtdF91c2VyIl19LCJzY29wZSI6Im9wZW5pZCIsImlzcyI6ImVjcC1zdGFnZSIsImV4cCI6MTYzMDQyODEzMCwiY2xpZW50X2lkIjoiZWNwX3BsYXRmb3JtIn0.Ms1rXU7FwD5v_kgYW7Uqu8Ht3Qp1riyIxwoM6N8tXzkB2mN-oXaDdYn46DMRn6p6q201Fu7r17vbCisqtYkER7Vixur0_aLXC8BspGBBJupGt4PtHJsO07DdtUWO1N1tQg6F4w3vjJs2ZmcOfIetrODBAvpy1oTfH_dI-_xIkJjwhtrLvHLo51pMBOjMNiPfHw__HuhLekH0HF88hXUOP5UB46Vzyl5MoUCmOR7PH_xQ0uINnIklFePTG-RubQu8D5GVP9wODpwlgUYYXFocktN1iBF29_Ffg6VYgrM4wL5hU_Fv3_v4JvhxLI1a9iYbQrjMuRNvjulxpd4gxBAfSw",
		"content-type" -> "text/plain",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-role" -> "system_mgmt_user")

	val headers_42 = Map(
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
    val uri04 = "https://code.jquery.com/jquery-2.2.4.min.js"
    val uri05 = "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    val uri06 = "https://znelyuf0uplzmy0bi-uhg1.siteintercept.qualtrics.com/SIE"
    val uri08 = "https://fonts.googleapis.com"
    val uri09 = "https://siteintercept.qualtrics.com"
    val uri10 = "https://unpkg.com/@ungap"
    val uri11 = "https://stg-omnidigital.uhc.com/OptumVirtualCare"
    val uri12 = "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    val uri13 = "https://cdn.jsdelivr.net/npm"

	val scn = scenario("ocm4")
		.exec(http("request_0")
			.get("/.well-known/openid-configuration")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/pf/JWKS")
			.headers(headers_0),
            http("request_2")
			.post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_2)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/login"),
            http("request_3")
			.get("/as/authorization.oauth2?response_type=code&client_id=Reg3Stg_ECP&state=N19TQ2NmQlRPSlF6ai0uazQxRzgyX2F6VUR5N3o4TkZkNENvNmd4T003TXZr&redirect_uri=https%3A%2F%2Fstage-clinical.optum.com&scope=openid%20profile%20address%20email%20phone&code_challenge=dzoFRuojcHP3Sv06q-Uu7KHv_SQBpqmEj6zzhQRq8po&code_challenge_method=S256&nonce=N19TQ2NmQlRPSlF6ai0uazQxRzgyX2F6VUR5N3o4TkZkNENvNmd4T003TXZr&acr_values=R3_AAL2_RBA_EXT_INT")
			.headers(headers_3),
            http("request_4")
			.get(uri05)
			.headers(headers_4),
            http("request_5")
			.get(uri12)
			.headers(headers_4),
            http("request_6")
			.get(uri13 + "/zone.js@0.10.3/dist/zone.min.js")
			.headers(headers_6),
            http("request_7")
			.get(uri13 + "/zone.js@0.10.3/dist/webapis-rtc-peer-connection.min.js")
			.headers(headers_6),
            http("request_8")
			.get(uri13 + "/zone.js@0.10.3/dist/zone-patch-user-media.js")
			.headers(headers_6),
            http("request_9")
			.get(uri03)
			.headers(headers_6),
            http("request_10")
			.get(uri13 + "/regenerator-runtime@0.13.5/runtime.min.js")
			.headers(headers_6),
            http("request_11")
			.get(uri08 + "/css2?family=Roboto:wght@300;400;500&display=swap")
			.headers(headers_6),
            http("request_12")
			.get(uri04)
			.headers(headers_6),
            http("request_13")
			.get(uri13 + "/import-map-overrides@1.14.6/dist/import-map-overrides.js")
			.headers(headers_6),
            http("request_14")
			.get(uri13 + "/systemjs@6.3.1/dist/system.min.js")
			.headers(headers_6),
            http("request_15")
			.get(uri13 + "/systemjs@6.3.1/dist/extras/amd.min.js")
			.headers(headers_6),
            http("request_16")
			.get(uri13 + "/systemjs@6.3.1/dist/extras/named-exports.min.js")
			.headers(headers_6),
            http("request_17")
			.get(uri08 + "/icon?family=Material+Icons")
			.headers(headers_6),
            http("request_18")
			.get(uri13 + "/core-js-bundle@3.6.5/minified.min.js")
			.headers(headers_6),
            http("request_19")
			.get(uri11 + "/styles/omni-chat-widget.css")
			.headers(headers_6),
            http("request_20")
			.get(uri10 + "/global-this")
			.headers(headers_20),
            http("request_21")
			.get(uri10 + "/global-this@0.4.4"),
            http("request_22")
			.get(uri11 + "/scripts/omni-chat-widget.js")
			.headers(headers_6),
            http("request_23")
			.get(uri02 + "/ecp-root-config.js")
			.headers(headers_4),
            http("request_24")
			.get(uri13 + "/single-spa@5.5.0/lib/system/single-spa.min.js")
			.headers(headers_4),
            http("request_25")
			.get(uri02 + "/microproduct/user-management-ui-service.default.svc.cluster.local/main.js")
			.headers(headers_4),
            http("request_26")
			.get(uri02 + "/microproduct/user-management-ui-service.default.svc.cluster.local/micro-interaction-icons.woff")
			.headers(headers_4),
            http("request_27")
			.get("/.well-known/openid-configuration")
			.headers(headers_0),
            http("request_28")
			.get(uri06 + "/?Q_ZID=ZN_elYUf0UpLzmy0bI")
			.headers(headers_20),
            http("request_29")
			.get(uri09 + "/dxjsmodule/11.50cce3eb2b28e5784da7.chunk.js?Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web&Q_BRANDID=stage-clinical.optum.com")
			.headers(headers_6),
            http("request_30")
			.get("/pf/JWKS")
			.headers(headers_0),
            http("request_31")
			.post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_2)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/?code=HQkSK3AxC9CG7J0oTh8KMcUHF7Rax55tQd4AAAEx&state=N19TQ2NmQlRPSlF6ai0uazQxRzgyX2F6VUR5N3o4TkZkNENvNmd4T003TXZr"),
            http("request_32")
			.post("/as/token.oauth2")
			.headers(headers_0)
			.formParam("grant_type", "authorization_code")
			.formParam("code", "HQkSK3AxC9CG7J0oTh8KMcUHF7Rax55tQd4AAAEx")
			.formParam("redirect_uri", "https://stage-clinical.optum.com")
			.formParam("code_verifier", "SnBsSEgwUGhyeU1ZcU5PWE5mTDZFdW5OMmo5SjRkSEVjOURhQ0NPQUFzcVVN")
			.formParam("client_id", "Reg3Stg_ECP")
			.formParam("client_secret", "QQ8C0orMt8hgwiobotPjVm2oFzm3orxp6gRB6vwZGhbBXAscB41GBwsg4ztbCQVX")
			.formParam("acr_values", "R3_AAL2_RBA_EXT_INT"),
            http("request_33")
			.options(uri01 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDQyODEzMH0.hNZEpAhKhUH9Asj26fhiqZ2AkgDZOAObzmOlOAHCS0MO60JMR96rc6_I-wiXJBbfnrmTrz5DzSnsN6L5x9MmMU--14XIIpXv02KnSxBOfiLXn6yThZfv4qdtiqlBgFMVTIANxX69AHFHMQM3--XdHeT-Z4T1wIhWxNx1a99msDAckPbmpqGke0FVF6yZ1mCYIyrHk2g0d0PuIrq_XxdADt-4F7J7P3VH5nHBXNtD9hKhglbFePxT5cGFQlHQyeeA4vfXp3y7MIm4e6RjfdYrV095FRLhV-QXlEDDqlZkHdbt8B_dHxwGC2iw-DlhJ5vCWHzYkQxZStBycsmLZgKKYA")
			.headers(headers_33),
            http("request_34")
			.get(uri02 + "/?code=HQkSK3AxC9CG7J0oTh8KMcUHF7Rax55tQd4AAAEx&state=N19TQ2NmQlRPSlF6ai0uazQxRzgyX2F6VUR5N3o4TkZkNENvNmd4T003TXZr")
			.headers(headers_34),
            http("request_35")
			.post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_2)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/login"),
            http("request_36")
			.get(uri02 + "/microproduct/user-management-ui-service.default.svc.cluster.local/assets/images/optum-logo.png")
			.headers(headers_36),
            http("request_37")
			.post(uri01 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDQyODEzMH0.hNZEpAhKhUH9Asj26fhiqZ2AkgDZOAObzmOlOAHCS0MO60JMR96rc6_I-wiXJBbfnrmTrz5DzSnsN6L5x9MmMU--14XIIpXv02KnSxBOfiLXn6yThZfv4qdtiqlBgFMVTIANxX69AHFHMQM3--XdHeT-Z4T1wIhWxNx1a99msDAckPbmpqGke0FVF6yZ1mCYIyrHk2g0d0PuIrq_XxdADt-4F7J7P3VH5nHBXNtD9hKhglbFePxT5cGFQlHQyeeA4vfXp3y7MIm4e6RjfdYrV095FRLhV-QXlEDDqlZkHdbt8B_dHxwGC2iw-DlhJ5vCWHzYkQxZStBycsmLZgKKYA")
			.headers(headers_37)
			.body(RawFileBody("/ocm4/0037_request.json")),
            http("request_38")
			.post(uri01 + "/user/v1/graphql")
			.headers(headers_38)
			.body(RawFileBody("/ocm4/0038_request.txt")),
            http("request_39")
			.post(uri01 + "/user/v1/graphql")
			.headers(headers_38)
			.body(RawFileBody("/ocm4/0039_request.txt")),
            http("request_40")
			.post(uri01 + "/user/v1/graphql")
			.headers(headers_38)
			.body(RawFileBody("/ocm4/0040_request.txt")),
            http("request_41")
			.post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_2)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/user-dashboard-v2"),
            http("request_42")
			.post(uri02 + "/rootconfig")
			.headers(headers_42)
			.body(RawFileBody("/ocm4/0042_request.json")),
            http("request_43")
			.post(uri01 + "/user/v1/graphql")
			.headers(headers_38)
			.body(RawFileBody("/ocm4/0043_request.txt")),
            http("request_44")
			.post(uri01 + "/user/v1/graphql")
			.headers(headers_38)
			.body(RawFileBody("/ocm4/0044_request.txt")),
            http("request_45")
			.post(uri09 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_2)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/user/dashboard/apps")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}