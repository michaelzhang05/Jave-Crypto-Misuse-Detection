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
import i2.InterfaceC2773a;
import i2.InterfaceC2775c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final b f23257a;

    /* renamed from: b, reason: collision with root package name */
    final Context f23258b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f23259c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC2775c f23260d;

    /* renamed from: e, reason: collision with root package name */
    final Map f23261e;

    /* renamed from: f, reason: collision with root package name */
    final Map f23262f;

    /* renamed from: g, reason: collision with root package name */
    final Map f23263g;

    /* renamed from: h, reason: collision with root package name */
    final Set f23264h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f23265i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f23266j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC2773a f23267k;

    /* renamed from: l, reason: collision with root package name */
    final z f23268l;

    /* renamed from: m, reason: collision with root package name */
    final List f23269m;

    /* renamed from: n, reason: collision with root package name */
    final c f23270n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f23271o;

    /* renamed from: p, reason: collision with root package name */
    boolean f23272p;

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final g f23273a;

        /* renamed from: com.squareup.picasso.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0442a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f23274a;

            RunnableC0442a(Message message) {
                this.f23274a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f23274a.what);
            }
        }

        a(Looper looper, g gVar) {
            super(looper);
            this.f23273a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z8 = false;
            switch (message.what) {
                case 1:
                    this.f23273a.v((AbstractC2403a) message.obj);
                    return;
                case 2:
                    this.f23273a.o((AbstractC2403a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    s.f23315o.post(new RunnableC0442a(message));
                    return;
                case 4:
                    this.f23273a.p((RunnableC2405c) message.obj);
                    return;
                case 5:
                    this.f23273a.u((RunnableC2405c) message.obj);
                    return;
                case 6:
                    this.f23273a.q((RunnableC2405c) message.obj, false);
                    return;
                case 7:
                    this.f23273a.n();
                    return;
                case 9:
                    this.f23273a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    g gVar = this.f23273a;
                    if (message.arg1 == 1) {
                        z8 = true;
                    }
                    gVar.m(z8);
                    return;
                case 11:
                    this.f23273a.s(message.obj);
                    return;
                case 12:
                    this.f23273a.t(message.obj);
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
        private final g f23276a;

        c(g gVar) {
            this.f23276a = gVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f23276a.f23271o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f23276a.f23258b.registerReceiver(this, intentFilter);
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
                this.f23276a.b(intent.getBooleanExtra("state", false));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f23276a.f(((ConnectivityManager) C.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, ExecutorService executorService, Handler handler, InterfaceC2775c interfaceC2775c, InterfaceC2773a interfaceC2773a, z zVar) {
        b bVar = new b();
        this.f23257a = bVar;
        bVar.start();
        C.i(bVar.getLooper());
        this.f23258b = context;
        this.f23259c = executorService;
        this.f23261e = new LinkedHashMap();
        this.f23262f = new WeakHashMap();
        this.f23263g = new WeakHashMap();
        this.f23264h = new LinkedHashSet();
        this.f23265i = new a(bVar.getLooper(), this);
        this.f23260d = interfaceC2775c;
        this.f23266j = handler;
        this.f23267k = interfaceC2773a;
        this.f23268l = zVar;
        this.f23269m = new ArrayList(4);
        this.f23272p = C.q(context);
        this.f23271o = C.p(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f23270n = cVar;
        cVar.a();
    }

    private void a(RunnableC2405c runnableC2405c) {
        if (runnableC2405c.u()) {
            return;
        }
        Bitmap bitmap = runnableC2405c.f23239m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f23269m.add(runnableC2405c);
        if (!this.f23265i.hasMessages(7)) {
            this.f23265i.sendEmptyMessageDelayed(7, 200L);
        }
    }

    private void i() {
        if (!this.f23262f.isEmpty()) {
            Iterator it = this.f23262f.values().iterator();
            while (it.hasNext()) {
                AbstractC2403a abstractC2403a = (AbstractC2403a) it.next();
                it.remove();
                if (abstractC2403a.g().f23329m) {
                    C.t("Dispatcher", "replaying", abstractC2403a.i().d());
                }
                w(abstractC2403a, false);
            }
        }
    }

    private void j(List list) {
        if (list != null && !list.isEmpty() && ((RunnableC2405c) list.get(0)).q().f23329m) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RunnableC2405c runnableC2405c = (RunnableC2405c) it.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C.k(runnableC2405c));
            }
            C.t("Dispatcher", "delivered", sb.toString());
        }
    }

    private void k(AbstractC2403a abstractC2403a) {
        Object k8 = abstractC2403a.k();
        if (k8 != null) {
            abstractC2403a.f23216k = true;
            this.f23262f.put(k8, abstractC2403a);
        }
    }

    private void l(RunnableC2405c runnableC2405c) {
        AbstractC2403a h8 = runnableC2405c.h();
        if (h8 != null) {
            k(h8);
        }
        List i8 = runnableC2405c.i();
        if (i8 != null) {
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                k((AbstractC2403a) i8.get(i9));
            }
        }
    }

    void b(boolean z8) {
        Handler handler = this.f23265i;
        handler.sendMessage(handler.obtainMessage(10, z8 ? 1 : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AbstractC2403a abstractC2403a) {
        Handler handler = this.f23265i;
        handler.sendMessage(handler.obtainMessage(2, abstractC2403a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RunnableC2405c runnableC2405c) {
        Handler handler = this.f23265i;
        handler.sendMessage(handler.obtainMessage(4, runnableC2405c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RunnableC2405c runnableC2405c) {
        Handler handler = this.f23265i;
        handler.sendMessage(handler.obtainMessage(6, runnableC2405c));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f23265i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(RunnableC2405c runnableC2405c) {
        Handler handler = this.f23265i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC2405c), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(AbstractC2403a abstractC2403a) {
        Handler handler = this.f23265i;
        handler.sendMessage(handler.obtainMessage(1, abstractC2403a));
    }

    void m(boolean z8) {
        this.f23272p = z8;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f23269m);
        this.f23269m.clear();
        Handler handler = this.f23266j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(AbstractC2403a abstractC2403a) {
        String d8 = abstractC2403a.d();
        RunnableC2405c runnableC2405c = (RunnableC2405c) this.f23261e.get(d8);
        if (runnableC2405c != null) {
            runnableC2405c.f(abstractC2403a);
            if (runnableC2405c.c()) {
                this.f23261e.remove(d8);
                if (abstractC2403a.g().f23329m) {
                    C.t("Dispatcher", "canceled", abstractC2403a.i().d());
                }
            }
        }
        if (this.f23264h.contains(abstractC2403a.j())) {
            this.f23263g.remove(abstractC2403a.k());
            if (abstractC2403a.g().f23329m) {
                C.u("Dispatcher", "canceled", abstractC2403a.i().d(), "because paused request got canceled");
            }
        }
        AbstractC2403a abstractC2403a2 = (AbstractC2403a) this.f23262f.remove(abstractC2403a.k());
        if (abstractC2403a2 != null && abstractC2403a2.g().f23329m) {
            C.u("Dispatcher", "canceled", abstractC2403a2.i().d(), "from replaying");
        }
    }

    void p(RunnableC2405c runnableC2405c) {
        if (o.b(runnableC2405c.p())) {
            this.f23267k.a(runnableC2405c.n(), runnableC2405c.s());
        }
        this.f23261e.remove(runnableC2405c.n());
        a(runnableC2405c);
        if (runnableC2405c.q().f23329m) {
            C.u("Dispatcher", "batched", C.k(runnableC2405c), "for completion");
        }
    }

    void q(RunnableC2405c runnableC2405c, boolean z8) {
        String str;
        if (runnableC2405c.q().f23329m) {
            String k8 = C.k(runnableC2405c);
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
        this.f23261e.remove(runnableC2405c.n());
        a(runnableC2405c);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f23259c;
        if (executorService instanceof u) {
            ((u) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            i();
        }
    }

    void s(Object obj) {
        boolean z8;
        if (!this.f23264h.add(obj)) {
            return;
        }
        Iterator it = this.f23261e.values().iterator();
        while (it.hasNext()) {
            RunnableC2405c runnableC2405c = (RunnableC2405c) it.next();
            boolean z9 = runnableC2405c.q().f23329m;
            AbstractC2403a h8 = runnableC2405c.h();
            List i8 = runnableC2405c.i();
            if (i8 != null && !i8.isEmpty()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (h8 != null || z8) {
                if (h8 != null && h8.j().equals(obj)) {
                    runnableC2405c.f(h8);
                    this.f23263g.put(h8.k(), h8);
                    if (z9) {
                        C.u("Dispatcher", "paused", h8.f23207b.d(), "because tag '" + obj + "' was paused");
                    }
                }
                if (z8) {
                    for (int size = i8.size() - 1; size >= 0; size--) {
                        AbstractC2403a abstractC2403a = (AbstractC2403a) i8.get(size);
                        if (abstractC2403a.j().equals(obj)) {
                            runnableC2405c.f(abstractC2403a);
                            this.f23263g.put(abstractC2403a.k(), abstractC2403a);
                            if (z9) {
                                C.u("Dispatcher", "paused", abstractC2403a.f23207b.d(), "because tag '" + obj + "' was paused");
                            }
                        }
                    }
                }
                if (runnableC2405c.c()) {
                    it.remove();
                    if (z9) {
                        C.u("Dispatcher", "canceled", C.k(runnableC2405c), "all actions paused");
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (!this.f23264h.remove(obj)) {
            return;
        }
        Iterator it = this.f23263g.values().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC2403a abstractC2403a = (AbstractC2403a) it.next();
            if (abstractC2403a.j().equals(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractC2403a);
                it.remove();
            }
        }
        if (arrayList != null) {
            Handler handler = this.f23266j;
            handler.sendMessage(handler.obtainMessage(13, arrayList));
        }
    }

    void u(RunnableC2405c runnableC2405c) {
        NetworkInfo networkInfo;
        if (runnableC2405c.u()) {
            return;
        }
        boolean z8 = false;
        if (this.f23259c.isShutdown()) {
            q(runnableC2405c, false);
            return;
        }
        if (this.f23271o) {
            networkInfo = ((ConnectivityManager) C.o(this.f23258b, "connectivity")).getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (runnableC2405c.w(this.f23272p, networkInfo)) {
            if (runnableC2405c.q().f23329m) {
                C.t("Dispatcher", "retrying", C.k(runnableC2405c));
            }
            if (runnableC2405c.k() instanceof q.a) {
                runnableC2405c.f23235i |= p.NO_CACHE.f23307a;
            }
            runnableC2405c.f23240n = this.f23259c.submit(runnableC2405c);
            return;
        }
        if (this.f23271o && runnableC2405c.x()) {
            z8 = true;
        }
        q(runnableC2405c, z8);
        if (z8) {
            l(runnableC2405c);
        }
    }

    void v(AbstractC2403a abstractC2403a) {
        w(abstractC2403a, true);
    }

    void w(AbstractC2403a abstractC2403a, boolean z8) {
        if (this.f23264h.contains(abstractC2403a.j())) {
            this.f23263g.put(abstractC2403a.k(), abstractC2403a);
            if (abstractC2403a.g().f23329m) {
                C.u("Dispatcher", "paused", abstractC2403a.f23207b.d(), "because tag '" + abstractC2403a.j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC2405c runnableC2405c = (RunnableC2405c) this.f23261e.get(abstractC2403a.d());
        if (runnableC2405c != null) {
            runnableC2405c.b(abstractC2403a);
            return;
        }
        if (this.f23259c.isShutdown()) {
            if (abstractC2403a.g().f23329m) {
                C.u("Dispatcher", "ignored", abstractC2403a.f23207b.d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC2405c g8 = RunnableC2405c.g(abstractC2403a.g(), this, this.f23267k, this.f23268l, abstractC2403a);
        g8.f23240n = this.f23259c.submit(g8);
        this.f23261e.put(abstractC2403a.d(), g8);
        if (z8) {
            this.f23262f.remove(abstractC2403a.k());
        }
        if (abstractC2403a.g().f23329m) {
            C.t("Dispatcher", "enqueued", abstractC2403a.f23207b.d());
        }
    }
}
