package com.app.Controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.app.Dao.DaoGenerico;
import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.Address;

public class AddressController extends UnicastRemoteObject implements InterfaceRMI <Address> {
    
    private DaoGenerico<Address> dao = null;
    public AddressController() throws RemoteException {
        super();
        dao = dao.getIntance();
        //TODO Auto-generated constructor stub
    }

    // public AddressController(){
    //     dao = dao.getIntance();
    // }
   
    @Override
    public boolean salvar(Address a) throws RemoteException {
        // TODO Auto-generated method stub
        return dao.salvar(a);
    }
    @Override
    public boolean excluir(Address a) throws RemoteException {
        return dao.excluir(a);
    }

    @Override
    public Address get(Integer id) throws RemoteException {
        return  (Address) dao.get(Address.class, id);
    }
}
