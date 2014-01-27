 
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
    
    public String calculateArea(double width, double height) {
	double area = width * height;
	return df.format(area);
    
    }
    
}
