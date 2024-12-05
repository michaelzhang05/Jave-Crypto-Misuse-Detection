package B5;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public List f946a;

    /* renamed from: b, reason: collision with root package name */
    public List f947b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f948c;

    /* renamed from: d, reason: collision with root package name */
    public E6.e f949d;

    public j(E6.e eVar, List consentRestrictionIds, List liRestrictionIds, Map map) {
        AbstractC3255y.i(consentRestrictionIds, "consentRestrictionIds");
        AbstractC3255y.i(liRestrictionIds, "liRestrictionIds");
        AbstractC3255y.i(map, "map");
        this.f946a = consentRestrictionIds;
        this.f947b = liRestrictionIds;
        this.f948c = map;
        this.f949d = eVar;
    }

    public final int a() {
        int intValue;
        Iterator it = this.f948c.entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) AbstractC1378t.A0((Iterable) ((Map.Entry) it.next()).getValue());
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            i8 = Math.max(i8, intValue);
        }
        return i8;
    }

    public final List b(Integer num) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f948c.entrySet()) {
            if (num != null && ((Set) entry.getValue()).contains(num)) {
                arrayList.add(i.f943c.a((String) entry.getKey()));
            }
        }
        return arrayList;
    }

    public final void c(int i8, i purposeRestriction) {
        AbstractC3255y.i(purposeRestriction, "purposeRestriction");
        k kVar = purposeRestriction.f945b;
        int i9 = purposeRestriction.f944a;
        E6.e eVar = this.f949d;
        if (eVar != null) {
            E6.l lVar = (E6.l) eVar.f2638i.get(String.valueOf(i8));
            if (lVar != null) {
                if (kVar == k.NOT_ALLOWED) {
                    if (!lVar.f2650e.contains(Integer.valueOf(i9)) && !lVar.f2649d.contains(Integer.valueOf(i9))) {
                        return;
                    }
                } else if (!lVar.f2651f.isEmpty()) {
                    int ordinal = kVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2 || !lVar.f2651f.contains(Integer.valueOf(i9)) || !lVar.f2649d.contains(Integer.valueOf(i9))) {
                            return;
                        }
                    } else if (!lVar.f2651f.contains(Integer.valueOf(i9)) || !lVar.f2650e.contains(Integer.valueOf(i9))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        String hash = purposeRestriction.a();
        AbstractC3255y.i(hash, "hash");
        if (!this.f948c.containsKey(hash)) {
            this.f948c.put(hash, new LinkedHashSet());
        }
        Iterator it = ((ArrayList) b(Integer.valueOf(i8))).iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.f944a == purposeRestriction.f944a) {
                String a8 = iVar.a();
                Set set = (Set) this.f948c.get(a8);
                if (set != null) {
                    set.remove(Integer.valueOf(i8));
                    if (set.isEmpty()) {
                        this.f948c.remove(a8);
                    }
                }
            }
        }
        Set set2 = (Set) this.f948c.get(hash);
        if (set2 != null) {
            set2.add(Integer.valueOf(i8));
        }
    }

    public /* synthetic */ j(E6.e eVar, List list, List list2, Map map, int i8) {
        this(eVar, (i8 & 2) != 0 ? AbstractC1378t.m() : null, (i8 & 4) != 0 ? AbstractC1378t.m() : null, (i8 & 8) != 0 ? new LinkedHashMap() : null);
    }
}
