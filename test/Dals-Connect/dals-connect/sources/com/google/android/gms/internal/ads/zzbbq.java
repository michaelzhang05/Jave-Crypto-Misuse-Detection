package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public final class zzbbq<T> extends zzbbr<T> {
    private final T l;

    private zzbbq(T t) {
        this.l = t;
    }

    public static <T> zzbbq<T> g(T t) {
        return new zzbbq<>(t);
    }

    public final void h() {
        b(this.l);
    }
}
