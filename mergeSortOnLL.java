public class mergeSortOnLLbyScratch {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // head creation
    public static Node tail; // tail creation

    public void addFirst(int data) { // function to add a node at the first position
        Node newNode = new Node(data); // create a new node
        if (head == null) { // if the linked list is empty
            head = tail = newNode;
        } else {
            // newNode's next is pointing to the head
            newNode.next = head;
            // make head point to the newNode
            head = newNode;
        }
    } 
    
     //print funcn
     public void print(){
        if(head==null){
            System.out.println("ll is empty");
        }
        Node temp=head;//mke a temp node to traverse on ll ,not change head or tail 
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //func to find mid
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;//we want last elem of first half as mid
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node
    }

    //func to merge both halfs
    public static Node merge(Node headL,Node headR){
        Node temp=new Node(-1);//to traverse 
        Node mergeLL=temp;//to return ll(head of ll with help of this)
        while(headL!=null&&headR!=null){
            if(headL.data<=headR.data){
                temp.next=headL;
                headL=headL.next;
                temp=temp.next;
            }else{
                temp.next=headR;
                headR=headR.next;
                temp=temp.next;
            }
        }
        //for leftout elems of first half
        while(headL!=null){
            temp.next=headL;
            headL=headL.next;
            temp=temp.next;
        }
         //for leftout elems of second half
         while(headR!=null){
            temp.next=headR;
            headR=headR.next;
            temp=temp.next;
        }
        return mergeLL.next;//head of ll( to return ll)
    }

    //func for mergesort
    public static Node mergeS(Node head){
        //base case
        if(head==null||head.next==null){//there is 1 elem,ll is empty
            return head;
        }
        //find mid
        Node mid=findMid(head);
        //split left and right
        Node rightH=mid.next;//initialize right half head
        mid.next=null;//break ll
        Node headL=mergeS(head);//rec for left
        Node headR=mergeS(rightH);//rec for right
        //merge both halfs
        return merge(headL,headR);
    }

    public static void main(String[] args) {
        mergeSortOnLLbyScratch ll=new mergeSortOnLLbyScratch();
        ll.addFirst(2);
        ll.addFirst(7);
        ll.addFirst(4);
        ll.addFirst(1);
        ll.addFirst(9);
        System.out.println("LL before sorting:");
        ll.print();
        System.out.println("LL after sorting:");
        //ll.head=ll.mergeS(ll.head);
    
        ll.print();
    }
}
