package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class k1 extends h1 {
    private k1() {
        super();
    }

    private static <E> zzuu<E> e(Object obj, long j2) {
        return (zzuu) z2.A(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h1
    public final <E> void a(Object obj, Object obj2, long j2) {
        zzuu e2 = e(obj, j2);
        zzuu e3 = e(obj2, j2);
        int size = e2.size();
        int size2 = e3.size();
        if (size > 0 && size2 > 0) {
            if (!e2.H()) {
                e2 = e2.i(size2 + size);
            }
            e2.addAll(e3);
        }
        if (size > 0) {
            e3 = e2;
        }
        z2.f(obj, j2, e3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h1
    public final void b(Object obj, long j2) {
        e(obj, j2).B();
    }
}
