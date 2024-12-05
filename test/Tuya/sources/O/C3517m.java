package o;

import L5.p;
import L7.w;
import M5.AbstractC1246t;
import M5.a0;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import r5.AbstractC3689a;
import y5.s;

/* renamed from: o.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3517m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f36332a;

    /* renamed from: b, reason: collision with root package name */
    public final E6.f f36333b;

    /* renamed from: c, reason: collision with root package name */
    public final E6.e f36334c;

    /* renamed from: d, reason: collision with root package name */
    public final w f36335d;

    /* renamed from: e, reason: collision with root package name */
    public final B6.l f36336e;

    /* renamed from: f, reason: collision with root package name */
    public final List f36337f;

    /* renamed from: g, reason: collision with root package name */
    public final List f36338g;

    /* renamed from: h, reason: collision with root package name */
    public final List f36339h;

    /* renamed from: i, reason: collision with root package name */
    public final List f36340i;

    /* renamed from: j, reason: collision with root package name */
    public B5.j f36341j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f36342k;

    /* renamed from: l, reason: collision with root package name */
    public int f36343l;

    public C3517m(s tcModel, E6.f portalConfig, E6.e nonIabVendorsInfo, w translationsTextRepository, B6.l lVar, List vendorPurposeLegitimateInterestIds, List vendorSpecialPurposeIds, List vendorFeaturesIds, List vendorSpecialFeaturesIds) {
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(portalConfig, "portalConfig");
        AbstractC3159y.i(nonIabVendorsInfo, "nonIabVendorsInfo");
        AbstractC3159y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3159y.i(vendorPurposeLegitimateInterestIds, "vendorPurposeLegitimateInterestIds");
        AbstractC3159y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3159y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3159y.i(vendorSpecialFeaturesIds, "vendorSpecialFeaturesIds");
        this.f36332a = tcModel;
        this.f36333b = portalConfig;
        this.f36334c = nonIabVendorsInfo;
        this.f36335d = translationsTextRepository;
        this.f36336e = lVar;
        this.f36337f = vendorPurposeLegitimateInterestIds;
        this.f36338g = vendorSpecialPurposeIds;
        this.f36339h = vendorFeaturesIds;
        this.f36340i = vendorSpecialFeaturesIds;
        this.f36341j = B5.j.ALL_VENDORS;
        this.f36343l = 4;
    }

    public static /* synthetic */ List c(C3517m c3517m, String str, int i8) {
        String str2;
        if ((i8 & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        return c3517m.b(str2);
    }

    public final String a(Set ids, B5.a type) {
        Set b12;
        Map map;
        B6.f fVar;
        AbstractC3159y.i(ids, "ids");
        AbstractC3159y.i(type, "type");
        a0.f();
        int ordinal = type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            b12 = AbstractC1246t.b1(ids);
                            B6.e eVar = this.f36332a.f39932a;
                            if (eVar != null) {
                                map = eVar.f1045k;
                            }
                            map = null;
                        } else {
                            throw new p();
                        }
                    } else {
                        b12 = AbstractC1246t.b1(this.f36340i);
                        B6.e eVar2 = this.f36332a.f39932a;
                        if (eVar2 != null) {
                            map = eVar2.f1041g;
                        }
                        map = null;
                    }
                } else {
                    b12 = AbstractC1246t.b1(this.f36339h);
                    B6.e eVar3 = this.f36332a.f39932a;
                    if (eVar3 != null) {
                        map = eVar3.f1040f;
                    }
                    map = null;
                }
            } else {
                b12 = AbstractC1246t.b1(this.f36338g);
                B6.e eVar4 = this.f36332a.f39932a;
                if (eVar4 != null) {
                    map = eVar4.f1039e;
                }
                map = null;
            }
        } else {
            b12 = AbstractC1246t.b1(this.f36337f);
            B6.e eVar5 = this.f36332a.f39932a;
            if (eVar5 != null) {
                map = eVar5.f1038d;
            }
            map = null;
        }
        SortedSet b02 = AbstractC1246t.b0(ids);
        ArrayList arrayList = new ArrayList();
        for (Object obj : b02) {
            if (b12.contains((Integer) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (map != null && (fVar = (B6.f) map.get(String.valueOf(num))) != null) {
                StringBuilder a8 = AbstractC3689a.a(str);
                Y y8 = Y.f33766a;
                String format = String.format("• %s.", Arrays.copyOf(new Object[]{fVar.f1048b}, 1));
                AbstractC3159y.h(format, "format(format, *args)");
                a8.append(format);
                a8.append('\n');
                str = a8.toString();
            }
        }
        return str;
    }

    public final List b(String search) {
        List g8;
        B6.e eVar;
        Map map;
        int i8;
        int i9;
        int i10;
        AbstractC3159y.i(search, "search");
        int ordinal = this.f36341j.ordinal();
        if (ordinal != 0) {
            g8 = ordinal != 1 ? ordinal != 2 ? new ArrayList() : g() : f();
        } else {
            g8 = g();
            ArrayList arrayList = (ArrayList) g8;
            arrayList.addAll(f());
            R7.d h8 = h();
            if (h8 != null) {
                arrayList.add(0, h8);
            }
        }
        String str = this.f36335d.e().f5630h;
        R7.f fVar = R7.f.LABEL;
        g8.add(0, new R7.d(null, null, fVar, null, false, str, null, 91));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, new R7.d(null, null, fVar, null, false, this.f36335d.e().f5629g, null, 91));
        Map i11 = i();
        if (i11 != null) {
            for (Map.Entry entry : i11.entrySet()) {
                int i12 = ((B6.i) entry.getValue()).f1047a;
                B5.j jVar = this.f36341j;
                if ((jVar != B5.j.ALL_VENDORS && jVar != B5.j.IAB_VENDORS) || (eVar = this.f36332a.f39932a) == null || (map = eVar.f1043i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (((B6.l) entry2.getValue()).f1061k == null) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    i8 = 0;
                    while (it.hasNext()) {
                        Set set = ((B6.l) ((Map.Entry) it.next()).getValue()).f1055e;
                        if ((set instanceof Collection) && set.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it2 = set.iterator();
                            i9 = 0;
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i12 && (i9 = i9 + 1) < 0) {
                                    AbstractC1246t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                B5.j jVar2 = this.f36341j;
                if (jVar2 == B5.j.ALL_VENDORS || jVar2 == B5.j.NON_IAB_VENDORS) {
                    Iterator it3 = this.f36333b.f2376c.f2371a.iterator();
                    while (it3.hasNext()) {
                        List list = ((E6.d) it3.next()).f2370g;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            i10 = 0;
                        } else {
                            Iterator it4 = list.iterator();
                            i10 = 0;
                            while (it4.hasNext()) {
                                if (((Number) it4.next()).intValue() == i12 && (i10 = i10 + 1) < 0) {
                                    AbstractC1246t.v();
                                }
                            }
                        }
                        i8 += i10;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new R7.d((B6.f) entry.getValue(), this.f36332a.f39950s.get(((B6.i) entry.getValue()).f1047a), null, R7.e.PURPOSE, false, this.f36335d.a().f5683d, Integer.valueOf(i8), 4));
                }
            }
        }
        g8.addAll(0, arrayList2);
        if (search.length() > 0) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : g8) {
                R7.d dVar = (R7.d) obj;
                if (dVar.f8915d != R7.e.PURPOSE && g6.n.F(dVar.f8912a.f1048b, search, true)) {
                    arrayList3.add(obj);
                }
            }
            return AbstractC1246t.Z0(arrayList3);
        }
        return g8;
    }

    public final Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = b("").iterator();
        while (it.hasNext()) {
            Boolean bool = ((R7.d) it.next()).f8913b;
            if (bool != null) {
                linkedHashSet.add(bool);
            }
        }
        return linkedHashSet;
    }

    public final void e(B5.j jVar) {
        AbstractC3159y.i(jVar, "<set-?>");
        this.f36341j = jVar;
    }

    public final List f() {
        Map map;
        ArrayList arrayList = new ArrayList();
        B6.e eVar = this.f36332a.f39932a;
        if (eVar != null && (map = eVar.f1043i) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((B6.l) entry.getValue()).f1061k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!((B6.l) entry2.getValue()).f1055e.isEmpty()) {
                    arrayList.add(new R7.d((B6.f) entry2.getValue(), this.f36332a.f39927C.get(((B6.l) entry2.getValue()).f1047a), null, null, false, null, null, 124));
                }
            }
        }
        return arrayList;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (E6.d dVar : this.f36334c.f2371a) {
            if (!dVar.f2370g.isEmpty()) {
                arrayList.add(new R7.d(dVar.a(), this.f36332a.f39928D.get(dVar.f2364a), null, R7.e.NON_IAB_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }

    public final R7.d h() {
        boolean booleanValue;
        B6.l lVar = this.f36336e;
        if (lVar == null) {
            return null;
        }
        Boolean bool = this.f36332a.f39952u.get(lVar.f1047a);
        if (bool == null) {
            booleanValue = true;
        } else {
            booleanValue = bool.booleanValue();
        }
        return new R7.d(lVar, Boolean.valueOf(booleanValue), null, R7.e.PUBLISHER_VENDOR, false, null, null, 116);
    }

    public final Map i() {
        Map map;
        B6.e eVar = this.f36332a.f39932a;
        if (eVar == null || (map = eVar.f1038d) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.f36332a.f39950s.contains(((B6.i) entry.getValue()).f1047a)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!AbstractC3159y.d(this.f36332a.f39939h, "DE")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((B6.i) entry2.getValue()).f1047a != 1) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return linkedHashMap2;
        }
        return linkedHashMap;
    }
}
