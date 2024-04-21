class employee{
 int salary = 80000;
 int insentive = 10000;

 void  countsalary()
 {
    System.out.println(salary+insentive);
 }
 

    

}
 public class cla {

    public static void main(String[] args) {
        employee engineer = new employee();
        System.out.println(engineer.salary);
        System.out.println(engineer.insentive);
        
    }
}