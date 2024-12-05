package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class j1 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f15978c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private j1() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> e(Object obj, long j2, int i2) {
        zzvd zzvdVar;
        List<L> arrayList;
        List<L> f2 = f(obj, j2);
        if (f2.isEmpty()) {
            if (f2 instanceof zzve) {
                arrayList = new zzvd(i2);
            } else if ((f2 instanceof b2) && (f2 instanceof zzuu)) {
                arrayList = ((zzuu) f2).i(i2);
            } else {
                arrayList = new ArrayList<>(i2);
            }
            z2.f(obj, j2, arrayList);
            return arrayList;
        }
        if (f15978c.isAssignableFrom(f2.getClass())) {
            ArrayList arrayList2 = new ArrayList(f2.size() + i2);
            arrayList2.addAll(f2);
            z2.f(obj, j2, arrayList2);
            zzvdVar = arrayList2;
        } else if (f2 instanceof zzxg) {
            zzvd zzvdVar2 = new zzvd(f2.size() + i2);
            zzvdVar2.addAll((zzxg) f2);
            z2.f(obj, j2, zzvdVar2);
            zzvdVar = zzvdVar2;
        } else {
            if (!(f2 instanceof b2) || !(f2 instanceof zzuu)) {
                return f2;
            }
            zzuu zzuuVar = (zzuu) f2;
            if (zzuuVar.H()) {
                return f2;
            }
            zzuu i3 = zzuuVar.i(f2.size() + i2);
            z2.f(obj, j2, i3);
            return i3;
        }
        return zzvdVar;
    }

    private static <E> List<E> f(Object obj, long j2) {
        return (List) z2.A(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h1
    public final <E> void a(Object obj, Object obj2, long j2) {
        List f2 = f(obj2, j2);
        List e2 = e(obj, j2, f2.size());
        int size = e2.size();
        int size2 = f2.size();
        if (size > 0 && size2 > 0) {
            e2.addAll(f2);
        }
        if (size > 0) {
            f2 = e2;
        }
        z2.f(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h1
    public final void b(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) z2.A(obj, j2);
        if (list instanceof zzve) {
            unmodifiableList = ((zzve) list).h();
        } else {
            if (f15978c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof b2) && (list instanceof zzuu)) {
                zzuu zzuuVar = (zzuu) list;
                if (zzuuVar.H()) {
                    zzuuVar.B();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        z2.f(obj, j2, unmodifiableList);
    }
}
