package D0;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class v implements Y0.d, Y0.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f1763a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f1764b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f1765c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor) {
        this.f1765c = executor;
    }

    private synchronized Set e(Y0.a aVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, Y0.a aVar) {
        ((Y0.b) entry.getKey()).a(aVar);
    }

    @Override // Y0.d
    public void a(Class cls, Y0.b bVar) {
        b(cls, this.f1765c, bVar);
    }

    @Override // Y0.d
    public synchronized void b(Class cls, Executor executor, Y0.b bVar) {
        try {
            E.b(cls);
            E.b(bVar);
            E.b(executor);
            if (!this.f1763a.containsKey(cls)) {
                this.f1763a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f1763a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f1764b;
                if (queue != null) {
                    this.f1764b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                g(null);
            }
        }
    }

    public void g(final Y0.a aVar) {
        E.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f1764b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : e(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, aVar) { // from class: D0.u

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f1762a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            v.f(this.f1762a, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
