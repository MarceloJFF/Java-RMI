package com.app.Controllers;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.app.Dao.DaoGenerico;
import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.Phone;

public class PhoneController extends UnicastRemoteObject implements InterfaceRMI<Phone>{
    private DaoGenerico<Phone> dao = null;
    
    public PhoneController() throws RemoteException {
        super();
        dao = dao.getIntance();
        //TODO Auto-generated constructor stub
    }

    public boolean salvar(Phone p){
        return dao.salvar(p);
    }

    public Phone get(Integer id){
        return   dao.get(Phone.class, id);
    }

    

    public boolean excluir(Phone c){
        return dao.excluir(c);
    }
}
