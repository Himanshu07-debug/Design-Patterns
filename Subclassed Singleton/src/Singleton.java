public class Singleton {

    // Protected becz you have to extend
    protected int age;
    protected String name;
    private static Singleton singleInstance;

    protected Singleton(){}

    // not making final, will allow child to override it
    public static Singleton getInstance(){         
        if(singleInstance==null)  
          return (singleInstance=new Singleton());
        return singleInstance;
    }
    
    // child override nhi kar payenga yeah method
    final public void setSingletonInstance(int a, String name){
        this.age=a;
        this.name=name;
    }

    final public String toString(){
        return("age=" + age+"   Name="+name);
    }
}

/*public class Singleton {
    private int age;
    private String name;
    private static Singleton singleInstance=null;
    private Singleton(){}
    public static Singleton getInstance(){
      if(singleInstance==null)  
          return new Singleton();
      return singleInstance;
    }
    public void setSingletonInstance(int a, String name){
        this.age=a;
        this.name=name;
    }
    public String toString(){
        return("age=" + age+"           Name="+name);
    }
}
*/