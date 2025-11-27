package ua.ucu.apps;

public class ATM {
    public void process(int amount){
        Section firstSection = new Section1000();
        firstSection.process(amount);
    }

}
