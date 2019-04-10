package calcws;

import javax.xml.ws.Endpoint;

public class CalcPublisher {
 
    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new CalculatorImpl());
        ep.publish("http://localhost:8889/calculatorWS/services/CalculatorImpl");
        	System.out.printf("Done.\n");
    }
}