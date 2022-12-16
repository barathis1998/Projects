/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BARATHI
 */
public class EncounterHistory {
    private ArrayList <Encounter> EncounterHistory;

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }
    public EncounterHistory() {
        
        this.EncounterHistory = new ArrayList <Encounter>();
    }
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        EncounterHistory.add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(Encounter E)
    {
        EncounterHistory.remove(E);
    }
    public void EncounterHistory(int PatientId)
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from EncounterHistory where PatientId='"+PatientId+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery(); 
           System.out.println(st.getRow()); 
             while(st.next())
             {
                 System.out.println("Hi");
                 if (PatientId==st.getInt("PatientId"))
                 {
                     Encounter e=new Encounter();
                    // System.out.println(st.getInt("BloodPressure"));
                     e.setBloodPressure(st.getInt("BloodPressure"));
                     e.setPulse(st.getInt("Pulse"));
                     e.setTemperature(st.getInt("Temperature"));
                     e.setUpdateTime(st.getString("Timing"));
                     EncounterHistory.add(e);
                 }
                 
             }
             
             st.close();
             ps.close();
             con.close();
        } catch (SQLException ex) {
            Logger.getLogger(EncounterHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteEncounterHistory(int PatientId)
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="delete from EncounterHistory where PatientId='"+PatientId+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
             ps.close();
             con.close();
        } catch (SQLException ex) {
            Logger.getLogger(EncounterHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
