package com.facebook.t;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppEventCollection.java */
/* loaded from: classes.dex */
public class d {
    private final HashMap<a, o> a = new HashMap<>();

    private synchronized o e(a aVar) {
        o oVar;
        oVar = this.a.get(aVar);
        if (oVar == null) {
            Context e2 = com.facebook.f.e();
            oVar = new o(com.facebook.internal.a.h(e2), g.d(e2));
        }
        this.a.put(aVar, oVar);
        return oVar;
    }

    public synchronized void a(a aVar, c cVar) {
        e(aVar).a(cVar);
    }

    public synchronized void b(n nVar) {
        if (nVar == null) {
            return;
        }
        for (a aVar : nVar.d()) {
            o e2 = e(aVar);
            Iterator<c> it = nVar.c(aVar).iterator();
            while (it.hasNext()) {
                e2.a(it.next());
            }
        }
    }

    public synchronized o c(a aVar) {
        return this.a.get(aVar);
    }

    public synchronized int d() {
        int i2;
        i2 = 0;
        Iterator<o> it = this.a.values().iterator();
        while (it.hasNext()) {
            i2 += it.next().c();
        }
        return i2;
    }

    public synchronized Set<a> f() {
        return this.a.keySet();
    }
}
