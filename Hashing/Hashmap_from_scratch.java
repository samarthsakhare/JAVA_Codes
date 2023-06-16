package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hashmap_from_scratch {

    static class HashMap<K, V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0;i<4;i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunc(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void reHashing(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda>2.0){
                reHashing();
            }
        }

        public V get(K key){
            int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            }
            else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return false;
            }
            else{
                return true;
            }
        }

        public V remove(K key){
            int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            }
            else{
                Node n1 = buckets[bi].remove(di);
                n--;
                return n1.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0 ;j<ll.size();j++){
                    Node n = ll.get(j);
                    keys.add(n.key);
                }
            }

            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public static void display(HashMap map){
            ArrayList<String> keys = map.keySet();

            for(int i=0;i<keys.size();i++){
                System.out.print(keys.get(i) +" "+ map.get(keys.get(i))+"    ");
            }
        }

    }



    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("IND",120);
        map.put("US",30);
        map.put("China",150);
        map.put("PAK",20);
        map.put("JAPAN",35);
        map.put("UK",50);

//        ArrayList<String> keys = map.keySet();
//
//        for(int i=0;i<keys.size();i++){
//            System.out.println(keys.get(i) +" "+ map.get(keys.get(i)));
//        }

        map.display(map);
        map.remove("US");
        System.out.println();
        map.put("IND",130);
        map.display(map);

//        System.out.println(map.remove("US"));
    }
}
