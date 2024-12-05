package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.b1;
import androidx.fragment.app.k0;
import androidx.lifecycle.h;
import org.apache.cordova.networkinformation.NetworkManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final q f2756a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f2757b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f2758c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2759d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f2760e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2761a;

        a(View view) {
            this.f2761a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2761a.removeOnAttachStateChangeListener(this);
            b1.n0(this.f2761a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2763a;

        static {
            int[] iArr = new int[h.b.values().length];
            f2763a = iArr;
            try {
                iArr[h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2763a[h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2763a[h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2763a[h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(q qVar, d0 d0Var, Fragment fragment) {
        this.f2756a = qVar;
        this.f2757b = d0Var;
        this.f2758c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f2758c.I) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2758c.I) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f2758c.k1(bundle);
        this.f2756a.j(this.f2758c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2758c.I != null) {
            s();
        }
        if (this.f2758c.f2655c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2758c.f2655c);
        }
        if (this.f2758c.f2656d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2758c.f2656d);
        }
        if (!this.f2758c.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2758c.K);
        }
        return bundle;
    }

    void a() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2758c);
        }
        Fragment fragment = this.f2758c;
        fragment.Q0(fragment.f2654b);
        q qVar = this.f2756a;
        Fragment fragment2 = this.f2758c;
        qVar.a(fragment2, fragment2.f2654b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int j6 = this.f2757b.j(this.f2758c);
        Fragment fragment = this.f2758c;
        fragment.H.addView(fragment.I, j6);
    }

    void c() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2758c);
        }
        Fragment fragment = this.f2758c;
        Fragment fragment2 = fragment.f2660h;
        c0 c0Var = null;
        if (fragment2 != null) {
            c0 n6 = this.f2757b.n(fragment2.f2658f);
            if (n6 == null) {
                throw new IllegalStateException("Fragment " + this.f2758c + " declared target fragment " + this.f2758c.f2660h + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f2758c;
            fragment3.f2661i = fragment3.f2660h.f2658f;
            fragment3.f2660h = null;
            c0Var = n6;
        } else {
            String str = fragment.f2661i;
            if (str != null && (c0Var = this.f2757b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2758c + " declared target fragment " + this.f2758c.f2661i + " that does not belong to this FragmentManager!");
            }
        }
        if (c0Var != null) {
            c0Var.m();
        }
        Fragment fragment4 = this.f2758c;
        fragment4.f2673u = fragment4.f2672t.u0();
        Fragment fragment5 = this.f2758c;
        fragment5.f2675w = fragment5.f2672t.x0();
        this.f2756a.g(this.f2758c, false);
        this.f2758c.R0();
        this.f2756a.b(this.f2758c, false);
    }

    int d() {
        Fragment fragment = this.f2758c;
        if (fragment.f2672t == null) {
            return fragment.f2652a;
        }
        int i6 = this.f2760e;
        int i7 = b.f2763a[fragment.R.ordinal()];
        if (i7 != 1) {
            i6 = i7 != 2 ? i7 != 3 ? i7 != 4 ? Math.min(i6, -1) : Math.min(i6, 0) : Math.min(i6, 1) : Math.min(i6, 5);
        }
        Fragment fragment2 = this.f2758c;
        if (fragment2.f2667o) {
            if (fragment2.f2668p) {
                i6 = Math.max(this.f2760e, 2);
                View view = this.f2758c.I;
                if (view != null && view.getParent() == null) {
                    i6 = Math.min(i6, 2);
                }
            } else {
                i6 = this.f2760e < 4 ? Math.min(i6, fragment2.f2652a) : Math.min(i6, 1);
            }
        }
        if (!this.f2758c.f2664l) {
            i6 = Math.min(i6, 1);
        }
        Fragment fragment3 = this.f2758c;
        ViewGroup viewGroup = fragment3.H;
        k0.e.b l6 = viewGroup != null ? k0.n(viewGroup, fragment3.I()).l(this) : null;
        if (l6 == k0.e.b.ADDING) {
            i6 = Math.min(i6, 6);
        } else if (l6 == k0.e.b.REMOVING) {
            i6 = Math.max(i6, 3);
        } else {
            Fragment fragment4 = this.f2758c;
            if (fragment4.f2665m) {
                i6 = fragment4.d0() ? Math.min(i6, 1) : Math.min(i6, -1);
            }
        }
        Fragment fragment5 = this.f2758c;
        if (fragment5.J && fragment5.f2652a < 5) {
            i6 = Math.min(i6, 4);
        }
        if (w.H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i6 + " for " + this.f2758c);
        }
        return i6;
    }

    void e() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2758c);
        }
        Fragment fragment = this.f2758c;
        if (fragment.P) {
            fragment.u1(fragment.f2654b);
            this.f2758c.f2652a = 1;
            return;
        }
        this.f2756a.h(fragment, fragment.f2654b, false);
        Fragment fragment2 = this.f2758c;
        fragment2.U0(fragment2.f2654b);
        q qVar = this.f2756a;
        Fragment fragment3 = this.f2758c;
        qVar.c(fragment3, fragment3.f2654b, false);
    }

    void f() {
        String str;
        if (this.f2758c.f2667o) {
            return;
        }
        if (w.H0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2758c);
        }
        Fragment fragment = this.f2758c;
        LayoutInflater a12 = fragment.a1(fragment.f2654b);
        Fragment fragment2 = this.f2758c;
        ViewGroup viewGroup = fragment2.H;
        if (viewGroup == null) {
            int i6 = fragment2.f2677y;
            if (i6 == 0) {
                viewGroup = null;
            } else {
                if (i6 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2758c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f2672t.q0().i(this.f2758c.f2677y);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2758c;
                    if (!fragment3.f2669q) {
                        try {
                            str = fragment3.O().getResourceName(this.f2758c.f2677y);
                        } catch (Resources.NotFoundException unused) {
                            str = NetworkManager.TYPE_UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2758c.f2677y) + " (" + str + ") for fragment " + this.f2758c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    c0.c.i(this.f2758c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f2758c;
        fragment4.H = viewGroup;
        fragment4.W0(a12, viewGroup, fragment4.f2654b);
        View view = this.f2758c.I;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2758c;
            fragment5.I.setTag(b0.b.f3802a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f2758c;
            if (fragment6.A) {
                fragment6.I.setVisibility(8);
            }
            if (b1.T(this.f2758c.I)) {
                b1.n0(this.f2758c.I);
            } else {
                View view2 = this.f2758c.I;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2758c.n1();
            q qVar = this.f2756a;
            Fragment fragment7 = this.f2758c;
            qVar.m(fragment7, fragment7.I, fragment7.f2654b, false);
            int visibility = this.f2758c.I.getVisibility();
            this.f2758c.C1(this.f2758c.I.getAlpha());
            Fragment fragment8 = this.f2758c;
            if (fragment8.H != null && visibility == 0) {
                View findFocus = fragment8.I.findFocus();
                if (findFocus != null) {
                    this.f2758c.z1(findFocus);
                    if (w.H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2758c);
                    }
                }
                this.f2758c.I.setAlpha(0.0f);
            }
        }
        this.f2758c.f2652a = 2;
    }

    void g() {
        Fragment f6;
        if (w.H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2758c);
        }
        Fragment fragment = this.f2758c;
        boolean z5 = true;
        boolean z6 = fragment.f2665m && !fragment.d0();
        if (z6) {
            Fragment fragment2 = this.f2758c;
            if (!fragment2.f2666n) {
                this.f2757b.B(fragment2.f2658f, null);
            }
        }
        if (!(z6 || this.f2757b.p().r(this.f2758c))) {
            String str = this.f2758c.f2661i;
            if (str != null && (f6 = this.f2757b.f(str)) != null && f6.C) {
                this.f2758c.f2660h = f6;
            }
            this.f2758c.f2652a = 0;
            return;
        }
        o oVar = this.f2758c.f2673u;
        if (oVar instanceof androidx.lifecycle.j0) {
            z5 = this.f2757b.p().o();
        } else if (oVar.o() instanceof Activity) {
            z5 = true ^ ((Activity) oVar.o()).isChangingConfigurations();
        }
        if ((z6 && !this.f2758c.f2666n) || z5) {
            this.f2757b.p().g(this.f2758c);
        }
        this.f2758c.X0();
        this.f2756a.d(this.f2758c, false);
        for (c0 c0Var : this.f2757b.k()) {
            if (c0Var != null) {
                Fragment k6 = c0Var.k();
                if (this.f2758c.f2658f.equals(k6.f2661i)) {
                    k6.f2660h = this.f2758c;
                    k6.f2661i = null;
                }
            }
        }
        Fragment fragment3 = this.f2758c;
        String str2 = fragment3.f2661i;
        if (str2 != null) {
            fragment3.f2660h = this.f2757b.f(str2);
        }
        this.f2757b.s(this);
    }

    void h() {
        View view;
        if (w.H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2758c);
        }
        Fragment fragment = this.f2758c;
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null && (view = fragment.I) != null) {
            viewGroup.removeView(view);
        }
        this.f2758c.Y0();
        this.f2756a.n(this.f2758c, false);
        Fragment fragment2 = this.f2758c;
        fragment2.H = null;
        fragment2.I = null;
        fragment2.T = null;
        fragment2.U.k(null);
        this.f2758c.f2668p = false;
    }

    void i() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2758c);
        }
        this.f2758c.Z0();
        boolean z5 = false;
        this.f2756a.e(this.f2758c, false);
        Fragment fragment = this.f2758c;
        fragment.f2652a = -1;
        fragment.f2673u = null;
        fragment.f2675w = null;
        fragment.f2672t = null;
        if (fragment.f2665m && !fragment.d0()) {
            z5 = true;
        }
        if (z5 || this.f2757b.p().r(this.f2758c)) {
            if (w.H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2758c);
            }
            this.f2758c.Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f2758c;
        if (fragment.f2667o && fragment.f2668p && !fragment.f2670r) {
            if (w.H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2758c);
            }
            Fragment fragment2 = this.f2758c;
            fragment2.W0(fragment2.a1(fragment2.f2654b), null, this.f2758c.f2654b);
            View view = this.f2758c.I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2758c;
                fragment3.I.setTag(b0.b.f3802a, fragment3);
                Fragment fragment4 = this.f2758c;
                if (fragment4.A) {
                    fragment4.I.setVisibility(8);
                }
                this.f2758c.n1();
                q qVar = this.f2756a;
                Fragment fragment5 = this.f2758c;
                qVar.m(fragment5, fragment5.I, fragment5.f2654b, false);
                this.f2758c.f2652a = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k() {
        return this.f2758c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2759d) {
            if (w.H0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2759d = true;
            boolean z5 = false;
            while (true) {
                int d6 = d();
                Fragment fragment = this.f2758c;
                int i6 = fragment.f2652a;
                if (d6 == i6) {
                    if (!z5 && i6 == -1 && fragment.f2665m && !fragment.d0() && !this.f2758c.f2666n) {
                        if (w.H0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f2758c);
                        }
                        this.f2757b.p().g(this.f2758c);
                        this.f2757b.s(this);
                        if (w.H0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f2758c);
                        }
                        this.f2758c.Z();
                    }
                    Fragment fragment2 = this.f2758c;
                    if (fragment2.N) {
                        if (fragment2.I != null && (viewGroup = fragment2.H) != null) {
                            k0 n6 = k0.n(viewGroup, fragment2.I());
                            if (this.f2758c.A) {
                                n6.c(this);
                            } else {
                                n6.e(this);
                            }
                        }
                        Fragment fragment3 = this.f2758c;
                        w wVar = fragment3.f2672t;
                        if (wVar != null) {
                            wVar.F0(fragment3);
                        }
                        Fragment fragment4 = this.f2758c;
                        fragment4.N = false;
                        fragment4.z0(fragment4.A);
                        this.f2758c.f2674v.I();
                    }
                    return;
                }
                if (d6 <= i6) {
                    switch (i6 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.f2666n && this.f2757b.q(fragment.f2658f) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f2758c.f2652a = 1;
                            break;
                        case 2:
                            fragment.f2668p = false;
                            fragment.f2652a = 2;
                            break;
                        case 3:
                            if (w.H0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2758c);
                            }
                            Fragment fragment5 = this.f2758c;
                            if (fragment5.f2666n) {
                                r();
                            } else if (fragment5.I != null && fragment5.f2655c == null) {
                                s();
                            }
                            Fragment fragment6 = this.f2758c;
                            if (fragment6.I != null && (viewGroup2 = fragment6.H) != null) {
                                k0.n(viewGroup2, fragment6.I()).d(this);
                            }
                            this.f2758c.f2652a = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                            fragment.f2652a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i6 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.I != null && (viewGroup3 = fragment.H) != null) {
                                k0.n(viewGroup3, fragment.I()).b(k0.e.c.b(this.f2758c.I.getVisibility()), this);
                            }
                            this.f2758c.f2652a = 4;
                            break;
                        case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                            u();
                            break;
                        case 6:
                            fragment.f2652a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z5 = true;
            }
        } finally {
            this.f2759d = false;
        }
    }

    void n() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2758c);
        }
        this.f2758c.f1();
        this.f2756a.f(this.f2758c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f2758c.f2654b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2758c;
        fragment.f2655c = fragment.f2654b.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2758c;
        fragment2.f2656d = fragment2.f2654b.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2758c;
        fragment3.f2661i = fragment3.f2654b.getString("android:target_state");
        Fragment fragment4 = this.f2758c;
        if (fragment4.f2661i != null) {
            fragment4.f2662j = fragment4.f2654b.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2758c;
        Boolean bool = fragment5.f2657e;
        if (bool != null) {
            fragment5.K = bool.booleanValue();
            this.f2758c.f2657e = null;
        } else {
            fragment5.K = fragment5.f2654b.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2758c;
        if (fragment6.K) {
            return;
        }
        fragment6.J = true;
    }

    void p() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2758c);
        }
        View C = this.f2758c.C();
        if (C != null && l(C)) {
            boolean requestFocus = C.requestFocus();
            if (w.H0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(C);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f2758c);
                sb.append(" resulting in focused view ");
                sb.append(this.f2758c.I.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f2758c.z1(null);
        this.f2758c.j1();
        this.f2756a.i(this.f2758c, false);
        Fragment fragment = this.f2758c;
        fragment.f2654b = null;
        fragment.f2655c = null;
        fragment.f2656d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        b0 b0Var = new b0(this.f2758c);
        Fragment fragment = this.f2758c;
        if (fragment.f2652a <= -1 || b0Var.f2753m != null) {
            b0Var.f2753m = fragment.f2654b;
        } else {
            Bundle q6 = q();
            b0Var.f2753m = q6;
            if (this.f2758c.f2661i != null) {
                if (q6 == null) {
                    b0Var.f2753m = new Bundle();
                }
                b0Var.f2753m.putString("android:target_state", this.f2758c.f2661i);
                int i6 = this.f2758c.f2662j;
                if (i6 != 0) {
                    b0Var.f2753m.putInt("android:target_req_state", i6);
                }
            }
        }
        this.f2757b.B(this.f2758c.f2658f, b0Var);
    }

    void s() {
        if (this.f2758c.I == null) {
            return;
        }
        if (w.H0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f2758c + " with view " + this.f2758c.I);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2758c.I.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2758c.f2655c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2758c.T.h(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2758c.f2656d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i6) {
        this.f2760e = i6;
    }

    void u() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2758c);
        }
        this.f2758c.l1();
        this.f2756a.k(this.f2758c, false);
    }

    void v() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2758c);
        }
        this.f2758c.m1();
        this.f2756a.l(this.f2758c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(q qVar, d0 d0Var, Fragment fragment, b0 b0Var) {
        this.f2756a = qVar;
        this.f2757b = d0Var;
        this.f2758c = fragment;
        fragment.f2655c = null;
        fragment.f2656d = null;
        fragment.f2671s = 0;
        fragment.f2668p = false;
        fragment.f2664l = false;
        Fragment fragment2 = fragment.f2660h;
        fragment.f2661i = fragment2 != null ? fragment2.f2658f : null;
        fragment.f2660h = null;
        Bundle bundle = b0Var.f2753m;
        fragment.f2654b = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(q qVar, d0 d0Var, ClassLoader classLoader, n nVar, b0 b0Var) {
        this.f2756a = qVar;
        this.f2757b = d0Var;
        Fragment a6 = b0Var.a(nVar, classLoader);
        this.f2758c = a6;
        if (w.H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a6);
        }
    }
}
