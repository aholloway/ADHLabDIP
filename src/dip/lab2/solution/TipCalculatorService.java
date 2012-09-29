
package dip.lab2.solution;

import java.util.Set;

/**
 *
 * @author AHolloway
 */
public class TipCalculatorService{
    //has a TipCaluclator strategy.  This makes individual Calculators interchangeable
    //which decreases program ridgidity.  For instance, we can remove TipCalculatorStrategy
    //and it would not affect this class.
    private TipCalculatorStrategy tipCalculatorStrategy;
    private final String NULL_STRATEGY_ERROR = "Error: Tip Calculator strategy may not be null.";


    
//    public TipCalculatorService(TipCalculatorStrategy tipCalculatorStrategy){
//        this.setTipCalculatorStrategy(tipCalculatorStrategy);
//        
//    }
//    
//    public final TipCalculatorStrategy getTipCalculatorStrategy() {
//        return tipCalculatorStrategy;
//    }
//
//    public final void setTipCalculatorStrategy(TipCalculatorStrategy tipCalculatorStrategy) {
//        if (tipCalculatorStrategy==null){
//            throw new IllegalArgumentException (NULL_STRATEGY_ERROR);
//        }
//        this.tipCalculatorStrategy = tipCalculatorStrategy;
//    }
    
    public final double getTip(TipCalculatorStrategy tipCalculatorStrategy){
        if (tipCalculatorStrategy==null){
            throw new IllegalArgumentException (NULL_STRATEGY_ERROR);
        }
        return tipCalculatorStrategy.getTip();
    }

    public final String getTypeOfService(TipCalculatorStrategy tipCalculatorStrategy){
        if (tipCalculatorStrategy==null){
            throw new IllegalArgumentException (NULL_STRATEGY_ERROR);
        }
        return tipCalculatorStrategy.getTypeOfService();
    }

    
    
    
    
    
}
