package androidx.room;

import androidx.room.g;
import h.a.s;
import h.a.t;
import h.a.v;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: RxRoom.java */
/* loaded from: classes.dex */
public class n {
    public static final Object a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxRoom.java */
    /* loaded from: classes.dex */
    public static class a implements h.a.o<Object> {
        final /* synthetic */ String[] a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f1685b;

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0033a extends g.c {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h.a.n f1686b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0033a(String[] strArr, h.a.n nVar) {
                super(strArr);
                this.f1686b = nVar;
            }

            @Override // androidx.room.g.c
            public void b(Set<String> set) {
                this.f1686b.onNext(n.a);
            }
        }

        /* compiled from: RxRoom.java */
        /* loaded from: classes.dex */
        class b implements h.a.y.a {
            final /* synthetic */ g.c a;

            b(g.c cVar) {
                this.a = cVar;
            }

            @Override // h.a.y.a
            public void run() throws Exception {
                a.this.f1685b.getInvalidationTracker().g(this.a);
            }
        }

        a(String[] strArr, j jVar) {
            this.a = strArr;
            this.f1685b = jVar;
        }

        @Override // h.a.o
        public void a(h.a.n<Object> nVar) throws Exception {
            C0033a c0033a = new C0033a(this.a, nVar);
            this.f1685b.getInvalidationTracker().a(c0033a);
            nVar.a(h.a.x.d.c(new b(c0033a)));
            nVar.onNext(n.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxRoom.java */
    /* loaded from: classes.dex */
    static class b<T> implements h.a.y.f<Object, h.a.l<T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h.a.j f1689f;

        b(h.a.j jVar) {
            this.f1689f = jVar;
        }

        @Override // h.a.y.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h.a.l<T> a(Object obj) throws Exception {
            return this.f1689f;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxRoom.java */
    /* loaded from: classes.dex */
    static class c<T> implements v<T> {
        final /* synthetic */ Callable a;

        c(Callable callable) {
            this.a = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.a.v
        public void a(t<T> tVar) throws Exception {
            try {
                tVar.onSuccess(this.a.call());
            } catch (EmptyResultSetException e2) {
                tVar.c(e2);
            }
        }
    }

    public static <T> h.a.m<T> a(j jVar, boolean z, String[] strArr, Callable<T> callable) {
        h.a.r a2 = h.a.b0.a.a(d(jVar, z));
        return (h.a.m<T>) b(jVar, strArr).y(a2).C(a2).u(a2).q(new b(h.a.j.c(callable)));
    }

    public static h.a.m<Object> b(j jVar, String... strArr) {
        return h.a.m.c(new a(strArr, jVar));
    }

    public static <T> s<T> c(Callable<T> callable) {
        return s.c(new c(callable));
    }

    private static Executor d(j jVar, boolean z) {
        if (z) {
            return jVar.getTransactionExecutor();
        }
        return jVar.getQueryExecutor();
    }
}
