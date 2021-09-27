package OCM.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._


object OCMPages{

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


//************************************************************************************
//**** Sets the common pause, commonly referred to as "Think Time" between 35 and 60 sconds
//************************************************************************************

//        val LOW = System.getenv("LOW").toInt
//        val HIGH = System.getenv("HIGH").toInt
//Setting common pause between user actions
//        val CommonPause = pause(LOW,HIGH)

//*********************
//***** Login
//*********************

        val Login=group("Login"){
		exec(http("request_0") .get(uri05 + "/.well-known/openid-configuration") .headers(OCMHeaders.headers_0))
		.exec(http("request_1") .get(uri05 + "/pf/JWKS") .headers(OCMHeaders.headers_0))
            	.exec(http("request_2") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(OCMHeaders.headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/login"))
            	.exec(http("request_3") .get(uri05 + "/as/authorization.oauth2?response_type=code&client_id=Reg3Stg_ECP&state=bnZpenBGd0hfZjNXengyUnB-UDNHcEpXWG9pNUg1UEt3YU5oOXZZLkhMdTFk&redirect_uri=https%3A%2F%2Fstage-clinical.optum.com&scope=openid%20profile%20address%20email%20phone&code_challenge=5etYd9u9tKA18ukSrwq5T5Mjc4gs8-GrIOnOm-gRXAg&code_challenge_method=S256&nonce=bnZpenBGd0hfZjNXengyUnB-UDNHcEpXWG9pNUg1UEt3YU5oOXZZLkhMdTFk&acr_values=R3_AAL2_RBA_EXT_INT") .headers(OCMHeaders.headers_3))
            	.exec(http("request_4") .get(uri02 + "/jquery-3.3.1.slim.min.js") .headers(OCMHeaders.headers_4))
            	.exec(http("request_5") .get(uri03) .headers(OCMHeaders.headers_4))
            	.exec(http("request_6") .get(uri14) .headers(OCMHeaders.headers_4))
            	.exec(http("request_7") .get(uri15 + "/zone.js@0.10.3/dist/zone.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_8") .get(uri15 + "/zone.js@0.10.3/dist/webapis-rtc-peer-connection.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_9") .get(uri15 + "/zone.js@0.10.3/dist/zone-patch-user-media.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_10") .get(uri06 + "/css2?family=Roboto:wght@300;400;500&display=swap") .headers(OCMHeaders.headers_7))
            	.exec(http("request_11") .get(uri10) .headers(OCMHeaders.headers_7))
            	.exec(http("request_12") .get(uri15 + "/regenerator-runtime@0.13.5/runtime.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_13") .get(uri02 + "/jquery-2.2.4.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_14") .get(uri15 + "/import-map-overrides@1.14.6/dist/import-map-overrides.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_15") .get(uri15 + "/systemjs@6.3.1/dist/system.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_16") .get(uri15 + "/systemjs@6.3.1/dist/extras/amd.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_17") .get(uri15 + "/systemjs@6.3.1/dist/extras/named-exports.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_18") .get(uri15 + "/core-js-bundle@3.6.5/minified.min.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_19") .get(uri06 + "/icon?family=Material+Icons") .headers(OCMHeaders.headers_7))
            	.exec(http("request_20") .get(uri13 + "/styles/omni-chat-widget.css") .headers(OCMHeaders.headers_7))
            	.exec(http("request_21") .get(uri13 + "/scripts/omni-chat-widget-settings.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_22") .get(uri13 + "/scripts/omni-chat-widget.js") .headers(OCMHeaders.headers_7))
            	.exec(http("request_23") .get(uri12) .headers(OCMHeaders.headers_23))
            	.exec(http("request_24") .get(uri01 + "/ecp-root-config.js") .headers(OCMHeaders.headers_4))
            	.exec(http("request_25") .get(uri15 + "/single-spa@5.5.0/lib/system/single-spa.min.js") .headers(OCMHeaders.headers_4))
            	.exec(http("request_26") .get(uri01 + "/microproduct/user-management-ui-service.default.svc.cluster.local/main.js") .headers(OCMHeaders.headers_4))
            	.exec(http("request_27") .get(uri01 + "/microproduct/user-management-ui-service.default.svc.cluster.local/micro-interaction-icons.woff") .headers(OCMHeaders.headers_27))
            	.exec(http("request_28") .get(uri05 + "/.well-known/openid-configuration") .headers(OCMHeaders.headers_0))
            	.exec(http("request_29") .get(uri04 + "/?Q_ZID=ZN_elYUf0UpLzmy0bI") .headers(OCMHeaders.headers_23))
            	.exec(http("request_30") .get("/dxjsmodule/11.50cce3eb2b28e5784da7.chunk.js?Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web&Q_BRANDID=stage-clinical.optum.com") .headers(OCMHeaders.headers_7))
            	.exec(http("request_31") .get(uri05 + "/pf/JWKS") .headers(OCMHeaders.headers_0))
            	.exec(http("request_32") .post(uri05 + "/as/token.oauth2") .headers(OCMHeaders.headers_0)
			.formParam("grant_type", "authorization_code")
			.formParam("code", "-nGT0KVI3wLWIEUavs3SDR_rp0qPupRZ-9QAAAEz")
			.formParam("redirect_uri", "https://stage-clinical.optum.com")
			.formParam("code_verifier", "fkticG9ZMzZaSUpfYUVUWmhVbjlXcWV0RHMwMzNyLlBqWlp6b0dmU01VTU43")
			.formParam("client_id", "Reg3Stg_ECP")
			.formParam("client_secret", "QQ8C0orMt8hgwiobotPjVm2oFzm3orxp6gRB6vwZGhbBXAscB41GBwsg4ztbCQVX")
			.formParam("acr_values", "R3_AAL2_RBA_EXT_INT"))
            	.exec(http("request_33") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(OCMHeaders.headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/?code=-nGT0KVI3wLWIEUavs3SDR_rp0qPupRZ-9QAAAEz&state=bnZpenBGd0hfZjNXengyUnB-UDNHcEpXWG9pNUg1UEt3YU5oOXZZLkhMdTFk"))
            	.exec(http("request_34") .options(uri09 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDE3OTI3N30.TrrKGyY7gCHsWADfDkzQTna5NkXg6kOFitbyiVHHFHMTPVUPtv_eZcBgc8WKzrRg_rkYQc09aFMzu77AYNOGRERhqrbsK6IO6RwY0hqPv_PMS7dJaK6iyq6n0tVpvhlq1LhJUm4VbGVib4B8FU7a87Aaa6e4ts7vDgokk6Bl0XhrZWr8u4siw-BbQVrqCHkHLRA7B6pzTJWpF_kwtDe5PY_dHm3SIaGA-NMJW6kvEtSoEFSc2225GPB7yz2w0pFmLaY9fKfj1WkpWp2P885qQWeD6THVW7AhBMdE8CIRlXqs0ilH31HbdYjGP8gzkvaWUyYlBXZDI-5XsFpt16sQTw&org=obh_advc&role=crisis_ca") .headers(OCMHeaders.headers_34))
            	.exec(http("request_35") .get(uri01 + "/microproduct/user-management-ui-service.default.svc.cluster.local/assets/images/optum-logo.png") .headers(OCMHeaders.headers_35))
            	.exec(http("request_36") .post(uri09 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPXRzdW1tZTE3LENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoidHN1bW1lMTciLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDE3OTI3N30.TrrKGyY7gCHsWADfDkzQTna5NkXg6kOFitbyiVHHFHMTPVUPtv_eZcBgc8WKzrRg_rkYQc09aFMzu77AYNOGRERhqrbsK6IO6RwY0hqPv_PMS7dJaK6iyq6n0tVpvhlq1LhJUm4VbGVib4B8FU7a87Aaa6e4ts7vDgokk6Bl0XhrZWr8u4siw-BbQVrqCHkHLRA7B6pzTJWpF_kwtDe5PY_dHm3SIaGA-NMJW6kvEtSoEFSc2225GPB7yz2w0pFmLaY9fKfj1WkpWp2P885qQWeD6THVW7AhBMdE8CIRlXqs0ilH31HbdYjGP8gzkvaWUyYlBXZDI-5XsFpt16sQTw&org=obh_advc&role=crisis_ca")
			.headers(OCMHeaders.headers_36) .body(ElFileBody("resources/ocm/0036_request.json"))) 
		.exec(http("request_37") .post(uri09 + "/user/v1/graphql") .headers(OCMHeaders.headers_37) .body(ElFileBody("resources/ocm/0037_request.txt")))
            	.exec(http("request_38") .post(uri09 + "/user/v1/graphql") .headers(OCMHeaders.headers_37) .body(ElFileBody("resources/ocm/0038_request.txt")))
            	.exec(http("request_39") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(OCMHeaders.headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/user-dashboard-v2"))
            	.exec(http("request_40") .post(uri01 + "/rootconfig") .headers(OCMHeaders.headers_40) .body(ElFileBody("resources/ocm/0040_request.json")))
            	.exec(http("request_41") .post(uri09 + "/user/v1/graphql") .headers(OCMHeaders.headers_37) .body(ElFileBody("resources/ocm/0041_request.txt")))
            	.exec(http("request_42") .post(uri09 + "/user/v1/graphql") .headers(OCMHeaders.headers_37) .body(ElFileBody("resources/ocm/0042_request.txt")))
            	.exec(http("request_43") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(OCMHeaders.headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/user/dashboard/apps"))
            	.exec(http("request_44") .post(uri09 + "/user/v1/graphql") .headers(OCMHeaders.headers_37) .body(ElFileBody("resources/ocm/0044_request.txt")))

		.pause(20)

		.exec(http("request_45") .get(uri01 + "/microproduct/crisis-support-ui-service.crisis-support.svc.cluster.local/ecp-crisis-support-ui.js") .headers(OCMHeaders.headers_4))
		.exec(http("request_46") .get(uri15 + "/react@16.13.1/umd/react.production.min.js") .headers(OCMHeaders.headers_4))
            	.exec(http("request_47") .get(uri15 + "/react-dom@16.13.1/umd/react-dom.production.min.js") .headers(OCMHeaders.headers_4))
            	.exec(http("request_48") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(OCMHeaders.headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/crisis"))
            	.exec(http("request_49") .post(uri09 + "/auth/oauth/token") .headers(OCMHeaders.headers_49) .formParam("grant_type", "client_credentials") .formParam("client_id", "crisis_client") .formParam("client_secret", "oVzyCAgVEJc61jBtk93Q"))
            	.exec(http("request_50") .options(uri09 + "/member-search/graphql") .headers(OCMHeaders.headers_50))
            	.exec(http("request_51") .post(uri09 + "/provnew/v1/graphql") .headers(OCMHeaders.headers_51) .body(ElFileBody("resources/ocm/0051_request.json")))
            	.exec(http("request_52") .post(uri09 + "/member-search/graphql") .headers(OCMHeaders.headers_52) .body(ElFileBody("resources/ocm/0052_request.json")))
            	.exec(http("request_53") .get(uri08 + "?address=Delhi&key=AIzaSyAdLczqmIB8mu9yYJvCbTXRSFItLNVdXz4") .headers(OCMHeaders.headers_53))
            	.exec(http("request_54") .get(uri11) .headers(OCMHeaders.headers_49) .basicAuth("admin","rGbKzixPsMb0CgvBs1tu!"))

		.pause(37)

		.exec(http("request_55") .get(uri08 + "?address=123+4th+St+Atlanta,+Georgia,+&key=AIzaSyAdLczqmIB8mu9yYJvCbTXRSFItLNVdXz4") .headers(OCMHeaders.headers_53))
		.exec(http("request_56") .post(uri09 + "/provnew/v1/graphql") .headers(OCMHeaders.headers_51) .body(ElFileBody("resources/ocm/0056_request.json")))

		.pause(20)
		.exec(http("request_57") .post("/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web") .headers(OCMHeaders.headers_2) .formParam("Q_LOC", "https://stage-clinical.optum.com/user/dashboard/apps"))
		.exec(http("request_58") .post(uri09 + "/user/v1/graphql") .headers(OCMHeaders.headers_37) .body(ElFileBody("resources/ocm/0058_request.txt")))
            	.exec(http("request_59") .post(uri09 + "/user/v1/graphql") .headers(OCMHeaders.headers_37) .body(ElFileBody("resources/ocm/0059_request.txt")))

}
}
