package rx.n.a;

import java.util.concurrent.TimeUnit;
import rx.e;
import rx.h;

/* compiled from: OperatorDebounceWithTime.java */
/* loaded from: classes3.dex */
public final class k0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    final long f22663f;

    /* renamed from: g, reason: collision with root package name */
    final TimeUnit f22664g;

    /* renamed from: h, reason: collision with root package name */
    final rx.h f22665h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorDebounceWithTime.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final b<T> f22666f;

        /* renamed from: g, reason: collision with root package name */
        final rx.j<?> f22667g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.t.d f22668h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h.a f22669i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ rx.p.e f22670j;

        /* compiled from: OperatorDebounceWithTime.java */
        /* renamed from: rx.n.a.k0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0402a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f22672f;

            C0402a(int i2) {
                this.f22672f = i2;
            }

            @Override // rx.m.a
            public void call() {
                a aVar = a.this;
                aVar.f22666f.b(this.f22672f, aVar.f22670j, aVar.f22667g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rx.j jVar, rx.t.d dVar, h.a aVar, rx.p.e eVar) {
            super(jVar);
            this.f22668h = dVar;
            this.f22669i = aVar;
            this.f22670j = eVar;
            this.f22666f = new b<>();
            this.f22667g = this;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22666f.c(this.f22670j, this);
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22670j.onError(th);
            unsubscribe();
            this.f22666f.a();
        }

        @Override // rx.f
        public void onNext(T t) {
            int d2 = this.f22666f.d(t);
            rx.t.d dVar = this.f22668h;
            h.a aVar = this.f22669i;
            C0402a c0402a = new C0402a(d2);
            k0 k0Var = k0.this;
            dVar.b(aVar.d(c0402a, k0Var.f22663f, k0Var.f22664g));
        }

        @Override // rx.j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorDebounceWithTime.java */
    /* loaded from: classes3.dex */
    static final class b<T> {
        int a;

        /* renamed from: b, reason: collision with root package name */
        T f22674b;

        /* renamed from: c, reason: collision with root package name */
        boolean f22675c;

        /* renamed from: d, reason: collision with root package name */
        boolean f22676d;

        /* renamed from: e, reason: collision with root package name */
        boolean f22677e;

        b() {
        }

        public synchronized void a() {
            this.a++;
            this.f22674b = null;
            this.f22675c = false;
        }

        public void b(int i2, rx.j<T> jVar, rx.j<?> jVar2) {
            synchronized (this) {
                if (!this.f22677e && this.f22675c && i2 == this.a) {
                    T t = this.f22674b;
                    this.f22674b = null;
                    this.f22675c = false;
                    this.f22677e = true;
                    try {
                        jVar.onNext(t);
                        synchronized (this) {
                            if (!this.f22676d) {
                                this.f22677e = false;
                            } else {
                                jVar.onCompleted();
                            }
                        }
                    } catch (Throwable th) {
                        rx.exceptions.a.g(th, jVar2, t);
                    }
                }
            }
        }

        public void c(rx.j<T> jVar, rx.j<?> jVar2) {
            synchronized (this) {
                if (this.f22677e) {
                    this.f22676d = true;
                    return;
                }
                T t = this.f22674b;
                boolean z = this.f22675c;
                this.f22674b = null;
                this.f22675c = false;
                this.f22677e = true;
                if (z) {
                    try {
                        jVar.onNext(t);
                    } catch (Throwable th) {
                        rx.exceptions.a.g(th, jVar2, t);
                        return;
                    }
                }
                jVar.onCompleted();
            }
        }

        public synchronized int d(T t) {
            int i2;
            this.f22674b = t;
            this.f22675c = true;
            i2 = this.a + 1;
            this.a = i2;
            return i2;
        }
    }

    public k0(long j2, TimeUnit timeUnit, rx.h hVar) {
        this.f22663f = j2;
        this.f22664g = timeUnit;
        this.f22665h = hVar;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        h.a createWorker = this.f22665h.createWorker();
        rx.p.e eVar = new rx.p.e(jVar);
        rx.t.d dVar = new rx.t.d();
        eVar.add(createWorker);
        eVar.add(dVar);
        return new a(jVar, dVar, createWorker, eVar);
    }
}
