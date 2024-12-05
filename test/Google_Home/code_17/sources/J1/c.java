package J1;

import J1.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f4811a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f4812b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f4813c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private b f4814d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f4811a = linkedBlockingQueue;
        this.f4812b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b bVar = (b) this.f4813c.poll();
        this.f4814d = bVar;
        if (bVar != null) {
            bVar.c(this.f4812b);
        }
    }

    @Override // J1.b.a
    public void a(b bVar) {
        this.f4814d = null;
        b();
    }

    public void c(b bVar) {
        bVar.a(this);
        this.f4813c.add(bVar);
        if (this.f4814d == null) {
            b();
        }
    }
}
