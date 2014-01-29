 
package area.calculator.model;

import java.text.DecimalFormat;

/**
 * @author Machi
 */
public class AreaCalculator {
    
    DecimalFormat df = new DecimalFormat("#0.00");
    
//    private double width;
//    private double length;
    
    
    public AreaCalculator() {}
    
    public String calculateArea(double width, double height){
	if (width <= 0 || height <= 0) {
	    throw new NullPointerException("Please insert dimensions");	
	}
	double area = width * height;
	return df.format(area);
    
    }
    
    public String getUnit (String unit) {
	
	String u = null;
	switch (unit) {
	    case "inches":
		u = "inches";
		break;
	    case "feet":
		u = "feet";
		break;
	    case "yards":
		u = "yards";
		break;
	    case "centimeters":
		u = "centimeters";
		break;
	    case "meters":
		u = "meters";
		break;
	}
	
		return u;
	}
   
    
}
