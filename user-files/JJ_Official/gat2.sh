#
# Can be used from any directory to start a gatling job
# Sets defaults for command-line parameters
#
#clear

	while getopts "c:g:s:r:i:h:n:" opt
   	do
     		case $opt in
        		c ) CV=$OPTARG
				;;
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
     		esac
	done

	let a=1

	if [[ $CV = "c" ]]; then
		echo "**********************************************"
		echo ""
		echo "cv is $CV"
		echo ""
		echo "**********************************************"
		elif [[ $CV = "v" ]]; then
		echo "**********************************************"
		echo " "
		echo "cv is $CV"
		echo " "
		echo "**********************************************"
		echo "**********************************************"
	fi
		
	while  [ $a -le $SIMULATIONS ]; do

		echo "**********************************************"
		echo " "
		read -p "Enter users for SIMULATION_$a:" FOO
		echo " "
		#echo "**********************************************"
		echo " "
		echo "SIMULATION_$a: $FOO users"
		echo " "
		echo "**********************************************"
		let SIMULATION_$a=$FOO
		let a+=1
	done


	if [[ -z $GATLING_HOME ]]; then
		GATLING_HOME='/Applications/gatling-charts-highcharts-bundle-3.5.1/'
	fi

	if [[ -z $SIMULATIONS ]]; then
		SIMULATION_1=1
		SIMULATION_2=0
		SIMULATION_3=0
	fi

	if [[ -z $SIMULATION_1 ]]; then
		SIMULATION_1=0
	fi

	if [[ -z $SIMULATION_2 ]]; then
		SIMULATION_2=0
	fi

	if [[ -z $SIMULATION_3 ]]; then
		SIMULATION_3=0
	fi

	if [[ -z $ITERATIONS ]]; then
		ITERATIONS=5
	fi

	if [[ -z $RAMP ]]; then
		RAMP=10
	fi

	if [[ -z $HOST ]]; then
		HOST='ec2-54-74-168-205.eu-west-1.compute.amazonaws.com:8080'
	fi

	if [[ -z $SCENARIO ]]; then
		SCENARIO=JJ.Framework.JJSim
	fi

	export SCENARIO
	export HOST
	export ITERATIONS
	export RAMP
	export SIMULATION_1
	export SIMULATION_2
	export SIMULATION_3
	export GATLING_HOME
	export CV

# RESULT_LABEL will be added to the Gatling Report. It will aid in the identification of the test
	RESULT_LABEL=$SCENARIO-SIMULATION_1_$SIMULATION_1:SIMULATION_2_$SIMULATION_2:SIMULATION_3_$SIMULATION_3:SIMULATION_4_$SIMULATION_4:Iterations_$ITERATIONS

# ON is a Gatling parameter. It will indicate the ouptput directory, making it much easier to tell which test it is
	ON=`date +%m-%d-%y-%H:%M:%S`

	echo "========================"
	echo "HERE WE ARE:" $PWD
	echo "G_Frame:" $GATLING_HOME
	echo "SCENARIO:" $SCENARIO
	echo "HOST:" $HOST
	echo "ITERATIONS:" $ITERATIONS
	echo "RAMP:" $RAMP
	echo "CV:" $CV
	echo "SIMULATION_1:" $SIMULATION_1
	echo "SIMULATION_2:" $SIMULATION_2
	echo "SIMULATION_3:" $SIMULATION_3
	echo "GATLING_HOME" $GATLING_HOME
	echo "Output Directory:" $RF
	echo "RESULT_LABEL" $RESULT_LABEL
	echo "========================"

JAVA_OPTS="-DHOST=$HOST -DITERATIONS=$ITERATIONS -DRAMP=$RAMP -DSIMULATION_1=$SIMULATION_1 -DSIMULATION_2=$SIMULATION_2 -DSIMULATION_3=$SIMULATION_3 -DCV=$CV" $GATLING_HOME/bin/gatling.sh  -s $SCENARIO -rd $RESULT_LABEL -rf $GATLING_HOME/results/$ON

#JAVA_OPTS="-DHOST=$HOST -DITERATIONS=$ITERATIONS -DRAMP=$RAMP -DSIMULATION_1=$SIMULATION_1 -DSIMULATION_2=$SIMULATION_2 -DSIMULATION_3=$SIMULATION_3 -DSIMULATION_4=$SIMULATION_4" $GATLING_HOME/bin/gatling.sh  -s $SCENARIO -rd $RESULT_LABEL -rf $GATLING_HOME/results/$ON
