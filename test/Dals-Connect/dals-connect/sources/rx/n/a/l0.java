package rx.n.a;

import java.util.concurrent.TimeUnit;
import rx.e;
import rx.h;

/* compiled from: OperatorDelay.java */
/* loaded from: classes3.dex */
public final class l0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    final long f22683f;

    /* renamed from: g, reason: collision with root package name */
    final TimeUnit f22684g;

    /* renamed from: h, reason: collision with root package name */
    final rx.h f22685h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorDelay.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        boolean f22686f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.a f22687g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.j f22688h;

        /* compiled from: OperatorDelay.java */
        /* renamed from: rx.n.a.l0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0403a implements rx.m.a {
            C0403a() {
            }

            @Override // rx.m.a
            public void call() {
                a aVar = a.this;
                if (aVar.f22686f) {
                    return;
                }
                aVar.f22686f = true;
                aVar.f22688h.onCompleted();
            }
        }

        /* compiled from: OperatorDelay.java */
        /* loaded from: classes3.dex */
        class b implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Throwable f22691f;

            b(Throwable th) {
                this.f22691f = th;
            }

            @Override // rx.m.a
            public void call() {
                a aVar = a.this;
                if (aVar.f22686f) {
                    return;
                }
                aVar.f22686f = true;
                aVar.f22688h.onError(this.f22691f);
                a.this.f22687g.unsubscribe();
            }
        }

        /* compiled from: OperatorDelay.java */
        /* loaded from: classes3.dex */
        class c implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f22693f;

            c(Object obj) {
                this.f22693f = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.m.a
            public void call() {
                a aVar = a.this;
                if (aVar.f22686f) {
                    return;
                }
                aVar.f22688h.onNext(this.f22693f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rx.j jVar, h.a aVar, rx.j jVar2) {
            super(jVar);
            this.f22687g = aVar;
            this.f22688h = jVar2;
        }

        @Override // rx.f
        public void onCompleted() {
            h.a aVar = this.f22687g;
            C0403a c0403a = new C0403a();
            l0 l0Var = l0.this;
            aVar.d(c0403a, l0Var.f22683f, l0Var.f22684g);
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22687g.c(new b(th));
        }

        @Override // rx.f
        public void onNext(T t) {
            h.a aVar = this.f22687g;
            c cVar = new c(t);
            l0 l0Var = l0.this;
            aVar.d(cVar, l0Var.f22683f, l0Var.f22684g);
        }
    }

    public l0(long j2, TimeUnit timeUnit, rx.h hVar) {
        this.f22683f = j2;
        this.f22684g = timeUnit;
        this.f22685h = hVar;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        h.a createWorker = this.f22685h.createWorker();
        jVar.add(createWorker);
        return new a(jVar, createWorker, jVar);
    }
}
