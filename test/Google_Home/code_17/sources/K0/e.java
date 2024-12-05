package K0;

import java.io.File;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final b f4997c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final O0.g f4998a;

    /* renamed from: b, reason: collision with root package name */
    private c f4999b;

    public e(O0.g gVar) {
        this.f4998a = gVar;
        this.f4999b = f4997c;
    }

    private File d(String str) {
        return this.f4998a.q(str, "userlog");
    }

    public void a() {
        this.f4999b.d();
    }

    public byte[] b() {
        return this.f4999b.c();
    }

    public String c() {
        return this.f4999b.b();
    }

    public final void e(String str) {
        this.f4999b.a();
        this.f4999b = f4997c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i8) {
        this.f4999b = new h(file, i8);
    }

    public void g(long j8, String str) {
        this.f4999b.e(j8, str);
    }

    public e(O0.g gVar, String str) {
        this(gVar);
        e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements c {
        private b() {
        }

        @Override // K0.c
        public String b() {
            return null;
        }

        @Override // K0.c
        public byte[] c() {
            return null;
        }

        @Override // K0.c
        public void a() {
        }

        @Override // K0.c
        public void d() {
        }

        @Override // K0.c
        public void e(long j8, String str) {
        }
    }
}
