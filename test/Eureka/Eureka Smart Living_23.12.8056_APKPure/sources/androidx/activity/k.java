package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f147a;

    /* renamed from: b, reason: collision with root package name */
    private final e5.a f148b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f149c;

    /* renamed from: d, reason: collision with root package name */
    private int f150d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f151e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f152f;

    /* renamed from: g, reason: collision with root package name */
    private final List f153g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f154h;

    public k(Executor executor, e5.a aVar) {
        f5.h.e(executor, "executor");
        f5.h.e(aVar, "reportFullyDrawn");
        this.f147a = executor;
        this.f148b = aVar;
        this.f149c = new Object();
        this.f153g = new ArrayList();
        this.f154h = new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                k.d(k.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k kVar) {
        f5.h.e(kVar, "this$0");
        synchronized (kVar.f149c) {
            kVar.f151e = false;
            if (kVar.f150d == 0 && !kVar.f152f) {
                kVar.f148b.a();
                kVar.b();
            }
            z4.k kVar2 = z4.k.f10059a;
        }
    }

    public final void b() {
        synchronized (this.f149c) {
            this.f152f = true;
            Iterator it = this.f153g.iterator();
            while (it.hasNext()) {
                ((e5.a) it.next()).a();
            }
            this.f153g.clear();
            z4.k kVar = z4.k.f10059a;
        }
    }

    public final boolean c() {
        boolean z5;
        synchronized (this.f149c) {
            z5 = this.f152f;
        }
        return z5;
    }
}
