package API;

class Value {
	int v;

	Value(int v) {
		this.v = v;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Value) {
//			Value value = (Value) obj;
//			return this.v == value.v;
//		}
//		return false;
//	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Value)) return false;
		Value value = (Value) obj; return this.v == value.v;
		}
	}

public class EX9_1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		if (v1.equals(v2)) {
			System.out.println("v1==v2");
		} else {
			System.out.println("v1!=v2");
		}

		System.out.println();

		if (v1.equals(v3)) {
			System.out.println("v1==v3");
		} else {
			System.out.println("v1!=v3");
		}
	}
}
