package com.springbook.biz.common;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardVO;

// @Service -> <aop:aspectj-autoproxy> 에 의해서 인식되기 위해 선언
// @Aspect -> Aspect = Pointcut + Advice
@Service
@Aspect
public class LogAdvice {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(com.springbook.biz.board.BoardVO))")
	public void boardPointcut() {}
	
	
	@Before("allPointcut()")
	public void printLog() {
		System.out.println("[LogAdvice] .............");
	}
	
	public void printLog2(JoinPoint jp) {
		//System.out.println("[LogAdvice][printLog2] ............. " + vo.toString());
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		BoardVO vo = (BoardVO)args[0];
		System.out.println("[LogAdvice][printLog2] ..... " + method + ", " + vo.toString());
	}
	
	@AfterReturning(pointcut="boardPointcut()", returning="returnObj")
	public void printLog3(JoinPoint jp, Object returnObj) {
		//System.out.println("[LogAdvice][printLog2] ............. " + vo.toString());
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		BoardVO vo = (BoardVO)args[0];
		System.out.println("[LogAdvice][printLog3] ..... " + method + ", " + vo.toString());
		
		if (returnObj != null) {
			List<BoardVO> list = (List)returnObj;
			//for (Board board : list) {
				System.out.println("[LogAdvice][pringLog3] ..... count: " + list.size());
			//}
		}
	}
}
