package com.utils.rx

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.Transformations

/**
 * Created by altafshaikh on 08/02/18.
 */
fun <T> LiveData<T>.observe(owner: LifecycleOwner, observer: (T?) -> Unit) =
        observe(owner, Observer<T> { v -> observer.invoke(v) })

fun <X, Y> LiveData<X>.map(transformer: (X) -> Y): LiveData<Y> =
        Transformations.map(this, { transformer(it) })