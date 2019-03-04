package oop.Generic;

import java.util.HashMap;

public class KeyValuseGeneric<K,V> extends HashMap<K,V> {
	public static void main(String[] args) {
		KeyValuseGeneric<String,String> kvg= new KeyValuseGeneric<>();
		kvg.put("name","hongkildong");
		String name= kvg.get("name");
	}
}
