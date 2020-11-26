package test;

public aspect TxAspect {


    void around ():call (void sayHelloWorld()) {
        System.out.println ("Transaction Begin ");
        proceed() ;
        System.out.println ("Transaction End") ;
    }
}
