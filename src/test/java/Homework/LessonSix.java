package Homework;

public class LessonSix {
    public int sum(){
        return 0;
    }

    public int sum(int a){
        return a;
    }

    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

}

class LessonSixTest{
    public static void main(String[] args) {
        LessonSix a1 = new LessonSix();
        System.out.println(a1.sum());
        System.out.println(a1.sum(1));
        System.out.println(a1.sum(2, 3));
        System.out.println(a1.sum(4, 5, 6));
        System.out.println(a1.sum(7,8,9,10));
    }
}
