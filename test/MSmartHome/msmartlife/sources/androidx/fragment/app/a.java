package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import androidx.lifecycle.f;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends m implements h.a, i.k {
    final i s;
    boolean t;
    int u = -1;

    public a(i iVar) {
        this.s = iVar;
    }

    private static boolean C(m.a aVar) {
        Fragment fragment = aVar.f1172b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).f1172b;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).f1172b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).f1172b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (C(this.a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void E() {
        if (this.r != null) {
            for (int i2 = 0; i2 < this.r.size(); i2++) {
                this.r.get(i2).run();
            }
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(Fragment.e eVar) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            m.a aVar = this.a.get(i2);
            if (C(aVar)) {
                aVar.f1172b.setOnStartEnterTransitionListener(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment G(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            m.a aVar = this.a.get(size);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1172b;
                            break;
                        case 10:
                            aVar.f1178h = aVar.f1177g;
                            break;
                    }
                }
                arrayList.add(aVar.f1172b);
            }
            arrayList.remove(aVar.f1172b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.i.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (i.f1127h) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1168h) {
            return true;
        }
        this.s.s(this);
        return true;
    }

    @Override // androidx.fragment.app.h.a
    public String getName() {
        return this.f1170j;
    }

    @Override // androidx.fragment.app.m
    public int h() {
        return u(false);
    }

    @Override // androidx.fragment.app.m
    public int i() {
        return u(true);
    }

    @Override // androidx.fragment.app.m
    public void j() {
        m();
        this.s.u0(this, false);
    }

    @Override // androidx.fragment.app.m
    public void k() {
        m();
        this.s.u0(this, true);
    }

    @Override // androidx.fragment.app.m
    public m l(Fragment fragment) {
        i iVar = fragment.mFragmentManager;
        if (iVar != null && iVar != this.s) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.l(fragment);
    }

    @Override // androidx.fragment.app.m
    void n(int i2, Fragment fragment, String str, int i3) {
        super.n(i2, fragment, str, i3);
        fragment.mFragmentManager = this.s;
    }

    @Override // androidx.fragment.app.m
    public m o(Fragment fragment) {
        i iVar = fragment.mFragmentManager;
        if (iVar != null && iVar != this.s) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.o(fragment);
    }

    @Override // androidx.fragment.app.m
    public m s(Fragment fragment, f.b bVar) {
        if (fragment.mFragmentManager == this.s) {
            f.b bVar2 = f.b.CREATED;
            if (bVar.d(bVar2)) {
                return super.s(fragment, bVar);
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + bVar2);
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i2) {
        if (this.f1168h) {
            if (i.f1127h) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                m.a aVar = this.a.get(i3);
                Fragment fragment = aVar.f1172b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (i.f1127h) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1172b + " to " + aVar.f1172b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.u >= 0) {
            sb.append(" #");
            sb.append(this.u);
        }
        if (this.f1170j != null) {
            sb.append(" ");
            sb.append(this.f1170j);
        }
        sb.append("}");
        return sb.toString();
    }

    int u(boolean z) {
        if (!this.t) {
            if (i.f1127h) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new c.h.j.c("FragmentManager"));
                v("  ", printWriter);
                printWriter.close();
            }
            this.t = true;
            if (this.f1168h) {
                this.u = this.s.v(this);
            } else {
                this.u = -1;
            }
            this.s.q0(this, z);
            return this.u;
        }
        throw new IllegalStateException("commit already called");
    }

    public void v(String str, PrintWriter printWriter) {
        w(str, printWriter, true);
    }

    public void w(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1170j);
            printWriter.print(" mIndex=");
            printWriter.print(this.u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.t);
            if (this.f1166f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1166f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1167g));
            }
            if (this.f1162b != 0 || this.f1163c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1162b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1163c));
            }
            if (this.f1164d != 0 || this.f1165e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1164d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1165e));
            }
            if (this.f1171k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1171k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.l);
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.n);
            }
        }
        if (this.a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            m.a aVar = this.a.get(i2);
            switch (aVar.a) {
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
                case 5:
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
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1172b);
            if (z) {
                if (aVar.f1173c != 0 || aVar.f1174d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1173c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1174d));
                }
                if (aVar.f1175e != 0 || aVar.f1176f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1175e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1176f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            m.a aVar = this.a.get(i2);
            Fragment fragment = aVar.f1172b;
            if (fragment != null) {
                fragment.setNextTransition(this.f1166f, this.f1167g);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setNextAnim(aVar.f1173c);
                    this.s.t(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.setNextAnim(aVar.f1174d);
                    this.s.d1(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f1174d);
                    this.s.I0(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f1173c);
                    this.s.q1(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f1174d);
                    this.s.F(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f1173c);
                    this.s.y(fragment);
                    break;
                case 8:
                    this.s.p1(fragment);
                    break;
                case 9:
                    this.s.p1(null);
                    break;
                case 10:
                    this.s.o1(fragment, aVar.f1178h);
                    break;
            }
            if (!this.q && aVar.a != 1 && fragment != null) {
                this.s.U0(fragment);
            }
        }
        if (this.q) {
            return;
        }
        i iVar = this.s;
        iVar.V0(iVar.x, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            m.a aVar = this.a.get(size);
            Fragment fragment = aVar.f1172b;
            if (fragment != null) {
                fragment.setNextTransition(i.i1(this.f1166f), this.f1167g);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setNextAnim(aVar.f1176f);
                    this.s.d1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.setNextAnim(aVar.f1175e);
                    this.s.t(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f1175e);
                    this.s.q1(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f1176f);
                    this.s.I0(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f1175e);
                    this.s.y(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f1176f);
                    this.s.F(fragment);
                    break;
                case 8:
                    this.s.p1(null);
                    break;
                case 9:
                    this.s.p1(fragment);
                    break;
                case 10:
                    this.s.o1(fragment, aVar.f1177g);
                    break;
            }
            if (!this.q && aVar.a != 3 && fragment != null) {
                this.s.U0(fragment);
            }
        }
        if (this.q || !z) {
            return;
        }
        i iVar = this.s;
        iVar.V0(iVar.x, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment z(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.a.size()) {
            m.a aVar = this.a.get(i2);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.f1172b;
                    int i4 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.a.add(i2, new m.a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                m.a aVar2 = new m.a(3, fragment4);
                                aVar2.f1173c = aVar.f1173c;
                                aVar2.f1175e = aVar.f1175e;
                                aVar2.f1174d = aVar.f1174d;
                                aVar2.f1176f = aVar.f1176f;
                                this.a.add(i2, aVar2);
                                arrayList.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i2);
                        i2--;
                    } else {
                        aVar.a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.f1172b);
                    Fragment fragment5 = aVar.f1172b;
                    if (fragment5 == fragment2) {
                        this.a.add(i2, new m.a(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.a.add(i2, new m.a(9, fragment2));
                        i2++;
                        fragment2 = aVar.f1172b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.f1172b);
            i2++;
        }
        return fragment2;
    }
}
