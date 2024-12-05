package rx.n.a;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b;

/* compiled from: CompletableOnSubscribeMergeDelayErrorArray.java */
/* loaded from: classes3.dex */
public final class f implements b.w {

    /* renamed from: f, reason: collision with root package name */
    final rx.b[] f22560f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompletableOnSubscribeMergeDelayErrorArray.java */
    /* loaded from: classes3.dex */
    public class a implements rx.c {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.t.b f22561f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Queue f22562g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f22563h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.c f22564i;

        a(rx.t.b bVar, Queue queue, AtomicInteger atomicInteger, rx.c cVar) {
            this.f22561f = bVar;
            this.f22562g = queue;
            this.f22563h = atomicInteger;
            this.f22564i = cVar;
        }

        @Override // rx.c
        public void a(rx.k kVar) {
            this.f22561f.a(kVar);
        }

        void b() {
            if (this.f22563h.decrementAndGet() == 0) {
                if (this.f22562g.isEmpty()) {
                    this.f22564i.onCompleted();
                } else {
                    this.f22564i.onError(e.a(this.f22562g));
                }
            }
        }

        @Override // rx.c
        public void onCompleted() {
            b();
        }

        @Override // rx.c
        public void onError(Throwable th) {
            this.f22562g.offer(th);
            b();
        }
    }

    public f(rx.b[] bVarArr) {
        this.f22560f = bVarArr;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.c cVar) {
        rx.t.b bVar = new rx.t.b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f22560f.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        cVar.a(bVar);
        for (rx.b bVar2 : this.f22560f) {
            if (bVar.isUnsubscribed()) {
                return;
            }
            if (bVar2 == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                bVar2.P(new a(bVar, concurrentLinkedQueue, atomicInteger, cVar));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                cVar.onCompleted();
            } else {
                cVar.onError(e.a(concurrentLinkedQueue));
            }
        }
    }
}
