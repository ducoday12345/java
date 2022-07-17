public class lc_69_sqrt {
    class Solution {
        public int mySqrt(int x) {
            if(x < 2) return x;
            //  int i = 0;
            //  for(i = 0; i < 46341;i++){
            //      if( i*i==x ) return i;
            //      else if (i*i>x) return i-1;
            //  }
            // return i-1;
            long start = 1, end = x, ans = 0;
            while(start<=end){
                long mid = (start+end)/2;
                if (mid*mid == x) return (int)mid;

                if(mid*mid < x){
                    start = mid+1;
                    ans = mid;
                }else{
                    end = mid-1;
                }
            }

            return (int)ans;
        }
    }
}
