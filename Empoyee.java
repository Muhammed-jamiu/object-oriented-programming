public class Empoyee {
    private int baseSalary;
//    public int extraHours;
    public int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary+ (hourlyRate+extraHours);
    };

 public void setBaseSalary(int baseSalary){
     if (baseSalary<=0){
         throw new IllegalArgumentException("Sorry!:Salary can not be zero (0) or less.");
     }
 }
public  void  setHourlyRate(int hourlyRate){
     if (hourlyRate <=5){
         throw  new IllegalArgumentException("Sorry! the hours must not be  less 5 !");
     }
}

    public void setHourlRate(int i) {
    }
}
