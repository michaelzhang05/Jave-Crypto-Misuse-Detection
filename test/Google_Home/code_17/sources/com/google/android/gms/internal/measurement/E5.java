package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class E5 implements B5 {
    @Override // com.google.android.gms.internal.measurement.B5
    public final AbstractC2305z5 a(Object obj) {
        android.support.v4.media.a.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final Map b(Object obj) {
        return (C5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final Map c(Object obj) {
        return (C5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final Object d(Object obj) {
        return C5.b().e();
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final Object e(Object obj, Object obj2) {
        C5 c52 = (C5) obj;
        C5 c53 = (C5) obj2;
        if (!c53.isEmpty()) {
            if (!c52.g()) {
                c52 = c52.e();
            }
            c52.c(c53);
        }
        return c52;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final boolean f(Object obj) {
        if (!((C5) obj).g()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final Object g(Object obj) {
        ((C5) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final int h(int i8, Object obj, Object obj2) {
        C5 c52 = (C5) obj;
        android.support.v4.media.a.a(obj2);
        if (c52.isEmpty()) {
            return 0;
        }
        Iterator it = c52.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
