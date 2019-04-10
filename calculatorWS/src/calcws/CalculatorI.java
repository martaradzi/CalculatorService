package calcws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculatorI {

    @WebMethod
    public double add(double a, double b) ;

    @WebMethod
    public double sub(double a, double b);


    @WebMethod
    public double mul(double a, double b);

    @WebMethod
    public double div(double a, double b);

}
  