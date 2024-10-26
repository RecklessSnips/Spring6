package allAnnotation.AOP;

public class MyCalculator implements Calculator{
    /*
        如果直接使用了 new MyCalculator() 来创建 MyCalculator 实例。
        这种方式不会触发 Spring AOP，因为 AOP 代理是由 Spring 容器管理的，
        只有通过 Spring 容器获取的 bean 才会被 AOP 代理
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
//        if(b != 0){
//            return a / b;
//        }
//        throw new ArithmeticException("Cannot divide by 0");
        try{
            return a / b;
        }catch (ArithmeticException arithmeticException){
            throw new ArithmeticException("Cannot divide by 0");
        }
    }
}
