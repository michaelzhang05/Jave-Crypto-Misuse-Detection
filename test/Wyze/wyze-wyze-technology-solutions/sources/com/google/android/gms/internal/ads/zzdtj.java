package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdtj<T> implements zzdte<T>, zzdti<T> {
    private static final zzdtj<Object> a = new zzdtj<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final T f14993b;

    private zzdtj(T t) {
        this.f14993b = t;
    }

    public static <T> zzdti<T> a(T t) {
        return new zzdtj(zzdto.b(t, "instance cannot be null"));
    }

    @Override // com.google.android.gms.internal.ads.zzdte, com.google.android.gms.internal.ads.zzdtu
    public final T get() {
        return this.f14993b;
    }
}
