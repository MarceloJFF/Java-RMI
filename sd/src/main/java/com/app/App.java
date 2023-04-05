package com.app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
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
		try {
			//criar um objeto que será remoto
            AddressController addressController = new AddressController();
			//Criar o registro (RMI Registry)
			LocateRegistry.createRegistry(1099);
			//Registrar um objeto
			Naming.rebind("//localhost/address", addressController);
			//Servidor fica rodando aguardando requisiçoes do cliente
			System.out.println("Servidor rodando...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
