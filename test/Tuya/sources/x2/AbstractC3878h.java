package x2;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y6.AbstractC4007i;
import y6.C4000b;

/* renamed from: x2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3878h {
    private static final AbstractC4007i b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : AbstractC1246t.j0(list)) {
            if (obj instanceof Map) {
                arrayList.add(c((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(b((List) obj));
            } else {
                arrayList.add(y6.j.a(obj.toString()));
            }
        }
        return new C4000b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4007i c(Map map) {
        String str;
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                str = (String) key;
            } else {
                str = null;
            }
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, c((Map) value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, b((List) value));
                } else {
                    linkedHashMap.put(str, y6.j.a(value.toString()));
                }
            }
        }
        return new y6.v(linkedHashMap);
    }
}
