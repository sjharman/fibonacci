package com.sjh.fibonacci

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by SteveHarman on 14/07/2016.
 */

class FibonacciSpec extends Specification {

    @Unroll
    def 'fibonacci returns #result from #input '() {

        when:

            def output = Fibonacci.fibonacci(input)

        then:

            output == result

        where:

            input || result
            -1    || ""
            0     || ""
            1     || "1"
            2     || "1,1"
            3     || "1,1,2"
            4     || "1,1,2,3"
            5     || "1,1,2,3,5"
            6     || "1,1,2,3,5,8"
            7     || "1,1,2,3,5,8,13"
            8     || "1,1,2,3,5,8,13,21"
            9     || "1,1,2,3,5,8,13,21,34"
            10    || "1,1,2,3,5,8,13,21,34,55"

    }

    @Unroll
    def 'generate returns #result from #input'() {

        when:

            def output = Fibonacci.generate(input)

        then:

            output == result

        where:

            input   ||      result
            1       ||      1
            2       ||      1
            3       ||      2
            4       ||      3
            5       ||      5
    }
    def 'efficiency test'(){

        expect:

        Fibonacci.generate(48) == 6765

    }
}