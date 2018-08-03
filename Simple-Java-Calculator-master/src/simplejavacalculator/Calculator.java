package simplejavacalculator;

//import static java.lang.Math.log;
import java.lang.*;
import static java.lang.Math.log10;
import static java.lang.Math.pow;



public class Calculator {
    public enum BiOperatorModes {
        normal, add, minus, multiply, divide , xpowerofy,nPr,nCr 
    }

    public enum MonoOperatorModes {
        square, squareRoot, butDivideOne, cos, sin, tan ,log , rate ,fact,PowerOfTen
    }

    private  Double num1, num2;
    private BiOperatorModes mode = BiOperatorModes.normal;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.normal) {
            return num2;
        }
        if (mode == BiOperatorModes.add) {
            return num1 + num2;
        }
        if (mode == BiOperatorModes.minus) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.multiply) {
            return num1 * num2;
        }
        if (mode == BiOperatorModes.divide) {
            return num1 / num2;
        }
        if (mode == BiOperatorModes.xpowerofy) {
            return pow(num1,num2);
        }
        
        if (mode == BiOperatorModes.nPr) {
            int i;
            double factNum1=1,numFact,factNum2=1;
            numFact = num1 - num2;
            for (i = 1; i <= num1; i++) {
                factNum1 = factNum1 * i;
            }
            for (i = 1; i <= numFact; i++) {
                factNum2 = factNum2 * i;
            }
            
            return factNum1/factNum2;
        }
        
        if (mode == BiOperatorModes.nCr) {
            int i;
            double factNum1=1,numFact,factNum2=1,factNumSub=1;
            numFact = num1 - num2;
            for (i = 1; i <= num1; i++) {
                factNum1 = factNum1 * i;
            }
            for (i = 1; i <= numFact; i++) {
                factNumSub = factNumSub * i;
            }
            for (i = 1; i <= num2; i++) {
                factNum2 = factNum2 * i;
            }
            
            return factNum1/(factNum2*factNumSub);
        }

        // never reach
        throw new Error();
    }

    public Double calculateBi(BiOperatorModes newMode, Double num) {
        if (mode == BiOperatorModes.normal) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return Double.NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }

    public Double calculateEqual(Double num) {
        return calculateBi(BiOperatorModes.normal, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.normal;

        return Double.NaN;
    }

    public Double calculateMono(MonoOperatorModes newMode, Double num) {
        if (newMode == MonoOperatorModes.square) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.squareRoot) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.PowerOfTen) {
            System.out.println(pow(10,num));
            return pow(10,num);
        }
        if (newMode == MonoOperatorModes.cos) {
            
            return Math.round((Math.cos(Math.toRadians(num)))* 100.0) / 100.0;
        }
        if (newMode == MonoOperatorModes.sin) {
            return Math.round((Math.sin(Math.toRadians(num))) * 100.0) / 100.0;
        }
        if (newMode == MonoOperatorModes.tan) {
            return Math.round((Math.tan(Math.toRadians(num)))* 100.0) / 100.0;
        }
        if (newMode == MonoOperatorModes.log) {
            return log10(num);
        }
        if (newMode == MonoOperatorModes.rate) {
           return num / 100;
        }
        if (newMode == MonoOperatorModes.fact) {
            int i;
            double fact=1;
            for (i = 1; i <= num; i++) {
                fact = fact * i;
            }
           return fact;
        }
        if (newMode == MonoOperatorModes.butDivideOne) {
           return 1/num ;
        }


        // never reach
        throw new Error();
    }

}
