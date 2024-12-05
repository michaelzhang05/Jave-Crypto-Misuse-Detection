package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.C2284x2;
import com.google.android.gms.internal.measurement.C2293y2;
import com.google.android.gms.internal.measurement.C2298y7;
import com.google.android.gms.internal.measurement.H2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    private String f17618a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17619b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.G2 f17620c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f17621d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f17622e;

    /* renamed from: f, reason: collision with root package name */
    private Map f17623f;

    /* renamed from: g, reason: collision with root package name */
    private Map f17624g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ g6 f17625h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(h6 h6Var) {
        return h6Var.f17621d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.c5$b, com.google.android.gms.internal.measurement.x2$a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.G2$a] */
    public final C2284x2 a(int i8) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? J8 = C2284x2.J();
        J8.o(i8);
        J8.r(this.f17619b);
        com.google.android.gms.internal.measurement.G2 g22 = this.f17620c;
        if (g22 != null) {
            J8.q(g22);
        }
        ?? x8 = com.google.android.gms.internal.measurement.G2.R().r(W5.O(this.f17621d)).x(W5.O(this.f17622e));
        if (this.f17623f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f17623f.size());
            for (Integer num : this.f17623f.keySet()) {
                int intValue = num.intValue();
                Long l8 = (Long) this.f17623f.get(num);
                if (l8 != null) {
                    arrayList.add((C2293y2) ((AbstractC2091c5) C2293y2.J().o(intValue).p(l8.longValue()).k()));
                }
            }
        }
        if (arrayList != null) {
            x8.p(arrayList);
        }
        if (this.f17624g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f17624g.size());
            for (Integer num2 : this.f17624g.keySet()) {
                H2.a o8 = com.google.android.gms.internal.measurement.H2.K().o(num2.intValue());
                List list = (List) this.f17624g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    o8.p(list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.H2) ((AbstractC2091c5) o8.k()));
            }
        }
        x8.t(arrayList2);
        J8.p(x8);
        return (C2284x2) ((AbstractC2091c5) J8.k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(AbstractC2315b abstractC2315b) {
        int a8 = abstractC2315b.a();
        Boolean bool = abstractC2315b.f17463c;
        if (bool != null) {
            this.f17622e.set(a8, bool.booleanValue());
        }
        Boolean bool2 = abstractC2315b.f17464d;
        if (bool2 != null) {
            this.f17621d.set(a8, bool2.booleanValue());
        }
        if (abstractC2315b.f17465e != null) {
            Long l8 = (Long) this.f17623f.get(Integer.valueOf(a8));
            long longValue = abstractC2315b.f17465e.longValue() / 1000;
            if (l8 == null || longValue > l8.longValue()) {
                this.f17623f.put(Integer.valueOf(a8), Long.valueOf(longValue));
            }
        }
        if (abstractC2315b.f17466f != null) {
            List list = (List) this.f17624g.get(Integer.valueOf(a8));
            if (list == null) {
                list = new ArrayList();
                this.f17624g.put(Integer.valueOf(a8), list);
            }
            if (abstractC2315b.j()) {
                list.clear();
            }
            if (C2298y7.a() && this.f17625h.a().J(this.f17618a, H.f17149p0) && abstractC2315b.i()) {
                list.clear();
            }
            if (C2298y7.a() && this.f17625h.a().J(this.f17618a, H.f17149p0)) {
                long longValue2 = abstractC2315b.f17466f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC2315b.f17466f.longValue() / 1000));
        }
    }

    private h6(g6 g6Var, String str) {
        this.f17625h = g6Var;
        this.f17618a = str;
        this.f17619b = true;
        this.f17621d = new BitSet();
        this.f17622e = new BitSet();
        this.f17623f = new ArrayMap();
        this.f17624g = new ArrayMap();
    }

    private h6(g6 g6Var, String str, com.google.android.gms.internal.measurement.G2 g22, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f17625h = g6Var;
        this.f17618a = str;
        this.f17621d = bitSet;
        this.f17622e = bitSet2;
        this.f17623f = map;
        this.f17624g = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f17624g.put(num, arrayList);
            }
        }
        this.f17619b = false;
        this.f17620c = g22;
    }
}
