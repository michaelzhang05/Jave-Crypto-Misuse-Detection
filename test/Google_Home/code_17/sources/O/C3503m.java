package o;

import B5.s;
import O5.p;
import O7.w;
import P5.AbstractC1378t;
import P5.a0;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import u5.AbstractC4062a;

/* renamed from: o.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3503m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f35767a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.f f35768b;

    /* renamed from: c, reason: collision with root package name */
    public final H6.e f35769c;

    /* renamed from: d, reason: collision with root package name */
    public final w f35770d;

    /* renamed from: e, reason: collision with root package name */
    public final E6.l f35771e;

    /* renamed from: f, reason: collision with root package name */
    public final List f35772f;

    /* renamed from: g, reason: collision with root package name */
    public final List f35773g;

    /* renamed from: h, reason: collision with root package name */
    public final List f35774h;

    /* renamed from: i, reason: collision with root package name */
    public final List f35775i;

    /* renamed from: j, reason: collision with root package name */
    public E5.j f35776j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35777k;

    /* renamed from: l, reason: collision with root package name */
    public int f35778l;

    public C3503m(s tcModel, H6.f portalConfig, H6.e nonIabVendorsInfo, w translationsTextRepository, E6.l lVar, List vendorPurposeLegitimateInterestIds, List vendorSpecialPurposeIds, List vendorFeaturesIds, List vendorSpecialFeaturesIds) {
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(portalConfig, "portalConfig");
        AbstractC3255y.i(nonIabVendorsInfo, "nonIabVendorsInfo");
        AbstractC3255y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3255y.i(vendorPurposeLegitimateInterestIds, "vendorPurposeLegitimateInterestIds");
        AbstractC3255y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3255y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3255y.i(vendorSpecialFeaturesIds, "vendorSpecialFeaturesIds");
        this.f35767a = tcModel;
        this.f35768b = portalConfig;
        this.f35769c = nonIabVendorsInfo;
        this.f35770d = translationsTextRepository;
        this.f35771e = lVar;
        this.f35772f = vendorPurposeLegitimateInterestIds;
        this.f35773g = vendorSpecialPurposeIds;
        this.f35774h = vendorFeaturesIds;
        this.f35775i = vendorSpecialFeaturesIds;
        this.f35776j = E5.j.ALL_VENDORS;
        this.f35778l = 4;
    }

    public static /* synthetic */ List c(C3503m c3503m, String str, int i8) {
        String str2;
        if ((i8 & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        return c3503m.b(str2);
    }

    public final String a(Set ids, E5.a type) {
        Set b12;
        Map map;
        E6.f fVar;
        AbstractC3255y.i(ids, "ids");
        AbstractC3255y.i(type, "type");
        a0.f();
        int ordinal = type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            b12 = AbstractC1378t.b1(ids);
                            E6.e eVar = this.f35767a.f976a;
                            if (eVar != null) {
                                map = eVar.f2640k;
                            }
                            map = null;
                        } else {
                            throw new p();
                        }
                    } else {
                        b12 = AbstractC1378t.b1(this.f35775i);
                        E6.e eVar2 = this.f35767a.f976a;
                        if (eVar2 != null) {
                            map = eVar2.f2636g;
                        }
                        map = null;
                    }
                } else {
                    b12 = AbstractC1378t.b1(this.f35774h);
                    E6.e eVar3 = this.f35767a.f976a;
                    if (eVar3 != null) {
                        map = eVar3.f2635f;
                    }
                    map = null;
                }
            } else {
                b12 = AbstractC1378t.b1(this.f35773g);
                E6.e eVar4 = this.f35767a.f976a;
                if (eVar4 != null) {
                    map = eVar4.f2634e;
                }
                map = null;
            }
        } else {
            b12 = AbstractC1378t.b1(this.f35772f);
            E6.e eVar5 = this.f35767a.f976a;
            if (eVar5 != null) {
                map = eVar5.f2633d;
            }
            map = null;
        }
        SortedSet b02 = AbstractC1378t.b0(ids);
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
            if (map != null && (fVar = (E6.f) map.get(String.valueOf(num))) != null) {
                StringBuilder a8 = AbstractC4062a.a(str);
                Y y8 = Y.f34167a;
                String format = String.format("• %s.", Arrays.copyOf(new Object[]{fVar.f2643b}, 1));
                AbstractC3255y.h(format, "format(format, *args)");
                a8.append(format);
                a8.append('\n');
                str = a8.toString();
            }
        }
        return str;
    }

    public final List b(String search) {
        List g8;
        E6.e eVar;
        Map map;
        int i8;
        int i9;
        int i10;
        AbstractC3255y.i(search, "search");
        int ordinal = this.f35776j.ordinal();
        if (ordinal != 0) {
            g8 = ordinal != 1 ? ordinal != 2 ? new ArrayList() : g() : f();
        } else {
            g8 = g();
            ArrayList arrayList = (ArrayList) g8;
            arrayList.addAll(f());
            U7.d h8 = h();
            if (h8 != null) {
                arrayList.add(0, h8);
            }
        }
        String str = this.f35770d.e().f7336h;
        U7.f fVar = U7.f.LABEL;
        g8.add(0, new U7.d(null, null, fVar, null, false, str, null, 91));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, new U7.d(null, null, fVar, null, false, this.f35770d.e().f7335g, null, 91));
        Map i11 = i();
        if (i11 != null) {
            for (Map.Entry entry : i11.entrySet()) {
                int i12 = ((E6.i) entry.getValue()).f2642a;
                E5.j jVar = this.f35776j;
                if ((jVar != E5.j.ALL_VENDORS && jVar != E5.j.IAB_VENDORS) || (eVar = this.f35767a.f976a) == null || (map = eVar.f2638i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (((E6.l) entry2.getValue()).f2656k == null) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    i8 = 0;
                    while (it.hasNext()) {
                        Set set = ((E6.l) ((Map.Entry) it.next()).getValue()).f2650e;
                        if ((set instanceof Collection) && set.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it2 = set.iterator();
                            i9 = 0;
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i12 && (i9 = i9 + 1) < 0) {
                                    AbstractC1378t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                E5.j jVar2 = this.f35776j;
                if (jVar2 == E5.j.ALL_VENDORS || jVar2 == E5.j.NON_IAB_VENDORS) {
                    Iterator it3 = this.f35768b.f3926c.f3921a.iterator();
                    while (it3.hasNext()) {
                        List list = ((H6.d) it3.next()).f3920g;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            i10 = 0;
                        } else {
                            Iterator it4 = list.iterator();
                            i10 = 0;
                            while (it4.hasNext()) {
                                if (((Number) it4.next()).intValue() == i12 && (i10 = i10 + 1) < 0) {
                                    AbstractC1378t.v();
                                }
                            }
                        }
                        i8 += i10;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new U7.d((E6.f) entry.getValue(), this.f35767a.f994s.get(((E6.i) entry.getValue()).f2642a), null, U7.e.PURPOSE, false, this.f35770d.a().f7389d, Integer.valueOf(i8), 4));
                }
            }
        }
        g8.addAll(0, arrayList2);
        if (search.length() > 0) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : g8) {
                U7.d dVar = (U7.d) obj;
                if (dVar.f10541d != U7.e.PURPOSE && j6.n.F(dVar.f10538a.f2643b, search, true)) {
                    arrayList3.add(obj);
                }
            }
            return AbstractC1378t.Z0(arrayList3);
        }
        return g8;
    }

    public final Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = b("").iterator();
        while (it.hasNext()) {
            Boolean bool = ((U7.d) it.next()).f10539b;
            if (bool != null) {
                linkedHashSet.add(bool);
            }
        }
        return linkedHashSet;
    }

    public final void e(E5.j jVar) {
        AbstractC3255y.i(jVar, "<set-?>");
        this.f35776j = jVar;
    }

    public final List f() {
        Map map;
        ArrayList arrayList = new ArrayList();
        E6.e eVar = this.f35767a.f976a;
        if (eVar != null && (map = eVar.f2638i) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((E6.l) entry.getValue()).f2656k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!((E6.l) entry2.getValue()).f2650e.isEmpty()) {
                    arrayList.add(new U7.d((E6.f) entry2.getValue(), this.f35767a.f971C.get(((E6.l) entry2.getValue()).f2642a), null, null, false, null, null, 124));
                }
            }
        }
        return arrayList;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (H6.d dVar : this.f35769c.f3921a) {
            if (!dVar.f3920g.isEmpty()) {
                arrayList.add(new U7.d(dVar.a(), this.f35767a.f972D.get(dVar.f3914a), null, U7.e.NON_IAB_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }

    public final U7.d h() {
        boolean booleanValue;
        E6.l lVar = this.f35771e;
        if (lVar == null) {
            return null;
        }
        Boolean bool = this.f35767a.f996u.get(lVar.f2642a);
        if (bool == null) {
            booleanValue = true;
        } else {
            booleanValue = bool.booleanValue();
        }
        return new U7.d(lVar, Boolean.valueOf(booleanValue), null, U7.e.PUBLISHER_VENDOR, false, null, null, 116);
    }

    public final Map i() {
        Map map;
        E6.e eVar = this.f35767a.f976a;
        if (eVar == null || (map = eVar.f2633d) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.f35767a.f994s.contains(((E6.i) entry.getValue()).f2642a)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!AbstractC3255y.d(this.f35767a.f983h, "DE")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((E6.i) entry2.getValue()).f2642a != 1) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return linkedHashMap2;
        }
        return linkedHashMap;
    }
}
