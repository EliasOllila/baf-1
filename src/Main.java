public class Main {
    public static void main(String[] args) {

        //hw1
        boolean vac=true;
        boolean week=true;
        boolean late;
        if(week||week==true)
            late=true;
        else
            late=false;
        System.out.println("James sleeping late is "+ late);


        //hw2
        boolean shining=true;
        int time=10;

        if(shining==true && (time<=16 && time>=10))
            System.out.println("Please use sunscreen");

        boolean check;
        int a=20;
        int b=11;
        if(a%10==b%10)
        {
            System.out.println(check=true);
        }
        else
            System.out.println(check=true);


        //hw4
        int i=0;
        boolean found=false;
        while(found==false)
        {
            if(i%387==0 && i%6381==0){
                found=true;
                System.out.println(i);
            }
            else
                i++;
        }




        //hw6
        boolean test=false;
        int pn=5;
        int tpn=pn-1;
        while(tpn>1)
        {
            if(pn%tpn==0)
            {
                test=true;
            }
            else {
                tpn--;
            }
        }
        System.out.println(test);


        //hw7
        boolean A=false, B=false;
        if(A==B)
            System.out.println(true);
        else
            System.out.println(false);

    }
}