class Stack{
    int Stack[]=new int[6];
    int tos;
    Stack()
    {
        tos=-1;

    }
    void push(int item)
    {
        if(tos==5)
        System.out.println("Stackmid full");
        else
        Stack[++tos]=item;

    }
    int pop(){
        if(tos<0)
        {
            System.out.println("Stack underflow");
            return 0;

        }
        else
        return Stack[tos--];

    }
} 
class TestStack{
    public static void main(String args[]){
        Stack myStack1=new Stack();
        for(int i=0;i<6;i++)
        myStack1.push(i);
        System.out.println("Stack in myStack1");
        for(int i=0;i<6;i++)
        System.out.println(" "+myStack1.pop());
    }
}