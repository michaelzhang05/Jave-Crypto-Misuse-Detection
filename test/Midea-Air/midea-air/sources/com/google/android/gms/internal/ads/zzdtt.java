package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdtt<T> implements zzdtu<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile zzdtu<T> f14998b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f14999c = a;

    private zzdtt(zzdtu<T> zzdtuVar) {
        this.f14998b = zzdtuVar;
    }

    public static <P extends zzdtu<T>, T> zzdtu<T> a(P p) {
        return ((p instanceof zzdtt) || (p instanceof zzdth)) ? p : new zzdtt((zzdtu) zzdto.a(p));
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final T get() {
        T t = (T) this.f14999c;
        if (t != a) {
            return t;
        }
        zzdtu<T> zzdtuVar = this.f14998b;
        if (zzdtuVar == null) {
            return (T) this.f14999c;
        }
        T t2 = zzdtuVar.get();
        this.f14999c = t2;
        this.f14998b = null;
        return t2;
    }
}
