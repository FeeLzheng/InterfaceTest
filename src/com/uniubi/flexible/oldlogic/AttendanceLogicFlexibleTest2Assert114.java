package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest2Assert114 extends
		AttendanceLogicFlexibleTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
		
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t-(f1.getTime()-A2.getTime())));
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
	
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
	}
	
	
	@Override
	public void Testx_x_4_simple_leave(){
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()+f2.getTime()-e2.getTime()));
	}
	
}
