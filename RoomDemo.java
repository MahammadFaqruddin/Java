class Room{
float length;

float breadth;
float area;
Room(float length){
this.length = this.breadth = length;
}
Room(float length, float breadth){
this.length = length;
this.breadth = breadth;
}
void calculateArea(){
area = length * breadth;
}
float addArea(){
float totalArea =area+20.0f;
return totalArea;
}
void displayTotalArea(float totalArea){
System.out.println("Area="+area);
System.out.println("Total Area="+totalArea);

}
}
public class RoomDemo{
public static void main(String[] args){
Room square = new Room(10.5f);
Room rectangle = new Room(15.2f,6.5f);
square.calculateArea();
rectangle.calculateArea();
float squareTotalArea = square.addArea();
float rectangleTotalArea = rectangle.addArea();


square.displayTotalArea(squareTotalArea);
rectangle.displayTotalArea(rectangleTotalArea);
}
}