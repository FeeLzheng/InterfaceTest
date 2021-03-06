package com.uniubi.common.oldlogic.weekend;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest2AssertWeekend44 extends AttendanceLogicCommonTest2AssertBaseWeekend {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),0);
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),0);
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),0);
		
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),0);
		assertEquals(1,1);
	}

}
