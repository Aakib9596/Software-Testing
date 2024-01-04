package Assigmnet1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class p16_iterate_arraylist {

	public static void main(String[] args) {
		ArrayList<String>  friends = new ArrayList<String>();
		friends.add("aakib");
		friends.add("makbul");
		friends.add("ajij");
		friends.add("sahil");
		friends.add("tofik");
		friends.add("juned");
		System.out.println(friends);
		for (int f=0 ;f<friends.size();f++) {
			System.out.println(friends.get(f));
		}

		

	}

}
