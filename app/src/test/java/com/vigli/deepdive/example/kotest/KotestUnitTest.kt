package com.vigli.deepdive.example.kotest

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KotestUnitTest: BehaviorSpec({
    given("true 가 입력된 상태에서") {
        val input = true
        `when`("1+1 = 2 라는게 맞다면") {
            val result = 1+1 == 2

            then("입력값과 결과는 같다.") {
                result shouldBe true
            }
        }
    }
})