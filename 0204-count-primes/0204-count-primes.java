// class Solution {
//     public int countPrimes(int n) {
//         if(n==0 || n==1) return 0;
//         boolean isprime[] = new boolean[n];
//         Arrays.fill(isprime,true);
//         isprime[0]=false;

//         isprime[1]=false;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             for(int j=i*i;j<n;j +=i){
//                 isprime[j]=false;
//             }
//         }
//         int c=0;
//         for(int i=0;i<n;i++){
//             if(isprime[i]==true) c++;
//         }
//         return c;
//     }
// }
class Solution {
    public int countPrimes(int n) {
 
        int arr[] = new int[n];
        for(int i=2; i*i<n; i++){
            if(arr[i]==0){
                for(int j=i*i; j<n; j=j+i){
                    arr[j]=1;
                }
            }
        }
        int count = 0;
        for(int i=2; i<n; i++){
            if(arr[i]==0) count++;
        }
        return count;
    }
}

