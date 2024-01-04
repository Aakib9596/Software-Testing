package Assigmnet1;

import java.util.ArrayList;

public class p18_remove_arrayelement {
 public static void main(String[] args) {

		ArrayList<String>  friends = new ArrayList<String>();
		friends.add("aakib");
		friends.add("makbul");
		friends.add("ajij");
		friends.add("sahil");
		friends.add("tofik");
		friends.add("juned");
		System.out.println(friends);
		friends.remove(2);
		System.out.println(friends);
}

}
