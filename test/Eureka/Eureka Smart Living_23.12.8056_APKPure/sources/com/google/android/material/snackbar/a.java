package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.f0;

/* loaded from: classes.dex */
class a {

    /* renamed from: c, reason: collision with root package name */
    private static a f5187c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5188a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f5189b = new Handler(Looper.getMainLooper(), new C0087a());

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0087a implements Handler.Callback {
        C0087a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            f0.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    /* loaded from: classes.dex */
    interface b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i6) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b() {
        if (f5187c == null) {
            f5187c = new a();
        }
        return f5187c;
    }

    private boolean d(b bVar) {
        return false;
    }

    void c(c cVar) {
        synchronized (this.f5188a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f5188a) {
            if (d(bVar)) {
                throw null;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f5188a) {
            if (d(bVar)) {
                throw null;
            }
        }
    }
}
