package F5;

import B6.i;
import B6.j;
import B6.l;
import L7.w;
import M5.AbstractC1246t;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import y5.s;

/* loaded from: classes5.dex */
public final class e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f2682a;

    /* renamed from: b, reason: collision with root package name */
    public final E6.f f2683b;

    /* renamed from: c, reason: collision with root package name */
    public final w f2684c;

    public e(s tcModel, E6.f portalConfig, w translationsTextRepository) {
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(portalConfig, "portalConfig");
        AbstractC3159y.i(translationsTextRepository, "translationsTextRepository");
        this.f2682a = tcModel;
        this.f2683b = portalConfig;
        this.f2684c = translationsTextRepository;
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
            Boolean bool = ((R7.d) it.next()).f8913b;
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
        B6.e eVar = this.f2682a.f39932a;
        if (eVar != null && (map = eVar.f1038d) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (this.f2682a.f39949r.contains(((i) entry.getValue()).f1047a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                B6.e eVar2 = this.f2682a.f39932a;
                if (eVar2 != null && (map3 = eVar2.f1044j) != null && (jVar = (j) map3.get(String.valueOf(i8))) != null && (list = jVar.f1051c) != null && list.contains(Integer.valueOf(((i) entry2.getValue()).f1047a))) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int i12 = ((i) entry3.getValue()).f1047a;
                B6.e eVar3 = this.f2682a.f39932a;
                if (eVar3 == null || (map2 = eVar3.f1043i) == null) {
                    i9 = 0;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry4 : map2.entrySet()) {
                        if (((l) entry4.getValue()).f1061k == null) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it = linkedHashMap3.entrySet().iterator();
                    i9 = 0;
                    while (it.hasNext()) {
                        Set set = ((l) ((Map.Entry) it.next()).getValue()).f1054d;
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
                        i9 += i11;
                    }
                }
                Iterator it3 = this.f2683b.f2376c.f2371a.iterator();
                while (it3.hasNext()) {
                    List list2 = ((E6.d) it3.next()).f2369f;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i10 = 0;
                    } else {
                        Iterator it4 = list2.iterator();
                        i10 = 0;
                        while (it4.hasNext()) {
                            if (((Number) it4.next()).intValue() == i12 && (i10 = i10 + 1) < 0) {
                                AbstractC1246t.v();
                            }
                        }
                    }
                    i9 += i10;
                }
                if (i9 > 0) {
                    arrayList.add(new R7.d((B6.f) entry3.getValue(), this.f2682a.f39949r.get(((i) entry3.getValue()).f1047a), null, R7.e.PURPOSE, false, this.f2684c.a().f5683d, Integer.valueOf(i9), 20));
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
        B6.e eVar = this.f2682a.f39932a;
        if (eVar != null && (map = eVar.f1041g) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (this.f2682a.f39948q.contains(((B6.d) entry.getValue()).f1047a)) {
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
                B6.e eVar2 = this.f2682a.f39932a;
                if (eVar2 != null && (map3 = eVar2.f1044j) != null && (jVar = (j) map3.get(String.valueOf(i8))) != null && (list = jVar.f1052d) != null) {
                    z9 = list.contains(Integer.valueOf(((B6.d) entry2.getValue()).f1047a));
                }
                if (z9) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int i11 = ((B6.d) entry3.getValue()).f1047a;
                B6.e eVar3 = this.f2682a.f39932a;
                if (eVar3 == null || (map2 = eVar3.f1043i) == null) {
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
                        if (((l) entry4.getValue()).f1061k != null) {
                            z10 = false;
                        }
                        if (z10) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it3 = linkedHashMap3.entrySet().iterator();
                    i9 = 0;
                    while (it3.hasNext()) {
                        Set set = ((l) ((Map.Entry) it3.next()).getValue()).f1059i;
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
                                    AbstractC1246t.v();
                                }
                            }
                        }
                        i9 += i10;
                    }
                }
                if (i9 > 0) {
                    arrayList.add(new R7.d((B6.f) entry3.getValue(), this.f2682a.f39948q.get(((B6.d) entry3.getValue()).f1047a), null, R7.e.SPECIAL_FEATURE, false, this.f2684c.a().f5683d, Integer.valueOf(i9), 20));
                }
            }
        }
        return arrayList;
    }
}
