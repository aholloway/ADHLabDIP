
package dip.lab2.solution;

import java.util.Set;

/**
 *
 * @author AHolloway
 */
public class TipCalculatorService {
    //has a TipCaluclator strategy.  This makes individual Calculators interchangeable
    //which decreases program ridgidity.  For instance, we can remove TipCalculatorStrategy
    //and it would not affect this class.
    private TipCalculatorStrategy tipCalculatorStrategy;
    private final String NULL_STRATEGY_ERROR = "Error: Tip Calculator strategy may not be null.";

    
    public TipCalculatorService(TipCalculatorStrategy tipCalculatorStrategy){
        this.setTipCalculatorStrategy(tipCalculatorStrategy);
        
    }
    
    public TipCalculatorStrategy getTipCalculatorStrategy() {
        return tipCalculatorStrategy;
    }

    public void setTipCalculatorStrategy(TipCalculatorStrategy tipCalculatorStrategy) {
        if (tipCalculatorStrategy==null){
            throw new IllegalArgumentException (NULL_STRATEGY_ERROR);
        }
        this.tipCalculatorStrategy = tipCalculatorStrategy;
    }
    
    public double getTip(){
        return tipCalculatorStrategy.getTip();
    }
    
    
    
}
