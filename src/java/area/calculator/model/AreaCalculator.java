 
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
    
}
