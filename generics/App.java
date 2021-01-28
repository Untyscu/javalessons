package generics;

import generics.Probe;

// package generics;

public class App{
    public static void main(String[] args) {
        Probe a = new Probe("222");
        Probe b = new Probe(222);
        Probe c = new Probe(22.22);

        System.out.println(b.getType());
        System.out.println(c.getType());
        System.out.println(a.getType());

    }
}