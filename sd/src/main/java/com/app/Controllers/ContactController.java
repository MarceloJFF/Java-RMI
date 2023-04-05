package com.app.Controllers;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.app.Dao.DaoGenerico;
import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.Contact;

public class ContactController extends UnicastRemoteObject implements InterfaceRMI<Contact> {
    private DaoGenerico<Contact> dao = null;

    public ContactController() throws RemoteException {
        dao = dao.getIntance();
    }

    public boolean salvar(Contact c){
        return dao.salvar(c);
    }

   
    public Contact get(Integer id){
        return dao.get(Contact.class, id);
    }

    public boolean excluir(Contact c){
        return dao.excluir(c);
    }
}
