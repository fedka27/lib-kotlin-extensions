package com.github.fedka27.lib.kotlin_extentions.rx_extensions

import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


fun <T : Any> Observable<T>.scheduleIOToMainThread(): Observable<T> = this
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun <T : Any> Single<T>.scheduleIOToMainThread(): Single<T> = this
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun Completable.scheduleIOToMainThread(): Completable = this
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())