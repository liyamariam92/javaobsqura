class Reverse{
public static void main(String args[]){
int n=432;
int r;
int rev=0;
System.out.println("given number:"+n);
while(n!=0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println("reverse number is:"+rev);

}
}
