package CollectionFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); //non thread safe
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(200);
        list.add(200);
        list.add(1,10);
        list.addFirst(100);
        list.add(300);
        list.add(250);
        list.add(200);
        list.addLast(500);

        System.out.println("LinkedList: " + list);
//        Iterator<Integer> it = list.iterator();
        Iterator<Integer> it = list.descendingIterator();
        it.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });


        System.out.println(list.get(1)+" "+list.getFirst()+" "+list.getLast()); // 1 100 500
        System.out.println("remove first : "+list.remove()+" remove first: "+list.removeFirst()+" remove last: "+list.removeLast());
        System.out.println(list.remove(new Integer(500))); //true flase
        System.out.println(list.removeLastOccurrence(new Integer(200)));
        System.out.println(list);
        System.out.println(list.removeAll(Arrays.asList(1,2,3,4,200)));
        System.out.println(list);
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer> 100;
            }
        });
        System.out.println(list); //removed int above 100
        System.out.println("peek first : "+list.peek()+" peeklast: "+list.peekLast());
        System.out.println("poop first : "+list.pop()); //pop out from first element
        System.out.println(list.offer(50));
        list.offerFirst(1000);
        list.offerLast(5000);
        System.out.println(list);
        System.out.println("poll  : "+list.poll()+" poll first : "+list.pollFirst()+" poll last : "+list.pollLast()); //pop out from first element
        System.out.println(list);




    }
}
