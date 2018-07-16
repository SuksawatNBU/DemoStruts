package action.test;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		
		String output = "Pre-Processing"; 
	    System.out.println(output);
	      
	    /* let us call action or next interceptor */
	    String result = actionInvocation.invoke();
	    System.out.println("result --> " + result);

	    /* let us do some post-processing */
	    output = "Post-Processing"; 
	    System.out.println(output);

	    return result;
	}

}
