
package sabuclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SabuService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/SabuSevice/SabuService?WSDL")
public class SabuService_Service
    extends Service
{

    private final static URL SABUSERVICE_WSDL_LOCATION;
    private final static WebServiceException SABUSERVICE_EXCEPTION;
    private final static QName SABUSERVICE_QNAME = new QName("http://services/", "SabuService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SabuSevice/SabuService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SABUSERVICE_WSDL_LOCATION = url;
        SABUSERVICE_EXCEPTION = e;
    }

    public SabuService_Service() {
        super(__getWsdlLocation(), SABUSERVICE_QNAME);
    }

    public SabuService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SABUSERVICE_QNAME, features);
    }

    public SabuService_Service(URL wsdlLocation) {
        super(wsdlLocation, SABUSERVICE_QNAME);
    }

    public SabuService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SABUSERVICE_QNAME, features);
    }

    public SabuService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SabuService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SabuService
     */
    @WebEndpoint(name = "SabuServicePort")
    public SabuService getSabuServicePort() {
        return super.getPort(new QName("http://services/", "SabuServicePort"), SabuService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SabuService
     */
    @WebEndpoint(name = "SabuServicePort")
    public SabuService getSabuServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "SabuServicePort"), SabuService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SABUSERVICE_EXCEPTION!= null) {
            throw SABUSERVICE_EXCEPTION;
        }
        return SABUSERVICE_WSDL_LOCATION;
    }

}
