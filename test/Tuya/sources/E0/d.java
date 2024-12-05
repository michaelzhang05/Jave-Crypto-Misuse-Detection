package E0;

import J0.B;
import J0.D;
import Z0.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d implements E0.a {

    /* renamed from: c, reason: collision with root package name */
    private static final g f1909c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Z0.a f1910a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f1911b = new AtomicReference(null);

    /* loaded from: classes3.dex */
    private static final class b implements g {
        private b() {
        }

        @Override // E0.g
        public File a() {
            return null;
        }

        @Override // E0.g
        public File b() {
            return null;
        }

        @Override // E0.g
        public File c() {
            return null;
        }

        @Override // E0.g
        public B.a d() {
            return null;
        }

        @Override // E0.g
        public File e() {
            return null;
        }

        @Override // E0.g
        public File f() {
            return null;
        }

        @Override // E0.g
        public File g() {
            return null;
        }
    }

    public d(Z0.a aVar) {
        this.f1910a = aVar;
        aVar.a(new a.InterfaceC0257a() { // from class: E0.b
            @Override // Z0.a.InterfaceC0257a
            public final void a(Z0.b bVar) {
                d.this.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Z0.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.f1911b.set((E0.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j8, D d8, Z0.b bVar) {
        ((E0.a) bVar.get()).c(str, str2, j8, d8);
    }

    @Override // E0.a
    public g a(String str) {
        E0.a aVar = (E0.a) this.f1911b.get();
        if (aVar == null) {
            return f1909c;
        }
        return aVar.a(str);
    }

    @Override // E0.a
    public boolean b() {
        E0.a aVar = (E0.a) this.f1911b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    @Override // E0.a
    public void c(final String str, final String str2, final long j8, final D d8) {
        f.f().i("Deferring native open session: " + str);
        this.f1910a.a(new a.InterfaceC0257a() { // from class: E0.c
            @Override // Z0.a.InterfaceC0257a
            public final void a(Z0.b bVar) {
                d.h(str, str2, j8, d8, bVar);
            }
        });
    }

    @Override // E0.a
    public boolean d(String str) {
        E0.a aVar = (E0.a) this.f1911b.get();
        if (aVar != null && aVar.d(str)) {
            return true;
        }
        return false;
    }
}
