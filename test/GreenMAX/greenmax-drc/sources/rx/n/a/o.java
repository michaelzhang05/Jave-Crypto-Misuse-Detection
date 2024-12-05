package rx.n.a;

import rx.e;
import rx.exceptions.OnErrorThrowable;

/* compiled from: OnSubscribeFilter.java */
/* loaded from: classes3.dex */
public final class o<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<T> f22724f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, Boolean> f22725g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFilter.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22726f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<? super T, Boolean> f22727g;

        /* renamed from: h, reason: collision with root package name */
        boolean f22728h;

        public a(rx.j<? super T> jVar, rx.m.e<? super T, Boolean> eVar) {
            this.f22726f = jVar;
            this.f22727g = eVar;
            request(0L);
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22728h) {
                return;
            }
            this.f22726f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22728h) {
                rx.q.c.j(th);
            } else {
                this.f22728h = true;
                this.f22726f.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            try {
                if (this.f22727g.call(t).booleanValue()) {
                    this.f22726f.onNext(t);
                } else {
                    request(1L);
                }
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            super.setProducer(gVar);
            this.f22726f.setProducer(gVar);
        }
    }

    public o(rx.e<T> eVar, rx.m.e<? super T, Boolean> eVar2) {
        this.f22724f = eVar;
        this.f22725g = eVar2;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        a aVar = new a(jVar, this.f22725g);
        jVar.add(aVar);
        this.f22724f.c1(aVar);
    }
}
