package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class T4 {
    public static final int a(int i8, Object obj, Object obj2) {
        S4 s42 = (S4) obj;
        android.support.v4.media.a.a(obj2);
        if (!s42.isEmpty()) {
            Iterator it = s42.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object b(Object obj, Object obj2) {
        S4 s42 = (S4) obj;
        S4 s43 = (S4) obj2;
        if (!s43.isEmpty()) {
            if (!s42.f()) {
                s42 = s42.b();
            }
            s42.e(s43);
        }
        return s42;
    }
}
