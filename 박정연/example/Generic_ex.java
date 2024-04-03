package example;

import java.security.Key;

class Box<T>{
    private T data;
    public  void set(T data){
        this.data=data;
    }
    public T get(){return data;}
}


class Container<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public void set(K key, V value){
        this.key=key;
        this.value=value;
    }
}
public class Generic_ex {
    public static void main(String[] args){
        Box<String> b =new Box<String>();
        Box<Integer> b2=new Box<Integer>();

        b.set("Hello World!");
        b2.set(10);

        System.out.println(b.get());
        System.out.println(b2.get());

        Container<String,String> container1 = new Container<>();
        container1.set("김하나","학생");
        String name = container1.getKey();
        String job = container1.getValue();

        Container<String,Integer> container2 = new Container<>();
        container2.set("나이",23);
        String age = container2.getKey();
        int intAge = container2.getValue();

        System.out.println(container1.getKey()+" : "+container1.getValue());
        System.out.println(container2.getKey()+" : "+container2.getValue());
    }
}
