package h.a.z.a;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ListCompositeDisposable.java */
/* loaded from: classes2.dex */
public final class e implements h.a.x.c, b {

    /* renamed from: f, reason: collision with root package name */
    List<h.a.x.c> f17977f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f17978g;

    @Override // h.a.z.a.b
    public boolean a(h.a.x.c cVar) {
        if (!c(cVar)) {
            return false;
        }
        cVar.d();
        return true;
    }

    @Override // h.a.z.a.b
    public boolean b(h.a.x.c cVar) {
        h.a.z.b.b.c(cVar, "d is null");
        if (!this.f17978g) {
            synchronized (this) {
                if (!this.f17978g) {
                    List list = this.f17977f;
                    if (list == null) {
                        list = new LinkedList();
                        this.f17977f = list;
                    }
                    list.add(cVar);
                    return true;
                }
            }
        }
        cVar.d();
        return false;
    }

    @Override // h.a.z.a.b
    public boolean c(h.a.x.c cVar) {
        h.a.z.b.b.c(cVar, "Disposable item is null");
        if (this.f17978g) {
            return false;
        }
        synchronized (this) {
            if (this.f17978g) {
                return false;
            }
            List<h.a.x.c> list = this.f17977f;
            if (list != null && list.remove(cVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // h.a.x.c
    public void d() {
        if (this.f17978g) {
            return;
        }
        synchronized (this) {
            if (this.f17978g) {
                return;
            }
            this.f17978g = true;
            List<h.a.x.c> list = this.f17977f;
            this.f17977f = null;
            e(list);
        }
    }

    void e(List<h.a.x.c> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<h.a.x.c> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().d();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw h.a.z.j.c.c((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    @Override // h.a.x.c
    public boolean f() {
        return this.f17978g;
    }
}
