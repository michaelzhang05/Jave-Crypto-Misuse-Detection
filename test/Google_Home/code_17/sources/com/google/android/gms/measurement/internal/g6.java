package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.C2284x2;
import com.google.android.gms.internal.measurement.C2293y2;
import com.google.android.gms.internal.measurement.C2298y7;
import com.google.android.gms.internal.measurement.C2302z2;
import com.google.android.gms.internal.measurement.G2;
import com.google.android.gms.internal.measurement.Z6;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g6 extends F5 {

    /* renamed from: d, reason: collision with root package name */
    private String f17602d;

    /* renamed from: e, reason: collision with root package name */
    private Set f17603e;

    /* renamed from: f, reason: collision with root package name */
    private Map f17604f;

    /* renamed from: g, reason: collision with root package name */
    private Long f17605g;

    /* renamed from: h, reason: collision with root package name */
    private Long f17606h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g6(I5 i52) {
        super(i52);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        r5 = c().L();
        r6 = com.google.android.gms.measurement.internal.C2367i2.s(r13.f17602d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if (r7.O() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        r9 = java.lang.Integer.valueOf(r7.j());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        r5.c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g6.B(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void C(List list, boolean z8) {
        D d8;
        i6 i6Var;
        Integer num;
        Map map;
        long j8;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        i6 i6Var2 = new i6(this);
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2302z2 c2302z2 = (C2302z2) it.next();
            C2302z2 a8 = i6Var2.a(this.f17602d, c2302z2);
            if (a8 != null) {
                C2392m n8 = n();
                String str2 = this.f17602d;
                String U8 = a8.U();
                D K02 = n8.K0(str2, c2302z2.U());
                if (K02 == null) {
                    n8.c().L().c("Event aggregate wasn't created during raw event logging. appId, event", C2367i2.s(str2), n8.d().c(U8));
                    d8 = new D(str2, c2302z2.U(), 1L, 1L, 1L, c2302z2.R(), 0L, null, null, null, null);
                } else {
                    d8 = new D(K02.f16989a, K02.f16990b, K02.f16991c + 1, K02.f16992d + 1, K02.f16993e + 1, K02.f16994f, K02.f16995g, K02.f16996h, K02.f16997i, K02.f16998j, K02.f16999k);
                }
                D d9 = d8;
                n().U(d9);
                if (!Z6.a() || !a().J(str, H.f17114d1) || !z8) {
                    long j9 = d9.f16991c;
                    String U9 = a8.U();
                    Map map2 = (Map) arrayMap.get(U9);
                    if (map2 == null) {
                        map2 = n().O0(this.f17602d, U9);
                        arrayMap.put(U9, map2);
                    }
                    Map map3 = map2;
                    for (Integer num2 : map3.keySet()) {
                        int intValue = num2.intValue();
                        if (this.f17603e.contains(num2)) {
                            c().K().b("Skipping failed audience ID", num2);
                        } else {
                            Iterator it2 = ((List) map3.get(num2)).iterator();
                            boolean z9 = true;
                            while (true) {
                                if (it2.hasNext()) {
                                    com.google.android.gms.internal.measurement.H1 h12 = (com.google.android.gms.internal.measurement.H1) it2.next();
                                    C2322c c2322c = new C2322c(this, this.f17602d, intValue, h12);
                                    i6Var = i6Var2;
                                    num = num2;
                                    int i8 = intValue;
                                    map = map3;
                                    j8 = j9;
                                    z9 = c2322c.k(this.f17605g, this.f17606h, a8, j9, d9, D(intValue, h12.J()));
                                    if (z9) {
                                        v(num).c(c2322c);
                                        num2 = num;
                                        i6Var2 = i6Var;
                                        intValue = i8;
                                        map3 = map;
                                        j9 = j8;
                                    } else {
                                        this.f17603e.add(num);
                                        break;
                                    }
                                } else {
                                    i6Var = i6Var2;
                                    num = num2;
                                    map = map3;
                                    j8 = j9;
                                    break;
                                }
                            }
                            if (!z9) {
                                this.f17603e.add(num);
                            }
                            i6Var2 = i6Var;
                            map3 = map;
                            j9 = j8;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    private final boolean D(int i8, int i9) {
        h6 h6Var = (h6) this.f17604f.get(Integer.valueOf(i8));
        if (h6Var == null) {
            return false;
        }
        return h6.b(h6Var).get(i9);
    }

    private final List E() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.f17604f.keySet();
        keySet.removeAll(this.f17603e);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            h6 h6Var = (h6) this.f17604f.get(num);
            AbstractC1400p.l(h6Var);
            C2284x2 a8 = h6Var.a(intValue);
            arrayList.add(a8);
            C2392m n8 = n();
            String str = this.f17602d;
            com.google.android.gms.internal.measurement.G2 M8 = a8.M();
            n8.r();
            n8.k();
            AbstractC1400p.f(str);
            AbstractC1400p.l(M8);
            byte[] i8 = M8.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", i8);
            try {
                if (n8.B().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    n8.c().G().b("Failed to insert filter results (got -1). appId", C2367i2.s(str));
                }
            } catch (SQLiteException e8) {
                n8.c().G().c("Error storing filter results. appId", C2367i2.s(str), e8);
            }
        }
        return arrayList;
    }

    private final h6 v(Integer num) {
        if (this.f17604f.containsKey(num)) {
            return (h6) this.f17604f.get(num);
        }
        h6 h6Var = new h6(this, this.f17602d);
        this.f17604f.put(num, h6Var);
        return h6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List A(String str, List list, List list2, Long l8, Long l9, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        Map map;
        List<com.google.android.gms.internal.measurement.H1> list3;
        Iterator it;
        Iterator it2;
        Map map2;
        Long l10;
        Map map3;
        Iterator it3;
        AbstractC1400p.f(str);
        AbstractC1400p.l(list);
        AbstractC1400p.l(list2);
        this.f17602d = str;
        this.f17603e = new HashSet();
        this.f17604f = new ArrayMap();
        this.f17605g = l8;
        this.f17606h = l9;
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                if ("_s".equals(((C2302z2) it4.next()).U())) {
                    z9 = true;
                    break;
                }
            } else {
                z9 = false;
                break;
            }
        }
        if (C2298y7.a() && a().J(this.f17602d, H.f17149p0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (C2298y7.a() && a().J(this.f17602d, H.f17146o0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9) {
            C2392m n8 = n();
            String str2 = this.f17602d;
            n8.r();
            n8.k();
            AbstractC1400p.f(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                n8.B().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e8) {
                n8.c().G().c("Error resetting session-scoped event counts. appId", C2367i2.s(str2), e8);
            }
        }
        Map emptyMap = Collections.emptyMap();
        if (z11 && z10) {
            emptyMap = n().Z0(this.f17602d);
        }
        Map Y02 = n().Y0(this.f17602d);
        if (!Y02.isEmpty()) {
            HashSet hashSet = new HashSet(Y02.keySet());
            if (z9) {
                String str3 = this.f17602d;
                Map a12 = n().a1(this.f17602d);
                AbstractC1400p.f(str3);
                AbstractC1400p.l(Y02);
                Map arrayMap = new ArrayMap();
                if (!Y02.isEmpty()) {
                    Iterator it5 = Y02.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer num = (Integer) it5.next();
                        num.intValue();
                        com.google.android.gms.internal.measurement.G2 g22 = (com.google.android.gms.internal.measurement.G2) Y02.get(num);
                        List list4 = (List) a12.get(num);
                        if (list4 == null || list4.isEmpty()) {
                            map3 = a12;
                            it3 = it5;
                            arrayMap.put(num, g22);
                        } else {
                            List P8 = l().P(g22.V(), list4);
                            if (!P8.isEmpty()) {
                                G2.a r8 = ((G2.a) g22.x()).q().r(P8);
                                r8.w().x(l().P(g22.X(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (C2293y2 c2293y2 : g22.U()) {
                                    Map map4 = a12;
                                    Iterator it6 = it5;
                                    if (!list4.contains(Integer.valueOf(c2293y2.j()))) {
                                        arrayList.add(c2293y2);
                                    }
                                    a12 = map4;
                                    it5 = it6;
                                }
                                map3 = a12;
                                it3 = it5;
                                r8.o().p(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.H2 h22 : g22.W()) {
                                    if (!list4.contains(Integer.valueOf(h22.J()))) {
                                        arrayList2.add(h22);
                                    }
                                }
                                r8.s().t(arrayList2);
                                arrayMap.put(num, (com.google.android.gms.internal.measurement.G2) ((AbstractC2091c5) r8.k()));
                            }
                        }
                        a12 = map3;
                        it5 = it3;
                    }
                }
                map = arrayMap;
            } else {
                map = Y02;
            }
            Iterator it7 = hashSet.iterator();
            Map map5 = Y02;
            while (it7.hasNext()) {
                Integer num2 = (Integer) it7.next();
                num2.intValue();
                com.google.android.gms.internal.measurement.G2 g23 = (com.google.android.gms.internal.measurement.G2) map.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap2 = new ArrayMap();
                if (g23 != null && g23.j() != 0) {
                    for (C2293y2 c2293y22 : g23.U()) {
                        if (c2293y22.M()) {
                            Integer valueOf = Integer.valueOf(c2293y22.j());
                            if (c2293y22.L()) {
                                l10 = Long.valueOf(c2293y22.I());
                            } else {
                                l10 = null;
                            }
                            arrayMap2.put(valueOf, l10);
                        }
                    }
                }
                ArrayMap arrayMap3 = new ArrayMap();
                if (g23 != null && g23.L() != 0) {
                    Iterator it8 = g23.W().iterator();
                    while (it8.hasNext()) {
                        com.google.android.gms.internal.measurement.H2 h23 = (com.google.android.gms.internal.measurement.H2) it8.next();
                        if (h23.N() && h23.j() > 0) {
                            it2 = it8;
                            map2 = map;
                            arrayMap3.put(Integer.valueOf(h23.J()), Long.valueOf(h23.G(h23.j() - 1)));
                        } else {
                            it2 = it8;
                            map2 = map;
                        }
                        it8 = it2;
                        map = map2;
                    }
                }
                Map map6 = map;
                if (g23 != null) {
                    int i8 = 0;
                    while (i8 < (g23.O() << 6)) {
                        if (W5.f0(g23.X(), i8)) {
                            it = it7;
                            c().K().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i8));
                            bitSet2.set(i8);
                            if (W5.f0(g23.V(), i8)) {
                                bitSet.set(i8);
                                i8++;
                                it7 = it;
                            }
                        } else {
                            it = it7;
                        }
                        arrayMap2.remove(Integer.valueOf(i8));
                        i8++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                com.google.android.gms.internal.measurement.G2 g24 = (com.google.android.gms.internal.measurement.G2) map5.get(num2);
                if (z11 && z10 && (list3 = (List) emptyMap.get(num2)) != null && this.f17606h != null && this.f17605g != null) {
                    for (com.google.android.gms.internal.measurement.H1 h12 : list3) {
                        int J8 = h12.J();
                        long longValue = this.f17606h.longValue() / 1000;
                        if (h12.Q()) {
                            longValue = this.f17605g.longValue() / 1000;
                        }
                        if (arrayMap2.containsKey(Integer.valueOf(J8))) {
                            arrayMap2.put(Integer.valueOf(J8), Long.valueOf(longValue));
                        }
                        if (arrayMap3.containsKey(Integer.valueOf(J8))) {
                            arrayMap3.put(Integer.valueOf(J8), Long.valueOf(longValue));
                        }
                    }
                }
                this.f17604f.put(num2, new h6(this, this.f17602d, g24, bitSet, bitSet2, arrayMap2, arrayMap3));
                it7 = it9;
                map5 = map5;
                map = map6;
            }
        }
        if (Z6.a() && a().J(null, H.f17114d1)) {
            C(list, z8);
            if (z8) {
                return new ArrayList();
            }
            B(list2);
            return E();
        }
        C(list, true);
        B(list2);
        return E();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    protected final boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List z(String str, List list, List list2, Long l8, Long l9) {
        return A(str, list, list2, l8, l9, false);
    }
}
