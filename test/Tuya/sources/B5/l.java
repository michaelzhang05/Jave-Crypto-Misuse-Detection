package B5;

import L5.p;
import L7.w;
import M5.AbstractC1246t;
import M5.a0;
import androidx.lifecycle.ViewModel;
import b.AbstractC1832c;
import g6.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import r5.AbstractC3689a;
import y5.C3998e;
import y5.s;

/* loaded from: classes5.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final w f1020a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1021b;

    /* renamed from: c, reason: collision with root package name */
    public final E6.f f1022c;

    /* renamed from: d, reason: collision with root package name */
    public final C3998e f1023d;

    /* renamed from: e, reason: collision with root package name */
    public final B6.l f1024e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1025f;

    /* renamed from: g, reason: collision with root package name */
    public final List f1026g;

    /* renamed from: h, reason: collision with root package name */
    public final List f1027h;

    /* renamed from: i, reason: collision with root package name */
    public final List f1028i;

    /* renamed from: j, reason: collision with root package name */
    public j f1029j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1030k;

    /* renamed from: l, reason: collision with root package name */
    public int f1031l;

    public l(w translationsTextRepository, s tcModel, E6.f portalConfig, C3998e googleVendorList, B6.l lVar, List vendorPurposeIds, List vendorSpecialPurposeIds, List vendorFeaturesIds, List vendorSpecialFeaturesIds) {
        AbstractC3159y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(portalConfig, "portalConfig");
        AbstractC3159y.i(googleVendorList, "googleVendorList");
        AbstractC3159y.i(vendorPurposeIds, "vendorPurposeIds");
        AbstractC3159y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3159y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3159y.i(vendorSpecialFeaturesIds, "vendorSpecialFeaturesIds");
        this.f1020a = translationsTextRepository;
        this.f1021b = tcModel;
        this.f1022c = portalConfig;
        this.f1023d = googleVendorList;
        this.f1024e = lVar;
        this.f1025f = vendorPurposeIds;
        this.f1026g = vendorSpecialPurposeIds;
        this.f1027h = vendorFeaturesIds;
        this.f1028i = vendorSpecialFeaturesIds;
        this.f1029j = j.ALL_VENDORS;
        this.f1031l = 3;
    }

    public final String a(Set ids, a type) {
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
                            B6.e eVar = this.f1021b.f39932a;
                            if (eVar != null) {
                                map = eVar.f1045k;
                            }
                            map = null;
                        } else {
                            throw new p();
                        }
                    } else {
                        b12 = AbstractC1246t.b1(this.f1028i);
                        B6.e eVar2 = this.f1021b.f39932a;
                        if (eVar2 != null) {
                            map = eVar2.f1041g;
                        }
                        map = null;
                    }
                } else {
                    b12 = AbstractC1246t.b1(this.f1027h);
                    B6.e eVar3 = this.f1021b.f39932a;
                    if (eVar3 != null) {
                        map = eVar3.f1040f;
                    }
                    map = null;
                }
            } else {
                b12 = AbstractC1246t.b1(this.f1026g);
                B6.e eVar4 = this.f1021b.f39932a;
                if (eVar4 != null) {
                    map = eVar4.f1039e;
                }
                map = null;
            }
        } else {
            b12 = AbstractC1246t.b1(this.f1025f);
            B6.e eVar5 = this.f1021b.f39932a;
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

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1023d.f39889a.entrySet()) {
            if (this.f1021b.f39926B.get(((y5.f) entry.getValue()).f39890a) != null) {
                arrayList.add(new R7.d(((y5.f) entry.getValue()).a(), this.f1021b.f39926B.get(((y5.f) entry.getValue()).f39890a), null, R7.e.GOOGLE_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }

    public final List c(String search) {
        List f8;
        R7.d dVar;
        boolean booleanValue;
        AbstractC3159y.i(search, "search");
        int ordinal = this.f1029j.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        f8 = b();
                    } else {
                        throw new p();
                    }
                } else {
                    f8 = f();
                }
            } else {
                f8 = e();
            }
        } else {
            f8 = f();
            ArrayList arrayList = (ArrayList) f8;
            arrayList.addAll(e());
            arrayList.addAll(b());
            B6.l lVar = this.f1024e;
            if (lVar == null) {
                dVar = null;
            } else {
                Boolean bool = this.f1021b.f39951t.get(lVar.f1047a);
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                dVar = new R7.d(lVar, Boolean.valueOf(booleanValue), null, R7.e.PUBLISHER_VENDOR, false, null, null, 116);
            }
            if (dVar != null) {
                arrayList.add(0, dVar);
            }
        }
        f8.add(0, new R7.d(null, null, R7.f.LABEL, null, false, this.f1020a.a().f5683d, null, 91));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f8) {
            if (n.F(((R7.d) obj).f8912a.f1048b, search, true)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC1246t.Z0(arrayList2);
    }

    public final void d(j jVar) {
        AbstractC3159y.i(jVar, "<set-?>");
        this.f1029j = jVar;
    }

    public final List e() {
        Map map;
        ArrayList arrayList = new ArrayList();
        B6.e eVar = this.f1021b.f39932a;
        if (eVar != null && (map = eVar.f1043i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (this.f1021b.f39957z.get(((B6.l) entry.getValue()).f1047a) != null) {
                    Set set = ((B6.l) entry.getValue()).f1054d;
                    List list = this.f1022c.f2375b.f2340h;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1832c.a((Number) it.next(), list)) {
                                arrayList.add(new R7.d((B6.f) entry.getValue(), this.f1021b.f39957z.get(((B6.l) entry.getValue()).f1047a), null, null, false, null, null, 124));
                                break;
                            }
                        }
                    }
                    arrayList.add(new R7.d((B6.f) entry.getValue(), null, null, null, false, null, null, 124));
                }
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (E6.d dVar : this.f1022c.f2376c.f2371a) {
            if (this.f1021b.f39925A.get(dVar.f2364a) != null) {
                arrayList.add(new R7.d(dVar.a(), this.f1021b.f39925A.get(dVar.f2364a), null, R7.e.NON_IAB_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }
}
