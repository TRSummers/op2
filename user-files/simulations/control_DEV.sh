#!/bin/bash

# Select which APIs to include in simulation	
getAPINames(){
	echo "api_name $api_name"
}

apis(){
	echo "==========================================="
	echo ""
	echo " To run all APIs, select 'A'"
	echo " To run a subset of APIs, enter the number of APIs you want to run."
	echo "A. All APIs"
	echo "1-9. Total number of APIs to run"
	echo "==========================================="
	read -p "apis: " api_name
	echo ""
		api_name=$(echo "$api_name" | tr '[:upper:]' '[:lower:]')

		if [[ $api_name != "a" ]];then
			getAPINames
		fi
	echo ""
	echo "To run individual APIs, select the API number"
	echo ""
	echo "Select which API to include in simulation"
	echo "1. SearchByMetaData"
	echo "2. GetAttachmentById"
	echo "3. GetDocumentById"
	echo "4. FindAllStates"
	echo "5. GetClusterByProviderType"
	echo "6. GetProviderAddress"
	echo "7. GetProviderName"
	echo "8. GetCensus"
	echo "9. findMemberLinxById"
	echo "==========================================="
	read -p "apis: " api_name
}

	TOTAL_SIMULATIONS=3

	clear

	echo "=============================="
	echo " Enter scenario number "
	echo " 1. BO.sim "
	echo " 2. Optum.sim "
	echo " 3. JJ.sim "
	echo " 4. MarsAPI.sim "
	echo "=============================="
	read -p "Enter scenario number: " scen
	
	case $scen in
		1)
			SCENARIO=BO.Framework.BOSim
			;;
		2)
			SCENARIO=Optum.Framework.OptumSim
			;;
		3)
			SCENARIO=JJ.Framework.JJSim
			;;
		4)
			SCENARIO=MarsTest.Framework.MarsSim
			apis			
			api_name=$(echo "$api_name" | tr '[:upper:]' '[:lower:]')
				case $api_name in
					[A,a])       
						echo "All"	
						API=0
						echo "API: $API"
					;;
					*)       
						echo "$api_name"	
						API=$api_name
						echo "$API"
					;;
				esac
			;;
	esac

	echo "SCENARIO: $SCENARIO"

	echo "=============================================================================================="
	echo 
	echo "Defaluts that can be overridden re as follows:"
	echo
	echo
	echo "Number of iterations.............1"
	echo "Ramp up time.................... 5 (seconds)"
	echo "Number of users for SIMULATION_1..1"
	echo "Number of users for SIMULATION_2..1"
	echo "Number of users for SIMULATION_3. 1"
	echo 
	echo "Defaults that currently cannot be overridden:"
	echo
	echo "HOST..............................ec2-54-74-168-205.eu-west-1.compute.amazonaws.com:8080"
	echo "GATLING_HOME....................../users/gatling-3.5.1/"
	echo 
	echo "=============================================================================================="
	echo "When prompted, enter D for defaults, as defined above or"
	echo "enter O and then enter override values as prompted. Case doesn't matter."
	echo
	echo "Defaults............D"
	echo "You will not prompted for further inupt."
	echo
	echo "Override values......O"
	echo ""
	echo "Note: If overriding defaults, you will be prompted to enter these values."
	echo
	echo "1. Iteratons"
	echo "2. Ramp"
	echo "3. Total number of simulations"
	echo "4. Number of users per simulation"
	echo
	echo "=============================================================================================="
	read -p "Enter D (Defult) or O (Override): " var

  	case  $var  in
		[D,d])       
			ramp=5
			iterations=5
			SIMULATION_1=1
			SIMULATION_2=1
			SIMULATION_3=1
			iterations=1
			TOTAL_SIMULATIONS=3
			ramp=5
			var="Default"
                    ;;

		[O,o])
			clear
			echo "How Many Iterations?"
			read -p  'Enter number: ' iterations 
			echo " "
			echo "Ramp up time"
			read -p  'Enter number: ' ramp
			echo " "
#			echo "How many simulations?"
#			read -p  'Enter number: ' TOTAL_SIMULATIONS 
			
			var="Override"

			SIM_NUMBER=1
			
#		        while  [ $SIM_NUMBER -le $TOTAL_SIMULATIONS ]; do
		        while  [ $SIM_NUMBER -le 3 ]; do

                		echo " "
                		read -p "Enter users for SIMULATIONS_$SIM_NUMBER:" USERS
                		echo "SIMULATION_$SIM_NUMBER: $USERS users"
			echo "=============================================================================================="
                		let SIMULATION_$SIM_NUMBER=$USERS
                		let SIM_NUMBER+=1

        		done
		    ;;
		esac 
		
		if [ -z $SIMULATION_2 ]; then
			SIMULATION_2=0
		fi

		if [ -z $SIMULATION_3 ]; then
			SIMULATION_3=0
		fi

		echo "=============================================================================================="
		echo
		echo "Running with the $var controls"
		echo
		echo "Iterations..............$iterations"
		echo "Ramp up time............$ramp (seconds)"
		echo
		echo "Users for Simulation_1...$SIMULATION_1"
		echo "Users for Simulation_2...$SIMULATION_2"
		echo "Users for Simulation_3...$SIMULATION_3"
		echo "=============================================================================================="
		read -p "Hit enter to continue" go

		./gatling.sh -i$iterations -r$ramp -s$TOTAL_SIMULATIONS -x$SIMULATION_1 -y$SIMULATION_2 -z$SIMULATION_3 -n$SCENARIO -a$API


