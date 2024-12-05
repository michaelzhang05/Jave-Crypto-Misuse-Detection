package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.lifecycle.f;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerImpl.java */
/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.h implements LayoutInflater.Factory2 {

    /* renamed from: h, reason: collision with root package name */
    static boolean f1127h = false;

    /* renamed from: i, reason: collision with root package name */
    static final Interpolator f1128i = new DecelerateInterpolator(2.5f);

    /* renamed from: j, reason: collision with root package name */
    static final Interpolator f1129j = new DecelerateInterpolator(1.5f);
    Fragment A;
    Fragment B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    ArrayList<androidx.fragment.app.a> H;
    ArrayList<Boolean> I;
    ArrayList<Fragment> J;
    ArrayList<m> M;
    private androidx.fragment.app.j N;

    /* renamed from: k, reason: collision with root package name */
    ArrayList<k> f1130k;
    boolean l;
    ArrayList<androidx.fragment.app.a> p;
    ArrayList<Fragment> q;
    private OnBackPressedDispatcher r;
    ArrayList<androidx.fragment.app.a> t;
    ArrayList<Integer> u;
    ArrayList<h.c> v;
    androidx.fragment.app.g y;
    androidx.fragment.app.d z;
    int m = 0;
    final ArrayList<Fragment> n = new ArrayList<>();
    final HashMap<String, Fragment> o = new HashMap<>();
    private final androidx.activity.b s = new a(false);
    private final CopyOnWriteArrayList<C0024i> w = new CopyOnWriteArrayList<>();
    int x = 0;
    Bundle K = null;
    SparseArray<Parcelable> L = null;
    Runnable O = new b();

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            i.this.H0();
        }
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f1133b;

        /* compiled from: FragmentManagerImpl.java */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f1133b.getAnimatingAway() != null) {
                    c.this.f1133b.setAnimatingAway(null);
                    c cVar = c.this;
                    i iVar = i.this;
                    Fragment fragment = cVar.f1133b;
                    iVar.X0(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.a = viewGroup;
            this.f1133b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1136b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1137c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.f1136b = view;
            this.f1137c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f1136b);
            Animator animator2 = this.f1137c.getAnimator();
            this.f1137c.setAnimator(null);
            if (animator2 == null || this.a.indexOfChild(this.f1136b) >= 0) {
                return;
            }
            i iVar = i.this;
            Fragment fragment = this.f1137c;
            iVar.X0(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1139b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1140c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.f1139b = view;
            this.f1140c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f1139b);
            animator.removeListener(this);
            Fragment fragment = this.f1140c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class f extends androidx.fragment.app.f {
        f() {
        }

        @Override // androidx.fragment.app.f
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.g gVar = i.this.y;
            return gVar.a(gVar.e(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentManagerImpl.java */
    /* renamed from: androidx.fragment.app.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0024i {
        final h.b a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f1149b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class j {
        public static final int[] a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    private class l implements k {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final int f1150b;

        /* renamed from: c, reason: collision with root package name */
        final int f1151c;

        l(String str, int i2, int i3) {
            this.a = str;
            this.f1150b = i2;
            this.f1151c = i3;
        }

        @Override // androidx.fragment.app.i.k
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = i.this.B;
            if (fragment == null || this.f1150b >= 0 || this.a != null || !fragment.getChildFragmentManager().n()) {
                return i.this.b1(arrayList, arrayList2, this.a, this.f1150b, this.f1151c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class m implements Fragment.e {
        final boolean a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f1153b;

        /* renamed from: c, reason: collision with root package name */
        private int f1154c;

        m(androidx.fragment.app.a aVar, boolean z) {
            this.a = z;
            this.f1153b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.e
        public void a() {
            this.f1154c++;
        }

        @Override // androidx.fragment.app.Fragment.e
        public void b() {
            int i2 = this.f1154c - 1;
            this.f1154c = i2;
            if (i2 != 0) {
                return;
            }
            this.f1153b.s.m1();
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f1153b;
            aVar.s.D(aVar, this.a, false, false);
        }

        public void d() {
            boolean z = this.f1154c > 0;
            i iVar = this.f1153b.s;
            int size = iVar.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = iVar.n.get(i2);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            androidx.fragment.app.a aVar = this.f1153b;
            aVar.s.D(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.f1154c == 0;
        }
    }

    private void A0() {
        if (this.M != null) {
            while (!this.M.isEmpty()) {
                this.M.remove(0).d();
            }
        }
    }

    private void B() {
        if (N0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void C() {
        this.l = false;
        this.I.clear();
        this.H.clear();
    }

    private boolean C0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f1130k;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f1130k.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.f1130k.get(i2).a(arrayList, arrayList2);
                }
                this.f1130k.clear();
                this.y.f().removeCallbacks(this.O);
                return z;
            }
            return false;
        }
    }

    private boolean K0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.A();
    }

    static g Q0(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(f1129j);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g S0(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1128i);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(f1129j);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void T0(c.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment D = bVar.D(i2);
            if (!D.mAdded) {
                View requireView = D.requireView();
                D.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    private boolean a1(String str, int i2, int i3) {
        t0();
        r0(true);
        Fragment fragment = this.B;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().n()) {
            return true;
        }
        boolean b1 = b1(this.H, this.I, str, i2, i3);
        if (b1) {
            this.l = true;
            try {
                e1(this.H, this.I);
            } finally {
                C();
            }
        }
        u1();
        o0();
        z();
        return b1;
    }

    private int c1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, c.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.D() && !aVar.B(arrayList, i5 + 1, i3)) {
                if (this.M == null) {
                    this.M = new ArrayList<>();
                }
                m mVar = new m(aVar, booleanValue);
                this.M.add(mVar);
                aVar.F(mVar);
                if (booleanValue) {
                    aVar.x();
                } else {
                    aVar.y(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                r(bVar);
            }
        }
        return i4;
    }

    private void e1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 != null && arrayList.size() == arrayList2.size()) {
            x0(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).q) {
                    if (i3 != i2) {
                        w0(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).q) {
                            i3++;
                        }
                    }
                    w0(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                w0(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void f0(Fragment fragment) {
        if (fragment == null || this.o.get(fragment.mWho) != fragment) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public static int i1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void m0(int i2) {
        try {
            this.l = true;
            V0(i2, false);
            this.l = false;
            t0();
        } catch (Throwable th) {
            this.l = false;
            throw th;
        }
    }

    private void p0() {
        for (Fragment fragment : this.o.values()) {
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    X0(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    private void r(c.e.b<Fragment> bVar) {
        int i2 = this.x;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.n.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.n.get(i3);
            if (fragment.mState < min) {
                X0(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void r0(boolean z) {
        if (!this.l) {
            if (this.y != null) {
                if (Looper.myLooper() == this.y.f().getLooper()) {
                    if (!z) {
                        B();
                    }
                    if (this.H == null) {
                        this.H = new ArrayList<>();
                        this.I = new ArrayList<>();
                    }
                    this.l = true;
                    try {
                        x0(null, null);
                        return;
                    } finally {
                        this.l = false;
                    }
                }
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private void s1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c.h.j.c("FragmentManager"));
        androidx.fragment.app.g gVar = this.y;
        if (gVar != null) {
            try {
                gVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            b("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    public static int t1(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    private void u1() {
        ArrayList<k> arrayList = this.f1130k;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s.f(true);
        } else {
            this.s.f(g() > 0 && L0(this.A));
        }
    }

    private static void v0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.t(-1);
                aVar.y(i2 == i3 + (-1));
            } else {
                aVar.t(1);
                aVar.x();
            }
            i2++;
        }
    }

    private void w(Fragment fragment, g gVar, int i2) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i2);
        if (gVar.a != null) {
            h hVar = new h(gVar.a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.mView.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f1143b;
        fragment.setAnimator(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private void w0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).q;
        ArrayList<Fragment> arrayList3 = this.J;
        if (arrayList3 == null) {
            this.J = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.J.addAll(this.n);
        Fragment F0 = F0();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            if (!arrayList2.get(i7).booleanValue()) {
                F0 = aVar.z(this.J, F0);
            } else {
                F0 = aVar.G(this.J, F0);
            }
            z2 = z2 || aVar.f1168h;
        }
        this.J.clear();
        if (!z) {
            n.B(this, arrayList, arrayList2, i2, i3, false);
        }
        v0(arrayList, arrayList2, i2, i3);
        if (z) {
            c.e.b<Fragment> bVar = new c.e.b<>();
            r(bVar);
            int c1 = c1(arrayList, arrayList2, i2, i3, bVar);
            T0(bVar);
            i4 = c1;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            n.B(this, arrayList, arrayList2, i2, i4, true);
            V0(this.x, true);
        }
        while (i6 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.u) >= 0) {
                B0(i5);
                aVar2.u = -1;
            }
            aVar2.E();
            i6++;
        }
        if (z2) {
            g1();
        }
    }

    private void x0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.M;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.M.get(i2);
            if (arrayList != null && !mVar.a && (indexOf2 = arrayList.indexOf(mVar.f1153b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                this.M.remove(i2);
                i2--;
                size--;
                mVar.c();
            } else if (mVar.e() || (arrayList != null && mVar.f1153b.B(arrayList, 0, arrayList.size()))) {
                this.M.remove(i2);
                i2--;
                size--;
                if (arrayList != null && !mVar.a && (indexOf = arrayList.indexOf(mVar.f1153b)) != -1 && arrayList2.get(indexOf).booleanValue()) {
                    mVar.c();
                } else {
                    mVar.d();
                }
            }
            i2++;
        }
    }

    private void z() {
        this.o.values().removeAll(Collections.singleton(null));
    }

    private Fragment z0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.n.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.n.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    boolean A() {
        boolean z = false;
        for (Fragment fragment : this.o.values()) {
            if (fragment != null) {
                z = K0(fragment);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void B0(int i2) {
        synchronized (this) {
            this.t.set(i2, null);
            if (this.u == null) {
                this.u = new ArrayList<>();
            }
            if (f1127h) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.u.add(Integer.valueOf(i2));
        }
    }

    void D(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.y(z3);
        } else {
            aVar.x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            n.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            V0(this.x, true);
        }
        for (Fragment fragment : this.o.values()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.A(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    androidx.fragment.app.j D0(Fragment fragment) {
        return this.N.f(fragment);
    }

    void E(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            g O0 = O0(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (O0 != null && (animator = O0.f1143b) != null) {
                animator.setTarget(fragment.mView);
                if (fragment.mHidden) {
                    if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        O0.f1143b.addListener(new e(viewGroup, view, fragment));
                    }
                } else {
                    fragment.mView.setVisibility(0);
                }
                O0.f1143b.start();
            } else {
                if (O0 != null) {
                    fragment.mView.startAnimation(O0.a);
                    O0.a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
        }
        if (fragment.mAdded && K0(fragment)) {
            this.C = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 E0() {
        return this;
    }

    public void F(Fragment fragment) {
        if (f1127h) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (f1127h) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.n) {
                this.n.remove(fragment);
            }
            if (K0(fragment)) {
                this.C = true;
            }
            fragment.mAdded = false;
        }
    }

    public Fragment F0() {
        return this.B;
    }

    public void G() {
        this.D = false;
        this.E = false;
        m0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w G0(Fragment fragment) {
        return this.N.i(fragment);
    }

    public void H(Configuration configuration) {
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    void H0() {
        t0();
        if (this.s.c()) {
            n();
        } else {
            this.r.c();
        }
    }

    public boolean I(MenuItem menuItem) {
        if (this.x < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void I0(Fragment fragment) {
        if (f1127h) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
    }

    public void J() {
        this.D = false;
        this.E = false;
        m0(1);
    }

    public boolean J0() {
        return this.F;
    }

    public boolean K(Menu menu, MenuInflater menuInflater) {
        if (this.x < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.q != null) {
            for (int i3 = 0; i3 < this.q.size(); i3++) {
                Fragment fragment2 = this.q.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.q = arrayList;
        return z;
    }

    public void L() {
        this.F = true;
        t0();
        m0(0);
        this.y = null;
        this.z = null;
        this.A = null;
        if (this.r != null) {
            this.s.d();
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        i iVar = fragment.mFragmentManager;
        return fragment == iVar.F0() && L0(iVar.A);
    }

    public void M() {
        m0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M0(int i2) {
        return this.x >= i2;
    }

    public void N() {
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public boolean N0() {
        return this.D || this.E;
    }

    public void O(boolean z) {
        for (int size = this.n.size() - 1; size >= 0; size--) {
            Fragment fragment = this.n.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    g O0(Fragment fragment, int i2, boolean z, int i3) {
        int t1;
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(i2, z, nextAnim);
        if (onCreateAnimation != null) {
            return new g(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i2, z, nextAnim);
        if (onCreateAnimator != null) {
            return new g(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.y.e().getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.y.e(), nextAnim);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.y.e(), nextAnim);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.y.e(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (t1 = t1(i2, z)) < 0) {
            return null;
        }
        switch (t1) {
            case 1:
                return S0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return S0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return S0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return S0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return Q0(0.0f, 1.0f);
            case 6:
                return Q0(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.y.l()) {
                    i3 = this.y.k();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    void P(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).P(fragment, bundle, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(Fragment fragment) {
        if (this.o.get(fragment.mWho) != null) {
            return;
        }
        this.o.put(fragment.mWho, fragment);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                u(fragment);
            } else {
                f1(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (f1127h) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void Q(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).Q(fragment, context, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    void R(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).R(fragment, bundle, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    void R0(Fragment fragment) {
        if (this.o.get(fragment.mWho) == null) {
            return;
        }
        if (f1127h) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.o.values()) {
            if (fragment2 != null && fragment.mWho.equals(fragment2.mTargetWho)) {
                fragment2.mTarget = fragment;
                fragment2.mTargetWho = null;
            }
        }
        this.o.put(fragment.mWho, null);
        f1(fragment);
        String str = fragment.mTargetWho;
        if (str != null) {
            fragment.mTarget = this.o.get(str);
        }
        fragment.initState();
    }

    void S(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).S(fragment, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    void T(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).T(fragment, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    void U(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).U(fragment, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.o.containsKey(fragment.mWho)) {
            if (f1127h) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.x + "since it is not added to " + this);
                return;
            }
            return;
        }
        int i2 = this.x;
        if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, 0);
            }
        }
        X0(fragment, i2, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
        if (fragment.mView != null) {
            Fragment z0 = z0(fragment);
            if (z0 != null) {
                View view = z0.mView;
                ViewGroup viewGroup = fragment.mContainer;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.mView, indexOfChild);
                }
            }
            if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                g O0 = O0(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                if (O0 != null) {
                    Animation animation = O0.a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        O0.f1143b.setTarget(fragment.mView);
                        O0.f1143b.start();
                    }
                }
            }
        }
        if (fragment.mHiddenChanged) {
            E(fragment);
        }
    }

    void V(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).V(fragment, context, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0(int i2, boolean z) {
        androidx.fragment.app.g gVar;
        if (this.y == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.x) {
            this.x = i2;
            int size = this.n.size();
            for (int i3 = 0; i3 < size; i3++) {
                U0(this.n.get(i3));
            }
            for (Fragment fragment : this.o.values()) {
                if (fragment != null && (fragment.mRemoving || fragment.mDetached)) {
                    if (!fragment.mIsNewlyAdded) {
                        U0(fragment);
                    }
                }
            }
            r1();
            if (this.C && (gVar = this.y) != null && this.x == 4) {
                gVar.r();
                this.C = false;
            }
        }
    }

    void W(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).W(fragment, bundle, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    void W0(Fragment fragment) {
        X0(fragment, this.x, 0, 0, false);
    }

    void X(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).X(fragment, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r0 != 3) goto L265;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.X0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void Y(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).Y(fragment, bundle, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    public void Y0() {
        this.D = false;
        this.E = false;
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void Z(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).Z(fragment, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    public void Z0(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.l) {
                this.G = true;
            } else {
                fragment.mDeferStart = false;
                X0(fragment, this.x, 0, 0, false);
            }
        }
    }

    @Override // androidx.fragment.app.h
    public androidx.fragment.app.m a() {
        return new androidx.fragment.app.a(this);
    }

    void a0(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).a0(fragment, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.h
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.o.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.o.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.n.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = this.n.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.q;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = this.q.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.p;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.p.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.v(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.t;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (androidx.fragment.app.a) this.t.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            ArrayList<Integer> arrayList4 = this.u;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.u.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f1130k;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (k) this.f1130k.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.z);
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.A);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.x);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.D);
        printWriter.print(" mStopped=");
        printWriter.print(this.E);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.F);
        if (this.C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.C);
        }
    }

    void b0(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).b0(fragment, view, bundle, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    boolean b1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.p;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.p.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.p.get(size2);
                    if ((str != null && str.equals(aVar.getName())) || (i2 >= 0 && i2 == aVar.u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.p.get(size2);
                        if (str == null || !str.equals(aVar2.getName())) {
                            if (i2 < 0 || i2 != aVar2.u) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.p.size() - 1) {
                return false;
            }
            for (int size3 = this.p.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.p.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.h
    public boolean c() {
        boolean t0 = t0();
        A0();
        return t0;
    }

    void c0(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A;
        if (fragment2 != null) {
            androidx.fragment.app.h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof i) {
                ((i) fragmentManager).c0(fragment, true);
            }
        }
        Iterator<C0024i> it = this.w.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            if (!z || next.f1149b) {
                h.b bVar = next.a;
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.h
    public Fragment d(int i2) {
        for (int size = this.n.size() - 1; size >= 0; size--) {
            Fragment fragment = this.n.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.o.values()) {
            if (fragment2 != null && fragment2.mFragmentId == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public boolean d0(MenuItem menuItem) {
        if (this.x < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void d1(Fragment fragment) {
        if (f1127h) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.n) {
                this.n.remove(fragment);
            }
            if (K0(fragment)) {
                this.C = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    @Override // androidx.fragment.app.h
    public Fragment e(String str) {
        if (str != null) {
            for (int size = this.n.size() - 1; size >= 0; size--) {
                Fragment fragment = this.n.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.o.values()) {
            if (fragment2 != null && str.equals(fragment2.mTag)) {
                return fragment2;
            }
        }
        return null;
    }

    public void e0(Menu menu) {
        if (this.x < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    @Override // androidx.fragment.app.h
    public h.a f(int i2) {
        return this.p.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1(Fragment fragment) {
        if (N0()) {
            if (f1127h) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.N.k(fragment) && f1127h) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.h
    public int g() {
        ArrayList<androidx.fragment.app.a> arrayList = this.p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void g0() {
        m0(3);
    }

    void g1() {
        if (this.v != null) {
            for (int i2 = 0; i2 < this.v.size(); i2++) {
                this.v.get(i2).a();
            }
        }
    }

    @Override // androidx.fragment.app.h
    public Fragment h(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.o.get(string);
        if (fragment == null) {
            s1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void h0(boolean z) {
        for (int size = this.n.size() - 1; size >= 0; size--) {
            Fragment fragment = this.n.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(Parcelable parcelable) {
        FragmentState fragmentState;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f1107f == null) {
            return;
        }
        for (Fragment fragment : this.N.h()) {
            if (f1127h) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<FragmentState> it = fragmentManagerState.f1107f.iterator();
            while (true) {
                if (it.hasNext()) {
                    fragmentState = it.next();
                    if (fragmentState.f1113g.equals(fragment.mWho)) {
                        break;
                    }
                } else {
                    fragmentState = null;
                    break;
                }
            }
            if (fragmentState == null) {
                if (f1127h) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f1107f);
                }
                X0(fragment, 1, 0, 0, false);
                fragment.mRemoving = true;
                X0(fragment, 0, 0, 0, false);
            } else {
                fragmentState.s = fragment;
                fragment.mSavedViewState = null;
                fragment.mBackStackNesting = 0;
                fragment.mInLayout = false;
                fragment.mAdded = false;
                Fragment fragment2 = fragment.mTarget;
                fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
                fragment.mTarget = null;
                Bundle bundle = fragmentState.r;
                if (bundle != null) {
                    bundle.setClassLoader(this.y.e().getClassLoader());
                    fragment.mSavedViewState = fragmentState.r.getSparseParcelableArray("android:view_state");
                    fragment.mSavedFragmentState = fragmentState.r;
                }
            }
        }
        this.o.clear();
        Iterator<FragmentState> it2 = fragmentManagerState.f1107f.iterator();
        while (it2.hasNext()) {
            FragmentState next = it2.next();
            if (next != null) {
                Fragment a2 = next.a(this.y.e().getClassLoader(), i());
                a2.mFragmentManager = this;
                if (f1127h) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + a2.mWho + "): " + a2);
                }
                this.o.put(a2.mWho, a2);
                next.s = null;
            }
        }
        this.n.clear();
        ArrayList<String> arrayList = fragmentManagerState.f1108g;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.o.get(next2);
                if (fragment3 == null) {
                    s1(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                }
                fragment3.mAdded = true;
                if (f1127h) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (!this.n.contains(fragment3)) {
                    synchronized (this.n) {
                        this.n.add(fragment3);
                    }
                } else {
                    throw new IllegalStateException("Already added " + fragment3);
                }
            }
        }
        if (fragmentManagerState.f1109h != null) {
            this.p = new ArrayList<>(fragmentManagerState.f1109h.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f1109h;
                if (i2 >= backStackStateArr.length) {
                    break;
                }
                androidx.fragment.app.a a3 = backStackStateArr[i2].a(this);
                if (f1127h) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a3.u + "): " + a3);
                    PrintWriter printWriter = new PrintWriter(new c.h.j.c("FragmentManager"));
                    a3.w("  ", printWriter, false);
                    printWriter.close();
                }
                this.p.add(a3);
                int i3 = a3.u;
                if (i3 >= 0) {
                    n1(i3, a3);
                }
                i2++;
            }
        } else {
            this.p = null;
        }
        String str = fragmentManagerState.f1110i;
        if (str != null) {
            Fragment fragment4 = this.o.get(str);
            this.B = fragment4;
            f0(fragment4);
        }
        this.m = fragmentManagerState.f1111j;
    }

    @Override // androidx.fragment.app.h
    public androidx.fragment.app.f i() {
        if (super.i() == androidx.fragment.app.h.f1125f) {
            Fragment fragment = this.A;
            if (fragment != null) {
                return fragment.mFragmentManager.i();
            }
            q(new f());
        }
        return super.i();
    }

    public boolean i0(Menu menu) {
        if (this.x < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            Fragment fragment = this.n.get(i2);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.fragment.app.h
    public List<Fragment> j() {
        List<Fragment> list;
        if (this.n.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.n) {
            list = (List) this.n.clone();
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0() {
        u1();
        f0(this.B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable j1() {
        ArrayList<String> arrayList;
        int size;
        A0();
        p0();
        t0();
        this.D = true;
        BackStackState[] backStackStateArr = null;
        if (this.o.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.o.size());
        boolean z = false;
        for (Fragment fragment : this.o.values()) {
            if (fragment != null) {
                if (fragment.mFragmentManager != this) {
                    s1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                arrayList2.add(fragmentState);
                if (fragment.mState > 0 && fragmentState.r == null) {
                    fragmentState.r = k1(fragment);
                    String str = fragment.mTargetWho;
                    if (str != null) {
                        Fragment fragment2 = this.o.get(str);
                        if (fragment2 == null) {
                            s1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.mTargetWho));
                        }
                        if (fragmentState.r == null) {
                            fragmentState.r = new Bundle();
                        }
                        o(fragmentState.r, "android:target_state", fragment2);
                        int i2 = fragment.mTargetRequestCode;
                        if (i2 != 0) {
                            fragmentState.r.putInt("android:target_req_state", i2);
                        }
                    }
                } else {
                    fragmentState.r = fragment.mSavedFragmentState;
                }
                if (f1127h) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.r);
                }
                z = true;
            }
        }
        if (!z) {
            if (f1127h) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.n.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.n.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (next.mFragmentManager != this) {
                    s1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (f1127h) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.p;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStackStateArr[i3] = new BackStackState(this.p.get(i3));
                if (f1127h) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.p.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1107f = arrayList2;
        fragmentManagerState.f1108g = arrayList;
        fragmentManagerState.f1109h = backStackStateArr;
        Fragment fragment3 = this.B;
        if (fragment3 != null) {
            fragmentManagerState.f1110i = fragment3.mWho;
        }
        fragmentManagerState.f1111j = this.m;
        return fragmentManagerState;
    }

    @Override // androidx.fragment.app.h
    public void k() {
        q0(new l(null, -1, 0), false);
    }

    public void k0() {
        this.D = false;
        this.E = false;
        m0(4);
    }

    Bundle k1(Fragment fragment) {
        if (this.K == null) {
            this.K = new Bundle();
        }
        fragment.performSaveInstanceState(this.K);
        Y(fragment, this.K, false);
        Bundle bundle = null;
        if (!this.K.isEmpty()) {
            Bundle bundle2 = this.K;
            this.K = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            l1(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.h
    public void l(int i2, int i3) {
        if (i2 >= 0) {
            q0(new l(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void l0() {
        this.D = false;
        this.E = false;
        m0(3);
    }

    void l1(Fragment fragment) {
        if (fragment.mInnerView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.L;
        if (sparseArray == null) {
            this.L = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.mInnerView.saveHierarchyState(this.L);
        if (this.L.size() > 0) {
            fragment.mSavedViewState = this.L;
            this.L = null;
        }
    }

    @Override // androidx.fragment.app.h
    public void m(String str, int i2) {
        q0(new l(str, -1, i2), false);
    }

    void m1() {
        synchronized (this) {
            ArrayList<m> arrayList = this.M;
            boolean z = false;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f1130k;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.y.f().removeCallbacks(this.O);
                this.y.f().post(this.O);
                u1();
            }
        }
    }

    @Override // androidx.fragment.app.h
    public boolean n() {
        B();
        return a1(null, -1, 0);
    }

    public void n0() {
        this.E = true;
        m0(2);
    }

    public void n1(int i2, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.t == null) {
                this.t = new ArrayList<>();
            }
            int size = this.t.size();
            if (i2 < size) {
                if (f1127h) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.t.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.t.add(null);
                    if (this.u == null) {
                        this.u = new ArrayList<>();
                    }
                    if (f1127h) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.u.add(Integer.valueOf(size));
                    size++;
                }
                if (f1127h) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.t.add(aVar);
            }
        }
    }

    @Override // androidx.fragment.app.h
    public void o(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            s1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    void o0() {
        if (this.G) {
            this.G = false;
            r1();
        }
    }

    public void o1(Fragment fragment, f.b bVar) {
        if (this.o.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.f.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment d2 = resourceId != -1 ? d(resourceId) : null;
        if (d2 == null && string != null) {
            d2 = e(string);
        }
        if (d2 == null && id != -1) {
            d2 = d(id);
        }
        if (f1127h) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + d2);
        }
        if (d2 == null) {
            d2 = i().a(context.getClassLoader(), str2);
            d2.mFromLayout = true;
            d2.mFragmentId = resourceId != 0 ? resourceId : id;
            d2.mContainerId = id;
            d2.mTag = string;
            d2.mInLayout = true;
            d2.mFragmentManager = this;
            androidx.fragment.app.g gVar = this.y;
            d2.mHost = gVar;
            d2.onInflate(gVar.e(), attributeSet, d2.mSavedFragmentState);
            t(d2, true);
        } else if (!d2.mInLayout) {
            d2.mInLayout = true;
            androidx.fragment.app.g gVar2 = this.y;
            d2.mHost = gVar2;
            d2.onInflate(gVar2.e(), attributeSet, d2.mSavedFragmentState);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
        }
        Fragment fragment = d2;
        if (this.x < 1 && fragment.mFromLayout) {
            X0(fragment, 1, 0, 0, false);
        } else {
            W0(fragment);
        }
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // androidx.fragment.app.h
    public Fragment.SavedState p(Fragment fragment) {
        Bundle k1;
        if (fragment.mFragmentManager != this) {
            s1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0 || (k1 = k1(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(k1);
    }

    public void p1(Fragment fragment) {
        if (fragment != null && (this.o.get(fragment.mWho) != fragment || (fragment.mHost != null && fragment.getFragmentManager() != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.B;
        this.B = fragment;
        f0(fragment2);
        f0(this.B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0(androidx.fragment.app.i.k r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.B()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.F     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            androidx.fragment.app.g r0 = r1.y     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<androidx.fragment.app.i$k> r3 = r1.f1130k     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f1130k = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<androidx.fragment.app.i$k> r3 = r1.f1130k     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.m1()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.q0(androidx.fragment.app.i$k, boolean):void");
    }

    public void q1(Fragment fragment) {
        if (f1127h) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void r1() {
        for (Fragment fragment : this.o.values()) {
            if (fragment != null) {
                Z0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(androidx.fragment.app.a aVar) {
        if (this.p == null) {
            this.p = new ArrayList<>();
        }
        this.p.add(aVar);
    }

    void s0(Fragment fragment) {
        if (!fragment.mFromLayout || fragment.mPerformedCreateView) {
            return;
        }
        fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
        View view = fragment.mView;
        if (view != null) {
            fragment.mInnerView = view;
            view.setSaveFromParentEnabled(false);
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
            b0(fragment, fragment.mView, fragment.mSavedFragmentState, false);
            return;
        }
        fragment.mInnerView = null;
    }

    public void t(Fragment fragment, boolean z) {
        if (f1127h) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        P0(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.n.contains(fragment)) {
            synchronized (this.n) {
                this.n.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (K0(fragment)) {
                this.C = true;
            }
            if (z) {
                W0(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public boolean t0() {
        r0(true);
        boolean z = false;
        while (C0(this.H, this.I)) {
            this.l = true;
            try {
                e1(this.H, this.I);
                C();
                z = true;
            } catch (Throwable th) {
                C();
                throw th;
            }
        }
        u1();
        o0();
        z();
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.A;
        if (fragment != null) {
            c.h.j.b.a(fragment, sb);
        } else {
            c.h.j.b.a(this.y, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Fragment fragment) {
        if (N0()) {
            if (f1127h) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.N.d(fragment) && f1127h) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public void u0(k kVar, boolean z) {
        if (z && (this.y == null || this.F)) {
            return;
        }
        r0(z);
        if (kVar.a(this.H, this.I)) {
            this.l = true;
            try {
                e1(this.H, this.I);
            } finally {
                C();
            }
        }
        u1();
        o0();
        z();
    }

    public int v(androidx.fragment.app.a aVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.u;
            if (arrayList != null && arrayList.size() > 0) {
                int intValue = this.u.remove(r0.size() - 1).intValue();
                if (f1127h) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                }
                this.t.set(intValue, aVar);
                return intValue;
            }
            if (this.t == null) {
                this.t = new ArrayList<>();
            }
            int size = this.t.size();
            if (f1127h) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.t.add(aVar);
            return size;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x(androidx.fragment.app.g gVar, androidx.fragment.app.d dVar, Fragment fragment) {
        if (this.y == null) {
            this.y = gVar;
            this.z = dVar;
            this.A = fragment;
            if (fragment != null) {
                u1();
            }
            if (gVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) gVar;
                OnBackPressedDispatcher onBackPressedDispatcher = cVar.getOnBackPressedDispatcher();
                this.r = onBackPressedDispatcher;
                androidx.lifecycle.j jVar = cVar;
                if (fragment != null) {
                    jVar = fragment;
                }
                onBackPressedDispatcher.a(jVar, this.s);
            }
            if (fragment != null) {
                this.N = fragment.mFragmentManager.D0(fragment);
                return;
            } else if (gVar instanceof x) {
                this.N = androidx.fragment.app.j.g(((x) gVar).getViewModelStore());
                return;
            } else {
                this.N = new androidx.fragment.app.j(false);
                return;
            }
        }
        throw new IllegalStateException("Already attached");
    }

    public void y(Fragment fragment) {
        if (f1127h) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.n.contains(fragment)) {
                if (f1127h) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.n) {
                    this.n.add(fragment);
                }
                fragment.mAdded = true;
                if (K0(fragment)) {
                    this.C = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public Fragment y0(String str) {
        Fragment findFragmentByWho;
        for (Fragment fragment : this.o.values()) {
            if (fragment != null && (findFragmentByWho = fragment.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class g {
        public final Animation a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f1143b;

        g(Animation animation) {
            this.a = animation;
            this.f1143b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        g(Animator animator) {
            this.a = null;
            this.f1143b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class h extends AnimationSet implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final ViewGroup f1144f;

        /* renamed from: g, reason: collision with root package name */
        private final View f1145g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1146h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1147i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f1148j;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1148j = true;
            this.f1144f = viewGroup;
            this.f1145g = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f1148j = true;
            if (this.f1146h) {
                return !this.f1147i;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f1146h = true;
                androidx.core.view.r.a(this.f1144f, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f1146h && this.f1148j) {
                this.f1148j = false;
                this.f1144f.post(this);
            } else {
                this.f1144f.endViewTransition(this.f1145g);
                this.f1147i = true;
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f1148j = true;
            if (this.f1146h) {
                return !this.f1147i;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f1146h = true;
                androidx.core.view.r.a(this.f1144f, this);
            }
            return true;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
