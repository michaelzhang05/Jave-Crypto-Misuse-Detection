package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2245t extends AbstractC2192n implements InterfaceC2183m {

    /* renamed from: c, reason: collision with root package name */
    private final List f16836c;

    /* renamed from: d, reason: collision with root package name */
    private final List f16837d;

    /* renamed from: e, reason: collision with root package name */
    private V2 f16838e;

    private C2245t(C2245t c2245t) {
        super(c2245t.f16731a);
        ArrayList arrayList = new ArrayList(c2245t.f16836c.size());
        this.f16836c = arrayList;
        arrayList.addAll(c2245t.f16836c);
        ArrayList arrayList2 = new ArrayList(c2245t.f16837d.size());
        this.f16837d = arrayList2;
        arrayList2.addAll(c2245t.f16837d);
        this.f16838e = c2245t.f16838e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n
    public final InterfaceC2236s a(V2 v22, List list) {
        V2 d8 = this.f16838e.d();
        for (int i8 = 0; i8 < this.f16836c.size(); i8++) {
            if (i8 < list.size()) {
                d8.e((String) this.f16836c.get(i8), v22.b((InterfaceC2236s) list.get(i8)));
            } else {
                d8.e((String) this.f16836c.get(i8), InterfaceC2236s.f16802b0);
            }
        }
        for (InterfaceC2236s interfaceC2236s : this.f16837d) {
            InterfaceC2236s b8 = d8.b(interfaceC2236s);
            if (b8 instanceof C2263v) {
                b8 = d8.b(interfaceC2236s);
            }
            if (b8 instanceof C2174l) {
                return ((C2174l) b8).a();
            }
        }
        return InterfaceC2236s.f16802b0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192n, com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s b() {
        return new C2245t(this);
    }

    public C2245t(String str, List list, List list2, V2 v22) {
        super(str);
        this.f16836c = new ArrayList();
        this.f16838e = v22;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f16836c.add(((InterfaceC2236s) it.next()).A());
            }
        }
        this.f16837d = new ArrayList(list2);
    }
}
