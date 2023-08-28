package DAO;

public class Employee {
    private String first_name;
    private String last_name;
    private String gender;
    private Integer age;
    private Integer town;

    public Employee(String first_name,
                    String last_name, String gender,
                    Integer age, Integer town) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.town = town;
    }

    public static void add(Employee employee) {

    }


    public String getFirst_name() {
        return first_name;
    }


    public String getLast_name() {
        return last_name;
    }



    public String getGender() {
        return gender;
    }


    public Integer getAge() {
        return age;
    }

    public Integer getTown() {
        return town;
    }

    public void setTown(Integer town) {
        this.town = town;
    }
}
