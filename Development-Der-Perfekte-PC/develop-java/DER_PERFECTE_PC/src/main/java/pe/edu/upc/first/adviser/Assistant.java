package pe.edu.upc.first.adviser;
import pe.edu.upc.first.user.Buyer;
import pe.edu.upc.first.business.Computer;
import pe.edu.upc.first.payment.Order;

public class Assistant {
    private Buyer buyer;
    private ComponentFinder componentFinder;
    private ChatBot chatBot;

    private Computer computer;
    private Order order;

    public Assistant(Buyer buyer, ComponentFinder componentFinder, ChatBot chatBot, Computer computer) {
        this.buyer = buyer;
        this.componentFinder = componentFinder;
        this.chatBot = chatBot;
        this.computer = computer;
    }

    public Assistant() {
        this.buyer = new Buyer();
        this.componentFinder = new ComponentFinder();
        this.chatBot = new ChatBot();
        this.computer = new Computer();
        this.order = new Order();
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public ComponentFinder getComponentFinder() {
        return componentFinder;
    }

    public void setComponentFinder(ComponentFinder componentFinder) {
        this.componentFinder = componentFinder;
    }

    public ChatBot getChatBot() {
        return chatBot;
    }

    public void setChatBot(ChatBot chatBot) {
        this.chatBot = chatBot;
    }

    public void run(){
        System.out.println("Welcome"+ buyer.getName() + "to DerPerfektePc\n");
        System.out.println("\nChoose an option.\n" +
                "1 - Meet your ideal computer \n" +
                "2 - ChatBot \n" +
                "3 - Component Finder\n" +
                "4 - See your WishList\n" +
                "5 - Add to WishList\n" +
                "6 - Add to Shopping Cart\n" +
                "7 - See your Shopping Cart\n" +
                "8 - Check in \n" +
                "9 - Be a supplier\n" +
                "10 - See your OrderHistory\n" +
                "11 - Exit");

        int option = 0;
        do{
            option = entrada.nextInt();
            switch (option){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }


        }while(option != 11);
    }
    public void meetIdealComputer(){}

    public void buyAll(){
        computer.addStorage(computer.getStorage());
        computer.addRam(computer.getRam());
        computer.addCase(computer.get_case());
        computer.addGpu(computer.getGpu());
        computer.addMotherboard(computer.getMotherboard());
        order.confirmOrder(order.getMessageOrder());
    }
    public void startComponentFinder(){}
    public void exitAssistant(){}
    public void getClientData(){}
}