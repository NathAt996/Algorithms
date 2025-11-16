import java.util.Scanner;

public class Participants {

        String name;
        double score;

        public Participants (String name, double score) {

            this.name = name;
            this.score = score;
        }

        public void DisplayDetails() {

            System.out.println("Name : " + name);
            System.out.println("Score : " + score);
        }

        public static String CapitaliseFirstLetter (String str) {

            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }

        public static void bubbleSort(Participants[] array) {

            int n = array.length;

            for (int i = 0; i < n - 1; i++) {

                for (int j = 0; j < n - i - 1; j++) {

                    if (array[j].score < (array[j + 1].score)) {


                        Participants temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;

                    }
                }
            }
        }


        public static void main(String[] args) {

            Scanner userInput = new Scanner (System.in);

            System.out.println("Enter the total number of participants in the game");
            int elements = userInput.nextInt();

            userInput.nextLine();

            Participants[] participants = new Participants [elements];

            System.out.println("\nEnter the names of the players and their scores");

            //forLoop to get input for each participant


            for (int i = 0; i < participants.length; i++) {

                System.out.println("\nParticipant " + (i + 1) + ":");
                System.out.println("Enter name : ");
                String name = CapitaliseFirstLetter(userInput.next());
                System.out.println("Enter score : ");
                double score = userInput.nextDouble();

                userInput.nextLine();

                participants[i] = new Participants (name, score);
            }


            System.out.println("\nFINAL RESULTS : ");

            bubbleSort(participants);

            for(Participants p : participants) {
                p.DisplayDetails();
            }

            userInput.close();

        }
    }

