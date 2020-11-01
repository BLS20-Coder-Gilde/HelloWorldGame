package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	System.out.println("Spiel Startet");



	int rakete = 25;
	int laser = 15;
	int bullet = 10;
	int waffe;
	User user = new User();
	Enemy enemy = new Enemy();



	System.out.println("Wilkommen beim Spiel");
	System.out.println("Zuerst müssen wir überprüfen ob sie ein Bot sind, lösen Sie deshalb folgende Rechnungen:");
	String [] fragen = {"Wieviel ergibt 1+1?", "Wieviel ergibt 2 + 2?"};
	int [] antworten = {2,4};

	int count = 0;

	while(count < fragen.length) {
	    System.out.println(fragen[count]);

	    Scanner scan = new Scanner(System.in);
	    int userEingabe = scan.nextInt();

	    if (userEingabe == antworten[count]) {
	        System.out.println("Richtig!");
	        count++;
        }else {
	        System.out.println("Falsch! Versuche es nochmal");
        }
    }

	System.out.println("Bitte geben Sie ihren namen ein ");
	Scanner namensEingabe = new Scanner(System.in);
	user.name = namensEingabe.next();
	System.out.println("Hallo " + user.name);

	System.out.println("Bitte wähle deine Waffe");

	Scanner waffenAsuwahl = new Scanner(System.in);
	System.out.println("Für Rakete(25 dmg) gib die 1 ein und bestätige mit enter");
    System.out.println("Für Laser(15dmg) gib die 2 ein und bestätige mit enter");
    System.out.println("Für Bullet(10dmg) gib die 3 ein und bestätige mit enter");
    user.waffe = waffenAsuwahl.nextInt();


    while(user.waffe > 3) {
        System.out.println("Falsche einagbe, versuch es nochmal!!");
        System.out.println("Für Rakete(25 dmg) gib die 1 ein und bestätige mit enter");
        System.out.println("2Für Laser(15dmg) gib die 2 ein und bestätige mit enter");
        System.out.println("Für Bullet(10dmg) gib die 3 ein und bestätige mit enter");
        user.waffe = waffenAsuwahl.nextInt();
    }

    switch (user.waffe) {
        case 1: {
            System.out.println("Sie haben Rakete, als ihre Waffe gewählt.");
        }
        break;
        case 2: {
            System.out.println("Sie haben Laser, als ihre Waffe gewählt.");
        }
        break;
        case 3: {
            System.out.println("Sie haben Laser, als ihre Waffe gewählt.");
        }
        break;
    }

    System.out.println("Tutorial startet");

    System.out.println("Um den Gegner anzugreifen geben Sie 1 ein und bestätigen mit enter");
    Scanner scan = new Scanner(System.in);
    int userAttack = scan.nextInt();

    while(enemy.live > 0) {
        if (userAttack == 1 && user.waffe == 1) {
            enemy.enemyGotHit(rakete);
            System.out.println("Getroffen! Der Gegner hat noch " + enemy.live + " leben");
        } else if (userAttack == 1 && user.waffe == 2) {
            enemy.enemyGotHit(laser);
            System.out.println("Getroffen der Gegner hat noch " + enemy.live + " Leben");
        } else if (userAttack == 1 && user.waffe == 3) {
            enemy.enemyGotHit(bullet);
            System.out.println("Getroffen der Gegner hat noch " + enemy.live + " Leben");
        }
    }

    System.out.println("Der Gegner wurde zerstört! Tutorial beendet");
















    }


}
