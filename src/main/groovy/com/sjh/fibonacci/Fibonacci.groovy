package com.sjh.fibonacci

/**
 * Created by SteveHarman on 14/07/2016.
 */
class Fibonacci {
    static def fibonacci(int i) {}

    static int generate(int item) {
        if(item <= 2) {
            1
        }
        else {
            generate(item - 2) + generate(item - 1)
        }
    }
}
