package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.f;

/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public class t {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f1274b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private a f1275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceLifecycleDispatcher.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final k f1276f;

        /* renamed from: g, reason: collision with root package name */
        final f.a f1277g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1278h = false;

        a(k kVar, f.a aVar) {
            this.f1276f = kVar;
            this.f1277g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1278h) {
                return;
            }
            this.f1276f.i(this.f1277g);
            this.f1278h = true;
        }
    }

    public t(j jVar) {
        this.a = new k(jVar);
    }

    private void f(f.a aVar) {
        a aVar2 = this.f1275c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.f1275c = aVar3;
        this.f1274b.postAtFrontOfQueue(aVar3);
    }

    public f a() {
        return this.a;
    }

    public void b() {
        f(f.a.ON_START);
    }

    public void c() {
        f(f.a.ON_CREATE);
    }

    public void d() {
        f(f.a.ON_STOP);
        f(f.a.ON_DESTROY);
    }

    public void e() {
        f(f.a.ON_START);
    }
}
