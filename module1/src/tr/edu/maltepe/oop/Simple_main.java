package tr.edu.maltepe.oop;

public  class Simple_main {
 public static void main(String []args){
        Cats cat1 = new Cats("kumpir" , 5);
        Cats cat2 = new Cats("patates" , 7);
        cat2.set_name("Mami");
        String catName1 = cat1.get_name();
        String catName2 = cat2.get_name();
        int catAge1 = cat1.get_age();
        int catAge2 = cat2.get_age();
        System.out.println(catName1);
        System.out.println(catAge1);
        System.out.println(catName2);
        System.out.println(catAge2);
        Cats.playMeowSound();



        }
}


