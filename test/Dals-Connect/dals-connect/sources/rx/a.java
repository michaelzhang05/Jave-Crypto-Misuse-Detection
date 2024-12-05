package rx;

import rx.exceptions.MissingBackpressureException;

/* compiled from: BackpressureOverflow.java */
/* loaded from: classes2.dex */
public final class a {
    public static final d a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f22365b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f22366c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f22367d;

    /* compiled from: BackpressureOverflow.java */
    /* renamed from: rx.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0388a implements d {
        static final C0388a a = new C0388a();

        private C0388a() {
        }

        @Override // rx.a.d
        public boolean a() {
            return false;
        }
    }

    /* compiled from: BackpressureOverflow.java */
    /* loaded from: classes2.dex */
    static final class b implements d {
        static final b a = new b();

        private b() {
        }

        @Override // rx.a.d
        public boolean a() {
            return true;
        }
    }

    /* compiled from: BackpressureOverflow.java */
    /* loaded from: classes2.dex */
    static final class c implements d {
        static final c a = new c();

        private c() {
        }

        @Override // rx.a.d
        public boolean a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* compiled from: BackpressureOverflow.java */
    /* loaded from: classes2.dex */
    public interface d {
        boolean a() throws MissingBackpressureException;
    }

    static {
        c cVar = c.a;
        a = cVar;
        f22365b = cVar;
        f22366c = b.a;
        f22367d = C0388a.a;
    }
}
