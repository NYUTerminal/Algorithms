package leetcode;
import java.util.HashMap;

public class CoinChangeMinCoins {
	public int coinChange(int[] coins, int amount) {
		if (amount == 0) {
			return 0;
		}
		int[] cache = new int[amount + 1];

		for (int i = 1; i < cache.length; i++) {

			int min = Integer.MAX_VALUE;
			for (int j = 0; j < i && j < coins.length; j++) {
				if (coins[j] == i) {
					min = Math.min(min, 1);
				} else if (i - coins[j] > 0 && cache[i - coins[j]] != 0) {
					min = Math.min(min, cache[i - coins[j]] + 1);
				}
			}
			if (min != Integer.MAX_VALUE) {
				cache[i] = min;
			}
		}
		return cache[amount] == 0 ? -1 : cache[amount];
	}
	
	
	//MemoryEffecient Solution 
	public int coinChangeMem(int[] coins, int amount) {
        if(amount == 0 ){
            return 0;
        }
        HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
        for(int i =1;i<amount+1;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<i && j<coins.length;j++){
                if(coins[j] == i){
                 min = Math.min(min,1);
                }else if(i-coins[j]>0 && cache.get(i-coins[j])!=null){
                    min = Math.min(min , cache.get(i-coins[j])+1);
                }
            }
            if(min!=Integer.MAX_VALUE){
                cache.put(i,min);
            }
        }
        return cache.get(amount)==null?-1:cache.get(amount);
    }
}
