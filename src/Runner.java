import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Put in a Woman's Name");
        Scanner firstWord =new Scanner(System.in);
        String first = firstWord.nextLine();
        System.out.println("Put in a Man's Name");
        Scanner secondWord =new Scanner(System.in);
        String second = secondWord.nextLine();
        System.out.println("Put in a Noun(Place)");
        Scanner thirdWord =new Scanner(System.in);
        String third = thirdWord.nextLine();
        System.out.println("Put in a Verb");
        Scanner fourthWord =new Scanner(System.in);
        String fourth = fourthWord.nextLine();
        System.out.println("Put in a Place");
        Scanner fifthWord =new Scanner(System.in);
        String fifth = fifthWord.nextLine();
        System.out.println("Put in a Verb");
        Scanner sixthWord =new Scanner(System.in);
        String sixth = sixthWord.nextLine();
        System.out.println("Put in a Adjective");
        Scanner seventhWord =new Scanner(System.in);
        String seventh = seventhWord.nextLine();
        System.out.println("Put in a Adverb");
        Scanner eigthWord =new Scanner(System.in);
        String eigth = eigthWord.nextLine();

        System.out.println("What MadLib would you like 'Love', 'Sports', and 'School'. If you want the first one answer 1, if you want the second answer 2 and if you want the third answer 3");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String[] words = {first, second, third, fourth, fifth, sixth, seventh, eigth};
        input(choice, words);
    }

    public static void input(int choice, String[] words){
        String myNuts = "";
        switch (choice){
            case 1:
                myNuts = "Once upon a time there was a woman named " + words[0] + " who loved a big old bald bastard named " + words[1]
                        + ". Every day the lovely couple went to the " + words[2] + " to " + words[3]+ ", and every day when they returned to the " + words[4]
                        + " they would consummate their love. Afterwards they would " + words[5] + " for hours. But one day their big old landlord, who is " + words[6] + " kicked them out on the street. " +
                        "The couple still found a way to make time for each other, and they lived the rest of the their life " + words[7] + ".";
                break;
            case 2:
                myNuts = "One day there was a wahman named " + words[0] + ", and she wanted to train under the esteemed coach" + words[1]+
                        ". She went to the " + words[2] + "to meet the bastard but she was greeted with a surprise. He was literally just "+ words[3] +
                        "ing on the table. So she sat down in the " + words[4]  + " to wait for him. Once he was done "+ words[3] + "ing, he went out to the back of the establishment" +
                        " to " + words[5] + ". When he sat down beside her, he was covered in sweat and just " + words[6] + " in general. When she finally left " +
                        " she thought he created " + words[7] + " an interesting impression.";
                break;
            case 3:
                myNuts = "There was once a vampiress named "+ words[0] + " and she went to a very prestigious vampire school" +
                ". She had a best friend named " + words[1]+ ", and the school was located in "+ words[2]+ ". One day she took out her dick and "+ words[3]+
                ". Everybody in the " + words[4] + " was shocked. Then the vampiress began to "+ words[5] + ". The " + words[4] + " was filled with people who were" +
                words[6] + ". Out of everyone her best friend looked " + words[7] + ".";
                break;
        }
        System.out.println(myNuts);
    }
}
