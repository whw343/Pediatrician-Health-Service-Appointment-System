public class GeneralPractitioner extends HealthProfessional {
    private String specialization;

    // 默认构造函数
    public GeneralPractitioner() {
        super();
    }

    // 带参数的构造函数
    public GeneralPractitioner(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    // 打印医生信息
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }

    // Getter 和 Setter
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

