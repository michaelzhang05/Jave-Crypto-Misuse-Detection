package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.h1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.m, androidx.lifecycle.j0, androidx.lifecycle.g, i0.d {

    /* renamed from: b0, reason: collision with root package name */
    static final Object f2651b0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean G;
    ViewGroup H;
    View I;
    boolean J;
    i L;
    boolean N;
    LayoutInflater O;
    boolean P;
    public String Q;
    androidx.lifecycle.n S;
    i0 T;
    f0.b V;
    i0.c W;
    private int X;

    /* renamed from: b, reason: collision with root package name */
    Bundle f2654b;

    /* renamed from: c, reason: collision with root package name */
    SparseArray f2655c;

    /* renamed from: d, reason: collision with root package name */
    Bundle f2656d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f2657e;

    /* renamed from: g, reason: collision with root package name */
    Bundle f2659g;

    /* renamed from: h, reason: collision with root package name */
    Fragment f2660h;

    /* renamed from: j, reason: collision with root package name */
    int f2662j;

    /* renamed from: l, reason: collision with root package name */
    boolean f2664l;

    /* renamed from: m, reason: collision with root package name */
    boolean f2665m;

    /* renamed from: n, reason: collision with root package name */
    boolean f2666n;

    /* renamed from: o, reason: collision with root package name */
    boolean f2667o;

    /* renamed from: p, reason: collision with root package name */
    boolean f2668p;

    /* renamed from: q, reason: collision with root package name */
    boolean f2669q;

    /* renamed from: r, reason: collision with root package name */
    boolean f2670r;

    /* renamed from: s, reason: collision with root package name */
    int f2671s;

    /* renamed from: t, reason: collision with root package name */
    w f2672t;

    /* renamed from: u, reason: collision with root package name */
    o f2673u;

    /* renamed from: w, reason: collision with root package name */
    Fragment f2675w;

    /* renamed from: x, reason: collision with root package name */
    int f2676x;

    /* renamed from: y, reason: collision with root package name */
    int f2677y;

    /* renamed from: z, reason: collision with root package name */
    String f2678z;

    /* renamed from: a, reason: collision with root package name */
    int f2652a = -1;

    /* renamed from: f, reason: collision with root package name */
    String f2658f = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    String f2661i = null;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f2663k = null;

    /* renamed from: v, reason: collision with root package name */
    w f2674v = new x();
    boolean F = true;
    boolean K = true;
    Runnable M = new b();
    h.b R = h.b.RESUMED;
    androidx.lifecycle.q U = new androidx.lifecycle.q();
    private final AtomicInteger Y = new AtomicInteger();
    private final ArrayList Z = new ArrayList();

    /* renamed from: a0, reason: collision with root package name */
    private final l f2653a0 = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f2680a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f2681b;

        a(AtomicReference atomicReference, c.a aVar) {
            this.f2680a = atomicReference;
            this.f2681b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, androidx.core.app.h hVar) {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2680a.get();
            if (cVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar.b(obj, hVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2680a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.F1();
        }
    }

    /* loaded from: classes.dex */
    class c extends l {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            Fragment.this.W.c();
            androidx.lifecycle.z.c(Fragment.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.g(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0 f2686a;

        e(k0 k0Var) {
            this.f2686a = k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2686a.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends androidx.fragment.app.l {
        f() {
        }

        @Override // androidx.fragment.app.l
        public View i(int i6) {
            View view = Fragment.this.I;
            if (view != null) {
                return view.findViewById(i6);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.l
        public boolean k() {
            return Fragment.this.I != null;
        }
    }

    /* loaded from: classes.dex */
    class g implements j.a {
        g() {
        }

        @Override // j.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.f2673u;
            return obj instanceof androidx.activity.result.d ? ((androidx.activity.result.d) obj).h() : fragment.r1().h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.a f2690a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f2691b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a f2692c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.b f2693d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(j.a aVar, AtomicReference atomicReference, c.a aVar2, androidx.activity.result.b bVar) {
            super(null);
            this.f2690a = aVar;
            this.f2691b = atomicReference;
            this.f2692c = aVar2;
            this.f2693d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            String l6 = Fragment.this.l();
            this.f2691b.set(((ActivityResultRegistry) this.f2690a.apply(null)).i(l6, Fragment.this, this.f2692c, this.f2693d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        View f2695a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2696b;

        /* renamed from: c, reason: collision with root package name */
        int f2697c;

        /* renamed from: d, reason: collision with root package name */
        int f2698d;

        /* renamed from: e, reason: collision with root package name */
        int f2699e;

        /* renamed from: f, reason: collision with root package name */
        int f2700f;

        /* renamed from: g, reason: collision with root package name */
        int f2701g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList f2702h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList f2703i;

        /* renamed from: j, reason: collision with root package name */
        Object f2704j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f2705k;

        /* renamed from: l, reason: collision with root package name */
        Object f2706l;

        /* renamed from: m, reason: collision with root package name */
        Object f2707m;

        /* renamed from: n, reason: collision with root package name */
        Object f2708n;

        /* renamed from: o, reason: collision with root package name */
        Object f2709o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f2710p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f2711q;

        /* renamed from: r, reason: collision with root package name */
        float f2712r;

        /* renamed from: s, reason: collision with root package name */
        View f2713s;

        /* renamed from: t, reason: collision with root package name */
        boolean f2714t;

        i() {
            Object obj = Fragment.f2651b0;
            this.f2705k = obj;
            this.f2706l = null;
            this.f2707m = obj;
            this.f2708n = null;
            this.f2709o = obj;
            this.f2712r = 1.0f;
            this.f2713s = null;
        }
    }

    /* loaded from: classes.dex */
    static class j {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static class k extends RuntimeException {
        public k(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class l {
        private l() {
        }

        /* synthetic */ l(b bVar) {
            this();
        }

        abstract void a();
    }

    public Fragment() {
        Y();
    }

    private int F() {
        h.b bVar = this.R;
        return (bVar == h.b.INITIALIZED || this.f2675w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f2675w.F());
    }

    private Fragment V(boolean z5) {
        String str;
        if (z5) {
            c0.c.h(this);
        }
        Fragment fragment = this.f2660h;
        if (fragment != null) {
            return fragment;
        }
        w wVar = this.f2672t;
        if (wVar == null || (str = this.f2661i) == null) {
            return null;
        }
        return wVar.f0(str);
    }

    private void Y() {
        this.S = new androidx.lifecycle.n(this);
        this.W = i0.c.a(this);
        this.V = null;
        if (this.Z.contains(this.f2653a0)) {
            return;
        }
        q1(this.f2653a0);
    }

    public static Fragment a0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) n.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.y1(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e6) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e6);
        } catch (InstantiationException e7) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (NoSuchMethodException e8) {
            throw new k("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e8);
        } catch (InvocationTargetException e9) {
            throw new k("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e9);
        }
    }

    private i j() {
        if (this.L == null) {
            this.L = new i();
        }
        return this.L;
    }

    private androidx.activity.result.c o1(c.a aVar, j.a aVar2, androidx.activity.result.b bVar) {
        if (this.f2652a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            q1(new h(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void q1(l lVar) {
        if (this.f2652a >= 0) {
            lVar.a();
        } else {
            this.Z.add(lVar);
        }
    }

    private void v1() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.I != null) {
            w1(this.f2654b);
        }
        this.f2654b = null;
    }

    public Object A() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f2706l;
    }

    public void A0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A1(int i6) {
        if (this.L == null && i6 == 0) {
            return;
        }
        j();
        this.L.f2701g = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1 B() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public void B0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        o oVar = this.f2673u;
        Activity m6 = oVar == null ? null : oVar.m();
        if (m6 != null) {
            this.G = false;
            A0(m6, attributeSet, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B1(boolean z5) {
        if (this.L == null) {
            return;
        }
        j().f2696b = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View C() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f2713s;
    }

    public void C0(boolean z5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C1(float f6) {
        j().f2712r = f6;
    }

    public final Object D() {
        o oVar = this.f2673u;
        if (oVar == null) {
            return null;
        }
        return oVar.x();
    }

    public boolean D0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D1(ArrayList arrayList, ArrayList arrayList2) {
        j();
        i iVar = this.L;
        iVar.f2702h = arrayList;
        iVar.f2703i = arrayList2;
    }

    public LayoutInflater E(Bundle bundle) {
        o oVar = this.f2673u;
        if (oVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater y5 = oVar.y();
        androidx.core.view.y.a(y5, this.f2674v.v0());
        return y5;
    }

    public void E0(Menu menu) {
    }

    public void E1(Intent intent, int i6, Bundle bundle) {
        if (this.f2673u != null) {
            I().U0(this, intent, i6, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void F0() {
        this.G = true;
    }

    public void F1() {
        if (this.L == null || !j().f2714t) {
            return;
        }
        if (this.f2673u == null) {
            j().f2714t = false;
        } else if (Looper.myLooper() != this.f2673u.t().getLooper()) {
            this.f2673u.t().postAtFrontOfQueue(new d());
        } else {
            g(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int G() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2701g;
    }

    public void G0(boolean z5) {
    }

    public final Fragment H() {
        return this.f2675w;
    }

    public void H0(Menu menu) {
    }

    public final w I() {
        w wVar = this.f2672t;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void I0(boolean z5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J() {
        i iVar = this.L;
        if (iVar == null) {
            return false;
        }
        return iVar.f2696b;
    }

    public void J0(int i6, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int K() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2699e;
    }

    public void K0() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2700f;
    }

    public void L0(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float M() {
        i iVar = this.L;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f2712r;
    }

    public void M0() {
        this.G = true;
    }

    public Object N() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f2707m;
        return obj == f2651b0 ? A() : obj;
    }

    public void N0() {
        this.G = true;
    }

    public final Resources O() {
        return s1().getResources();
    }

    public void O0(View view, Bundle bundle) {
    }

    public Object P() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f2705k;
        return obj == f2651b0 ? x() : obj;
    }

    public void P0(Bundle bundle) {
        this.G = true;
    }

    public Object Q() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f2708n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(Bundle bundle) {
        this.f2674v.W0();
        this.f2652a = 3;
        this.G = false;
        j0(bundle);
        if (this.G) {
            v1();
            this.f2674v.x();
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public Object R() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f2709o;
        return obj == f2651b0 ? Q() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0() {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
        this.Z.clear();
        this.f2674v.m(this.f2673u, h(), this);
        this.f2652a = 0;
        this.G = false;
        m0(this.f2673u.o());
        if (this.G) {
            this.f2672t.H(this);
            this.f2674v.y();
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList S() {
        ArrayList arrayList;
        i iVar = this.L;
        return (iVar == null || (arrayList = iVar.f2702h) == null) ? new ArrayList() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList T() {
        ArrayList arrayList;
        i iVar = this.L;
        return (iVar == null || (arrayList = iVar.f2703i) == null) ? new ArrayList() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean T0(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (o0(menuItem)) {
            return true;
        }
        return this.f2674v.A(menuItem);
    }

    public final String U(int i6) {
        return O().getString(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(Bundle bundle) {
        this.f2674v.W0();
        this.f2652a = 1;
        this.G = false;
        this.S.a(new androidx.lifecycle.k() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.k
            public void d(androidx.lifecycle.m mVar, h.a aVar) {
                View view;
                if (aVar != h.a.ON_STOP || (view = Fragment.this.I) == null) {
                    return;
                }
                j.a(view);
            }
        });
        this.W.d(bundle);
        p0(bundle);
        this.P = true;
        if (this.G) {
            this.S.h(h.a.ON_CREATE);
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean V0(Menu menu, MenuInflater menuInflater) {
        boolean z5 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            s0(menu, menuInflater);
            z5 = true;
        }
        return z5 | this.f2674v.C(menu, menuInflater);
    }

    public View W() {
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2674v.W0();
        this.f2670r = true;
        this.T = new i0(this, n());
        View t02 = t0(layoutInflater, viewGroup, bundle);
        this.I = t02;
        if (t02 == null) {
            if (this.T.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.T = null;
        } else {
            this.T.e();
            androidx.lifecycle.k0.a(this.I, this.T);
            androidx.lifecycle.l0.a(this.I, this.T);
            i0.e.a(this.I, this.T);
            this.U.k(this.T);
        }
    }

    public LiveData X() {
        return this.U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0() {
        this.f2674v.D();
        this.S.h(h.a.ON_DESTROY);
        this.f2652a = 0;
        this.G = false;
        this.P = false;
        u0();
        if (this.G) {
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y0() {
        this.f2674v.E();
        if (this.I != null && this.T.r().b().b(h.b.CREATED)) {
            this.T.b(h.a.ON_DESTROY);
        }
        this.f2652a = 1;
        this.G = false;
        w0();
        if (this.G) {
            androidx.loader.app.a.b(this).c();
            this.f2670r = false;
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z() {
        Y();
        this.Q = this.f2658f;
        this.f2658f = UUID.randomUUID().toString();
        this.f2664l = false;
        this.f2665m = false;
        this.f2667o = false;
        this.f2668p = false;
        this.f2669q = false;
        this.f2671s = 0;
        this.f2672t = null;
        this.f2674v = new x();
        this.f2673u = null;
        this.f2676x = 0;
        this.f2677y = 0;
        this.f2678z = null;
        this.A = false;
        this.B = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0() {
        this.f2652a = -1;
        this.G = false;
        x0();
        this.O = null;
        if (this.G) {
            if (this.f2674v.G0()) {
                return;
            }
            this.f2674v.D();
            this.f2674v = new x();
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onDetach()");
    }

    @Override // androidx.lifecycle.g
    public f0.a a() {
        Application application;
        Context applicationContext = s1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && w.H0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + s1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        f0.d dVar = new f0.d();
        if (application != null) {
            dVar.c(f0.a.f3077g, application);
        }
        dVar.c(androidx.lifecycle.z.f3134a, this);
        dVar.c(androidx.lifecycle.z.f3135b, this);
        if (s() != null) {
            dVar.c(androidx.lifecycle.z.f3136c, s());
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater a1(Bundle bundle) {
        LayoutInflater y02 = y0(bundle);
        this.O = y02;
        return y02;
    }

    public final boolean b0() {
        return this.f2673u != null && this.f2664l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1() {
        onLowMemory();
    }

    public final boolean c0() {
        w wVar;
        return this.A || ((wVar = this.f2672t) != null && wVar.K0(this.f2675w));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1(boolean z5) {
        C0(z5);
    }

    @Override // i0.d
    public final androidx.savedstate.a d() {
        return this.W.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0() {
        return this.f2671s > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d1(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (this.E && this.F && D0(menuItem)) {
            return true;
        }
        return this.f2674v.J(menuItem);
    }

    public final boolean e0() {
        w wVar;
        return this.F && ((wVar = this.f2672t) == null || wVar.L0(this.f2675w));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(Menu menu) {
        if (this.A) {
            return;
        }
        if (this.E && this.F) {
            E0(menu);
        }
        this.f2674v.K(menu);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f0() {
        i iVar = this.L;
        if (iVar == null) {
            return false;
        }
        return iVar.f2714t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1() {
        this.f2674v.M();
        if (this.I != null) {
            this.T.b(h.a.ON_PAUSE);
        }
        this.S.h(h.a.ON_PAUSE);
        this.f2652a = 6;
        this.G = false;
        F0();
        if (this.G) {
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onPause()");
    }

    void g(boolean z5) {
        ViewGroup viewGroup;
        w wVar;
        i iVar = this.L;
        if (iVar != null) {
            iVar.f2714t = false;
        }
        if (this.I == null || (viewGroup = this.H) == null || (wVar = this.f2672t) == null) {
            return;
        }
        k0 n6 = k0.n(viewGroup, wVar);
        n6.p();
        if (z5) {
            this.f2673u.t().post(new e(n6));
        } else {
            n6.g();
        }
    }

    public final boolean g0() {
        return this.f2665m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g1(boolean z5) {
        G0(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.l h() {
        return new f();
    }

    public final boolean h0() {
        w wVar = this.f2672t;
        if (wVar == null) {
            return false;
        }
        return wVar.O0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h1(Menu menu) {
        boolean z5 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            H0(menu);
            z5 = true;
        }
        return z5 | this.f2674v.O(menu);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2676x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2677y));
        printWriter.print(" mTag=");
        printWriter.println(this.f2678z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2652a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2658f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2671s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2664l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2665m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2667o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2668p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.f2672t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2672t);
        }
        if (this.f2673u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2673u);
        }
        if (this.f2675w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2675w);
        }
        if (this.f2659g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2659g);
        }
        if (this.f2654b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2654b);
        }
        if (this.f2655c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2655c);
        }
        if (this.f2656d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2656d);
        }
        Fragment V = V(false);
        if (V != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(V);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2662j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(J());
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(v());
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(z());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(K());
        }
        if (L() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(L());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (u() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2674v + ":");
        this.f2674v.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i0() {
        this.f2674v.W0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1() {
        boolean M0 = this.f2672t.M0(this);
        Boolean bool = this.f2663k;
        if (bool == null || bool.booleanValue() != M0) {
            this.f2663k = Boolean.valueOf(M0);
            I0(M0);
            this.f2674v.P();
        }
    }

    public void j0(Bundle bundle) {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j1() {
        this.f2674v.W0();
        this.f2674v.a0(true);
        this.f2652a = 7;
        this.G = false;
        K0();
        if (!this.G) {
            throw new m0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.n nVar = this.S;
        h.a aVar = h.a.ON_RESUME;
        nVar.h(aVar);
        if (this.I != null) {
            this.T.b(aVar);
        }
        this.f2674v.Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k(String str) {
        return str.equals(this.f2658f) ? this : this.f2674v.j0(str);
    }

    public void k0(int i6, int i7, Intent intent) {
        if (w.H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i7 + " data: " + intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k1(Bundle bundle) {
        L0(bundle);
        this.W.e(bundle);
        Bundle P0 = this.f2674v.P0();
        if (P0 != null) {
            bundle.putParcelable("android:support:fragments", P0);
        }
    }

    String l() {
        return "fragment_" + this.f2658f + "_rq#" + this.Y.getAndIncrement();
    }

    public void l0(Activity activity) {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1() {
        this.f2674v.W0();
        this.f2674v.a0(true);
        this.f2652a = 5;
        this.G = false;
        M0();
        if (!this.G) {
            throw new m0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.n nVar = this.S;
        h.a aVar = h.a.ON_START;
        nVar.h(aVar);
        if (this.I != null) {
            this.T.b(aVar);
        }
        this.f2674v.R();
    }

    public final androidx.fragment.app.j m() {
        o oVar = this.f2673u;
        if (oVar == null) {
            return null;
        }
        return (androidx.fragment.app.j) oVar.m();
    }

    public void m0(Context context) {
        this.G = true;
        o oVar = this.f2673u;
        Activity m6 = oVar == null ? null : oVar.m();
        if (m6 != null) {
            this.G = false;
            l0(m6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m1() {
        this.f2674v.T();
        if (this.I != null) {
            this.T.b(h.a.ON_STOP);
        }
        this.S.h(h.a.ON_STOP);
        this.f2652a = 4;
        this.G = false;
        N0();
        if (this.G) {
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // androidx.lifecycle.j0
    public androidx.lifecycle.i0 n() {
        if (this.f2672t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (F() != h.b.INITIALIZED.ordinal()) {
            return this.f2672t.C0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void n0(Fragment fragment) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n1() {
        O0(this.I, this.f2654b);
        this.f2674v.U();
    }

    public boolean o() {
        Boolean bool;
        i iVar = this.L;
        if (iVar == null || (bool = iVar.f2711q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean o0(MenuItem menuItem) {
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        r1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.G = true;
    }

    public boolean p() {
        Boolean bool;
        i iVar = this.L;
        if (iVar == null || (bool = iVar.f2710p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void p0(Bundle bundle) {
        this.G = true;
        u1(bundle);
        if (this.f2674v.N0(1)) {
            return;
        }
        this.f2674v.B();
    }

    public final androidx.activity.result.c p1(c.a aVar, androidx.activity.result.b bVar) {
        return o1(aVar, new g(), bVar);
    }

    View q() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f2695a;
    }

    public Animation q0(int i6, boolean z5, int i7) {
        return null;
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.h r() {
        return this.S;
    }

    public Animator r0(int i6, boolean z5, int i7) {
        return null;
    }

    public final androidx.fragment.app.j r1() {
        androidx.fragment.app.j m6 = m();
        if (m6 != null) {
            return m6;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle s() {
        return this.f2659g;
    }

    public void s0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context s1() {
        Context u5 = u();
        if (u5 != null) {
            return u5;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void startActivityForResult(Intent intent, int i6) {
        E1(intent, i6, null);
    }

    public final w t() {
        if (this.f2673u != null) {
            return this.f2674v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6 = this.X;
        if (i6 != 0) {
            return layoutInflater.inflate(i6, viewGroup, false);
        }
        return null;
    }

    public final View t1() {
        View W = W();
        if (W != null) {
            return W;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2658f);
        if (this.f2676x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2676x));
        }
        if (this.f2678z != null) {
            sb.append(" tag=");
            sb.append(this.f2678z);
        }
        sb.append(")");
        return sb.toString();
    }

    public Context u() {
        o oVar = this.f2673u;
        if (oVar == null) {
            return null;
        }
        return oVar.o();
    }

    public void u0() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f2674v.h1(parcelable);
        this.f2674v.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int v() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2697c;
    }

    public void v0() {
    }

    @Override // androidx.lifecycle.g
    public f0.b w() {
        Application application;
        if (this.f2672t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.V == null) {
            Context applicationContext = s1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && w.H0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + s1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.V = new androidx.lifecycle.c0(application, this, s());
        }
        return this.V;
    }

    public void w0() {
        this.G = true;
    }

    final void w1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2655c;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f2655c = null;
        }
        if (this.I != null) {
            this.T.g(this.f2656d);
            this.f2656d = null;
        }
        this.G = false;
        P0(bundle);
        if (this.G) {
            if (this.I != null) {
                this.T.b(h.a.ON_CREATE);
            }
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public Object x() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        return iVar.f2704j;
    }

    public void x0() {
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x1(int i6, int i7, int i8, int i9) {
        if (this.L == null && i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            return;
        }
        j().f2697c = i6;
        j().f2698d = i7;
        j().f2699e = i8;
        j().f2700f = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1 y() {
        i iVar = this.L;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public LayoutInflater y0(Bundle bundle) {
        return E(bundle);
    }

    public void y1(Bundle bundle) {
        if (this.f2672t != null && h0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2659g = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z() {
        i iVar = this.L;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2698d;
    }

    public void z0(boolean z5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z1(View view) {
        j().f2713s = view;
    }
}
