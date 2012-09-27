package dip.lab2.solution;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
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
 * @author your name goes here
 */
public class Startup {

    public static enum ServiceQuality {

        GOOD, FAIR, POOR
    };

    public static void main(String[] args) {


        //configuration phase

        //pass in service class and number of bags.
        BaggageServiceTipCalculator baggageService =
                new BaggageServiceTipCalculator(
                BaggageServiceTipCalculator.ServiceQuality.FAIR, 5);

        //pass in food service quality and bill amount
        FoodServiceTipCalculator foodService =
                new FoodServiceTipCalculator(
                FoodServiceTipCalculator.ServiceQuality.GOOD, 50);


        //use loop and polymorphism
        TipCalculatorStrategy tipCalcs[] = {baggageService, foodService};

        for (int i = 0; i < tipCalcs.length; i++) {
            System.out.println("Tip for service " + (i + 1) + ": " + tipCalcs[i].getTip());
        }



    }
}
