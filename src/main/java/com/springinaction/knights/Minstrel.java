package com.springinaction.knights;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Minstrel {

	@Pointcut("execution (* com.springinaction.knights.Knight.embarkOnQuest(..))")
	public void embark(){
	}
	
	@Before("embark()")
  public void singBeforeQuest() {     //<co id="co_singBefore"/>
    System.out.println("Fa la la; The knight is so brave!");
  }
  
	@After("embark()")
  public void singAfterQuest() {     //<co id="co_singAfter"/>
    System.out.println(
            "Tee hee he; The brave knight did embark on a quest!");
  }

	@Around("embark()")
	public void aroundEmbark(ProceedingJoinPoint joinpoint) {
		
	    System.out.println("BEFOREEEEE!!!");
	    
	    try {
			joinpoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("AFTER!!!");
		
	}
  
}
