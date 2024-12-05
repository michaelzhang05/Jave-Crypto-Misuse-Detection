package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import l2.InterfaceC3308a;
import l2.InterfaceC3310c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final b f24312a;

    /* renamed from: b, reason: collision with root package name */
    final Context f24313b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f24314c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC3310c f24315d;

    /* renamed from: e, reason: collision with root package name */
    final Map f24316e;

    /* renamed from: f, reason: collision with root package name */
    final Map f24317f;

    /* renamed from: g, reason: collision with root package name */
    final Map f24318g;

    /* renamed from: h, reason: collision with root package name */
    final Set f24319h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f24320i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f24321j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC3308a f24322k;

    /* renamed from: l, reason: collision with root package name */
    final z f24323l;

    /* renamed from: m, reason: collision with root package name */
    final List f24324m;

    /* renamed from: n, reason: collision with root package name */
    final c f24325n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f24326o;

    /* renamed from: p, reason: collision with root package name */
    boolean f24327p;

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final g f24328a;

        /* renamed from: com.squareup.picasso.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0438a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f24329a;

            RunnableC0438a(Message message) {
                this.f24329a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f24329a.what);
            }
        }

        a(Looper looper, g gVar) {
            super(looper);
            this.f24328a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z8 = false;
            switch (message.what) {
                case 1:
                    this.f24328a.v((AbstractC2597a) message.obj);
                    return;
                case 2:
                    this.f24328a.o((AbstractC2597a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    s.f24370o.post(new RunnableC0438a(message));
                    return;
                case 4:
                    this.f24328a.p((RunnableC2599c) message.obj);
                    return;
                case 5:
                    this.f24328a.u((RunnableC2599c) message.obj);
                    return;
                case 6:
                    this.f24328a.q((RunnableC2599c) message.obj, false);
                    return;
                case 7:
                    this.f24328a.n();
                    return;
                case 9:
                    this.f24328a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    g gVar = this.f24328a;
                    if (message.arg1 == 1) {
                        z8 = true;
                    }
                    gVar.m(z8);
                    return;
                case 11:
                    this.f24328a.s(message.obj);
                    return;
                case 12:
                    this.f24328a.t(message.obj);
                    return;
            }
        }
    }

    /* loaded from: classes4.dex */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* loaded from: classes4.dex */
    static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final g f24331a;

        c(g gVar) {
            this.f24331a = gVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f24331a.f24326o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f24331a.f24313b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (!intent.hasExtra("state")) {
                    return;
                }
                this.f24331a.b(intent.getBooleanExtra("state", false));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f24331a.f(((ConnectivityManager) C.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, ExecutorService executorService, Handler handler, InterfaceC3310c interfaceC3310c, InterfaceC3308a interfaceC3308a, z zVar) {
        b bVar = new b();
        this.f24312a = bVar;
        bVar.start();
        C.i(bVar.getLooper());
        this.f24313b = context;
        this.f24314c = executorService;
        this.f24316e = new LinkedHashMap();
        this.f24317f = new WeakHashMap();
        this.f24318g = new WeakHashMap();
        this.f24319h = new LinkedHashSet();
        this.f24320i = new a(bVar.getLooper(), this);
        this.f24315d = interfaceC3310c;
        this.f24321j = handler;
        this.f24322k = interfaceC3308a;
        this.f24323l = zVar;
        this.f24324m = new ArrayList(4);
        this.f24327p = C.q(context);
        this.f24326o = C.p(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f24325n = cVar;
        cVar.a();
    }

    private void a(RunnableC2599c runnableC2599c) {
        if (runnableC2599c.u()) {
            return;
        }
        Bitmap bitmap = runnableC2599c.f24294m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f24324m.add(runnableC2599c);
        if (!this.f24320i.hasMessages(7)) {
            this.f24320i.sendEmptyMessageDelayed(7, 200L);
        }
    }

    private void i() {
        if (!this.f24317f.isEmpty()) {
            Iterator it = this.f24317f.values().iterator();
            while (it.hasNext()) {
                AbstractC2597a abstractC2597a = (AbstractC2597a) it.next();
                it.remove();
                if (abstractC2597a.g().f24384m) {
                    C.t("Dispatcher", "replaying", abstractC2597a.i().d());
                }
                w(abstractC2597a, false);
            }
        }
    }

    private void j(List list) {
        if (list != null && !list.isEmpty() && ((RunnableC2599c) list.get(0)).q().f24384m) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RunnableC2599c runnableC2599c = (RunnableC2599c) it.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C.k(runnableC2599c));
            }
            C.t("Dispatcher", "delivered", sb.toString());
        }
    }

    private void k(AbstractC2597a abstractC2597a) {
        Object k8 = abstractC2597a.k();
        if (k8 != null) {
            abstractC2597a.f24271k = true;
            this.f24317f.put(k8, abstractC2597a);
        }
    }

    private void l(RunnableC2599c runnableC2599c) {
        AbstractC2597a h8 = runnableC2599c.h();
        if (h8 != null) {
            k(h8);
        }
        List i8 = runnableC2599c.i();
        if (i8 != null) {
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                k((AbstractC2597a) i8.get(i9));
            }
        }
    }

    void b(boolean z8) {
        Handler handler = this.f24320i;
        handler.sendMessage(handler.obtainMessage(10, z8 ? 1 : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AbstractC2597a abstractC2597a) {
        Handler handler = this.f24320i;
        handler.sendMessage(handler.obtainMessage(2, abstractC2597a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RunnableC2599c runnableC2599c) {
        Handler handler = this.f24320i;
        handler.sendMessage(handler.obtainMessage(4, runnableC2599c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RunnableC2599c runnableC2599c) {
        Handler handler = this.f24320i;
        handler.sendMessage(handler.obtainMessage(6, runnableC2599c));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f24320i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(RunnableC2599c runnableC2599c) {
        Handler handler = this.f24320i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC2599c), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(AbstractC2597a abstractC2597a) {
        Handler handler = this.f24320i;
        handler.sendMessage(handler.obtainMessage(1, abstractC2597a));
    }

    void m(boolean z8) {
        this.f24327p = z8;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f24324m);
        this.f24324m.clear();
        Handler handler = this.f24321j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(AbstractC2597a abstractC2597a) {
        String d8 = abstractC2597a.d();
        RunnableC2599c runnableC2599c = (RunnableC2599c) this.f24316e.get(d8);
        if (runnableC2599c != null) {
            runnableC2599c.f(abstractC2597a);
            if (runnableC2599c.c()) {
                this.f24316e.remove(d8);
                if (abstractC2597a.g().f24384m) {
                    C.t("Dispatcher", "canceled", abstractC2597a.i().d());
                }
            }
        }
        if (this.f24319h.contains(abstractC2597a.j())) {
            this.f24318g.remove(abstractC2597a.k());
            if (abstractC2597a.g().f24384m) {
                C.u("Dispatcher", "canceled", abstractC2597a.i().d(), "because paused request got canceled");
            }
        }
        AbstractC2597a abstractC2597a2 = (AbstractC2597a) this.f24317f.remove(abstractC2597a.k());
        if (abstractC2597a2 != null && abstractC2597a2.g().f24384m) {
            C.u("Dispatcher", "canceled", abstractC2597a2.i().d(), "from replaying");
        }
    }

    void p(RunnableC2599c runnableC2599c) {
        if (o.b(runnableC2599c.p())) {
            this.f24322k.a(runnableC2599c.n(), runnableC2599c.s());
        }
        this.f24316e.remove(runnableC2599c.n());
        a(runnableC2599c);
        if (runnableC2599c.q().f24384m) {
            C.u("Dispatcher", "batched", C.k(runnableC2599c), "for completion");
        }
    }

    void q(RunnableC2599c runnableC2599c, boolean z8) {
        String str;
        if (runnableC2599c.q().f24384m) {
            String k8 = C.k(runnableC2599c);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            if (z8) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
            C.u("Dispatcher", "batched", k8, sb.toString());
        }
        this.f24316e.remove(runnableC2599c.n());
        a(runnableC2599c);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f24314c;
        if (executorService instanceof u) {
            ((u) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            i();
        }
    }

    void s(Object obj) {
        boolean z8;
        if (!this.f24319h.add(obj)) {
            return;
        }
        Iterator it = this.f24316e.values().iterator();
        while (it.hasNext()) {
            RunnableC2599c runnableC2599c = (RunnableC2599c) it.next();
            boolean z9 = runnableC2599c.q().f24384m;
            AbstractC2597a h8 = runnableC2599c.h();
            List i8 = runnableC2599c.i();
            if (i8 != null && !i8.isEmpty()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (h8 != null || z8) {
                if (h8 != null && h8.j().equals(obj)) {
                    runnableC2599c.f(h8);
                    this.f24318g.put(h8.k(), h8);
                    if (z9) {
                        C.u("Dispatcher", "paused", h8.f24262b.d(), "because tag '" + obj + "' was paused");
                    }
                }
                if (z8) {
                    for (int size = i8.size() - 1; size >= 0; size--) {
                        AbstractC2597a abstractC2597a = (AbstractC2597a) i8.get(size);
                        if (abstractC2597a.j().equals(obj)) {
                            runnableC2599c.f(abstractC2597a);
                            this.f24318g.put(abstractC2597a.k(), abstractC2597a);
                            if (z9) {
                                C.u("Dispatcher", "paused", abstractC2597a.f24262b.d(), "because tag '" + obj + "' was paused");
                            }
                        }
                    }
                }
                if (runnableC2599c.c()) {
                    it.remove();
                    if (z9) {
                        C.u("Dispatcher", "canceled", C.k(runnableC2599c), "all actions paused");
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (!this.f24319h.remove(obj)) {
            return;
        }
        Iterator it = this.f24318g.values().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC2597a abstractC2597a = (AbstractC2597a) it.next();
            if (abstractC2597a.j().equals(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractC2597a);
                it.remove();
            }
        }
        if (arrayList != null) {
            Handler handler = this.f24321j;
            handler.sendMessage(handler.obtainMessage(13, arrayList));
        }
    }

    void u(RunnableC2599c runnableC2599c) {
        NetworkInfo networkInfo;
        if (runnableC2599c.u()) {
            return;
        }
        boolean z8 = false;
        if (this.f24314c.isShutdown()) {
            q(runnableC2599c, false);
            return;
        }
        if (this.f24326o) {
            networkInfo = ((ConnectivityManager) C.o(this.f24313b, "connectivity")).getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (runnableC2599c.w(this.f24327p, networkInfo)) {
            if (runnableC2599c.q().f24384m) {
                C.t("Dispatcher", "retrying", C.k(runnableC2599c));
            }
            if (runnableC2599c.k() instanceof q.a) {
                runnableC2599c.f24290i |= p.NO_CACHE.f24362a;
            }
            runnableC2599c.f24295n = this.f24314c.submit(runnableC2599c);
            return;
        }
        if (this.f24326o && runnableC2599c.x()) {
            z8 = true;
        }
        q(runnableC2599c, z8);
        if (z8) {
            l(runnableC2599c);
        }
    }

    void v(AbstractC2597a abstractC2597a) {
        w(abstractC2597a, true);
    }

    void w(AbstractC2597a abstractC2597a, boolean z8) {
        if (this.f24319h.contains(abstractC2597a.j())) {
            this.f24318g.put(abstractC2597a.k(), abstractC2597a);
            if (abstractC2597a.g().f24384m) {
                C.u("Dispatcher", "paused", abstractC2597a.f24262b.d(), "because tag '" + abstractC2597a.j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC2599c runnableC2599c = (RunnableC2599c) this.f24316e.get(abstractC2597a.d());
        if (runnableC2599c != null) {
            runnableC2599c.b(abstractC2597a);
            return;
        }
        if (this.f24314c.isShutdown()) {
            if (abstractC2597a.g().f24384m) {
                C.u("Dispatcher", "ignored", abstractC2597a.f24262b.d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC2599c g8 = RunnableC2599c.g(abstractC2597a.g(), this, this.f24322k, this.f24323l, abstractC2597a);
        g8.f24295n = this.f24314c.submit(g8);
        this.f24316e.put(abstractC2597a.d(), g8);
        if (z8) {
            this.f24317f.remove(abstractC2597a.k());
        }
        if (abstractC2597a.g().f24384m) {
            C.t("Dispatcher", "enqueued", abstractC2597a.f24262b.d());
        }
    }
}
