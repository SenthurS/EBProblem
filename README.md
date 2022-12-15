The Edison energy company introduces a new slab based electricity tariff for its consumers. Below is the new slab based tariff:

Units	Price (per unit)
1 to 50	3
51 to 100	5
101 to 250	7
251 and Above	10 

Appliance code	Appliance	Energy Consumed in Watts per hour
RFG	Refrigerator	200
TV	TV	200
COM	Computer	200
MUS	Music System	1000
AC	A/C	700
WAS	Washing M/C	200
HEA	Water Heater	800
FAN	Fans	50
TL	Tube Lights	50
CFL	CFL Lights	25

The application should take in only the appliances that are mentioned in the list above.

Input: 
•	Number of appliances (n)
•	Appliance code (comma separated n appliance codes)
•	Usage in hours (comma separated n numbers)
Output:
•	Consumption per appliance
•	Total consumption
•	Total tariff

Additional details: 
•	1 unit = 1kW

Sample input:
Enter number of appliances: 5
Enter appliance codes (comma separated) : RFG, TV, COM, MUS, AC
Enter usage in hours (comma separated) : 10,20,30,35.5, 50

Sample output:
Consumption per appliance: 
Refrigerator	: 2 units
TV		: 4 units
Computer	: 6 units
Music system	: 35.5 units 
A/C		: 35 units

Total consumption	: 82.5 units
Total tariff		: 312.5
