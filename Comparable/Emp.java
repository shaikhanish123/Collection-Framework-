package Comparable;

public class Emp implements Comparable<Emp>{
    private int id;
    private String name;
    private String address;

    public Emp(int id,String name, String address){
  this.id=id;
  this.name=name;
  this.address=address;
    }

    @Override
    public int compareTo(Emp o) {
        return  this.id-o.id;
     
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
