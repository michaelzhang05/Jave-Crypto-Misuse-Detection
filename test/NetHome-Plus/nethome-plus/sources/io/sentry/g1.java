package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: DuplicateEventDetectionEventProcessor.java */
/* loaded from: classes2.dex */
public final class g1 implements k1 {

    /* renamed from: f, reason: collision with root package name */
    private final Map<Throwable, Object> f18945f = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: g, reason: collision with root package name */
    private final x4 f18946g;

    public g1(x4 x4Var) {
        this.f18946g = (x4) io.sentry.util.q.c(x4Var, "options are required");
    }

    private static List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th.getCause() != null) {
            arrayList.add(th.getCause());
            th = th.getCause();
        }
        return arrayList;
    }

    private static <T> boolean c(Map<T, Object> map, List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.k1
    public l4 b(l4 l4Var, n1 n1Var) {
        if (this.f18946g.isEnableDeduplication()) {
            Throwable O = l4Var.O();
            if (O != null) {
                if (!this.f18945f.containsKey(O) && !c(this.f18945f, a(O))) {
                    this.f18945f.put(O, null);
                } else {
                    this.f18946g.getLogger().c(s4.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", l4Var.G());
                    return null;
                }
            }
        } else {
            this.f18946g.getLogger().c(s4.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return l4Var;
    }

    @Override // io.sentry.k1
    public /* synthetic */ io.sentry.protocol.x w(io.sentry.protocol.x xVar, n1 n1Var) {
        return j1.a(this, xVar, n1Var);
    }
}
