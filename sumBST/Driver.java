package sumBST;

import java.util.Scanner;

import sumBST.FindPair.Node;

public class Driver {

public static void main(String[] args) {
		
		Node root = null;
		
		FindPair fp = new FindPair();
		
		root = fp.insert(root,40);
		root = fp.insert(root,20);
		root = fp.insert(root,60);
		root = fp.insert(root,10);
		root = fp.insert(root,30);
		root = fp.insert(root,50);
		root = fp.insert(root,70);
		
		System.out.println("Please enter the Sum you wish to find the pair for-");
		
		try (Scanner sc = new Scanner(System.in)) {
			int sum = sc.nextInt();
			
			fp.findPairWithGivenSum(root,sum);
		}
		
	}

}
