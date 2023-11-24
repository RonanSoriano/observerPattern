package observerPattern;

import java.util.*;

public class NewsSubscriptionService {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        NewsAgency newsAgency = new NewsAgency();

        System.out.println("Welcome to Real-time News Subscription Service! \n");

        // for future enhancements to categorization of news updates.
        List<String> newsCategories = new ArrayList<>(Arrays.asList("Sports", "Politics", "Business"));

        System.out.println("Current News Categories: " + newsCategories + " \n");

        Subscriber subs1 = new Subscriber("Back Yi-Jin");
        Subscriber subs2 = new Subscriber("Na Hee-Do");
        Subscriber subs3 = new Subscriber("Ko Yu-Rim");

        // Subscribe to newsAgency.
        newsAgency.subscribe(subs1);
        newsAgency.subscribe(subs2);
        newsAgency.subscribe(subs3);

        // store subscriber for Preference's List.
        List<Subscriber> subsList = new ArrayList<>(Arrays.asList(subs1, subs2, subs3));

        // store the current Preference's List, which is "Sports".
        List<String> preferencesList = new ArrayList<>(List.of("Sports"));
        System.out.println("Current Subscriber Preference's List: ");
        for (Subscriber subscriber : subsList) {
            subscriber.modifyPreference(preferencesList);
        }
        System.out.println("=====================================================================================");

        // Current News agency published news
        newsAgency.publishNews("[Sports] Streaking Choco Mucho barges into PVL semis off 5-set comeback over PLDT");

        boolean choice = true;
        while(choice){
            System.out.print("\nDo you want to change your preference? (Y/N): ");
            String userChoiceB = userInput.nextLine();

            // if the user don't want to change their preference. Users are always notified if there is new breaking news.
            if (!userChoiceB.toLowerCase().equals("y")) {
                System.out.println();
                newsAgency.publishNews("[Politics] President Marcos said tensions in the West Philippine Sea are growing!");

                System.out.print("\nDo you want to change your preference? (Y/N): ");
                String userChoiceF = userInput.nextLine();
                if (!userChoiceF.toLowerCase().equals("y")){
                    System.out.println();
                    newsAgency.publishNews("[Business] IT-BPM sector banking on AI to boost productivity!");

                    System.out.print("\nDo you want to change your preference? (Y/N): ");
                    String userChoiceG = userInput.nextLine();
                    if (!userChoiceG.toLowerCase().equals("y")) {
                        newsAgency.publishNews("[Sports] Streaking Choco Mucho barges into PVL semis off 5-set comeback over PLDT");
                        continue;
                    }
                }
            }

            // if user wants to change his/her preferences.
            System.out.println("\nList of Subscribers:");
            System.out.println("1.) Back Yi-Jin");
            System.out.println("2.) Na Hee-Do");
            System.out.println("3.) Ko Yu-Rim");

            System.out.print("\nEnter your Subscriber's name: (Pick 1 - 3) ");
            Integer subscriberName = userInput.nextInt();
            userInput.nextLine();

            switch (subscriberName){
                case 1:
                    System.out.println("\nWhat do you want to do? ");
                    System.out.println("1.) Subscribe");
                    System.out.println("2.) Unsubscribe");
                    System.out.println("3.) Modify your preference");

                    System.out.print("\nChoose 1 - 3 only: ");
                    Integer userChoiceC = userInput.nextInt();
                    userInput.nextLine();
                    switch (userChoiceC){
                        case 1: // if user wants to subscribe.
                            newsAgency.subscribe(subs1);
                            System.out.println();
                            break;
                        case 2: // if user wants to unsubscribe.
                            newsAgency.unsubscribe(subs1);
                            System.out.println();
                            break;
                        case 3: // if user wants to Modify his/her preference.
                            for (Subscriber subscriber : subsList){
                                if (subscriber.getName().matches("Back Yi-Jin")){
                                    System.out.print("\nChoose new preferences [Politics], [Business] only: ");
                                    preferencesList = Arrays.asList(userInput.nextLine().split(","));
                                    subscriber.modifyPreference(preferencesList);
                                    newsAgency.unsubscribe(subs1);
                                    System.out.println();
                                }
                            }
                            break;
                        default: // if the user inputs invalid input.
                            System.out.println("Error! Please input 1 - 3 only. Try again \n");
                    }

                    // Newly published breaking news.
                    newsAgency.publishNews("[Sports] Streaking Choco Mucho barges into PVL semis off 5-set comeback over PLDT");

                    break;

                case 2:
                    System.out.println("\nWhat do you want to do? ");
                    System.out.println("1.) Subscribe");
                    System.out.println("2.) Unsubscribe");
                    System.out.println("3.) Modify your preference");

                    System.out.print("\nChoose 1 - 3 only: ");
                    Integer userChoiceD = userInput.nextInt();
                    userInput.nextLine();
                    switch (userChoiceD){
                        case 1:
                            newsAgency.subscribe(subs2);
                            System.out.println();
                            break;
                        case 2:
                            newsAgency.unsubscribe(subs2);
                            System.out.println();
                            break;
                        case 3:
                            for (Subscriber subscriber : subsList){
                                if (subscriber.getName().matches("Na Hee-Do")){
                                    System.out.print("\nChoose new preferences [Politics], [Business] only: ");
                                    preferencesList = Arrays.asList(userInput.nextLine().split(","));
                                    subscriber.modifyPreference(preferencesList);
                                    newsAgency.unsubscribe(subs2);
                                    System.out.println();
                                }
                            }
                            break;
                        default:
                            System.out.println("Error! Please input 1 - 3 only. Try again \n");
                    }

                    // Newly published breaking news.
                    newsAgency.publishNews("[Politics] President Marcos said tensions in the West Philippine Sea are growing!");

                    break;

                case 3:
                    System.out.println("\nWhat do you want to do? ");
                    System.out.println("1.) Subscribe");
                    System.out.println("2.) Unsubscribe");
                    System.out.println("3.) Modify your preference");

                    System.out.print("\nChoose 1 - 3 only: ");
                    Integer userChoiceE = userInput.nextInt();
                    userInput.nextLine();
                    switch (userChoiceE){
                        case 1:
                            newsAgency.subscribe(subs3);
                            System.out.println();
                            break;
                        case 2:
                            newsAgency.unsubscribe(subs3);
                            System.out.println();
                            break;
                        case 3:
                            for (Subscriber subscriber : subsList){
                                if (subscriber.getName().matches("Ko Yu-Rim")){
                                    System.out.print("\nChoose new preferences [Politics], [Business] only: ");
                                    preferencesList = Arrays.asList(userInput.nextLine().split(","));
                                    subscriber.modifyPreference(preferencesList);
                                    newsAgency.unsubscribe(subs3);
                                    System.out.println();
                                }
                            }
                            break;
                        default:
                            System.out.println("Error! Please input 1 - 3 only. Try again \n");
                    }

                    // Newly published breaking news.
                    newsAgency.publishNews("[Business] IT-BPM sector banking on AI to boost productivity!");

                    break;

                default:
                    System.out.println("Error! Please input 1 - 3 only. Try again \n");
            }

            // prompt the user if he/she wants to run again the program.
            System.out.print("\nWould you like to run again the program? (Y/N): ");
            String userChoiceF = userInput.nextLine();
            System.out.println();

            if (!userChoiceF.toLowerCase().equals("y")) {
                System.out.println("Program Terminated!");
                System.out.println("Programmed by: Ronan D. Soriano | 3 BSCS - 1");
                break;
            }
        }

       userInput.close(); // scanner close.
    }
}
