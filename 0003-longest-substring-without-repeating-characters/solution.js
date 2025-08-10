/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let n = s.length;
    if(n === 0) return 0;
    let set = new Set();
    let size = 0;
    let left = 0;
    let right = 0;

    for(let char of s){
        while(set.has(char)){
            set.delete(s[left++]);
        }
        set.add(char);
        right++;
        size = Math.max(size, right - left);
    }
    return size;
};
