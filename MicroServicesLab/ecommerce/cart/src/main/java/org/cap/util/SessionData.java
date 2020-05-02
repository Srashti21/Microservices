package org.cap.util;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;



@Component
@SessionScope
public class SessionData {

    private int customerID=-1;

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

}
