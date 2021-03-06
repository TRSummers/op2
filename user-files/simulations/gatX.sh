#
# Can be used from any directory to start a gatling job
# Sets defaults for command-line parameters
#
#clear

	while getopts "c:g:s:r:i:h:n:x:y:z:" opt
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
     		esac
	done

		
	if [[ -z $GATLING_HOME ]]; then
		GATLING_HOME='/Applications/gatling-charts-highcharts-bundle-3.5.1/'
	fi

#	if [[ -z $SIMULATIONS ]]; then
#		SIMULATION_1=1
#		SIMULATION_2=0
#		SIMULATION_3=0
#	fi


#	if [[ -z $SIMULATION_1 ]]; then
#		SIMULATION_1=0
#	fi

#	if [[ -z $SIMULATION_2 ]]; then
#		SIMULATION_2=0
#	fi

#	if [[ -z $SIMULATION_3 ]]; then
#		SIMULATION_3=0
#	fi

#	if [[ -z $ITERATIONS ]]; then
#		ITERATIONS=5
#	fi

#	if [[ -z $RAMP ]]; then
#		RAMP=10
#	fi

	if [[ -z $HOST ]]; then
		#HOST='ec2-54-74-168-205.eu-west-1.compute.amazonaws.com:8080'
		HOST=localhost
	fi

	if [[ -z $SCENARIO ]]; then
		SCENARIO=BO.Framework.BOSim
	fi

	export SCENARIO
	export HOST
	export ITERATIONS
	export RAMP
	export SIMULATION_1
	export SIMULATION_2
	export SIMULATION_3
	export GATLING_HOME

# RESULT_LABEL will be added to the Gatling Report. It will aid in the identification of the test
	RESULT_LABEL=$SCENARIO-SIMULATION_1_$SIMULATION_1:SIMULATION_2_$SIMULATION_2:SIMULATION_3_$SIMULATION_3:Iterations_$ITERATIONS

# ON is a Gatling parameter. It will indicate the ouptput directory, making it much easier to tell which test it is
	ON=`date +%m-%d-%y-%H:%M:%S`

        echo "=============================================================================================="
	echo "HERE WE GO"
#	echo "HERE WE ARE:" $PWD
#	echo "G_Frame:" $GATLING_HOME
#	echo "SCENARIO:" $SCENARIO
#	echo "HOST:" $HOST
#	echo "ITERATIONS:" $ITERATIONS
#	echo "RAMP:" $RAMP
#	echo "SIMULATION_1:" $SIMULATION_1
#	echo "SIMULATION_2:" $SIMULATION_2
#	echo "SIMULATION_3:" $SIMULATION_3
#	echo "GATLING_HOME" $GATLING_HOME
#	echo "Output Directory:" $RF
	echo "RESULT_LABEL" $RESULT_LABEL
        echo "=============================================================================================="

JAVA_OPTS="-DHOST=$HOST -DITERATIONS=$ITERATIONS -DRAMP=$RAMP -DSIMULATION_1=$SIMULATION_1 -DSIMULATION_2=$SIMULATION_2 -DSIMULATION_3=$SIMULATION_3 -DCV=$CV" $GATLING_HOME/bin/gatling.sh  -s $SCENARIO -rd $RESULT_LABEL -rf $GATLING_HOME/results/$ON

