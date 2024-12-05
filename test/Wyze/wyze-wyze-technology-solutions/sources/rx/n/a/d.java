package rx.n.a;

import java.util.concurrent.atomic.AtomicInteger;
import rx.b;

/* compiled from: CompletableOnSubscribeConcatArray.java */
/* loaded from: classes3.dex */
public final class d implements b.w {

    /* renamed from: f, reason: collision with root package name */
    final rx.b[] f22528f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompletableOnSubscribeConcatArray.java */
    /* loaded from: classes3.dex */
    public static final class a extends AtomicInteger implements rx.c {

        /* renamed from: f, reason: collision with root package name */
        final rx.c f22529f;

        /* renamed from: g, reason: collision with root package name */
        final rx.b[] f22530g;

        /* renamed from: h, reason: collision with root package name */
        int f22531h;

        /* renamed from: i, reason: collision with root package name */
        final rx.n.d.a f22532i = new rx.n.d.a();

        public a(rx.c cVar, rx.b[] bVarArr) {
            this.f22529f = cVar;
            this.f22530g = bVarArr;
        }

        @Override // rx.c
        public void a(rx.k kVar) {
            this.f22532i.b(kVar);
        }

        void b() {
            if (!this.f22532i.isUnsubscribed() && getAndIncrement() == 0) {
                rx.b[] bVarArr = this.f22530g;
                while (!this.f22532i.isUnsubscribed()) {
                    int i2 = this.f22531h;
                    this.f22531h = i2 + 1;
                    if (i2 == bVarArr.length) {
                        this.f22529f.onCompleted();
                        return;
                    } else {
                        bVarArr[i2].P(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // rx.c
        public void onCompleted() {
            b();
        }

        @Override // rx.c
        public void onError(Throwable th) {
            this.f22529f.onError(th);
        }
    }

    public d(rx.b[] bVarArr) {
        this.f22528f = bVarArr;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.c cVar) {
        a aVar = new a(cVar, this.f22528f);
        cVar.a(aVar.f22532i);
        aVar.b();
    }
}
