public class Calculator {

    Operations operations;

    public Double calculate(int operand1, int operand2, Operations operations){
        double result = 0;
        switch (operations){
            case SCITANI -> result = operand1 + operand2;
            case ODECITANI -> result = operand1 - operand2;
            case NASOBENI -> result = operand1 * operand2;
            case DELENI -> result = operand1/ operand2;

        }
        return result;

    }
}