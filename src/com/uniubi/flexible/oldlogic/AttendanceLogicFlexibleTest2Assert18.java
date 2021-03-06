package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest2Assert18 extends
		AttendanceLogicFlexibleTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()-f1.getTime()+A2.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t+t2_1.getTime()-t2_n.getTime()));
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()-f1.getTime()+A2.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t-(f2.getTime()-e2.getTime())-(t2_n.getTime()-t2_1.getTime())));
	}
	
	
	@Override
	public void Testx_x_4_simple_leave(){
		System.out.println(convertMsToMinutes(f1.getTime()-A2.getTime()+f2.getTime()-e2.getTime()));
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()+f2.getTime()-e2.getTime()));
	    assertEquals(1,1);
	}

}
