package com.mbridge.msdk.e;

import android.util.Log;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.z;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private q f19975a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19976b;

    /* renamed from: c, reason: collision with root package name */
    private final o f19977c;

    /* renamed from: d, reason: collision with root package name */
    private final v f19978d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19979e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.e.a.q f19980f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f19981g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements r.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f19983a;

        /* renamed from: b, reason: collision with root package name */
        private final s f19984b;

        public a(q qVar, s sVar) {
            this.f19983a = qVar;
            this.f19984b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.a
        public final void a(z zVar) {
            if (y.b(this.f19983a)) {
                try {
                    this.f19983a.a(this.f19984b, 0, zVar.getMessage());
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f19804a) {
                        Log.e("TrackManager", "onErrorResponse error", e8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements r.b {

        /* renamed from: a, reason: collision with root package name */
        private final q f19985a;

        /* renamed from: b, reason: collision with root package name */
        private final s f19986b;

        public b(q qVar, s sVar) {
            this.f19985a = qVar;
            this.f19986b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.b
        public final void a(Object obj) {
            if (y.b(this.f19985a)) {
                try {
                    this.f19985a.a(this.f19986b);
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f19804a) {
                        Log.e("TrackManager", "onResponse error", e8);
                    }
                }
            }
        }
    }

    public n(int i8, o oVar, v vVar, int i9) {
        this.f19976b = i8;
        this.f19977c = oVar;
        this.f19978d = vVar;
        this.f19979e = i9;
        this.f19981g = new ThreadPoolExecutor(1, i8, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.n.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeReportResponseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(q qVar) {
        this.f19975a = qVar;
    }

    public final void a(s sVar, Map<String, String> map, boolean z8) {
        u uVar;
        if (y.a(map)) {
            q qVar = this.f19975a;
            if (qVar != null) {
                try {
                    qVar.a(sVar, 0, "params is null");
                    return;
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f19804a) {
                        Log.e("TrackManager", "send error", e8);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            if (!y.b(this.f19980f)) {
                com.mbridge.msdk.e.a.q a8 = com.mbridge.msdk.e.a.a.l.a(new com.mbridge.msdk.e.a.a.b(this.f19977c.c()), new com.mbridge.msdk.e.a.h(this.f19981g), this.f19976b, null);
                this.f19980f = a8;
                a8.a();
            }
            if (this.f19979e == 1) {
                uVar = new u(this.f19977c.b(), 1, this.f19977c.a());
            } else {
                uVar = new u(this.f19977c.b(), 1);
            }
            uVar.a(map);
            uVar.a(false);
            uVar.b(true);
            uVar.c(true);
            uVar.a(this.f19978d);
            uVar.a(z8 ? p.b.HIGH : p.b.NORMAL);
            uVar.a((r.b) new b(this.f19975a, sVar));
            uVar.a((r.a) new a(this.f19975a, sVar));
            this.f19980f.a(uVar);
        } catch (Exception e9) {
            if (com.mbridge.msdk.e.a.f19804a) {
                Log.e("TrackManager", "send error", e9);
            }
            if (y.b(this.f19975a)) {
                this.f19975a.a(sVar, 0, e9.getMessage());
            }
        }
    }
}
