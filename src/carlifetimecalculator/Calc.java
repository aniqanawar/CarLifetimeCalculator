
package carlifetimecalculator;

/**
 *
 * @author aniqanawar
 */
public class Calc {
    public double calcAnswer(double hprice, double hfuel, 
            double lprice, double lfuel){
       
        double answer;
        answer = (lprice-hprice)/(hfuel-lfuel);
        return answer;
}
}
