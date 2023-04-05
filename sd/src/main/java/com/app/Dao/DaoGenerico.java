package com.app.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;






public class DaoGenerico<T> {
    private EntityManagerFactory factory = null;
    public EntityManager manager = null;
    private static DaoGenerico instance = null;

    public DaoGenerico(){
        factory = Persistence.createEntityManagerFactory("Agenda de Contatos");
        manager = factory.createEntityManager();
    }

    public static DaoGenerico getIntance(){
        if(instance == null){
            instance = new DaoGenerico<>();
        }
        return instance;
    }

    public void fechar(){
        manager.close();
        factory.close();
    }

    public boolean salvar(T t){
        try {
            manager.getTransaction().begin();
            manager.persist(t);
            manager.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
        return true;
    }
    public T get(Class c, int id){
        manager.getTransaction().begin();
        T t =(T) manager.find(c, id);
        manager.getTransaction().commit();
        return t;
    }

    public boolean excluir(T t){
        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
            // TODO: handle exception
        }
        return true;
    }

    // public <T> List<T> listar(Class<T> c, String campo, String valor) {
    //     List<T> lista = null;
    //     try {
    //         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nomeDaSuaUnidadeDePersistencia");
    //         EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    //         entityManager.getTransaction().begin();
    //         CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    //         CriteriaQuery<T> criteria = builder.createQuery(c);
    //         Root<T> root = criteria.from(c);
    //         criteria.select(root);
    //         String param = "%" + valor + "%";
    //         criteria.where(builder.like(root.get(campo), param));
    //         lista = entityManager.createQuery(criteria).getResultList();
    //         entityManager.getTransaction().commit();
    //         entityManager.close();
    //     } catch (Exception e) {
    //         System.out.println("Erro ao listar registros: " + e.getMessage());
    //     }
    //     return lista;
    // }
    
 }

