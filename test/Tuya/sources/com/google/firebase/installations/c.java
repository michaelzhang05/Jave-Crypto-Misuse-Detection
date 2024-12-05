package com.google.firebase.installations;

import B0.x;
import R.AbstractC1319p;
import a1.InterfaceC1554e;
import android.text.TextUtils;
import b1.AbstractC1854d;
import b1.C1852b;
import b1.C1853c;
import c1.AbstractC1905d;
import c1.C1904c;
import c1.f;
import com.google.android.gms.tasks.Task;
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
import r0.C3679j;
import r0.l;

/* loaded from: classes3.dex */
public class c implements InterfaceC1554e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f17264m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f17265n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final y0.e f17266a;

    /* renamed from: b, reason: collision with root package name */
    private final C1904c f17267b;

    /* renamed from: c, reason: collision with root package name */
    private final C1853c f17268c;

    /* renamed from: d, reason: collision with root package name */
    private final i f17269d;

    /* renamed from: e, reason: collision with root package name */
    private final x f17270e;

    /* renamed from: f, reason: collision with root package name */
    private final a1.g f17271f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f17272g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f17273h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f17274i;

    /* renamed from: j, reason: collision with root package name */
    private String f17275j;

    /* renamed from: k, reason: collision with root package name */
    private Set f17276k;

    /* renamed from: l, reason: collision with root package name */
    private final List f17277l;

    /* loaded from: classes3.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f17278a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f17278a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17279a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17280b;

        static {
            int[] iArr = new int[f.b.values().length];
            f17280b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17280b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17280b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC1905d.b.values().length];
            f17279a = iArr2;
            try {
                iArr2[AbstractC1905d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17279a[AbstractC1905d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(final y0.e eVar, Z0.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new C1904c(eVar.k(), bVar), new C1853c(eVar), i.c(), new x(new Z0.b() { // from class: a1.a
            @Override // Z0.b
            public final Object get() {
                C1852b y8;
                y8 = com.google.firebase.installations.c.y(y0.e.this);
                return y8;
            }
        }), new a1.g());
    }

    private String A(AbstractC1854d abstractC1854d) {
        if ((!this.f17266a.m().equals("CHIME_ANDROID_SDK") && !this.f17266a.u()) || !abstractC1854d.m()) {
            return this.f17271f.a();
        }
        String f8 = o().f();
        if (TextUtils.isEmpty(f8)) {
            return this.f17271f.a();
        }
        return f8;
    }

    private AbstractC1854d B(AbstractC1854d abstractC1854d) {
        String str;
        if (abstractC1854d.d() != null && abstractC1854d.d().length() == 11) {
            str = o().i();
        } else {
            str = null;
        }
        AbstractC1905d d8 = this.f17267b.d(l(), abstractC1854d.d(), t(), m(), str);
        int i8 = b.f17279a[d8.e().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return abstractC1854d.q("BAD CONFIG");
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        return abstractC1854d.s(d8.c(), d8.d(), this.f17269d.b(), d8.b().c(), d8.b().d());
    }

    private void C(Exception exc) {
        synchronized (this.f17272g) {
            try {
                Iterator it = this.f17277l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void D(AbstractC1854d abstractC1854d) {
        synchronized (this.f17272g) {
            try {
                Iterator it = this.f17277l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(abstractC1854d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E(String str) {
        this.f17275j = str;
    }

    private synchronized void F(AbstractC1854d abstractC1854d, AbstractC1854d abstractC1854d2) {
        if (this.f17276k.size() != 0 && !TextUtils.equals(abstractC1854d.d(), abstractC1854d2.d())) {
            Iterator it = this.f17276k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                abstractC1854d2.d();
                throw null;
            }
        }
    }

    private Task f() {
        C3679j c3679j = new C3679j();
        h(new e(this.f17269d, c3679j));
        return c3679j.a();
    }

    private Task g() {
        C3679j c3679j = new C3679j();
        h(new f(c3679j));
        return c3679j.a();
    }

    private void h(h hVar) {
        synchronized (this.f17272g) {
            this.f17277l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(boolean r3) {
        /*
            r2 = this;
            b1.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.i r3 = r2.f17269d     // Catch: com.google.firebase.installations.d -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            b1.d r3 = r2.k(r0)     // Catch: com.google.firebase.installations.d -> L1d
            goto L28
        L24:
            b1.d r3 = r2.B(r0)     // Catch: com.google.firebase.installations.d -> L1d
        L28:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L5d:
            r2.D(r3)
        L60:
            return
        L61:
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z8) {
        AbstractC1854d s8 = s();
        if (z8) {
            s8 = s8.p();
        }
        D(s8);
        this.f17274i.execute(new Runnable() { // from class: a1.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.v(z8);
            }
        });
    }

    private AbstractC1854d k(AbstractC1854d abstractC1854d) {
        c1.f e8 = this.f17267b.e(l(), abstractC1854d.d(), t(), abstractC1854d.f());
        int i8 = b.f17280b[e8.b().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    E(null);
                    return abstractC1854d.r();
                }
                throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
            }
            return abstractC1854d.q("BAD CONFIG");
        }
        return abstractC1854d.o(e8.c(), e8.d(), this.f17269d.b());
    }

    private synchronized String n() {
        return this.f17275j;
    }

    private C1852b o() {
        return (C1852b) this.f17270e.get();
    }

    public static c p() {
        return q(y0.e.l());
    }

    public static c q(y0.e eVar) {
        boolean z8;
        if (eVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.b(z8, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.j(InterfaceC1554e.class);
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC1854d r() {
        AbstractC1854d d8;
        synchronized (f17264m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f17266a.k(), "generatefid.lock");
                try {
                    d8 = this.f17268c.d();
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC1854d s() {
        AbstractC1854d d8;
        synchronized (f17264m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f17266a.k(), "generatefid.lock");
                try {
                    d8 = this.f17268c.d();
                    if (d8.j()) {
                        d8 = this.f17268c.b(d8.t(A(d8)));
                    }
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private void u(AbstractC1854d abstractC1854d) {
        synchronized (f17264m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f17266a.k(), "generatefid.lock");
                try {
                    this.f17268c.b(abstractC1854d);
                    if (a8 != null) {
                        a8.b();
                    }
                } catch (Throwable th) {
                    if (a8 != null) {
                        a8.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1852b y(y0.e eVar) {
        return new C1852b(eVar);
    }

    private void z() {
        AbstractC1319p.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1319p.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1319p.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1319p.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1319p.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // a1.InterfaceC1554e
    public Task a(final boolean z8) {
        z();
        Task f8 = f();
        this.f17273h.execute(new Runnable() { // from class: a1.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.x(z8);
            }
        });
        return f8;
    }

    @Override // a1.InterfaceC1554e
    public Task getId() {
        z();
        String n8 = n();
        if (n8 != null) {
            return l.e(n8);
        }
        Task g8 = g();
        this.f17273h.execute(new Runnable() { // from class: a1.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.w();
            }
        });
        return g8;
    }

    String l() {
        return this.f17266a.n().b();
    }

    String m() {
        return this.f17266a.n().c();
    }

    String t() {
        return this.f17266a.n().e();
    }

    c(ExecutorService executorService, Executor executor, y0.e eVar, C1904c c1904c, C1853c c1853c, i iVar, x xVar, a1.g gVar) {
        this.f17272g = new Object();
        this.f17276k = new HashSet();
        this.f17277l = new ArrayList();
        this.f17266a = eVar;
        this.f17267b = c1904c;
        this.f17268c = c1853c;
        this.f17269d = iVar;
        this.f17270e = xVar;
        this.f17271f = gVar;
        this.f17273h = executorService;
        this.f17274i = executor;
    }
}
