package s5;

import J7.p;
import L7.w;
import M5.AbstractC1246t;
import M5.a0;
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
import kotlin.jvm.internal.AbstractC3159y;
import y5.C3998e;
import y5.s;

/* loaded from: classes5.dex */
public final class k extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f38017a;

    /* renamed from: b, reason: collision with root package name */
    public final E6.f f38018b;

    /* renamed from: c, reason: collision with root package name */
    public final C3998e f38019c;

    /* renamed from: d, reason: collision with root package name */
    public final B6.l f38020d;

    /* renamed from: e, reason: collision with root package name */
    public final L7.e f38021e;

    /* renamed from: f, reason: collision with root package name */
    public final w f38022f;

    /* renamed from: g, reason: collision with root package name */
    public final List f38023g;

    /* renamed from: h, reason: collision with root package name */
    public final List f38024h;

    /* renamed from: i, reason: collision with root package name */
    public final List f38025i;

    /* renamed from: j, reason: collision with root package name */
    public final List f38026j;

    /* renamed from: k, reason: collision with root package name */
    public final G5.c f38027k;

    /* renamed from: l, reason: collision with root package name */
    public final int f38028l;

    /* renamed from: m, reason: collision with root package name */
    public Set f38029m;

    /* renamed from: n, reason: collision with root package name */
    public Set f38030n;

    /* renamed from: o, reason: collision with root package name */
    public MutableLiveData f38031o;

    public k(s tcModel, E6.f portalConfig, C3998e googleVendorList, B6.l lVar, L7.e consentRepository, w translationsTextRepository, List initScreenCustomLinks, List vendorSpecialPurposeIds, List vendorFeaturesIds, List publisherStacksSelectedIds, Integer num, G5.c gbcPurposeResponse) {
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(portalConfig, "portalConfig");
        AbstractC3159y.i(googleVendorList, "googleVendorList");
        AbstractC3159y.i(consentRepository, "consentRepository");
        AbstractC3159y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3159y.i(initScreenCustomLinks, "initScreenCustomLinks");
        AbstractC3159y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3159y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3159y.i(publisherStacksSelectedIds, "publisherStacksSelectedIds");
        AbstractC3159y.i(gbcPurposeResponse, "gbcPurposeResponse");
        this.f38017a = tcModel;
        this.f38018b = portalConfig;
        this.f38019c = googleVendorList;
        this.f38020d = lVar;
        this.f38021e = consentRepository;
        this.f38022f = translationsTextRepository;
        this.f38023g = initScreenCustomLinks;
        this.f38024h = vendorSpecialPurposeIds;
        this.f38025i = vendorFeaturesIds;
        this.f38026j = publisherStacksSelectedIds;
        this.f38027k = gbcPurposeResponse;
        this.f38028l = 2;
        this.f38029m = new LinkedHashSet();
        this.f38030n = new LinkedHashSet();
        this.f38031o = new MutableLiveData();
    }

    public final R7.d a(String str, Set set, int i8) {
        if (AbstractC3159y.d(str, "ALL_VENDORS") && this.f38020d != null && set.contains(Integer.valueOf(i8))) {
            B6.l lVar = this.f38020d;
            return new R7.d(lVar, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar.f1048b, null, 82);
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
        B6.j jVar;
        Map map4;
        int i10;
        int i11;
        Map map5;
        int i12;
        Collection collection2;
        Map map6;
        B6.j jVar2;
        ArrayList arrayList = new ArrayList();
        B6.e eVar = this.f38017a.f39932a;
        if (eVar != null && (map4 = eVar.f1038d) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map4.entrySet()) {
                if (this.f38017a.f39949r.contains(((B6.i) entry.getValue()).f1047a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Set set = this.f38029m;
                if (set == null || set.isEmpty()) {
                    Set set2 = this.f38029m;
                    Iterator it = this.f38026j.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        B6.e eVar2 = this.f38017a.f39932a;
                        if (eVar2 == null || (map6 = eVar2.f1044j) == null || (jVar2 = (B6.j) map6.get(String.valueOf(intValue))) == null) {
                            collection2 = null;
                        } else {
                            collection2 = jVar2.f1051c;
                        }
                        if (collection2 == null) {
                            collection2 = a0.f();
                        }
                        set2.addAll(collection2);
                    }
                }
                if (!this.f38029m.contains(Integer.valueOf(((B6.i) entry2.getValue()).f1047a))) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int i13 = ((B6.i) entry3.getValue()).f1047a;
                B6.e eVar3 = this.f38017a.f39932a;
                if (eVar3 == null || (map5 = eVar3.f1043i) == null) {
                    i10 = 0;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry4 : map5.entrySet()) {
                        if (((B6.l) entry4.getValue()).f1061k == null) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap3.entrySet().iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        Set set3 = ((B6.l) ((Map.Entry) it2.next()).getValue()).f1054d;
                        if ((set3 instanceof Collection) && set3.isEmpty()) {
                            i12 = 0;
                        } else {
                            Iterator it3 = set3.iterator();
                            i12 = 0;
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() == i13 && (i12 = i12 + 1) < 0) {
                                    AbstractC1246t.v();
                                }
                            }
                        }
                        i10 += i12;
                    }
                }
                Iterator it4 = this.f38018b.f2376c.f2371a.iterator();
                while (it4.hasNext()) {
                    List list = ((E6.d) it4.next()).f2369f;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i11 = 0;
                    } else {
                        Iterator it5 = list.iterator();
                        i11 = 0;
                        while (it5.hasNext()) {
                            if (((Number) it5.next()).intValue() == i13 && (i11 = i11 + 1) < 0) {
                                AbstractC1246t.v();
                            }
                        }
                    }
                    i10 += i11;
                }
                Iterator it6 = this.f38018b.f2375b.f2351s.iterator();
                while (it6.hasNext()) {
                    if (((Number) it6.next()).intValue() == i13) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    arrayList.add(new R7.d((B6.f) entry3.getValue(), this.f38017a.f39949r.get(((B6.i) entry3.getValue()).f1047a), null, R7.e.PURPOSE, false, this.f38022f.a().f5683d, Integer.valueOf(i10), 20));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        B6.e eVar4 = this.f38017a.f39932a;
        if (eVar4 != null && (map = eVar4.f1041g) != null) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry5 : map.entrySet()) {
                if (this.f38017a.f39948q.contains(((B6.d) entry5.getValue()).f1047a)) {
                    linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                }
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry entry6 : linkedHashMap4.entrySet()) {
                Set set4 = this.f38030n;
                if (set4 == null || set4.isEmpty()) {
                    Set set5 = this.f38030n;
                    Iterator it7 = this.f38026j.iterator();
                    while (it7.hasNext()) {
                        int intValue2 = ((Number) it7.next()).intValue();
                        B6.e eVar5 = this.f38017a.f39932a;
                        if (eVar5 == null || (map3 = eVar5.f1044j) == null || (jVar = (B6.j) map3.get(String.valueOf(intValue2))) == null) {
                            collection = null;
                        } else {
                            collection = jVar.f1052d;
                        }
                        if (collection == null) {
                            collection = a0.f();
                        }
                        set5.addAll(collection);
                    }
                }
                if (!this.f38030n.contains(Integer.valueOf(((B6.d) entry6.getValue()).f1047a))) {
                    linkedHashMap5.put(entry6.getKey(), entry6.getValue());
                }
            }
            for (Map.Entry entry7 : linkedHashMap5.entrySet()) {
                int i14 = ((B6.d) entry7.getValue()).f1047a;
                B6.e eVar6 = this.f38017a.f39932a;
                if (eVar6 == null || (map2 = eVar6.f1043i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    for (Map.Entry entry8 : map2.entrySet()) {
                        if (((B6.l) entry8.getValue()).f1061k == null) {
                            linkedHashMap6.put(entry8.getKey(), entry8.getValue());
                        }
                    }
                    Iterator it8 = linkedHashMap6.entrySet().iterator();
                    i8 = 0;
                    while (it8.hasNext()) {
                        Set set6 = ((B6.l) ((Map.Entry) it8.next()).getValue()).f1059i;
                        if ((set6 instanceof Collection) && set6.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it9 = set6.iterator();
                            i9 = 0;
                            while (it9.hasNext()) {
                                if (((Number) it9.next()).intValue() == i14 && (i9 = i9 + 1) < 0) {
                                    AbstractC1246t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                Iterator it10 = this.f38018b.f2375b.f2355w.iterator();
                while (it10.hasNext()) {
                    if (((Number) it10.next()).intValue() == i14) {
                        i8++;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new R7.d((B6.f) entry7.getValue(), this.f38017a.f39948q.get(((B6.d) entry7.getValue()).f1047a), null, R7.e.SPECIAL_FEATURE, false, this.f38022f.a().f5683d, Integer.valueOf(i8), 20));
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
        B6.e eVar = this.f38017a.f39932a;
        if (eVar != null && (map3 = eVar.f1039e) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map3.entrySet()) {
                if (this.f38024h.contains(Integer.valueOf(((B6.i) entry.getValue()).f1047a)) || this.f38018b.f2375b.f2353u.contains(Integer.valueOf(((B6.i) entry.getValue()).f1047a))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int i12 = ((B6.i) entry2.getValue()).f1047a;
                B6.e eVar2 = this.f38017a.f39932a;
                if (eVar2 == null || (map4 = eVar2.f1043i) == null) {
                    i10 = 0;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry3 : map4.entrySet()) {
                        if (((B6.l) entry3.getValue()).f1061k == null) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        Set set = ((B6.l) ((Map.Entry) it.next()).getValue()).f1057g;
                        if ((set instanceof Collection) && set.isEmpty()) {
                            i11 = 0;
                        } else {
                            Iterator it2 = set.iterator();
                            i11 = 0;
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i12 && (i11 = i11 + 1) < 0) {
                                    AbstractC1246t.v();
                                }
                            }
                        }
                        i10 += i11;
                    }
                }
                Iterator it3 = this.f38018b.f2375b.f2353u.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() == i12) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    arrayList.add(new R7.d((B6.f) entry2.getValue(), null, null, R7.e.SPECIAL_PURPOSE, false, this.f38022f.a().f5683d, Integer.valueOf(i10), 22));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        B6.e eVar3 = this.f38017a.f39932a;
        if (eVar3 != null && (map = eVar3.f1040f) != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry4 : map.entrySet()) {
                if (this.f38025i.contains(Integer.valueOf(((B6.d) entry4.getValue()).f1047a)) || this.f38018b.f2375b.f2354v.contains(Integer.valueOf(((B6.d) entry4.getValue()).f1047a))) {
                    linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                }
            }
            for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                int i13 = ((B6.d) entry5.getValue()).f1047a;
                B6.e eVar4 = this.f38017a.f39932a;
                if (eVar4 == null || (map2 = eVar4.f1043i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry6 : map2.entrySet()) {
                        if (((B6.l) entry6.getValue()).f1061k == null) {
                            linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                        }
                    }
                    Iterator it4 = linkedHashMap4.entrySet().iterator();
                    i8 = 0;
                    while (it4.hasNext()) {
                        Set set2 = ((B6.l) ((Map.Entry) it4.next()).getValue()).f1058h;
                        if ((set2 instanceof Collection) && set2.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it5 = set2.iterator();
                            i9 = 0;
                            while (it5.hasNext()) {
                                if (((Number) it5.next()).intValue() == i13 && (i9 = i9 + 1) < 0) {
                                    AbstractC1246t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                Iterator it6 = this.f38018b.f2375b.f2354v.iterator();
                while (it6.hasNext()) {
                    if (((Number) it6.next()).intValue() == i13) {
                        i8++;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new R7.d((B6.f) entry5.getValue(), null, null, R7.e.FEATURES, false, this.f38022f.a().f5683d, Integer.valueOf(i8), 22));
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
        B6.j jVar;
        boolean booleanValue;
        boolean booleanValue2;
        Map map3;
        ArrayList arrayList = new ArrayList();
        B6.e eVar = this.f38017a.f39932a;
        if (eVar != null && (map = eVar.f1044j) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (this.f38026j.contains(Integer.valueOf(((B6.j) entry.getValue()).f1047a))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Iterator it = ((B6.j) entry2.getValue()).f1051c.iterator();
                boolean z8 = false;
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    B6.e eVar2 = this.f38017a.f39932a;
                    if (eVar2 != null && (map3 = eVar2.f1043i) != null) {
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (((B6.l) entry3.getValue()).f1061k == null && ((B6.l) entry3.getValue()).f1054d.contains(Integer.valueOf(intValue))) {
                                z8 = true;
                            }
                        }
                    }
                }
                if (z8) {
                    int i8 = ((B6.j) entry2.getValue()).f1047a;
                    String str2 = ((B6.j) entry2.getValue()).f1048b;
                    int i9 = ((B6.j) entry2.getValue()).f1047a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    B6.e eVar3 = this.f38017a.f39932a;
                    if (eVar3 != null && (map2 = eVar3.f1044j) != null && (jVar = (B6.j) map2.get(String.valueOf(i9))) != null) {
                        List list = jVar.f1051c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (this.f38017a.f39949r.contains(((Number) obj).intValue())) {
                                arrayList2.add(obj);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Boolean bool = this.f38017a.f39949r.get(((Number) it2.next()).intValue());
                            if (bool == null) {
                                booleanValue2 = false;
                            } else {
                                booleanValue2 = bool.booleanValue();
                            }
                            linkedHashSet.add(Boolean.valueOf(booleanValue2));
                        }
                        List list2 = jVar.f1052d;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (this.f38017a.f39948q.contains(((Number) obj2).intValue())) {
                                arrayList3.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Boolean bool2 = this.f38017a.f39948q.get(((Number) it3.next()).intValue());
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
                        str = this.f38022f.f().f5660l;
                    } else if (linkedHashSet.contains(bool3)) {
                        str = this.f38022f.f().f5661m;
                    } else {
                        str = this.f38022f.f().f5659k;
                    }
                    arrayList.add(new p(i8, str2, str));
                }
            }
        }
        return arrayList;
    }

    public final void e() {
        String str = this.f38018b.f2375b.f2322I;
        if (str != null) {
            PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
            if (str.equals(privacyEncodingMode.getValue())) {
                this.f38021e.a(privacyEncodingMode, true);
                return;
            }
        }
        String str2 = this.f38018b.f2375b.f2322I;
        if (str2 != null) {
            PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
            if (str2.equals(privacyEncodingMode2.getValue())) {
                this.f38021e.a(privacyEncodingMode2, true);
                return;
            }
        }
        this.f38021e.a(PrivacyEncodingMode.TCF_AND_GPP, true);
    }
}
