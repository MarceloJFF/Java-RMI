package com.app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

import com.app.Controllers.AddressController;
import com.app.Controllers.ContactController;
import com.app.Controllers.PhoneBookController;
import com.app.Controllers.PhoneController;
import com.app.Controllers.UserController;
import com.app.InterfaceRMI.InterfaceRMI;
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
    public static void main( String[] args ) throws MalformedURLException
    {
		try {
			System.setProperty("java.rmi.server.useCodebaseOnly", "false");


			//criar um objeto que será remoto
			InterfaceRMI<Phone> phoneController = new PhoneController();
			//Criar o registro (RMI Registry)
		
			LocateRegistry.createRegistry(1099);
			//Registrar um objeto
			Naming.rebind("rmi://localhost/phoneController", phoneController);
			//Servidor fica rodando aguardando requisiçoes do cliente
			System.out.println("Servidor rodando...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
