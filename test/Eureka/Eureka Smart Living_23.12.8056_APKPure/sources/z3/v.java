package z3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class v implements h4.d, h4.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10038a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f10039b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f10040c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor) {
        this.f10040c = executor;
    }

    private synchronized Set e(h4.a aVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, h4.a aVar) {
        ((h4.b) entry.getKey()).a(aVar);
    }

    @Override // h4.d
    public synchronized void a(Class cls, h4.b bVar) {
        d0.b(cls);
        d0.b(bVar);
        if (this.f10038a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f10038a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f10038a.remove(cls);
            }
        }
    }

    @Override // h4.d
    public void b(Class cls, h4.b bVar) {
        h(cls, this.f10040c, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Queue queue;
        synchronized (this) {
            queue = this.f10039b;
            if (queue != null) {
                this.f10039b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.f0.a(it.next());
                g(null);
            }
        }
    }

    public void g(final h4.a aVar) {
        d0.b(aVar);
        synchronized (this) {
            Queue queue = this.f10039b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry entry : e(aVar)) {
                ((Executor) entry.getValue()).execute(new Runnable(entry, aVar) { // from class: z3.u

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Map.Entry f10037a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        v.f(this.f10037a, null);
                    }
                });
            }
        }
    }

    public synchronized void h(Class cls, Executor executor, h4.b bVar) {
        d0.b(cls);
        d0.b(bVar);
        d0.b(executor);
        if (!this.f10038a.containsKey(cls)) {
            this.f10038a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f10038a.get(cls)).put(bVar, executor);
    }
}
