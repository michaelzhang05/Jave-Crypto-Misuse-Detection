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
    private q f18920a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18921b;

    /* renamed from: c, reason: collision with root package name */
    private final o f18922c;

    /* renamed from: d, reason: collision with root package name */
    private final v f18923d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18924e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.e.a.q f18925f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f18926g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements r.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f18928a;

        /* renamed from: b, reason: collision with root package name */
        private final s f18929b;

        public a(q qVar, s sVar) {
            this.f18928a = qVar;
            this.f18929b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.a
        public final void a(z zVar) {
            if (y.b(this.f18928a)) {
                try {
                    this.f18928a.a(this.f18929b, 0, zVar.getMessage());
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f18749a) {
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
        private final q f18930a;

        /* renamed from: b, reason: collision with root package name */
        private final s f18931b;

        public b(q qVar, s sVar) {
            this.f18930a = qVar;
            this.f18931b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.b
        public final void a(Object obj) {
            if (y.b(this.f18930a)) {
                try {
                    this.f18930a.a(this.f18931b);
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f18749a) {
                        Log.e("TrackManager", "onResponse error", e8);
                    }
                }
            }
        }
    }

    public n(int i8, o oVar, v vVar, int i9) {
        this.f18921b = i8;
        this.f18922c = oVar;
        this.f18923d = vVar;
        this.f18924e = i9;
        this.f18926g = new ThreadPoolExecutor(1, i8, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.n.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeReportResponseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(q qVar) {
        this.f18920a = qVar;
    }

    public final void a(s sVar, Map<String, String> map, boolean z8) {
        u uVar;
        if (y.a(map)) {
            q qVar = this.f18920a;
            if (qVar != null) {
                try {
                    qVar.a(sVar, 0, "params is null");
                    return;
                } catch (Exception e8) {
                    if (com.mbridge.msdk.e.a.f18749a) {
                        Log.e("TrackManager", "send error", e8);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            if (!y.b(this.f18925f)) {
                com.mbridge.msdk.e.a.q a8 = com.mbridge.msdk.e.a.a.l.a(new com.mbridge.msdk.e.a.a.b(this.f18922c.c()), new com.mbridge.msdk.e.a.h(this.f18926g), this.f18921b, null);
                this.f18925f = a8;
                a8.a();
            }
            if (this.f18924e == 1) {
                uVar = new u(this.f18922c.b(), 1, this.f18922c.a());
            } else {
                uVar = new u(this.f18922c.b(), 1);
            }
            uVar.a(map);
            uVar.a(false);
            uVar.b(true);
            uVar.c(true);
            uVar.a(this.f18923d);
            uVar.a(z8 ? p.b.HIGH : p.b.NORMAL);
            uVar.a((r.b) new b(this.f18920a, sVar));
            uVar.a((r.a) new a(this.f18920a, sVar));
            this.f18925f.a(uVar);
        } catch (Exception e9) {
            if (com.mbridge.msdk.e.a.f18749a) {
                Log.e("TrackManager", "send error", e9);
            }
            if (y.b(this.f18920a)) {
                this.f18920a.a(sVar, 0, e9.getMessage());
            }
        }
    }
}
