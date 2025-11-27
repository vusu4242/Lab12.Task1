package ua.ucu.apps;

public class Section500 extends Section{
    public Section500(){
        super(500);
        setNext(new Section100());
    }

}
