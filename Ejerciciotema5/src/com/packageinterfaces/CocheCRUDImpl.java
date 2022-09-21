package com.packageinterfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Este método se llama: "+sMethodName+"\n");
    }

    @Override
    public void findAll() {
        String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Este método se llama: "+sMethodName+"\n");
    }

    @Override
    public void delete() {
        String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Este método se llama: "+sMethodName+"\n");
    }
}
