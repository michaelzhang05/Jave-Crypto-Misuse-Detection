package h.a.z.e.d;

import java.util.Iterator;

/* compiled from: ObservableFromIterable.java */
/* loaded from: classes2.dex */
public final class k<T> extends h.a.m<T> {

    /* renamed from: f, reason: collision with root package name */
    final Iterable<? extends T> f18091f;

    /* compiled from: ObservableFromIterable.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends h.a.z.d.b<T> {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18092f;

        /* renamed from: g, reason: collision with root package name */
        final Iterator<? extends T> f18093g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f18094h;

        /* renamed from: i, reason: collision with root package name */
        boolean f18095i;

        /* renamed from: j, reason: collision with root package name */
        boolean f18096j;

        /* renamed from: k, reason: collision with root package name */
        boolean f18097k;

        a(h.a.q<? super T> qVar, Iterator<? extends T> it) {
            this.f18092f = qVar;
            this.f18093g = it;
        }

        void a() {
            while (!f()) {
                try {
                    this.f18092f.onNext(h.a.z.b.b.c(this.f18093g.next(), "The iterator returned a null value"));
                    if (f()) {
                        return;
                    }
                    try {
                        if (!this.f18093g.hasNext()) {
                            if (f()) {
                                return;
                            }
                            this.f18092f.a();
                            return;
                        }
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.a(th);
                        this.f18092f.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.a(th2);
                    this.f18092f.onError(th2);
                    return;
                }
            }
        }

        @Override // h.a.z.c.f
        public void clear() {
            this.f18096j = true;
        }

        @Override // h.a.x.c
        public void d() {
            this.f18094h = true;
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18094h;
        }

        @Override // h.a.z.c.c
        public int i(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f18095i = true;
            return 1;
        }

        @Override // h.a.z.c.f
        public boolean isEmpty() {
            return this.f18096j;
        }

        @Override // h.a.z.c.f
        public T poll() {
            if (this.f18096j) {
                return null;
            }
            if (this.f18097k) {
                if (!this.f18093g.hasNext()) {
                    this.f18096j = true;
                    return null;
                }
            } else {
                this.f18097k = true;
            }
            return (T) h.a.z.b.b.c(this.f18093g.next(), "The iterator returned a null value");
        }
    }

    public k(Iterable<? extends T> iterable) {
        this.f18091f = iterable;
    }

    @Override // h.a.m
    public void x(h.a.q<? super T> qVar) {
        try {
            Iterator<? extends T> it = this.f18091f.iterator();
            try {
                if (!it.hasNext()) {
                    h.a.z.a.d.o(qVar);
                    return;
                }
                a aVar = new a(qVar, it);
                qVar.b(aVar);
                if (aVar.f18095i) {
                    return;
                }
                aVar.a();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                h.a.z.a.d.r(th, qVar);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.a(th2);
            h.a.z.a.d.r(th2, qVar);
        }
    }
}
