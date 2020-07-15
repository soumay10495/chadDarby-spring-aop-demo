package demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//This aspect is used to pointcut all methods(any class) of "dao" package except getters and setters

@Aspect
@Component
public class PointcutDeclarationComboDemo {
    @Pointcut("execution(* demo.dao.*.*(..))")
    private void daoPackagePointcut() {
    }

    @Pointcut("execution(* demo.dao.*.get*(..))")
    private void getter() {
    }

    @Pointcut("execution(* demo.dao.*.set*(..))")
    private void setter() {
    }

    /*@Before("daoPackagePointcut())")
    public void allDaoPackageMethods(){
        System.out.println("@Before advice for all DAO methods");
    }*/

    //Pointcut combo
    //Another pointcut with the below condition can also be declared instead of using it directly in @Before
    //@Before("daoPackagePointcut() && !(getter() || setter())")
    public void daoPackageWithoutGetterAndSetter() {
        System.out.println("@Before advice for all methods except getters and setters");
    }
}
