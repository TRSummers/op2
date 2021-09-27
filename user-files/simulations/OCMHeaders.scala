package OCM.Framework

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random


object OCMHeaders{
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


}

