package pe.edu.upc.first.payment;
import pe.edu.upc.first.user.Provider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Subscription{
    private Card card;
    private Provider provider;
    private BufferedReader reader;
    private List<Card> listCard;
    private List<Provider> listProvider;


    public Subscription(){
        this.card = new Card();
        this.provider = new Provider();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.listCard = new ArrayList<Card>();
        this.listProvider = new ArrayList<Provider>();
    }

    public Subscription(Card card, Provider provider, List<Card> listCard, List<Provider> listProvider) {
        this.card = card;
        this.provider = provider;
        this.listCard = listCard;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    //Methods
    public void toSubscribe() throws IOException {
        System.out.println("Registration to subscription, be a supplier of products");
        provider.addId();
        provider.addName();
        provider.addMail();
        provider.addPassword();
        provider.addPhone();
        card.addOwnerName();
        card.addCardNumber();
        card.addCardExDate();
        card.addCardCVV();
        card.addCardBrand();
        System.out.println("U are subscribed, welcome partner");
        listProvider.add(provider);
    }

    public void cancelSubscription(){
        listProvider.remove(listProvider.size() - 1);
    }
    public void addPaymentMethod() throws IOException {
        System.out.println("Add another payment method");
        card.addOwnerName();
        card.addCardNumber();
        card.addCardExDate();
        card.addCardCVV();
        card.addCardBrand();
        listCard.add(card);
    }
    public void deletePaymentMethod(){
        listCard.remove(listCard.size() - 1);
    }
    public void showListCard(){
        System.out.println(listCard.toString());
    }
    public void showListProvider(){
        System.out.println(listProvider.toString());
    }

}