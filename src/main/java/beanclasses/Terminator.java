package beanclasses;




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

    public String sayMyName(){

       return "My nameeeeeee is "+getName();
    }
    public void destroy(){
        System.out.println("Destroy bean Terminator..." );
    }
}
