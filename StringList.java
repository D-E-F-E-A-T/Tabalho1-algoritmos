public class StringList {
    public Node header;
    public Node trailer;
    public int count;

    private class Node {
        public String element;
        public Node next;
        public Node prev;

        public Node(String newElement) {
            element = newElement;
            next = null;
            prev = null;
        }
    }

    public StringList() {
        header = new Node(null);
        trailer = new Node(null);

        header.next = trailer;
        trailer.prev = header;

        count = 0;
    }

    public void addNode(String newElement) {
        Node newNode = new Node(newElement);

        newNode.next = trailer;
        newNode.prev = trailer.prev;

        trailer.prev.next = newNode;
        trailer.prev = newNode;

        count++;
    }

    public void removeNodeIn(int position) {
        Node node = header.next;

        for(int i = 1; i < count; i++) {
            node = node.next;

            if(i+1 == position) {
                System.out.println("remover " + node.next.element);
                node.next = node.next.next;
            }
        }
    }

    public void removeWord(String word) {
        Node node = header.next;

        for(int i = 0; i < count-2; i++) {
            node = node.next;

            if(node.next.element.equals(word)){
                node.next = node.next.next;
                count--;
            }
        }
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        Node aux = header.next;

        for(int i = 0; i < count; i++) {
            string.append(aux.element.toString());
            string.append('\n');
            aux = aux.next;
        }

        return string.toString();
    }
}