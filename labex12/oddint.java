
package lab.ex.pkg12;


public class oddint {
    public static void main(String[]args){
        
        Integer num[]={5,9,6,4,3,21,0};
        od<Integer>obj1=new od<>(num);
        obj1.display();
        
    }
    
}
class od<T >
{
    T[] value1;
    
    public od(T[] value1)
    {
        this.value1=value1;
        
    }
    int c=0;
    public void display()
    {
    for(int i=0; i<value1.length;i++)
    {
        int w =Integer.parseInt(""+ value1[i]);
        if(w%2!=0)
        {
            c++;
            
        }
            
    }
    System.out.println("number of odd numbers in the list : " + c);
    }
}
