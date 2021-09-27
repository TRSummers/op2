
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Bo3 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://identity.nonprod.onehealthcareid.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://identity.nonprod.onehealthcareid.com",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_2 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_4 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_7 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_32 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_33 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://ohpe-test3.optum.com",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_34 = Map(
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_42 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

    val uri2 = "https://ohpe-test3.optum.com/trans"
    val uri3 = "https://siteintercept.qualtrics.com"
    val uri4 = "https://zn0bmwyygqj34mcyz-uhg1.siteintercept.qualtrics.com/WRSiteInterceptEngine"
    val uri5 = "https://co1.qualtrics.com/WRQualtricsSiteIntercept/Graphic.php"

	val scn = scenario("Bo3")
		.exec(http("request_0")
			.post("/oidc/auth/callback")
			.headers(headers_0)
			.formParam("grantId", "wktgjigoxhyoo74kiq7qs6x8")
			.resources(http("request_1")
			.get(uri2 + "/javascripts/tabcontent.js")
			.headers(headers_1),
            http("request_3")
			.get(uri2 + "/javascripts/autoTab.js")
			.headers(headers_1),
            http("request_4")
			.get(uri2 + "/mainMenu.uol")
			.headers(headers_4),
            http("request_6")
			.get(uri2 + "/javascripts/sso.js")
			.headers(headers_1),
            http("request_8")
			.get(uri2 + "/javascripts/jquery-te-1.4.0.min.js")
			.headers(headers_1),
            http("request_9")
			.get(uri2 + "/javascripts/jquery.validate.min-1.9.js")
			.headers(headers_1),
            http("request_13")
			.get(uri2 + "/commons/new-ui/js/jquery-3.3.1.slim.min.js")
			.headers(headers_1),
            http("request_26")
			.get(uri2 + "/javascripts/jquery-1.9.1.js")
			.headers(headers_1),
            http("request_27")
			.get(uri2 + "/javascripts/jquery-ui.js")
			.headers(headers_1),
            http("request_32")
			.get(uri4 + "/?Q_ZID=ZN_0BMwYygqJ34McYZ&Q_LOC=https%3A%2F%2Fohpe-test3.optum.com%2Ftrans%2FmainMenu.uol&t=1623687903056")
			.headers(headers_32),
            http("request_33")
			.post(uri3 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_0BMwYygqJ34McYZ&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_33)
			.formParam("Q_LOC", "https://ohpe-test3.optum.com/trans/mainMenu.uol"),
            http("request_34")
			.get(uri3 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_34),
            http("request_35")
			.get(uri3 + "/dxjsmodule/15.e8eacdb7343203b896a5.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_34),
            http("request_36")
			.get(uri3 + "/dxjsmodule/1.681145f504c635c85681.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_34),
            http("request_37")
			.get(uri3 + "/WRSiteInterceptEngine/Asset.php?Module=SI_bJxHL5AcG8kjEjP&Version=13&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_34),
            http("request_38")
			.get(uri3 + "/dxjsmodule/SliderModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_34),
            http("request_39")
			.get(uri3 + "/WRSiteInterceptEngine/Asset.php?Module=CR_4NnbdlHuUtZ8aTX&Version=2&Q_InterceptID=SI_bJxHL5AcG8kjEjP&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_34),
            http("request_41")
			.get(uri3 + "/WRQualtricsShared/Graphics/siteintercept/svg-close-btn-white-5.svg")
			.headers(headers_34),
            http("request_42")
			.get(uri5 + "?IM=IM_6u2pyQ0FbiBBgpv")
			.headers(headers_42)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
