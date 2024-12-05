package androidx.loader.app;

import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: a, reason: collision with root package name */
    private final m f3138a;

    /* renamed from: b, reason: collision with root package name */
    private final a f3139b;

    /* loaded from: classes.dex */
    static class a extends e0 {

        /* renamed from: f, reason: collision with root package name */
        private static final f0.b f3140f = new C0054a();

        /* renamed from: d, reason: collision with root package name */
        private h f3141d = new h();

        /* renamed from: e, reason: collision with root package name */
        private boolean f3142e = false;

        /* renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0054a implements f0.b {
            C0054a() {
            }

            @Override // androidx.lifecycle.f0.b
            public e0 a(Class cls) {
                return new a();
            }

            @Override // androidx.lifecycle.f0.b
            public /* synthetic */ e0 b(Class cls, f0.a aVar) {
                return g0.b(this, cls, aVar);
            }
        }

        a() {
        }

        static a g(i0 i0Var) {
            return (a) new f0(i0Var, f3140f).a(a.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.e0
        public void d() {
            super.d();
            if (this.f3141d.k() <= 0) {
                this.f3141d.b();
            } else {
                androidx.appcompat.app.f0.a(this.f3141d.l(0));
                throw null;
            }
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3141d.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f3141d.k() <= 0) {
                    return;
                }
                androidx.appcompat.app.f0.a(this.f3141d.l(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f3141d.i(0));
                printWriter.print(": ");
                throw null;
            }
        }

        void h() {
            if (this.f3141d.k() <= 0) {
                return;
            }
            androidx.appcompat.app.f0.a(this.f3141d.l(0));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(m mVar, i0 i0Var) {
        this.f3138a = mVar;
        this.f3139b = a.g(i0Var);
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3139b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f3139b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f3138a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
