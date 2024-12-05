package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class ov extends lv {
    private ov() {
        super();
    }

    private static <E> zzdoj<E> f(Object obj, long j2) {
        return (zzdoj) hx.L(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lv
    public final <L> List<L> a(Object obj, long j2) {
        zzdoj f2 = f(obj, j2);
        if (f2.s()) {
            return f2;
        }
        int size = f2.size();
        zzdoj l = f2.l(size == 0 ? 10 : size << 1);
        hx.g(obj, j2, l);
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lv
    public final <E> void b(Object obj, Object obj2, long j2) {
        zzdoj f2 = f(obj, j2);
        zzdoj f3 = f(obj2, j2);
        int size = f2.size();
        int size2 = f3.size();
        if (size > 0 && size2 > 0) {
            if (!f2.s()) {
                f2 = f2.l(size2 + size);
            }
            f2.addAll(f3);
        }
        if (size > 0) {
            f3 = f2;
        }
        hx.g(obj, j2, f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lv
    public final void e(Object obj, long j2) {
        f(obj, j2).v();
    }
}
