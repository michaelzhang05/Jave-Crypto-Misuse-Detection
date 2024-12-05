package c.l.b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class b<D> {
    int a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0069b<D> f2791b;

    /* renamed from: c, reason: collision with root package name */
    a<D> f2792c;

    /* renamed from: d, reason: collision with root package name */
    Context f2793d;

    /* renamed from: e, reason: collision with root package name */
    boolean f2794e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f2795f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f2796g = true;

    /* renamed from: h, reason: collision with root package name */
    boolean f2797h = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f2798i = false;

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface a<D> {
        void a(b<D> bVar);
    }

    /* compiled from: Loader.java */
    /* renamed from: c.l.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0069b<D> {
        void a(b<D> bVar, D d2);
    }

    public b(Context context) {
        this.f2793d = context.getApplicationContext();
    }

    public void b() {
        this.f2795f = true;
        k();
    }

    public boolean c() {
        return l();
    }

    public void d() {
        this.f2798i = false;
    }

    public String e(D d2) {
        StringBuilder sb = new StringBuilder(64);
        c.h.j.b.a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    public void f() {
        a<D> aVar = this.f2792c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void g(D d2) {
        InterfaceC0069b<D> interfaceC0069b = this.f2791b;
        if (interfaceC0069b != null) {
            interfaceC0069b.a(this, d2);
        }
    }

    @Deprecated
    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.f2791b);
        if (this.f2794e || this.f2797h || this.f2798i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f2794e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f2797h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f2798i);
        }
        if (this.f2795f || this.f2796g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f2795f);
            printWriter.print(" mReset=");
            printWriter.println(this.f2796g);
        }
    }

    public void i() {
        n();
    }

    public boolean j() {
        return this.f2795f;
    }

    protected void k() {
    }

    protected boolean l() {
        throw null;
    }

    public void m() {
        if (this.f2794e) {
            i();
        } else {
            this.f2797h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() {
    }

    protected void o() {
    }

    protected void p() {
        throw null;
    }

    protected void q() {
    }

    public void r(int i2, InterfaceC0069b<D> interfaceC0069b) {
        if (this.f2791b == null) {
            this.f2791b = interfaceC0069b;
            this.a = i2;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void s() {
        o();
        this.f2796g = true;
        this.f2794e = false;
        this.f2795f = false;
        this.f2797h = false;
        this.f2798i = false;
    }

    public void t() {
        if (this.f2798i) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        c.h.j.b.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        this.f2794e = true;
        this.f2796g = false;
        this.f2795f = false;
        p();
    }

    public void v() {
        this.f2794e = false;
        q();
    }

    public void w(InterfaceC0069b<D> interfaceC0069b) {
        InterfaceC0069b<D> interfaceC0069b2 = this.f2791b;
        if (interfaceC0069b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0069b2 == interfaceC0069b) {
            this.f2791b = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
}
