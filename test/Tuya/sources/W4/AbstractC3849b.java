package w4;

import L5.r;
import L5.x;
import M5.Q;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3849b {
    public static final Map a(Map map) {
        r rVar;
        AbstractC3159y.i(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                rVar = x.a(key, value);
            } else {
                rVar = null;
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return Q.w(arrayList);
    }
}
