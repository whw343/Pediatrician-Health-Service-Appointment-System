import java.util.ArrayList; // 导入 ArrayList 类

public class AppointmentSystem {
    public static void main(String[] args) {
        // 创建医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Health");
        Pediatrician pediatrician1 = new Pediatrician(2, "Dr. Brown", "Child Growth & Development");

        // 创建预约列表
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建并添加预约
        appointments.add(new Appointment("John Doe", "123456789", "09:00 AM", gp1));
        appointments.add(new Appointment("Jane Doe", "987654321", "10:00 AM", pediatrician1));

        // 打印所有预约
        System.out.println("All Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
            System.out.println("------------------------------");
        }

        // 取消预约（按手机号取消）
        cancelAppointment(appointments, "123456789");
        System.out.println("Appointments after cancellation:");
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }

    // 取消预约
    public static void cancelAppointment(ArrayList<Appointment> appointments, String phone) {
        appointments.removeIf(appointment -> appointment.getPatientPhone().equals(phone));
        System.out.println("Appointment with phone " + phone + " has been cancelled.");
    }
}
