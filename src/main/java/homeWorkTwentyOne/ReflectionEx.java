package homeWorkTwentyOne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class ReflectionEx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calculator calculator = new Calculator();
        Class<?> calculatorClass = calculator.getClass();
        Method[] methods = calculatorClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Method addMethod = calculatorClass.getMethod("add", int.class, int.class);
        Object result = addMethod.invoke(calculator, 5, 10);
        System.out.println(result);
    }
}