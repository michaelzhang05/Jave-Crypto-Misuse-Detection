package com.google.firebase.installations;

import D0.x;
import Q.AbstractC1400p;
import android.text.TextUtils;
import b1.InterfaceC1956b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.d;
import d1.AbstractC2734d;
import d1.C2732b;
import d1.C2733c;
import e1.AbstractC2773d;
import e1.AbstractC2775f;
import e1.C2772c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import q0.AbstractC3828l;
import q0.C3826j;

/* loaded from: classes3.dex */
public class c implements c1.e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f18298m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f18299n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f18300a;

    /* renamed from: b, reason: collision with root package name */
    private final C2772c f18301b;

    /* renamed from: c, reason: collision with root package name */
    private final C2733c f18302c;

    /* renamed from: d, reason: collision with root package name */
    private final i f18303d;

    /* renamed from: e, reason: collision with root package name */
    private final x f18304e;

    /* renamed from: f, reason: collision with root package name */
    private final c1.g f18305f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f18306g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f18307h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f18308i;

    /* renamed from: j, reason: collision with root package name */
    private String f18309j;

    /* renamed from: k, reason: collision with root package name */
    private Set f18310k;

    /* renamed from: l, reason: collision with root package name */
    private final List f18311l;

    /* loaded from: classes3.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f18312a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f18312a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18313a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18314b;

        static {
            int[] iArr = new int[AbstractC2775f.b.values().length];
            f18314b = iArr;
            try {
                iArr[AbstractC2775f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18314b[AbstractC2775f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18314b[AbstractC2775f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC2773d.b.values().length];
            f18313a = iArr2;
            try {
                iArr2[AbstractC2773d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18313a[AbstractC2773d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(final A0.f fVar, InterfaceC1956b interfaceC1956b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new C2772c(fVar.k(), interfaceC1956b), new C2733c(fVar), i.c(), new x(new InterfaceC1956b() { // from class: c1.a
            @Override // b1.InterfaceC1956b
            public final Object get() {
                C2732b y8;
                y8 = com.google.firebase.installations.c.y(A0.f.this);
                return y8;
            }
        }), new c1.g());
    }

    private String A(AbstractC2734d abstractC2734d) {
        if ((!this.f18300a.m().equals("CHIME_ANDROID_SDK") && !this.f18300a.u()) || !abstractC2734d.m()) {
            return this.f18305f.a();
        }
        String f8 = o().f();
        if (TextUtils.isEmpty(f8)) {
            return this.f18305f.a();
        }
        return f8;
    }

    private AbstractC2734d B(AbstractC2734d abstractC2734d) {
        String str;
        if (abstractC2734d.d() != null && abstractC2734d.d().length() == 11) {
            str = o().i();
        } else {
            str = null;
        }
        AbstractC2773d d8 = this.f18301b.d(l(), abstractC2734d.d(), t(), m(), str);
        int i8 = b.f18313a[d8.e().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return abstractC2734d.q("BAD CONFIG");
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        return abstractC2734d.s(d8.c(), d8.d(), this.f18303d.b(), d8.b().c(), d8.b().d());
    }

    private void C(Exception exc) {
        synchronized (this.f18306g) {
            try {
                Iterator it = this.f18311l.iterator();
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

    private void D(AbstractC2734d abstractC2734d) {
        synchronized (this.f18306g) {
            try {
                Iterator it = this.f18311l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(abstractC2734d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E(String str) {
        this.f18309j = str;
    }

    private synchronized void F(AbstractC2734d abstractC2734d, AbstractC2734d abstractC2734d2) {
        if (this.f18310k.size() != 0 && !TextUtils.equals(abstractC2734d.d(), abstractC2734d2.d())) {
            Iterator it = this.f18310k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                abstractC2734d2.d();
                throw null;
            }
        }
    }

    private Task f() {
        C3826j c3826j = new C3826j();
        h(new e(this.f18303d, c3826j));
        return c3826j.a();
    }

    private Task g() {
        C3826j c3826j = new C3826j();
        h(new f(c3826j));
        return c3826j.a();
    }

    private void h(h hVar) {
        synchronized (this.f18306g) {
            this.f18311l.add(hVar);
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
            d1.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.i r3 = r2.f18303d     // Catch: com.google.firebase.installations.d -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            d1.d r3 = r2.k(r0)     // Catch: com.google.firebase.installations.d -> L1d
            goto L28
        L24:
            d1.d r3 = r2.B(r0)     // Catch: com.google.firebase.installations.d -> L1d
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
        AbstractC2734d s8 = s();
        if (z8) {
            s8 = s8.p();
        }
        D(s8);
        this.f18308i.execute(new Runnable() { // from class: c1.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.v(z8);
            }
        });
    }

    private AbstractC2734d k(AbstractC2734d abstractC2734d) {
        AbstractC2775f e8 = this.f18301b.e(l(), abstractC2734d.d(), t(), abstractC2734d.f());
        int i8 = b.f18314b[e8.b().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    E(null);
                    return abstractC2734d.r();
                }
                throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
            }
            return abstractC2734d.q("BAD CONFIG");
        }
        return abstractC2734d.o(e8.c(), e8.d(), this.f18303d.b());
    }

    private synchronized String n() {
        return this.f18309j;
    }

    private C2732b o() {
        return (C2732b) this.f18304e.get();
    }

    public static c p() {
        return q(A0.f.l());
    }

    public static c q(A0.f fVar) {
        boolean z8;
        if (fVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1400p.b(z8, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(c1.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC2734d r() {
        AbstractC2734d d8;
        synchronized (f18298m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f18300a.k(), "generatefid.lock");
                try {
                    d8 = this.f18302c.d();
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
    private AbstractC2734d s() {
        AbstractC2734d d8;
        synchronized (f18298m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f18300a.k(), "generatefid.lock");
                try {
                    d8 = this.f18302c.d();
                    if (d8.j()) {
                        d8 = this.f18302c.b(d8.t(A(d8)));
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
    private void u(AbstractC2734d abstractC2734d) {
        synchronized (f18298m) {
            try {
                com.google.firebase.installations.b a8 = com.google.firebase.installations.b.a(this.f18300a.k(), "generatefid.lock");
                try {
                    this.f18302c.b(abstractC2734d);
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
    public static /* synthetic */ C2732b y(A0.f fVar) {
        return new C2732b(fVar);
    }

    private void z() {
        AbstractC1400p.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1400p.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1400p.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1400p.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1400p.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // c1.e
    public Task a(final boolean z8) {
        z();
        Task f8 = f();
        this.f18307h.execute(new Runnable() { // from class: c1.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.x(z8);
            }
        });
        return f8;
    }

    @Override // c1.e
    public Task getId() {
        z();
        String n8 = n();
        if (n8 != null) {
            return AbstractC3828l.e(n8);
        }
        Task g8 = g();
        this.f18307h.execute(new Runnable() { // from class: c1.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.w();
            }
        });
        return g8;
    }

    String l() {
        return this.f18300a.n().b();
    }

    String m() {
        return this.f18300a.n().c();
    }

    String t() {
        return this.f18300a.n().e();
    }

    c(ExecutorService executorService, Executor executor, A0.f fVar, C2772c c2772c, C2733c c2733c, i iVar, x xVar, c1.g gVar) {
        this.f18306g = new Object();
        this.f18310k = new HashSet();
        this.f18311l = new ArrayList();
        this.f18300a = fVar;
        this.f18301b = c2772c;
        this.f18302c = c2733c;
        this.f18303d = iVar;
        this.f18304e = xVar;
        this.f18305f = gVar;
        this.f18307h = executorService;
        this.f18308i = executor;
    }
}
