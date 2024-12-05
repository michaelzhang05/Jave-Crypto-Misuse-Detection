package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.r.l.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private Object A;
    private Thread B;
    private com.bumptech.glide.load.f C;
    private com.bumptech.glide.load.f D;
    private Object E;
    private com.bumptech.glide.load.a F;
    private com.bumptech.glide.load.m.d<?> G;
    private volatile com.bumptech.glide.load.engine.f H;
    private volatile boolean I;
    private volatile boolean J;

    /* renamed from: i, reason: collision with root package name */
    private final e f8523i;

    /* renamed from: j, reason: collision with root package name */
    private final c.h.j.g<h<?>> f8524j;
    private com.bumptech.glide.e m;
    private com.bumptech.glide.load.f n;
    private com.bumptech.glide.g o;
    private n p;
    private int q;
    private int r;
    private j s;
    private com.bumptech.glide.load.i t;
    private b<R> u;
    private int v;
    private EnumC0113h w;
    private g x;
    private long y;
    private boolean z;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f8520f = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: g, reason: collision with root package name */
    private final List<Throwable> f8521g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.r.l.c f8522h = com.bumptech.glide.r.l.c.a();

    /* renamed from: k, reason: collision with root package name */
    private final d<?> f8525k = new d<>();
    private final f l = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8526b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f8527c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f8527c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8527c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0113h.values().length];
            f8526b = iArr2;
            try {
                iArr2[EnumC0113h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8526b[EnumC0113h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8526b[EnumC0113h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8526b[EnumC0113h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8526b[EnumC0113h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface b<R> {
        void a(GlideException glideException);

        void b(u<R> uVar, com.bumptech.glide.load.a aVar);

        void c(h<?> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public final class c<Z> implements i.a<Z> {
        private final com.bumptech.glide.load.a a;

        c(com.bumptech.glide.load.a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public u<Z> a(u<Z> uVar) {
            return h.this.P(this.a, uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class d<Z> {
        private com.bumptech.glide.load.f a;

        /* renamed from: b, reason: collision with root package name */
        private com.bumptech.glide.load.k<Z> f8529b;

        /* renamed from: c, reason: collision with root package name */
        private t<Z> f8530c;

        d() {
        }

        void a() {
            this.a = null;
            this.f8529b = null;
            this.f8530c = null;
        }

        void b(e eVar, com.bumptech.glide.load.i iVar) {
            com.bumptech.glide.r.l.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.a, new com.bumptech.glide.load.engine.e(this.f8529b, this.f8530c, iVar));
            } finally {
                this.f8530c.g();
                com.bumptech.glide.r.l.b.d();
            }
        }

        boolean c() {
            return this.f8530c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.k<X> kVar, t<X> tVar) {
            this.a = fVar;
            this.f8529b = kVar;
            this.f8530c = tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface e {
        com.bumptech.glide.load.engine.a0.a a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class f {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8531b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8532c;

        f() {
        }

        private boolean a(boolean z) {
            return (this.f8532c || z || this.f8531b) && this.a;
        }

        synchronized boolean b() {
            this.f8531b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f8532c = true;
            return a(false);
        }

        synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        synchronized void e() {
            this.f8531b = false;
            this.a = false;
            this.f8532c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0113h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar, c.h.j.g<h<?>> gVar) {
        this.f8523i = eVar;
        this.f8524j = gVar;
    }

    private <Data> u<R> B(Data data, com.bumptech.glide.load.a aVar) throws GlideException {
        return T(data, aVar, this.f8520f.h(data.getClass()));
    }

    private void C() {
        if (Log.isLoggable("DecodeJob", 2)) {
            J("Retrieved data", this.y, "data: " + this.E + ", cache key: " + this.C + ", fetcher: " + this.G);
        }
        u<R> uVar = null;
        try {
            uVar = x(this.G, this.E, this.F);
        } catch (GlideException e2) {
            e2.i(this.D, this.F);
            this.f8521g.add(e2);
        }
        if (uVar != null) {
            L(uVar, this.F);
        } else {
            S();
        }
    }

    private com.bumptech.glide.load.engine.f D() {
        int i2 = a.f8526b[this.w.ordinal()];
        if (i2 == 1) {
            return new v(this.f8520f, this);
        }
        if (i2 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f8520f, this);
        }
        if (i2 == 3) {
            return new y(this.f8520f, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.w);
    }

    private EnumC0113h E(EnumC0113h enumC0113h) {
        int i2 = a.f8526b[enumC0113h.ordinal()];
        if (i2 == 1) {
            return this.s.a() ? EnumC0113h.DATA_CACHE : E(EnumC0113h.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.z ? EnumC0113h.FINISHED : EnumC0113h.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return EnumC0113h.FINISHED;
        }
        if (i2 == 5) {
            return this.s.b() ? EnumC0113h.RESOURCE_CACHE : E(EnumC0113h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0113h);
    }

    private com.bumptech.glide.load.i F(com.bumptech.glide.load.a aVar) {
        com.bumptech.glide.load.i iVar = this.t;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f8520f.w();
        com.bumptech.glide.load.h<Boolean> hVar = com.bumptech.glide.load.o.c.l.f8779d;
        Boolean bool = (Boolean) iVar.a(hVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        com.bumptech.glide.load.i iVar2 = new com.bumptech.glide.load.i();
        iVar2.b(this.t);
        iVar2.c(hVar, Boolean.valueOf(z));
        return iVar2;
    }

    private int G() {
        return this.o.ordinal();
    }

    private void I(String str, long j2) {
        J(str, j2, null);
    }

    private void J(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(com.bumptech.glide.r.f.a(j2));
        sb.append(", load key: ");
        sb.append(this.p);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void K(u<R> uVar, com.bumptech.glide.load.a aVar) {
        V();
        this.u.b(uVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void L(u<R> uVar, com.bumptech.glide.load.a aVar) {
        if (uVar instanceof q) {
            ((q) uVar).a();
        }
        t tVar = 0;
        if (this.f8525k.c()) {
            uVar = t.b(uVar);
            tVar = uVar;
        }
        K(uVar, aVar);
        this.w = EnumC0113h.ENCODE;
        try {
            if (this.f8525k.c()) {
                this.f8525k.b(this.f8523i, this.t);
            }
            N();
        } finally {
            if (tVar != 0) {
                tVar.g();
            }
        }
    }

    private void M() {
        V();
        this.u.a(new GlideException("Failed to load resource", new ArrayList(this.f8521g)));
        O();
    }

    private void N() {
        if (this.l.b()) {
            R();
        }
    }

    private void O() {
        if (this.l.c()) {
            R();
        }
    }

    private void R() {
        this.l.e();
        this.f8525k.a();
        this.f8520f.a();
        this.I = false;
        this.m = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.p = null;
        this.u = null;
        this.w = null;
        this.H = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.y = 0L;
        this.J = false;
        this.A = null;
        this.f8521g.clear();
        this.f8524j.a(this);
    }

    private void S() {
        this.B = Thread.currentThread();
        this.y = com.bumptech.glide.r.f.b();
        boolean z = false;
        while (!this.J && this.H != null && !(z = this.H.a())) {
            this.w = E(this.w);
            this.H = D();
            if (this.w == EnumC0113h.SOURCE) {
                f();
                return;
            }
        }
        if ((this.w == EnumC0113h.FINISHED || this.J) && !z) {
            M();
        }
    }

    private <Data, ResourceType> u<R> T(Data data, com.bumptech.glide.load.a aVar, s<Data, ResourceType, R> sVar) throws GlideException {
        com.bumptech.glide.load.i F = F(aVar);
        com.bumptech.glide.load.m.e<Data> l = this.m.h().l(data);
        try {
            return sVar.a(l, F, this.q, this.r, new c(aVar));
        } finally {
            l.b();
        }
    }

    private void U() {
        int i2 = a.a[this.x.ordinal()];
        if (i2 == 1) {
            this.w = E(EnumC0113h.INITIALIZE);
            this.H = D();
            S();
        } else if (i2 == 2) {
            S();
        } else {
            if (i2 == 3) {
                C();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.x);
        }
    }

    private void V() {
        Throwable th;
        this.f8522h.c();
        if (this.I) {
            if (this.f8521g.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f8521g;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.I = true;
    }

    private <Data> u<R> x(com.bumptech.glide.load.m.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            long b2 = com.bumptech.glide.r.f.b();
            u<R> B = B(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                I("Decoded result " + B, b2);
            }
            return B;
        } finally {
            dVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<R> H(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.f fVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, com.bumptech.glide.load.l<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.i iVar, b<R> bVar, int i4) {
        this.f8520f.u(eVar, obj, fVar, i2, i3, jVar, cls, cls2, gVar, iVar, map, z, z2, this.f8523i);
        this.m = eVar;
        this.n = fVar;
        this.o = gVar;
        this.p = nVar;
        this.q = i2;
        this.r = i3;
        this.s = jVar;
        this.z = z3;
        this.t = iVar;
        this.u = bVar;
        this.v = i4;
        this.x = g.INITIALIZE;
        this.A = obj;
        return this;
    }

    <Z> u<Z> P(com.bumptech.glide.load.a aVar, u<Z> uVar) {
        u<Z> uVar2;
        com.bumptech.glide.load.l<Z> lVar;
        com.bumptech.glide.load.c cVar;
        com.bumptech.glide.load.f dVar;
        Class<?> cls = uVar.get().getClass();
        com.bumptech.glide.load.k<Z> kVar = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.l<Z> r = this.f8520f.r(cls);
            lVar = r;
            uVar2 = r.transform(this.m, uVar, this.q, this.r);
        } else {
            uVar2 = uVar;
            lVar = null;
        }
        if (!uVar.equals(uVar2)) {
            uVar.c();
        }
        if (this.f8520f.v(uVar2)) {
            kVar = this.f8520f.n(uVar2);
            cVar = kVar.b(this.t);
        } else {
            cVar = com.bumptech.glide.load.c.NONE;
        }
        com.bumptech.glide.load.k kVar2 = kVar;
        if (!this.s.d(!this.f8520f.x(this.C), aVar, cVar)) {
            return uVar2;
        }
        if (kVar2 != null) {
            int i2 = a.f8527c[cVar.ordinal()];
            if (i2 == 1) {
                dVar = new com.bumptech.glide.load.engine.d(this.C, this.n);
            } else if (i2 == 2) {
                dVar = new w(this.f8520f.b(), this.C, this.n, this.q, this.r, lVar, cls, this.t);
            } else {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            t b2 = t.b(uVar2);
            this.f8525k.d(dVar, kVar2, b2);
            return b2;
        }
        throw new Registry.NoResultEncoderAvailableException(uVar2.get().getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(boolean z) {
        if (this.l.d(z)) {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean W() {
        EnumC0113h E = E(EnumC0113h.INITIALIZE);
        return E == EnumC0113h.RESOURCE_CACHE || E == EnumC0113h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d(com.bumptech.glide.load.f fVar, Exception exc, com.bumptech.glide.load.m.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(fVar, aVar, dVar.a());
        this.f8521g.add(glideException);
        if (Thread.currentThread() != this.B) {
            this.x = g.SWITCH_TO_SOURCE_SERVICE;
            this.u.c(this);
        } else {
            S();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void f() {
        this.x = g.SWITCH_TO_SOURCE_SERVICE;
        this.u.c(this);
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void i(com.bumptech.glide.load.f fVar, Object obj, com.bumptech.glide.load.m.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.f fVar2) {
        this.C = fVar;
        this.E = obj;
        this.G = dVar;
        this.F = aVar;
        this.D = fVar2;
        if (Thread.currentThread() != this.B) {
            this.x = g.DECODE_DATA;
            this.u.c(this);
        } else {
            com.bumptech.glide.r.l.b.a("DecodeJob.decodeFromRetrievedData");
            try {
                C();
            } finally {
                com.bumptech.glide.r.l.b.d();
            }
        }
    }

    @Override // com.bumptech.glide.r.l.a.f
    public com.bumptech.glide.r.l.c n() {
        return this.f8522h;
    }

    public void o() {
        this.J = true;
        com.bumptech.glide.load.engine.f fVar = this.H;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int G = G() - hVar.G();
        return G == 0 ? this.v - hVar.v : G;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.r.l.b.b("DecodeJob#run(model=%s)", this.A);
        com.bumptech.glide.load.m.d<?> dVar = this.G;
        try {
            try {
                try {
                    if (this.J) {
                        M();
                        if (dVar != null) {
                            dVar.b();
                        }
                        com.bumptech.glide.r.l.b.d();
                        return;
                    }
                    U();
                    if (dVar != null) {
                        dVar.b();
                    }
                    com.bumptech.glide.r.l.b.d();
                } catch (com.bumptech.glide.load.engine.b e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.J + ", stage: " + this.w, th);
                }
                if (this.w != EnumC0113h.ENCODE) {
                    this.f8521g.add(th);
                    M();
                }
                if (!this.J) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            com.bumptech.glide.r.l.b.d();
            throw th2;
        }
    }
}
