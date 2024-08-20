package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker(Double baseSalary, WorkerLevel level, String name) {
        this.baseSalary = baseSalary;
        this.level = level;
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }
    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }
    public Double income(Integer year, Integer morth){
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_month = calendar.get(Calendar.MONTH);
            if (c_year == year && c_month == morth){
                sum += contract.totalValue();
            }
        }
        return sum;
    }

}
