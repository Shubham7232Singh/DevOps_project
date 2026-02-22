






public class enc{

    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;

        }
    }


    
 public static class LinkListed{

    Node head=null;
    Node tail=null;
    int size=0;

    public void addatfirst(int data){

        Node temp=new Node(data);
        size++;

        if(head==null){

            head=temp;
            tail=temp;
            return;
        }

        temp.next=head;
        head=temp;

    }

    public void insertat(int ind, int data){

        Node temp=new Node(data);
    

        int i=1;
        Node temp2=head;

        if(ind==0){

            temp.next=head;
            head=temp; 
            return;

        }

        while(i<ind){
            
            temp2=temp2.next;
i++;
        
        }

        temp.next=temp2.next;

        temp2.next=temp;
   

    }

    public void delete(){

        
    }





    public void insertatend(int data){

        size++;
      Node temp=new Node(data);
      

    
      if(head==null){
        head=temp;
        tail=temp;

        return;
      }

      

      Node temp2=head;

      while(temp2.next!=null){
        temp2=temp2.next;
       
      }
     
      temp2.next=temp;
 






    }

    public void size(){
        System.out.println(size);
    }


    public void remove(){

        Node temp=head;
        if(head.next==null){
        head=null;
        return;

        }

        while(temp.next.next!=null){

            temp=temp.next;

        }

        temp.next=temp.next.next;

        
    }
    public void get(){

        Node temp=head;

        while (temp.next!=null) {
            System.out.print(temp.data+" ->");
            temp=temp.next;
            
        }
        System.out.print(temp.data);


    }

}




    public static void main(String[] args) {


LinkListed obj=new LinkListed();
obj.insertatend(1);
obj.insertatend(2);
obj.insertatend(3);
obj.insertatend(4);
obj.insertatend(5);
obj.addatfirst(1000);
obj.insertat(0,3000);
obj.remove();

obj.get();



        

        
    }
}