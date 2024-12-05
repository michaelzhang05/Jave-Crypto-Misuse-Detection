package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    final Object f1229b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private c.b.a.b.b<q<? super T>, LiveData<T>.b> f1230c = new c.b.a.b.b<>();

    /* renamed from: d, reason: collision with root package name */
    int f1231d = 0;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f1232e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f1233f;

    /* renamed from: g, reason: collision with root package name */
    private int f1234g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1235h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1236i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f1237j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.b implements h {

        /* renamed from: e, reason: collision with root package name */
        final j f1238e;

        LifecycleBoundObserver(j jVar, q<? super T> qVar) {
            super(qVar);
            this.f1238e = jVar;
        }

        @Override // androidx.lifecycle.h
        public void a(j jVar, f.a aVar) {
            if (this.f1238e.getLifecycle().b() == f.b.DESTROYED) {
                LiveData.this.k(this.a);
            } else {
                b(e());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void c() {
            this.f1238e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean d(j jVar) {
            return this.f1238e == jVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean e() {
            return this.f1238e.getLifecycle().b().d(f.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1229b) {
                obj = LiveData.this.f1233f;
                LiveData.this.f1233f = LiveData.a;
            }
            LiveData.this.l(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b {
        final q<? super T> a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1241b;

        /* renamed from: c, reason: collision with root package name */
        int f1242c = -1;

        b(q<? super T> qVar) {
            this.a = qVar;
        }

        void b(boolean z) {
            if (z == this.f1241b) {
                return;
            }
            this.f1241b = z;
            LiveData liveData = LiveData.this;
            int i2 = liveData.f1231d;
            boolean z2 = i2 == 0;
            liveData.f1231d = i2 + (z ? 1 : -1);
            if (z2 && z) {
                liveData.h();
            }
            LiveData liveData2 = LiveData.this;
            if (liveData2.f1231d == 0 && !this.f1241b) {
                liveData2.i();
            }
            if (this.f1241b) {
                LiveData.this.d(this);
            }
        }

        void c() {
        }

        boolean d(j jVar) {
            return false;
        }

        abstract boolean e();
    }

    public LiveData() {
        Object obj = a;
        this.f1233f = obj;
        this.f1237j = new a();
        this.f1232e = obj;
        this.f1234g = -1;
    }

    static void b(String str) {
        if (c.b.a.a.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(LiveData<T>.b bVar) {
        if (bVar.f1241b) {
            if (!bVar.e()) {
                bVar.b(false);
                return;
            }
            int i2 = bVar.f1242c;
            int i3 = this.f1234g;
            if (i2 >= i3) {
                return;
            }
            bVar.f1242c = i3;
            bVar.a.a((Object) this.f1232e);
        }
    }

    void d(LiveData<T>.b bVar) {
        if (this.f1235h) {
            this.f1236i = true;
            return;
        }
        this.f1235h = true;
        do {
            this.f1236i = false;
            if (bVar != null) {
                c(bVar);
                bVar = null;
            } else {
                c.b.a.b.b<q<? super T>, LiveData<T>.b>.d o = this.f1230c.o();
                while (o.hasNext()) {
                    c((b) o.next().getValue());
                    if (this.f1236i) {
                        break;
                    }
                }
            }
        } while (this.f1236i);
        this.f1235h = false;
    }

    public T e() {
        T t = (T) this.f1232e;
        if (t != a) {
            return t;
        }
        return null;
    }

    public boolean f() {
        return this.f1231d > 0;
    }

    public void g(j jVar, q<? super T> qVar) {
        b("observe");
        if (jVar.getLifecycle().b() == f.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(jVar, qVar);
        LiveData<T>.b z = this.f1230c.z(qVar, lifecycleBoundObserver);
        if (z != null && !z.d(jVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (z != null) {
            return;
        }
        jVar.getLifecycle().a(lifecycleBoundObserver);
    }

    protected void h() {
    }

    protected void i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(T t) {
        boolean z;
        synchronized (this.f1229b) {
            z = this.f1233f == a;
            this.f1233f = t;
        }
        if (z) {
            c.b.a.a.a.e().c(this.f1237j);
        }
    }

    public void k(q<? super T> qVar) {
        b("removeObserver");
        LiveData<T>.b D = this.f1230c.D(qVar);
        if (D == null) {
            return;
        }
        D.c();
        D.b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(T t) {
        b("setValue");
        this.f1234g++;
        this.f1232e = t;
        d(null);
    }
}
