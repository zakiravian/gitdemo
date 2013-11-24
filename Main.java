/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mtnsdpintegration;

import java.util.ArrayList;
import java.util.List;
import org.csapi.wsdl.parlayx.sms.send.v2_2.service.SendSms;
import org.csapi.wsdl.parlayx.sms.send.v2_2.service.SendSmsService;

/**
 *
 * @author Zaki Ahmad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        SendSmsService service = new SendSmsService();
        SendSms sendSms = service.getSendSms();
        List<String> addresses = new ArrayList<String>();
        addresses.add("967733122048");
        String response = sendSms.sendSms(addresses, "GrandTech", null, "Hello SDP",
                null, "2", 0, 0, 0, 2);
        System.out.println("Resonse is::"+response);
        
    }

}
