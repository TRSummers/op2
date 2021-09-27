package BO.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random

object BOPages{

    val uri1 = "https://identity.nonprod.onehealthcareid.com"
    val uri3 = "https://ohpe-test3.optum.com/trans"
    val uri4 = "https://bam.nr-data.net/events/1/4351a748a3"
    val uri6 = "https://zn0bmwyygqj34mcyz-uhg1.siteintercept.qualtrics.com/WRSiteInterceptEngine"
    val uri7 = "https://co1.qualtrics.com/WRQualtricsSiteIntercept/Graphic.php"
    val uri5 = "https://siteintercept.qualtrics.com"
    val uris2 = "https://siteintercept.qualtrics.com"
    val uris3 = "https://zn0bmwyygqj34mcyz-uhg1.siteintercept.qualtrics.com/WRSiteInterceptEngine"
    val uris4 = "https://co1.qualtrics.com/WRQualtricsSiteIntercept/Graphic.php"
    val baseS = "https://ohpe-test3.optum.com"


//************************************************************************************ 
//**** Sets the common pause, commonly referred to as "Think Time" between X and Y sconds
//************************************************************************************ 

        val LOW = System.getenv("LOW").toInt
        val HIGH = System.getenv("HIGH").toInt

//Setting common pause between user actions
        val CommonPause = pause(LOW,HIGH)


//*********************
//***** LOGIN
//*********************

        val LOGIN=group("LOGIN"){
                exec(http("LOGIN") .post(uri1 + "/api/v1/auth/authenticate") .headers(BOHeaders.headers_10) .body(ElFileBody("0010_request.json")))
		.exec(http("request_11") .get(uri1 + "/app/static/js/postlogin-b308b58c4c.min.js") .headers(BOHeaders.headers_11))
            	.exec(http("request_12") .get(uri1 + "/app/common/i18n/en_US.json") .headers(BOHeaders.headers_12))
            	.exec(http("request_13") .post(uri4 + "?a=310075815&sa=1&v=1123.df1c7f8&t=Unnamed%20Transaction&rst=23420&ref=https://identity.nonprod.onehealthcareid.com/app/index.html") .headers(BOHeaders.headers_13) .body(ElFileBody("0013_request.txt")))
            	//.exec(http("request_14") .get(uri1 + "/tenants/onehealthcareid/logos/favicon.ico") .headers(BOHeaders.headers_14))
            	.exec(http("request_15") .get(uri1 + "/app/error.html") .headers(BOHeaders.headers_14))
            	//.exec(http("request_16") .post(uri1 + "/oidc/auth/callback") .headers(BOHeaders.headers_16) .formParam("grantId", "l7fwzyr8nhc2ky9xhj92ojlr"))
            	.exec(http("request_19") .get(uri3 + "/optumLoggedIn.uol?code=v0HZcLFjK6H3QPH6O87NoTUGrQJE5DZ6") .headers(BOHeaders.headers_19))
            	//.exec(http("request_20") .get(uri3 + "/javascripts/tabcontent.js") .headers(BOHeaders.headers_20))
            	//.exec(http("request_22") .get(uri3 + "/javascripts/autoTab.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_23") .get(uri3 + "/mainMenu.uol") .headers(BOHeaders.headers_19))
            	//.exec(http("request_25") .get(uri3 + "/javascripts/sso.js") .headers(BOHeaders.headers_20))
            	//.exec(http("request_27") .get(uri3 + "/javascripts/jquery-te-1.4.0.min.js") .headers(BOHeaders.headers_20))
            	//.exec(http("request_28") .get(uri3 + "/javascripts/jquery.validate.min-1.9.js") .headers(BOHeaders.headers_20))
            	//.exec(http("request_29") .get(uri3 + "/commons/new-ui/js/jquery-3.3.1.slim.min.js") .headers(BOHeaders.headers_20))
            	//.exec(http("request_45") .get(uri3 + "/javascripts/jquery-1.9.1.js") .headers(BOHeaders.headers_20))
            	//.exec(http("request_46") .get(uri3 + "/javascripts/jquery-ui.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_51") .get(uri6 + "/?Q_ZID=ZN_0BMwYygqJ34McYZ&Q_LOC=https%3A%2F%2Fohpe-test3.optum.com%2Ftrans%2FmainMenu.uol&t=1623274001548") .headers(BOHeaders.headers_51))
            	.exec(http("request_52") .post(uri5 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_0BMwYygqJ34McYZ&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_52) .formParam("Q_LOC", "https://ohpe-test3.optum.com/trans/mainMenu.uol"))
            	.exec(http("request_53") .get(uri5 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_54") .get(uri5 + "/dxjsmodule/15.e8eacdb7343203b896a5.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_55") .get(uri5 + "/dxjsmodule/1.681145f504c635c85681.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_56") .get(uri5 + "/dxjsmodule/SliderModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_57") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=SI_bJxHL5AcG8kjEjP&Version=13&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_58") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=CR_4NnbdlHuUtZ8aTX&Version=2&Q_InterceptID=SI_bJxHL5AcG8kjEjP&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_60") .get(uri5 + "/WRQualtricsShared/Graphics/siteintercept/svg-close-btn-white-5.svg") .headers(BOHeaders.headers_53))
            	.exec(http("request_61") .get(uri7 + "?IM=IM_6u2pyQ0FbiBBgpv") .headers(BOHeaders.headers_61))

        }
	.pause(30)

//*********************
//***** LOGGED_IN
//*********************

        val LOGGED_IN=group("LOGGED_IN"){
                //exec(http("LOGGEDIn") .get(uri3 + "/javascripts/ose/angularModule/bhp-elig-ang/v1.4/styles.bundle.css") .headers(BOHeaders.headers_53) .resources(http("request_63") .get(uri3 + "/javascripts/sso.js") .headers(BOHeaders.headers_20)))
            	exec(http("request_65") .post(uri3 + "/eligibilityBenefitsPatientListSearchAngular.uol") .headers(BOHeaders.headers_65) .formParam("_patientSelectList", "on") .formParam("patientSelectList", "1695") .formParam("_patientSelectList", "on") .formParam("refreshPatient", "elig") .formParam("psubmit", "Search") .formParam("behavior", "FORWARD"))
            	.exec(http("request_68") .get(uri3 + "/javascripts/jquery-te-1.4.0.min.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_70") .get(uri3 + "/javascripts/jquery.validate.min-1.9.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_71") .get(uri3 + "/javascripts/ose/angularModule/bhp-elig-ang/v1.4/inline.bundle.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_74") .get(uri3 + "/commons/new-ui/js/jquery-3.3.1.slim.min.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_76") .get(uri3 + "/javascripts/ose/angularModule/bhp-elig-ang/v1.4/polyfills.bundle.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_79") .get(uri3 + "/javascripts/jquery-1.9.1.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_89") .get(uri3 + "/javascripts/jquery-ui.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_90") .get(uri3 + "/javascripts/ose/angularModule/bhp-elig-ang/v1.4/main.bundle.js") .headers(BOHeaders.headers_20))
            	.exec(http("request_92") .get(uri6 + "/?Q_ZID=ZN_0BMwYygqJ34McYZ&Q_LOC=https%3A%2F%2Fohpe-test3.optum.com%2Ftrans%2FeligibilityBenefitsPatientListSearchAngular.uol&t=1623274039034") .headers(BOHeaders.headers_51))
            	.exec(http("request_93") .post(uri5 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_0BMwYygqJ34McYZ&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_52) .formParam("Q_LOC", "https://ohpe-test3.optum.com/trans/eligBenefitPatientList.uol"))
            	.exec(http("request_94") .get(uri5 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_95") .get(uri5 + "/dxjsmodule/15.e8eacdb7343203b896a5.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_96") .get(uri5 + "/dxjsmodule/1.681145f504c635c85681.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_97") .get(uri5 + "/dxjsmodule/SliderModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_98") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=SI_bJxHL5AcG8kjEjP&Version=13&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_99") .get(uri5 + "/WRSiteInterceptEngine/Asset.php?Module=CR_4NnbdlHuUtZ8aTX&Version=2&Q_InterceptID=SI_bJxHL5AcG8kjEjP&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headers_53))
            	.exec(http("request_101") .get(uri7 + "?IM=IM_6u2pyQ0FbiBBgpv") .headers(BOHeaders.headers_53))
            	.exec(http("request_102") .get(uri5 + "/WRQualtricsShared/Graphics/siteintercept/svg-close-btn-white-5.svg") .headers(BOHeaders.headers_53))

        }


//*********************
//***** SEARCH
//*********************


        val SEARCH=group("SEARCH"){
                exec(http("request_3") .get(baseS + "/trans/javascripts/sso.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_4") .post(baseS + "/trans/eligibilityBenefitsMemberNameSearchAngular.uol")
                        .headers(BOHeaders.headersSearch_4)
                        .formParam("firstName", "Perf")
                        .formParam("lastName", "Testy")
                        .formParam("state", "MD")
                        .formParam("dobMonth", "01")
                        .formParam("dobDay", "01")
                        .formParam("dobYear", "1981")
                        .formParam("monthEliCheck", "06")
                        .formParam("dayEliCheck", "14")
                        .formParam("yearEliCheck", "2021")
                        .formParam("behavior", "FORWARD"))
                .exec(http("request_6") .get(baseS + "/trans/javascripts/jquery.validate.min-1.9.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_7") .get(baseS + "/trans/commons/new-ui/js/jquery-3.3.1.slim.min.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_8") .get(baseS + "/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/inline.bundle.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_11") .get(baseS + "/trans/javascripts/jquery-te-1.4.0.min.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_12") .get(baseS + "/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/polyfills.bundle.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_18") .get(baseS + "/trans/javascripts/jquery-1.9.1.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_26") .get(baseS + "/trans/javascripts/ose/angularModule/bhp-elig-ang/v1.4/main.bundle.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_27") .get(baseS + "/trans/javascripts/jquery-ui.js") .headers(BOHeaders.headersSearch_3))
                .exec(http("request_29") .get(uris3 + "/?Q_ZID=ZN_0BMwYygqJ34McYZ&Q_LOC=https%3A%2F%2Fohpe-test3.optum.com%2Ftrans%2FeligibilityBenefitsMemberNameSearchAngular.uol&t=1623697968851") .headers(BOHeaders.headersSearch_29))
                .exec(http("request_30") .post(uris2 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_0BMwYygqJ34McYZ&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headersSearch_30)
                        .formParam("Q_LOC", "https://ohpe-test3.optum.com/trans/eligBenefitPatientList.uol"))
                .exec(http("request_31") .get(uris2 + "/dxjsmodule/CoreModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headersSearch_31))
                .exec(http("request_32") .get(uris2 + "/dxjsmodule/15.e8eacdb7343203b896a5.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headersSearch_31))
                .exec(http("request_33") .get(uris2 + "/dxjsmodule/1.681145f504c635c85681.chunk.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headersSearch_31))
                .exec(http("request_34") .get(uris2 + "/dxjsmodule/SliderModule.js?Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headersSearch_31))
                .exec(http("request_35") .get(uris2 + "/WRSiteInterceptEngine/Asset.php?Module=SI_bJxHL5AcG8kjEjP&Version=13&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headersSearch_31))
                .exec(http("request_36") .get(uris2 + "/WRSiteInterceptEngine/Asset.php?Module=CR_4NnbdlHuUtZ8aTX&Version=2&Q_InterceptID=SI_bJxHL5AcG8kjEjP&Q_ORIGIN=https://ohpe-test3.optum.com&Q_CLIENTVERSION=1.52.0&Q_CLIENTTYPE=web") .headers(BOHeaders.headersSearch_31))
                .exec(http("request_38") .get(uris2 + "/WRQualtricsShared/Graphics/siteintercept/svg-close-btn-white-5.svg") .headers(BOHeaders.headersSearch_31))
                .exec(http("request_39") .get(uris4 + "?IM=IM_6u2pyQ0FbiBBgpv") .headers(BOHeaders.headersSearch_39))
	}

//*********************
//***** LN
//*********************

        val TIN=group("TIN"){
                 exec(http("LName_Smith_WI") .get("/api/v1/md-search?lastName=Smith&stateCode=WI").check(regex("""lastName":"(.+?)",""").saveAs("p_Lname")) .headers(BOHeaders.headers_0))
	}

        val LN=group("LN"){
                 exec(http("LName_Smith_WI") .get("/api/v1/md-search?lastName=Smith&stateCode=WI").check(regex("""lastName":"(.+?)",""").saveAs("p_Lname")) .headers(BOHeaders.headers_0))
	}

}

