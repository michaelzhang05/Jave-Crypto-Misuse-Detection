package androidx.coordinatorlayout.widget;

import c.h.j.g;
import c.h.j.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: classes.dex */
public final class a<T> {
    private final g<ArrayList<T>> a = new h(10);

    /* renamed from: b, reason: collision with root package name */
    private final c.e.g<T, ArrayList<T>> f797b = new c.e.g<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f798c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f799d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.f797b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    e(arrayList2.get(i2), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    private ArrayList<T> f() {
        ArrayList<T> b2 = this.a.b();
        return b2 == null ? new ArrayList<>() : b2;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (this.f797b.containsKey(t) && this.f797b.containsKey(t2)) {
            ArrayList<T> arrayList = this.f797b.get(t);
            if (arrayList == null) {
                arrayList = f();
                this.f797b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(T t) {
        if (this.f797b.containsKey(t)) {
            return;
        }
        this.f797b.put(t, null);
    }

    public void c() {
        int size = this.f797b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> m = this.f797b.m(i2);
            if (m != null) {
                k(m);
            }
        }
        this.f797b.clear();
    }

    public boolean d(T t) {
        return this.f797b.containsKey(t);
    }

    public List g(T t) {
        return this.f797b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f797b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> m = this.f797b.m(i2);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f797b.i(i2));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f798c.clear();
        this.f799d.clear();
        int size = this.f797b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e(this.f797b.i(i2), this.f798c, this.f799d);
        }
        return this.f798c;
    }

    public boolean j(T t) {
        int size = this.f797b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> m = this.f797b.m(i2);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
