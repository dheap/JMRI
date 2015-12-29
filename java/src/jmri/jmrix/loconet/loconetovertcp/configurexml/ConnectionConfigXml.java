package jmri.jmrix.loconet.loconetovertcp.configurexml;

import jmri.jmrix.configurexml.AbstractNetworkConnectionConfigXml;
import jmri.jmrix.loconet.loconetovertcp.ConnectionConfig;
import jmri.jmrix.loconet.loconetovertcp.LnTcpDriverAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handle XML persistance of layout connections by persistening the
 * LnTcpDriverAdapter (and connections).
 * <P>
 * Note this is named as the XML version of a ConnectionConfig object, but it's
 * actually persisting the LnTcpDriverAdapter.
 * <P>
 * This class is invoked from jmrix.JmrixConfigPaneXml on write, as that class
 * is the one actually registered. Reads are brought here directly via the class
 * attribute in the XML.
 *
 * @author Bob Jacobsen Copyright: Copyright (c) 2003
 * @version $Revision$
 */
public class ConnectionConfigXml extends AbstractNetworkConnectionConfigXml {

    public ConnectionConfigXml() {
        super();
    }

    protected void getInstance() {
        adapter = new LnTcpDriverAdapter();
    }

    protected void getInstance(Object object) {
        adapter = ((ConnectionConfig) object).getAdapter();
    }

    @Override
    protected void register() {
        this.register(new ConnectionConfig(adapter));
    }

    // initialize logging
    static Logger log = LoggerFactory.getLogger(ConnectionConfigXml.class.getName());

}
