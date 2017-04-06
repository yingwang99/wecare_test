package com.example.wecareclient.test;


import com.example.wecareclient.MainActivity;
import com.example.wecareclient.StartLoadingActivity;
import com.example.wecareclient.UserDetailsActivity1;
import com.example.wecareclient.UserDetailsActivity2;
import com.example.wecareclient.UserDetailsActivity3;
import com.example.wecareclient.UserDetailsActivity4;
import com.example.wecareclient.UserDetailsActivity5;
import com.robotium.solo.Solo;

import android.app.Activity;
import android.app.Instrumentation.ActivityMonitor;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.Smoke;
import android.view.View;

public class MainActivityTest extends ActivityInstrumentationTestCase2<StartLoadingActivity> {

	private Solo solo;
	public static final String TEST_USERNAME = "test";  
	public static final String TEST_PASSWORD = "admin123";  
	public static final String TEST_EMAIL_ADDRESS = "cassie@gmail.com"; 
	
	public MainActivityTest() throws Exception {
		super("com.example.wecareclient.test", StartLoadingActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
	}
	
	@Override  
    public void tearDown() throws Exception {  
        //Robotium will finish all the activities that have been opened  
        solo.finishOpenedActivities();  
    }  
      
	@Smoke  
    public void test0WaitForActivity(){  
        solo.assertCurrentActivity("assert activity err", StartLoadingActivity.class);  
        solo.assertCurrentActivity("assert activity err", "StartLoadingActivity");  
        solo.assertCurrentActivity("assert activity err", StartLoadingActivity.class, true);  
        solo.assertCurrentActivity("assert activity err", "StartLoadingActivity", true);  
        
        solo.sleep(3000);
        
        solo.assertCurrentActivity("assert activity err", MainActivity.class);  
        solo.assertCurrentActivity("assert activity err", "MainActivity");  
        solo.assertCurrentActivity("assert activity err", MainActivity.class, true);  
        solo.assertCurrentActivity("assert activity err", "MainActivity", true);         
    }  
	
	@Smoke  
    public void test1WaitForClick(){
        solo.clickOnView(solo.getView("registerbtn")); 
        solo.sleep(1000);
        solo.assertCurrentActivity("assert activity err", UserDetailsActivity1.class);     
	}
	
	@Smoke  
    public void test2SignUp1(){ 
		ActivityMonitor monitor = getInstrumentation().addMonitor(  
				 UserDetailsActivity1.class.getName(), null, false);  
		Intent intent = new Intent(Intent.ACTION_MAIN);  
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
	    intent.setClassName(getInstrumentation().getTargetContext(), UserDetailsActivity1.class.getName());  
	    getInstrumentation().startActivitySync(intent);  
	      
	    Activity currentActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5);  
	    assertTrue(currentActivity != null);  
	    View currentView = currentActivity.findViewById(com.example.wecareclient.R.id.loseWeight_Button);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView);  
	    
	    currentView = currentActivity.findViewById(com.example.wecareclient.R.id.next);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView); 

        solo.assertCurrentActivity("assert activity err", UserDetailsActivity2.class); 
	}
	
	@Smoke  
    public void test3SignUp2(){ 
		ActivityMonitor monitor = getInstrumentation().addMonitor(  
				 UserDetailsActivity2.class.getName(), null, false);  
		Intent intent = new Intent(Intent.ACTION_MAIN);  
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
	    intent.setClassName(getInstrumentation().getTargetContext(), UserDetailsActivity2.class.getName());  
	    getInstrumentation().startActivitySync(intent);  
	      
	    Activity currentActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5);  
	    assertTrue(currentActivity != null);  
	    View currentView = currentActivity.findViewById(com.example.wecareclient.R.id.male);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView); 
	    
	    currentView = currentActivity.findViewById(com.example.wecareclient.R.id.next);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView); 

        solo.assertCurrentActivity("assert activity err", UserDetailsActivity3.class); 
	}
	
	@Smoke  
    public void test4SignUp3(){ 
		ActivityMonitor monitor = getInstrumentation().addMonitor(  
				 UserDetailsActivity3.class.getName(), null, false);  
		Intent intent = new Intent(Intent.ACTION_MAIN);  
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
	    intent.setClassName(getInstrumentation().getTargetContext(), UserDetailsActivity3.class.getName());  
	    getInstrumentation().startActivitySync(intent);  
	      
	    Activity currentActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5);  
	    assertTrue(currentActivity != null);  
	    View currentView = currentActivity.findViewById(com.example.wecareclient.R.id.next);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView); 
	    
        solo.assertCurrentActivity("assert activity err", UserDetailsActivity4.class); 
        solo.sleep(3000);
	}
	
	@Smoke  
    public void test5SignUp4(){ 
		ActivityMonitor monitor = getInstrumentation().addMonitor(  
				 UserDetailsActivity4.class.getName(), null, false);  
		Intent intent = new Intent(Intent.ACTION_MAIN);  
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
	    intent.setClassName(getInstrumentation().getTargetContext(), UserDetailsActivity4.class.getName());  
	    getInstrumentation().startActivitySync(intent);  
	      
	    Activity currentActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5);  
	    assertTrue(currentActivity != null);  
	    View currentView = currentActivity.findViewById(com.example.wecareclient.R.id.next);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView); 
	    
       solo.assertCurrentActivity("assert activity err", UserDetailsActivity5.class); 
       solo.sleep(3000);
	}
	
	/*
	@Smoke  
    public void test6SignUp5(){ 
		ActivityMonitor monitor = getInstrumentation().addMonitor(  
				UserDetailsActivity5.class.getName(), null, false);  
		Intent intent = new Intent(Intent.ACTION_MAIN);  
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
	    intent.setClassName(getInstrumentation().getTargetContext(), UserDetailsActivity5.class.getName());  
	    getInstrumentation().startActivitySync(intent);  
	      
	    Activity currentActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5);  
	    assertTrue(currentActivity != null);  
	    View currentView = currentActivity.findViewById(com.example.wecareclient.R.id.email_address);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView);  
	    getInstrumentation().sendStringSync(TEST_EMAIL_ADDRESS);  
	  
	    currentView = currentActivity.findViewById(com.example.wecareclient.R.id.passward_input);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView);  
	    getInstrumentation().sendStringSync(TEST_PASSWORD); 
	    
	    currentView = currentActivity.findViewById(com.example.wecareclient.R.id.passward_confirm_input);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView);  
	    getInstrumentation().sendStringSync(TEST_PASSWORD);  
	    
	    currentView = currentActivity.findViewById(com.example.wecareclient.R.id.username_input);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView);  
	    getInstrumentation().sendStringSync(TEST_USERNAME);  
	  
	    getInstrumentation().removeMonitor(monitor);  
	    monitor = getInstrumentation().addMonitor(MainActivity.class.getName(), null, false);  
	  
	    currentView = currentActivity.findViewById(com.example.wecareclient.R.id.next);  
	    assertTrue(currentView != null);  
	    TouchUtils.clickView(this, currentView);  
	
	    
        solo.assertCurrentActivity("assert activity err", FragmentActivity.class);  
	}
	 */
}
