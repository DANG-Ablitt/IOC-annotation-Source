package ioc.ann.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class CalculatorClass implements Calculator {

    /**
     * 加法的实现
     */
    @Override
    public int addition(int i, int j) {
        return i+j;
    }

    /**
     * 减法的实现
     */
    @Override
    public int Subtraction(int i, int j) {
        return i-j;
    }

    /**
     * Main方法
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CalculatorClass.class);
        System.out.print(ctx.getBean(CalculatorClass.class));
    }
}
