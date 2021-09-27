
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class full2 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://ohpe-test3.optum.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "https://ohpe-test3.optum.com",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_11 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_29 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_30 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://ohpe-test3.optum.com",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_31 = Map(
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_39 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

    val uri2 = "https://siteintercept.qualtrics.com"
    val uri3 = "https://zn0bmwyygqj34mcyz-uhg1.siteintercept.qualtrics.com/WRSiteInterceptEngine"
    val uri4 = "https://co1.qualtrics.com/WRQualtricsSiteIntercept/Graphic.php"

	val scn = scenario("full2")
		.exec(http("request_0")
			.post("/trans/eligibilityBenefitsPatientListSearchAngular.uol")
			.headers(headers_0)
			.formParam("_patientSelectList", "on")
			.formParam("patientSelectList", "1695")
			.formParam("_patientSelectList", "on")
			.formParam("refreshPatient", "elig")
			.formParam("psubmit", "Search")
			.formParam("behavior", "FORWARD")
			.resources(http("request_1")
			.get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/styles.bundle.css")
			.headers(headers_1),
            http("request_2")
			.get("/trans/css/tabs.css")
			.headers(headers_1),
            http("request_3")
			.get("/trans/commons/new-ui/css/home-bar.css")
			.headers(headers_1),
            http("request_4")
			.get("/trans/javascripts/sso.js")
			.headers(headers_4),
            http("request_5")
			.get("/trans/javascripts/jquery-te-1.4.0.min.js")
			.headers(headers_4),
            http("request_6")
			.get("/trans/css/uolStyle.css")
			.headers(headers_1),
            http("request_7")
			.get("/trans/javascripts/jquery.validate.min-1.9.js")
			.headers(headers_4),
            http("request_8")
			.get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/inline.bundle.js")
			.headers(headers_4),
            http("request_9")
			.get("/trans/commons/new-ui/js/jquery-3.3.1.slim.min.js")
			.headers(headers_4),
            http("request_10")
			.get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/polyfills.bundle.js")
			.headers(headers_4),
            http("request_11")
			.get("/trans/commons/new-ui/images/clinician_information/u378.png")
			.headers(headers_11),
            http("request_12")
			.get("/trans/commons/new-ui/images/clinician_information/u640.png")
			.headers(headers_11),
            http("request_13")
			.get("/trans/commons/new-ui/images/clinician_information/u614.png")
			.headers(headers_11),
            http("request_14")
			.get("/trans/commons/new-ui/images/clinician_information/u612.png")
			.headers(headers_11),
            http("request_15")
			.get("/trans/images/loading.gif")
			.headers(headers_11),
            http("request_16")
			.get("/trans/commons/new-ui/images/clinician_information/u391.png")
			.headers(headers_11),
            http("request_17")
			.get("/trans/commons/new-ui/images/clinician_information/u493.png")
			.headers(headers_11),
            http("request_18")
			.get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u526_mouseOver.png")
			.headers(headers_11),
            http("request_19")
			.get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u540_mouseOver.png")
			.headers(headers_11),
            http("request_20")
			.get("/trans/javascripts/jquery-1.9.1.js")
			.headers(headers_4),
            http("request_21")
			.get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u588_mouseOver.png")
			.headers(headers_11),
            http("request_22")
			.get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u569_mouseOver.png")
			.headers(headers_11),
            http("request_23")
			.get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u497_mouseOver.png")
			.headers(headers_11),
            http("request_24")
			.get("/trans/commons/new-ui/images/clinician_information/primarynav5_more_u491_mouseOver.png")
			.headers(headers_11),
            http("request_25")
			.get("/trans/commons/new-ui/images/clinician_information/u372.png")
			.headers(headers_11),
            http("request_26")
			.get("/trans/javascripts/jquery-ui.js")
			.headers(headers_4),
            http("request_27")
			.get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/main.bundle.js")
			.headers(headers_4),
            http("request_28")
			.get("/trans/commons/new-ui/images/clinician_information/u493.png")
			.headers(headers_11),
            http("request_29")
			.get(uri3 + "/?Q_ZID=ZN_0BMwYygqJ34McYZ&Q_LOC=https%3A%2F%2Fohpe-test3.optum.com%2Ftrans%2FeligibilityBenefitsPatientListSearchAngular.uol&t=1623708259317")
			.headers(headers_29),
            http("request_30")
			.post(uri2 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_0BMwYygqJ34McYZ&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_30)
			.formParam("Q_LOC", "https://ohpe-test3.optum.com/trans/eligBenefitPatientList.uol"),
            http("request_31")
			.get(uri2 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_31),
            http("request_32")
			.get(uri2 + "/dxjsmodule/15.e8eacdb7343203b896a5.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_31),
            http("request_33")
			.get(uri2 + "/dxjsmodule/1.681145f504c635c85681.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_31),
            http("request_34")
			.get(uri2 + "/dxjsmodule/SliderModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_31),
            http("request_35")
			.get(uri2 + "/WRSiteInterceptEngine/Asset.php?Module=SI_bJxHL5AcG8kjEjP&Version=13&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_31),
            http("request_36")
			.get(uri2 + "/WRSiteInterceptEngine/Asset.php?Module=CR_4NnbdlHuUtZ8aTX&Version=2&Q_InterceptID=SI_bJxHL5AcG8kjEjP&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web")
			.headers(headers_31),
            http("request_37")
			.get(uri2 + "/WRQualtricsShared/Graphics/siteintercept/popup_shadow_transparent.png")
			.headers(headers_31),
            http("request_38")
			.get(uri2 + "/WRQualtricsShared/Graphics/siteintercept/svg-close-btn-white-5.svg")
			.headers(headers_31),
            http("request_39")
			.get(uri4 + "?IM=IM_6u2pyQ0FbiBBgpv")
			.headers(headers_39)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}