package e.g.a.a;

import rx.m.d;
import rx.m.e;

/* compiled from: Functions.java */
/* loaded from: classes2.dex */
public final class a {
    private static final C0224a<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    public static final d<Boolean> f17658b;

    /* renamed from: c, reason: collision with root package name */
    public static final e<Object, Boolean> f17659c;

    /* compiled from: Functions.java */
    /* renamed from: e.g.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0224a<T> implements e<Object, T>, d<T> {

        /* renamed from: f, reason: collision with root package name */
        private final T f17660f;

        C0224a(T t) {
            this.f17660f = t;
        }

        @Override // rx.m.e
        public T call(Object obj) {
            return this.f17660f;
        }

        @Override // rx.m.d, java.util.concurrent.Callable
        public T call() {
            return this.f17660f;
        }
    }

    static {
        C0224a<Boolean> c0224a = new C0224a<>(Boolean.TRUE);
        a = c0224a;
        f17658b = c0224a;
        f17659c = c0224a;
    }
}
