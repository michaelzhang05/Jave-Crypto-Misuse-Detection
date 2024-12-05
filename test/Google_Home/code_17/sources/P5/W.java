package P5;

import i6.InterfaceC2998g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class W extends V {
    public static InterfaceC2998g C(Map map) {
        AbstractC3255y.i(map, "<this>");
        return AbstractC1378t.c0(map.entrySet());
    }

    public static List D(Map map) {
        AbstractC3255y.i(map, "<this>");
        if (map.size() == 0) {
            return AbstractC1378t.m();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return AbstractC1378t.m();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC1378t.e(new O5.r(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new O5.r(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new O5.r(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
