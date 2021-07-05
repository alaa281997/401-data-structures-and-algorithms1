

public class App {
    public static void main(String[] args) {

        linkedList ls = new linkedList(new Node(12,null));

        ls.insert(new Node(11,null));


        ls.insert(new Node(14,null));
       

      
     
        
       
        
        ls.show();
        if(ls.search(ls.head,14)){

              System.out.println("True");
        }else{
          System.out.println("False");
        }
        System.out.println(ls.toString());
       
    }
}
