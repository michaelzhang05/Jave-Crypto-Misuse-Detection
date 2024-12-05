package I5;

import B5.s;
import E6.i;
import E6.j;
import E6.l;
import O7.w;
import P5.AbstractC1378t;
import androidx.lifecycle.ViewModel;
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
public final class e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f4222a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.f f4223b;

    /* renamed from: c, reason: collision with root package name */
    public final w f4224c;

    public e(s tcModel, H6.f portalConfig, w translationsTextRepository) {
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(portalConfig, "portalConfig");
        AbstractC3255y.i(translationsTextRepository, "translationsTextRepository");
        this.f4222a = tcModel;
        this.f4223b = portalConfig;
        this.f4224c = translationsTextRepository;
    }

    public final List a(int i8) {
        List c8 = c(i8);
        ((ArrayList) c8).addAll(d(i8));
        return c8;
    }

    public final Set b(int i8) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List c8 = c(i8);
        ((ArrayList) c8).addAll(d(i8));
        Iterator it = c8.iterator();
        while (it.hasNext()) {
            Boolean bool = ((U7.d) it.next()).f10539b;
            if (bool != null) {
                linkedHashSet.add(bool);
            }
        }
        return linkedHashSet;
    }

    public final List c(int i8) {
        Map map;
        int i9;
        int i10;
        Map map2;
        int i11;
        Map map3;
        j jVar;
        List list;
        ArrayList arrayList = new ArrayList();
        E6.e eVar = this.f4222a.f976a;
        if (eVar != null && (map = eVar.f2633d) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (this.f4222a.f993r.contains(((i) entry.getValue()).f2642a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                E6.e eVar2 = this.f4222a.f976a;
                if (eVar2 != null && (map3 = eVar2.f2639j) != null && (jVar = (j) map3.get(String.valueOf(i8))) != null && (list = jVar.f2646c) != null && list.contains(Integer.valueOf(((i) entry2.getValue()).f2642a))) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int i12 = ((i) entry3.getValue()).f2642a;
                E6.e eVar3 = this.f4222a.f976a;
                if (eVar3 == null || (map2 = eVar3.f2638i) == null) {
                    i9 = 0;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry4 : map2.entrySet()) {
                        if (((l) entry4.getValue()).f2656k == null) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it = linkedHashMap3.entrySet().iterator();
                    i9 = 0;
                    while (it.hasNext()) {
                        Set set = ((l) ((Map.Entry) it.next()).getValue()).f2649d;
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
                        i9 += i11;
                    }
                }
                Iterator it3 = this.f4223b.f3926c.f3921a.iterator();
                while (it3.hasNext()) {
                    List list2 = ((H6.d) it3.next()).f3919f;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i10 = 0;
                    } else {
                        Iterator it4 = list2.iterator();
                        i10 = 0;
                        while (it4.hasNext()) {
                            if (((Number) it4.next()).intValue() == i12 && (i10 = i10 + 1) < 0) {
                                AbstractC1378t.v();
                            }
                        }
                    }
                    i9 += i10;
                }
                if (i9 > 0) {
                    arrayList.add(new U7.d((E6.f) entry3.getValue(), this.f4222a.f993r.get(((i) entry3.getValue()).f2642a), null, U7.e.PURPOSE, false, this.f4224c.a().f7389d, Integer.valueOf(i9), 20));
                }
            }
        }
        return arrayList;
    }

    public final List d(int i8) {
        Map map;
        int i9;
        Map map2;
        int i10;
        boolean z8;
        Map map3;
        j jVar;
        List list;
        ArrayList arrayList = new ArrayList();
        E6.e eVar = this.f4222a.f976a;
        if (eVar != null && (map = eVar.f2636g) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (this.f4222a.f992q.contains(((E6.d) entry.getValue()).f2642a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean z9 = false;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                E6.e eVar2 = this.f4222a.f976a;
                if (eVar2 != null && (map3 = eVar2.f2639j) != null && (jVar = (j) map3.get(String.valueOf(i8))) != null && (list = jVar.f2647d) != null) {
                    z9 = list.contains(Integer.valueOf(((E6.d) entry2.getValue()).f2642a));
                }
                if (z9) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int i11 = ((E6.d) entry3.getValue()).f2642a;
                E6.e eVar3 = this.f4222a.f976a;
                if (eVar3 == null || (map2 = eVar3.f2638i) == null) {
                    i9 = 0;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it2 = map2.entrySet().iterator();
                    while (true) {
                        boolean z10 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry4 = (Map.Entry) it2.next();
                        if (((l) entry4.getValue()).f2656k != null) {
                            z10 = false;
                        }
                        if (z10) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it3 = linkedHashMap3.entrySet().iterator();
                    i9 = 0;
                    while (it3.hasNext()) {
                        Set set = ((l) ((Map.Entry) it3.next()).getValue()).f2654i;
                        if ((set instanceof Collection) && set.isEmpty()) {
                            i10 = 0;
                        } else {
                            Iterator it4 = set.iterator();
                            i10 = 0;
                            while (it4.hasNext()) {
                                if (((Number) it4.next()).intValue() == i11) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8 && (i10 = i10 + 1) < 0) {
                                    AbstractC1378t.v();
                                }
                            }
                        }
                        i9 += i10;
                    }
                }
                if (i9 > 0) {
                    arrayList.add(new U7.d((E6.f) entry3.getValue(), this.f4222a.f992q.get(((E6.d) entry3.getValue()).f2642a), null, U7.e.SPECIAL_FEATURE, false, this.f4224c.a().f7389d, Integer.valueOf(i9), 20));
                }
            }
        }
        return arrayList;
    }
}
