/**
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS
 * FOR A PARTICULAR PURPOSE. THIS CODE AND INFORMATION ARE NOT SUPPORTED BY XEBIALABS.
 */
package ext.deployit.plugin.was.container;

import com.xebialabs.deployit.plugin.api.udm.Metadata;
import com.xebialabs.deployit.plugin.api.udm.Property;
import com.xebialabs.deployit.plugin.python.DerivedProperty;

/**
 * An unmanaged WebSphere Application Server.
 */
@SuppressWarnings("serial")
@Metadata(root = Metadata.ConfigurationItemRoot.INFRASTRUCTURE, description = "An unmanaged WebSphere Applicaton Server (WAS Base/SA)", inspectable = true)
public class UnmanagedServer extends com.xebialabs.deployit.plugin.was.container.UnmanagedServer {

    @Property(required = true, label = "WebSphere server name", description = "Name of the WebSphere server")
    private String serverName;

    @Override
    public String getContainmentPath() {
        return "/Server:" + getServerName();
    }

    @DerivedProperty("serverName")
    public String getServerName() {
        return serverName;
    }

}