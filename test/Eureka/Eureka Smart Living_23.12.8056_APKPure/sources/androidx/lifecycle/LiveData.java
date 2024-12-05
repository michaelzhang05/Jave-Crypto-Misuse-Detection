package androidx.lifecycle;

import androidx.lifecycle.h;
import i.b;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k, reason: collision with root package name */
    static final Object f3024k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f3025a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private i.b f3026b = new i.b();

    /* renamed from: c, reason: collision with root package name */
    int f3027c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3028d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f3029e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f3030f;

    /* renamed from: g, reason: collision with root package name */
    private int f3031g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3032h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3033i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f3034j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements k {

        /* renamed from: e, reason: collision with root package name */
        final m f3035e;

        LifecycleBoundObserver(m mVar, r rVar) {
            super(rVar);
            this.f3035e = mVar;
        }

        @Override // androidx.lifecycle.k
        public void d(m mVar, h.a aVar) {
            h.b b6 = this.f3035e.r().b();
            if (b6 == h.b.DESTROYED) {
                LiveData.this.j(this.f3039a);
                return;
            }
            h.b bVar = null;
            while (bVar != b6) {
                h(k());
                bVar = b6;
                b6 = this.f3035e.r().b();
            }
        }

        void i() {
            this.f3035e.r().c(this);
        }

        boolean j(m mVar) {
            return this.f3035e == mVar;
        }

        boolean k() {
            return this.f3035e.r().b().b(h.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3025a) {
                obj = LiveData.this.f3030f;
                LiveData.this.f3030f = LiveData.f3024k;
            }
            LiveData.this.k(obj);
        }
    }

    /* loaded from: classes.dex */
    private class b extends c {
        b(r rVar) {
            super(rVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final r f3039a;

        /* renamed from: b, reason: collision with root package name */
        boolean f3040b;

        /* renamed from: c, reason: collision with root package name */
        int f3041c = -1;

        c(r rVar) {
            this.f3039a = rVar;
        }

        void h(boolean z5) {
            if (z5 == this.f3040b) {
                return;
            }
            this.f3040b = z5;
            LiveData.this.b(z5 ? 1 : -1);
            if (this.f3040b) {
                LiveData.this.d(this);
            }
        }

        void i() {
        }

        boolean j(m mVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f3024k;
        this.f3030f = obj;
        this.f3034j = new a();
        this.f3029e = obj;
        this.f3031g = -1;
    }

    static void a(String str) {
        if (h.c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(c cVar) {
        if (cVar.f3040b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i6 = cVar.f3041c;
            int i7 = this.f3031g;
            if (i6 >= i7) {
                return;
            }
            cVar.f3041c = i7;
            cVar.f3039a.a(this.f3029e);
        }
    }

    void b(int i6) {
        int i7 = this.f3027c;
        this.f3027c = i6 + i7;
        if (this.f3028d) {
            return;
        }
        this.f3028d = true;
        while (true) {
            try {
                int i8 = this.f3027c;
                if (i7 == i8) {
                    return;
                }
                boolean z5 = i7 == 0 && i8 > 0;
                boolean z6 = i7 > 0 && i8 == 0;
                if (z5) {
                    g();
                } else if (z6) {
                    h();
                }
                i7 = i8;
            } finally {
                this.f3028d = false;
            }
        }
    }

    void d(c cVar) {
        if (this.f3032h) {
            this.f3033i = true;
            return;
        }
        this.f3032h = true;
        do {
            this.f3033i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                b.d k6 = this.f3026b.k();
                while (k6.hasNext()) {
                    c((c) ((Map.Entry) k6.next()).getValue());
                    if (this.f3033i) {
                        break;
                    }
                }
            }
        } while (this.f3033i);
        this.f3032h = false;
    }

    public void e(m mVar, r rVar) {
        a("observe");
        if (mVar.r().b() == h.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(mVar, rVar);
        c cVar = (c) this.f3026b.n(rVar, lifecycleBoundObserver);
        if (cVar != null && !cVar.j(mVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        mVar.r().a(lifecycleBoundObserver);
    }

    public void f(r rVar) {
        a("observeForever");
        b bVar = new b(rVar);
        c cVar = (c) this.f3026b.n(rVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.h(true);
    }

    protected void g() {
    }

    protected void h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(Object obj) {
        boolean z5;
        synchronized (this.f3025a) {
            z5 = this.f3030f == f3024k;
            this.f3030f = obj;
        }
        if (z5) {
            h.c.f().c(this.f3034j);
        }
    }

    public void j(r rVar) {
        a("removeObserver");
        c cVar = (c) this.f3026b.o(rVar);
        if (cVar == null) {
            return;
        }
        cVar.i();
        cVar.h(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(Object obj) {
        a("setValue");
        this.f3031g++;
        this.f3029e = obj;
        d(null);
    }
}
