package API;

class P {
	int x, y;

	P(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class C extends P {
	int z;

	C(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof C)) return false;

		C c = (C) obj; return this.x == c.x && this.y == c.y && this.z == c.z;
	}
}

public class EX9_2 {
	public static void main(String[] args) {
		C c1 = new C(10, 20, 30);
		C c2 = new C(10, 20, 30);
		C c3 = new C(10, 30, 20);

		if (c1.equals(c2)) {
			System.out.println("c1==c2");
		} else {
			System.out.println("c1!=c2");
		}

		System.out.println();

		if (c1.equals(c3)) {
			System.out.println("c1==c3");
		} else {
			System.out.println("c1!=c3");
		}
	}

}
