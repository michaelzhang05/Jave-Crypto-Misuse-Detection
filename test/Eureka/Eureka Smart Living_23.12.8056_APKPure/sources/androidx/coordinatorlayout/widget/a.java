package androidx.coordinatorlayout.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final e f1909a = new f(10);

    /* renamed from: b, reason: collision with root package name */
    private final g f1910b = new g();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f1911c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f1912d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f1910b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                e(arrayList2.get(i6), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f1909a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void j(ArrayList arrayList) {
        arrayList.clear();
        this.f1909a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f1910b.containsKey(obj) || !this.f1910b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f1910b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f1910b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (this.f1910b.containsKey(obj)) {
            return;
        }
        this.f1910b.put(obj, null);
    }

    public void c() {
        int size = this.f1910b.size();
        for (int i6 = 0; i6 < size; i6++) {
            ArrayList arrayList = (ArrayList) this.f1910b.m(i6);
            if (arrayList != null) {
                j(arrayList);
            }
        }
        this.f1910b.clear();
    }

    public boolean d(Object obj) {
        return this.f1910b.containsKey(obj);
    }

    public List g(Object obj) {
        int size = this.f1910b.size();
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            ArrayList arrayList2 = (ArrayList) this.f1910b.m(i6);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1910b.i(i6));
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        this.f1911c.clear();
        this.f1912d.clear();
        int size = this.f1910b.size();
        for (int i6 = 0; i6 < size; i6++) {
            e(this.f1910b.i(i6), this.f1911c, this.f1912d);
        }
        return this.f1911c;
    }

    public boolean i(Object obj) {
        int size = this.f1910b.size();
        for (int i6 = 0; i6 < size; i6++) {
            ArrayList arrayList = (ArrayList) this.f1910b.m(i6);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
