package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzy<T> {
    public final T a;

    /* renamed from: b, reason: collision with root package name */
    public final zzc f15797b;

    /* renamed from: c, reason: collision with root package name */
    public final zzaf f15798c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15799d;

    private zzy(T t, zzc zzcVar) {
        this.f15799d = false;
        this.a = t;
        this.f15797b = zzcVar;
        this.f15798c = null;
    }

    public static <T> zzy<T> a(T t, zzc zzcVar) {
        return new zzy<>(t, zzcVar);
    }

    public static <T> zzy<T> b(zzaf zzafVar) {
        return new zzy<>(zzafVar);
    }

    private zzy(zzaf zzafVar) {
        this.f15799d = false;
        this.a = null;
        this.f15797b = null;
        this.f15798c = zzafVar;
    }
}
