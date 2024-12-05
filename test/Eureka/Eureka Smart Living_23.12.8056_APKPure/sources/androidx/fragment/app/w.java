package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.core.app.d1;
import androidx.core.app.e1;
import androidx.core.app.f1;
import androidx.core.view.q0;
import androidx.fragment.app.e0;
import androidx.lifecycle.h;
import c0.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class w {
    private static boolean S = false;
    private androidx.activity.result.c D;
    private androidx.activity.result.c E;
    private androidx.activity.result.c F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private z P;
    private c.C0068c Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2959b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f2961d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f2962e;

    /* renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f2964g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f2970m;

    /* renamed from: v, reason: collision with root package name */
    private o f2979v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.l f2980w;

    /* renamed from: x, reason: collision with root package name */
    private Fragment f2981x;

    /* renamed from: y, reason: collision with root package name */
    Fragment f2982y;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f2958a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final d0 f2960c = new d0();

    /* renamed from: f, reason: collision with root package name */
    private final p f2963f = new p(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.activity.m f2965h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f2966i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map f2967j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map f2968k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map f2969l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final q f2971n = new q(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f2972o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final androidx.core.util.a f2973p = new androidx.core.util.a() { // from class: androidx.fragment.app.r
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.Q0((Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final androidx.core.util.a f2974q = new androidx.core.util.a() { // from class: androidx.fragment.app.s
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.R0((Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final androidx.core.util.a f2975r = new androidx.core.util.a() { // from class: androidx.fragment.app.t
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.S0((androidx.core.app.q) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final androidx.core.util.a f2976s = new androidx.core.util.a() { // from class: androidx.fragment.app.u
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.T0((f1) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final q0 f2977t = new c();

    /* renamed from: u, reason: collision with root package name */
    int f2978u = -1;

    /* renamed from: z, reason: collision with root package name */
    private n f2983z = null;
    private n A = new d();
    private l0 B = null;
    private l0 C = new e();
    ArrayDeque G = new ArrayDeque();
    private Runnable R = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b {
        a() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                iArr[i6] = ((Boolean) arrayList.get(i6)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) w.this.G.pollFirst();
            if (kVar == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = kVar.f2994a;
                int i7 = kVar.f2995b;
                Fragment i8 = w.this.f2960c.i(str);
                if (i8 != null) {
                    i8.J0(i7, strArr, iArr);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.activity.m {
        b(boolean z5) {
            super(z5);
        }

        @Override // androidx.activity.m
        public void b() {
            w.this.D0();
        }
    }

    /* loaded from: classes.dex */
    class c implements q0 {
        c() {
        }

        @Override // androidx.core.view.q0
        public void a(Menu menu, MenuInflater menuInflater) {
            w.this.C(menu, menuInflater);
        }

        @Override // androidx.core.view.q0
        public void b(Menu menu) {
            w.this.O(menu);
        }

        @Override // androidx.core.view.q0
        public boolean c(MenuItem menuItem) {
            return w.this.J(menuItem);
        }

        @Override // androidx.core.view.q0
        public void d(Menu menu) {
            w.this.K(menu);
        }
    }

    /* loaded from: classes.dex */
    class d extends n {
        d() {
        }

        @Override // androidx.fragment.app.n
        public Fragment a(ClassLoader classLoader, String str) {
            return w.this.u0().b(w.this.u0().o(), str, null);
        }
    }

    /* loaded from: classes.dex */
    class e implements l0 {
        e() {
        }

        @Override // androidx.fragment.app.l0
        public k0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements a0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2990a;

        g(Fragment fragment) {
            this.f2990a = fragment;
        }

        @Override // androidx.fragment.app.a0
        public void a(w wVar, Fragment fragment) {
            this.f2990a.n0(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b {
        h() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            k kVar = (k) w.this.G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f2994a;
            int i6 = kVar.f2995b;
            Fragment i7 = w.this.f2960c.i(str);
            if (i7 != null) {
                i7.k0(i6, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b {
        i() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            k kVar = (k) w.this.G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f2994a;
            int i6 = kVar.f2995b;
            Fragment i7 = w.this.f2960c.i(str);
            if (i7 != null) {
                i7.k0(i6, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j extends c.a {
        j() {
        }

        @Override // c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a6 = eVar.a();
            if (a6 != null && (bundleExtra = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.a(eVar.d()).b(null).c(eVar.c(), eVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (w.H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i6, Intent intent) {
            return new androidx.activity.result.a(i6, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f2994a;

        /* renamed from: b, reason: collision with root package name */
        int f2995b;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i6) {
                return new k[i6];
            }
        }

        k(Parcel parcel) {
            this.f2994a = parcel.readString();
            this.f2995b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f2994a);
            parcel.writeInt(this.f2995b);
        }

        k(String str, int i6) {
            this.f2994a = str;
            this.f2995b = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* loaded from: classes.dex */
    private class m implements l {

        /* renamed from: a, reason: collision with root package name */
        final String f2996a;

        /* renamed from: b, reason: collision with root package name */
        final int f2997b;

        /* renamed from: c, reason: collision with root package name */
        final int f2998c;

        m(String str, int i6, int i7) {
            this.f2996a = str;
            this.f2997b = i6;
            this.f2998c = i7;
        }

        @Override // androidx.fragment.app.w.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = w.this.f2982y;
            if (fragment == null || this.f2997b >= 0 || this.f2996a != null || !fragment.t().a1()) {
                return w.this.d1(arrayList, arrayList2, this.f2996a, this.f2997b, this.f2998c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment B0(View view) {
        Object tag = view.getTag(b0.b.f3802a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean H0(int i6) {
        return S || Log.isLoggable("FragmentManager", i6);
    }

    private boolean I0(Fragment fragment) {
        return (fragment.E && fragment.F) || fragment.f2674v.p();
    }

    private boolean J0() {
        Fragment fragment = this.f2981x;
        if (fragment == null) {
            return true;
        }
        return fragment.b0() && this.f2981x.I().J0();
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.f2658f))) {
            return;
        }
        fragment.i1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(Configuration configuration) {
        if (J0()) {
            z(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(Integer num) {
        if (J0() && num.intValue() == 80) {
            F(false);
        }
    }

    private void S(int i6) {
        try {
            this.f2959b = true;
            this.f2960c.d(i6);
            V0(i6, false);
            Iterator it = t().iterator();
            while (it.hasNext()) {
                ((k0) it.next()).j();
            }
            this.f2959b = false;
            a0(true);
        } catch (Throwable th) {
            this.f2959b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(androidx.core.app.q qVar) {
        if (J0()) {
            G(qVar.a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(f1 f1Var) {
        if (J0()) {
            N(f1Var.a(), false);
        }
    }

    private void V() {
        if (this.L) {
            this.L = false;
            q1();
        }
    }

    private void X() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((k0) it.next()).j();
        }
    }

    private void Z(boolean z5) {
        if (this.f2959b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2979v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2979v.t().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5) {
            q();
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    private static void c0(ArrayList arrayList, ArrayList arrayList2, int i6, int i7) {
        while (i6 < i7) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i6);
            if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                aVar.p(-1);
                aVar.u();
            } else {
                aVar.p(1);
                aVar.t();
            }
            i6++;
        }
    }

    private boolean c1(String str, int i6, int i7) {
        a0(false);
        Z(true);
        Fragment fragment = this.f2982y;
        if (fragment != null && i6 < 0 && str == null && fragment.t().a1()) {
            return true;
        }
        boolean d12 = d1(this.M, this.N, str, i6, i7);
        if (d12) {
            this.f2959b = true;
            try {
                f1(this.M, this.N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f2960c.b();
        return d12;
    }

    private void d0(ArrayList arrayList, ArrayList arrayList2, int i6, int i7) {
        boolean z5 = ((androidx.fragment.app.a) arrayList.get(i6)).f2853r;
        ArrayList arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.f2960c.o());
        Fragment y02 = y0();
        boolean z6 = false;
        for (int i8 = i6; i8 < i7; i8++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i8);
            y02 = !((Boolean) arrayList2.get(i8)).booleanValue() ? aVar.v(this.O, y02) : aVar.y(this.O, y02);
            z6 = z6 || aVar.f2844i;
        }
        this.O.clear();
        if (!z5 && this.f2978u >= 1) {
            for (int i9 = i6; i9 < i7; i9++) {
                Iterator it = ((androidx.fragment.app.a) arrayList.get(i9)).f2838c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((e0.a) it.next()).f2856b;
                    if (fragment != null && fragment.f2672t != null) {
                        this.f2960c.r(v(fragment));
                    }
                }
            }
        }
        c0(arrayList, arrayList2, i6, i7);
        boolean booleanValue = ((Boolean) arrayList2.get(i7 - 1)).booleanValue();
        for (int i10 = i6; i10 < i7; i10++) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i10);
            if (booleanValue) {
                for (int size = aVar2.f2838c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((e0.a) aVar2.f2838c.get(size)).f2856b;
                    if (fragment2 != null) {
                        v(fragment2).m();
                    }
                }
            } else {
                Iterator it2 = aVar2.f2838c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((e0.a) it2.next()).f2856b;
                    if (fragment3 != null) {
                        v(fragment3).m();
                    }
                }
            }
        }
        V0(this.f2978u, true);
        for (k0 k0Var : u(arrayList, i6, i7)) {
            k0Var.r(booleanValue);
            k0Var.p();
            k0Var.g();
        }
        while (i6 < i7) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i6);
            if (((Boolean) arrayList2.get(i6)).booleanValue() && aVar3.f2725v >= 0) {
                aVar3.f2725v = -1;
            }
            aVar3.x();
            i6++;
        }
        if (z6) {
            g1();
        }
    }

    private void f1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i6)).f2853r) {
                if (i7 != i6) {
                    d0(arrayList, arrayList2, i7, i6);
                }
                i7 = i6 + 1;
                if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                    while (i7 < size && ((Boolean) arrayList2.get(i7)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i7)).f2853r) {
                        i7++;
                    }
                }
                d0(arrayList, arrayList2, i6, i7);
                i6 = i7 - 1;
            }
            i6++;
        }
        if (i7 != size) {
            d0(arrayList, arrayList2, i7, size);
        }
    }

    private int g0(String str, int i6, boolean z5) {
        ArrayList arrayList = this.f2961d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i6 < 0) {
            if (z5) {
                return 0;
            }
            return this.f2961d.size() - 1;
        }
        int size = this.f2961d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2961d.get(size);
            if ((str != null && str.equals(aVar.w())) || (i6 >= 0 && i6 == aVar.f2725v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z5) {
            if (size == this.f2961d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f2961d.get(size - 1);
            if ((str == null || !str.equals(aVar2.w())) && (i6 < 0 || i6 != aVar2.f2725v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    private void g1() {
        ArrayList arrayList = this.f2970m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        androidx.appcompat.app.f0.a(this.f2970m.get(0));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i1(int i6) {
        if (i6 == 4097) {
            return 8194;
        }
        if (i6 == 8194) {
            return 4097;
        }
        if (i6 == 8197) {
            return 4100;
        }
        if (i6 != 4099) {
            return i6 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w k0(View view) {
        androidx.fragment.app.j jVar;
        Fragment l02 = l0(view);
        if (l02 != null) {
            if (l02.b0()) {
                return l02.t();
            }
            throw new IllegalStateException("The Fragment " + l02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                jVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.j) {
                jVar = (androidx.fragment.app.j) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (jVar != null) {
            return jVar.U();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment l0(View view) {
        while (view != null) {
            Fragment B0 = B0(view);
            if (B0 != null) {
                return B0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void m0() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((k0) it.next()).k();
        }
    }

    private boolean n0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f2958a) {
            if (this.f2958a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f2958a.size();
                boolean z5 = false;
                for (int i6 = 0; i6 < size; i6++) {
                    z5 |= ((l) this.f2958a.get(i6)).a(arrayList, arrayList2);
                }
                return z5;
            } finally {
                this.f2958a.clear();
                this.f2979v.t().removeCallbacks(this.R);
            }
        }
    }

    private void o1(Fragment fragment) {
        ViewGroup r02 = r0(fragment);
        if (r02 == null || fragment.v() + fragment.z() + fragment.K() + fragment.L() <= 0) {
            return;
        }
        if (r02.getTag(b0.b.f3804c) == null) {
            r02.setTag(b0.b.f3804c, fragment);
        }
        ((Fragment) r02.getTag(b0.b.f3804c)).B1(fragment.J());
    }

    private z p0(Fragment fragment) {
        return this.P.k(fragment);
    }

    private void q() {
        if (O0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void q1() {
        Iterator it = this.f2960c.k().iterator();
        while (it.hasNext()) {
            Y0((c0) it.next());
        }
    }

    private void r() {
        this.f2959b = false;
        this.N.clear();
        this.M.clear();
    }

    private ViewGroup r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2677y > 0 && this.f2980w.k()) {
            View i6 = this.f2980w.i(fragment.f2677y);
            if (i6 instanceof ViewGroup) {
                return (ViewGroup) i6;
            }
        }
        return null;
    }

    private void r1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
        o oVar = this.f2979v;
        try {
            if (oVar != null) {
                oVar.w("  ", null, printWriter, new String[0]);
            } else {
                W("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e6) {
            Log.e("FragmentManager", "Failed dumping state", e6);
            throw runtimeException;
        }
    }

    private void s() {
        o oVar = this.f2979v;
        if (oVar instanceof androidx.lifecycle.j0 ? this.f2960c.p().o() : oVar.o() instanceof Activity ? !((Activity) this.f2979v.o()).isChangingConfigurations() : true) {
            Iterator it = this.f2967j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((androidx.fragment.app.c) it.next()).f2754a.iterator();
                while (it2.hasNext()) {
                    this.f2960c.p().h((String) it2.next());
                }
            }
        }
    }

    private void s1() {
        synchronized (this.f2958a) {
            if (this.f2958a.isEmpty()) {
                this.f2965h.f(o0() > 0 && M0(this.f2981x));
            } else {
                this.f2965h.f(true);
            }
        }
    }

    private Set t() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2960c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((c0) it.next()).k().H;
            if (viewGroup != null) {
                hashSet.add(k0.o(viewGroup, z0()));
            }
        }
        return hashSet;
    }

    private Set u(ArrayList arrayList, int i6, int i7) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i6 < i7) {
            Iterator it = ((androidx.fragment.app.a) arrayList.get(i6)).f2838c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((e0.a) it.next()).f2856b;
                if (fragment != null && (viewGroup = fragment.H) != null) {
                    hashSet.add(k0.n(viewGroup, this));
                }
            }
            i6++;
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A(MenuItem menuItem) {
        if (this.f2978u < 1) {
            return false;
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null && fragment.T0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public c.C0068c A0() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f2978u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null && L0(fragment) && fragment.V0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z5 = true;
            }
        }
        if (this.f2962e != null) {
            for (int i6 = 0; i6 < this.f2962e.size(); i6++) {
                Fragment fragment2 = (Fragment) this.f2962e.get(i6);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.v0();
                }
            }
        }
        this.f2962e = arrayList;
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.i0 C0(Fragment fragment) {
        return this.P.n(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        this.K = true;
        a0(true);
        X();
        s();
        S(-1);
        Object obj = this.f2979v;
        if (obj instanceof androidx.core.content.i) {
            ((androidx.core.content.i) obj).s(this.f2974q);
        }
        Object obj2 = this.f2979v;
        if (obj2 instanceof androidx.core.content.h) {
            ((androidx.core.content.h) obj2).v(this.f2973p);
        }
        Object obj3 = this.f2979v;
        if (obj3 instanceof d1) {
            ((d1) obj3).p(this.f2975r);
        }
        Object obj4 = this.f2979v;
        if (obj4 instanceof e1) {
            ((e1) obj4).q(this.f2976s);
        }
        Object obj5 = this.f2979v;
        if ((obj5 instanceof androidx.core.view.a0) && this.f2981x == null) {
            ((androidx.core.view.a0) obj5).f(this.f2977t);
        }
        this.f2979v = null;
        this.f2980w = null;
        this.f2981x = null;
        if (this.f2964g != null) {
            this.f2965h.d();
            this.f2964g = null;
        }
        androidx.activity.result.c cVar = this.D;
        if (cVar != null) {
            cVar.c();
            this.E.c();
            this.F.c();
        }
    }

    void D0() {
        a0(true);
        if (this.f2965h.c()) {
            a1();
        } else {
            this.f2964g.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0(Fragment fragment) {
        if (H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        fragment.N = true ^ fragment.N;
        o1(fragment);
    }

    void F(boolean z5) {
        if (z5 && (this.f2979v instanceof androidx.core.content.i)) {
            r1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null) {
                fragment.b1();
                if (z5) {
                    fragment.f2674v.F(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F0(Fragment fragment) {
        if (fragment.f2664l && I0(fragment)) {
            this.H = true;
        }
    }

    void G(boolean z5, boolean z6) {
        if (z6 && (this.f2979v instanceof d1)) {
            r1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null) {
                fragment.c1(z5);
                if (z6) {
                    fragment.f2674v.G(z5, true);
                }
            }
        }
    }

    public boolean G0() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(Fragment fragment) {
        Iterator it = this.f2972o.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        for (Fragment fragment : this.f2960c.l()) {
            if (fragment != null) {
                fragment.z0(fragment.c0());
                fragment.f2674v.I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J(MenuItem menuItem) {
        if (this.f2978u < 1) {
            return false;
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null && fragment.d1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(Menu menu) {
        if (this.f2978u < 1) {
            return;
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null) {
                fragment.e1(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        w wVar = fragment.f2672t;
        return fragment.equals(wVar.y0()) && M0(wVar.f2981x);
    }

    void N(boolean z5, boolean z6) {
        if (z6 && (this.f2979v instanceof e1)) {
            r1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null) {
                fragment.g1(z5);
                if (z6) {
                    fragment.f2674v.N(z5, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N0(int i6) {
        return this.f2978u >= i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O(Menu menu) {
        boolean z5 = false;
        if (this.f2978u < 1) {
            return false;
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null && L0(fragment) && fragment.h1(menu)) {
                z5 = true;
            }
        }
        return z5;
    }

    public boolean O0() {
        return this.I || this.J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P() {
        s1();
        L(this.f2982y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        S(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        this.J = true;
        this.P.q(true);
        S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        S(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(Fragment fragment, Intent intent, int i6, Bundle bundle) {
        if (this.D == null) {
            this.f2979v.z(fragment, intent, i6, bundle);
            return;
        }
        this.G.addLast(new k(fragment.f2658f, i6));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.a(intent);
    }

    void V0(int i6, boolean z5) {
        o oVar;
        if (this.f2979v == null && i6 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i6 != this.f2978u) {
            this.f2978u = i6;
            this.f2960c.t();
            q1();
            if (this.H && (oVar = this.f2979v) != null && this.f2978u == 7) {
                oVar.A();
                this.H = false;
            }
        }
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2960c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f2962e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i6 = 0; i6 < size2; i6++) {
                Fragment fragment = (Fragment) this.f2962e.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f2961d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i7 = 0; i7 < size; i7++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2961d.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2966i.get());
        synchronized (this.f2958a) {
            int size3 = this.f2958a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i8 = 0; i8 < size3; i8++) {
                    l lVar = (l) this.f2958a.get(i8);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i8);
                    printWriter.print(": ");
                    printWriter.println(lVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2979v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2980w);
        if (this.f2981x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2981x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2978u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0() {
        if (this.f2979v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.q(false);
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null) {
                fragment.i0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0(FragmentContainerView fragmentContainerView) {
        View view;
        for (c0 c0Var : this.f2960c.k()) {
            Fragment k6 = c0Var.k();
            if (k6.f2677y == fragmentContainerView.getId() && (view = k6.I) != null && view.getParent() == null) {
                k6.H = fragmentContainerView;
                c0Var.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(l lVar, boolean z5) {
        if (!z5) {
            if (this.f2979v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            q();
        }
        synchronized (this.f2958a) {
            if (this.f2979v == null) {
                if (!z5) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f2958a.add(lVar);
                k1();
            }
        }
    }

    void Y0(c0 c0Var) {
        Fragment k6 = c0Var.k();
        if (k6.J) {
            if (this.f2959b) {
                this.L = true;
            } else {
                k6.J = false;
                c0Var.m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(int i6, int i7, boolean z5) {
        if (i6 >= 0) {
            Y(new m(null, i6, i7), z5);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a0(boolean z5) {
        Z(z5);
        boolean z6 = false;
        while (n0(this.M, this.N)) {
            z6 = true;
            this.f2959b = true;
            try {
                f1(this.M, this.N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f2960c.b();
        return z6;
    }

    public boolean a1() {
        return c1(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(l lVar, boolean z5) {
        if (z5 && (this.f2979v == null || this.K)) {
            return;
        }
        Z(z5);
        if (lVar.a(this.M, this.N)) {
            this.f2959b = true;
            try {
                f1(this.M, this.N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f2960c.b();
    }

    public boolean b1(int i6, int i7) {
        if (i6 >= 0) {
            return c1(null, i6, i7);
        }
        throw new IllegalArgumentException("Bad id: " + i6);
    }

    boolean d1(ArrayList arrayList, ArrayList arrayList2, String str, int i6, int i7) {
        int g02 = g0(str, i6, (i7 & 1) != 0);
        if (g02 < 0) {
            return false;
        }
        for (int size = this.f2961d.size() - 1; size >= g02; size--) {
            arrayList.add((androidx.fragment.app.a) this.f2961d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean e0() {
        boolean a02 = a0(true);
        m0();
        return a02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(Fragment fragment) {
        if (H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2671s);
        }
        boolean z5 = !fragment.d0();
        if (!fragment.B || z5) {
            this.f2960c.u(fragment);
            if (I0(fragment)) {
                this.H = true;
            }
            fragment.f2665m = true;
            o1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f0(String str) {
        return this.f2960c.f(str);
    }

    public Fragment h0(int i6) {
        return this.f2960c.g(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(Parcelable parcelable) {
        c0 c0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2979v.o().getClassLoader());
                this.f2968k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2979v.o().getClassLoader());
                arrayList.add((b0) bundle.getParcelable("state"));
            }
        }
        this.f2960c.x(arrayList);
        y yVar = (y) bundle3.getParcelable("state");
        if (yVar == null) {
            return;
        }
        this.f2960c.v();
        Iterator it = yVar.f3000a.iterator();
        while (it.hasNext()) {
            b0 B = this.f2960c.B((String) it.next(), null);
            if (B != null) {
                Fragment j6 = this.P.j(B.f2742b);
                if (j6 != null) {
                    if (H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j6);
                    }
                    c0Var = new c0(this.f2971n, this.f2960c, j6, B);
                } else {
                    c0Var = new c0(this.f2971n, this.f2960c, this.f2979v.o().getClassLoader(), s0(), B);
                }
                Fragment k6 = c0Var.k();
                k6.f2672t = this;
                if (H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k6.f2658f + "): " + k6);
                }
                c0Var.o(this.f2979v.o().getClassLoader());
                this.f2960c.r(c0Var);
                c0Var.t(this.f2978u);
            }
        }
        for (Fragment fragment : this.P.m()) {
            if (!this.f2960c.c(fragment.f2658f)) {
                if (H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + yVar.f3000a);
                }
                this.P.p(fragment);
                fragment.f2672t = this;
                c0 c0Var2 = new c0(this.f2971n, this.f2960c, fragment);
                c0Var2.t(1);
                c0Var2.m();
                fragment.f2665m = true;
                c0Var2.m();
            }
        }
        this.f2960c.w(yVar.f3001b);
        if (yVar.f3002c != null) {
            this.f2961d = new ArrayList(yVar.f3002c.length);
            int i6 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = yVar.f3002c;
                if (i6 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a b6 = bVarArr[i6].b(this);
                if (H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + b6.f2725v + "): " + b6);
                    PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
                    b6.s("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2961d.add(b6);
                i6++;
            }
        } else {
            this.f2961d = null;
        }
        this.f2966i.set(yVar.f3003d);
        String str3 = yVar.f3004e;
        if (str3 != null) {
            Fragment f02 = f0(str3);
            this.f2982y = f02;
            L(f02);
        }
        ArrayList arrayList2 = yVar.f3005f;
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                this.f2967j.put((String) arrayList2.get(i7), (androidx.fragment.app.c) yVar.f3006g.get(i7));
            }
        }
        this.G = new ArrayDeque(yVar.f3007h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(androidx.fragment.app.a aVar) {
        if (this.f2961d == null) {
            this.f2961d = new ArrayList();
        }
        this.f2961d.add(aVar);
    }

    public Fragment i0(String str) {
        return this.f2960c.h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 j(Fragment fragment) {
        String str = fragment.Q;
        if (str != null) {
            c0.c.f(fragment, str);
        }
        if (H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        c0 v5 = v(fragment);
        fragment.f2672t = this;
        this.f2960c.r(v5);
        if (!fragment.B) {
            this.f2960c.a(fragment);
            fragment.f2665m = false;
            if (fragment.I == null) {
                fragment.N = false;
            }
            if (I0(fragment)) {
                this.H = true;
            }
        }
        return v5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment j0(String str) {
        return this.f2960c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public Bundle P0() {
        androidx.fragment.app.b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        m0();
        X();
        a0(true);
        this.I = true;
        this.P.q(true);
        ArrayList y5 = this.f2960c.y();
        ArrayList m6 = this.f2960c.m();
        if (!m6.isEmpty()) {
            ArrayList z5 = this.f2960c.z();
            ArrayList arrayList = this.f2961d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i6 = 0; i6 < size; i6++) {
                    bVarArr[i6] = new androidx.fragment.app.b((androidx.fragment.app.a) this.f2961d.get(i6));
                    if (H0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.f2961d.get(i6));
                    }
                }
            }
            y yVar = new y();
            yVar.f3000a = y5;
            yVar.f3001b = z5;
            yVar.f3002c = bVarArr;
            yVar.f3003d = this.f2966i.get();
            Fragment fragment = this.f2982y;
            if (fragment != null) {
                yVar.f3004e = fragment.f2658f;
            }
            yVar.f3005f.addAll(this.f2967j.keySet());
            yVar.f3006g.addAll(this.f2967j.values());
            yVar.f3007h = new ArrayList(this.G);
            bundle.putParcelable("state", yVar);
            for (String str : this.f2968k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f2968k.get(str));
            }
            Iterator it = m6.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", b0Var);
                bundle.putBundle("fragment_" + b0Var.f2742b, bundle2);
            }
        } else if (H0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public void k(a0 a0Var) {
        this.f2972o.add(a0Var);
    }

    void k1() {
        synchronized (this.f2958a) {
            boolean z5 = true;
            if (this.f2958a.size() != 1) {
                z5 = false;
            }
            if (z5) {
                this.f2979v.t().removeCallbacks(this.R);
                this.f2979v.t().post(this.R);
                s1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f2966i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1(Fragment fragment, boolean z5) {
        ViewGroup r02 = r0(fragment);
        if (r02 == null || !(r02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) r02).setDrawDisappearingViewsLast(!z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(androidx.fragment.app.o r4, androidx.fragment.app.l r5, androidx.fragment.app.Fragment r6) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.m(androidx.fragment.app.o, androidx.fragment.app.l, androidx.fragment.app.Fragment):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m1(Fragment fragment, h.b bVar) {
        if (fragment.equals(f0(fragment.f2658f)) && (fragment.f2673u == null || fragment.f2672t == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            if (fragment.f2664l) {
                return;
            }
            this.f2960c.a(fragment);
            if (H0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (I0(fragment)) {
                this.H = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.f2658f)) && (fragment.f2673u == null || fragment.f2672t == this))) {
            Fragment fragment2 = this.f2982y;
            this.f2982y = fragment;
            L(fragment2);
            L(this.f2982y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public e0 o() {
        return new androidx.fragment.app.a(this);
    }

    public int o0() {
        ArrayList arrayList = this.f2961d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    boolean p() {
        boolean z5 = false;
        for (Fragment fragment : this.f2960c.l()) {
            if (fragment != null) {
                z5 = I0(fragment);
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p1(Fragment fragment) {
        if (H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.N = !fragment.N;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.l q0() {
        return this.f2980w;
    }

    public n s0() {
        n nVar = this.f2983z;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f2981x;
        return fragment != null ? fragment.f2672t.s0() : this.A;
    }

    public List t0() {
        return this.f2960c.o();
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2981x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2981x;
        } else {
            o oVar = this.f2979v;
            if (oVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2979v;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public o u0() {
        return this.f2979v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 v(Fragment fragment) {
        c0 n6 = this.f2960c.n(fragment.f2658f);
        if (n6 != null) {
            return n6;
        }
        c0 c0Var = new c0(this.f2971n, this.f2960c, fragment);
        c0Var.o(this.f2979v.o().getClassLoader());
        c0Var.t(this.f2978u);
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 v0() {
        return this.f2963f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(Fragment fragment) {
        if (H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.B) {
            return;
        }
        fragment.B = true;
        if (fragment.f2664l) {
            if (H0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2960c.u(fragment);
            if (I0(fragment)) {
                this.H = true;
            }
            o1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q w0() {
        return this.f2971n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment x0() {
        return this.f2981x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        S(0);
    }

    public Fragment y0() {
        return this.f2982y;
    }

    void z(Configuration configuration, boolean z5) {
        if (z5 && (this.f2979v instanceof androidx.core.content.h)) {
            r1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f2960c.o()) {
            if (fragment != null) {
                fragment.S0(configuration);
                if (z5) {
                    fragment.f2674v.z(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0 z0() {
        l0 l0Var = this.B;
        if (l0Var != null) {
            return l0Var;
        }
        Fragment fragment = this.f2981x;
        return fragment != null ? fragment.f2672t.z0() : this.C;
    }
}
