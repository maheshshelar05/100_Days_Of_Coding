class EmployeeGetSet
{

    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary)
    {
        this.empId = empId;
        this.empName = empName;
        setSalary(salary); 
    }

    public void setSalary(double salary)
    {
        if (salary > 0)
        {
            this.salary = salary;
        }
        else
        {
            this.salary = 0;
        }
    }

 
    public int getEmpId()
    {
        return empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public double getSalary()
    {
        return salary;
    }
}
