public class ProceduralProgramming {
    public static void main(String[] args){
        //OOP
        var employee = new Empoyee();
        employee.setBaseSalary(-1);
        employee.setBaseSalary(3_000);
        employee.hourlyRate=10;
        employee.setHourlRate(5);
        int New_wage = employee.calculateWage(2);
        System.out.println(New_wage);
//
//
        //procedural programming
//        int baseSalary = 5_0000;
//        int extaHours  = 5;
//        int hourlyRate= 2;
//     int wage = calculateWage(baseSalary,extaHours,hourlyRate);
    }

//    public static int calculateWage(int baseSalary,
//                                    int extraHours,
//                                    int hourlyRate){
//        return baseSalary+ (extraHours*hourlyRate);
//    }
}
