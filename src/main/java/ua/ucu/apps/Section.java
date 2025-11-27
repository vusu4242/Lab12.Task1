package ua.ucu.apps;

public abstract class Section {
    private int denomination;
    private Section next;

    public Section (int denomination){
        this.denomination=denomination;
    }
    public void setNext(Section next){
        this.next=next;
    }

    public void process(int amount){
        int quantity = amount/denomination;
        System.out.println(denomination+"-"+quantity);
        int leftover = amount%denomination;
        if (leftover>0){
            if (next!=null){
                next.process(leftover);

            }else{
                throw new IllegalArgumentException("There is no next section");
            }
        }
    }

}
