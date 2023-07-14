public class ScientificCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        return super.add(a, b) * 2;
    }
}
