package com.app;

import java.util.ArrayList;
import java.util.List;

import com.app.Controllers.AddressController;
import com.app.Controllers.ContactController;
import com.app.Controllers.PhoneBookController;
import com.app.Controllers.PhoneController;
import com.app.Controllers.UserController;
import com.app.model.Address;
import com.app.model.Contact;
import com.app.model.Phone;
import com.app.model.PhoneBookContact;
import com.app.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AddressController addressController = new AddressController();
       Address address = addressController.get(8);
       ContactController contactController = new ContactController();
       
        List<Phone> phones = contactController.get(16).getPhones();
        for ( Phone phone : phones ) {
            System.out.println(phone.getDDD());
        }
    }
}
