package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest2Assert24 extends
		AttendanceLogicFlexibleTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()-(A1.getTime()+t-e1.getTime())));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1_1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t+t1_1.getTime()-t1_n.getTime()));
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),convertMsToMinutes(t2_1.getTime()-f1.getTime()));
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t+A2.getTime()-t2_n.getTime()+t2_1.getTime()-f1.getTime()));
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()-(A1.getTime()+t-e1.getTime())));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1_1.getTime()-f2.getTime()+e2.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t-(t1_n.getTime()-t1_1.getTime())-(f2.getTime()-e2.getTime())));
		
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),convertMsToMinutes(t2_1.getTime()-f1.getTime()));
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t-(t2_n.getTime()-t2_1.getTime())-(f1.getTime()-A2.getTime())));
	}
	
	@Override
	public void Testx_x_3_simple_leave(){
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(A1.getTime()+t-e1.getTime()+f2.getTime()-e2.getTime()));
	}

}
