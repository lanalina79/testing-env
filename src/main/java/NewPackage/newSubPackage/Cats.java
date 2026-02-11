package NewPackage.newSubPackage;

public class Cats {
    String catColor;
    int catAge;

    public static Cats myCat =new Cats();
    private Cats(){};

    public void defineCat(int catAge,String  catColor){
        this.catColor=catColor;
        this.catAge=catAge;
        System.out.println(
                "This is "+catColor+" cat of "+catAge +" years old");
    }



}
