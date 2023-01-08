package com.fundamentos.sprinboot.fundamentos.bean;

public class MyNotificationImplement implements MyNotificacion{

    @Override
    public void notificaction() {
        System.out.println("Mensaje de Notificación");
    }
}
