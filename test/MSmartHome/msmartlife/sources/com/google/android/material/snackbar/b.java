package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes2.dex */
class b {
    private static b a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16737b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f16738c = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: d, reason: collision with root package name */
    private c f16739d;

    /* renamed from: e, reason: collision with root package name */
    private c f16740e;

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes2.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0195b {
        void a(int i2);

        void show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarManager.java */
    /* loaded from: classes2.dex */
    public static class c {
        final WeakReference<InterfaceC0195b> a;

        /* renamed from: b, reason: collision with root package name */
        int f16742b;

        /* renamed from: c, reason: collision with root package name */
        boolean f16743c;

        c(int i2, InterfaceC0195b interfaceC0195b) {
            this.a = new WeakReference<>(interfaceC0195b);
            this.f16742b = i2;
        }

        boolean a(InterfaceC0195b interfaceC0195b) {
            return interfaceC0195b != null && this.a.get() == interfaceC0195b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i2) {
        InterfaceC0195b interfaceC0195b = cVar.a.get();
        if (interfaceC0195b == null) {
            return false;
        }
        this.f16738c.removeCallbacksAndMessages(cVar);
        interfaceC0195b.a(i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b c() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    private boolean f(InterfaceC0195b interfaceC0195b) {
        c cVar = this.f16739d;
        return cVar != null && cVar.a(interfaceC0195b);
    }

    private boolean g(InterfaceC0195b interfaceC0195b) {
        c cVar = this.f16740e;
        return cVar != null && cVar.a(interfaceC0195b);
    }

    private void l(c cVar) {
        int i2 = cVar.f16742b;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? 1500 : 2750;
        }
        this.f16738c.removeCallbacksAndMessages(cVar);
        Handler handler = this.f16738c;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i2);
    }

    private void n() {
        c cVar = this.f16740e;
        if (cVar != null) {
            this.f16739d = cVar;
            this.f16740e = null;
            InterfaceC0195b interfaceC0195b = cVar.a.get();
            if (interfaceC0195b != null) {
                interfaceC0195b.show();
            } else {
                this.f16739d = null;
            }
        }
    }

    public void b(InterfaceC0195b interfaceC0195b, int i2) {
        synchronized (this.f16737b) {
            if (f(interfaceC0195b)) {
                a(this.f16739d, i2);
            } else if (g(interfaceC0195b)) {
                a(this.f16740e, i2);
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f16737b) {
            if (this.f16739d == cVar || this.f16740e == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(InterfaceC0195b interfaceC0195b) {
        boolean z;
        synchronized (this.f16737b) {
            z = f(interfaceC0195b) || g(interfaceC0195b);
        }
        return z;
    }

    public void h(InterfaceC0195b interfaceC0195b) {
        synchronized (this.f16737b) {
            if (f(interfaceC0195b)) {
                this.f16739d = null;
                if (this.f16740e != null) {
                    n();
                }
            }
        }
    }

    public void i(InterfaceC0195b interfaceC0195b) {
        synchronized (this.f16737b) {
            if (f(interfaceC0195b)) {
                l(this.f16739d);
            }
        }
    }

    public void j(InterfaceC0195b interfaceC0195b) {
        synchronized (this.f16737b) {
            if (f(interfaceC0195b)) {
                c cVar = this.f16739d;
                if (!cVar.f16743c) {
                    cVar.f16743c = true;
                    this.f16738c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void k(InterfaceC0195b interfaceC0195b) {
        synchronized (this.f16737b) {
            if (f(interfaceC0195b)) {
                c cVar = this.f16739d;
                if (cVar.f16743c) {
                    cVar.f16743c = false;
                    l(cVar);
                }
            }
        }
    }

    public void m(int i2, InterfaceC0195b interfaceC0195b) {
        synchronized (this.f16737b) {
            if (f(interfaceC0195b)) {
                c cVar = this.f16739d;
                cVar.f16742b = i2;
                this.f16738c.removeCallbacksAndMessages(cVar);
                l(this.f16739d);
                return;
            }
            if (g(interfaceC0195b)) {
                this.f16740e.f16742b = i2;
            } else {
                this.f16740e = new c(i2, interfaceC0195b);
            }
            c cVar2 = this.f16739d;
            if (cVar2 == null || !a(cVar2, 4)) {
                this.f16739d = null;
                n();
            }
        }
    }
}
