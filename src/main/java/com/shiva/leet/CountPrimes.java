package com.shiva.leet;

class CountPrimes {

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();

        System.out.println(cp.countPrimes(3));
    }

    //Sieve_of_Eratosthenes
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }
        for (int p = 2; p * p <=n ; p++) {
            if (primes[p] == true){
                for (int i = p * p; i <=n ; i+=p) {
                    primes[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == true){
                count++;
            }
        }
        return count;
    }

    public int countPrimes2(int n) {
        boolean isPrime;
        int count = 0;
        int i = 2;
        while(n > 2 && i <= n) {
            isPrime = checkPrime(i);
            if (isPrime){
                System.out.println("prime : " + i);
                count++;
            }
            i++;
        }
        return count;
        
    }

    private boolean checkPrime(int num) {
        //System.out.println(num);
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                //System.out.println("Not prime : " + i);
                flag = false;
                break;
            }
        }
        return flag;
    }
}