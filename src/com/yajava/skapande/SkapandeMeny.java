package com.yajava.skapande;


import com.yajava.kund.Kund;
import com.yajava.service.OrderList;
import com.yajava.tårta.KladdKaka;
import com.yajava.tårta.PrinsesTårta;
import com.yajava.tårta.Semla;

import java.util.Scanner;

public class SkapandeMeny {

    Scanner input = new Scanner(System.in);

        public void Meny() throws InterruptedException {
            System.out.println("Välkommen");
            System.out.println("Skriv in ditt namn, tack: ");
            String kund_namn  = input.nextLine();
            System.out.println("Skriv in ditt telenummer, tack: ");
            String telefon_nummer = input.nextLine();
            OrderList orderlist = new OrderList("1"); //(Inte del av grundkrav)
            Kund kund = new Kund(kund_namn , telefon_nummer , orderlist) ;
            int Choice = 0;
            while (Choice != 5) {

                printMeny();
                Choice = readInt();

                switch (Choice) {
                    case 1 -> {
                        // Anropa för att returnera vald kaka
                        Semla semla = (Semla) attSkapa.fixaSemla(kund);

                        // Trigga property-change när den är klar
                        semla.setStatus("Klar");

                        // Kund köper kakan (inte del av grundkraven)
                        kund.buyItem(semla);
                    }
                    case 2 -> {
                        KladdKaka kladdKaka = (KladdKaka) attSkapa.FixaKalddkaka(kund );
                      kladdKaka.setStatus("Klar");
                        kund.buyItem(kladdKaka);
                    }
                    case 3 -> {
                        PrinsesTårta prinsesTårta = (PrinsesTårta) attSkapa.FixaPrinsesTårta(kund);
                      prinsesTårta.setStatus("Klar");
                        kund.buyItem(prinsesTårta);
                    }
                    case 4 -> {
                        System.out.println("Kund : " + kund.getNamn() + ", Telefon: " + kund.getTelefon_nummer() + "\n" + kund.getOrderlist());
                    }
                    case 5 ->  System.out.println("Wälkomen tillbacka , Tack!");

                    // Om användaren väljer utanför 1-5
                    default -> System.out.println("Välj mellan 1-5 tack) ");
                }
            }

            System.exit(0);
        }

        // Kontrollerar användarens inmatning
        private int readInt() {
            int count = 0;
            while (!input.hasNextInt()) {
                input.nextLine();

                count++;
                if (count == 3) {
                    System.out.print("Tyvärr fel inmatning flera gånger");
                    System.exit(0);
                } else {
                    System.out.print("Fel inmatning - testa igen ");
                }
            }

            // Om användaren matar in accepterat värde så returneras det
            int choice = input.nextInt();
            input.nextLine();
            return choice;
        }

        private void printMeny() {
            System.out.println();
            System.out.println("1. Semla");
            System.out.println("2. KladdKaka");
            System.out.println("3. PrinsesTårta");
            System.out.println("4. See order list");
            System.out.println("5. Exit");
            System.out.print("Val: ");
            System.out.println();
        }
    }
