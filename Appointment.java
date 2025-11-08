public class Appointment {
    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private HealthProfessional doctor;

    // 默认构造函数
    public Appointment() {
    }

    // 带参数的构造函数
    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 打印预约信息
    public void printAppointmentDetails() {
        System.out.println("Patient: " + patientName + ", Phone: " + patientPhone + ", Time Slot: " + timeSlot);
        System.out.print("Doctor Details: ");
        doctor.printDetails();
    }

    // Getter 和 Setter
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}
