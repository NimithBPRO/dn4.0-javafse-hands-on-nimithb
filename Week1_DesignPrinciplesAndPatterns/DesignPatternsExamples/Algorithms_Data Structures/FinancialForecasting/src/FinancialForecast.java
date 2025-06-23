
public class FinancialForecast {
    
    public static double futureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return futureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; 
        int periods = 5;

        double result = futureValue(presentValue, growthRate, periods);
        System.out.printf("Future value after %d periods: %.2f\n", periods, result);
    }
}