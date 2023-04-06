package com.app.Controllers;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.app.Dao.DaoGenerico;
import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.Contact;

public class ContactController extends UnicastRemoteObject implements InterfaceRMI<Contact> {
    private static final long serialVersionUID = 1L;

    
    private DaoGenerico<Contact> dao = null;

    public ContactController() throws RemoteException {
        dao = dao.getIntance();
    }

    @Override
    public boolean salvar(Contact c){
        return dao.salvar(c);
    }

    @Override
    public Contact get(Integer id){
        return (Contact)dao.get(Contact.class, id);
    }

    @Override
    public boolean excluir(Contact c){
        return dao.excluir(c);
    }
}
