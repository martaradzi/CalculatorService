# SOAP Calculator

Simple calculator construced using SOAP protocol for the course Web Services and Cloud-Based Systems at UvA.

Calculator is able to:
* add
* substract
* multiply
* divide

Check report.pdf to see the description of the design and implementation of the calculator services as well as an idea of how to make the calculator stateful.

---
## How to deploy and run the client:

1. Put the calculatorWS.war file inside the apache-tomcat-8.5.39/webapps (or another version of tomcat server) folder and start the server in order to start the service.
2. Go to the calculatorWS-Client folder. The WSLD is located at the  ```http://localhost:8889/calculatorWS/services/CalculatorImpl?wsdl``` (the domain of the local host will be different depending othe address of the tomcat server) and it is used to generate the client.
3. Run ```wsimport -keep http://localhost:8889/calculatorWS/services/CalculatorImpl?wsdl``` (again update port's number)
4. Run ```./gradlew jar``` to build the .jar file. 
5. Now using the built jar run ```java -jar build/libs/CalculatorClient-0.1.0.jar``` The results of the operations will be shown in the output.
6. In the class called CalculatorClient.java the input for the operations can be modified.
