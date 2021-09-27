package Boo2.Framework

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Boo2 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://ohpe-test3.optum.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_0 = Map( "accept" -> "application/json, text/plain, */*", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "content-type" -> "application/json;charset=UTF-8",
		"fflecat0rx-b" -> "-6zvf42", "fflecat0rx-c" -> "AOBF8_J5AQAAFg-caYceRalTGP15duuRiaTJXO_PsBbGsfm0cI6g08CRCQ_n", "fflecat0rx-d" -> "AAaihIjBDKGNgUGASZAQhISy1WKOoNPAkQkP5wAAAAAbSGaUAG4UrBFL8dGFCat7WmCzJls", "fflecat0rx-f" -> "A-nP9vJ5AQAA1ZGODHebpB_tdnmKnemPBDALgyrWx7La32Wvvd4b34kNqmfwAcbLtbUAAAAAAAAAAAAAAAAAAA==", "fflecat0rx-z" -> "q", "origin" -> "https://identity.nonprod.onehealthcareid.com", "screennumber" -> "1", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "empty", "sec-fetch-mode" -> "cors", "sec-fetch-site" -> "same-origin", "x-csrf" -> "OID_TOKEN", "x-requested-with" -> "AsyncRequest", "x-sessntabid" -> "pcixjzhq9f", "x-tab-id" -> "fgvwMdui")

	val headers_1 = Map( "accept" -> "*/*", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "script", "sec-fetch-mode" -> "no-cors", "sec-fetch-site" -> "same-origin")

	val headers_2 = Map( "accept" -> "application/json, text/plain, */*", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "screennumber" -> "1", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "empty", "sec-fetch-mode" -> "cors", "sec-fetch-site" -> "same-origin", "x-csrf" -> "OID_TOKEN", "x-requested-with" -> "AsyncRequest", "x-sessntabid" -> "pcixjzhq9f")

	val headers_3 = Map( "Accept" -> "*/*", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Origin" -> "https://identity.nonprod.onehealthcareid.com", "Sec-Fetch-Dest" -> "empty", "Sec-Fetch-Mode" -> "cors", "Sec-Fetch-Site" -> "cross-site", "content-type" -> "text/plain", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_4 = Map( "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "image", "sec-fetch-mode" -> "no-cors", "sec-fetch-site" -> "same-origin")

	val headers_6 = Map( "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "origin" -> "https://identity.nonprod.onehealthcareid.com", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "document", "sec-fetch-mode" -> "navigate", "sec-fetch-site" -> "same-origin", "sec-fetch-user" -> "?1", "upgrade-insecure-requests" -> "1")

	val headers_7 = Map( "Accept" -> "*/*", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Sec-Fetch-Dest" -> "script", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-site", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_9 = Map( "Accept" -> "*/*", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Content-Type" -> "text/plain;charset=UTF-8", "Origin" -> "https://rba.onehealthcareid.com", "Sec-Fetch-Dest" -> "empty", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_10 = Map( "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Cache-Control" -> "max-age=0", "Sec-Fetch-Dest" -> "document", "Sec-Fetch-Mode" -> "navigate", "Sec-Fetch-Site" -> "cross-site", "Sec-Fetch-User" -> "?1", "Upgrade-Insecure-Requests" -> "1", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_11 = Map( "Accept" -> "text/css,*/*;q=0.1", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Sec-Fetch-Dest" -> "style", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_14 = Map( "Accept" -> "*/*", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Sec-Fetch-Dest" -> "script", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_19 = Map( "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Sec-Fetch-Dest" -> "image", "Sec-Fetch-Mode" -> "no-cors", "Sec-Fetch-Site" -> "same-origin", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_42 = Map( "accept" -> "*/*", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "script", "sec-fetch-mode" -> "no-cors", "sec-fetch-site" -> "cross-site")

	val headers_43 = Map( "accept" -> "*/*", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "origin" -> "https://ohpe-test3.optum.com", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "empty", "sec-fetch-mode" -> "cors", "sec-fetch-site" -> "cross-site")

	val headers_44 = Map( "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

	val headers_52 = Map( "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "accept-encoding" -> "gzip, deflate, br", "accept-language" -> "en-US,en;q=0.9", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0", "sec-fetch-dest" -> "image", "sec-fetch-mode" -> "no-cors", "sec-fetch-site" -> "cross-site")

	val headers_55 = Map( "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", "Accept-Encoding" -> "gzip, deflate, br", "Accept-Language" -> "en-US,en;q=0.9", "Cache-Control" -> "max-age=0", "Origin" -> "https://ohpe-test3.optum.com", "Sec-Fetch-Dest" -> "document", "Sec-Fetch-Mode" -> "navigate", "Sec-Fetch-Site" -> "same-origin", "Sec-Fetch-User" -> "?1", "Upgrade-Insecure-Requests" -> "1", "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""", "sec-ch-ua-mobile" -> "?0")

    val uri1 = "https://identity.nonprod.onehealthcareid.com"
    val uri2 = "https://rba.onehealthcareid.com/fp"
    val uri4 = "https://bam.nr-data.net/events/1/4351a748a3"
    val uri5 = "https://siteintercept.qualtrics.com"
    val uri6 = "https://zn0bmwyygqj34mcyz-uhg1.siteintercept.qualtrics.com/WRSiteInterceptEngine"
    val uri7 = "https://co1.qualtrics.com/WRQualtricsSiteIntercept/Graphic.php"

	val scn = scenario("Boo2")
		.exec(http("LOGIN") .post(uri1 + "/api/v1/auth/authenticate") .headers(headers_0) .body(RawFileBody("0000_request.json")) .resources(http("request_1") .get(uri1 + "/app/static/js/postlogin-b308b58c4c.min.js") .headers(headers_1),
            http("request_2") .get(uri1 + "/app/common/i18n/en_US.json") .headers(headers_2),
            http("request_3") .post(uri4 + "?a=310075815&sa=1&v=1123.df1c7f8&t=Unnamed%20Transaction&rst=52882&ref=https://identity.nonprod.onehealthcareid.com/app/index.html") .headers(headers_3) .body(RawFileBody("0003_request.txt")),
            http("request_4") .get(uri1 + "/tenants/onehealthcareid/logos/favicon.ico") .headers(headers_4),
            http("request_5") .get(uri1 + "/app/error.html") .headers(headers_4),
            http("request_6") .post(uri1 + "/oidc/auth/callback") .headers(headers_6) .formParam("grantId", "pxvcljvqaxvfmyxavaxswcma"),
//            http("request_7") .get(uri2 + "/clear3.png;CIS3SID=8E6D4D6310756B3A74FD52823BFECA7E?org_id=4m4bj5d2&session_id=59b69704-db41-4c23-876e-1e292894e5bb&nonce=688722f4d497dcbb&jac=1&je=343c37242e72676535253542253a327467702d3a302733493125304b273a3a534d454c41253a30273b4325354a66636c736d253041273a3a6a6b646c656e273a302d3d4425324127323a514f444d434144452732322d334327374a6e636e736d2532412d303a60696464676c253a30273d4625324b2530327469726567762d3a302733492535406e63647b6525324127323a6a6b6c66656e2d323025354c253041273a3a5751455a2532302d31492d354266636e736d27304b273232606966646566253030273d4c2730432d32325249515b5f4f52442730322d31432d374266696c7165253a432730306061666665662532302d374c2d3243253030757b677046636d6541645d696e78757627303a2d3143253d4274707d672d3a4325323076657076273a3025354c253043253a327263717b7f664b6457696e727d762d3a3225334327354a76707d6725324b25303270697371756d7a6c2730322d3544273a412d3a3270617171776c4b66576075747c6f6c25323a253143273d4a64636c7b6525304b273a3a627574766d6e2d30302d3744253a432732325b69656c4b662d3030253b4125374a767a7d6525324127323a71776a6f69742d323025354c253546") .headers(headers_7),
            http("request_9") .post(uri2 + "/clear.png?org_id=4m4bj5d2&session_id=59b69704-db41-4c23-876e-1e292894e5bb&nonce=688722f4d497dcbb") .headers(headers_9) .body(RawFileBody("0009_request.txt")),
            http("request_10") .get("/trans/optumLoggedIn.uol?code=zrrnhYoeTBVzqNS7U39rlLCOhAtqvCsk") .headers(headers_10),
            http("request_11") .get("/trans/css/uolStyle.css") .headers(headers_11),
            http("request_12") .get("/trans/css/tabs.css") .headers(headers_11),
            http("request_13") .get("/trans/commons/new-ui/css/home-bar.css") .headers(headers_11),
            http("request_14") .get("/trans/javascripts/tabcontent.js") .headers(headers_14),
            http("request_15") .get("/trans/javascripts/autoTab.js") .headers(headers_14),
            http("request_16") .get("/trans/javascripts/sso.js") .headers(headers_14),
            http("request_17") .get("/trans/javascripts/jquery-te-1.4.0.min.js") .headers(headers_14),
            http("request_18") .get("/trans/javascripts/jquery.validate.min-1.9.js") .headers(headers_14),
            http("request_19") .get("/trans/commons/new-ui/images/clinician_information/u378.png") .headers(headers_19),
            http("request_20") .get("/trans/commons/new-ui/images/clinician_information/u640.png") .headers(headers_19),
            http("request_21") .get("/trans/css/uolStyle.css") .headers(headers_11),
            http("request_22") .get("/trans/commons/new-ui/images/clinician_information/u614.png") .headers(headers_19),
            http("request_23") .get("/trans/commons/new-ui/images/clinician_information/u612.png") .headers(headers_19),
            http("request_24") .get("/trans/images/loading.gif") .headers(headers_19),
            http("request_25") .get("/trans/commons/new-ui/js/jquery-3.3.1.slim.min.js") .headers(headers_14),
            http("request_26") .get("/trans/commons/new-ui/images/clinician_information/u391.png") .headers(headers_19),
            http("request_27") .get("/trans/javascripts/jquery-1.9.1.js") .headers(headers_14),
            http("request_28") .get("/trans/commons/new-ui/images/clinician_information/u493.png") .headers(headers_19),
            http("request_29") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u526_mouseOver.png") .headers(headers_19),
            http("request_30") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u540_mouseOver.png") .headers(headers_19),
            http("request_31") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u588_mouseOver.png") .headers(headers_19),
            http("request_32") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u569_mouseOver.png") .headers(headers_19),
            http("request_33") .get("/trans/javascripts/jquery-ui.js") .headers(headers_14),
            http("request_34") .get("/trans/commons/new-ui/images/clinician_information/u614.png") .headers(headers_19),
            http("request_35") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u497_mouseOver.png") .headers(headers_19),
            http("request_36") .get("/trans/commons/new-ui/images/clinician_information/primarynav5_more_u491_mouseOver.png") .headers(headers_19),
            http("request_37") .get("/trans/commons/new-ui/images/clinician_information/u372.png") .headers(headers_19),
            http("request_38") .get("/trans/commons/new-ui/images/clinician_information/u493.png") .headers(headers_19),
            http("request_39") .get("/trans/images/shadeactive.gif") .headers(headers_19),
            http("request_40") .get("/trans/html/images/shade.gif") .headers(headers_19) .check(status.is(404)),
            http("request_41") .get("/trans/images/bkShadow.jpg") .headers(headers_19),
            http("request_42") .get(uri6 + "/?Q_ZID=ZN_0BMwYygqJ34McYZ&Q_LOC=https%3A%2F%2Fohpe-test3.optum.com%2Ftrans%2FmainMenu.uol&t=1623278988536") .headers(headers_42),
            http("request_43") .post(uri5 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_0BMwYygqJ34McYZ&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_43) .formParam("Q_LOC", "https://ohpe-test3.optum.com/trans/mainMenu.uol"),
            http("request_44") .get(uri5 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_45") .get(uri5 + "/dxjsmodule/15.e8eacdb7343203b896a5.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_46") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=SI_bJxHL5AcG8kjEjP&Version=13&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_47") .get(uri5 + "/dxjsmodule/1.681145f504c635c85681.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_48") .get(uri5 + "/dxjsmodule/SliderModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_49") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=CR_4NnbdlHuUtZ8aTX&Version=2&Q_InterceptID=SI_bJxHL5AcG8kjEjP&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_50") .get(uri5 + "/WRQualtricsShared/Graphics/siteintercept/popup_shadow_transparent.png") .headers(headers_44),
            http("request_51") .get(uri5 + "/WRQualtricsShared/Graphics/siteintercept/svg-close-btn-white-5.svg") .headers(headers_44),
            http("request_52") .get(uri7 + "?IM=IM_6u2pyQ0FbiBBgpv") .headers(headers_52)))
		.pause(5)
		.exec(http("SEARCHPAGE") .get("/trans/images/bkShadow.jpg") .headers(headers_19))
		.pause(5)
		.exec(http("SEARCH_MEMBER") .get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/styles.bundle.css") .headers(headers_44)
			.resources(http("request_55")
			.post("/trans/eligibilityBenefitsMemberNameSearchAngular.uol")
			.headers(headers_55)
			.formParam("firstName", "Perf")
			.formParam("lastName", "Testy")
			.formParam("state", "MD")
			.formParam("dobMonth", "01")
			.formParam("dobDay", "01")
			.formParam("dobYear", "1981")
			.formParam("monthEliCheck", "06")
			.formParam("dayEliCheck", "09")
			.formParam("yearEliCheck", "2021")
			.formParam("behavior", "FORWARD"),
//            http("request_56") .get("/trans/javascripts/sso.js") .headers(headers_14),
//            http("request_57") .get("/trans/commons/new-ui/css/home-bar.css") .headers(headers_11),
 //           http("request_58") .get("/trans/css/tabs.css") .headers(headers_11),
//            http("request_59") .get("/trans/commons/new-ui/images/clinician_information/u378.png") .headers(headers_19),
//            http("request_60") .get("/trans/css/uolStyle.css") .headers(headers_11),
//            http("request_61") .get("/trans/javascripts/jquery-te-1.4.0.min.js") .headers(headers_14),
//            http("request_62") .get("/trans/javascripts/jquery.validate.min-1.9.js") .headers(headers_14),
            http("request_63") .get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/inline.bundle.js") .headers(headers_14),
            http("request_64") .get("/trans/commons/new-ui/js/jquery-3.3.1.slim.min.js") .headers(headers_14),
            http("request_65") .get("/trans/commons/new-ui/images/clinician_information/u640.png") .headers(headers_19),
            http("request_66") .get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/polyfills.bundle.js") .headers(headers_14),
            http("request_67") .get("/trans/commons/new-ui/images/clinician_information/u612.png") .headers(headers_19),
            http("request_68") .get("/trans/commons/new-ui/images/clinician_information/u614.png") .headers(headers_19),
            http("request_69") .get("/trans/images/loading.gif") .headers(headers_19),
            http("request_70") .get("/trans/commons/new-ui/images/clinician_information/u391.png") .headers(headers_19),
            http("request_71") .get("/trans/commons/new-ui/images/clinician_information/u493.png") .headers(headers_19),
            http("request_72") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u526_mouseOver.png") .headers(headers_19),
            http("request_73") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u540_mouseOver.png") .headers(headers_19),
            http("request_74") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u588_mouseOver.png") .headers(headers_19),
            http("request_75") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u569_mouseOver.png") .headers(headers_19),
            http("request_76") .get("/trans/commons/new-ui/images/clinician_information/primarynav2_changes_u497_mouseOver.png") .headers(headers_19),
            http("request_77") .get("/trans/commons/new-ui/images/clinician_information/primarynav5_more_u491_mouseOver.png") .headers(headers_19),
            http("request_78") .get("/trans/commons/new-ui/images/clinician_information/u372.png") .headers(headers_19),
            http("request_79") .get("/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/main.bundle.js") .headers(headers_14),
            http("request_80") .get("/trans/javascripts/jquery-1.9.1.js") .headers(headers_14),
            http("request_81") .get("/trans/javascripts/jquery-ui.js") .headers(headers_14),
            http("request_82") .get("/trans/commons/new-ui/images/clinician_information/u493.png") .headers(headers_19),
            http("request_83") .get(uri6 + "/?Q_ZID=ZN_0BMwYygqJ34McYZ&Q_LOC=https%3A%2F%2Fohpe-test3.optum.com%2Ftrans%2FeligibilityBenefitsMemberNameSearchAngular.uol&t=1623279075741") .headers(headers_42),
            http("request_84") .post(uri5 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_0BMwYygqJ34McYZ&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_43) .formParam("Q_LOC", "https://ohpe-test3.optum.com/trans/eligBenefitPatientList.uol"), http("request_85") .get(uri5 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_86") .get(uri5 + "/dxjsmodule/15.e8eacdb7343203b896a5.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_87") .get(uri5 + "/dxjsmodule/1.681145f504c635c85681.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_88") .get(uri5 + "/dxjsmodule/SliderModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_89") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=SI_bJxHL5AcG8kjEjP&Version=13&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_90") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=CR_4NnbdlHuUtZ8aTX&Version=2&Q_InterceptID=SI_bJxHL5AcG8kjEjP&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(headers_44),
            http("request_91") .get(uri5 + "/WRQualtricsShared/Graphics/siteintercept/popup_shadow_transparent.png") .headers(headers_44),
            http("request_92") .get(uri5 + "/WRQualtricsShared/Graphics/siteintercept/svg-close-btn-white-5.svg") .headers(headers_44),
            http("request_93") .get(uri7 + "?IM=IM_6u2pyQ0FbiBBgpv") .headers(headers_52)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
