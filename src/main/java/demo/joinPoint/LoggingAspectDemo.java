package demo.joinPoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectDemo {
    @Before("demo.aspectOrdering.CommonPointcutExpressions.daoPackageWithoutGettersAndSetters()")
    public void addAccount(JoinPoint joinPoint) {
        System.out.println("@Before advice in LoggingAspect");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method : " + methodSignature);

        Object args[] = joinPoint.getArgs();
        for (Object obj : args)
            System.out.println(obj);
    }
}
