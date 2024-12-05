package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.e0;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends e0 implements w.l {

    /* renamed from: t, reason: collision with root package name */
    final w f2723t;

    /* renamed from: u, reason: collision with root package name */
    boolean f2724u;

    /* renamed from: v, reason: collision with root package name */
    int f2725v;

    /* renamed from: w, reason: collision with root package name */
    boolean f2726w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(w wVar) {
        super(wVar.s0(), wVar.u0() != null ? wVar.u0().o().getClassLoader() : null);
        this.f2725v = -1;
        this.f2726w = false;
        this.f2723t = wVar;
    }

    @Override // androidx.fragment.app.w.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (w.H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2844i) {
            return true;
        }
        this.f2723t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.e0
    public int f() {
        return q(false);
    }

    @Override // androidx.fragment.app.e0
    public int g() {
        return q(true);
    }

    @Override // androidx.fragment.app.e0
    public void h() {
        j();
        this.f2723t.b0(this, false);
    }

    @Override // androidx.fragment.app.e0
    public void i() {
        j();
        this.f2723t.b0(this, true);
    }

    @Override // androidx.fragment.app.e0
    void k(int i6, Fragment fragment, String str, int i7) {
        super.k(i6, fragment, str, i7);
        fragment.f2672t = this.f2723t;
    }

    @Override // androidx.fragment.app.e0
    public e0 l(Fragment fragment) {
        w wVar = fragment.f2672t;
        if (wVar == null || wVar == this.f2723t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i6) {
        if (this.f2844i) {
            if (w.H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i6);
            }
            int size = this.f2838c.size();
            for (int i7 = 0; i7 < size; i7++) {
                e0.a aVar = (e0.a) this.f2838c.get(i7);
                Fragment fragment = aVar.f2856b;
                if (fragment != null) {
                    fragment.f2671s += i6;
                    if (w.H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2856b + " to " + aVar.f2856b.f2671s);
                    }
                }
            }
        }
    }

    int q(boolean z5) {
        if (this.f2724u) {
            throw new IllegalStateException("commit already called");
        }
        if (w.H0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
            r("  ", printWriter);
            printWriter.close();
        }
        this.f2724u = true;
        this.f2725v = this.f2844i ? this.f2723t.l() : -1;
        this.f2723t.Y(this, z5);
        return this.f2725v;
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2846k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2725v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2724u);
            if (this.f2843h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2843h));
            }
            if (this.f2839d != 0 || this.f2840e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2839d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2840e));
            }
            if (this.f2841f != 0 || this.f2842g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2841f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2842g));
            }
            if (this.f2847l != 0 || this.f2848m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2847l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2848m);
            }
            if (this.f2849n != 0 || this.f2850o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2849n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2850o);
            }
        }
        if (this.f2838c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2838c.size();
        for (int i6 = 0; i6 < size; i6++) {
            e0.a aVar = (e0.a) this.f2838c.get(i6);
            switch (aVar.f2855a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2855a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i6);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2856b);
            if (z5) {
                if (aVar.f2858d != 0 || aVar.f2859e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2858d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2859e));
                }
                if (aVar.f2860f != 0 || aVar.f2861g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2860f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2861g));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    public void t() {
        w wVar;
        int size = this.f2838c.size();
        for (int i6 = 0; i6 < size; i6++) {
            e0.a aVar = (e0.a) this.f2838c.get(i6);
            Fragment fragment = aVar.f2856b;
            if (fragment != null) {
                fragment.f2666n = this.f2726w;
                fragment.B1(false);
                fragment.A1(this.f2843h);
                fragment.D1(this.f2851p, this.f2852q);
            }
            switch (aVar.f2855a) {
                case 1:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.l1(fragment, false);
                    this.f2723t.j(fragment);
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2855a);
                case 3:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.e1(fragment);
                case 4:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.E0(fragment);
                case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.l1(fragment, false);
                    this.f2723t.p1(fragment);
                case 6:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.w(fragment);
                case 7:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.l1(fragment, false);
                    this.f2723t.n(fragment);
                case 8:
                    wVar = this.f2723t;
                    wVar.n1(fragment);
                case 9:
                    wVar = this.f2723t;
                    fragment = null;
                    wVar.n1(fragment);
                case 10:
                    this.f2723t.m1(fragment, aVar.f2863i);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2725v >= 0) {
            sb.append(" #");
            sb.append(this.f2725v);
        }
        if (this.f2846k != null) {
            sb.append(" ");
            sb.append(this.f2846k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002f. Please report as an issue. */
    public void u() {
        w wVar;
        for (int size = this.f2838c.size() - 1; size >= 0; size--) {
            e0.a aVar = (e0.a) this.f2838c.get(size);
            Fragment fragment = aVar.f2856b;
            if (fragment != null) {
                fragment.f2666n = this.f2726w;
                fragment.B1(true);
                fragment.A1(w.i1(this.f2843h));
                fragment.D1(this.f2852q, this.f2851p);
            }
            switch (aVar.f2855a) {
                case 1:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.l1(fragment, true);
                    this.f2723t.e1(fragment);
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2855a);
                case 3:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.j(fragment);
                case 4:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.p1(fragment);
                case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.l1(fragment, true);
                    this.f2723t.E0(fragment);
                case 6:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.n(fragment);
                case 7:
                    fragment.x1(aVar.f2858d, aVar.f2859e, aVar.f2860f, aVar.f2861g);
                    this.f2723t.l1(fragment, true);
                    this.f2723t.w(fragment);
                case 8:
                    wVar = this.f2723t;
                    fragment = null;
                    wVar.n1(fragment);
                case 9:
                    wVar = this.f2723t;
                    wVar.n1(fragment);
                case 10:
                    this.f2723t.m1(fragment, aVar.f2862h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment v(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i6 = 0;
        while (i6 < this.f2838c.size()) {
            e0.a aVar = (e0.a) this.f2838c.get(i6);
            int i7 = aVar.f2855a;
            if (i7 != 1) {
                if (i7 == 2) {
                    Fragment fragment3 = aVar.f2856b;
                    int i8 = fragment3.f2677y;
                    boolean z5 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.f2677y == i8) {
                            if (fragment4 == fragment3) {
                                z5 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2838c.add(i6, new e0.a(9, fragment4, true));
                                    i6++;
                                    fragment2 = null;
                                }
                                e0.a aVar2 = new e0.a(3, fragment4, true);
                                aVar2.f2858d = aVar.f2858d;
                                aVar2.f2860f = aVar.f2860f;
                                aVar2.f2859e = aVar.f2859e;
                                aVar2.f2861g = aVar.f2861g;
                                this.f2838c.add(i6, aVar2);
                                arrayList.remove(fragment4);
                                i6++;
                            }
                        }
                    }
                    if (z5) {
                        this.f2838c.remove(i6);
                        i6--;
                    } else {
                        aVar.f2855a = 1;
                        aVar.f2857c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i7 == 3 || i7 == 6) {
                    arrayList.remove(aVar.f2856b);
                    Fragment fragment5 = aVar.f2856b;
                    if (fragment5 == fragment2) {
                        this.f2838c.add(i6, new e0.a(9, fragment5));
                        i6++;
                        fragment2 = null;
                    }
                } else if (i7 != 7) {
                    if (i7 == 8) {
                        this.f2838c.add(i6, new e0.a(9, fragment2, true));
                        aVar.f2857c = true;
                        i6++;
                        fragment2 = aVar.f2856b;
                    }
                }
                i6++;
            }
            arrayList.add(aVar.f2856b);
            i6++;
        }
        return fragment2;
    }

    public String w() {
        return this.f2846k;
    }

    public void x() {
        if (this.f2854s != null) {
            for (int i6 = 0; i6 < this.f2854s.size(); i6++) {
                ((Runnable) this.f2854s.get(i6)).run();
            }
            this.f2854s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment y(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f2838c.size() - 1; size >= 0; size--) {
            e0.a aVar = (e0.a) this.f2838c.get(size);
            int i6 = aVar.f2855a;
            if (i6 != 1) {
                if (i6 != 3) {
                    switch (i6) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2856b;
                            break;
                        case 10:
                            aVar.f2863i = aVar.f2862h;
                            break;
                    }
                }
                arrayList.add(aVar.f2856b);
            }
            arrayList.remove(aVar.f2856b);
        }
        return fragment;
    }
}
