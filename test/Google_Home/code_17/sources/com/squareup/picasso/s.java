package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import com.squareup.picasso.AbstractC2597a;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import l2.InterfaceC3308a;
import l2.InterfaceC3310c;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: o, reason: collision with root package name */
    static final Handler f24370o = new a(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    static volatile s f24371p = null;

    /* renamed from: a, reason: collision with root package name */
    private final g f24372a;

    /* renamed from: b, reason: collision with root package name */
    private final c f24373b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24374c;

    /* renamed from: d, reason: collision with root package name */
    final Context f24375d;

    /* renamed from: e, reason: collision with root package name */
    final com.squareup.picasso.g f24376e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC3308a f24377f;

    /* renamed from: g, reason: collision with root package name */
    final z f24378g;

    /* renamed from: h, reason: collision with root package name */
    final Map f24379h;

    /* renamed from: i, reason: collision with root package name */
    final Map f24380i;

    /* renamed from: j, reason: collision with root package name */
    final ReferenceQueue f24381j;

    /* renamed from: k, reason: collision with root package name */
    final Bitmap.Config f24382k;

    /* renamed from: l, reason: collision with root package name */
    boolean f24383l;

    /* renamed from: m, reason: collision with root package name */
    volatile boolean f24384m;

    /* renamed from: n, reason: collision with root package name */
    boolean f24385n;

    /* loaded from: classes4.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 3) {
                int i9 = 0;
                if (i8 != 8) {
                    if (i8 == 13) {
                        List list = (List) message.obj;
                        int size = list.size();
                        while (i9 < size) {
                            AbstractC2597a abstractC2597a = (AbstractC2597a) list.get(i9);
                            abstractC2597a.f24261a.n(abstractC2597a);
                            i9++;
                        }
                        return;
                    }
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i9 < size2) {
                    RunnableC2599c runnableC2599c = (RunnableC2599c) list2.get(i9);
                    runnableC2599c.f24283b.d(runnableC2599c);
                    i9++;
                }
                return;
            }
            AbstractC2597a abstractC2597a2 = (AbstractC2597a) message.obj;
            if (abstractC2597a2.g().f24384m) {
                C.u("Main", "canceled", abstractC2597a2.f24262b.d(), "target got garbage collected");
            }
            abstractC2597a2.f24261a.a(abstractC2597a2.k());
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f24386a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC3310c f24387b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f24388c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC3308a f24389d;

        /* renamed from: e, reason: collision with root package name */
        private g f24390e;

        /* renamed from: f, reason: collision with root package name */
        private List f24391f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap.Config f24392g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24393h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f24394i;

        public b(Context context) {
            if (context != null) {
                this.f24386a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public s a() {
            Context context = this.f24386a;
            if (this.f24387b == null) {
                this.f24387b = new r(context);
            }
            if (this.f24389d == null) {
                this.f24389d = new l(context);
            }
            if (this.f24388c == null) {
                this.f24388c = new u();
            }
            if (this.f24390e == null) {
                this.f24390e = g.f24408a;
            }
            z zVar = new z(this.f24389d);
            return new s(context, new com.squareup.picasso.g(context, this.f24388c, s.f24370o, this.f24387b, this.f24389d, zVar), this.f24389d, null, this.f24390e, this.f24391f, zVar, this.f24392g, this.f24393h, this.f24394i);
        }
    }

    /* loaded from: classes4.dex */
    private static class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f24395a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f24396b;

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f24397a;

            a(Exception exc) {
                this.f24397a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f24397a);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f24395a = referenceQueue;
            this.f24396b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC2597a.C0436a c0436a = (AbstractC2597a.C0436a) this.f24395a.remove(1000L);
                    Message obtainMessage = this.f24396b.obtainMessage();
                    if (c0436a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0436a.f24273a;
                        this.f24396b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e8) {
                    this.f24396b.post(new a(e8));
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
    }

    /* loaded from: classes4.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);


        /* renamed from: a, reason: collision with root package name */
        final int f24403a;

        e(int i8) {
            this.f24403a = i8;
        }
    }

    /* loaded from: classes4.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* loaded from: classes4.dex */
    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f24408a = new a();

        /* loaded from: classes4.dex */
        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.s.g
            public v a(v vVar) {
                return vVar;
            }
        }

        v a(v vVar);
    }

    s(Context context, com.squareup.picasso.g gVar, InterfaceC3308a interfaceC3308a, d dVar, g gVar2, List list, z zVar, Bitmap.Config config, boolean z8, boolean z9) {
        int i8;
        this.f24375d = context;
        this.f24376e = gVar;
        this.f24377f = interfaceC3308a;
        this.f24372a = gVar2;
        this.f24382k = config;
        if (list != null) {
            i8 = list.size();
        } else {
            i8 = 0;
        }
        ArrayList arrayList = new ArrayList(i8 + 7);
        arrayList.add(new y(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.d(context));
        arrayList.add(new n(context));
        arrayList.add(new com.squareup.picasso.e(context));
        arrayList.add(new C2598b(context));
        arrayList.add(new i(context));
        arrayList.add(new q(gVar.f24315d, zVar));
        this.f24374c = DesugarCollections.unmodifiableList(arrayList);
        this.f24378g = zVar;
        this.f24379h = new WeakHashMap();
        this.f24380i = new WeakHashMap();
        this.f24383l = z8;
        this.f24384m = z9;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f24381j = referenceQueue;
        c cVar = new c(referenceQueue, f24370o);
        this.f24373b = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, e eVar, AbstractC2597a abstractC2597a, Exception exc) {
        if (abstractC2597a.l()) {
            return;
        }
        if (!abstractC2597a.m()) {
            this.f24379h.remove(abstractC2597a.k());
        }
        if (bitmap != null) {
            if (eVar != null) {
                abstractC2597a.b(bitmap, eVar);
                if (this.f24384m) {
                    C.u("Main", "completed", abstractC2597a.f24262b.d(), "from " + eVar);
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC2597a.c(exc);
        if (this.f24384m) {
            C.u("Main", "errored", abstractC2597a.f24262b.d(), exc.getMessage());
        }
    }

    public static s h() {
        if (f24371p == null) {
            synchronized (s.class) {
                try {
                    if (f24371p == null) {
                        Context context = PicassoProvider.f24260a;
                        if (context != null) {
                            f24371p = new b(context).a();
                        } else {
                            throw new IllegalStateException("context == null");
                        }
                    }
                } finally {
                }
            }
        }
        return f24371p;
    }

    void a(Object obj) {
        C.c();
        AbstractC2597a abstractC2597a = (AbstractC2597a) this.f24379h.remove(obj);
        if (abstractC2597a != null) {
            abstractC2597a.a();
            this.f24376e.c(abstractC2597a);
        }
        if (obj instanceof ImageView) {
            com.squareup.picasso.f fVar = (com.squareup.picasso.f) this.f24380i.remove((ImageView) obj);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public void c(A a8) {
        if (a8 != null) {
            a(a8);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    void d(RunnableC2599c runnableC2599c) {
        boolean z8;
        AbstractC2597a h8 = runnableC2599c.h();
        List i8 = runnableC2599c.i();
        if (i8 != null && !i8.isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (h8 == null && !z8) {
            return;
        }
        Uri uri = runnableC2599c.j().f24422d;
        Exception k8 = runnableC2599c.k();
        Bitmap s8 = runnableC2599c.s();
        e o8 = runnableC2599c.o();
        if (h8 != null) {
            f(s8, o8, h8, k8);
        }
        if (z8) {
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                f(s8, o8, (AbstractC2597a) i8.get(i9), k8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ImageView imageView, com.squareup.picasso.f fVar) {
        if (this.f24380i.containsKey(imageView)) {
            a(imageView);
        }
        this.f24380i.put(imageView, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(AbstractC2597a abstractC2597a) {
        Object k8 = abstractC2597a.k();
        if (k8 != null && this.f24379h.get(k8) != abstractC2597a) {
            a(k8);
            this.f24379h.put(k8, abstractC2597a);
        }
        o(abstractC2597a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List i() {
        return this.f24374c;
    }

    public w j(int i8) {
        if (i8 != 0) {
            return new w(this, null, i8);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public w k(Uri uri) {
        return new w(this, uri, 0);
    }

    public w l(String str) {
        if (str == null) {
            return new w(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return k(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap m(String str) {
        Bitmap bitmap = this.f24377f.get(str);
        if (bitmap != null) {
            this.f24378g.d();
        } else {
            this.f24378g.e();
        }
        return bitmap;
    }

    void n(AbstractC2597a abstractC2597a) {
        Bitmap bitmap;
        if (o.a(abstractC2597a.f24265e)) {
            bitmap = m(abstractC2597a.d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            e eVar = e.MEMORY;
            f(bitmap, eVar, abstractC2597a, null);
            if (this.f24384m) {
                C.u("Main", "completed", abstractC2597a.f24262b.d(), "from " + eVar);
                return;
            }
            return;
        }
        g(abstractC2597a);
        if (this.f24384m) {
            C.t("Main", "resumed", abstractC2597a.f24262b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(AbstractC2597a abstractC2597a) {
        this.f24376e.h(abstractC2597a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v p(v vVar) {
        v a8 = this.f24372a.a(vVar);
        if (a8 != null) {
            return a8;
        }
        throw new IllegalStateException("Request transformer " + this.f24372a.getClass().getCanonicalName() + " returned null for " + vVar);
    }
}
