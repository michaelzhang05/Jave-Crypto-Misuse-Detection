package y5;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public List f39902a;

    /* renamed from: b, reason: collision with root package name */
    public List f39903b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f39904c;

    /* renamed from: d, reason: collision with root package name */
    public B6.e f39905d;

    public j(B6.e eVar, List consentRestrictionIds, List liRestrictionIds, Map map) {
        AbstractC3159y.i(consentRestrictionIds, "consentRestrictionIds");
        AbstractC3159y.i(liRestrictionIds, "liRestrictionIds");
        AbstractC3159y.i(map, "map");
        this.f39902a = consentRestrictionIds;
        this.f39903b = liRestrictionIds;
        this.f39904c = map;
        this.f39905d = eVar;
    }

    public final int a() {
        int intValue;
        Iterator it = this.f39904c.entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) AbstractC1246t.A0((Iterable) ((Map.Entry) it.next()).getValue());
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
        for (Map.Entry entry : this.f39904c.entrySet()) {
            if (num != null && ((Set) entry.getValue()).contains(num)) {
                arrayList.add(i.f39899c.a((String) entry.getKey()));
            }
        }
        return arrayList;
    }

    public final void c(int i8, i purposeRestriction) {
        AbstractC3159y.i(purposeRestriction, "purposeRestriction");
        k kVar = purposeRestriction.f39901b;
        int i9 = purposeRestriction.f39900a;
        B6.e eVar = this.f39905d;
        if (eVar != null) {
            B6.l lVar = (B6.l) eVar.f1043i.get(String.valueOf(i8));
            if (lVar != null) {
                if (kVar == k.NOT_ALLOWED) {
                    if (!lVar.f1055e.contains(Integer.valueOf(i9)) && !lVar.f1054d.contains(Integer.valueOf(i9))) {
                        return;
                    }
                } else if (!lVar.f1056f.isEmpty()) {
                    int ordinal = kVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2 || !lVar.f1056f.contains(Integer.valueOf(i9)) || !lVar.f1054d.contains(Integer.valueOf(i9))) {
                            return;
                        }
                    } else if (!lVar.f1056f.contains(Integer.valueOf(i9)) || !lVar.f1055e.contains(Integer.valueOf(i9))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        String hash = purposeRestriction.a();
        AbstractC3159y.i(hash, "hash");
        if (!this.f39904c.containsKey(hash)) {
            this.f39904c.put(hash, new LinkedHashSet());
        }
        Iterator it = ((ArrayList) b(Integer.valueOf(i8))).iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.f39900a == purposeRestriction.f39900a) {
                String a8 = iVar.a();
                Set set = (Set) this.f39904c.get(a8);
                if (set != null) {
                    set.remove(Integer.valueOf(i8));
                    if (set.isEmpty()) {
                        this.f39904c.remove(a8);
                    }
                }
            }
        }
        Set set2 = (Set) this.f39904c.get(hash);
        if (set2 != null) {
            set2.add(Integer.valueOf(i8));
        }
    }

    public /* synthetic */ j(B6.e eVar, List list, List list2, Map map, int i8) {
        this(eVar, (i8 & 2) != 0 ? AbstractC1246t.m() : null, (i8 & 4) != 0 ? AbstractC1246t.m() : null, (i8 & 8) != 0 ? new LinkedHashMap() : null);
    }
}
