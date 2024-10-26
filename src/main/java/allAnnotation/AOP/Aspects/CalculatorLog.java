package allAnnotation.AOP.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLog {
    /*
        AOP：作为程序某个切入点，在方法运行的：进行额外的加强功能
        前: @Before
        后: @After
        Return: @AfterReturning
        Exception: @AfterThrowing
        中间（代替）: @Around
     */

    @Before(value = "execution(public int allAnnotation.AOP.Calculator.*(..))")
    public void before(){
        System.out.println("前置通知");
    }

    @After(value = "execution(public int allAnnotation.AOP.Calculator.*(..))")
    public void after(){
        System.out.println("后置通知");
    }

    @AfterReturning(value = "execution(public int allAnnotation.AOP.Calculator.*(..))")
    public void afterReturn(){
        System.out.println("返回后通知");
    }

    /*
        可以找到 catch 里的 exception，依旧拦截
    */
    @AfterThrowing(value = "execution(public int allAnnotation.AOP.Calculator.*(..))")
    public void afterThrow(){
        System.out.println("遇见Exception后通知");
    }

    @Around(value = "execution(public int allAnnotation.AOP.Calculator.divide(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws ArithmeticException {
        // before
        System.out.println("Around: 前置通知");
        try {
            Object result = joinPoint.proceed();
            // after returning
            System.out.println("Around: 返回通知");
            return result;
        } catch (Throwable e) {
            // after throwing
            System.out.println("Around: 异常通知");
            throw new ArithmeticException("Cannot divide by 0!!!");
        } finally {
            // after
            System.out.println("Around: 结束通知");
        }
    }
}
