package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.b;
import com.mbridge.msdk.e.a.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ab implements p.a {

    /* renamed from: b, reason: collision with root package name */
    private final t f19831b;

    /* renamed from: d, reason: collision with root package name */
    private final c f19833d;

    /* renamed from: e, reason: collision with root package name */
    private final BlockingQueue<p<?>> f19834e;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<p<?>>> f19830a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final q f19832c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(c cVar, BlockingQueue<p<?>> blockingQueue, t tVar) {
        this.f19831b = tVar;
        this.f19833d = cVar;
        this.f19834e = blockingQueue;
    }

    @Override // com.mbridge.msdk.e.a.p.a
    public final void a(p<?> pVar, r<?> rVar) {
        List<p<?>> remove;
        b.a aVar = rVar.f19910b;
        if (aVar != null && !aVar.a(System.currentTimeMillis())) {
            String j8 = pVar.j();
            synchronized (this) {
                remove = this.f19830a.remove(j8);
            }
            if (remove != null) {
                Iterator<p<?>> it = remove.iterator();
                while (it.hasNext()) {
                    this.f19831b.a(it.next(), rVar);
                }
                return;
            }
            return;
        }
        a(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(p<?> pVar) {
        try {
            String j8 = pVar.j();
            if (this.f19830a.containsKey(j8)) {
                List<p<?>> list = this.f19830a.get(j8);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(pVar);
                this.f19830a.put(j8, list);
                return true;
            }
            this.f19830a.put(j8, null);
            pVar.a((p.a) this);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mbridge.msdk.e.a.p.a
    public final synchronized void a(p<?> pVar) {
        BlockingQueue<p<?>> blockingQueue;
        try {
            String j8 = pVar.j();
            List<p<?>> remove = this.f19830a.remove(j8);
            if (remove != null && !remove.isEmpty()) {
                p<?> remove2 = remove.remove(0);
                this.f19830a.put(j8, remove);
                remove2.a((p.a) this);
                q qVar = this.f19832c;
                if (qVar != null) {
                    qVar.c(remove2);
                } else if (this.f19833d != null && (blockingQueue = this.f19834e) != null) {
                    try {
                        blockingQueue.put(remove2);
                    } catch (InterruptedException e8) {
                        aa.c("Couldn't add request to queue. %s", e8.toString());
                        Thread.currentThread().interrupt();
                        this.f19833d.a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
