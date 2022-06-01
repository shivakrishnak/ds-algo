package com.algo.coursera;

public class QuickFind {

	private int[] arr;

	public QuickFind(int n) {
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	public static void main(String[] args) {
		QuickFind qf = new QuickFind(10);
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

	private boolean connected(int i, int j) {
		return arr[i] == arr[j];
	}

	private void union(int p, int q) {
		int pid = arr[p];
		int qid = arr[q];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == pid) {
				arr[i] = qid;
			}
		}
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}

}
