package accessmodifyers;

import accessmodifyers.peopleevidence.Person;

import java.util.Arrays;

public class ChisinauEvidenceService {
    public static void main(String[] args) {

        Person ionel=new Person("Ionel", "Istrati", 34,73975495l, false, 'M' );
        Person marcel=new Person();

        System.out.println(ionel.getSex() + ionel.getIdnp()+ ionel.name+ionel.surname+ionel.age+ionel.getIsRetired());

        ionel.age=23;
        ionel.name="ionel";
        ionel.surname="Spataru";

        System.out.println(Person.nationality);

        Person.nationality = "Moldavian Edited";

        System.out.println(Person.nationality);



    }
}
