package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class nv extends lv {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f11894c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private nv() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> f(Object obj, long j2, int i2) {
        zzdos zzdosVar;
        List<L> arrayList;
        List<L> g2 = g(obj, j2);
        if (g2.isEmpty()) {
            if (g2 instanceof zzdot) {
                arrayList = new zzdos(i2);
            } else if ((g2 instanceof gw) && (g2 instanceof zzdoj)) {
                arrayList = ((zzdoj) g2).l(i2);
            } else {
                arrayList = new ArrayList<>(i2);
            }
            hx.g(obj, j2, arrayList);
            return arrayList;
        }
        if (f11894c.isAssignableFrom(g2.getClass())) {
            ArrayList arrayList2 = new ArrayList(g2.size() + i2);
            arrayList2.addAll(g2);
            hx.g(obj, j2, arrayList2);
            zzdosVar = arrayList2;
        } else if (g2 instanceof zzdqw) {
            zzdos zzdosVar2 = new zzdos(g2.size() + i2);
            zzdosVar2.addAll((zzdqw) g2);
            hx.g(obj, j2, zzdosVar2);
            zzdosVar = zzdosVar2;
        } else {
            if (!(g2 instanceof gw) || !(g2 instanceof zzdoj)) {
                return g2;
            }
            zzdoj zzdojVar = (zzdoj) g2;
            if (zzdojVar.s()) {
                return g2;
            }
            zzdoj l = zzdojVar.l(g2.size() + i2);
            hx.g(obj, j2, l);
            return l;
        }
        return zzdosVar;
    }

    private static <E> List<E> g(Object obj, long j2) {
        return (List) hx.L(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lv
    public final <L> List<L> a(Object obj, long j2) {
        return f(obj, j2, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lv
    public final <E> void b(Object obj, Object obj2, long j2) {
        List g2 = g(obj2, j2);
        List f2 = f(obj, j2, g2.size());
        int size = f2.size();
        int size2 = g2.size();
        if (size > 0 && size2 > 0) {
            f2.addAll(g2);
        }
        if (size > 0) {
            g2 = f2;
        }
        hx.g(obj, j2, g2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lv
    public final void e(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) hx.L(obj, j2);
        if (list instanceof zzdot) {
            unmodifiableList = ((zzdot) list).j();
        } else {
            if (f11894c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof gw) && (list instanceof zzdoj)) {
                zzdoj zzdojVar = (zzdoj) list;
                if (zzdojVar.s()) {
                    zzdojVar.v();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        hx.g(obj, j2, unmodifiableList);
    }
}
