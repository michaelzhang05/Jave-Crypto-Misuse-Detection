package v5;

import B5.s;
import M7.p;
import O7.w;
import P5.AbstractC1378t;
import P5.a0;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class k extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f40290a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.f f40291b;

    /* renamed from: c, reason: collision with root package name */
    public final B5.e f40292c;

    /* renamed from: d, reason: collision with root package name */
    public final E6.l f40293d;

    /* renamed from: e, reason: collision with root package name */
    public final O7.e f40294e;

    /* renamed from: f, reason: collision with root package name */
    public final w f40295f;

    /* renamed from: g, reason: collision with root package name */
    public final List f40296g;

    /* renamed from: h, reason: collision with root package name */
    public final List f40297h;

    /* renamed from: i, reason: collision with root package name */
    public final List f40298i;

    /* renamed from: j, reason: collision with root package name */
    public final List f40299j;

    /* renamed from: k, reason: collision with root package name */
    public final J5.c f40300k;

    /* renamed from: l, reason: collision with root package name */
    public final int f40301l;

    /* renamed from: m, reason: collision with root package name */
    public Set f40302m;

    /* renamed from: n, reason: collision with root package name */
    public Set f40303n;

    /* renamed from: o, reason: collision with root package name */
    public MutableLiveData f40304o;

    public k(s tcModel, H6.f portalConfig, B5.e googleVendorList, E6.l lVar, O7.e consentRepository, w translationsTextRepository, List initScreenCustomLinks, List vendorSpecialPurposeIds, List vendorFeaturesIds, List publisherStacksSelectedIds, Integer num, J5.c gbcPurposeResponse) {
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(portalConfig, "portalConfig");
        AbstractC3255y.i(googleVendorList, "googleVendorList");
        AbstractC3255y.i(consentRepository, "consentRepository");
        AbstractC3255y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3255y.i(initScreenCustomLinks, "initScreenCustomLinks");
        AbstractC3255y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3255y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3255y.i(publisherStacksSelectedIds, "publisherStacksSelectedIds");
        AbstractC3255y.i(gbcPurposeResponse, "gbcPurposeResponse");
        this.f40290a = tcModel;
        this.f40291b = portalConfig;
        this.f40292c = googleVendorList;
        this.f40293d = lVar;
        this.f40294e = consentRepository;
        this.f40295f = translationsTextRepository;
        this.f40296g = initScreenCustomLinks;
        this.f40297h = vendorSpecialPurposeIds;
        this.f40298i = vendorFeaturesIds;
        this.f40299j = publisherStacksSelectedIds;
        this.f40300k = gbcPurposeResponse;
        this.f40301l = 2;
        this.f40302m = new LinkedHashSet();
        this.f40303n = new LinkedHashSet();
        this.f40304o = new MutableLiveData();
    }

    public final U7.d a(String str, Set set, int i8) {
        if (AbstractC3255y.d(str, "ALL_VENDORS") && this.f40293d != null && set.contains(Integer.valueOf(i8))) {
            E6.l lVar = this.f40293d;
            return new U7.d(lVar, null, U7.f.NON_SWITCH, U7.e.PURPOSE_PARTNER, false, lVar.f2643b, null, 82);
        }
        return null;
    }

    public final List b() {
        Map map;
        int i8;
        Map map2;
        int i9;
        Collection collection;
        Map map3;
        E6.j jVar;
        Map map4;
        int i10;
        int i11;
        Map map5;
        int i12;
        Collection collection2;
        Map map6;
        E6.j jVar2;
        ArrayList arrayList = new ArrayList();
        E6.e eVar = this.f40290a.f976a;
        if (eVar != null && (map4 = eVar.f2633d) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map4.entrySet()) {
                if (this.f40290a.f993r.contains(((E6.i) entry.getValue()).f2642a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Set set = this.f40302m;
                if (set == null || set.isEmpty()) {
                    Set set2 = this.f40302m;
                    Iterator it = this.f40299j.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        E6.e eVar2 = this.f40290a.f976a;
                        if (eVar2 == null || (map6 = eVar2.f2639j) == null || (jVar2 = (E6.j) map6.get(String.valueOf(intValue))) == null) {
                            collection2 = null;
                        } else {
                            collection2 = jVar2.f2646c;
                        }
                        if (collection2 == null) {
                            collection2 = a0.f();
                        }
                        set2.addAll(collection2);
                    }
                }
                if (!this.f40302m.contains(Integer.valueOf(((E6.i) entry2.getValue()).f2642a))) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int i13 = ((E6.i) entry3.getValue()).f2642a;
                E6.e eVar3 = this.f40290a.f976a;
                if (eVar3 == null || (map5 = eVar3.f2638i) == null) {
                    i10 = 0;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry4 : map5.entrySet()) {
                        if (((E6.l) entry4.getValue()).f2656k == null) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap3.entrySet().iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        Set set3 = ((E6.l) ((Map.Entry) it2.next()).getValue()).f2649d;
                        if ((set3 instanceof Collection) && set3.isEmpty()) {
                            i12 = 0;
                        } else {
                            Iterator it3 = set3.iterator();
                            i12 = 0;
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() == i13 && (i12 = i12 + 1) < 0) {
                                    AbstractC1378t.v();
                                }
                            }
                        }
                        i10 += i12;
                    }
                }
                Iterator it4 = this.f40291b.f3926c.f3921a.iterator();
                while (it4.hasNext()) {
                    List list = ((H6.d) it4.next()).f3919f;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i11 = 0;
                    } else {
                        Iterator it5 = list.iterator();
                        i11 = 0;
                        while (it5.hasNext()) {
                            if (((Number) it5.next()).intValue() == i13 && (i11 = i11 + 1) < 0) {
                                AbstractC1378t.v();
                            }
                        }
                    }
                    i10 += i11;
                }
                Iterator it6 = this.f40291b.f3925b.f3901s.iterator();
                while (it6.hasNext()) {
                    if (((Number) it6.next()).intValue() == i13) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    arrayList.add(new U7.d((E6.f) entry3.getValue(), this.f40290a.f993r.get(((E6.i) entry3.getValue()).f2642a), null, U7.e.PURPOSE, false, this.f40295f.a().f7389d, Integer.valueOf(i10), 20));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        E6.e eVar4 = this.f40290a.f976a;
        if (eVar4 != null && (map = eVar4.f2636g) != null) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry5 : map.entrySet()) {
                if (this.f40290a.f992q.contains(((E6.d) entry5.getValue()).f2642a)) {
                    linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                }
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry entry6 : linkedHashMap4.entrySet()) {
                Set set4 = this.f40303n;
                if (set4 == null || set4.isEmpty()) {
                    Set set5 = this.f40303n;
                    Iterator it7 = this.f40299j.iterator();
                    while (it7.hasNext()) {
                        int intValue2 = ((Number) it7.next()).intValue();
                        E6.e eVar5 = this.f40290a.f976a;
                        if (eVar5 == null || (map3 = eVar5.f2639j) == null || (jVar = (E6.j) map3.get(String.valueOf(intValue2))) == null) {
                            collection = null;
                        } else {
                            collection = jVar.f2647d;
                        }
                        if (collection == null) {
                            collection = a0.f();
                        }
                        set5.addAll(collection);
                    }
                }
                if (!this.f40303n.contains(Integer.valueOf(((E6.d) entry6.getValue()).f2642a))) {
                    linkedHashMap5.put(entry6.getKey(), entry6.getValue());
                }
            }
            for (Map.Entry entry7 : linkedHashMap5.entrySet()) {
                int i14 = ((E6.d) entry7.getValue()).f2642a;
                E6.e eVar6 = this.f40290a.f976a;
                if (eVar6 == null || (map2 = eVar6.f2638i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    for (Map.Entry entry8 : map2.entrySet()) {
                        if (((E6.l) entry8.getValue()).f2656k == null) {
                            linkedHashMap6.put(entry8.getKey(), entry8.getValue());
                        }
                    }
                    Iterator it8 = linkedHashMap6.entrySet().iterator();
                    i8 = 0;
                    while (it8.hasNext()) {
                        Set set6 = ((E6.l) ((Map.Entry) it8.next()).getValue()).f2654i;
                        if ((set6 instanceof Collection) && set6.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it9 = set6.iterator();
                            i9 = 0;
                            while (it9.hasNext()) {
                                if (((Number) it9.next()).intValue() == i14 && (i9 = i9 + 1) < 0) {
                                    AbstractC1378t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                Iterator it10 = this.f40291b.f3925b.f3905w.iterator();
                while (it10.hasNext()) {
                    if (((Number) it10.next()).intValue() == i14) {
                        i8++;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new U7.d((E6.f) entry7.getValue(), this.f40290a.f992q.get(((E6.d) entry7.getValue()).f2642a), null, U7.e.SPECIAL_FEATURE, false, this.f40295f.a().f7389d, Integer.valueOf(i8), 20));
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final List c() {
        Map map;
        int i8;
        Map map2;
        int i9;
        Map map3;
        int i10;
        Map map4;
        int i11;
        ArrayList arrayList = new ArrayList();
        E6.e eVar = this.f40290a.f976a;
        if (eVar != null && (map3 = eVar.f2634e) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map3.entrySet()) {
                if (this.f40297h.contains(Integer.valueOf(((E6.i) entry.getValue()).f2642a)) || this.f40291b.f3925b.f3903u.contains(Integer.valueOf(((E6.i) entry.getValue()).f2642a))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int i12 = ((E6.i) entry2.getValue()).f2642a;
                E6.e eVar2 = this.f40290a.f976a;
                if (eVar2 == null || (map4 = eVar2.f2638i) == null) {
                    i10 = 0;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry3 : map4.entrySet()) {
                        if (((E6.l) entry3.getValue()).f2656k == null) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        Set set = ((E6.l) ((Map.Entry) it.next()).getValue()).f2652g;
                        if ((set instanceof Collection) && set.isEmpty()) {
                            i11 = 0;
                        } else {
                            Iterator it2 = set.iterator();
                            i11 = 0;
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i12 && (i11 = i11 + 1) < 0) {
                                    AbstractC1378t.v();
                                }
                            }
                        }
                        i10 += i11;
                    }
                }
                Iterator it3 = this.f40291b.f3925b.f3903u.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() == i12) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    arrayList.add(new U7.d((E6.f) entry2.getValue(), null, null, U7.e.SPECIAL_PURPOSE, false, this.f40295f.a().f7389d, Integer.valueOf(i10), 22));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        E6.e eVar3 = this.f40290a.f976a;
        if (eVar3 != null && (map = eVar3.f2635f) != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry4 : map.entrySet()) {
                if (this.f40298i.contains(Integer.valueOf(((E6.d) entry4.getValue()).f2642a)) || this.f40291b.f3925b.f3904v.contains(Integer.valueOf(((E6.d) entry4.getValue()).f2642a))) {
                    linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                }
            }
            for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                int i13 = ((E6.d) entry5.getValue()).f2642a;
                E6.e eVar4 = this.f40290a.f976a;
                if (eVar4 == null || (map2 = eVar4.f2638i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry6 : map2.entrySet()) {
                        if (((E6.l) entry6.getValue()).f2656k == null) {
                            linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                        }
                    }
                    Iterator it4 = linkedHashMap4.entrySet().iterator();
                    i8 = 0;
                    while (it4.hasNext()) {
                        Set set2 = ((E6.l) ((Map.Entry) it4.next()).getValue()).f2653h;
                        if ((set2 instanceof Collection) && set2.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it5 = set2.iterator();
                            i9 = 0;
                            while (it5.hasNext()) {
                                if (((Number) it5.next()).intValue() == i13 && (i9 = i9 + 1) < 0) {
                                    AbstractC1378t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                Iterator it6 = this.f40291b.f3925b.f3904v.iterator();
                while (it6.hasNext()) {
                    if (((Number) it6.next()).intValue() == i13) {
                        i8++;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new U7.d((E6.f) entry5.getValue(), null, null, U7.e.FEATURES, false, this.f40295f.a().f7389d, Integer.valueOf(i8), 22));
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final List d() {
        Map map;
        String str;
        Map map2;
        E6.j jVar;
        boolean booleanValue;
        boolean booleanValue2;
        Map map3;
        ArrayList arrayList = new ArrayList();
        E6.e eVar = this.f40290a.f976a;
        if (eVar != null && (map = eVar.f2639j) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (this.f40299j.contains(Integer.valueOf(((E6.j) entry.getValue()).f2642a))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Iterator it = ((E6.j) entry2.getValue()).f2646c.iterator();
                boolean z8 = false;
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    E6.e eVar2 = this.f40290a.f976a;
                    if (eVar2 != null && (map3 = eVar2.f2638i) != null) {
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (((E6.l) entry3.getValue()).f2656k == null && ((E6.l) entry3.getValue()).f2649d.contains(Integer.valueOf(intValue))) {
                                z8 = true;
                            }
                        }
                    }
                }
                if (z8) {
                    int i8 = ((E6.j) entry2.getValue()).f2642a;
                    String str2 = ((E6.j) entry2.getValue()).f2643b;
                    int i9 = ((E6.j) entry2.getValue()).f2642a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    E6.e eVar3 = this.f40290a.f976a;
                    if (eVar3 != null && (map2 = eVar3.f2639j) != null && (jVar = (E6.j) map2.get(String.valueOf(i9))) != null) {
                        List list = jVar.f2646c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (this.f40290a.f993r.contains(((Number) obj).intValue())) {
                                arrayList2.add(obj);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Boolean bool = this.f40290a.f993r.get(((Number) it2.next()).intValue());
                            if (bool == null) {
                                booleanValue2 = false;
                            } else {
                                booleanValue2 = bool.booleanValue();
                            }
                            linkedHashSet.add(Boolean.valueOf(booleanValue2));
                        }
                        List list2 = jVar.f2647d;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (this.f40290a.f992q.contains(((Number) obj2).intValue())) {
                                arrayList3.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Boolean bool2 = this.f40290a.f992q.get(((Number) it3.next()).intValue());
                            if (bool2 == null) {
                                booleanValue = false;
                            } else {
                                booleanValue = bool2.booleanValue();
                            }
                            linkedHashSet.add(Boolean.valueOf(booleanValue));
                        }
                    }
                    Boolean bool3 = Boolean.TRUE;
                    if (linkedHashSet.contains(bool3) && linkedHashSet.contains(Boolean.FALSE)) {
                        str = this.f40295f.f().f7366l;
                    } else if (linkedHashSet.contains(bool3)) {
                        str = this.f40295f.f().f7367m;
                    } else {
                        str = this.f40295f.f().f7365k;
                    }
                    arrayList.add(new p(i8, str2, str));
                }
            }
        }
        return arrayList;
    }

    public final void e() {
        String str = this.f40291b.f3925b.f3872I;
        if (str != null) {
            PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
            if (str.equals(privacyEncodingMode.getValue())) {
                this.f40294e.a(privacyEncodingMode, true);
                return;
            }
        }
        String str2 = this.f40291b.f3925b.f3872I;
        if (str2 != null) {
            PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
            if (str2.equals(privacyEncodingMode2.getValue())) {
                this.f40294e.a(privacyEncodingMode2, true);
                return;
            }
        }
        this.f40294e.a(PrivacyEncodingMode.TCF_AND_GPP, true);
    }
}
