package K0;

import J0.C1280o;
import K0.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final f f5032a;

    /* renamed from: b, reason: collision with root package name */
    private final C1280o f5033b;

    /* renamed from: c, reason: collision with root package name */
    private String f5034c;

    /* renamed from: d, reason: collision with root package name */
    private final a f5035d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f5036e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final j f5037f = new j(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f5038g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f5039a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference f5040b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5041c;

        public a(boolean z8) {
            int i8;
            this.f5041c = z8;
            if (z8) {
                i8 = 8192;
            } else {
                i8 = 1024;
            }
            this.f5039a = new AtomicMarkableReference(new d(64, i8), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() {
            this.f5040b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable callable = new Callable() { // from class: K0.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c8;
                    c8 = l.a.this.c();
                    return c8;
                }
            };
            if (androidx.compose.animation.core.d.a(this.f5040b, null, callable)) {
                l.this.f5033b.g(callable);
            }
        }

        private void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f5039a.isMarked()) {
                        map = ((d) this.f5039a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f5039a;
                        atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                l.this.f5032a.q(l.this.f5034c, map, this.f5041c);
            }
        }

        public Map b() {
            return ((d) this.f5039a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((d) this.f5039a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f5039a;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public l(String str, O0.g gVar, C1280o c1280o) {
        this.f5034c = str;
        this.f5032a = new f(gVar);
        this.f5033b = c1280o;
    }

    public static l h(String str, O0.g gVar, C1280o c1280o) {
        f fVar = new f(gVar);
        l lVar = new l(str, gVar, c1280o);
        ((d) lVar.f5035d.f5039a.getReference()).e(fVar.i(str, false));
        ((d) lVar.f5036e.f5039a.getReference()).e(fVar.i(str, true));
        lVar.f5038g.set(fVar.k(str), false);
        lVar.f5037f.c(fVar.j(str));
        return lVar;
    }

    public static String i(String str, O0.g gVar) {
        return new f(gVar).k(str);
    }

    public Map d() {
        return this.f5035d.b();
    }

    public Map e() {
        return this.f5036e.b();
    }

    public List f() {
        return this.f5037f.a();
    }

    public String g() {
        return (String) this.f5038g.getReference();
    }

    public boolean j(String str, String str2) {
        return this.f5036e.f(str, str2);
    }

    public void k(String str) {
        synchronized (this.f5034c) {
            try {
                this.f5034c = str;
                Map b8 = this.f5035d.b();
                List b9 = this.f5037f.b();
                if (g() != null) {
                    this.f5032a.s(str, g());
                }
                if (!b8.isEmpty()) {
                    this.f5032a.p(str, b8);
                }
                if (!b9.isEmpty()) {
                    this.f5032a.r(str, b9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
