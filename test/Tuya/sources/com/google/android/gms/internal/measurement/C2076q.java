package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2076q extends AbstractC2028k implements InterfaceC2052n {

    /* renamed from: c, reason: collision with root package name */
    protected final List f15842c;

    /* renamed from: d, reason: collision with root package name */
    protected final List f15843d;

    /* renamed from: e, reason: collision with root package name */
    protected T1 f15844e;

    private C2076q(C2076q c2076q) {
        super(c2076q.f15749a);
        ArrayList arrayList = new ArrayList(c2076q.f15842c.size());
        this.f15842c = arrayList;
        arrayList.addAll(c2076q.f15842c);
        ArrayList arrayList2 = new ArrayList(c2076q.f15843d.size());
        this.f15843d = arrayList2;
        arrayList2.addAll(c2076q.f15843d);
        this.f15844e = c2076q.f15844e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        T1 a8 = this.f15844e.a();
        for (int i8 = 0; i8 < this.f15842c.size(); i8++) {
            if (i8 < list.size()) {
                a8.e((String) this.f15842c.get(i8), t12.b((r) list.get(i8)));
            } else {
                a8.e((String) this.f15842c.get(i8), r.f15866c0);
            }
        }
        for (r rVar : this.f15843d) {
            r b8 = a8.b(rVar);
            if (b8 instanceof C2091s) {
                b8 = a8.b(rVar);
            }
            if (b8 instanceof C2004h) {
                return ((C2004h) b8).a();
            }
        }
        return r.f15866c0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k, com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C2076q(this);
    }

    public C2076q(String str, List list, List list2, T1 t12) {
        super(str);
        this.f15842c = new ArrayList();
        this.f15844e = t12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f15842c.add(((r) it.next()).g());
            }
        }
        this.f15843d = new ArrayList(list2);
    }
}
