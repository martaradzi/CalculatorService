package calcws;

import javax.jws.WebService;
import javax.jws.WebParam;

@WebService(endpointInterface = "calcws.CalculatorI")
public class CalculatorImpl implements CalculatorI {

        @Override
        public double add(@WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
            return a+ b;
        }

        @Override
        public double sub(@WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
            return a - b;
        }

        @Override
        public double mul(@WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
            return a * b;
        }

        @Override
        public double div(@WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
            return a / b;
        }
}
