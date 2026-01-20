public class Add {
    public void add(int a, int b){
        System.out.println("Students done sum of "+a+" and "+b+" and got result as "+(a+b));
    }
}
public class Ycce {
    String branch;
    int year;

    public void info(){
        System.out.println("Student is of "+branch+ " Branch and "+" Year");
    }
}
public class Batch {
    int batch_no;
    int lab;
    String course;

    public void practical(){
        System.out.println("Today is "+ lab+" lab of "+course+" of "+batch_no+"batch");
    }
}
public class Main {
    public static void main(String[] args) {
        Batch b1 = new Batch();
        Batch b2 = new Batch();
        Batch b3 = new Batch();
        Add a1 = new Add();
        Add a2 = new Add();
        Add a3 = new Add();
        Ycce y1 = new Ycce();
        Ycce y2 = new Ycce();
        Ycce y3 = new Ycce();
        b1.course = "Java";
        b2.course = "Python";
        b3.course = "OS";
        b1.batch_no = 1;
        b2.batch_no = 2;
        b3.batch_no = 3;
        b1.lab = 2;
        b2.lab = 4;
        b3.lab = 6;
        b1.practical();
        b2.practical();
        b3.practical();
        a1.add(15,13);
        a2.add(16,19);
        a3.add(34,89);
        y1.branch = "AIDS";
        y2.branch = "CT";
        y3.branch = "IOT";
        y1.year = 2;
        y2.year = 2;
        y3.year = 2;
        y1.info();
        y2.info();
        y3.info();
    }
}
