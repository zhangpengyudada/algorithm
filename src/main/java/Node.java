public class Node {

    public static void main(String[] args) {
        //第一步：准备数据
        Node1 root = new Node1("火车头") ;
        Node1 n1 = new Node1("车厢A") ;
        Node1 n2 = new Node1("车厢B") ;
        // 链接节点
        root.setNext(n1);
        n1.setNext(n2);
        //第二步：取出所有数据
        Node1 currentNode = root ;  //从当前根节点开始读取
        while( currentNode !=  null){
            System.out.println(currentNode.getData()) ;
            //将下一个节点设置为当前节点s
            currentNode = currentNode.getNext() ;
        }
    }

}
class Node1 {
    private String data; //用于保存数据
    private Node1 next;   //用于保存下一个节点

    public Node1(String data){  //每一个Node类对象都必须保存有数据
        this.data = data ;
    }

    public void setNext(Node1 next){
        this.next = next ;
    }

    public Node1 getNext(){
        return this.next ;
    }

    public String getData(){
        return this.data ;
    }
}
