/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorphcodess;

import java.util.Scanner;
public class Motorphcodess {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //employee input
        long empNum;
        String empName;
        String bday;
        String sup, pos, status, add;
        System.out.printf("Enter Employee no. : ");
        empNum = inp.nextLong();

        //formula - deductions on monthly salary
        double Pagibig, Philhealth, SSS;
        double Salary; //Monthly Salary Variable
        double Salary6 = 0; //For what variable?
        

        //Formula Input - Salary Computations
        double hourSalary, weeklyTime, weeklySalary, overTime;
        //new
        double Hourlyrate, Dailyrate, MonthlySalary, Dayswork, SemiMonthly;
        long late, Days, Absences, Hoursworks;
        int HourMinutes = 60;
        //new
        System.out.println("Enter employee Hourly rate:");
        Hourlyrate = inp.nextDouble(); //Hourly Salary
        Hoursworks = 8; //normal hours
        Dailyrate = Hourlyrate * Hoursworks; //Daily Salary
        System.out.println("Working Days");
        Dayswork = inp.nextDouble(); //Days Worked
        Salary = Dailyrate * Dayswork; //Monthly Salary
        SemiMonthly = Salary / 2; //Semi Monthly
        weeklyTime = Dayswork * Hoursworks; //Weekly Hours Worked
        
        
        //Computations for weekly pay w/ OT and w/o OT
        double regPay = 0, overtimePay = 0, netPay = 0;
        if (weeklyTime <= 40) {
            weeklySalary = weeklyTime * Hourlyrate; //Regular Working Weekly Rate
            overTime = 0;
            regPay = weeklySalary; 
            overtimePay = 0;
            netPay = weeklySalary; //Weekly Pay
            
        } else if(weeklyTime > 40){
            weeklySalary = Hourlyrate * 40 ; //Regular Working Weekly Rate
            overTime = weeklyTime - 40; // overtime hours
            regPay = Hourlyrate * 40;//weekly pay without OT
            overtimePay = (Hourlyrate * overTime) * 2; //OT salary computation
            netPay = regPay + overtimePay; //Weekly Pay with OT
        }

        //Employees
        if (empNum == 1) {
            empName = "Manuel Garcia III";
            bday = "10/11/1983";
            pos = "Chief Executive Officer";
            sup = "N/A";
            status = "Regular";
            add = "Valero Carpark Building Valero Street 1227, Makati City";
        } else if (empNum == 2) {
            empName = "Antonio Lim";
            bday = "06/19/1988";
            pos = "Chief Operating Officer";
            sup = "Garcia, Manuel III";
            status = "Regular";
            add = "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite";
        } else if (empNum == 3) {
            empName = "Bianca Sofia Aquino";
            bday = "08/04/1989";
            pos = "Chief Finance Officer";
            sup = "Garcia, Manuel III";
            status = "Regular";
            add = "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City";
        } else if (empNum == 4) {
            empName = "Isabella Reyes";
            bday = "06/16/1994";
            pos = "Chief Marketing Officer";
            sup = "Garcia, Manuel III";
            status = "Regular";
            add = "460 Solanda Street Intramuros 1000, Manila";
        } else if (empNum == 5) {
            empName = "Eduard  Hernandez";
            bday = "09/23/1989";
            pos = "IT Operations and Systems";
            sup = "Lim, Antonio";
            status = "Regular";
            add = "National Highway, Gingoog,  Misamis Occidental";
        } else if (empNum == 6) {
            empName = "Andrea Mae Villanueva";
            bday = "02/14/1988";
            pos = "HR Manager";
            sup = "Lim, Antonio";
            status = "Regular";
            add = "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ";
        } else if (empNum == 7) {
            empName = "Brad San Jose";
            bday = "03/15/1996";
            pos = "HR Team Leader";
            sup = "Villanueva, Andrea Mae";
            status = "Regular";
            add = "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi";
        } else if (empNum == 8) {
            empName = "Alice Romualdez";
            bday = "05/14/1992";
            pos = "HR Rank and File";
            sup = "San, Jose Brad";
            status = "Regular";
            add = "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte ";
        } else if (empNum == 9) {
            empName = "Rosie Atienza";
            bday = "09/24/1948";
            pos = "HR Rank and File";
            sup = "San, Jose Brad";
            status = "Regular";
            add = "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte";
        } else if (empNum == 10) {
            empName = "Roderick Alvaro";
            bday = "03/30/1988";
            pos = "Accounting Head";
            sup = "Aquino, Bianca Sofia ";
            status = "Regular";
            add = "#284 T. Morato corner, Scout Rallos Street, Quezon City";
        } else if (empNum == 11) {
            empName = "Anthony Salcedo";
            bday = "09/14/1993";
            pos = "Payroll Manager";
            sup = "Alvaro, Roderick";
            status = "Regular";
            add = "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate";
        } else if (empNum == 12) {
            empName = "Josie Lpoez";
            bday = "01/14/1987";
            pos = "Payroll Team Leader";
            sup = "Salcedo, Anthony";
            status = "Regular";
            add = "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro";
        } else if (empNum == 13) {
            empName = "Martha Farala";
            bday = "01/11/1942";
            pos = "Payroll Rank and File";
            sup = "Salcedo, Anthony";
            status = "Regular";
            add = "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte ";
        } else if (empNum == 14) {
            empName = "Leila Martinez";
            bday = "07/11/1970";
            pos = "Payroll Rank and File";
            sup = "Salcedo, Anthony";
            status = "Regular";
            add = "37/46 Kulas Roads, Maragondon 0962 Quirino ";
        } else if (empNum == 15) {
            empName = "Fredrick Romualdez ";
            bday = "03/10/1985";
            pos = "Account Manager";
            sup = "Lim, Antonio";
            status = "Regular";
            add = "22A/52 Lubowitz Meadows, Pililla 4895 Zambales";
        } else if (empNum == 16) {
            empName = "Christian Mata";
            bday = "10/21/1987";
            pos = "Account Team Leader";
            sup = "Romualdez, Fredrick ";
            status = "Regular";
            add = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ";
        } else if (empNum == 17) {
            empName = "Selena De Leon ";
            bday = "02/20/1975";
            pos = "Account Team Leader";
            sup = "Romualdez, Fredrick ";
            status = "Regular";
            add = "89A Armstrong Trace, Compostela 7874 Maguindanao";
        } else if (empNum == 18) {
            empName = "Allison San Jose";
            bday = "06/24/1986";
            pos = "Account Rank and File";
            sup = "Mata, Christian";
            status = "Regular";
            add = "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union";
        } else if (empNum == 19) {
            empName = "Cydney Rosario";
            bday = "10/06/1996";
            pos = "Account Rank and File";
            sup = "Mata, Christian";
            status = "Regular";
            add = "93A/21 Berge Points, Tapaz 2180 Quezon";
        } else if (empNum == 20) {
            empName = "Mark Bautista";
            bday = "02/12/1991";
            pos = "Account Rank and File";
            sup = "Mata, Christian";
            status = "Regular";
            add = "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino";
        } else if (empNum == 21) {
            empName = "Lazaro Darlene";
            bday = "11/25/1985";
            pos = "Account Rank and File";
            sup = "Mata, Christian";
            status = "Probationary";
            add = "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino";
        } else if (empNum == 22) {
            empName = "Kolby Delos Santos";
            bday = "02/26/1980";
            pos = "Account Rank and File";
            sup = "Mata, Christian";
            status = "Probationary";
            add = "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur";
        } else if (empNum == 23) {
            empName = "Vella Santos";
            bday = "12/31/1983";
            pos = "Account Rank and File";
            sup = "Mata, Christian";
            status = "Probationary";
            add = "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur";
        } else if (empNum == 24) {
            empName = "Tomas Del Rosario";
            bday = "12/18/1978";
            pos = "Account Rank and File";
            sup = "Mata, Christian";
            status = "Probationary";
            add = "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque";
        } else if (empNum == 25) {
            empName = "Jacklyn Tolentino";
            bday = "05/19/1984";
            pos = "Account Rank and File";
            sup = "De Leon, Selena";
            status = "Probationary";
            add = "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao";
        } else if (empNum == 26) {
            empName = "Percival Gutierrez";
            bday = "12/18/1970";
            pos = "Account Rank and File";
            sup = "De Leon, Selena";
            status = "Probationary";
            add = "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur";
        } else if (empNum == 27) {
            empName = "Garfield Manalaysay";
            bday = "08/28/1986";
            pos = "Account Rank and File";
            sup = "De Leon, Selena";
            status = "Probationary";
            add = "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur";
        } else if (empNum == 28) {
            empName = "Lizeth Villegas";
            bday = "12/12/1981";
            pos = "Account Rank and File";
            sup = "De Leon, Selena";
            status = "Probationary";
            add = "66/77 Mann Views, Luisiana 1263 Dinagat Islands";
        } else if (empNum == 29) {
            empName = "Carol Ramos";
            bday = "08/20/1978";
            pos = "Account Rank and File";
            sup = "De Leon, Selena";
            status = "Probationary";
            add = "72/70 Stamm Spurs, Bustos 4550 Iloilo";
        } else if (empNum == 30) {
            empName = "Emelia Maceda";
            bday = "04/14/1973";
            pos = "Account Rank and File";
            sup = "De Leon, Selena";
            status = "Probationary";
            add = "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija";
        } else if (empNum == 31) {
            empName = "Delia Aquilar";
            bday = "01/27/1989";
            pos = "Account Rank and File";
            sup = "De Leon, Selena";
            status = "Probationary";
            add = "95 Cremin Junction, Surallah 2809 Cotabato";
        } else if (empNum == 32) {
            empName = "John Rafael Castro";
            bday = "02/09/1992";
            pos = "Sales & Marketing";
            sup = "Reyes, Isabella";
            status = "Regular";
            add = "Hi-way, Yati, Liloan Cebu";
        } else if (empNum == 33) {
            empName = "Carlos Ian Martinez";
            bday = "11/16/1990";
            pos = "Supply Chain and Logistics";
            sup = "Reyes, Isabella";
            status = "Regular";
            add = "Bulala, Camalaniugan";
        } else if (empNum == 34) {
            empName = "Beatiz Santos";
            bday = "08/07/1990";
            pos = "Customer Service and Relations";
            sup = "Reyes, Isabella";
            status = "Regular";
            add = "Agapita Building, Metro Manila";
        } else {
            empName = "Unknown Employee";
            bday = "Unknown Bday";
            pos = "Unknown Position";
            sup = "Unknown Supervisor";
            status = "Unknown Status";
            add = "Unknown Address";
        }
        
        //Incentives Calculations
        System.out.println("Incentives");
        System.out.println("Type Yes or No");
        String Incentives = inp.next();
        long RiceSubsidy = 0, PhoneAllowance = 0, ClothingAllowance = 0;
        double Gross = 0;
        boolean hasIncentives = Incentives.equalsIgnoreCase("yes");
        if (hasIncentives) {
            System.out.println("Enter Rice Subsidy  :");
            RiceSubsidy = inp.nextLong();
            System.out.println("Enter Phone Allowance   :");
            PhoneAllowance = inp.nextLong();
            System.out.println("Enter Clothing Allowance    :");
            ClothingAllowance = inp.nextLong();
            Gross = RiceSubsidy + PhoneAllowance + ClothingAllowance;
            
        } 
        
        //Tardiness Calculations
        double TotalHours = 0; //Total Hours Late
        double GrossDeduction = 0; //Total deductions on Salary
        //changed the late deductions to 2x the hourly rate
        double PerHourLate = 2 * Hourlyrate; //Late Hours deduction rate
        
        System.out.println("Tardiness   :");
        System.out.println("Type Yes or No");
        String Tardiness = inp.next();
        boolean hasTardiness = Tardiness.equalsIgnoreCase("yes");
        if (hasTardiness) {
            System.out.println("Total Hours of late within the month");
            TotalHours = inp.nextDouble();
            GrossDeduction = TotalHours * PerHourLate;
            
        }

        Pagibig = 100; // Pagibig Rate
        Philhealth = 0.03; // PhilHealth Rate
        double SalaryO = Salary * Philhealth; // PhilHealth Deductions
        double Salary4 = 2; // FOR WHAT VARIABLE?
        double Salary5 = SalaryO / Salary4; // FOR WHAT???
        
        //Salary 6 
        if (Salary < 3250) {
            Salary6 = 135.00;
        } else if (Salary >= 3250 && Salary <= 3750) {
            Salary6 = 157.00;

        } else if (Salary >= 3750 && Salary <= 4250) {
            Salary6 = 180.00;

        } else if (Salary >= 4250 && Salary <= 4750) {
            Salary6 = 202.50;

        } else if (Salary >= 4750 && Salary <= 5250) {
            Salary6 = 225.00;

        } else if (Salary >= 5250 && Salary <= 5750) {
            Salary6 = 247.50;

        } else if (Salary >= 5750 && Salary <= 6250) {
            Salary6 = 270.00;

        } else if (Salary >= 6250 && Salary <= 6750) {
            Salary6 = 292.50;

        } else if (Salary >= 6750 && Salary <= 7250) {
            Salary6 = 315.00;

        } else if (Salary >= 7250 && Salary <= 7750) {
            Salary6 = 337.50;

        } else if (Salary >= 7750 && Salary <= 8250) {
            Salary6 = 360.00;

        } else if (Salary >= 8250 && Salary <= 8750) {
            Salary6 = 382.50;

        } else if (Salary >= 8750 && Salary <= 9250) {
            Salary6 = 405.00;

        } else if (Salary >= 9250 && Salary <= 9750) {
            Salary6 = 427.50;

        } else if (Salary >= 9750 && Salary <= 10250) {
            Salary6 = 450.00;

        } else if (Salary >= 10250 && Salary <= 10750) {
            Salary6 = 472.50;

        } else if (Salary >= 10750 && Salary <= 11250) {
            Salary6 = 495.00;

        } else if (Salary >= 11250 && Salary <= 11750) {
            Salary6 = 517.50;

        } else if (Salary >= 11750 && Salary <= 12250) {
            Salary6 = 540.00;

        } else if (Salary >= 12250 && Salary <= 12750) {
            Salary6 = 562.50;

        } else if (Salary >= 12750 && Salary <= 13250) {
            Salary6 = 585.00;

        } else if (Salary >= 13250 && Salary <= 13750) {
            Salary6 = 607.50;

        } else if (Salary >= 13750 && Salary <= 14250) {
            Salary6 = 630.00;

        } else if (Salary >= 14250 && Salary <= 14750) {
            Salary6 = 652.50;

        } else if (Salary >= 14750 && Salary <= 15250) {
            Salary6 = 675.00;

        } else if (Salary >= 15250 && Salary <= 15750) {
            Salary6 = 697.50;

        } else if (Salary >= 15750 && Salary <= 16250) {
            Salary6 = 720.00;

        } else if (Salary >= 16250 && Salary <= 16750) {
            Salary6 = 742.50;

        } else if (Salary >= 16750 && Salary <= 17250) {
            Salary6 = 765.00;

        } else if (Salary >= 17250 && Salary <= 17750) {
            Salary6 = 787.50;

        } else if (Salary >= 17750 && Salary <= 18250) {
            Salary6 = 810.00;

        } else if (Salary >= 18250 && Salary <= 18750) {
            Salary6 = 832.50;

        } else if (Salary >= 18750 && Salary <= 19250) {
            Salary6 = 855.00;

        } else if (Salary >= 19250 && Salary <= 19750) {
            Salary6 = 877.50;

        } else if (Salary >= 19750 && Salary <= 20250) {
            Salary6 = 900.00;

        } else if (Salary >= 20250 && Salary <= 20750) {
            Salary6 = 922.50;

        } else if (Salary >= 20750 && Salary <= 21750) {
            Salary6 = 967.50;

        } else if (Salary >= 21750 && Salary <= 22250) {
            Salary6 = 990.00;

        } else if (Salary >= 22250 && Salary <= 22750) {
            Salary6 = 1012.50;

        } else if (Salary >= 22750 && Salary <= 23250) {
            Salary6 = 1035.00;

        } else if (Salary >= 23250 && Salary <= 23750) {
            Salary6 = 1057.50;

        } else if (Salary >= 23750 && Salary <= 24250) {
            Salary6 = 1080.00;

        } else if (Salary >= 24250 && Salary <= 24750) {
            Salary6 = 1102.50;

        } else if (Salary > 24750) {
            Salary6 = 1125.50;

        } else {
            System.out.println("Error");
        }

        double Deduction2 = Pagibig + Salary5 + Salary6;
        double Deduction = netPay - Deduction2;
        
        String info;
        long withholdingTax = 0;
        
        //Deductions - Witholding Tax
        if (Deduction < 20832) {
            info = "No withholding tax";
        } else if (Deduction >= 20833 && Deduction <= 33333) {
            double DeductionO = Deduction - 20833;
            withholdingTax = (long) (DeductionO * 0.2);
            info = String.format("20%% in excess of 20,833: %.2f", DeductionO);
            
        } else if (Deduction >= 33333 && Deduction <= 66667) {
            double DeductionO = Deduction - 33333;
            withholdingTax = (long) (DeductionO * 0.25 + 2500);
            info = String.format("2,500 plus 25%% in excess of 33,333: %.2f", DeductionO);
            
        } else if (Deduction >= 66667 && Deduction <= 166667) {
            double DeductionO = Deduction - 66667;
            withholdingTax = (long) (DeductionO * 0.3 + 10833);
            info = String.format("10,833 plus 30%% in excess of 66,667: %.2f", DeductionO);
            
        } else if (Deduction >= 166667 && Deduction <= 666667) {
            double DeductionO = Deduction - 166667;
            withholdingTax = (long) (DeductionO * 0.32 + 40833.33);
            info = String.format("40,833.33 plus 32%% in excess over 166,667: %.2f", DeductionO);
            
        } else if (Deduction > 6666677) {
            double DeductionO = Deduction - 666667;
            withholdingTax = (long) (DeductionO * 0.35 + 200833.33);
            info = String.format("200,833.33 plus 35%% in excess of 666,667: %.2f", DeductionO);
            
        } else {
            System.out.println("Error");
            info = "";
        }
        
        //Final Computations (Deduction - GrossDeduction)+ Gross;
        double TaxableIncome = netPay - Deduction2;
        double FinalPay = (((TaxableIncome - withholdingTax)- GrossDeduction)+ Gross);
        
        

        //output
        System.out.println("\n====================");
        System.out.println("===PAYROLL SYSTEM===");
        System.out.println("====================");  

        System.out.printf("\n%-20s: %d%n", "Employee Number", empNum);
        System.out.printf("%-20s: %s%n", "Employee Name", empName);
        System.out.printf("%-20s: %s%n", "Birthday", bday);
        System.out.printf("%-20s: %s%n", "Address", add);
        System.out.printf("%-20s: %s%n", "Position", pos);
        System.out.printf("%-20s: %s%n", "Immediate Supervisor", sup);
        System.out.printf("%-20s: %s%n", "Status", status);

        System.out.println("\n====================");
        System.out.println("=======Salary=======");
        System.out.println("====================");

        System.out.printf("%-15s: %.2f%n", "Hourly Salary", Hourlyrate);
        System.out.printf("%-15s: %.2f%n", "Weekly time", weeklyTime);
        System.out.printf("%-15s: %.2f%n", "Regular Pay", regPay);
        System.out.printf("%-15s: %.2f%n", "Overtime Pay", overtimePay);
        System.out.printf("%-15s: %.2f%n", "Net Pay", netPay);
        if (Gross != 0){
            System.out.printf("%-15s: %.2f%n", "Total Gross", Gross);
        } else {
            System.out.printf("%-15s: %s%n", "Total Gross", "No incentives");
        }
        System.out.printf("%-15s: %.2f%n", "Pagibig", Pagibig);
        System.out.printf("%-15s: %.2f%n", "Philhealth", Salary5);
        System.out.printf("%-15s: %.2f%n", "SSS", Salary6);
        if (GrossDeduction !=0){
            System.out.printf("%-15s: %.2f%n", "Tardiness Deduction", GrossDeduction);
        } else {
            System.out.printf("%-15s: %s%n", "Tardiness Deduction", "No Tardiness");
        }
        System.out.printf("%-15s: %.2f%n", "TOTAL DEDUCTION", Deduction2);
        System.out.printf("%-15s: %.2f%n", "TAXABLE INCOME", TaxableIncome);
        System.out.printf("%-15s: %s%n", "WITHHOLDING TAX INFO", info);
        System.out.printf("%-15s: %,d%n", "WITHHOLDING TAX", withholdingTax);
        System.out.printf("%-15s: %.2f%n", "MONTHLY INCOME", FinalPay); //Change according to what you like on the Final Month Pay


    }
}
