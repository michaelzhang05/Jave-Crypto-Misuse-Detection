package I0;

import H0.C1178l;
import I0.h;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final d f3725a;

    /* renamed from: b, reason: collision with root package name */
    private final C1178l f3726b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3727c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3728d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f3729e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicMarkableReference f3730f = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f3731a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference f3732b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3733c;

        public a(boolean z8) {
            int i8;
            this.f3733c = z8;
            if (z8) {
                i8 = 8192;
            } else {
                i8 = 1024;
            }
            this.f3731a = new AtomicMarkableReference(new b(64, i8), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() {
            this.f3732b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable callable = new Callable() { // from class: I0.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c8;
                    c8 = h.a.this.c();
                    return c8;
                }
            };
            if (androidx.compose.animation.core.d.a(this.f3732b, null, callable)) {
                h.this.f3726b.g(callable);
            }
        }

        private void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f3731a.isMarked()) {
                        map = ((b) this.f3731a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f3731a;
                        atomicMarkableReference.set((b) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                h.this.f3725a.k(h.this.f3727c, map, this.f3733c);
            }
        }

        public Map b() {
            return ((b) this.f3731a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((b) this.f3731a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f3731a;
                    atomicMarkableReference.set((b) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public h(String str, M0.f fVar, C1178l c1178l) {
        this.f3727c = str;
        this.f3725a = new d(fVar);
        this.f3726b = c1178l;
    }

    public static h f(String str, M0.f fVar, C1178l c1178l) {
        d dVar = new d(fVar);
        h hVar = new h(str, fVar, c1178l);
        ((b) hVar.f3728d.f3731a.getReference()).e(dVar.g(str, false));
        ((b) hVar.f3729e.f3731a.getReference()).e(dVar.g(str, true));
        hVar.f3730f.set(dVar.h(str), false);
        return hVar;
    }

    public static String g(String str, M0.f fVar) {
        return new d(fVar).h(str);
    }

    public Map d() {
        return this.f3728d.b();
    }

    public Map e() {
        return this.f3729e.b();
    }

    public boolean h(String str, String str2) {
        return this.f3729e.f(str, str2);
    }
}
