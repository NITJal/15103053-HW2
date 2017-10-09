import java.io.*;
import java.util.*;
public class permutation2 {
StringBuffer reverse1(StringBuffer s,int l,int h)
{while(l<h)
{
char a=s.charAt(l);
s.setCharAt(l,s.charAt(h));
s.setCharAt(h,a);
l++;
h--;
}
return s;
}
int findCeil(StringBuffer s,char first,int l,int h)
{
int ceilindex=l;
for(int i=l+1;i<=h;i++)
if(s.charAt(i)>first&&s.charAt(i)<s.charAt(ceilindex))
	ceilindex=i;
return ceilindex;
}
void swap(StringBuffer s,int l,int h)
{char a=s.charAt(l);
s.setCharAt(l,s.charAt(h));
s.setCharAt(h,a);
	}
void permutet(StringBuffer s)
{permutation p=new  permutation();

boolean isfinished=false;
while(!isfinished)
{
	System.out.println(" "+s);
	int i;
	 for ( i = s.length() - 2; i >= 0; --i )
        if (s.charAt(i) < s.charAt(i+1))
           break;
	 if ( i == -1 )
        isfinished = true;
	 else
    {
        
        int ceilIndex = p.findCeil(s, s.charAt(i), (i + 1), (s.length() - 1));

       
        p.swap( s,i, ceilIndex );

        
       s= p.reverse1( s, i + 1, s.length() - 1 );
    }
	 

}
	

	}
public static void main(String[] args)
{ permutation p=new  permutation();
String s1;
Scanner obj=new Scanner(System.in);
s1=obj.nextLine();
char tempArray[] = s1.toCharArray();
Arrays.sort(tempArray);
String s2=new String(tempArray);
StringBuffer s=new StringBuffer(s2);

for(int i=0;i<s.length();i++)
	for(int j=i;j<s.length();j++)
	{StringBuffer s3=new StringBuffer();
		for(int k=i;k<=j;k++)
	     s3.append(s.charAt(k));
p.permutet(s3);}
}
}


