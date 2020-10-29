package com.shiva.coursera;

public class QuickUnion {

	private int[] arr;

	public QuickUnion(int n) {
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	public static void main(String[] args) {
		QuickUnion qf = new QuickUnion(10);
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
		arr[pid] = qid;
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}

}
