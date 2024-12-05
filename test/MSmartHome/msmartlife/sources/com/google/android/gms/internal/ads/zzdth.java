package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdth<T> implements zzdte<T>, zzdtu<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile zzdtu<T> f14991b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f14992c = a;

    private zzdth(zzdtu<T> zzdtuVar) {
        this.f14991b = zzdtuVar;
    }

    public static <P extends zzdtu<T>, T> zzdtu<T> a(P p) {
        zzdto.a(p);
        return p instanceof zzdth ? p : new zzdth(p);
    }

    public static <P extends zzdtu<T>, T> zzdte<T> b(P p) {
        if (p instanceof zzdte) {
            return (zzdte) p;
        }
        return new zzdth((zzdtu) zzdto.a(p));
    }

    @Override // com.google.android.gms.internal.ads.zzdte, com.google.android.gms.internal.ads.zzdtu
    public final T get() {
        T t = (T) this.f14992c;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f14992c;
                if (t == obj) {
                    t = this.f14991b.get();
                    Object obj2 = this.f14992c;
                    if (((obj2 == obj || (obj2 instanceof zzdtn)) ? false : true) && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f14992c = t;
                    this.f14991b = null;
                }
            }
        }
        return t;
    }
}
