package Classes;

import java.util.ArrayList;

import static java.util.regex.Pattern.compile;

public class Person extends Data
{
    public static ArrayList<Person> allPersons = new ArrayList<Person>();
    public static ArrayList<String> allPersonsKey = new ArrayList<String>();
    private String name;
    private String family;
    private String nationalId;
    private String birthday;
    private String birthPlace;

    public Person(String name, String family, String nationalId, String birthday, String birthPlace) {

        this.name = name;
        this.family = family;
        this.nationalId = nationalId;
        this.birthday = birthday;
        this.birthPlace = birthPlace;
        key = nationalId;

        allPersons.add(this);
        allPersonsKey.add(nationalId);
    }


    public static ArrayList<Person> getAllPersons() {return allPersons;}
    public String getName() {return name;}
    public String getFamily() {return family;}
    public String getNationalId() {return nationalId;}
    public String getBirthday() {return birthday;}
    public String getBirthPlace() {return birthPlace;}
    public String getKey(){return (String) key;}


    @Override
    public String toString() {
        return "Classes.Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", birthday='" + birthday + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                '}';
    }
}
