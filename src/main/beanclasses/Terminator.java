package main.beanclasses;




public class Terminator {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Terminator(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("Create bean Terminator..." );
    }

    public  void  sayMyName(){

        System.out.println("My nameeeeeee is "+getName());
    }
    public void destroy(){
        System.out.println("Destroy bean Terminator..." );
    }
}
