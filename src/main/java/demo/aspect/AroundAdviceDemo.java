package demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdviceDemo {
    @Around("execution(* demo.dao.FortuneDAO.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String method = proceedingJoinPoint.getSignature().toShortString();
        System.out.println("@Around advice on method " + method);

        long startTime = System.currentTimeMillis();

        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception exception) {
            System.out.println("Exception occurred : " + exception);
            //result="You are unlucky";
            throw exception;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time duration of method run is : " + (endTime - startTime) / 1000.0 + " secs");

        return result;
    }
}
