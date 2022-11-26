package ru.mirea.task22;

public class Client {
    private AbstractFactory factory;
    private Chair chair;
    public Client(AbstractFactory factory){
        this.factory=factory;
    }
    public void Sit(String chair){
        this.chair=factory.getName(chair);
    }
    public String getChair(){
        return this.chair.getName();
    }
    public static void main(String[] args){
        Client client = new Client(new AbstractFactory());
        client.Sit("Victorian");
        System.out.println("Chair: "+ client.getChair());
    }
}
