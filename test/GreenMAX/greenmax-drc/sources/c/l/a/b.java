package c.l.a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import c.e.h;
import c.l.a.a;
import c.l.b.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public class b extends c.l.a.a {
    static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private final j f2781b;

    /* renamed from: c, reason: collision with root package name */
    private final c f2782c;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends p<D> implements b.InterfaceC0069b<D> {

        /* renamed from: k, reason: collision with root package name */
        private final int f2783k;
        private final Bundle l;
        private final c.l.b.b<D> m;
        private j n;
        private C0067b<D> o;
        private c.l.b.b<D> p;

        a(int i2, Bundle bundle, c.l.b.b<D> bVar, c.l.b.b<D> bVar2) {
            this.f2783k = i2;
            this.l = bundle;
            this.m = bVar;
            this.p = bVar2;
            bVar.r(i2, this);
        }

        @Override // c.l.b.b.InterfaceC0069b
        public void a(c.l.b.b<D> bVar, D d2) {
            if (b.a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                l(d2);
                return;
            }
            if (b.a) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            j(d2);
        }

        @Override // androidx.lifecycle.LiveData
        protected void h() {
            if (b.a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.m.u();
        }

        @Override // androidx.lifecycle.LiveData
        protected void i() {
            if (b.a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.m.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void k(q<? super D> qVar) {
            super.k(qVar);
            this.n = null;
            this.o = null;
        }

        @Override // androidx.lifecycle.p, androidx.lifecycle.LiveData
        public void l(D d2) {
            super.l(d2);
            c.l.b.b<D> bVar = this.p;
            if (bVar != null) {
                bVar.s();
                this.p = null;
            }
        }

        c.l.b.b<D> m(boolean z) {
            if (b.a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.m.c();
            this.m.b();
            C0067b<D> c0067b = this.o;
            if (c0067b != null) {
                k(c0067b);
                if (z) {
                    c0067b.d();
                }
            }
            this.m.w(this);
            if ((c0067b != null && !c0067b.c()) || z) {
                this.m.s();
                return this.p;
            }
            return this.m;
        }

        public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2783k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            this.m.h(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.o);
                this.o.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(o().e(e()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(f());
        }

        c.l.b.b<D> o() {
            return this.m;
        }

        void p() {
            j jVar = this.n;
            C0067b<D> c0067b = this.o;
            if (jVar == null || c0067b == null) {
                return;
            }
            super.k(c0067b);
            g(jVar, c0067b);
        }

        c.l.b.b<D> q(j jVar, a.InterfaceC0066a<D> interfaceC0066a) {
            C0067b<D> c0067b = new C0067b<>(this.m, interfaceC0066a);
            g(jVar, c0067b);
            C0067b<D> c0067b2 = this.o;
            if (c0067b2 != null) {
                k(c0067b2);
            }
            this.n = jVar;
            this.o = c0067b;
            return this.m;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2783k);
            sb.append(" : ");
            c.h.j.b.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: c.l.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0067b<D> implements q<D> {
        private final c.l.b.b<D> a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0066a<D> f2784b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2785c = false;

        C0067b(c.l.b.b<D> bVar, a.InterfaceC0066a<D> interfaceC0066a) {
            this.a = bVar;
            this.f2784b = interfaceC0066a;
        }

        @Override // androidx.lifecycle.q
        public void a(D d2) {
            if (b.a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.e(d2));
            }
            this.f2784b.a(this.a, d2);
            this.f2785c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f2785c);
        }

        boolean c() {
            return this.f2785c;
        }

        void d() {
            if (this.f2785c) {
                if (b.a) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.f2784b.c(this.a);
            }
        }

        public String toString() {
            return this.f2784b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class c extends u {

        /* renamed from: c, reason: collision with root package name */
        private static final v.a f2786c = new a();

        /* renamed from: d, reason: collision with root package name */
        private h<a> f2787d = new h<>();

        /* renamed from: e, reason: collision with root package name */
        private boolean f2788e = false;

        /* compiled from: LoaderManagerImpl.java */
        /* loaded from: classes.dex */
        static class a implements v.a {
            a() {
            }

            @Override // androidx.lifecycle.v.a
            public <T extends u> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c f(w wVar) {
            return (c) new v(wVar, f2786c).a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.u
        public void c() {
            super.c();
            int n = this.f2787d.n();
            for (int i2 = 0; i2 < n; i2++) {
                this.f2787d.o(i2).m(true);
            }
            this.f2787d.c();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2787d.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f2787d.n(); i2++) {
                    a o = this.f2787d.o(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2787d.k(i2));
                    printWriter.print(": ");
                    printWriter.println(o.toString());
                    o.n(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void e() {
            this.f2788e = false;
        }

        <D> a<D> g(int i2) {
            return this.f2787d.g(i2);
        }

        boolean h() {
            return this.f2788e;
        }

        void i() {
            int n = this.f2787d.n();
            for (int i2 = 0; i2 < n; i2++) {
                this.f2787d.o(i2).p();
            }
        }

        void j(int i2, a aVar) {
            this.f2787d.l(i2, aVar);
        }

        void k() {
            this.f2788e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(j jVar, w wVar) {
        this.f2781b = jVar;
        this.f2782c = c.f(wVar);
    }

    private <D> c.l.b.b<D> e(int i2, Bundle bundle, a.InterfaceC0066a<D> interfaceC0066a, c.l.b.b<D> bVar) {
        try {
            this.f2782c.k();
            c.l.b.b<D> b2 = interfaceC0066a.b(i2, bundle);
            if (b2 != null) {
                if (b2.getClass().isMemberClass() && !Modifier.isStatic(b2.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b2);
                }
                a aVar = new a(i2, bundle, b2, bVar);
                if (a) {
                    Log.v("LoaderManager", "  Created new loader " + aVar);
                }
                this.f2782c.j(i2, aVar);
                this.f2782c.e();
                return aVar.q(this.f2781b, interfaceC0066a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f2782c.e();
            throw th;
        }
    }

    @Override // c.l.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2782c.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // c.l.a.a
    public <D> c.l.b.b<D> c(int i2, Bundle bundle, a.InterfaceC0066a<D> interfaceC0066a) {
        if (!this.f2782c.h()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> g2 = this.f2782c.g(i2);
                if (a) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (g2 == null) {
                    return e(i2, bundle, interfaceC0066a, null);
                }
                if (a) {
                    Log.v("LoaderManager", "  Re-using existing loader " + g2);
                }
                return g2.q(this.f2781b, interfaceC0066a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // c.l.a.a
    public void d() {
        this.f2782c.i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.h.j.b.a(this.f2781b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
