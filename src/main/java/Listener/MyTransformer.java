package Listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import Base.Base;

public class MyTransformer extends Base implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class class1, Constructor constructor, Method method) {
		annotation.setRetryAnalyzer(RetryAnalyser.class);
	}

}
