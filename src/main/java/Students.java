public class Students {

    public static void main(String[]args){
        Student s1=new Student();
        s1.setName("MM93");
        s1.setStudentID("2026093");
        s1.setScore(93);
        s1.introduce();

        Student s2=new Student();
        s2.setName(" ");
        s2.setStudentID(" ");
        s2.setScore(0);
        s2.introduce();

        Student s3=new Student("VR46","2026046",46);
        s3.introduce();

        Student s4=new Student("小明","2026001",60);
        s4.introduce();

        GraduateStudent gs1=new GraduateStudent();
        gs1.setName("A");
        gs1.setStudentID("2025001");
        gs1.setScore(90);
        gs1.setAdvisor("TA");
        gs1.introduce();
        gs1.reserch();

        Student gs2=new GraduateStudent();
        gs2.setName("B");
        gs2.setStudentID("2025002");
        gs2.setScore(80);
        gs2.introduce();

        GraduateStudent gs3=new GraduateStudent("C","2025003",70,"TC");
        gs3.introduce();  //正常创建对象，运行成功证明代码无误。
        gs3.reserch();

        Student gs4=new GraduateStudent("D","2025004",60,"TD");
        gs4.introduce();  //用父类引用指向子类对象，输出仍为class GraduateStudent的方法。
//        gs4.reserch();

    }
}



class  Student {

    private String name;  //声名变量
    private String StudentID;
    private int score;

    public Student() {  //声明方法，无参构造。构造方法没有返回值。
        this.name = "无";
        this.StudentID = "无";
        this.score = 0;
    }

    public Student(String name, String StudentID, int score) {  //有参构造
        this.name = name;
        this.StudentID = StudentID;
        this.score = score;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getStudentID() {return StudentID;}
    public void setStudentID(String StudentID) {this.StudentID = StudentID;}
    public int getScore() {return score;}
    public void setScore(int score) {this.score = score;}

    public void introduce() {
        System.out.println("我是" + name + "，学号为" + StudentID + "，成绩为" + score);
    }
}



class GraduateStudent extends Student{

    private String advisor;
    public String getAdvisor(){return advisor;}
    public void setAdvisor(String advisor) {this.advisor=advisor;}

    public GraduateStudent(){
        super();  // 调用父类 Student 的无参构造.必须写在子类构造方法的第一行
    }

    public GraduateStudent(String name, String studentID, int score, String advisor) {
        super(name, studentID, score);   // 先把三个值交给父类初始化
        this.advisor = advisor;          // 再初始化子类自己的属性
    }

    @Override
    public void introduce(){
        System.out.println("我是" + getName() + "，学号为" + getStudentID() + "，成绩为" + getScore() + ",我的导师是" + advisor );
    }

    public void reserch(){
        System.out.println("我在做科研。");}
}