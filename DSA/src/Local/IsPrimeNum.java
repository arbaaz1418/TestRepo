package Local;

public class IsPrimeNum {
	public boolean isPrime(int n) {
		if (n <= 1)
			return true;
		int tempNum=2;
		while (tempNum * tempNum <= n) {
			if(n % tempNum == 0)
				return true;
			tempNum = tempNum + 1;
		}
		return false;
	}

	public static void main(String[] args) {
		int num=17;
		IsPrimeNum numObj=new IsPrimeNum();
		//if (numObj.isPrime(num)==true?true:false);
		System.out.println(num+" is Prime? :"+numObj.isPrime(num));

	}

}
