package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.f;
import androidx.core.view.b1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f2912a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f2913b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f2914c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f2915d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f2916e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f2917a;

        a(d dVar) {
            this.f2917a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k0.this.f2913b.contains(this.f2917a)) {
                this.f2917a.e().a(this.f2917a.f().I);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f2919a;

        b(d dVar) {
            this.f2919a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.f2913b.remove(this.f2919a);
            k0.this.f2914c.remove(this.f2919a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2921a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2922b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2922b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2922b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2922b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2921a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2921a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2921a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2921a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final c0 f2923h;

        d(e.c cVar, e.b bVar, c0 c0Var, androidx.core.os.f fVar) {
            super(cVar, bVar, c0Var.k(), fVar);
            this.f2923h = c0Var;
        }

        @Override // androidx.fragment.app.k0.e
        public void c() {
            super.c();
            this.f2923h.m();
        }

        @Override // androidx.fragment.app.k0.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment k6 = this.f2923h.k();
                    View t12 = k6.t1();
                    if (w.H0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + t12.findFocus() + " on view " + t12 + " for Fragment " + k6);
                    }
                    t12.clearFocus();
                    return;
                }
                return;
            }
            Fragment k7 = this.f2923h.k();
            View findFocus = k7.I.findFocus();
            if (findFocus != null) {
                k7.z1(findFocus);
                if (w.H0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k7);
                }
            }
            View t13 = f().t1();
            if (t13.getParent() == null) {
                this.f2923h.b();
                t13.setAlpha(0.0f);
            }
            if (t13.getAlpha() == 0.0f && t13.getVisibility() == 0) {
                t13.setVisibility(4);
            }
            t13.setAlpha(k7.M());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f2924a;

        /* renamed from: b, reason: collision with root package name */
        private b f2925b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f2926c;

        /* renamed from: d, reason: collision with root package name */
        private final List f2927d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet f2928e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private boolean f2929f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2930g = false;

        /* loaded from: classes.dex */
        class a implements f.b {
            a() {
            }

            @Override // androidx.core.os.f.b
            public void a() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c b(int i6) {
                if (i6 == 0) {
                    return VISIBLE;
                }
                if (i6 == 4) {
                    return INVISIBLE;
                }
                if (i6 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i6);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void a(View view) {
                int i6;
                int i7 = c.f2921a[ordinal()];
                if (i7 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (w.H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    if (w.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i6 = 0;
                } else {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            return;
                        }
                        if (w.H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (w.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i6 = 8;
                }
                view.setVisibility(i6);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.f fVar) {
            this.f2924a = cVar;
            this.f2925b = bVar;
            this.f2926c = fragment;
            fVar.c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f2927d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f2929f = true;
            if (this.f2928e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f2928e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.f) it.next()).a();
            }
        }

        public void c() {
            if (this.f2930g) {
                return;
            }
            if (w.H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2930g = true;
            Iterator it = this.f2927d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(androidx.core.os.f fVar) {
            if (this.f2928e.remove(fVar) && this.f2928e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2924a;
        }

        public final Fragment f() {
            return this.f2926c;
        }

        b g() {
            return this.f2925b;
        }

        final boolean h() {
            return this.f2929f;
        }

        final boolean i() {
            return this.f2930g;
        }

        public final void j(androidx.core.os.f fVar) {
            l();
            this.f2928e.add(fVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i6 = c.f2922b[bVar.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3 && this.f2924a != c.REMOVED) {
                        if (w.H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2926c + " mFinalState = " + this.f2924a + " -> " + cVar + ". ");
                        }
                        this.f2924a = cVar;
                        return;
                    }
                    return;
                }
                if (w.H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2926c + " mFinalState = " + this.f2924a + " -> REMOVED. mLifecycleImpact  = " + this.f2925b + " to REMOVING.");
                }
                this.f2924a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f2924a != c.REMOVED) {
                    return;
                }
                if (w.H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2926c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2925b + " to ADDING.");
                }
                this.f2924a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f2925b = bVar2;
        }

        abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2924a + "} {mLifecycleImpact = " + this.f2925b + "} {mFragment = " + this.f2926c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(ViewGroup viewGroup) {
        this.f2912a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, c0 c0Var) {
        synchronized (this.f2913b) {
            androidx.core.os.f fVar = new androidx.core.os.f();
            e h6 = h(c0Var.k());
            if (h6 != null) {
                h6.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c0Var, fVar);
            this.f2913b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator it = this.f2913b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator it = this.f2914c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k0 n(ViewGroup viewGroup, w wVar) {
        return o(viewGroup, wVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k0 o(ViewGroup viewGroup, l0 l0Var) {
        Object tag = viewGroup.getTag(b0.b.f3803b);
        if (tag instanceof k0) {
            return (k0) tag;
        }
        k0 a6 = l0Var.a(viewGroup);
        viewGroup.setTag(b0.b.f3803b, a6);
        return a6;
    }

    private void q() {
        Iterator it = this.f2913b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.b(eVar.f().t1().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.c cVar, c0 c0Var) {
        if (w.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0Var.k());
        }
        a(cVar, e.b.ADDING, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(c0 c0Var) {
        if (w.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0Var.k());
        }
        a(e.c.GONE, e.b.NONE, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(c0 c0Var) {
        if (w.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0Var.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(c0 c0Var) {
        if (w.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0Var.k());
        }
        a(e.c.VISIBLE, e.b.NONE, c0Var);
    }

    abstract void f(List list, boolean z5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f2916e) {
            return;
        }
        if (!b1.T(this.f2912a)) {
            j();
            this.f2915d = false;
            return;
        }
        synchronized (this.f2913b) {
            if (!this.f2913b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2914c);
                this.f2914c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (w.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f2914c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f2913b);
                this.f2913b.clear();
                this.f2914c.addAll(arrayList2);
                if (w.H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f2915d);
                this.f2915d = false;
                if (w.H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        if (w.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean T = b1.T(this.f2912a);
        synchronized (this.f2913b) {
            q();
            Iterator it = this.f2913b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).l();
            }
            Iterator it2 = new ArrayList(this.f2914c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (w.H0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (T) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2912a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f2913b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (w.H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (T) {
                        str = "";
                    } else {
                        str = "Container " + this.f2912a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f2916e) {
            if (w.H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f2916e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(c0 c0Var) {
        e h6 = h(c0Var.k());
        e.b g6 = h6 != null ? h6.g() : null;
        e i6 = i(c0Var.k());
        return (i6 == null || !(g6 == null || g6 == e.b.NONE)) ? g6 : i6.g();
    }

    public ViewGroup m() {
        return this.f2912a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f2913b) {
            q();
            this.f2916e = false;
            int size = this.f2913b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = (e) this.f2913b.get(size);
                e.c c6 = e.c.c(eVar.f().I);
                e.c e6 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e6 == cVar && c6 != cVar) {
                    this.f2916e = eVar.f().f0();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z5) {
        this.f2915d = z5;
    }
}
