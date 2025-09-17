package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(JuniorDeveloper[] juniorDeveloper){
        this.juniorDeveloper = juniorDeveloper;
    }

    public void addEmployee(MidDeveloper[] midDeveloper){
        this.midDeveloper = midDeveloper;
    }

    public void addEmployee(SeniorDeveloper[] seniorDeveloper){
        this.seniorDeveloper = seniorDeveloper;
    }
}
