package Comparator;

public class Emp {
    private int id;
    private String name;
    private String salary;
    private String add;

    public Emp(int id, String name, String salary, String add) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.add = add;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(String salary){
        this.salary=salary;
    }

    public String getSalary(){
        return salary;
    }

    public void setAdd(String add){
        this.add=add;
    }
    public String getAdd(){
        return add;
    }
    @Override
    public String toString() {
            // TODO Auto-generated method stub
            return "Emp [add=" + add + ", name=" + name + ", salary=" + salary + ", id=" + id + "]";
    }
    

}
