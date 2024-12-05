package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class r1 implements q1 {
    @Override // com.google.android.gms.internal.measurement.q1
    public final Object a(Object obj, Object obj2) {
        zzvp zzvpVar = (zzvp) obj;
        zzvp zzvpVar2 = (zzvp) obj2;
        if (!zzvpVar2.isEmpty()) {
            if (!zzvpVar.b()) {
                zzvpVar = zzvpVar.g();
            }
            zzvpVar.c(zzvpVar2);
        }
        return zzvpVar;
    }

    @Override // com.google.android.gms.internal.measurement.q1
    public final Object b(Object obj) {
        ((zzvp) obj).e();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.q1
    public final p1<?, ?> c(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.q1
    public final Map<?, ?> d(Object obj) {
        return (zzvp) obj;
    }

    @Override // com.google.android.gms.internal.measurement.q1
    public final int e(int i2, Object obj, Object obj2) {
        zzvp zzvpVar = (zzvp) obj;
        if (zzvpVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzvpVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
