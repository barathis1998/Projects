/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.Model;

import java.util.ArrayList;
/**
 *
 * @author BARATHI
 */
public class EmployeeDirectory {
    private ArrayList <Employee> list;
    public EmployeeDirectory()
    {
        this.list=new ArrayList<Employee>();
    }
    public ArrayList<Employee> getEmployeeList()
    {
        return this.list;
    }
    public void setEmployeeList(ArrayList <Employee> list)
    {
        this.list=list;
    }
    public Employee addEmployee()
    {
        Employee emp=new Employee();
        list.add(emp);
        return emp;
    }
    public void deleteEmp(Employee emp)
    {
        list.remove(emp);
    }
    public void updateSelectedEmp(Employee emp)
    {
        list.add(emp);
    }
    public ArrayList<Employee> getEmployeeDirectory()
    {
        return list;
    }
    public void setDirectory(ArrayList<Employee> dict)
    {
        this.list=dict;
    }
   
}
