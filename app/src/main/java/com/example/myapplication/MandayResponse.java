package com.example.myapplication;

public class MandayResponse {
    private String EstateID;
    private String Estate;
    private String Rollcall;
    private String Mandays;
    private String Attendance;
    private String NoofHarvester;
    private String TotalHarvester;
    private String Productivity;
    private String TotBunchActual;
    private String Budget;
    private String Variance;
    private String tonnageactual;
    private String estimate;
    private String tonnagevariance;

    public MandayResponse(String EstateID, String Estate, String Rollcall, String Mandays, String Attendance,
                          String NoofHarvester, String TotalHarvester, String Productivity, String TotBunchActual,
                          String Budget, String Variance, String tonnageactual, String estimate, String tonnagevariance) {
        this.EstateID = EstateID;
        this.Estate = Estate;
        this.Rollcall = Rollcall;
        this.Mandays = Mandays;
        this.Attendance = Attendance;
        this.NoofHarvester = NoofHarvester;
        this.TotalHarvester = TotalHarvester;
        this.Productivity = Productivity;
        this.TotBunchActual = TotBunchActual;
        this.Budget = Budget;
        this.Variance = Variance;
        this.tonnageactual = tonnageactual;
        this.estimate = estimate;
        this.tonnagevariance = tonnagevariance;
    }

    public String getEstateID() {return EstateID;}
    public void setEstateID(String EstateID) {this.EstateID = EstateID;}

    public String getEstate() {return Estate;}
    public void setEstate(String Estate) {this.Estate = Estate;}

    public String getRollcall() {return Rollcall;}
    public void setRollcall(String Rollcall) {this.Rollcall = Rollcall;}

    public String getMandays() {return Mandays;}
    public void setMandays(String Mandays) {this.Mandays = Mandays;}

    public String getAttendance() {return Attendance;}
    public void setAttendance(String Attendance) {this.Attendance = Attendance;}

    public String getNoofHarvester() {return NoofHarvester;}
    public void setNoofHarvester(String NoofHarvester) {this.NoofHarvester = NoofHarvester;}

    public String getTotalHarvester() {return TotalHarvester;}
    public void setTotalHarvester(String TotalHarvester) {this.TotalHarvester = TotalHarvester;}

    public String getProductivity() {return Productivity;}
    public void setProductivity(String Productivity) {this.Productivity = Productivity;}

    public String getTotBunchActual() {return TotBunchActual;}
    public void setTotBunchActual(String TotBunchActual) {this.TotBunchActual = TotBunchActual;}

    public String getBudget() {return Budget;}
    public void setBudget(String Budget) {this.Budget = Budget;}

    public String getVariance() {return Variance;}
    public void setVariance(String Variance) {this.Variance = Variance;}

    public String getTonnageactual() {return tonnageactual;}
    public void setTonnageactual(String tonnageactual) {this.tonnageactual = tonnageactual;}

    public String getEstimate() {return estimate;}
    public void setEstimate(String estimate) {this.estimate = estimate;}

    public String getTonnagevariance() {return tonnagevariance;}
    public void setTonnagevariance(String tonnagevariance) {this.tonnagevariance = tonnagevariance;}
}
