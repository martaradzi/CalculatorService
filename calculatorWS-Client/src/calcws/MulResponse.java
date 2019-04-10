
package calcws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mulReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mulReturn"
})
@XmlRootElement(name = "mulResponse")
public class MulResponse {

    protected double mulReturn;

    /**
     * Gets the value of the mulReturn property.
     * 
     */
    public double getMulReturn() {
        return mulReturn;
    }

    /**
     * Sets the value of the mulReturn property.
     * 
     */
    public void setMulReturn(double value) {
        this.mulReturn = value;
    }

}
