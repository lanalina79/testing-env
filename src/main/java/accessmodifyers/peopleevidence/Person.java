package accessmodifyers.peopleevidence;

public class Person {
   public static String nationality="MDA";

   public String name;
   public String surname;
   public int age;
   private long idnp;
   private boolean isRetired;
   protected char sex;

   public Person(String name, String surname, int age, long idnp, boolean isRetired, char sex){
      this.name=name;
      this.surname=surname;
      this.age=age;
      this.idnp=idnp;
      this.isRetired= isRetired;
      this.sex=sex;
   }

   public Person(String name, String surname, char sex){
      this.name=name;
      this.surname=surname;
      this.sex=sex;
   }



   public Person(){
   }

   public long getIdnp(){
      return idnp;
   }

   public boolean getIsRetired(){
      return isRetired;
   }
   public char getSex(){
      return sex;
   }
   public String toString(){
      return this.surname+" "+ this.sex+" "+this.age+" "+this.idnp+" "+this.isRetired;
   }
}
