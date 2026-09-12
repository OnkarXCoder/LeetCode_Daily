class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int digit:digits){
            freq[digit]++;
        }
        int ans=0;
        for(int fir=1;fir<=9;fir++){
            for(int sec=0;sec<=9;sec++){
                for(int thi=0;thi<=8;thi+=2){
                    if(freq[fir]==0 || freq[sec]==0 ||freq[thi]==0){
                        continue;
                    }
                    if(fir==sec && sec==thi && freq[fir]<3){
                        continue;
                    }
                     if (fir == sec && freq[fir] < 2) {
                        continue;
                    }

                    if (fir == thi && freq[fir] < 2) {
                        continue;
                    }

                    if (sec == thi && freq[sec] < 2) {
                        continue;
                    }
                    ans++;
                }
            }
        }
        return ans;
    }
}