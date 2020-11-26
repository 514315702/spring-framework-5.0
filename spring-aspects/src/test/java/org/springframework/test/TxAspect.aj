package org.springframework.test;

public aspect TxAspect {

    void around () : call (void sayHello ()) {
        System.out.println ("TransactionBegin ");
                proceed() ;
        System.out.println ("Transaction End") ;
    }
}
