public class Pediatrician extends HealthProfessional {
    private String expertise;

    // 默认构造函数
    public Pediatrician() {
        super();
    }

    // 带参数的构造函数
    public Pediatrician(int id, String name, String expertise) {
        super(id, name);
        this.expertise = expertise;
    }

    // 打印医生信息
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Expertise: " + expertise);
    }

    // Getter 和 Setter
    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
