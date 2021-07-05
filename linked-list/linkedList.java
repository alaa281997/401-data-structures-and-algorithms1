import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 * linkedList
 */
public class linkedList {
Node head;

// create first node
public linkedList(Node head) {
    this.head = head;
  
}

public void insert(Node newNode){
    newNode.next = head;
    head = newNode;
}

public void show() {
    Node n = head;
    while(n != null){
        System.out.println(n.value);
        n=n.next;
    }
 
}

public boolean search(Node head, int x)
{
    Node n = head;   
    while (n != null)
    {
        if (n.value == x)
            return true;  
              n = n.next ;

    }
    return false; 
   
}

public String toString(){
    String result = "";
    Node n = head;

  
    while(n != null){

        result +="{";
        result += n.value;
        result +="}";

        result += " -> ";
       
        n = n.next;
       
    }
    result += "Null";
    return "List: " + result;
}
}