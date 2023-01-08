package com.fundamentos.sprinboot.fundamentos.bean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyNotificationImplement implements MyNotificacion{

    @Override
    public void notificaction() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        //System.out.println();
        System.out.println("Mensaje de Notificación " + dtf.format(now));
    }


}
