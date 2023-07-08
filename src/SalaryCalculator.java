public class SalaryCalculator {
    public int salary(int array[]){
        int salaryAmount = 0 , workingHours = 0;
        for(int iterator = 0 ; iterator < array.length ; iterator++){
            salaryAmount += array[iterator] * 100 ;
            workingHours += array[iterator];
            salaryAmount += (array[iterator] > 8) ? ((array[iterator]-8)*15) : 0;
            if (iterator == 0){
                salaryAmount += (array[iterator]>0) ? ((array[iterator])*100/2) : 0;
            }
            if (iterator == array.length-1){
                salaryAmount += (array[iterator]>0) ? ((array[iterator])*100/4) : 0;
            }
        }
        salaryAmount += (workingHours > 40) ? ((workingHours - 40) * 25) : 0;
        return salaryAmount;
    }
}
