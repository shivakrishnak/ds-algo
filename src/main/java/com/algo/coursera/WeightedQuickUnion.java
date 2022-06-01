package com.algo.coursera;

public class WeightedQuickUnion {

	private int[] arr;

	public WeightedQuickUnion(int n) {
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	public static void main(String[] args) {
		WeightedQuickUnion qf = new WeightedQuickUnion(10);
		qf.print();
		qf.union(3, 4);
		qf.print();
		qf.union(3, 8);
		qf.print();
		qf.union(6, 5);
		qf.print();
		qf.union(8, 9);
		qf.print();
		qf.union(5, 0);
		qf.print();
		System.out.println(qf.connected(6, 5));
	}

	public int root(int r) {
		while(arr[r] != r)
			r = arr[r];
		return r;
	}
	private boolean connected(int i, int j) {
		return root(i) == root(j);
	}

	private void union(int p, int q) {
		int pid = root(p);
		int qid = root(q);
		if(p == q) return;
		if(arr[pid] < arr[qid]) {
			
		}
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}

}
