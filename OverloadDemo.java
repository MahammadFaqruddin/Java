
class Overload{
    void test(){
        System.out.println("No Parameter");

    }
    void test(int a){
        System.out.println("a:"+a);
    }
}
class OverloadDemo{
    public static void main(String args[]){
        Overload ob=new Overload();
        ob.test();
        ob.test(10);
    }
}