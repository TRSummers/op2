
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SSOtoOCM extends Simulation {

	val httpProtocol = http
		.baseUrl("https://stage-clinical.optum.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36")

	val headers_0 = Map(
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

	val headers_1 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_3 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_9 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_11 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_19 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_20 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_24 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_25 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_27 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://stage-clinical.optum.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_30 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_32 = Map(
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_34 = Map(
		"Origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_60 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_64 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_65 = Map(
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

	val headers_66 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "authorization,x-hasura-role",
		"access-control-request-method" -> "POST",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_68 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJraWQiOiIyZDAyMjhlYS0yNjljLTQ5OTctYTg1NC05ZTM1ZTQzNjAxMmMiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnsiYXR0cmlidXRlcyI6e319LCJ4LWVjcC1hbHQtdXNlci1pZCI6ImVicmVzbGluIiwieC1lY3AtY2xpLW9yZ3MiOlt7Im9yZy1pZCI6Im9iaF9hZHZjIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX2NhIiwiYXBwbC1yb2xlcyI6WyJjcmlzaXNfc3VwcG9ydF91c2VyIiwibWJyX21nbXRfd3JpdGUiLCJzZG9oX2JoX2NhIiwic3lzdGVtX21nbXRfdXNlciJdfV19XSwieC1lY3AtZmlyc3QtbmFtZSI6IkVyaW4iLCJ4LWVjcC10eXBlIjoiUEFTU1dPUkQiLCJ4LWVjcC11c2VyLWlkIjoiMDAwODU0ODM3IiwieC1lY3AtZW1haWwiOiJlcmluLmJyZXNsaW5Ab3B0dW0uY29tIiwieC1lY3AtbGFzdC1uYW1lIjoiQnJlc2xpbiIsIngtZWNwLXNvdXJjZSI6Im1zaWQifSwiaHR0cHM6XC9cL2hhc3VyYS5pb1wvand0XC9jbGFpbXMiOnsieC1oYXN1cmEtZGVmYXVsdC1yb2xlIjoiY3Jpc2lzX3N1cHBvcnRfdXNlciIsIngtaGFzdXJhLWZ1bGwtbmFtZSI6IkVyaW4gQnJlc2xpbiIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IkJyZXNsaW4iLCJ4LWhhc3VyYS1hdHRycyI6InsgfSIsIngtaGFzdXJhLWNsaS1vcmciOiJvYmhfYWR2YyIsIngtaGFzdXJhLXVzZXItaWQiOiIwMDA4NTQ4MzciLCJ4LWhhc3VyYS1hbHQtdXNlci1pZCI6ImVicmVzbGluIiwieC1oYXN1cmEtZmlyc3QtbmFtZSI6IkVyaW4iLCJ4LWhhc3VyYS1mdW5jLXJvbGUiOiJjcmlzaXNfY2EiLCJ4LWhhc3VyYS1hbGxvd2VkLXJvbGVzIjpbImNyaXNpc19zdXBwb3J0X3VzZXIiLCJtYnJfbWdtdF93cml0ZSIsInNkb2hfYmhfY2EiLCJzeXN0ZW1fbWdtdF91c2VyIl19LCJzY29wZSI6Im9wZW5pZCIsImlzcyI6ImVjcC1zdGFnZSIsImV4cCI6MTYzMDA5OTU3MiwiY2xpZW50X2lkIjoiZWNwX3BsYXRmb3JtIn0.e0WOjxJyOOmvjCNUK2YiI2nTIOF_kk08b3z7jOPtjLMc-O3P6klt4NkfcCVGKqBo3l16tQWDXQcbwQuVVVWoYo62145WFrd-2l9bTuxe_kPo1SQMLRYDX612j5bCNZZ6Mumjyzf-7sZtgx7sMWGlxvM4N8cCIx1kWN4aMUiaU0J3hRs0h4gxQ433BxF03AUSs9UfljHES3uutZBEvviNSxTdDKwQ4hnxnvewvXWdMFPEpH_FHSGDUbsjxNX8YMmeeaDXi2H1wJWWAYKE7AZQcDyWRXaArcOllXRYwDDEIeE8Lm5T7N4EnidlV03muEn4QvtNCJ1Z5lEMtdIe5zjTcw",
		"content-type" -> "text/plain",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-role" -> "system_mgmt_user")

	val headers_70 = Map(
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

	val headers_76 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_77 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "authorization,content-type,x-hasura-func-role",
		"access-control-request-method" -> "POST",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_79 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJraWQiOiIyZDAyMjhlYS0yNjljLTQ5OTctYTg1NC05ZTM1ZTQzNjAxMmMiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnt9LCJ4LWVjcC1hbHQtdXNlci1pZCI6ImNyaXNpc19jbGllbnQiLCJ4LWVjcC1jbGktb3JncyI6W3sib3JnLWlkIjoiZWNwIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX3VpX3JvbGUiLCJhcHBsLXJvbGVzIjpbImNyaXNpc19zdXBwb3J0X3VzZXIiLCJzeXN0ZW1fbWdtdF91c2VyIl19XX1dLCJ4LWVjcC1maXJzdC1uYW1lIjoiQ3Jpc2lzIFN1cHBvcnQiLCJ4LWVjcC10eXBlIjoiQ0xJRU5UX0NSRURFTlRJQUxTIiwieC1lY3AtdXNlci1pZCI6ImNyaXNpc19jbGllbnQiLCJ4LWVjcC1sYXN0LW5hbWUiOiJDbGllbnQifSwiaHR0cHM6XC9cL2hhc3VyYS5pb1wvand0XC9jbGFpbXMiOnsieC1oYXN1cmEtZGVmYXVsdC1yb2xlIjoiY3Jpc2lzX3N1cHBvcnRfdXNlciIsIngtaGFzdXJhLWZ1bGwtbmFtZSI6IkNyaXNpcyBTdXBwb3J0IENsaWVudCIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IkNsaWVudCIsIngtaGFzdXJhLWF0dHJzIjoieyB9IiwieC1oYXN1cmEtY2xpLW9yZyI6ImVjcCIsIngtaGFzdXJhLXVzZXItaWQiOiJjcmlzaXNfY2xpZW50IiwieC1oYXN1cmEtYWx0LXVzZXItaWQiOiIiLCJ4LWhhc3VyYS1maXJzdC1uYW1lIjoiQ3Jpc2lzIFN1cHBvcnQiLCJ4LWhhc3VyYS1mdW5jLXJvbGUiOiJjcmlzaXNfdWlfcm9sZSIsIngtaGFzdXJhLWFsbG93ZWQtcm9sZXMiOlsiY3Jpc2lzX3N1cHBvcnRfdXNlciIsInN5c3RlbV9tZ210X3VzZXIiXX0sInNjb3BlIjoib3BlbmlkIiwiaXNzIjoiZWNwLXN0YWdlIiwiZXhwIjoxNjMwMDk5NTc0LCJjbGllbnRfaWQiOiJjcmlzaXNfY2xpZW50In0.A2obvywVy1Cc8yw5t8cqxvvN1m6kXvcRZImiy-Lhgdj4xNoWBaCsCt53Fr7OIsW7BRrZrrlr-g68w_2FzbSp36rNlsQSnIYHGouxOr3awVSeU24ehFQra9ck_3Tz1EX2FTEI6qc7TuVz9z1PoaLOL-SODfGALlUuOWm35OS7cfOZzpAnqoSqBWhC44g3RSrwhi5X_uoKW9AoANkZRVH_DFLj1OV4hyNZwJo0WAYnK6WxDJEqa8YOKdF4PhVwaVd_3_ILxHGmVAFp9EqqgaueknuYTxnZuEAgIrtf0F3Q_SDzBfDF17rhOqYmtnftPN5FQFDeMkRtrs39NVGKiGpVRA",
		"content-type" -> "application/json",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-func-role" -> "crisis_support_user")

	val headers_80 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJraWQiOiIyZDAyMjhlYS0yNjljLTQ5OTctYTg1NC05ZTM1ZTQzNjAxMmMiLCJhbGciOiJSUzUxMiJ9.eyJ4LWVjcC1jbGFpbXMiOnsieC1lY3AtYXR0cnMiOnsiYXR0cmlidXRlcyI6e319LCJ4LWVjcC1hbHQtdXNlci1pZCI6ImVicmVzbGluIiwieC1lY3AtY2xpLW9yZ3MiOlt7Im9yZy1pZCI6Im9iaF9hZHZjIiwiZnVuYy1yb2xlcyI6W3sicm9sZS1uYW1lIjoiY3Jpc2lzX2NhIiwiYXBwbC1yb2xlcyI6WyJjcmlzaXNfc3VwcG9ydF91c2VyIiwibWJyX21nbXRfd3JpdGUiLCJzZG9oX2JoX2NhIiwic3lzdGVtX21nbXRfdXNlciJdfV19XSwieC1lY3AtZmlyc3QtbmFtZSI6IkVyaW4iLCJ4LWVjcC10eXBlIjoiUEFTU1dPUkQiLCJ4LWVjcC11c2VyLWlkIjoiMDAwODU0ODM3IiwieC1lY3AtZW1haWwiOiJlcmluLmJyZXNsaW5Ab3B0dW0uY29tIiwieC1lY3AtbGFzdC1uYW1lIjoiQnJlc2xpbiIsIngtZWNwLXNvdXJjZSI6Im1zaWQifSwiaHR0cHM6XC9cL2hhc3VyYS5pb1wvand0XC9jbGFpbXMiOnsieC1oYXN1cmEtZGVmYXVsdC1yb2xlIjoiY3Jpc2lzX3N1cHBvcnRfdXNlciIsIngtaGFzdXJhLWZ1bGwtbmFtZSI6IkVyaW4gQnJlc2xpbiIsIngtaGFzdXJhLWxhc3QtbmFtZSI6IkJyZXNsaW4iLCJ4LWhhc3VyYS1hdHRycyI6InsgfSIsIngtaGFzdXJhLWNsaS1vcmciOiJvYmhfYWR2YyIsIngtaGFzdXJhLXVzZXItaWQiOiIwMDA4NTQ4MzciLCJ4LWhhc3VyYS1hbHQtdXNlci1pZCI6ImVicmVzbGluIiwieC1oYXN1cmEtZmlyc3QtbmFtZSI6IkVyaW4iLCJ4LWhhc3VyYS1mdW5jLXJvbGUiOiJjcmlzaXNfY2EiLCJ4LWhhc3VyYS1hbGxvd2VkLXJvbGVzIjpbImNyaXNpc19zdXBwb3J0X3VzZXIiLCJtYnJfbWdtdF93cml0ZSIsInNkb2hfYmhfY2EiLCJzeXN0ZW1fbWdtdF91c2VyIl19LCJzY29wZSI6Im9wZW5pZCIsImlzcyI6ImVjcC1zdGFnZSIsImV4cCI6MTYzMDA5OTU3MiwiY2xpZW50X2lkIjoiZWNwX3BsYXRmb3JtIn0.e0WOjxJyOOmvjCNUK2YiI2nTIOF_kk08b3z7jOPtjLMc-O3P6klt4NkfcCVGKqBo3l16tQWDXQcbwQuVVVWoYo62145WFrd-2l9bTuxe_kPo1SQMLRYDX612j5bCNZZ6Mumjyzf-7sZtgx7sMWGlxvM4N8cCIx1kWN4aMUiaU0J3hRs0h4gxQ433BxF03AUSs9UfljHES3uutZBEvviNSxTdDKwQ4hnxnvewvXWdMFPEpH_FHSGDUbsjxNX8YMmeeaDXi2H1wJWWAYKE7AZQcDyWRXaArcOllXRYwDDEIeE8Lm5T7N4EnidlV03muEn4QvtNCJ1Z5lEMtdIe5zjTcw",
		"content-type" -> "application/json",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site",
		"x-hasura-func-role" -> "crisis_support_user")

	val headers_81 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_84 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "authorization",
		"access-control-request-method" -> "GET",
		"origin" -> "https://stage-clinical.optum.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

    val uri02 = "https://code.jquery.com"
    val uri03 = "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    val uri04 = "https://znelyuf0uplzmy0bi-uhg1.siteintercept.qualtrics.com/SIE"
    val uri05 = "https://authgateway3-stg.entiam.uhg.com"
    val uri06 = "https://fonts.googleapis.com"
    val uri07 = "https://siteintercept.qualtrics.com"
    val uri08 = "https://maps.googleapis.com/maps/api/geocode/json"
    val uri09 = "https://stage-ecp-api.optum.com"
    val uri10 = "https://d3js.org/d3.v3.min.js"
    val uri11 = "https://stage-ecp-drupal.optum.com/jsonapi/node/crisis_support"
    val uri12 = "https://unpkg.com/@ungap"
    val uri13 = "https://stg-omnidigital.uhc.com/OptumVirtualCare"
    val uri14 = "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    val uri15 = "https://cdn.jsdelivr.net/npm"

	val scn = scenario("SSOtoOCM")
		.exec(http("request_0")
			.get("/sso?source=msid&appl_nm=crisis_support&role=crisis_ca&org=obh_advc&params=Zmlyc3ROYW1lPUpFU1NJQ0EmbGFzdE5hbWU9Q0FTSCZkYXRlT2ZCaXJ0aD0yMDA1LTAyLTA5JnN1YnNjcmliZXJJZD0wMDA5ODY0ODQ4NA==")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri06 + "/css2?family=Roboto:wght@300;400;500&display=swap")
			.headers(headers_1),
            http("request_2")
			.get(uri06 + "/icon?family=Material+Icons")
			.headers(headers_1),
            http("request_3")
			.get(uri15 + "/zone.js@0.10.3/dist/zone-patch-user-media.js")
			.headers(headers_3),
            http("request_4")
			.get(uri15 + "/zone.js@0.10.3/dist/webapis-rtc-peer-connection.min.js")
			.headers(headers_3),
            http("request_5")
			.get(uri12 + "/global-this")
			.headers(headers_3),
            http("request_6")
			.get(uri12 + "/global-this@0.4.4")
			.headers(headers_3),
            http("request_7")
			.get(uri15 + "/systemjs@6.3.1/dist/extras/amd.min.js")
			.headers(headers_3),
            http("request_8")
			.get(uri15 + "/systemjs@6.3.1/dist/extras/named-exports.min.js")
			.headers(headers_3),
            http("request_9")
			.get(uri14)
			.headers(headers_9),
            http("request_10")
			.get(uri02 + "/jquery-3.3.1.slim.min.js")
			.headers(headers_9),
            http("request_11")
			.get(uri13 + "/styles/omni-chat-widget.css")
			.headers(headers_11),
            http("request_12")
			.get(uri15 + "/zone.js@0.10.3/dist/zone.min.js")
			.headers(headers_3),
            http("request_13")
			.get(uri15 + "/systemjs@6.3.1/dist/system.min.js")
			.headers(headers_3),
            http("request_14")
			.get(uri15 + "/regenerator-runtime@0.13.5/runtime.min.js")
			.headers(headers_3),
            http("request_15")
			.get(uri02 + "/jquery-2.2.4.min.js")
			.headers(headers_3),
            http("request_16")
			.get(uri12 + "/global-this@0.4.4/min.js")
			.headers(headers_3),
            http("request_17")
			.get(uri10)
			.headers(headers_3),
            http("request_18")
			.get(uri15 + "/core-js-bundle@3.6.5/minified.min.js")
			.headers(headers_3),
            http("request_19")
			.get(uri13 + "/scripts/omni-chat-widget-settings.js")
			.headers(headers_19),
            http("request_20")
			.get("/ecp-root-config.js")
			.headers(headers_20),
            http("request_21")
			.get(uri13 + "/scripts/omni-chat-widget.js")
			.headers(headers_19),
            http("request_22")
			.get(uri15 + "/single-spa@5.5.0/lib/system/single-spa.min.js")
			.headers(headers_9),
            http("request_23")
			.get("/microproduct/user-management-ui-service.default.svc.cluster.local/main.js")
			.headers(headers_20),
            http("request_24")
			.get("/microproduct/user-management-ui-service.default.svc.cluster.local/assets/images/optum-logo.png")
			.headers(headers_24),
            http("request_25")
			.get("/microproduct/user-management-ui-service.default.svc.cluster.local/micro-interaction-icons.woff")
			.headers(headers_25),
            http("request_26")
			.get("/favicon.ico")
			.headers(headers_24),
            http("request_27")
			.get(uri05 + "/.well-known/openid-configuration")
			.headers(headers_27),
            http("request_28")
			.get(uri05 + "/pf/JWKS")
			.headers(headers_27),
            http("request_29")
			.get(uri04 + "/?Q_ZID=ZN_elYUf0UpLzmy0bI")
			.headers(headers_3),
            http("request_30")
			.get(uri05 + "/as/authorization.oauth2?response_type=code&client_id=Reg3Stg_ECP&state=ZkdPNHNjUHJYc2lxS01kdHlvamZpM0ZTWmhjam5JdVpCeTFLcGszbm9OajU5&redirect_uri=https%3A%2F%2Fstage-clinical.optum.com&scope=openid%20profile%20address%20email%20phone&code_challenge=O4Gb-_3mCNhpBvOtMgRvWiPJj16L3xlKat1WHofuMYM&code_challenge_method=S256&nonce=ZkdPNHNjUHJYc2lxS01kdHlvamZpM0ZTWmhjam5JdVpCeTFLcGszbm9OajU5&acr_values=R3_AAL2_RBA_EXT_INT")
			.headers(headers_30),
            http("request_31")
			.get(uri07 + "/dxjsmodule/11.50cce3eb2b28e5784da7.chunk.js?Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web&Q_BRANDID=stage-clinical.optum.com")
			.headers(headers_3),
            http("request_32")
			.get(uri06 + "/css2?family=Roboto:wght@300;400;500&display=swap")
			.headers(headers_32),
            http("request_33")
			.get(uri06 + "/icon?family=Material+Icons")
			.headers(headers_32),
            http("request_34")
			.get(uri02 + "/jquery-3.3.1.slim.min.js")
			.headers(headers_34),
            http("request_35")
			.get(uri03)
			.headers(headers_34),
            http("request_36")
			.get(uri14)
			.headers(headers_34),
            http("request_37")
			.get(uri15 + "/zone.js@0.10.3/dist/zone.min.js")
			.headers(headers_32),
            http("request_38")
			.get(uri15 + "/zone.js@0.10.3/dist/webapis-rtc-peer-connection.min.js")
			.headers(headers_32),
            http("request_39")
			.get(uri15 + "/zone.js@0.10.3/dist/zone-patch-user-media.js")
			.headers(headers_32),
            http("request_40")
			.get(uri10)
			.headers(headers_32),
            http("request_41")
			.get(uri15 + "/regenerator-runtime@0.13.5/runtime.min.js")
			.headers(headers_32),
            http("request_42")
			.get(uri02 + "/jquery-2.2.4.min.js")
			.headers(headers_32),
            http("request_43")
			.get(uri13 + "/scripts/omni-chat-widget-settings.js")
			.headers(headers_32),
            http("request_44")
			.get(uri13 + "/scripts/omni-chat-widget.js")
			.headers(headers_32),
            http("request_45")
			.get(uri13 + "/styles/omni-chat-widget.css")
			.headers(headers_32),
            http("request_46")
			.get(uri15 + "/import-map-overrides@1.14.6/dist/import-map-overrides.js")
			.headers(headers_32),
            http("request_47")
			.get(uri15 + "/systemjs@6.3.1/dist/system.min.js")
			.headers(headers_32),
            http("request_48")
			.get(uri15 + "/systemjs@6.3.1/dist/extras/amd.min.js")
			.headers(headers_32),
            http("request_49")
			.get(uri15 + "/systemjs@6.3.1/dist/extras/named-exports.min.js")
			.headers(headers_32),
            http("request_50")
			.get(uri15 + "/core-js-bundle@3.6.5/minified.min.js")
			.headers(headers_32),
            http("request_51")
			.get(uri12 + "/global-this")
			.headers(headers_3),
            http("request_52")
			.get("/ecp-root-config.js")
			.headers(headers_20),
            http("request_53")
			.get(uri15 + "/single-spa@5.5.0/lib/system/single-spa.min.js")
			.headers(headers_34),
            http("request_54")
			.get("/microproduct/user-management-ui-service.default.svc.cluster.local/main.js")
			.headers(headers_20),
            http("request_55")
			.get("/microproduct/user-management-ui-service.default.svc.cluster.local/micro-interaction-icons.woff")
			.headers(headers_25),
            http("request_56")
			.get(uri05 + "/.well-known/openid-configuration")
			.headers(headers_27),
            http("request_57")
			.get(uri05 + "/pf/JWKS")
			.headers(headers_27),
            http("request_58")
			.get(uri04 + "/?Q_ZID=ZN_elYUf0UpLzmy0bI")
			.headers(headers_3),
            http("request_59")
			.get(uri07 + "/dxjsmodule/11.50cce3eb2b28e5784da7.chunk.js?Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web&Q_BRANDID=stage-clinical.optum.com")
			.headers(headers_3),
            http("request_60")
			.post(uri07 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_60)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/"),
            http("request_61")
			.post(uri05 + "/as/token.oauth2")
			.headers(headers_27)
			.formParam("grant_type", "authorization_code")
			.formParam("code", "N_NhndUxpjFMkpLiDlJDYA6GeVunM_dKWmcAAAEx")
			.formParam("redirect_uri", "https://stage-clinical.optum.com")
			.formParam("code_verifier", "bDJPZjRyVjczLTdDUmFSRzFjeHczbHpKa3poU29nenVKWEJfOGMzR0ZuYU1W")
			.formParam("client_id", "Reg3Stg_ECP")
			.formParam("client_secret", "QQ8C0orMt8hgwiobotPjVm2oFzm3orxp6gRB6vwZGhbBXAscB41GBwsg4ztbCQVX")
			.formParam("acr_values", "R3_AAL2_RBA_EXT_INT"),
            http("request_62")
			.get("/microproduct/user-management-ui-service.default.svc.cluster.local/assets/images/optum-logo.png")
			.headers(headers_24),
            http("request_63")
			.post(uri07 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_60)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/login"),
            http("request_64")
			.options(uri09 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPWVicmVzbGluLENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoiZWJyZXNsaW4iLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDA5OTU3Mn0.kn49glIsOhg5MOcV1IClJGwSH6yiN46MP_XTS59WTCggDkknEXyEoZF5YbJN4eicmd-8R417PBFmxEYJIh0O1y5aExz-RiPmmVmRpLc0GzMJPGIvDkoKx4VzhQV_41__edlXzqd3gtMZM6r5eHa3tE1gpMph7g_Y1NqghtVDhvCZ5eJ542SwVLgIgy2CRnvjyn97BZz0bGKcyWJNOYpGO49LziEEubGs03pX9uezJ-6TvA2TTrbn5yPrtoKexvunlNmNyH9SjYQaouXRxxw_OJSvDf68RU9UodcHYwIj-k5yXYXK6MW8xJj4yG6U74MaEHhaEzjCTiJ0Odkna98_Jw&org=obh_advc&role=crisis_ca")
			.headers(headers_64),
            http("request_65")
			.post(uri09 + "/auth/oauth/token?grant_type=password&source=msid&client_secret=ecp_platform&client_id=ecp_platform&access=eyJhbGciOiJSUzI1NiIsImtpZCI6IjEiLCJwaS5hdG0iOiJodzhuIn0.eyJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUiLCJjbGllbnRfaWQiOiJSZWczU3RnX0VDUCIsImlzcyI6Imh0dHBzOi8vYXV0aGdhdGV3YXkxLXN0Zy5lbnRpYW0udWhnLmNvbSIsImFjciI6IlIzX0FBTDJfUkJBX0VYVF9JTlQiLCJtZWRleGVtcGxveWVlSUQiOiJub3QtbWVkZXgtdXNlciIsInN1YiI6IkNOPWVicmVzbGluLENOPVVzZXJzLERDPW1zLERDPWRzLERDPXVoYyxEQz1jb20iLCJtZWRleGxhc3ROYW1lIjoibm90LW1lZGV4LXVzZXIiLCJtZWRleGVtYWlsIjoibm90LW1lZGV4LXVzZXIiLCJ4LWhhc3VyYS11c2VyLWlkIjoiZWJyZXNsaW4iLCJtZWRleGZpcnN0TmFtZSI6Im5vdC1tZWRleC11c2VyIiwibWVkZXhpZCI6Im5vdC1tZWRleC11c2VyIiwieC1oYXN1cmEtYWxsb3dlZC1yb2xlcyI6Ik5vIEdyb3VwcyIsImV4cCI6MTYzMDA5OTU3Mn0.kn49glIsOhg5MOcV1IClJGwSH6yiN46MP_XTS59WTCggDkknEXyEoZF5YbJN4eicmd-8R417PBFmxEYJIh0O1y5aExz-RiPmmVmRpLc0GzMJPGIvDkoKx4VzhQV_41__edlXzqd3gtMZM6r5eHa3tE1gpMph7g_Y1NqghtVDhvCZ5eJ542SwVLgIgy2CRnvjyn97BZz0bGKcyWJNOYpGO49LziEEubGs03pX9uezJ-6TvA2TTrbn5yPrtoKexvunlNmNyH9SjYQaouXRxxw_OJSvDf68RU9UodcHYwIj-k5yXYXK6MW8xJj4yG6U74MaEHhaEzjCTiJ0Odkna98_Jw&org=obh_advc&role=crisis_ca")
			.headers(headers_65)
			//.body(ElFileBody("0065_request.json")),
			.body(ElFileBody("resources/ssotoocm/0065_request.json")),
            http("request_66")
			.options(uri09 + "/user/v1/graphql")
			.headers(headers_66),
            http("request_67")
			.options(uri09 + "/user/v1/graphql")
			.headers(headers_66),
            http("request_68")
			.post(uri09 + "/user/v1/graphql")
			.headers(headers_68)
			.body(ElFileBody("resources/ssotoocm/0068_request.txt")),
            http("request_69")
			.post(uri09 + "/user/v1/graphql")
			.headers(headers_68)
			.body(ElFileBody("resources/ssotoocm/0069_request.txt")),
            http("request_70")
			.post("/rootconfig")
			.headers(headers_70)
			.body(ElFileBody("resources/ssotoocm/0070_request.json")),
            http("request_71")
			.post(uri09 + "/user/v1/graphql")
			.headers(headers_68)
			.body(ElFileBody("resources/ssotoocm/0071_request.txt")),
            http("request_72")
			.post(uri07 + "/WRSiteInterceptEngine/Targeting.php?Q_ZoneID=ZN_elYUf0UpLzmy0bI&Q_CLIENTVERSION=1.59.0&Q_CLIENTTYPE=web")
			.headers(headers_60)
			.formParam("Q_LOC", "https://stage-clinical.optum.com/crisis?source=msid&appl_nm=crisis_support&role=crisis_ca&org=obh_advc&params=Zmlyc3ROYW1lPUpFU1NJQ0EmbGFzdE5hbWU9Q0FTSCZkYXRlT2ZCaXJ0aD0yMDA1LTAyLTA5JnN1YnNjcmliZXJJZD0wMDA5ODY0ODQ4NA%3D%3D"),
            http("request_73")
			.get("/microproduct/crisis-support-ui-service.crisis-support.svc.cluster.local/ecp-crisis-support-ui.js")
			.headers(headers_20),
            http("request_74")
			.get(uri15 + "/react@16.13.1/umd/react.production.min.js")
			.headers(headers_9),
            http("request_75")
			.get(uri15 + "/react-dom@16.13.1/umd/react-dom.production.min.js")
			.headers(headers_9),
            http("request_76") .post(uri09 + "/auth/oauth/token") .headers(headers_76)
			.formParam("grant_type", "client_credentials")
			.formParam("client_id", "crisis_client")
			.formParam("client_secret", "oVzyCAgVEJc61jBtk93Q"),
            http("request_77") .options(uri09 + "/provnew/v1/graphql") .headers(headers_77),
            http("request_78") .options(uri09 + "/member-search/graphql") .headers(headers_77),
            http("request_79") .post(uri09 + "/provnew/v1/graphql") .headers(headers_79) .body(ElFileBody("resources/ssotoocm/0079_request.json")),
            http("request_80") .post(uri09 + "/member-search/graphql") .headers(headers_80) .body(ElFileBody("resources/ssotoocm/0080_request.json")),
            http("request_81") .get(uri08 + "?address=53+Ogrady+Rd++Marlborough,+MA+01752-7802&key=AIzaSyAdLczqmIB8mu9yYJvCbTXRSFItLNVdXz4") .headers(headers_81),
            http("request_82") .post(uri09 + "/provnew/v1/graphql") .headers(headers_79) .body(ElFileBody("resources/ssotoocm/0082_request.json")),
            http("request_83") .post(uri09 + "/provnew/v1/graphql") .headers(headers_79) .body(ElFileBody("resources/ssotoocm/0083_request.json")),
            http("request_84") .options(uri11) .headers(headers_84),
            http("request_85") .get(uri11) .headers(headers_76) .basicAuth("admin","rGbKzixPsMb0CgvBs1tu!")))
		//.pause(529)
		.exec(http("request_86") .get(uri08 + "?address=6379+dellwood+drive+fridley,+Minnesota,+&key=AIzaSyAdLczqmIB8mu9yYJvCbTXRSFItLNVdXz4") .headers(headers_81)
			.resources(http("request_87")
			.post(uri09 + "/provnew/v1/graphql")
			.headers(headers_79)
			.body(ElFileBody("resources/ssotoocm/0087_request.json")),
            http("request_88")
			.post(uri09 + "/provnew/v1/graphql")
			.headers(headers_79)
			.body(ElFileBody("resources/ssotoocm/0088_request.json"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
