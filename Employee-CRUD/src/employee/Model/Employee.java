/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.Model;

import java.util.Date;

/**
 *
 * @author BARATHI
 */
public class Employee {
    private String name;
    private int employeeId;
    private int age;
    private Date startDate;
    private String level;
    private String teamInfo;
    private String positionTitle;
    private long phNumber;
    private String emailAddress;
    private String gender;
    private String image;
    
    public String getImage()
    {
        return this.image;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getName()
    {
        return this.name;
    }
    public int getemployeeId()
    {
        return this.employeeId;
    }
    public int getAge()
    {
        return this.age;
    }
    public Date getStartDate()
    {
        return this.startDate;
    }
    public String getLevel()
    {
        return this.level;
    }
    public String getTeamInfo()
    {
        return this.teamInfo;
    }
    public String getPositionTitle()
    {
        return this.positionTitle;
    }
    public long getPhNumber()
    {
        return this.phNumber;
    }
    public String getEmailAddress()
    {
        return this.emailAddress;
    }
    public void setName(String name)
    {
         this.name=name;
    }
    public void setEmployeeId(int empId)
    {
        this.employeeId=empId;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setStartDate(Date sDate)
    {
        this.startDate=sDate;
    }
    public void setLevel(String lvl)
    {
        this.level=lvl;
    }
    public void setTeamInfo(String teamInfo)
    {
        this.teamInfo=teamInfo;
    }
    public void setPositionTitle(String position)
    {
        this.positionTitle=position;
    }
    public void setPhNumber(long phNo)
    {
        this.phNumber=phNo;
    }
    public void setEmailAddress(String email)
    {
        this.emailAddress=email;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setImage(String image)
    {
        this.image=image;
    }
}
