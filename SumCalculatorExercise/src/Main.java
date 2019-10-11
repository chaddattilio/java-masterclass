public class Main {

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(5.0);
        calc.setSecondNumber(4);
        System.out.println("add=" + calc.getAdditionResult());
        System.out.println("subtract=" + calc.getSubtractionResult());

        calc.setFirstNumber(5.25);
        calc.setSecondNumber(0);

        System.out.println("multiply=" + calc.getMultiplicationResult());
        System.out.println("divide=" + calc.getDivisionResult());
    }

}
