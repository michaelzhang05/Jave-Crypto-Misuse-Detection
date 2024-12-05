package h.a.z.b;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: Functions.java */
/* loaded from: classes2.dex */
public final class a {
    static final h.a.y.f<Object, Object> a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f17979b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final h.a.y.a f17980c = new b();

    /* renamed from: d, reason: collision with root package name */
    static final h.a.y.e<Object> f17981d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final h.a.y.e<Throwable> f17982e = new f();

    /* renamed from: f, reason: collision with root package name */
    public static final h.a.y.e<Throwable> f17983f = new m();

    /* renamed from: g, reason: collision with root package name */
    public static final h.a.y.g f17984g = new d();

    /* renamed from: h, reason: collision with root package name */
    static final h.a.y.h<Object> f17985h = new n();

    /* renamed from: i, reason: collision with root package name */
    static final h.a.y.h<Object> f17986i = new g();

    /* renamed from: j, reason: collision with root package name */
    static final Callable<Object> f17987j = new l();

    /* renamed from: k, reason: collision with root package name */
    static final Comparator<Object> f17988k = new k();
    public static final h.a.y.e<k.a.c> l = new j();

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class CallableC0250a<T> implements Callable<List<T>> {

        /* renamed from: f, reason: collision with root package name */
        final int f17989f;

        CallableC0250a(int i2) {
            this.f17989f = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.f17989f);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class b implements h.a.y.a {
        b() {
        }

        @Override // h.a.y.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class c implements h.a.y.e<Object> {
        c() {
        }

        @Override // h.a.y.e
        public void a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class d implements h.a.y.g {
        d() {
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class f implements h.a.y.e<Throwable> {
        f() {
        }

        @Override // h.a.y.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Throwable th) {
            h.a.a0.a.o(th);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class g implements h.a.y.h<Object> {
        g() {
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class h implements h.a.y.f<Object, Object> {
        h() {
        }

        @Override // h.a.y.f
        public Object a(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class i<T, U> implements Callable<U>, h.a.y.f<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final U f17990f;

        i(U u) {
            this.f17990f = u;
        }

        @Override // h.a.y.f
        public U a(T t) throws Exception {
            return this.f17990f;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f17990f;
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class j implements h.a.y.e<k.a.c> {
        j() {
        }

        @Override // h.a.y.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(k.a.c cVar) throws Exception {
            cVar.request(Long.MAX_VALUE);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class k implements Comparator<Object> {
        k() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class l implements Callable<Object> {
        l() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class m implements h.a.y.e<Throwable> {
        m() {
        }

        @Override // h.a.y.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Throwable th) {
            h.a.a0.a.o(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static final class n implements h.a.y.h<Object> {
        n() {
        }
    }

    public static <T> Callable<List<T>> a(int i2) {
        return new CallableC0250a(i2);
    }

    public static <T> h.a.y.e<T> b() {
        return (h.a.y.e<T>) f17981d;
    }

    public static <T> Callable<T> c(T t) {
        return new i(t);
    }
}
