/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let min = Number.MAX_VALUE;
    let max = 0;
    
    for(let i = 0;i<prices.length;i++){
        if(min > prices[i]){
            min = prices[i];
        }else{
            max = Math.max(max, prices[i]-min);
        }
    }
    return max;
};
