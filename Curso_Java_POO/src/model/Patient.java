package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {


    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private  ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();


    public Patient(String name, String email){
        super(name,email);;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedulable(date,time);
        appointmentDoctors.add(appointmentDoctor);

    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight  + " Kg.";
    }

    @Override
    public String toString() {
        return super.toString() + "model.Patient{" +
                "birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Es un paciente");
        System.out.println("Hisotial completo desde nacimiento");
    }
}
