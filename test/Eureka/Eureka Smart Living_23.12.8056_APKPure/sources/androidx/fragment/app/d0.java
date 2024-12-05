package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f2810a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f2811b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f2812c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private z f2813d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(z zVar) {
        this.f2813d = zVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0 B(String str, b0 b0Var) {
        return (b0) (b0Var != null ? this.f2812c.put(str, b0Var) : this.f2812c.remove(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (this.f2810a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2810a) {
            this.f2810a.add(fragment);
        }
        fragment.f2664l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f2811b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f2811b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i6) {
        for (c0 c0Var : this.f2811b.values()) {
            if (c0Var != null) {
                c0Var.t(i6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2811b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (c0 c0Var : this.f2811b.values()) {
                printWriter.print(str);
                if (c0Var != null) {
                    Fragment k6 = c0Var.k();
                    printWriter.println(k6);
                    k6.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2810a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i6 = 0; i6 < size; i6++) {
                Fragment fragment = (Fragment) this.f2810a.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        c0 c0Var = (c0) this.f2811b.get(str);
        if (c0Var != null) {
            return c0Var.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i6) {
        for (int size = this.f2810a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2810a.get(size);
            if (fragment != null && fragment.f2676x == i6) {
                return fragment;
            }
        }
        for (c0 c0Var : this.f2811b.values()) {
            if (c0Var != null) {
                Fragment k6 = c0Var.k();
                if (k6.f2676x == i6) {
                    return k6;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2810a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2810a.get(size);
                if (fragment != null && str.equals(fragment.f2678z)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (c0 c0Var : this.f2811b.values()) {
            if (c0Var != null) {
                Fragment k6 = c0Var.k();
                if (str.equals(k6.f2678z)) {
                    return k6;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment k6;
        for (c0 c0Var : this.f2811b.values()) {
            if (c0Var != null && (k6 = c0Var.k().k(str)) != null) {
                return k6;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.H;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2810a.indexOf(fragment);
        for (int i6 = indexOf - 1; i6 >= 0; i6--) {
            Fragment fragment2 = (Fragment) this.f2810a.get(i6);
            if (fragment2.H == viewGroup && (view2 = fragment2.I) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2810a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f2810a.get(indexOf);
            if (fragment3.H == viewGroup && (view = fragment3.I) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List k() {
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : this.f2811b.values()) {
            if (c0Var != null) {
                arrayList.add(c0Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List l() {
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : this.f2811b.values()) {
            arrayList.add(c0Var != null ? c0Var.k() : null);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList m() {
        return new ArrayList(this.f2812c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 n(String str) {
        return (c0) this.f2811b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List o() {
        ArrayList arrayList;
        if (this.f2810a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2810a) {
            arrayList = new ArrayList(this.f2810a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z p() {
        return this.f2813d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0 q(String str) {
        return (b0) this.f2812c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(c0 c0Var) {
        Fragment k6 = c0Var.k();
        if (c(k6.f2658f)) {
            return;
        }
        this.f2811b.put(k6.f2658f, c0Var);
        if (k6.D) {
            if (k6.C) {
                this.f2813d.f(k6);
            } else {
                this.f2813d.p(k6);
            }
            k6.D = false;
        }
        if (w.H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(c0 c0Var) {
        Fragment k6 = c0Var.k();
        if (k6.C) {
            this.f2813d.p(k6);
        }
        if (((c0) this.f2811b.put(k6.f2658f, null)) != null && w.H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        Iterator it = this.f2810a.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) this.f2811b.get(((Fragment) it.next()).f2658f);
            if (c0Var != null) {
                c0Var.m();
            }
        }
        for (c0 c0Var2 : this.f2811b.values()) {
            if (c0Var2 != null) {
                c0Var2.m();
                Fragment k6 = c0Var2.k();
                if (k6.f2665m && !k6.d0()) {
                    if (k6.f2666n && !this.f2812c.containsKey(k6.f2658f)) {
                        c0Var2.r();
                    }
                    s(c0Var2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Fragment fragment) {
        synchronized (this.f2810a) {
            this.f2810a.remove(fragment);
        }
        fragment.f2664l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        this.f2811b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(List list) {
        this.f2810a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f6 = f(str);
                if (f6 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (w.H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f6);
                }
                a(f6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(ArrayList arrayList) {
        this.f2812c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            this.f2812c.put(b0Var.f2742b, b0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f2811b.size());
        for (c0 c0Var : this.f2811b.values()) {
            if (c0Var != null) {
                Fragment k6 = c0Var.k();
                c0Var.r();
                arrayList.add(k6.f2658f);
                if (w.H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k6 + ": " + k6.f2654b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList z() {
        synchronized (this.f2810a) {
            if (this.f2810a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f2810a.size());
            Iterator it = this.f2810a.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                arrayList.add(fragment.f2658f);
                if (w.H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f2658f + "): " + fragment);
                }
            }
            return arrayList;
        }
    }
}
