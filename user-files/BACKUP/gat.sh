#
# Can be used from any directory to start a gatling job
# Sets defaults for command-line parameters
#
clear

	while getopts "g:s:r:i:h:n:" opt
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
     		esac
	done

	let a=1
	
	while  [ $a -le $SIMULATIONS ] ;do

		echo "**********************************************"
		read -p "Enter users for SIMULATION_$a:" FOO
		echo "**********************************************"
		echo "SIMULATION_$a: $FOO users"
		echo "**********************************************"
		let SIMULATION_$a=$FOO
		let a+=1
	done

#	for SIMULATION in $SIMULATIONS;do
#		echo "*********"
#		echo "simulations: $SIMULATIONS"
#		echo "simulation: $SIMULATION"
#		echo "HERE"	
#		let SIMULATION_$i=$SIMULATION
#      		echo simulation_$i
#		echo "a:" $a
#		echo "*********"
#		let a=a+1
#	done

	if [[ -z $SIMULATION_4 ]]; then
		let SIMULATION_4=0 
	fi

	if [[ -z $GATLING_HOME ]]; then
		GATLING_HOME='/Applications/gatling-charts-highcharts-bundle-3.5.1/'
	fi

	if [[ -z $SIMULATIONS ]]; then
		SIMULATION_1=1
		SIMULATION_2=0
		SIMULATION_3=0
		SIMULATION_4=0
	fi

	if [[ -z $ITERATIONS ]]; then
		ITERATIONS=10
	fi

	if [[ -z $RAMP ]]; then
		RAMP=1
	fi

	if [[ -z $HOST ]]; then
		HOST='ec2-54-74-168-205.eu-west-1.compute.amazonaws.com:8080'
	fi

	if [[ -z $SCENARIO ]]; then
		SCENARIO=Optum.Framework.OptumSim
	fi

	export SCENARIO
	export HOST
	export ITERATIONS
	export RAMP
	export SIMULATION_1
	export SIMULATION_2
	export SIMULATION_3
	export SIMULATION_4
	export GATLING_HOME

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
	echo "SIMULATION_1:" $SIMULATION_1
	echo "SIMULATION_2:" $SIMULATION_2
	echo "SIMULATION_3:" $SIMULATION_3
	echo "SIMULATION_4:" $SIMULATION_4
	echo "GATLING_HOME" $GATLING_HOME
	echo "Output Directory:" $RF
	echo "RESULT_LABEL" $RESULT_LABEL
	echo "========================"

JAVA_OPTS="-DHOST=$HOST -DITERATIONS=$ITERATIONS -DRAMP=$RAMP -DSIMULATION_1=$SIMULATION_1 -DSIMULATION_2=$SIMULATION_2 -DSIMULATION_3=$SIMULATION_3 -DSIMULATION_4=$SIMULATION_4" $GATLING_HOME/bin/gatling.sh  -s $SCENARIO -rd $RESULT_LABEL -rf $GATLING_HOME/results/$ON
