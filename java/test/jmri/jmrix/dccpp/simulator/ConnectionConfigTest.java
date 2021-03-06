package jmri.jmrix.dccpp.simulator;

import jmri.util.JUnitUtil;

import org.junit.jupiter.api.*;

/**
 * Tests for ConnectionConfig class.
 *
 * @author Paul Bender Copyright (C) 2016
 **/
public class ConnectionConfigTest extends jmri.jmrix.AbstractSerialConnectionConfigTestBase  {

   @BeforeEach
   @Override
   public void setUp() {
        JUnitUtil.setUp();

        JUnitUtil.initDefaultUserMessagePreferences();
        cc = new ConnectionConfig(new DCCppSimulatorAdapter()); // adapter assumed in test
   }

   @AfterEach
   @Override
   public void tearDown(){
        cc = null;
        JUnitUtil.resetWindows(false,false);
        JUnitUtil.tearDown();
   }

}
