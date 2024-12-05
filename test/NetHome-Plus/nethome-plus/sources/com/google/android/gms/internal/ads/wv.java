package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class wv implements vv {
    @Override // com.google.android.gms.internal.ads.vv
    public final Object a(Object obj, Object obj2) {
        zzdpe zzdpeVar = (zzdpe) obj;
        zzdpe zzdpeVar2 = (zzdpe) obj2;
        if (!zzdpeVar2.isEmpty()) {
            if (!zzdpeVar.b()) {
                zzdpeVar = zzdpeVar.h();
            }
            zzdpeVar.c(zzdpeVar2);
        }
        return zzdpeVar;
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final Map<?, ?> b(Object obj) {
        return (zzdpe) obj;
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final Object c(Object obj) {
        ((zzdpe) obj).e();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final Object d(Object obj) {
        return zzdpe.g().h();
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final int e(int i2, Object obj, Object obj2) {
        zzdpe zzdpeVar = (zzdpe) obj;
        if (zzdpeVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzdpeVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final uv<?, ?> f(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final boolean g(Object obj) {
        return !((zzdpe) obj).b();
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final Map<?, ?> h(Object obj) {
        return (zzdpe) obj;
    }
}
