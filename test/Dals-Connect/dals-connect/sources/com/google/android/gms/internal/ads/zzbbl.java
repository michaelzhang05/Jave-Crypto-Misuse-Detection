package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public interface zzbbl extends ExecutorService {
    zzbbh<?> J(Runnable runnable);

    <T> zzbbh<T> T(Callable<T> callable);
}
