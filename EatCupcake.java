import  java.util.Scanner;

public class EatCupcake {

    public static void main(String[] args) {

            Scanner scan1 = new Scanner(System.in);
            System.out.println("Did anyone see you?");
            String answer1 = scan1.next();
            if (answer1.equals("YES.")) {
               // Scanner scan2 = new Scanner(System.in);
                System.out.println("Was it a boss/lover/parent?");
                String answer2 = scan1.next();
                if (answer2.equals("YES.")) {
                   // Scanner scan3 = new Scanner(System.in);
                    System.out.println("Was it expensive?");
                    String answer3 = scan1.next();
                    if (answer3.equals("YES.")) {
                      //  Scanner scan4 = new Scanner(System.in);
                        System.out.println("Can you cut off the part that touched the floor?");
                        String answer4 = scan1.next();
                        if (answer4.equals("YES.")) {
                            System.out.println("EAT IT.");
                        } else {
                            System.out.println("YOUR CALL");
                        }
                    } else if (answer3.equals("NO.")) {
                      //  Scanner scan5 = new Scanner(System.in);
                        System.out.println("Is it chocolate?");
                        String answer5 = scan1.next();
                        if (answer5.equals("YES.")) {
                            System.out.println("EAT IT.");
                        } else {
                            System.out.println("DON'T EAT IT");
                        }
                    }
                }
                else {
                    System.out.println("EAT IT.");
                }
            }
            else if (answer1.equals("NO.")) {
               // Scanner scan6 = new Scanner(System.in);
                System.out.println("Was it sticky?");
                String answer6 = scan1.next();
                if (answer6.equals("YES.")) {
                  //  Scanner scan7 = new Scanner(System.in);
                    System.out.println("Is it a raw steak?");
                    String answer7 = scan1.next();
                    if (answer7.equals("YES.")){
                     //   Scanner scan8 = new Scanner(System.in);
                        System.out.println("Are you a Puma?");
                        String answer8 = scan1.next();
                        if (answer8.equals("YES.")){
                            System.out.println("EAT IT.");
                        }
                        else{
                            System.out.println("DON'T EAT IT");
                        }
                    }
                    else if (answer7.equals("NO.")) {
                     //   Scanner scan9 = new Scanner(System.in);
                        System.out.println("Did the cat lick it?");
                        String answer9 = scan1.next();
                        if (answer9.equals("YES.")) {
                        //    Scanner scan10 = new Scanner(System.in);
                            System.out.println("Is your cat healthy?");
                            String answer10 = scan1.next();
                            if (answer10.equals("YES.")) {
                                System.out.println("EAT IT.");
                            }
                            else {
                                System.out.println("YOUR CALL");
                            }
                        }
                        else if (answer9.equals("NO.")) {
                            System.out.println("EAT IT.");
                        }
                    }
                }
                else if (answer6.equals("NO.")){
                 //   Scanner scan11 = new Scanner(System.in);
                    System.out.println("Is it an Emausaurus?");
                    String answer11 = scan1.next();
                    if (answer11.equals("YES.")){
                    //    Scanner scan12 = new Scanner(System.in);
                        System.out.println("Are you a Megalosaurus?");
                        String answer12 = scan1.next();
                        if (answer12.equals("YES.")){
                            System.out.println("EAT IT.");
                        }
                        else{
                            System.out.println("DON'T EAT IT");
                        }
                    }
                    else if (answer11.equals("NO.")){
                    //    Scanner scan13 = new Scanner(System.in);
                        System.out.println("Did the cat lick it?");
                        String answer13 = scan1.next();
                        if (answer13.equals("YES.")){
                         //   Scanner scan14 = new Scanner(System.in);
                            System.out.println("Is your cat healthy?");
                            String answer14 = scan1.next();
                            if (answer14.equals("YES.")){
                                System.out.println("EAT IT.");
                            }
                            else {
                                System.out.println("YOUR CALL");
                            }
                        }
                        else {
                            System.out.println("EAT IT.");
                        }
                    }
                }
            }
        }

    }


