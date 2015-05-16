package com.CDIO_final.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.CDIO_final.client.MySampleApplicationService;

public class MySampleApplicationServiceImpl extends RemoteServiceServlet implements MySampleApplicationService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}