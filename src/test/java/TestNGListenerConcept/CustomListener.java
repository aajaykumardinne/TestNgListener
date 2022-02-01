package TestNGListenerConcept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener{
	
	
	 @Override		
	    public void onFinish(ITestContext Result) 					
	    {		
	                		
	    }		

	    @Override		
	    public void onStart(ITestContext Result)					
	    {		
	            		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
	    {		
	    		
	    }		

	    		
	    @Override		
	    public void onTestFailure(ITestResult Result) 					
	    {		
	    	System.out.println("FAILED Test");
	    	failed(Result.getMethod().getMethodName());
	   					
	    }		

	
	    @Override		
	    public void onTestSkipped(ITestResult Result)					
	    {		
	   			
	    }		

	    		
	    @Override		
	    public void onTestStart(ITestResult Result)					
	    {		
	    					
	    }		

	  	
	    @Override		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    					
	    }		

}
