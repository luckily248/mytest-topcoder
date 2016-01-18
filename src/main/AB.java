package main;

public class AB {
	public String createString(int N, int K) {
		if (N > 50 || N < 2 || K < 0 || K > N * N / 4) {
			return "";
		}
		StringBuilder resultC=new StringBuilder();
		if(K==0){
			for(int i=0;i<N-1;i++){
				resultC.append("B");
			}
			resultC.append("A");
			return resultC.toString();
		}
		int x = getX(N,K);
		int countA=x-1;
		for(int i=0;i<countA;i++){
			resultC.append("A");
		}
		int countB=x*N-x*x-K;
		for(int i=0;i<countB;i++){
			resultC.append("B");
		}
		resultC.append("A");
		int restB=N-countA-countB-1;
		for(int i=0;i<restB;i++){
			resultC.append("B");
		}
		return resultC.toString();
	}
	public int getX(int N, int K){
		double m = N*N -4*K;
		return (int) Math.ceil((-1*N+Math.sqrt(m))/-2);
	}
}