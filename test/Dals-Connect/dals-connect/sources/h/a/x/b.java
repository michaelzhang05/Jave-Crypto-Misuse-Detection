package h.a.x;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* compiled from: CompositeDisposable.java */
/* loaded from: classes2.dex */
public final class b implements c, h.a.z.a.b {

    /* renamed from: f, reason: collision with root package name */
    h.a.z.j.e<c> f17970f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f17971g;

    @Override // h.a.z.a.b
    public boolean a(c cVar) {
        if (!c(cVar)) {
            return false;
        }
        cVar.d();
        return true;
    }

    @Override // h.a.z.a.b
    public boolean b(c cVar) {
        h.a.z.b.b.c(cVar, "disposable is null");
        if (!this.f17971g) {
            synchronized (this) {
                if (!this.f17971g) {
                    h.a.z.j.e<c> eVar = this.f17970f;
                    if (eVar == null) {
                        eVar = new h.a.z.j.e<>();
                        this.f17970f = eVar;
                    }
                    eVar.a(cVar);
                    return true;
                }
            }
        }
        cVar.d();
        return false;
    }

    @Override // h.a.z.a.b
    public boolean c(c cVar) {
        h.a.z.b.b.c(cVar, "disposables is null");
        if (this.f17971g) {
            return false;
        }
        synchronized (this) {
            if (this.f17971g) {
                return false;
            }
            h.a.z.j.e<c> eVar = this.f17970f;
            if (eVar != null && eVar.e(cVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // h.a.x.c
    public void d() {
        if (this.f17971g) {
            return;
        }
        synchronized (this) {
            if (this.f17971g) {
                return;
            }
            this.f17971g = true;
            h.a.z.j.e<c> eVar = this.f17970f;
            this.f17970f = null;
            e(eVar);
        }
    }

    void e(h.a.z.j.e<c> eVar) {
        if (eVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : eVar.b()) {
            if (obj instanceof c) {
                try {
                    ((c) obj).d();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
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
        return this.f17971g;
    }
}
