package kethua4;

public class Main {
    public static void main(String[] args) {
        //Chạy thử lớp Point
        Point point = new Point();
        point = new Point(10,12);
        System.out.println(point.toString());
        point.setXY(15,20);
        System.out.println(point.toString());

        point = new MoveAblePoint(point.getX(),point.getY(),10,20);
        System.out.println(point.toString());
        ((MoveAblePoint)point).move();
        System.out.println(point.toString());
        //Chạy thử lớp MoveAblePoint
        MoveAblePoint moveAblePoint = new MoveAblePoint(20,20);
        System.out.println(moveAblePoint.toString());
        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());
    }
}
