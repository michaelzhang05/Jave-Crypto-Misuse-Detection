package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbuz<T> {
    public T a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f13568b;

    public zzbuz(T t, Executor executor) {
        this.a = t;
        this.f13568b = executor;
    }

    public static <T> zzbuz<T> a(T t, Executor executor) {
        return new zzbuz<>(t, executor);
    }
}
