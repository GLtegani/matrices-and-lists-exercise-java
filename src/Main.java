import entities.Employee;

import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

//
//      List<Employee> employee = new ArrayList<>();
//      System.out.print("How many employees will be registered? ");
//      int quantity = sc.nextInt();
//
//      for(int i = 0; i < quantity; i++) {
//         System.out.println("Employee #" + (i + 1) + ":");
//         System.out.print("Id: ");
//         Integer id = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Name: ");
//         String name = sc.nextLine();
//         System.out.print("Salary: ");
//         Double salary = sc.nextDouble();
//
//         employee.add(i, new Employee(id, name, salary));
//      }
//
//      System.out.print("Enter the employee id that will have salary increase: ");
//      int employeeId = sc.nextInt();
//
//      Employee employeeIncrease = employee.stream().filter(employee1 -> employee1.getId() == employeeId).findFirst().orElse(null);
//      System.out.println(employeeIncrease);
//      if(employeeIncrease == null) {
//         System.out.println("This id does not exist!");
//      } else {
//         System.out.print("Enter the percentage: ");
//         double percentage = sc.nextDouble();
//
//         employeeIncrease.increaseSalary(percentage);
//      }
//
//
//      System.out.println("List of employees:");
//      for(Employee employer : employee) {
//         System.out.println(employer);
//      }

      System.out.print("Put rows: ");
      Integer rows = sc.nextInt();
      System.out.print("Put columns: ");
      Integer columns = sc.nextInt();
      Integer[][] matriz = new Integer[rows][columns];

      for(Integer rowsF = 0; rowsF < matriz.length; rowsF++) {
         sc.nextLine();
         System.out.println();
         System.out.println("Type values of row #" + (rowsF + 1));
         System.out.println();

         for(Integer columnsF = 0; columnsF < matriz[rowsF].length; columnsF++) {
            System.out.println("Type values of column #" + (columnsF + 1));
            matriz[rowsF][columnsF] = sc.nextInt();
         }
      }

      System.out.print("Enter a position in the matrix you want: ");
      Integer number = sc.nextInt();
      Integer[] positionNumber = new Integer[2];
      Integer left;
      Integer right;
      Integer up;
      Integer down;
      String[] positionsStrings = {"Left: ", "Right: ", "Up: ", "Down: "};

      for(Integer rowsF = 0; rowsF < matriz.length; rowsF++) {
         for(Integer columnsF = 0; columnsF < matriz[rowsF].length; columnsF++) {
            if(matriz[rowsF][columnsF].equals(number)) {
               positionNumber[0] = rowsF;
               positionNumber[1] = columnsF;

               left = columnsF - 1 < 0 ? null : matriz[rowsF][columnsF - 1];
               right = columnsF + 1 >= matriz[rowsF].length ? null : matriz[rowsF][columnsF + 1];
               up = rowsF - 1 < 0 ? null : matriz[rowsF - 1][columnsF];
               down = rowsF + 1 >= matriz.length ? null : matriz[rowsF + 1][columnsF];

               System.out.printf("Position %d,%d: %n", positionNumber[0], positionNumber[1]);

               Integer[] positionsCloseNumber = {left, right, up, down};

               for(Integer i = 0; i < positionsCloseNumber.length; i++) {
                  if(positionsCloseNumber[i] != null) {
                     System.out.printf("%s%d%n", positionsStrings[i], positionsCloseNumber[i]);
                  }
               }
            }
         }
      }

      sc.close();
   }
}
