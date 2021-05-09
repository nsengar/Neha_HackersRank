
public class JumpingCloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = {0,0,0,1,0,0};
		int jumpCount=0;
		for(int i=0;i<c.length-1;i++) {
			if(c[i]==0) {
				System.out.println("i is "+ i);
				if(i+2<c.length) {
					if(c[i+2]==0) {
						jumpCount=jumpCount+1;
						i=i+1;
					}
					else {
						jumpCount=jumpCount+1;
					}
				}
				else {
					jumpCount=jumpCount+1;
				}
			}
		}

		System.out.println("Jumping Count is "+ jumpCount);
	}

}
