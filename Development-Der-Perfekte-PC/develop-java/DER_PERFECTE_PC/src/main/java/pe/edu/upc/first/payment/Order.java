package pe.edu.upc.first.payment;
import pe.edu.upc.first.business.Computer;
import pe.edu.upc.first.component.Entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;


public class Order {
    private int trackingNumber;
    private Computer computer;
    private List<Computer> listOrder;

    private List<Computer> shoppingList;
    private long datePurchase;
    private Scanner entrada;
    private String message;


    public Order(){
        this.computer = new Computer();
        this.listOrder = new ArrayList<>();
        this.shoppingList = new ArrayList<>();
        this.entrada = new Scanner(System.in);
    }

    public Order(int trackingNumber, Computer computer, List<Computer> listOrder, List<Computer> shoppingList, long datePurchase, String message) {
        this.trackingNumber = trackingNumber;
        this.computer = computer;
        this.listOrder = listOrder;
        this.shoppingList = shoppingList;
        this.datePurchase = datePurchase;
        this.message = message;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public long getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(long datePurchase) {
        this.datePurchase = datePurchase;
    }

    public List<Computer> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Computer> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public String getMessageOrder() {
        return message;
    }

    public void setMessageOrder(String message) {
        this.message = message;
    }

    public void addComputer(Computer computer){
        listOrder.add(computer);
    }
    public void deleteComputer(){//Delete last
        if(!listOrder.isEmpty()){
            listOrder.remove(listOrder.size() - 1);
        }else{
            System.out.println("ListOrder is empty");
        }
    }
    public void confirmOrder(String message){
        System.out.println("Confirm or Cancel order");
        if((message = entrada.nextLine()) == "Confirm"){
            shoppingList.add(computer);
            listOrder.remove(listOrder.size() - 1);
            System.out.println("Purchase made");
        }
    }
    public void cancelOrder(String message){
        System.out.println("Confirm or Cancel order");
        if((message = entrada.nextLine()) == "Cancel"){
            shoppingList.remove(shoppingList.size() - 1);
            listOrder.add(computer);
            System.out.println("Purchase canceled");
        }
    }
    public void saveChange(String message){
        System.out.println("Save Changes?");
        confirmOrder(message);
        cancelOrder(message);
    }
    public void calcTotal(){
        double price = 0;
        for(Computer c : shoppingList){
            price += (c.getEntity().getPrice());
            return;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "trackingNumber=" + trackingNumber +
                ", computer=" + computer +
                ", listOrder=" + listOrder +
                ", shoppingList=" + shoppingList +
                ", datePurchase=" + datePurchase +
                '}';
    }
    public void showListOrder(){
        System.out.println(listOrder.toString());
    }

    public void toSubscribe() throws IOException {
        System.out.println("Registration to subscription, be a supplier of products");
        buyer.addId();
        buyer.addName(); //pendiente instanciar en buyer
        buyer.addMail();
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

}
