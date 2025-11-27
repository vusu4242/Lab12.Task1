package ua.ucu.apps;

public class Section1000 extends Section{
    public Section1000(){
        super(1000);
        setNext(new Section500());
    }

}
