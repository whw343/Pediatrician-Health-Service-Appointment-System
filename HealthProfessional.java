public class HealthProfessional {
    private int id;
    private String name;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 带参数的构造函数
    public HealthProfessional(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 打印健康专业人员信息
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Getter 和 Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

