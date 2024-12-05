package Q;

import N.C1331b;
import N.C1333d;
import N.C1337h;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Q.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1387c {

    /* renamed from: A, reason: collision with root package name */
    private boolean f8946A;

    /* renamed from: B, reason: collision with root package name */
    private volatile h0 f8947B;

    /* renamed from: C, reason: collision with root package name */
    protected AtomicInteger f8948C;

    /* renamed from: a, reason: collision with root package name */
    private int f8949a;

    /* renamed from: b, reason: collision with root package name */
    private long f8950b;

    /* renamed from: c, reason: collision with root package name */
    private long f8951c;

    /* renamed from: d, reason: collision with root package name */
    private int f8952d;

    /* renamed from: e, reason: collision with root package name */
    private long f8953e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f8954f;

    /* renamed from: g, reason: collision with root package name */
    s0 f8955g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f8956h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f8957i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC1392h f8958j;

    /* renamed from: k, reason: collision with root package name */
    private final C1337h f8959k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f8960l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f8961m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f8962n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1396l f8963o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0179c f8964p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f8965q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f8966r;

    /* renamed from: s, reason: collision with root package name */
    private e0 f8967s;

    /* renamed from: t, reason: collision with root package name */
    private int f8968t;

    /* renamed from: u, reason: collision with root package name */
    private final a f8969u;

    /* renamed from: v, reason: collision with root package name */
    private final b f8970v;

    /* renamed from: w, reason: collision with root package name */
    private final int f8971w;

    /* renamed from: x, reason: collision with root package name */
    private final String f8972x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f8973y;

    /* renamed from: z, reason: collision with root package name */
    private C1331b f8974z;

    /* renamed from: E, reason: collision with root package name */
    private static final C1333d[] f8945E = new C1333d[0];

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f8944D = {"service_esmobile", "service_googleme"};

    /* renamed from: Q.c$a */
    /* loaded from: classes3.dex */
    public interface a {
        void h(int i8);

        void k(Bundle bundle);
    }

    /* renamed from: Q.c$b */
    /* loaded from: classes3.dex */
    public interface b {
        void i(C1331b c1331b);
    }

    /* renamed from: Q.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0179c {
        void b(C1331b c1331b);
    }

    /* renamed from: Q.c$d */
    /* loaded from: classes3.dex */
    protected class d implements InterfaceC0179c {
        public d() {
        }

        @Override // Q.AbstractC1387c.InterfaceC0179c
        public final void b(C1331b c1331b) {
            if (c1331b.z()) {
                AbstractC1387c abstractC1387c = AbstractC1387c.this;
                abstractC1387c.m(null, abstractC1387c.C());
            } else if (AbstractC1387c.this.f8970v != null) {
                AbstractC1387c.this.f8970v.i(c1331b);
            }
        }
    }

    /* renamed from: Q.c$e */
    /* loaded from: classes3.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1387c(android.content.Context r10, android.os.Looper r11, int r12, Q.AbstractC1387c.a r13, Q.AbstractC1387c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            Q.h r3 = Q.AbstractC1392h.a(r10)
            N.h r4 = N.C1337h.f()
            Q.AbstractC1400p.l(r13)
            Q.AbstractC1400p.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.AbstractC1387c.<init>(android.content.Context, android.os.Looper, int, Q.c$a, Q.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c0(AbstractC1387c abstractC1387c, h0 h0Var) {
        r H8;
        abstractC1387c.f8947B = h0Var;
        if (abstractC1387c.S()) {
            C1389e c1389e = h0Var.f9034d;
            C1401q b8 = C1401q.b();
            if (c1389e == null) {
                H8 = null;
            } else {
                H8 = c1389e.H();
            }
            b8.c(H8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d0(AbstractC1387c abstractC1387c, int i8) {
        int i9;
        int i10;
        synchronized (abstractC1387c.f8961m) {
            i9 = abstractC1387c.f8968t;
        }
        if (i9 == 3) {
            abstractC1387c.f8946A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        Handler handler = abstractC1387c.f8960l;
        handler.sendMessage(handler.obtainMessage(i10, abstractC1387c.f8948C.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean g0(AbstractC1387c abstractC1387c, int i8, int i9, IInterface iInterface) {
        synchronized (abstractC1387c.f8961m) {
            try {
                if (abstractC1387c.f8968t != i8) {
                    return false;
                }
                abstractC1387c.i0(i9, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:945)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean h0(Q.AbstractC1387c r2) {
        /*
            boolean r0 = r2.f8946A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.E()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.AbstractC1387c.h0(Q.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i8, IInterface iInterface) {
        boolean z8;
        boolean z9;
        s0 s0Var;
        s0 s0Var2;
        boolean z10 = false;
        if (i8 != 4) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (iInterface == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z8 == z9) {
            z10 = true;
        }
        AbstractC1400p.a(z10);
        synchronized (this.f8961m) {
            try {
                this.f8968t = i8;
                this.f8965q = iInterface;
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        if (i8 == 4) {
                            AbstractC1400p.l(iInterface);
                            K(iInterface);
                        }
                    } else {
                        e0 e0Var = this.f8967s;
                        if (e0Var != null && (s0Var2 = this.f8955g) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + s0Var2.b() + " on " + s0Var2.a());
                            AbstractC1392h abstractC1392h = this.f8958j;
                            String b8 = this.f8955g.b();
                            AbstractC1400p.l(b8);
                            abstractC1392h.d(b8, this.f8955g.a(), 4225, e0Var, X(), this.f8955g.c());
                            this.f8948C.incrementAndGet();
                        }
                        e0 e0Var2 = new e0(this, this.f8948C.get());
                        this.f8967s = e0Var2;
                        if (this.f8968t == 3 && B() != null) {
                            s0Var = new s0(y().getPackageName(), B(), true, 4225, false);
                        } else {
                            s0Var = new s0(G(), F(), false, 4225, I());
                        }
                        this.f8955g = s0Var;
                        if (s0Var.c() && k() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f8955g.b())));
                        }
                        AbstractC1392h abstractC1392h2 = this.f8958j;
                        String b9 = this.f8955g.b();
                        AbstractC1400p.l(b9);
                        if (!abstractC1392h2.e(new l0(b9, this.f8955g.a(), 4225, this.f8955g.c()), e0Var2, X(), w())) {
                            Log.w("GmsClient", "unable to connect to service: " + this.f8955g.b() + " on " + this.f8955g.a());
                            e0(16, null, this.f8948C.get());
                        }
                    }
                } else {
                    e0 e0Var3 = this.f8967s;
                    if (e0Var3 != null) {
                        AbstractC1392h abstractC1392h3 = this.f8958j;
                        String b10 = this.f8955g.b();
                        AbstractC1400p.l(b10);
                        abstractC1392h3.d(b10, this.f8955g.a(), 4225, e0Var3, X(), this.f8955g.c());
                        this.f8967s = null;
                    }
                }
            } finally {
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set C() {
        return Collections.emptySet();
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.f8961m) {
            try {
                if (this.f8968t != 5) {
                    r();
                    iInterface = this.f8965q;
                    AbstractC1400p.m(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public C1389e H() {
        h0 h0Var = this.f8947B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f9034d;
    }

    protected boolean I() {
        if (k() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean J() {
        if (this.f8947B != null) {
            return true;
        }
        return false;
    }

    protected void K(IInterface iInterface) {
        this.f8951c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(C1331b c1331b) {
        this.f8952d = c1331b.p();
        this.f8953e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(int i8) {
        this.f8949a = i8;
        this.f8950b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N(int i8, IBinder iBinder, Bundle bundle, int i9) {
        this.f8960l.sendMessage(this.f8960l.obtainMessage(1, i9, -1, new f0(this, i8, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f8973y = str;
    }

    public void Q(int i8) {
        this.f8960l.sendMessage(this.f8960l.obtainMessage(6, this.f8948C.get(), i8));
    }

    protected void R(InterfaceC0179c interfaceC0179c, int i8, PendingIntent pendingIntent) {
        AbstractC1400p.m(interfaceC0179c, "Connection progress callbacks cannot be null.");
        this.f8964p = interfaceC0179c;
        this.f8960l.sendMessage(this.f8960l.obtainMessage(3, this.f8948C.get(), i8, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.f8972x;
        if (str == null) {
            return this.f8956h.getClass().getName();
        }
        return str;
    }

    public void b() {
        this.f8948C.incrementAndGet();
        synchronized (this.f8966r) {
            try {
                int size = this.f8966r.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((c0) this.f8966r.get(i8)).d();
                }
                this.f8966r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f8962n) {
            this.f8963o = null;
        }
        i0(1, null);
    }

    public void d(String str) {
        this.f8954f = str;
        b();
    }

    public void e(e eVar) {
        eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e0(int i8, Bundle bundle, int i9) {
        this.f8960l.sendMessage(this.f8960l.obtainMessage(7, i9, -1, new g0(this, i8, null)));
    }

    public boolean f() {
        boolean z8;
        synchronized (this.f8961m) {
            int i8 = this.f8968t;
            z8 = true;
            if (i8 != 2 && i8 != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    public String g() {
        s0 s0Var;
        if (h() && (s0Var = this.f8955g) != null) {
            return s0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public boolean h() {
        boolean z8;
        synchronized (this.f8961m) {
            if (this.f8968t == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public boolean i() {
        return true;
    }

    public void j(InterfaceC0179c interfaceC0179c) {
        AbstractC1400p.m(interfaceC0179c, "Connection progress callbacks cannot be null.");
        this.f8964p = interfaceC0179c;
        i0(2, null);
    }

    public abstract int k();

    public final C1333d[] l() {
        h0 h0Var = this.f8947B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f9032b;
    }

    public void m(InterfaceC1394j interfaceC1394j, Set set) {
        Bundle A8 = A();
        String str = this.f8973y;
        int i8 = C1337h.f7467a;
        Scope[] scopeArr = C1390f.f9004o;
        Bundle bundle = new Bundle();
        int i9 = this.f8971w;
        C1333d[] c1333dArr = C1390f.f9005p;
        C1390f c1390f = new C1390f(6, i9, i8, null, null, scopeArr, bundle, null, c1333dArr, c1333dArr, true, 0, false, str);
        c1390f.f9009d = this.f8956h.getPackageName();
        c1390f.f9012g = A8;
        if (set != null) {
            c1390f.f9011f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account u8 = u();
            if (u8 == null) {
                u8 = new Account("<<default account>>", "com.google");
            }
            c1390f.f9013h = u8;
            if (interfaceC1394j != null) {
                c1390f.f9010e = interfaceC1394j.asBinder();
            }
        } else if (O()) {
            c1390f.f9013h = u();
        }
        c1390f.f9014i = f8945E;
        c1390f.f9015j = v();
        if (S()) {
            c1390f.f9018m = true;
        }
        try {
            synchronized (this.f8962n) {
                try {
                    InterfaceC1396l interfaceC1396l = this.f8963o;
                    if (interfaceC1396l != null) {
                        interfaceC1396l.e0(new d0(this, this.f8948C.get()), c1390f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            Q(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f8948C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f8948C.get());
        }
    }

    public String n() {
        return this.f8954f;
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int h8 = this.f8959k.h(this.f8956h, k());
        if (h8 != 0) {
            i0(1, null);
            R(new d(), h8, null);
        } else {
            j(new d());
        }
    }

    protected final void r() {
        if (h()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface s(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C1333d[] v() {
        return f8945E;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f8956h;
    }

    public int z() {
        return this.f8971w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1387c(Context context, Looper looper, AbstractC1392h abstractC1392h, C1337h c1337h, int i8, a aVar, b bVar, String str) {
        this.f8954f = null;
        this.f8961m = new Object();
        this.f8962n = new Object();
        this.f8966r = new ArrayList();
        this.f8968t = 1;
        this.f8974z = null;
        this.f8946A = false;
        this.f8947B = null;
        this.f8948C = new AtomicInteger(0);
        AbstractC1400p.m(context, "Context must not be null");
        this.f8956h = context;
        AbstractC1400p.m(looper, "Looper must not be null");
        this.f8957i = looper;
        AbstractC1400p.m(abstractC1392h, "Supervisor must not be null");
        this.f8958j = abstractC1392h;
        AbstractC1400p.m(c1337h, "API availability must not be null");
        this.f8959k = c1337h;
        this.f8960l = new b0(this, looper);
        this.f8971w = i8;
        this.f8969u = aVar;
        this.f8970v = bVar;
        this.f8972x = str;
    }
}
