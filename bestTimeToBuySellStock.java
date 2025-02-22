//bestTimeToBuySellStock
public class bestTimeToBuySellStock {
    public static int maxProfit(int[] prices){
        int maxP=0;
        int buyP=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyP){
                buyP=prices[i];
            }
            else if(prices[i]-buyP>maxP){
                maxP=prices[i]-buyP;
            }
        }
        return maxP;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("The maximum profit is: "+maxProfit(prices));  
    }
}
