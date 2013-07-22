package com.springinaction.knights;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ContestantIntroducer {
	@DeclareParents(
			value= "com.springinaction.knights.Knight+",
			defaultImpl=GraciousContestant.class)
			public static Contestant contestant;
}
