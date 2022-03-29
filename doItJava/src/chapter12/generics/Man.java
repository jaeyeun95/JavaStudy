package chapter12.generics;

public class Man <T>{
    private T name;
    private T bloodtype;

    public T getName(){
        return name;
    }

    public void setName(T name){
        this.name = name;
    }

    public T getBloodtype(){
        return bloodtype;
    }
    public void setBloodtype(T bloodtype){
        this.bloodtype = bloodtype;
    }
}
