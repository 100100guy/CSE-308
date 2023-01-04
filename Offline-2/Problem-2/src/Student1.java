public class Student1 {
    int expectedmarks;
    int roll;
    ExamController ec;
    ExamScript examScript;

    public Student1(ExamController ec, int marks, int roll) {
        this.expectedmarks = marks;
        this.roll = roll;
        this.ec=ec;
    }

    public int getMark() {
        return expectedmarks;
    }

    public void setMarks(int marks) {
        this.expectedmarks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void print(){
        System.out.println("Marks is : "+ expectedmarks);
    }
    public void reExamine(String msg){
        ec.Send(this,msg);
    }
    public void Notify(String str,int m){
        System.out.println(str);
        expectedmarks=m;
    }
}
