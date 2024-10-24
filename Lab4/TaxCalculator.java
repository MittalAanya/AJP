// Defined the CountryNotValidException here
class CountryNotValidException extends Exception{
    // Its constructor
    public CountryNotValidException(String message){
        super(message);
    }
}

// Defined EmployeeNameInvalidException
class EmployeeNameInvalidException extends Exception{
    // Its constructor
    public EmployeeNameInvalidException(String message){
        super(message);
    }
}

// Defined TaxNotEligibleException
class TaxNotEligibleException extends Exception{
    // Its constructor
    public TaxNotEligibleException(String message){
        super(message);
    }
}

// TaxCalculator class
public class TaxCalculator{
    String empName;
    boolean isIndian;
    double empSal;
    double taxAmount;

    // method for calculating the tax
    public void calculateTax(String empName, double empSal, boolean isIndian) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{

        // If employee is not indian, then throw CountryNotValidException
        if(!isIndian){
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        // If employee name is null or empty, then throw EmployeeNameInvalidException
        else if(empName == null){
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        // If employee salary is greater than 100000 and is indian, then tax is 8%
        else if(empSal > 100000 && isIndian){
            taxAmount = empSal * 8/100;
            System.out.println("Tax amount is : "+taxAmount);
        }

        // If employee salary is between 50k and 1 lakh and is indian, then tax is 6%
        else if(empSal > 50000 && empSal <= 100000 && isIndian){
            taxAmount = empSal * 6/100;
            System.out.println("Tax amount is : "+taxAmount);
        }

        // If employee salary is between 30k and 50k and is indian, then tax is 5%
        else if(empSal > 30000 && empSal <=50000 && isIndian){
            taxAmount = empSal * 5/100;
            System.out.println("Tax amount is : "+taxAmount);
        }

        // If employee salary is between 10k and 30k and is indian, then tax is 4%
        else if(empSal > 10000 && empSal <= 30000 && isIndian){
            taxAmount = empSal * 4/100;
            System.out.println("Tax amount is : "+taxAmount);
        }

        // Otherwises throwing TaxNotEligibleException
        else{
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
    }
    public static void main(String [] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{

        // Making an object of TaxCalculator class
        TaxCalculator tax = new TaxCalculator();

        // Using try-catch to handle exceptions
        try{
            tax.calculateTax("Tim",1000, true);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}