package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.appcompat.app.f0;
import com.google.firebase.installations.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l2.j;
import l2.l;
import n4.d;
import n4.f;
import v1.n;
import z3.x;

/* loaded from: classes.dex */
public class c implements l4.e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f5777m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f5778n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final w3.e f5779a;

    /* renamed from: b, reason: collision with root package name */
    private final n4.c f5780b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.c f5781c;

    /* renamed from: d, reason: collision with root package name */
    private final i f5782d;

    /* renamed from: e, reason: collision with root package name */
    private final x f5783e;

    /* renamed from: f, reason: collision with root package name */
    private final l4.g f5784f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f5785g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f5786h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f5787i;

    /* renamed from: j, reason: collision with root package name */
    private String f5788j;

    /* renamed from: k, reason: collision with root package name */
    private Set f5789k;

    /* renamed from: l, reason: collision with root package name */
    private final List f5790l;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f5791a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f5791a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5792a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5793b;

        static {
            int[] iArr = new int[f.b.values().length];
            f5793b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5793b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5793b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f5792a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5792a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(ExecutorService executorService, Executor executor, w3.e eVar, n4.c cVar, m4.c cVar2, i iVar, x xVar, l4.g gVar) {
        this.f5785g = new Object();
        this.f5789k = new HashSet();
        this.f5790l = new ArrayList();
        this.f5779a = eVar;
        this.f5780b = cVar;
        this.f5781c = cVar2;
        this.f5782d = iVar;
        this.f5783e = xVar;
        this.f5784f = gVar;
        this.f5786h = executorService;
        this.f5787i = executor;
    }

    private String A(m4.d dVar) {
        if ((!this.f5779a.l().equals("CHIME_ANDROID_SDK") && !this.f5779a.t()) || !dVar.m()) {
            return this.f5784f.a();
        }
        String f6 = p().f();
        return TextUtils.isEmpty(f6) ? this.f5784f.a() : f6;
    }

    private m4.d B(m4.d dVar) {
        n4.d d6 = this.f5780b.d(m(), dVar.d(), t(), n(), (dVar.d() == null || dVar.d().length() != 11) ? null : p().i());
        int i6 = b.f5792a[d6.e().ordinal()];
        if (i6 == 1) {
            return dVar.s(d6.c(), d6.d(), this.f5782d.b(), d6.b().c(), d6.b().d());
        }
        if (i6 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void C(Exception exc) {
        synchronized (this.f5785g) {
            Iterator it = this.f5790l.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).b(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void D(m4.d dVar) {
        synchronized (this.f5785g) {
            Iterator it = this.f5790l.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void E(String str) {
        this.f5788j = str;
    }

    private synchronized void F(m4.d dVar, m4.d dVar2) {
        if (this.f5789k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f5789k.iterator();
            if (it.hasNext()) {
                f0.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    private l2.i g() {
        j jVar = new j();
        i(new e(this.f5782d, jVar));
        return jVar.a();
    }

    private l2.i h() {
        j jVar = new j();
        i(new f(jVar));
        return jVar.a();
    }

    private void i(h hVar) {
        synchronized (this.f5785g) {
            this.f5790l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(boolean r3) {
        /*
            r2 = this;
            m4.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L5c
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L5c
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f5782d     // Catch: com.google.firebase.installations.d -> L5c
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L5c
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            m4.d r3 = r2.l(r0)     // Catch: com.google.firebase.installations.d -> L5c
            goto L26
        L22:
            m4.d r3 = r2.B(r0)     // Catch: com.google.firebase.installations.d -> L5c
        L26:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
        L46:
            r2.C(r3)
            goto L5b
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L58
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L46
        L58:
            r2.D(r3)
        L5b:
            return
        L5c:
            r3 = move-exception
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z5) {
        m4.d s5 = s();
        if (z5) {
            s5 = s5.p();
        }
        D(s5);
        this.f5787i.execute(new Runnable() { // from class: l4.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.v(z5);
            }
        });
    }

    private m4.d l(m4.d dVar) {
        n4.f e6 = this.f5780b.e(m(), dVar.d(), t(), dVar.f());
        int i6 = b.f5793b[e6.b().ordinal()];
        if (i6 == 1) {
            return dVar.o(e6.c(), e6.d(), this.f5782d.b());
        }
        if (i6 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i6 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        E(null);
        return dVar.r();
    }

    private synchronized String o() {
        return this.f5788j;
    }

    private m4.b p() {
        return (m4.b) this.f5783e.get();
    }

    public static c q(w3.e eVar) {
        n.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.i(l4.e.class);
    }

    private m4.d r() {
        m4.d d6;
        synchronized (f5777m) {
            com.google.firebase.installations.b a6 = com.google.firebase.installations.b.a(this.f5779a.j(), "generatefid.lock");
            try {
                d6 = this.f5781c.d();
            } finally {
                if (a6 != null) {
                    a6.b();
                }
            }
        }
        return d6;
    }

    private m4.d s() {
        m4.d d6;
        synchronized (f5777m) {
            com.google.firebase.installations.b a6 = com.google.firebase.installations.b.a(this.f5779a.j(), "generatefid.lock");
            try {
                d6 = this.f5781c.d();
                if (d6.j()) {
                    d6 = this.f5781c.b(d6.t(A(d6)));
                }
            } finally {
                if (a6 != null) {
                    a6.b();
                }
            }
        }
        return d6;
    }

    private void u(m4.d dVar) {
        synchronized (f5777m) {
            com.google.firebase.installations.b a6 = com.google.firebase.installations.b.a(this.f5779a.j(), "generatefid.lock");
            try {
                this.f5781c.b(dVar);
            } finally {
                if (a6 != null) {
                    a6.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m4.b y(w3.e eVar) {
        return new m4.b(eVar);
    }

    private void z() {
        n.e(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.e(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.e(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.b(i.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.b(i.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // l4.e
    public l2.i a() {
        z();
        String o6 = o();
        if (o6 != null) {
            return l.e(o6);
        }
        l2.i h6 = h();
        this.f5786h.execute(new Runnable() { // from class: l4.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.w();
            }
        });
        return h6;
    }

    @Override // l4.e
    public l2.i b(final boolean z5) {
        z();
        l2.i g6 = g();
        this.f5786h.execute(new Runnable() { // from class: l4.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.x(z5);
            }
        });
        return g6;
    }

    String m() {
        return this.f5779a.m().b();
    }

    String n() {
        return this.f5779a.m().c();
    }

    String t() {
        return this.f5779a.m().e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(final w3.e eVar, k4.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new n4.c(eVar.j(), bVar), new m4.c(eVar), i.c(), new x(new k4.b() { // from class: l4.a
            @Override // k4.b
            public final Object get() {
                m4.b y5;
                y5 = com.google.firebase.installations.c.y(w3.e.this);
                return y5;
            }
        }), new l4.g());
    }
}
