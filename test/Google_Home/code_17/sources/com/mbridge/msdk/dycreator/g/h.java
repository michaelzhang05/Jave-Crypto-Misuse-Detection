package com.mbridge.msdk.dycreator.g;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h extends a {
    public final void a(Object obj) {
        g gVar;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f19745a;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            for (Map.Entry<Integer, Object> entry : this.f19745a.entrySet()) {
                if (entry != null) {
                    try {
                        if (entry.getValue() != null && (gVar = (g) entry.getValue()) != null) {
                            gVar.a(obj);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }
}
