package demo.aspectOrdering;

import org.aspectj.lang.annotation.Pointcut;

//These Pointcut expressions must not be private, otherwise it can't be used in other packages
public class CommonPointcutExpressions {
    @Pointcut("execution(* demo.dao.*.*(..))")
    public void daoPackagePointcut() {
    }

    @Pointcut("execution(* demo.dao.*.get*(..))")
    public void getter() {
    }

    @Pointcut("execution(* demo.dao.*.set*(..))")
    public void setter() {
    }

    @Pointcut("daoPackagePointcut() && !(getter() || setter())")
    public void daoPackageWithoutGettersAndSetters() {
    }
}
