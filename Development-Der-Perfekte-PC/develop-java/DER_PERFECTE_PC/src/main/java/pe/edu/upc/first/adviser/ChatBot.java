package pe.edu.upc.first.adviser;
import java.util.Scanner;
import pe.edu.upc.first.user.Buyer;

public class ChatBot {
    private String message;
    private String question;
    private Scanner entrada;
    private Buyer buyer;


    public ChatBot(String message, String question, Scanner entrada, Buyer buyer) {
        this.message = message;
        this.question = question;
        this.entrada = entrada;
        this.buyer = buyer;
    }

    public ChatBot() {
        this.entrada =  new Scanner(System.in);
        this.buyer = new Buyer();
    }

    //Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void run(String question, String message) {
        System.out.println("\nWelcome" + buyer.getName() + " my name is JuanBot, please choose a option\n" +
                "1 - Make a question\n" +
                "2 - Send a message\n" +
                "3 - Make a question\n" +
                "4 - Exit chatbot");
        int option = 0;
        do{
            option = entrada.nextInt();
            switch (option){
                case 1:
                    askBot(question);
                    showResponse();
                    break;
                case 2:
                    sendMessageBot(message);
                    break;
                case 3:
                    editProductName(name);
                    break;
                case 4:
                    break;
            }


        }while(option != 4);
    }

    public String sendMessageBot(String message) {
        System.out.println("Send ur message");
        message = entrada.nextLine();
        return message;
    }

    public String askBot(String question) {
        System.out.println("Make ur question");
        question = entrada.nextLine();
        return question;
    }

    public void showResponse() {
        System.out.println("Bot Response");
    }

}