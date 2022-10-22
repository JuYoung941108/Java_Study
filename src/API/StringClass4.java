package API;
public class StringClass4 {
	public static void main(String[] args) {
		String s="Hello";
		
		// int indexOf(int ch, int pos): 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다. 
		// index는 0부터 시작하며 못찾으면 -1을 반환한다.
		int idx1=s.indexOf('e',0);
		int idx2=s.indexOf('e',2);
		System.out.println(idx1);
		System.out.println(idx2);
	}

}
