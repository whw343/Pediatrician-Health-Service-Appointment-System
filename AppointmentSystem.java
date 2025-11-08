public class AppointmentSystem {
    public static void main(String[] args) {
        System.out.println("==== Health Service Appointment System ====\n");

        // Step 1: 创建医生对象
        HealthProfessional doc1 = new GeneralPractitioner(1, "Dr. Smith", "General Health");
        HealthProfessional doc2 = new Pediatrician(2, "Dr. Brown", "Child Growth & Development");

        // Step 2: 创建预约系统
        AppointmentManager manager = new AppointmentManager();

        // Step 3: 创建并添加预约
        System.out.println("Creating appointments...\n");
        Appointment appt1 = new Appointment("John Doe", "123456789", "09:00 AM", doc1);
        Appointment appt2 = new Appointment("Jane Doe", "987654321", "10:00 AM", doc2);
        manager.addAppointment(appt1);
        manager.addAppointment(appt2);

        // Step 4: 打印所有预约
        System.out.println("\nAll Appointments:");
        manager.printAppointments();

        // Step 5: 取消一个预约
        System.out.println("\nCancelling appointment with phone 123456789...");
        manager.cancelAppointmentByPhone("123456789");

        // Step 6: 打印剩余预约
        System.out.println("\nAppointments after cancellation:");
        manager.printAppointments();

        // Step 7: 测试取消不存在的预约
        System.out.println("\nAttempting to cancel a non-existing appointment...");
        manager.cancelAppointmentByPhone("555555555");

        // Step 8: 结束测试
        System.out.println("\n==== End of Test ====");
    }
}
