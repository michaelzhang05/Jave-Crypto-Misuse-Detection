package I0;

import java.io.File;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final b f3694c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final M0.f f3695a;

    /* renamed from: b, reason: collision with root package name */
    private I0.a f3696b;

    public c(M0.f fVar) {
        this.f3695a = fVar;
        this.f3696b = f3694c;
    }

    private File d(String str) {
        return this.f3695a.o(str, "userlog");
    }

    public void a() {
        this.f3696b.d();
    }

    public byte[] b() {
        return this.f3696b.c();
    }

    public String c() {
        return this.f3696b.b();
    }

    public final void e(String str) {
        this.f3696b.a();
        this.f3696b = f3694c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i8) {
        this.f3696b = new f(file, i8);
    }

    public void g(long j8, String str) {
        this.f3696b.e(j8, str);
    }

    public c(M0.f fVar, String str) {
        this(fVar);
        e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements I0.a {
        private b() {
        }

        @Override // I0.a
        public String b() {
            return null;
        }

        @Override // I0.a
        public byte[] c() {
            return null;
        }

        @Override // I0.a
        public void a() {
        }

        @Override // I0.a
        public void d() {
        }

        @Override // I0.a
        public void e(long j8, String str) {
        }
    }
}
