package dip.lab2.solution;

import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class. 3. Pass one of your
 * calculator instances to the high-level class and check the results. 4. Now
 * switch to a different calculator instance and pass that to the high-level
 * class. Did it work? Are the low-level instances interchangeable? The DIP
 * requires this.
 *
 * @author Drew Holloway
 */
public class Startup {

    

    public static void main(String[] args) {


        //configuration phase

        // Utility code to format the numbers as dollars
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Declare an instance of my high-level module
        TipCalculatorService tcs = new TipCalculatorService();

        //Instantiate BaggageServiceTipCalculator, with parameters
        // service quality and number of bags.
        BaggageServiceTipCalculator baggageService =
                new BaggageServiceTipCalculator(
                ServiceQualityEnum.ServiceQuality.FAIR, 5);

        //Instantiate FoodServiceTipCalculator, with parameters
        // service quality and bill amount.
        FoodServiceTipCalculator foodService =
                new FoodServiceTipCalculator(
                ServiceQualityEnum.ServiceQuality.GOOD, 50);


        //create an array to hold my TipCalculatorStrategy objects
        //I will use polymorphism and the Liskov Substitution Principle
        // to be able to pass the objects to my higher level module
        // due to the fact that they implement an interface and thus
        // have the same functions with the same names.
        TipCalculatorStrategy tipCalcs[] = {baggageService, foodService};


        //loop through types of service and create nice output for the end user.
        for (int i = 0; i < tipCalcs.length; i++) {
            String message = "Tip for " + tcs.getTypeOfService(tipCalcs[i])
                    + ": " + nf.format(tcs.getTip(tipCalcs[i]));
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
