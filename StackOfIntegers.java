
public class StackOfIntegers{
    private int size;
    private int[] elements;
    private int top;

    
    StackOfIntegers()
    {
        this.size = -1;   
        this.top = -1;
        this.elements = new int[16];
        
        
    }

    StackOfIntegers(int capacity)
    {
        this.size = -1 ;
        this.elements = new int[size];
        this.top = -1;
    }

    boolean isEmpty()
    {
        return this.size >= 0 ? false:true;
    }

    int peek()
    {
        return this.elements[this.top];
    }

    void push(int value)
    {
        this.elements[++this.top] = value;
        size++;
    }

    int pop()
    {
        if(!this.isEmpty())
        {
            int value = this.elements[this.size];
            this.elements[this.size] = 0;
            this.size--;
            return value;
        }
        else
            return 0;
    }

    int getSize()
    {
        return size;
    }
    
}