package main;

/*One day, Jamie noticed that many English words only use the letters A and B. Examples of such words include "AB" (short for abdominal), "BAA" (the noise a sheep makes), "AA" (a type of lava), and "ABBA" (a Swedish pop sensation).


 Inspired by this observation, Jamie created a simple game. You are given two s: initial and target. The goal of the game is to find a sequence of valid moves that will change initial into target. There are two types of valid moves:

 Add the letter A to the end of the string.
 Reverse the string and then add the letter B to the end of the string.
 Return "Possible" (quotes for clarity) if there is a sequence of valid moves that will change initial into target. Otherwise, return "Impossible".*/

public class ABBA {

	public static String y = "Possible";
	public static String n = "Impossible";
	public static String A = "A";
	public static String B = "B";

	public String canObtain(String initial, String target) {
		
		String result = n;
		
		if(initial==""||target==""){
			return result;
		}
		int a=target.length()-initial.length();
		if(a<0||a==0){
			return result;
		}
		StringBuilder targetsb=new StringBuilder(target);
		String initials=getinital(a, targetsb);
		if(initials.equals(initial)){
			result=y;
		}
		return result;
	}
	public String getinital(int a,StringBuilder targetsb) {
		if(targetsb.charAt(targetsb.length()-1)=='B'){
			targetsb=targetsb.deleteCharAt(targetsb.length()-1);
			targetsb.reverse();
		}else{
			targetsb=targetsb.deleteCharAt(targetsb.length()-1);
		}
		a--;
		if(a>0){
			return getinital(a, targetsb);
		}else{
			return targetsb.toString();
		}
	}

}
