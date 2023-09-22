public class TrainingMethod {
    public static void main(String[] args){

        Telephone samsung = new Telephone(24, "samsung s7", "samsung");

        Telephone iphone = new Telephone(15, "iphone", "iphone 14");

        Marque Oppo = new Marque("Oppo 17");

        System.out.println(iphone.pixels);
        System.out.println(samsung.marque);
        System.out.println(Oppo.nom);

    }
}

class Telephone{
    int pixels;
    String nom;
    String marque;

    public Telephone(int pixels, String nom, String marque){

        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;

    }
}

class Marque{

    String nom;
    public Marque(String nom){

        this.nom = nom;
    }

}

/*

myMethod() is the name of the method

static means that the method belongs to the Main class and not an object of the Main class. You will learn more

about objects and how to access methods through objects later in this tutorial.

void means that this method does not have a return value. You will learn more about return values later in this chapter

*/