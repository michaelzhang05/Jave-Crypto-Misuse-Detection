package v1;

import android.accounts.Account;
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
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private int f9507a;

    /* renamed from: b, reason: collision with root package name */
    private long f9508b;

    /* renamed from: c, reason: collision with root package name */
    private long f9509c;

    /* renamed from: d, reason: collision with root package name */
    private int f9510d;

    /* renamed from: e, reason: collision with root package name */
    private long f9511e;

    /* renamed from: g, reason: collision with root package name */
    i1 f9513g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f9514h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f9515i;

    /* renamed from: j, reason: collision with root package name */
    private final h f9516j;

    /* renamed from: k, reason: collision with root package name */
    private final s1.g f9517k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f9518l;

    /* renamed from: o, reason: collision with root package name */
    private k f9521o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0144c f9522p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f9523q;

    /* renamed from: s, reason: collision with root package name */
    private t0 f9525s;

    /* renamed from: u, reason: collision with root package name */
    private final a f9527u;

    /* renamed from: v, reason: collision with root package name */
    private final b f9528v;

    /* renamed from: w, reason: collision with root package name */
    private final int f9529w;

    /* renamed from: x, reason: collision with root package name */
    private final String f9530x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f9531y;
    private static final s1.c[] E = new s1.c[0];
    public static final String[] D = {"service_esmobile", "service_googleme"};

    /* renamed from: f, reason: collision with root package name */
    private volatile String f9512f = null;

    /* renamed from: m, reason: collision with root package name */
    private final Object f9519m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private final Object f9520n = new Object();

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f9524r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private int f9526t = 1;

    /* renamed from: z, reason: collision with root package name */
    private s1.a f9532z = null;
    private boolean A = false;
    private volatile w0 B = null;
    protected AtomicInteger C = new AtomicInteger(0);

    /* loaded from: classes.dex */
    public interface a {
        void b(int i6);

        void c(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(s1.a aVar);
    }

    /* renamed from: v1.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0144c {
        void b(s1.a aVar);
    }

    /* loaded from: classes.dex */
    protected class d implements InterfaceC0144c {
        public d() {
        }

        @Override // v1.c.InterfaceC0144c
        public final void b(s1.a aVar) {
            if (aVar.e()) {
                c cVar = c.this;
                cVar.n(null, cVar.B());
            } else if (c.this.f9528v != null) {
                c.this.f9528v.a(aVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, Looper looper, h hVar, s1.g gVar, int i6, a aVar, b bVar, String str) {
        n.i(context, "Context must not be null");
        this.f9514h = context;
        n.i(looper, "Looper must not be null");
        this.f9515i = looper;
        n.i(hVar, "Supervisor must not be null");
        this.f9516j = hVar;
        n.i(gVar, "API availability must not be null");
        this.f9517k = gVar;
        this.f9518l = new q0(this, looper);
        this.f9529w = i6;
        this.f9527u = aVar;
        this.f9528v = bVar;
        this.f9530x = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a0(c cVar, w0 w0Var) {
        cVar.B = w0Var;
        if (cVar.Q()) {
            v1.e eVar = w0Var.f9658d;
            o.b().c(eVar == null ? null : eVar.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void b0(c cVar, int i6) {
        int i7;
        int i8;
        synchronized (cVar.f9519m) {
            i7 = cVar.f9526t;
        }
        if (i7 == 3) {
            cVar.A = true;
            i8 = 5;
        } else {
            i8 = 4;
        }
        Handler handler = cVar.f9518l;
        handler.sendMessage(handler.obtainMessage(i8, cVar.C.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean e0(c cVar, int i6, int i7, IInterface iInterface) {
        synchronized (cVar.f9519m) {
            if (cVar.f9526t != i6) {
                return false;
            }
            cVar.g0(i7, iInterface);
            return true;
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
    static /* bridge */ /* synthetic */ boolean f0(v1.c r2) {
        /*
            boolean r0 = r2.A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.D()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.c.f0(v1.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(int i6, IInterface iInterface) {
        i1 i1Var;
        n.a((i6 == 4) == (iInterface != null));
        synchronized (this.f9519m) {
            this.f9526t = i6;
            this.f9523q = iInterface;
            if (i6 == 1) {
                t0 t0Var = this.f9525s;
                if (t0Var != null) {
                    h hVar = this.f9516j;
                    String c6 = this.f9513g.c();
                    n.h(c6);
                    hVar.e(c6, this.f9513g.b(), this.f9513g.a(), t0Var, V(), this.f9513g.d());
                    this.f9525s = null;
                }
            } else if (i6 == 2 || i6 == 3) {
                t0 t0Var2 = this.f9525s;
                if (t0Var2 != null && (i1Var = this.f9513g) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + i1Var.c() + " on " + i1Var.b());
                    h hVar2 = this.f9516j;
                    String c7 = this.f9513g.c();
                    n.h(c7);
                    hVar2.e(c7, this.f9513g.b(), this.f9513g.a(), t0Var2, V(), this.f9513g.d());
                    this.C.incrementAndGet();
                }
                t0 t0Var3 = new t0(this, this.C.get());
                this.f9525s = t0Var3;
                i1 i1Var2 = (this.f9526t != 3 || A() == null) ? new i1(F(), E(), false, h.a(), H()) : new i1(x().getPackageName(), A(), true, h.a(), false);
                this.f9513g = i1Var2;
                if (i1Var2.d() && p() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f9513g.c())));
                }
                h hVar3 = this.f9516j;
                String c8 = this.f9513g.c();
                n.h(c8);
                if (!hVar3.f(new a1(c8, this.f9513g.b(), this.f9513g.a(), this.f9513g.d()), t0Var3, V(), v())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f9513g.c() + " on " + this.f9513g.b());
                    c0(16, null, this.C.get());
                }
            } else if (i6 == 4) {
                n.h(iInterface);
                J(iInterface);
            }
        }
    }

    protected String A() {
        return null;
    }

    protected abstract Set B();

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f9519m) {
            if (this.f9526t == 5) {
                throw new DeadObjectException();
            }
            q();
            iInterface = this.f9523q;
            n.i(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String D();

    protected abstract String E();

    protected String F() {
        return "com.google.android.gms";
    }

    public v1.e G() {
        w0 w0Var = this.B;
        if (w0Var == null) {
            return null;
        }
        return w0Var.f9658d;
    }

    protected boolean H() {
        return p() >= 211700000;
    }

    public boolean I() {
        return this.B != null;
    }

    protected void J(IInterface iInterface) {
        this.f9509c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(s1.a aVar) {
        this.f9510d = aVar.a();
        this.f9511e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(int i6) {
        this.f9507a = i6;
        this.f9508b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(int i6, IBinder iBinder, Bundle bundle, int i7) {
        Handler handler = this.f9518l;
        handler.sendMessage(handler.obtainMessage(1, i7, -1, new u0(this, i6, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f9531y = str;
    }

    public void P(int i6) {
        Handler handler = this.f9518l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i6));
    }

    public boolean Q() {
        return false;
    }

    protected final String V() {
        String str = this.f9530x;
        return str == null ? this.f9514h.getClass().getName() : str;
    }

    public boolean a() {
        boolean z5;
        synchronized (this.f9519m) {
            int i6 = this.f9526t;
            z5 = true;
            if (i6 != 2 && i6 != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    public final s1.c[] b() {
        w0 w0Var = this.B;
        if (w0Var == null) {
            return null;
        }
        return w0Var.f9656b;
    }

    public boolean c() {
        boolean z5;
        synchronized (this.f9519m) {
            z5 = this.f9526t == 4;
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c0(int i6, Bundle bundle, int i7) {
        Handler handler = this.f9518l;
        handler.sendMessage(handler.obtainMessage(7, i7, -1, new v0(this, i6, null)));
    }

    public String d() {
        i1 i1Var;
        if (!c() || (i1Var = this.f9513g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return i1Var.b();
    }

    public void e(InterfaceC0144c interfaceC0144c) {
        n.i(interfaceC0144c, "Connection progress callbacks cannot be null.");
        this.f9522p = interfaceC0144c;
        g0(2, null);
    }

    public String f() {
        return this.f9512f;
    }

    public void h() {
        this.C.incrementAndGet();
        synchronized (this.f9524r) {
            int size = this.f9524r.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((r0) this.f9524r.get(i6)).d();
            }
            this.f9524r.clear();
        }
        synchronized (this.f9520n) {
            this.f9521o = null;
        }
        g0(1, null);
    }

    public void i(String str) {
        this.f9512f = str;
        h();
    }

    public boolean j() {
        return false;
    }

    public boolean m() {
        return true;
    }

    public void n(i iVar, Set set) {
        Bundle z5 = z();
        int i6 = this.f9529w;
        String str = this.f9531y;
        int i7 = s1.g.f9221a;
        Scope[] scopeArr = f.f9567o;
        Bundle bundle = new Bundle();
        s1.c[] cVarArr = f.f9568p;
        f fVar = new f(6, i6, i7, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.f9572d = this.f9514h.getPackageName();
        fVar.f9575g = z5;
        if (set != null) {
            fVar.f9574f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            Account t5 = t();
            if (t5 == null) {
                t5 = new Account("<<default account>>", "com.google");
            }
            fVar.f9576h = t5;
            if (iVar != null) {
                fVar.f9573e = iVar.asBinder();
            }
        } else if (N()) {
            fVar.f9576h = t();
        }
        fVar.f9577i = E;
        fVar.f9578j = u();
        if (Q()) {
            fVar.f9581m = true;
        }
        try {
            synchronized (this.f9520n) {
                k kVar = this.f9521o;
                if (kVar != null) {
                    kVar.t(new s0(this, this.C.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            P(3);
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.C.get());
        } catch (SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.C.get());
        }
    }

    public void o(e eVar) {
        eVar.a();
    }

    public abstract int p();

    protected final void q() {
        if (!c()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface r(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s() {
        return false;
    }

    public abstract Account t();

    public s1.c[] u() {
        return E;
    }

    protected abstract Executor v();

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f9514h;
    }

    public int y() {
        return this.f9529w;
    }

    protected abstract Bundle z();
}
