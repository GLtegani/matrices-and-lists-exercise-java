package entities;

public class Employee {
   private Integer id;
   private String name;
   private Double salary;

   public Employee() {
   }

   public Employee(Integer id, String name, Double salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Double getSalary() {
      return salary;
   }

   public void increaseSalary(double percentage) {
      this.salary += percentage / 100 * this.salary;
   }


   @Override
   public String toString() {
      return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary);
   }
}
