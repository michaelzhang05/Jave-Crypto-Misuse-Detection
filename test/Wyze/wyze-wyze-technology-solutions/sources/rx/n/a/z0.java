package rx.n.a;

import rx.e;
import rx.h;

/* compiled from: OperatorSubscribeOn.java */
/* loaded from: classes3.dex */
public final class z0<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.h f22958f;

    /* renamed from: g, reason: collision with root package name */
    final rx.e<T> f22959g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f22960h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSubscribeOn.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22961f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f22962g;

        /* renamed from: h, reason: collision with root package name */
        final h.a f22963h;

        /* renamed from: i, reason: collision with root package name */
        rx.e<T> f22964i;

        /* renamed from: j, reason: collision with root package name */
        Thread f22965j;

        /* compiled from: OperatorSubscribeOn.java */
        /* renamed from: rx.n.a.z0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0410a implements rx.g {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.g f22966f;

            /* compiled from: OperatorSubscribeOn.java */
            /* renamed from: rx.n.a.z0$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            class C0411a implements rx.m.a {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ long f22968f;

                C0411a(long j2) {
                    this.f22968f = j2;
                }

                @Override // rx.m.a
                public void call() {
                    C0410a.this.f22966f.request(this.f22968f);
                }
            }

            C0410a(rx.g gVar) {
                this.f22966f = gVar;
            }

            @Override // rx.g
            public void request(long j2) {
                if (a.this.f22965j != Thread.currentThread()) {
                    a aVar = a.this;
                    if (aVar.f22962g) {
                        aVar.f22963h.c(new C0411a(j2));
                        return;
                    }
                }
                this.f22966f.request(j2);
            }
        }

        a(rx.j<? super T> jVar, boolean z, h.a aVar, rx.e<T> eVar) {
            this.f22961f = jVar;
            this.f22962g = z;
            this.f22963h = aVar;
            this.f22964i = eVar;
        }

        @Override // rx.m.a
        public void call() {
            rx.e<T> eVar = this.f22964i;
            this.f22964i = null;
            this.f22965j = Thread.currentThread();
            eVar.c1(this);
        }

        @Override // rx.f
        public void onCompleted() {
            try {
                this.f22961f.onCompleted();
            } finally {
                this.f22963h.unsubscribe();
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            try {
                this.f22961f.onError(th);
            } finally {
                this.f22963h.unsubscribe();
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22961f.onNext(t);
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22961f.setProducer(new C0410a(gVar));
        }
    }

    public z0(rx.e<T> eVar, rx.h hVar, boolean z) {
        this.f22958f = hVar;
        this.f22959g = eVar;
        this.f22960h = z;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        h.a createWorker = this.f22958f.createWorker();
        a aVar = new a(jVar, this.f22960h, createWorker, this.f22959g);
        jVar.add(aVar);
        jVar.add(createWorker);
        createWorker.c(aVar);
    }
}
