package com.airbnb.epoxy;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffPayload.java */
/* loaded from: classes.dex */
public class j {
    private final s<?> a;

    /* renamed from: b, reason: collision with root package name */
    private final c.e.d<s<?>> f7843b;

    j(List<? extends s<?>> list) {
        if (!list.isEmpty()) {
            int size = list.size();
            if (size == 1) {
                this.a = list.get(0);
                this.f7843b = null;
                return;
            }
            this.a = null;
            this.f7843b = new c.e.d<>(size);
            for (s<?> sVar : list) {
                this.f7843b.k(sVar.id(), sVar);
            }
            return;
        }
        throw new IllegalStateException("Models must not be empty");
    }

    public static s<?> a(List<Object> list, long j2) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            s<?> sVar = jVar.a;
            if (sVar == null) {
                s<?> g2 = jVar.f7843b.g(j2);
                if (g2 != null) {
                    return g2;
                }
            } else if (sVar.id() == j2) {
                return jVar.a;
            }
        }
        return null;
    }

    public j(s<?> sVar) {
        this((List<? extends s<?>>) Collections.singletonList(sVar));
    }
}
