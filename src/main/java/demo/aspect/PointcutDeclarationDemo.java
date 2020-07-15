package demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutDeclarationDemo {
    @Pointcut("execution(* demo.dao.*.*(..))")
    private void pointcut() {
    }      //any name acceptable

    //@Before("pointcut()")
    public void performAPIAnalytics() {
        System.out.println("@Before advice for API Analytics");
    }

    //@Before("pointcut()")
    public void maintainSecurity() {
        System.out.println("@Before advice for security check");
    }
}
