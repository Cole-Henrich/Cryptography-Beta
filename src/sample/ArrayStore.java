package sample;

public class ArrayStore {
        private static String[] Array;
        public ArrayStore(String[] array){
             Array = array;
        }
        public static String[] get(){return Array;}
    }
