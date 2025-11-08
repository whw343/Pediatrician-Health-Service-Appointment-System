import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    // 添加预约
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment added for " + appointment.getPatientName());
    }

    // 打印所有预约
    public void printAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }

    // 通过手机号取消预约
    public void cancelAppointmentByPhone(String phone) {
        boolean removed = appointments.removeIf(appointment -> appointment.getPatientPhone().equals(phone));
        if (removed) {
            System.out.println("Appointment with phone " + phone + " has been cancelled.");
        } else {
            System.out.println("No appointment found for phone number: " + phone);
        }
    }
}
