package androidx.core.os;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2156a;

    /* renamed from: b, reason: collision with root package name */
    private b f2157b;

    /* renamed from: c, reason: collision with root package name */
    private Object f2158c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2159d;

    /* loaded from: classes.dex */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private void d() {
        while (this.f2159d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f2156a) {
                return;
            }
            this.f2156a = true;
            this.f2159d = true;
            b bVar = this.f2157b;
            Object obj = this.f2158c;
            if (bVar != null) {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2159d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f2159d = false;
                notifyAll();
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            if (this.f2158c == null) {
                CancellationSignal b6 = a.b();
                this.f2158c = b6;
                if (this.f2156a) {
                    a.a(b6);
                }
            }
            obj = this.f2158c;
        }
        return obj;
    }

    public void c(b bVar) {
        synchronized (this) {
            d();
            if (this.f2157b == bVar) {
                return;
            }
            this.f2157b = bVar;
            if (this.f2156a && bVar != null) {
                bVar.a();
            }
        }
    }
}
