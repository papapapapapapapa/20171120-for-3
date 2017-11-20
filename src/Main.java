import com.sun.deploy.util.SyncAccess;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i;
        for (i=2;i<n;i++)
        {
            if (n%i==0)
                break;
        }
        if (i==n)
            System.out.println("YES");
        else
            System.out.println("No");
    }
}
