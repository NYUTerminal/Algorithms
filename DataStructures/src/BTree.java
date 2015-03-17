class Bnode {

/*	Bnode(int data) {
		this.data = data;
		this.llink = null;
		this.rlink = null;
	}*/

	public Bnode() {
		// TODO Auto-generated constructor stub
	}

    int data;
	Bnode llink;
	Bnode rlink;

}

public class BTree {

	private Bnode root = null;

	public static void main(String[] args) {

		BTree bt = new BTree();
		bt.insertInTree(bt.root, 10);
		bt.insertInTree(bt.root, 2);
		bt.insertInTree(bt.root, 8);
		bt.insertInTree(bt.root, 3);
		bt.insertInTree(bt.root, 5);
		bt.insertInTree(bt.root, 1);
		bt.inOrderTraversal(bt.root);
		bt.haveSum(bt.root, 13);
	}

	public void insertInTree(Bnode temp, int data) {
		if (temp == null) {
			temp = new Bnode();
			temp.data = data;
			temp.llink = null;
			temp.rlink = null;
			if (root == null)
				root = temp;
		} else {
			if (temp.data > data) {
				if (temp.llink != null) {
					insertInTree(temp.llink, data);
				} else {
					Bnode newNode = new Bnode();
					newNode.data = data;
					newNode.llink = null;
					newNode.rlink = null;
					temp.llink = newNode;
				}
			} else {

				if (temp.rlink != null) {
					insertInTree(temp.rlink, data);
				} else {
					Bnode newNode = new Bnode();
					newNode.data = data;
					newNode.llink = null;
					newNode.rlink = null;
					temp.rlink = newNode;
				}
			}
		}

	}

	private void inOrderTraversal(Bnode temp) {
		while (temp == null) {
			return;
		}
		inOrderTraversal(temp.llink);
		System.out.println(temp.data);
		inOrderTraversal(temp.rlink);
	}

	public void haveSum(Bnode root, int sum) {
		if (root == null){
			return;
		}
		haveSum(root.llink, sum - root.data);
		if(sum - root.data==0){
			System.out.println("sum exists");
		}
		haveSum(root.rlink, sum - root.data);
	}

}
