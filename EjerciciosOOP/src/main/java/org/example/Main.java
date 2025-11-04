package org.example;

import Ejercicio1.IProfileExporter;
import Ejercicio1.JsonProfileExporter;
import Ejercicio1.UserProfile;
import Ejercicio1.XmlProfileExporter;
import Ejercicio2.*;
import Ejercicio3.FlyingMovement;
import Ejercicio3.MagicAttack;
import Ejercicio3.SwordAttack;
import Ejercicio3.WalkingMovement;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        playEjercicio1();
        playEjercicio2();
        playEjercicio3();

    }

    public static void playEjercicio1(){
        try{
            System.out.println("Ejercicio 1: ");
            UserProfile user = new UserProfile("RGimenez", "rodrigo@example.com", "segura123");
            user.displayProfile();

            IProfileExporter jsonExporter = new JsonProfileExporter();
            jsonExporter.export(user);

            IProfileExporter xmlExporter = new XmlProfileExporter();
            xmlExporter.export(user);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void playEjercicio2(){
        try{
            System.out.println("\n");
            System.out.println("Ejercicio 2: ");
            Notification email = new EmailNotification("persona@example.com", "Tu reporte mensual está disponible.");
            Notification sms = new SmsNotification("+5491122233344", "Recordatorio: reunión mañana a las 10 AM.");
            Notification push = new PushNotification("AugustoR", "Tienes una nueva tarea asignada.");

            List<Notification> notifications = Arrays.asList(email, sms, push);

            NotificationService service = new NotificationService();
            service.sendBatch(notifications);

        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void playEjercicio3(){
        try{
            System.out.println("\n");
            System.out.println("Ejercicio 3: ");
            Ejercicio3.Character warrior = new Ejercicio3.Character("Guerrero", new SwordAttack(), new WalkingMovement());
            warrior.performAttack();
            warrior.performMove();

            Ejercicio3.Character mage = new Ejercicio3.Character("Mago", new MagicAttack(), new WalkingMovement());
            mage.performAttack();
            mage.performMove();

            Ejercicio3.Character flyingWarrior = new Ejercicio3.Character("Guerrero volador", new SwordAttack(), new FlyingMovement());
            flyingWarrior.performAttack();
            flyingWarrior.performMove();


            System.out.println("\nEl mago aprende a volar...");
            mage.setMovementBehavior(new FlyingMovement());
            mage.performMove();

        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}