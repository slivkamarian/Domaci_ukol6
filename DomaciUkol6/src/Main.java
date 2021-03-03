public class Main {

    public static void main(String[] args) {
        // write your code here
        Double result;
        Calculator calc1 = new Calculator();
        result =calc1.calculate(5,2,Operations.ODECITANI);

        System.out.println(result);
    }
}