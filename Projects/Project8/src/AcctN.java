
public class AcctN {
	int id;
	String name;
	double balance;
	AcctN left;
	AcctN right;

	AcctN(int id, String name, double balance){
		this.id = id; this.name = name; this.balance = balance;
		left = right = null;
	}
}
