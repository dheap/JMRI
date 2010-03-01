// ConnectionConfig.java

package jmri.jmrix.can.adapters.lawicell.canusb.serialdriver;

/**
 * Definition of objects to handle configuring a layout connection
 * via a Canusb SerialDriverAdapter object.
 *
 * @author      Bob Jacobsen   Copyright (C) 2001, 2003, 2008
 * @author      Andrew Crosland 2008
 * @version	    $Revision: 1.3 $
 */
public class ConnectionConfig extends jmri.jmrix.AbstractSerialConnectionConfig {

    /**
     * Ctor for an object being created during load process;
     * Swing init is deferred.
     */
    public ConnectionConfig(jmri.jmrix.SerialPortAdapter p){
        super(p);
    }
    /**
     * Ctor for a functional Swing object with no prexisting adapter
     */
    public ConnectionConfig() {
        super();
    }

    public String name() { return "CAN via Lawicell CANUSB"; }

    protected void setInstance() { adapter = SerialDriverAdapter.instance(); }
}

