package com.app.Controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.app.Dao.DaoGenerico;
import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.PhoneBookContact;

public class PhoneBookController  extends UnicastRemoteObject implements InterfaceRMI<PhoneBookContact> {
    private DaoGenerico<PhoneBookContact> dao = null;
    
    public PhoneBookController() throws RemoteException {
        dao = dao.getIntance();
    }

    public boolean salvar(PhoneBookContact phoneBookContact){
        return dao.salvar(phoneBookContact);
    }

    public PhoneBookContact get(Integer id){
        return  dao.get(PhoneBookContact.class, id);
    }

    public boolean excluir(PhoneBookContact phoneBookContact){
        return dao.excluir(phoneBookContact);
    }
}
