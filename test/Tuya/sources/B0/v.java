package B0;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class v implements W0.d, W0.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f657a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f658b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f659c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor) {
        this.f659c = executor;
    }

    private synchronized Set e(W0.a aVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, W0.a aVar) {
        ((W0.b) entry.getKey()).a(aVar);
    }

    @Override // W0.d
    public void a(Class cls, W0.b bVar) {
        b(cls, this.f659c, bVar);
    }

    @Override // W0.d
    public synchronized void b(Class cls, Executor executor, W0.b bVar) {
        try {
            E.b(cls);
            E.b(bVar);
            E.b(executor);
            if (!this.f657a.containsKey(cls)) {
                this.f657a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f657a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f658b;
                if (queue != null) {
                    this.f658b = null;
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

    public void g(final W0.a aVar) {
        E.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f658b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : e(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, aVar) { // from class: B0.u

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f656a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            v.f(this.f656a, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
