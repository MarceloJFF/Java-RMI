package com.app.Controllers;
import com.app.Dao.DaoGenerico;
import com.app.model.Phone;

public class PhoneController {
    private DaoGenerico<Phone> dao = null;
    
    public PhoneController(){
        dao = dao.getIntance();
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
