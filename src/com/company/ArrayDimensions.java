package com.company;

public class ArrayDimensions {

    int arr[] =null;

    //below one is a constructor to create an array and assign default values as integer min
    public  ArrayDimensions(int size){
        this.arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.MIN_VALUE;
        }

    }
    // printing of an arrary, by traversing through
    public void printArray(){
        try{
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }

            }catch(Exception e){
            System.out.println("error has occurred");

        }
    }
    // method to insert a value in a specified index
    public void insertAvalue(int location, int value){

        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=value;
            }else{
                System.out.println("given index has already been occupied, no overriding is possible in this context ");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("cant access the specified index as that doesn't exists");
        }

    }
    // method to search for a given element by traversing through the entire array
    public void searchAvalue(int valueToSearch){
        try{
               for(int i=0;i<arr.length;i++){
                   if(arr[i]==valueToSearch)
                   System.out.println(arr[i]+" present at location "+ i);
            }
            System.out.println("value not found");

        }catch (Exception e){
            System.out.println("value not found");
        }
    }
    //method to delete a value
    public void DeleteAvalue(int location){
        try{
            if(location<=arr.length){
                if(arr[location]!=Integer.MIN_VALUE) {
                    arr[location] = Integer.MIN_VALUE;
                    System.out.println("value has bee deleted succesfully,  after deleted the element, the current value a index is " + arr[location]);
                    System.out.println("");
                }else{
                    System.out.println("specified index has default value");
                }
            }else{
                System.out.println("the location is greater");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid location value, not within the size of an array");
        }
    }
    //method to access a particular element

    public void AccessElement(int location){
        try{
            if(location<=arr.length){
                System.out.println("element present at specified index is "+arr[location]);
                System.out.println();
            }
        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("invalid location value, not within the size of an array");
    }
    }
}
