package com.loonycorn;/*
package com.loonycorn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig {

   // @Pointcut("execution(* *.print*(..))")
    //private void printPointcut(){}

    //@Pointcut("execution(* *.display*(..))")
    //private void displayPointcut(){}

    //@Pointcut("execution(* *.get*(..))")
    //private void getterPointcut(){}

    //@Pointcut("within(com.loonycorn.pointcuts.Item)")
    //private void itemListAllMethodsPointcut(){}

    //@Pointcut("printPointcut() || displayPointcut()")
    //private void printOrDisplayMethodsPointcut(){}

    //@Pointcut("printPointcut() && itemListAllMethodsPointcut()")
    //private void printMethodsFromItemListPointcut(){}

    //@Pointcut("!(printOrDisplayMethodsPointcut() || getterPointcut())")
    //private void doesNotPublishOrGet(){}
    @Pointcut("@annotation(com.loonycorn.pointcuts.DetailPublisher)")
    private void detailPublisherPointcut(){}

    @Before("detailPublisherPointcut()")
    public void printLogo(JoinPoint jp) {

        System.out.println("\n\nLogo printed before invocation of: " + jp.getSignature().getName());

        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");
    }

    @Before("printMethodsFromItemListPointcut()")
    public void printFromItemList(JoinPoint jp){

        System.out.println("\n########## Printing from ItemList ##########");
        System.out.println("Print method called from ItemList: "
                + jp.getSignature().getName() + "\n");
    }

    @Before("doesNotPublishOrGet()")
    public void doesNotPublishOrGetAdvice(JoinPoint jp){

        System.out.println("A method which does not publish to the console " +
                "or retrieve data has been called");
    }

}*/
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig {

    @Pointcut("@annotation(com.loonycorn.pointcuts.DetailPublisher)")
    private void myPointcutMethod() { }

    @Before("myPointcutMethod()")
    public void beforeAdvice(JoinPoint jp) {

        System.out.println("\n[Before Advice]: This advice is executed before the execution of the below method..");
        System.out.println("From AspectConfig.beforeAdvice() : Executing " + jp.getSignature().getName() );
    }
}
