package com.cmt;

public class Dev {
    private Computer comp;

    public Dev() {}

    public void setComp(Computer comp) {
        this.comp=comp;
    }

    // private Laptop laptop;
    // private Desktop desktop;

    // public Dev(Laptop laptop) {
    //     this.laptop = laptop; 
    // }

    // public void setDesktop(Desktop desktop) {
    //     this.desktop = desktop;
    // }

    public void build() {
        System.out.println("Working on a Spring Project");
        comp.compile();
        // laptop.compile();
        // System.out.println(laptop.getCompany()+ " " + laptop.getModel());
        // desktop.compile();
    }
}
