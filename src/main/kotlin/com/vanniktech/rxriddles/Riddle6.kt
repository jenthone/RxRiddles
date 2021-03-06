package com.vanniktech.rxriddles

import io.reactivex.Single
import io.reactivex.functions.BiFunction

object Riddle6 {
    /**
     * Execute both [first] and [second] Single's in parallel and provide both results as a pair.
     *
     * Use case: Execute two network requests in parallel and wait for each other and process the combined data.
     */
    fun solve(first: Single<Int>, second: Single<Int>) =
            Single.zip(first, second, BiFunction { f: Int, s: Int -> Pair(f, s) })
}
