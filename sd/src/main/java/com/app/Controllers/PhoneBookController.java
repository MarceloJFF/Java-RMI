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

    @Override
    public boolean salvar(PhoneBookContact phoneBookContact){
        return dao.salvar(phoneBookContact);
    }

    @Override
    public PhoneBookContact get(Integer id){
        return  dao.get(PhoneBookContact.class, id);
    }
    
    @Override
    public boolean excluir(PhoneBookContact phoneBookContact){
        return dao.excluir(phoneBookContact);
    }
}
