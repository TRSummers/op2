#!/bin/bash
  
clear
#
# Setting global variables
#
#i=1


echo "================================="
echo "Log or Console?"
echo "================================="
echo
read -p "Enter L or C: " x

if [[ $x = c ]]; then
        cp /Applications/gatling-charts-highcharts-bundle-3.5.1/conf/logback.xml.CONSOLE /Applications/gatling-charts-highcharts-bundle-3.5.1/conf/logback.xml
else
        cp /Applications/gatling-charts-highcharts-bundle-3.5.1/conf/logback.FILE.GOOD /Applications/gatling-charts-highcharts-bundle-3.5.1/conf/logback.xml
fi

cat /Applications/gatling-charts-highcharts-bundle-3.5.1/conf/logback.xml

