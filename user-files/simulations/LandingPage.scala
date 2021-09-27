
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LandingPage extends Simulation {

	val httpProtocol = http
		.baseUrl("https://rba.onehealthcareid.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_1 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://identity.nonprod.onehealthcareid.com",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_4 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_5 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_9 = Map(
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_12 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_15 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_16 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"screennumber" -> "1",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-csrf" -> "OID_TOKEN",
		"x-requested-with" -> "AsyncRequest",
		"x-sessntabid" -> "bgssnjk1s5")

	val headers_25 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://identity.nonprod.onehealthcareid.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"content-type" -> "text/plain",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_26 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_28 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_30 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "iframe",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-site",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_37 = Map(
		"Accept" -> "*/*, 4m4bj5d2/36ec5aa70d6f4bf0a1ffe6c6-1a2e-47da-97f2-50697ccd6319",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Mon, 07 Jun 2021 20:48:11 GMT",
		"If-None-Match" -> "48bbef60feac4521966e8b7e591d3b92",
		"Origin" -> "https://identity.nonprod.onehealthcareid.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_38 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_42 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "iframe",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_44 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_46 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="90", "Google Chrome";v="90""",
		"sec-ch-ua-mobile" -> "?0")

    val uri1 = "https://4m4bj5d24lxh5j26jpkalmouqkbbnmv5ikj2a2kh36ec5aa70d6f4bf0sac.d.aa.online-metrix.net/fp/clear.png"
    val uri2 = "https://identity.nonprod.onehealthcareid.com"
    val uri4 = "https://h.online-metrix.net/fp"
    val uri5 = "https://js-agent.newrelic.com/nr-spa-1123.min.js"
    val uri6 = "https://ohpe-test3.optum.com/trans/loginUser.uol"
    val uri7 = "https://bam.nr-data.net"

	val scn = scenario("LandingPage")
		.exec(http("request_0") .get(uri6) .headers(headers_0)
			.resources(http("request_1")
			.get(uri2 + "/app/static/css/fonts/Optum-Icon-Font.woff2?pjuq3w")
			.headers(headers_1),
            http("request_2") .get(uri2 + "/app/static/css/fonts/opensans/opensans-regular-webfont.woff2") .headers(headers_1),
            http("request_3") .get(uri2 + "/app/static/css/fonts/opensans/opensans-bold-webfont.woff2") .headers(headers_1),
            http("request_4") .get(uri2 + "/app/static/js/uitk-req-min-945fd9447c.js") .headers(headers_4),
            http("request_6") .get(uri2 + "/app/static/js/prelogin-f85aab9ec4.min.js") .headers(headers_4),
            http("request_7") .get(uri2 + "/app/static/js/lib-min-7e6d84b497.js") .headers(headers_4),
            http("request_8") .get(uri2 + "/app/global-app-config.js") .headers(headers_4),
            http("request_9") .get(uri2 + "/app/static/js/newrelic.js") .headers(headers_9),
            http("request_10") .get(uri2 + "/static/js/summer.js") .headers(headers_4),
            http("request_11") .get(uri5) .headers(headers_9),
            http("request_12") .get(uri2 + "/api/v1/auth/login/init") .headers(headers_12),
            http("request_13") .get(uri7 + "/1/4351a748a3?a=310075815&sa=1&v=1123.df1c7f8&t=Unnamed%20Transaction&rst=1459&ref=https://identity.nonprod.onehealthcareid.com/app/index.html&be=1327&fe=1338&af=err,xhr,stn,ins,spa&perf=%7B%22timing%22:%7B%22of%22:1623690262995,%22n%22:0,%22f%22:527,%22dn%22:527,%22dne%22:527,%22c%22:527,%22ce%22:527,%22rq%22:532,%22rp%22:763,%22rpe%22:763,%22dl%22:778,%22di%22:1317,%22ds%22:1317,%22de%22:1324,%22dc%22:1338,%22l%22:1338,%22le%22:1339%7D,%22navigation%22:%7B%7D%7D&jsonp=NREUM.setToken") .headers(headers_13),
            http("request_14") .get(uri2 + "/tenants/onehealthcareid/logos/main_logo.png") .headers(headers_9),
            http("request_15") .get(uri2 + "/app/%7B%7BfavIconPath%7D%7D") .headers(headers_15),
            http("request_16") .get(uri2 + "/app/login/i18n/en_US.json") .headers(headers_16),
            http("request_17") .get(uri2 + "/app/login/views/login-abfd68e582.html") .headers(headers_16),
            http("request_18") .get(uri2 + "/tenants/onehealthcareid/logos/favicon.ico") .headers(headers_15),
            http("request_19") .get(uri2 + "/app/images/blanklogo.png") .headers(headers_15),
            http("request_20") .get(uri2 + "/app/error.html") .headers(headers_15),
            http("request_21") .get(uri2 + "/app/images/loader.gif") .headers(headers_15),
            http("request_22") .get(uri2 + "/api/v1/auth/risk/init") .headers(headers_16),
            http("request_23") .get(uri2 + "/tenants/onehealthcareid/logos/favicon.ico") .headers(headers_15),
            http("request_24") .get(uri2 + "/app/error.html") .headers(headers_15),
            http("request_25") .post(uri7 + "/events/1/4351a748a3?a=310075815&sa=1&v=1123.df1c7f8&t=Unnamed%20Transaction&rst=2189&ref=https://identity.nonprod.onehealthcareid.com/app/index.html") .headers(headers_25)
			.body(RawFileBody("0025_request.txt")),
	    http("request_26") .get("/yshd.js?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&allow_reprofile=1") .headers(headers_26),
            http("request_27") .get("/fp/check.js;CIS3SID=61DB91C436C3A9F810B64D62328E23F9?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jb=363424246a716d77354d61612662736d3d4d696b27303247532530385a27303033325f39355f35246a716077354368706f6565246a736a35416a70676d65273a323b32") .headers(headers_26),
            http("request_28") .get("/fp/clear.png?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&ck=0&m=1") .headers(headers_28),
            http("request_29") .get("/fp/clear.png?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&ck=0&m=2") .headers(headers_28),
            http("request_30") .get("/fp/ls_fp.html;CIS3SID=61DB91C436C3A9F810B64D62328E23F9?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0") .headers(headers_30),
            http("request_31") .get("/fp/clear.png?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jb=3336246e73633f366e653134663f383630333d3c603a32303964643c663b34343330303c313663") .headers(headers_26),
            http("request_32") .get("/fp/HP?session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&org_id=4m4bj5d2&nonce=36ec5aa70d6f4bf0&mode=2&hp=.co-operativebank.co.uk/CBIBSWeb/login.do.co-operativebank.co.uk/CBIBSWeb/start.do.de/portal/portal/x.entropay.com/basemenu/prot/x.facebook.comx.nationet.com/x.netbank.commbank.com.au/netbank/bankmainx.npbs.co.uk/netmastergoldbanking/x.nwolb.xlogin.aspx?refereridentx.rbsdigital.xAccountSummaryx.smile.co.uk/SmileWeb/login.do.smile.co.uk/SmileWeb/start.do.yandex.rux/CapitalOne_Consumer/x/easypay.by/x/sbank.ru/x53.com/servlet/efsonlinex://online.wellsfargo.com/x://secure.assist.ru/assistid/protected/main.doxabbeynational.co.uk/EBAN_ENS/BtoChannelDriverxalliance-leicesterxaltergold.com/login.phpxamericanexpress.com/myca/intl/acctsumm/emea/accountSummaryxbancaintesa.it/xbankcardservices.co.ukxbankofamerica.com/xbanquepopulaire.fr/xbnpparibas.net/xcahoot.comxcapitaloneonline.co.uk/CapitalOne_Consumer/Transactionsxcbonline.co.uk/ralu/reglm-web/setupSecurityQuestionPagexcibc.comxPreSignOnxcibc.comxSignOnxcitibank.ru/xclient.uralsibbank.ruxco-operativebank.co.uk/CBIBSWeb/loginSpixcommerceonlinebanking.comxcoventrybuildingsociety.co.ukxdeutsche-bank.dexdiscovercard.com/cardmembersvcs/strongauth/app/sa_mainxebanking.bawag.comxebc_ebc1961xegg.com/customer/movemoneyxegg.com/customer/yourmoneyxfacebook.com/xhalifax-online.co.ukxMyAccountsxhalifax-online.co.uk/x/Mhalifax-online.co.uk/personalxhsbc.co.uk/1/2/personal/internet-banking/xhsbc.comxhttps://banking.postbank.de/app/finanzstatus.init.do;jsessionidxib.fineco.it/FinecoWeb/BonificiServletxib.fineco.it/FinecoWeb/jsp/Main/HBFineco.jspxib.fineco.it/FinecoWeb/jsp/Main/Principale.jspxibank.alfabank.ruxin-biz.it/xipko.plxlibertyreserve.com/x/historylibertyreserve.com/x/loginwww.libertyreserve.com/x/Core.jswww.libertyreserve.com/x/transfer.libertyreserve.com/x/commonscript.jslloydstsb.co.uk/personal/a/account_overview/xmbna.co.ukxmenyala.ruxmoney.yandex.ruxmoneybookers.com/app/login.plxmoneymail.ruxmy.ebay.co.uk/ws/eBayISAPI.dll?MyEbayxmy.ebay.com/ws/eBayISAPI.dll?MyEbayxmy.ebay.fr/ws/eBayISAPI.dll?MyEbayxmybusinessbank.co.ukxnationet.com/AppServices/SignOn/SignOnProcess/RcaSignOnxnpbs.co.ukxnwolb.com/AccountSummaryxnwolb.com/Statementsxnwolb.com/TransfersLandingPagexoltx.fidelity.com/x/x/ofsummary/summaryxonline.lloydstsb.co.ukxonlinebanking.mandtbank.com/summary/AccountSummaryxpassport.yandex.ruxpaypal.com/x/cgi-bin/webscr?cmd=_accountxpaypal.com/x/cgi-bin/webscr?cmd=_login-done&login_access=xpaypal.com/us/cgi-bin/webscr?cmd=_login-done&login_access=xposte.it/xpsk.co.at/xsecure.lloydstsb.co.uk/personal/a/account_overviewxsmile.co.uk/SmileWeb/passcodexusaa.com/xusbank.com/internetBanking/RequestRouter?requestCmdId=Gxwachovia.comxybonline.co.uk/ralu/reglm-web/setupSecurityQuestionPagex.amazon.fr/xhistory/orders/view.htmlx.banquepopulaire.frxShowPortal.dox.bnpparibasfortis.bexHome_Logon.aspx.cdiscount.com/Account/Home.aspxx.cmb.frxaccueil.jspx.credit-agricole.frxentreeBam?sessionSAGx.labanquepostale.fr/xreleveCPP-releve_ccp.eax.secure.bnpparibas.net/NSFR?Actionx.secure.lcl.frxAccueilxcredem.it/OneToOne/ebank/functionsxmijn.ing.nl/xonline.ybs.co.ukxwww.discover.com/xorder.cdiscount.comxCustomer.aspxxsealinfo.verisign.com/splash?form_filexvos-comptes.credit-du-nord.fr/CDC_TableauDeBord_0.asp?xvoscomptesenligne.labanquepostale.frxwww.x.caisse-epargne.fr/Portail.aspxxwww.exabanque.netxonglet.phpxdeutsche-bank.de/xnorisbank.de/xpostbank.de/xtargobank.de/x.x.de/portal/x.bankofamerica.com/x/commonscript.js.bmo.com/OLB?id=x.bmo.com/RMC?id=x.chase.com/x.aspxx.chase.com/js/Reporting.jsx.koodomobile.com/account/selfserve/x/xaccountId=x.payment.ru/x.scotiabank.com/portal/index.jsp?xbancopopular.es/empresasxcreval.it/login2007/loginSiciliano.aspxfirst-direct.com/xipko.plxmybusinessbank.co.ukxsanpaoloimi.com/xulsterbankanytimebanking.x/login.aspxx") .headers(headers_30),
            http("request_33") .get("/fp/clear.png?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jd=353824246a646c3f3b32266866603d3131643c313531666e3363666c323036383b3035386165306330323a60313962246a6e746c3d30323a3636383b32") .headers(headers_26),
            http("request_34") .get("/fp/clear.png?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&ja=313932302624613f2533363226723d3430266e3531373a3c7832303c322463663f313530347830303432247170793d32783826667072353a2e333531322c333930322e31353b3224313130322c3333303a2c313234392c3337393a24333330382c302e38246f763d633a383a61626166633535666c666464396d613a3431393c3532346a39613569246f6c3d3624736b643d3132266e6a3f60747472732d334325324e2d30446b6c656e7661767b2c6e6d6c707a6f642c6d6e676a67696c746a636972676964266b6d6f273a46617278273044696c6665702e68766f6c2466703526706e3d3b2672683d3f3064303a696136606b646067313331623f33383563653266316a646230643c266a683d3b696464303b3363666c363535633467616b32333a37646734643063663664312668736f35456361273a304f512d30325a25303231385f31375d372468716a3d436a72676d67253238313224687b6f753f456361246a716075354368706d6d67246c60633d33322e6e666d3d302e76786635416d677a6b61632530444360696363656f246f637c68723f3438303164316b3a606761383265346b61373430323a326964313737343233646c34353a3839343364366d696330366c63393669646066373031313b3139346326723f726475676b6e57666e6173605664636e7b6521726477656b6e5d756966646f75715f6f676661615f726c697967725e6e696e716729706c776f6b6c5d61666d626d5f6161706f6063765666616e736d21726c756f616c5d737d6963697c6b6f675e64636c7b6521726e75656b6c5773686d636377637665566e636e716d21706e7d656b6c5f70676164706c637b65705c64696c736721786c7767696657746e6157706c637167705c66636e736d21706e77676b6c5d6c6576636c7e725c6661647b6723726475676b665d7174675d74696d7765705c66636e716d21706e756f696c5f6a697e635c64696c73672e677a313d3a37313e6261366637643b373b323031626b643b62633e38603b343964616069376333663035616a26676e5d633f75676a676c55656a474e253238392c32273a30284d78676c454c2730304d53253032322c32273a30436a72676d6b756d215f676045442532324f4e514e253032455b253232332e32273038284f726566474e2532384d51273038474c51442730324551273238312e32273232416a7a6f6d6b75652955656243617655676a4b69762d3032556560454c494e474e475f6b6c717c616e61656c5f63727269717127314a2532324d5a565d626e676e6c5f6d6b6c6d637a273b422530304d58565f6367646d705d6a7566646d705d6a616e645f6e6c6f6376253140273a30455a5457646b736a67616c765d7c696d677a5d737765707b253b42253032455a565d6e6c6f637457626e656e6c2d3140273a30455a5c5d647061655d646d70746a2733402730384558565f7b686364657a5776677a7c757267576e6d66253140253a30455a565f76677a7c7572675f6b6f6f70726d7b716b6d665f72657c612731422730304d58545d76657a76777a655f6469647467725f69666b716d7c726f7261612731422730305f4542494b545d475a5c5f7467787c7570655f6e616e76677a5f616c61716d76726d72696b253340273232475a5c5f7350474a253142253a384d475157656c6765676c765f6b6c646d785f776b6e7627314a2532324f4d535d6662675770676c6c65725d656b726f617227334a2532324d45515d717c616e66617a645d64657a61746376617665712d31402732324d455b5f74677a7477706757666c6d617c253142253a384d47515774657a7c7770675f646e6f69745f6e6b6e6763702d33422732384f47535f7c6d7a76777a655f6a696e645d666e6d617c2533402732324d475b5f7467787c7570655f60696e645d6e6c6f637c5d6e6b6e6763722d33422730304d475157766570746d785d61727a697b5d6d6a6a65617c273140253032574d42474e5d636d6e6d7a5f6277666e65705f6664676376273b42253038554740474e5d63676d707067737167665774657a747d72675f733b7c6127314a2532325f47404949565d574d42474e5d636d6f727a657371656c5f7665787c7d70675d7b3374612d314027323255454a474c5d616f6f72706d7373676457746778747d7a675d713b74635d7b706560253140253a30574740474e5d666d6275655f7a656c64657a6d705d6b66666f273b402730305547424f4c5f66676277655d7b686166657a732733422d3a3255474a474c5d6c677276685d76657074757067253140273a305747424349565f574d4a454e5d6c657076605d7667787677726d25334027323255474a474c5d647a61755f627d6e6467707b2533402d3032554540454c576c6f71675f616d6c7c657876253b422732305f4d40494b5c5f57474a454e5d6c6d716557636f6c76657a76273b422530305f4540474c5765776e76615f64706975333426656e5f603d373a31373b3b673a3839326469316461373b6c613531396630353c316761653b3138693037633a6324756564763d4b6e7c656e253238416c612c2e77676e7a3f4b6c74676e285a29253032554a46273a3047706178686b63732d3a323431382663616c3f303230323230&jb=31353b246c733f4f677a696e6c69253046352638273032204d6161616c766d736a27334a2532324b6e76676e2d32304f616b2530304f5b2d30325a2d323033385d33375f352b253a304172726c6755676a4b6976253a46373337263b34273038284b4a5c4f4e2732412732386c696967253032456d636b6d292d323243687a676f67273a46393226322c363431322e3133253032536364637a692530463d33352e333e") .headers(headers_26),
            http("request_35") .get("/fp/clear3.png;CIS3SID=61DB91C436C3A9F810B64D62328E23F9?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jac=1&je=373824246d67666a3528312e3124312e65313a6d63663b3d3536343a303367376136653b32306737363134316c636236373f613163393b6936633a3d3130606d603037663233626b6130356634673a6621") .headers(headers_26),
            http("request_36") .get("/fp/top_fp.html;CIS3SID=61DB91C436C3A9F810B64D62328E23F9?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0") .headers(headers_30),
            http("request_37") .get("/fp/clear.png") .headers(headers_37),
            http("request_38") .get("/fp/clear.png?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jf=3336246e73603f603a306331396c623533643c3c343263313162306e3b3464333b35643e383167") .headers(headers_38),
            http("request_39") .get("/fp/clear1.png;CIS3SID=61DB91C436C3A9F810B64D62328E23F9?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jf=34313424736b665d7a6e643f746c725d504738394172473969476c7a464470322471696c5f646376653f33343a33303b383039332673616c5d767b78653d756d603867636671612e7369665d6b677b3f3b30353b333831313036383f30633a3e3438616d316632323233303e303830633834363a6b653366303b30333037383b363032383034343f60353266613b623a633534616561676439376532333d31306331313f336735316133636a3b3236663630393a643966666667363b6c356133373d343131313f6c603131303666326c313634613a37306d65333437633561636a39663a363934663733316a6036363f3437663b606166303b32633d66336660633b61616c632671696c5f716967353b3236373832323238363a63393a36356e38376063613a67373e356634636e363732353e6e3432353d6133313c303032303136363131656633663766336e623131643a383237613038303033383061303c373330363464366e663834663460363b6c326260313b3231333130303135663a6231353d3b366031663265316539333661616030303935613838313734267b6164703f38") .headers(headers_28),
            http("request_41") .get("/fp/check.js?&pageid=99998&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&org_id=4m4bj5d2&nonce=36ec5aa70d6f4bf0") .headers(headers_38),
            http("request_42") .get(uri4 + "/sid_fp.html;CIS3SID=61DB91C436C3A9F810B64D62328E23F9?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0") .headers(headers_42),
            http("request_43") .get("/fp/clear.png?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jac=1&je=3131352426726f3f666f2660617c73763d7b2a6467746764223a332632322e227176617c7573203822616a637a67696c672a7d2461756c603f32616c6434316a3b3237316066383c66356637373133636b383236666e3666333738303b30303c6530346c363667343666633861393261663167633a38653232") .headers(headers_26),
            http("request_44") .get(uri4 + "/clear1.png;CIS3SID=EA398C5FC0CF164F5A7EB9614529AE16?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&jf=34313a24736b665d7a6e643f746c725d57475e4b6475364f4e44633f586841542471696c5f646376653f33343a33303b383039302673616c5d767b78653d756d603867636671612e7369665d6b677b3f3b30353b333831313036383f30633a3e3438616d316632323233303e303830633834363a6b653366303b30333037383b363032383034613a31303134343a633c3863613a623261666b373635383b353a633330696332366c3731376a356064333537353933343335653067343e313167636a306732653c6b37603a6b3561643d3a3037643737653131643232653461346e6563313739373333353a3f3230333f6339676a3a6333343230636b31366460303461316e362671696c5f716967353b323634383232333832633134376638383836326636353a36316661646530616164656c3a3a33673c3164643161366662343562386130373a3066363a3b386663333c316032646b3d3032303a3130326b353230653b36653b64653032643661356b65613b62386332396569383460326d3431313c676663616637323e31633b3b326363603e653832326a36373934692e716b647a3d31") .headers(headers_44),
            http("request_45") .get("/fp/ARF;CIS3SID=82F28EB535DF99565ADB407E74E492F1?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&pageid=99998&sera_parametere=VUZYBldZBVUHAQ9UVlsFBAoDBAdQB1IABlIDVwMGBQYDDgNaVFhZBQJcVUBHEVtZXUYQF0ZEUnMVU3RDAyZDAgNcFgZZBAxSXhBFQwcmQwdxBkBUcURTB1gLRRJHR1V0FgEnRgIlR1NZWQBQAloACQUPA1VUVwRWAAIBAFVbVVUKVwFWVFJZAwYCUlIMB1QGUQ5DDVoPAlINVwADV1cHUQQGAVVTVQNRAEJcFQlSHlIFD11RUwBVB1FUUFcHVQBVAQNWWwBWVAZUVQVVUABSAQsCVVpTUFERUQ0LVwRQVgcVXwxeGFBHR1lZD18NW14WW11YRVdcIl9CC1sDEgAQDQoGQwFaElx6UQcQBVZfElRJaQYCWQ0DVlMPEANAX18I&count=0&max=0") .headers(headers_38),
            http("request_46") .get(uri1 + "?org_id=4m4bj5d2&session_id=a1ffe6c6-1a2e-47da-97f2-50697ccd6319&nonce=36ec5aa70d6f4bf0&di=yes") .headers(headers_46)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
