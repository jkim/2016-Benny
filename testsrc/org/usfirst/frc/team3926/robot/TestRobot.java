package org.usfirst.frc.team3926.robot;

import org.junit.Test;
import static org.junit.Assert.*;
import org.strongback.mock.Mock;
import org.strongback.mock.MockTalonSRX;

public class TestRobot {

    @Test
    public void test() {
        MockTalonSRX talon_FL = Mock.runningTalonSRX(0, 0.1);

        assertEquals(talon_FL.getDeviceID(),0);
    }

    @Test
    public void test2() {
        MockTalonSRX talon_FL = Mock.runningTalonSRX(0, 0.1);

        assertEquals(talon_FL.getDeviceID(),0);
    }

}