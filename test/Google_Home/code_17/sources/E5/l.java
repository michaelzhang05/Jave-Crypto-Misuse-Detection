package E5;

import B5.s;
import O5.p;
import O7.w;
import P5.AbstractC1378t;
import P5.a0;
import androidx.lifecycle.ViewModel;
import b.AbstractC1941c;
import j6.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final w f2615a;

    /* renamed from: b, reason: collision with root package name */
    public final s f2616b;

    /* renamed from: c, reason: collision with root package name */
    public final H6.f f2617c;

    /* renamed from: d, reason: collision with root package name */
    public final B5.e f2618d;

    /* renamed from: e, reason: collision with root package name */
    public final E6.l f2619e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2620f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2621g;

    /* renamed from: h, reason: collision with root package name */
    public final List f2622h;

    /* renamed from: i, reason: collision with root package name */
    public final List f2623i;

    /* renamed from: j, reason: collision with root package name */
    public j f2624j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2625k;

    /* renamed from: l, reason: collision with root package name */
    public int f2626l;

    public l(w translationsTextRepository, s tcModel, H6.f portalConfig, B5.e googleVendorList, E6.l lVar, List vendorPurposeIds, List vendorSpecialPurposeIds, List vendorFeaturesIds, List vendorSpecialFeaturesIds) {
        AbstractC3255y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(portalConfig, "portalConfig");
        AbstractC3255y.i(googleVendorList, "googleVendorList");
        AbstractC3255y.i(vendorPurposeIds, "vendorPurposeIds");
        AbstractC3255y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3255y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3255y.i(vendorSpecialFeaturesIds, "vendorSpecialFeaturesIds");
        this.f2615a = translationsTextRepository;
        this.f2616b = tcModel;
        this.f2617c = portalConfig;
        this.f2618d = googleVendorList;
        this.f2619e = lVar;
        this.f2620f = vendorPurposeIds;
        this.f2621g = vendorSpecialPurposeIds;
        this.f2622h = vendorFeaturesIds;
        this.f2623i = vendorSpecialFeaturesIds;
        this.f2624j = j.ALL_VENDORS;
        this.f2626l = 3;
    }

    public final String a(Set ids, a type) {
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
                            E6.e eVar = this.f2616b.f976a;
                            if (eVar != null) {
                                map = eVar.f2640k;
                            }
                            map = null;
                        } else {
                            throw new p();
                        }
                    } else {
                        b12 = AbstractC1378t.b1(this.f2623i);
                        E6.e eVar2 = this.f2616b.f976a;
                        if (eVar2 != null) {
                            map = eVar2.f2636g;
                        }
                        map = null;
                    }
                } else {
                    b12 = AbstractC1378t.b1(this.f2622h);
                    E6.e eVar3 = this.f2616b.f976a;
                    if (eVar3 != null) {
                        map = eVar3.f2635f;
                    }
                    map = null;
                }
            } else {
                b12 = AbstractC1378t.b1(this.f2621g);
                E6.e eVar4 = this.f2616b.f976a;
                if (eVar4 != null) {
                    map = eVar4.f2634e;
                }
                map = null;
            }
        } else {
            b12 = AbstractC1378t.b1(this.f2620f);
            E6.e eVar5 = this.f2616b.f976a;
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

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2618d.f933a.entrySet()) {
            if (this.f2616b.f970B.get(((B5.f) entry.getValue()).f934a) != null) {
                arrayList.add(new U7.d(((B5.f) entry.getValue()).a(), this.f2616b.f970B.get(((B5.f) entry.getValue()).f934a), null, U7.e.GOOGLE_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }

    public final List c(String search) {
        List f8;
        U7.d dVar;
        boolean booleanValue;
        AbstractC3255y.i(search, "search");
        int ordinal = this.f2624j.ordinal();
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
            E6.l lVar = this.f2619e;
            if (lVar == null) {
                dVar = null;
            } else {
                Boolean bool = this.f2616b.f995t.get(lVar.f2642a);
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                dVar = new U7.d(lVar, Boolean.valueOf(booleanValue), null, U7.e.PUBLISHER_VENDOR, false, null, null, 116);
            }
            if (dVar != null) {
                arrayList.add(0, dVar);
            }
        }
        f8.add(0, new U7.d(null, null, U7.f.LABEL, null, false, this.f2615a.a().f7389d, null, 91));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f8) {
            if (n.F(((U7.d) obj).f10538a.f2643b, search, true)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC1378t.Z0(arrayList2);
    }

    public final void d(j jVar) {
        AbstractC3255y.i(jVar, "<set-?>");
        this.f2624j = jVar;
    }

    public final List e() {
        Map map;
        ArrayList arrayList = new ArrayList();
        E6.e eVar = this.f2616b.f976a;
        if (eVar != null && (map = eVar.f2638i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (this.f2616b.f1001z.get(((E6.l) entry.getValue()).f2642a) != null) {
                    Set set = ((E6.l) entry.getValue()).f2649d;
                    List list = this.f2617c.f3925b.f3890h;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1941c.a((Number) it.next(), list)) {
                                arrayList.add(new U7.d((E6.f) entry.getValue(), this.f2616b.f1001z.get(((E6.l) entry.getValue()).f2642a), null, null, false, null, null, 124));
                                break;
                            }
                        }
                    }
                    arrayList.add(new U7.d((E6.f) entry.getValue(), null, null, null, false, null, null, 124));
                }
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (H6.d dVar : this.f2617c.f3926c.f3921a) {
            if (this.f2616b.f969A.get(dVar.f3914a) != null) {
                arrayList.add(new U7.d(dVar.a(), this.f2616b.f969A.get(dVar.f3914a), null, U7.e.NON_IAB_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }
}
