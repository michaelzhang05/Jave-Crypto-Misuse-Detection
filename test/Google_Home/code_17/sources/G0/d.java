package G0;

import L0.F;
import L0.G;
import b1.InterfaceC1955a;
import b1.InterfaceC1956b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d implements G0.a {

    /* renamed from: c, reason: collision with root package name */
    private static final i f2896c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1955a f2897a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f2898b = new AtomicReference(null);

    /* loaded from: classes3.dex */
    private static final class b implements i {
        private b() {
        }

        @Override // G0.i
        public File a() {
            return null;
        }

        @Override // G0.i
        public File b() {
            return null;
        }

        @Override // G0.i
        public File c() {
            return null;
        }

        @Override // G0.i
        public F.a d() {
            return null;
        }

        @Override // G0.i
        public File e() {
            return null;
        }

        @Override // G0.i
        public File f() {
            return null;
        }

        @Override // G0.i
        public File g() {
            return null;
        }
    }

    public d(InterfaceC1955a interfaceC1955a) {
        this.f2897a = interfaceC1955a;
        interfaceC1955a.a(new InterfaceC1955a.InterfaceC0356a() { // from class: G0.b
            @Override // b1.InterfaceC1955a.InterfaceC0356a
            public final void a(InterfaceC1956b interfaceC1956b) {
                d.this.g(interfaceC1956b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(InterfaceC1956b interfaceC1956b) {
        h.f().b("Crashlytics native component now available.");
        this.f2898b.set((G0.a) interfaceC1956b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j8, G g8, InterfaceC1956b interfaceC1956b) {
        ((G0.a) interfaceC1956b.get()).d(str, str2, j8, g8);
    }

    @Override // G0.a
    public i a(String str) {
        G0.a aVar = (G0.a) this.f2898b.get();
        if (aVar == null) {
            return f2896c;
        }
        return aVar.a(str);
    }

    @Override // G0.a
    public boolean b() {
        G0.a aVar = (G0.a) this.f2898b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    @Override // G0.a
    public boolean c(String str) {
        G0.a aVar = (G0.a) this.f2898b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    @Override // G0.a
    public void d(final String str, final String str2, final long j8, final G g8) {
        h.f().i("Deferring native open session: " + str);
        this.f2897a.a(new InterfaceC1955a.InterfaceC0356a() { // from class: G0.c
            @Override // b1.InterfaceC1955a.InterfaceC0356a
            public final void a(InterfaceC1956b interfaceC1956b) {
                d.h(str, str2, j8, g8, interfaceC1956b);
            }
        });
    }
}
