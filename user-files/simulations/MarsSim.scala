package MarsTest.Framework

import scala.io.Source
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
import io.gatling.commons.validation._
import org.apache.commons._

class MarsSim extends Simulation {

        val ITR = System.getenv("ITERATIONS").toInt
        val RAMP = System.getenv("RAMP").toInt
        val Users_1 = System.getenv("SIMULATION_1").toInt
        val Users_2 = System.getenv("SIMULATION_2").toInt
        val Users_3 = System.getenv("SIMULATION_3").toInt
	val API = System.getenv("API").toInt

  val HttpProtocol = http
    .baseUrl("https://md-star-api-coho-qa.ocp-ctc-core-nonprod.optum.com/api/v1/")
    .acceptHeader("application/json;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")

//scen_2.inject(rampUsers(Users_2) during (RAMP seconds)),

	//printf("FOO: %s\n", API);

val scen = API match {
    case 1  => "MarsTestApi1"
    case 2  => "February"
    case 3  => "March"
    case 4  => "April"
    case 5  => "May"
    case 6  => "June"
    case 7  => "July"
    case 8  => "August"
    case 9  => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _  => "Invalid month"  // the default, catch-all
}

	if (API == 0){
		setUp(MarsTestScenario.MarsTestALL.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
	}

	else{
		if (API == 1){
			printf("BAR: %s\n", API);
			setUp(MarsTestScenario.MarsTestApi1.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
		}
		else{
			if (API == 2){
				printf("BAR: %s\n", API);
				setUp(MarsTestScenario.MarsTestApi2.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
			}
			else{
				if (API == 3){
					printf("BAR: %s\n", API);
					setUp(MarsTestScenario.MarsTestApi3.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
				}
				else{
					if (API == 4){
						printf("BAR: %s\n", API);
						setUp(MarsTestScenario.MarsTestApi4.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
					}
					else{
						if (API == 5){
							printf("BAR: %s\n", API);
							setUp(MarsTestScenario.MarsTestApi5.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
						}
						else{
							if (API == 6){
								printf("BAR: %s\n", API);
								setUp(MarsTestScenario.MarsTestApi6.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
							}
							else{
								if (API == 7){
									printf("BAR: %s\n", API);
									setUp(MarsTestScenario.MarsTestApi7.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
								}
								else{
									if (API == 8){
										printf("BAR: %s\n", API);
										setUp(MarsTestScenario.MarsTestApi8.inject(rampUsers(Users_1) during (RAMP)).protocols(HttpProtocol))
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
