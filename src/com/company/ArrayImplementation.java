package com.company;

public class ArrayImplementation {

    public static void main(String[] args) {
        ArrayDimensions ad=new ArrayDimensions(10);
        //ad.printArray();

        ad.insertAvalue(3, 55);

        ad.insertAvalue(16, 100);
        ad.printArray();
        ad.AccessElement(3);
        ad.searchAvalue(55);
        ad.DeleteAvalue(3);

    }
}
