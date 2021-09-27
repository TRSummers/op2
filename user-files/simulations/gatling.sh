#
# Can be used from any directory to start a gatling job
# Sets defaults for command-line parameters
#

	while getopts "c:g:s:r:i:h:n:x:y:z:a:L:H:" opt
   	do
     		case $opt in
        		g ) GATLING_HOME=$OPTARG
				;;
        		s ) SIMULATIONS=$OPTARG
				;;
        		r ) RAMP=$OPTARG
				;;
        		i ) ITERATIONS=$OPTARG
				;;
        		h ) HOST=$OPTARG
				;;
        		n ) SCENARIO=$OPTARG
				;;
			x) SIMULATION_1=$OPTARG
				;;
			y) SIMULATION_2=$OPTARG
				;;
			z) SIMULATION_3=$OPTARG
				;;
			a) API=$OPTARG
				;;
			L) LOW=$OPTARG
				;;
			H) HIGH=$OPTARG
				;;
     		esac
	done

		
	if [[ -z $GATLING_HOME ]]; then
		GATLING_HOME='/Applications/gatling-charts-highcharts-bundle-3.5.1/'
	fi

	if [[ -z $HOST ]]; then
		#HOST='ec2-54-74-168-205.eu-west-1.compute.amazonaws.com:8080'
		HOST=localhost
	fi

	if [[ -z $SCENARIO ]]; then
		echo "=============================="
		echo " Enter scenario number "
		echo " 1. BO.sim "
		echo " 2. Optum.sim "
		echo " 3. JJ.sim "
		echo " 4. MarsTest.sim "
		echo " 4. StarTest.sim "
		echo "=============================="
		read -p	"Enter scenario number: " scen
	fi

	export SCENARIO
	export HOST
	export ITERATIONS
	export RAMP
	export LOW
	export HIGH
	export SIMULATION_1
	export SIMULATION_2
	export SIMULATION_3
	export API
	export GATLING_HOME

# RESULT_LABEL will be added to the Gatling Report. It will aid in the identification of the test

	RESULT_LABEL=$SCENARIO-SIMULATION_1_$SIMULATION_1:SIMULATION_2_$SIMULATION_2:SIMULATION_3_$SIMULATION_3:Iterations_$ITERATIONS

# ON is a Gatling parameter. It will indicate the ouptput directory, making it much easier to tell which test it is
	ON=`date +%m-%d-%y-%H:%M:%S`

        echo "=============================================================================================="
	echo "Here we go..."
	echo ""
	echo "Scenario: " $SCENARIO
	echo "RESULT_LABEL" $RESULT_LABEL
#	echo "API:" $API
	echo ""
        echo "=============================================================================================="

JAVA_OPTS="-DHOST=$HOST -DITERATIONS=$ITERATIONS -DRAMP=$RAMP -D$LOW -D$HIGH -DSIMULATION_1=$SIMULATION_1 -DSIMULATION_2=$SIMULATION_2 -DSIMULATION_3=$SIMULATION_3 -DCV=$CV -D$API" $GATLING_HOME/bin/gatling.sh  -s $SCENARIO -rd $RESULT_LABEL -rf $GATLING_HOME/results/$ON 

