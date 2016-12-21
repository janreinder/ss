package ss.week4;



public class Exercises {
    public static int countNegativeNumbers(int[] arr) {
        // TODO: implement, see exercise P-4.1
    	int counter = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] < 0) {
    			counter = counter + 1;    			
    		}
    	}
    	return counter;
    }

    public static void reverseArray(int[] ints) {
        // TODO: implement, see exercise P-4.2
    	int length = ints.length / 2;
    	
    	for (int i = 0; i < length; i++) {
    		int a = ints[i];
    		ints[i] = ints[ints.length - 1 - i];
    		ints[ints.length - 1 - i] = a;    		
    	}    	
    }

    class SimpleList {
        public class Element { }

        public class Node {
            public Node next;
            public Element element;
        }

        private Node first;

        private Node find(Element element) {
            Node p = first;
            if (p == null) {
                return null;
            }
            while (p.next != null && !p.next.element.equals(element)) {
                p = p.next;
            }
            if (p.next == null) {
                return null;
            } else {
                return p;
            }
        }

        public void remove(Element element) {
            Node p = find(element);
            if (p != null) {
                p.next = p.next.next;
            }
        }
    }
}
