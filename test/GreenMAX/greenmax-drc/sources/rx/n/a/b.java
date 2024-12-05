package rx.n.a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;

/* compiled from: BufferUntilSubscriber.java */
/* loaded from: classes3.dex */
public final class b<T> extends rx.s.d<T, T> {

    /* renamed from: g, reason: collision with root package name */
    static final rx.f f22487g = new a();

    /* renamed from: h, reason: collision with root package name */
    final c<T> f22488h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22489i;

    /* compiled from: BufferUntilSubscriber.java */
    /* loaded from: classes3.dex */
    static class a implements rx.f {
        a() {
        }

        @Override // rx.f
        public void onCompleted() {
        }

        @Override // rx.f
        public void onError(Throwable th) {
        }

        @Override // rx.f
        public void onNext(Object obj) {
        }
    }

    /* compiled from: BufferUntilSubscriber.java */
    /* renamed from: rx.n.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0399b<T> implements e.a<T> {

        /* renamed from: f, reason: collision with root package name */
        final c<T> f22490f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BufferUntilSubscriber.java */
        /* renamed from: rx.n.a.b$b$a */
        /* loaded from: classes3.dex */
        public class a implements rx.m.a {
            a() {
            }

            @Override // rx.m.a
            public void call() {
                C0399b.this.f22490f.set(b.f22487g);
            }
        }

        public C0399b(c<T> cVar) {
            this.f22490f = cVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.j<? super T> jVar) {
            boolean z;
            if (this.f22490f.a(null, jVar)) {
                jVar.add(rx.t.e.a(new a()));
                synchronized (this.f22490f.f22492f) {
                    c<T> cVar = this.f22490f;
                    z = true;
                    if (cVar.f22493g) {
                        z = false;
                    } else {
                        cVar.f22493g = true;
                    }
                }
                if (!z) {
                    return;
                }
                while (true) {
                    Object poll = this.f22490f.f22494h.poll();
                    if (poll != null) {
                        h.a(this.f22490f.get(), poll);
                    } else {
                        synchronized (this.f22490f.f22492f) {
                            if (this.f22490f.f22494h.isEmpty()) {
                                this.f22490f.f22493g = false;
                                return;
                            }
                        }
                    }
                }
            } else {
                jVar.onError(new IllegalStateException("Only one subscriber allowed!"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferUntilSubscriber.java */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicReference<rx.f<? super T>> {

        /* renamed from: g, reason: collision with root package name */
        boolean f22493g;

        /* renamed from: f, reason: collision with root package name */
        final Object f22492f = new Object();

        /* renamed from: h, reason: collision with root package name */
        final ConcurrentLinkedQueue<Object> f22494h = new ConcurrentLinkedQueue<>();

        c() {
        }

        boolean a(rx.f<? super T> fVar, rx.f<? super T> fVar2) {
            return compareAndSet(fVar, fVar2);
        }
    }

    private b(c<T> cVar) {
        super(new C0399b(cVar));
        this.f22488h = cVar;
    }

    public static <T> b<T> g1() {
        return new b<>(new c());
    }

    private void h1(Object obj) {
        synchronized (this.f22488h.f22492f) {
            this.f22488h.f22494h.add(obj);
            if (this.f22488h.get() != null) {
                c<T> cVar = this.f22488h;
                if (!cVar.f22493g) {
                    this.f22489i = true;
                    cVar.f22493g = true;
                }
            }
        }
        if (!this.f22489i) {
            return;
        }
        while (true) {
            Object poll = this.f22488h.f22494h.poll();
            if (poll == null) {
                return;
            } else {
                h.a(this.f22488h.get(), poll);
            }
        }
    }

    @Override // rx.f
    public void onCompleted() {
        if (this.f22489i) {
            this.f22488h.get().onCompleted();
        } else {
            h1(h.b());
        }
    }

    @Override // rx.f
    public void onError(Throwable th) {
        if (this.f22489i) {
            this.f22488h.get().onError(th);
        } else {
            h1(h.c(th));
        }
    }

    @Override // rx.f
    public void onNext(T t) {
        if (this.f22489i) {
            this.f22488h.get().onNext(t);
        } else {
            h1(h.g(t));
        }
    }
}
