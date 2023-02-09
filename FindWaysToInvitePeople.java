public class FindWaysToInvitePeople {
    public static int callGuests(int n){
       if(n<=1){
        return 1;
       }
       
        //single
        int wayes1=callGuests(n-1);

        //pair
        int wayes2 =(n-1)*callGuests(n-2);
        return wayes1 + wayes2;

    }
    public static void main(String args[]){
        int n=4;
        System.out.println(callGuests(n));
    }
}
