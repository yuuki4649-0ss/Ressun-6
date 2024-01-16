package javaapis.collection.list;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        // いきたい国や場所をリストにする
        ArrayList<String> al = new ArrayList<String>();
        al.add("アイスランド");
        al.add("スペイン");
        al.add("ナポリ");
        al.add("リスボン");
        al.add("ヨセミテ国立公園");
        
        // 指定したデータを取得する
        String place = al.get(2);
        System.out.println(place);
        
        // 要素数を数える
        int listCount = al.size();
        System.out.println(listCount);
        
        // 要素を削除する
        al.remove(2);
        place = al.get(2);
        System.out.println(place);
        
        System.out.println("ループここから");
        
        // 全部出力している
        for(String nation : al) {
            System.out.println(nation);
        }
    }
}
