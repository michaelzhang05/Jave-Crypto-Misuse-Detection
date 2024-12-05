package com.facebook.t;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import cm.aptoide.pt.account.AccountAnalytics;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.r;
import com.facebook.t.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppEventQueue.java */
/* loaded from: classes.dex */
public class e {
    private static final String a = "com.facebook.t.e";

    /* renamed from: d, reason: collision with root package name */
    private static ScheduledFuture f9450d;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.facebook.t.d f9448b = new com.facebook.t.d();

    /* renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f9449c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: e, reason: collision with root package name */
    private static final Runnable f9451e = new a();

    /* compiled from: AppEventQueue.java */
    /* loaded from: classes.dex */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                e.b(null);
                if (g.e() != g.a.EXPLICIT_ONLY) {
                    e.k(j.TIMER);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                com.facebook.t.f.b(e.c());
                e.d(new com.facebook.t.d());
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f9452f;

        c(j jVar) {
            this.f9452f = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                e.k(this.f9452f);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.java */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.facebook.t.a f9453f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.facebook.t.c f9454g;

        d(com.facebook.t.a aVar, com.facebook.t.c cVar) {
            this.f9453f = aVar;
            this.f9454g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                e.c().a(this.f9453f, this.f9454g);
                if (g.e() != g.a.EXPLICIT_ONLY && e.c().d() > 100) {
                    e.k(j.EVENT_THRESHOLD);
                } else if (e.a() == null) {
                    e.b(e.f().schedule(e.e(), 15L, TimeUnit.SECONDS));
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.java */
    /* renamed from: com.facebook.t.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0141e implements GraphRequest.f {
        final /* synthetic */ com.facebook.t.a a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GraphRequest f9455b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f9456c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f9457d;

        C0141e(com.facebook.t.a aVar, GraphRequest graphRequest, o oVar, l lVar) {
            this.a = aVar;
            this.f9455b = graphRequest;
            this.f9456c = oVar;
            this.f9457d = lVar;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(com.facebook.i iVar) {
            e.g(this.a, this.f9455b, iVar, this.f9456c, this.f9457d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.java */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.facebook.t.a f9458f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f9459g;

        f(com.facebook.t.a aVar, o oVar) {
            this.f9458f = aVar;
            this.f9459g = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                com.facebook.t.f.a(this.f9458f, this.f9459g);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    e() {
    }

    static /* synthetic */ ScheduledFuture a() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return f9450d;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ ScheduledFuture b(ScheduledFuture scheduledFuture) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            f9450d = scheduledFuture;
            return scheduledFuture;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ com.facebook.t.d c() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return f9448b;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ com.facebook.t.d d(com.facebook.t.d dVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            f9448b = dVar;
            return dVar;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ Runnable e() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return f9451e;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ ScheduledExecutorService f() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return f9449c;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ void g(com.facebook.t.a aVar, GraphRequest graphRequest, com.facebook.i iVar, o oVar, l lVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            m(aVar, graphRequest, iVar, oVar, lVar);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    public static void h(com.facebook.t.a aVar, com.facebook.t.c cVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            f9449c.execute(new d(aVar, cVar));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    private static GraphRequest i(com.facebook.t.a aVar, o oVar, boolean z, l lVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            String b2 = aVar.b();
            com.facebook.internal.m o = com.facebook.internal.n.o(b2, false);
            GraphRequest L = GraphRequest.L(null, String.format("%s/activities", b2), null, null);
            Bundle y = L.y();
            if (y == null) {
                y = new Bundle();
            }
            y.putString("access_token", aVar.a());
            String d2 = m.d();
            if (d2 != null) {
                y.putString("device_token", d2);
            }
            String g2 = h.g();
            if (g2 != null) {
                y.putString("install_referrer", g2);
            }
            L.a0(y);
            int e2 = oVar.e(L, com.facebook.f.e(), o != null ? o.m() : false, z);
            if (e2 == 0) {
                return null;
            }
            lVar.a += e2;
            L.W(new C0141e(aVar, L, oVar, lVar));
            return L;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    public static void j(j jVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            f9449c.execute(new c(jVar));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    static void k(j jVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            f9448b.b(com.facebook.t.f.c());
            try {
                l o = o(jVar, f9448b);
                if (o != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", o.a);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", o.f9484b);
                    c.m.a.a.b(com.facebook.f.e()).d(intent);
                }
            } catch (Exception e2) {
                Log.w(a, "Caught unexpected exception while flushing app events: ", e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    public static Set<com.facebook.t.a> l() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return f9448b.f();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    private static void m(com.facebook.t.a aVar, GraphRequest graphRequest, com.facebook.i iVar, o oVar, l lVar) {
        String str;
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            FacebookRequestError g2 = iVar.g();
            String str2 = AccountAnalytics.SUCCESS;
            k kVar = k.SUCCESS;
            boolean z = true;
            if (g2 != null) {
                if (g2.c() == -1) {
                    str2 = "Failed: No Connectivity";
                    kVar = k.NO_CONNECTIVITY;
                } else {
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", iVar.toString(), g2.toString());
                    kVar = k.SERVER_ERROR;
                }
            }
            if (com.facebook.f.y(com.facebook.l.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) graphRequest.A()).toString(2);
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                r.h(com.facebook.l.APP_EVENTS, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.t().toString(), str2, str);
            }
            if (g2 == null) {
                z = false;
            }
            oVar.b(z);
            k kVar2 = k.NO_CONNECTIVITY;
            if (kVar == kVar2) {
                com.facebook.f.m().execute(new f(aVar, oVar));
            }
            if (kVar == k.SUCCESS || lVar.f9484b == kVar2) {
                return;
            }
            lVar.f9484b = kVar;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    public static void n() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            f9449c.execute(new b());
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    private static l o(j jVar, com.facebook.t.d dVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            l lVar = new l();
            boolean q = com.facebook.f.q(com.facebook.f.e());
            ArrayList arrayList = new ArrayList();
            for (com.facebook.t.a aVar : dVar.f()) {
                GraphRequest i2 = i(aVar, dVar.c(aVar), q, lVar);
                if (i2 != null) {
                    arrayList.add(i2);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            r.h(com.facebook.l.APP_EVENTS, a, "Flushing %d events due to %s.", Integer.valueOf(lVar.a), jVar.toString());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).g();
            }
            return lVar;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }
}
