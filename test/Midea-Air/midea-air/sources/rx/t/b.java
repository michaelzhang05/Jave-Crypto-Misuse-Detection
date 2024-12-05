package rx.t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rx.k;

/* compiled from: CompositeSubscription.java */
/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: f, reason: collision with root package name */
    private Set<k> f23272f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f23273g;

    private static void e(Collection<k> collection) {
        if (collection == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<k> it = collection.iterator();
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        rx.exceptions.a.d(arrayList);
    }

    public void a(k kVar) {
        if (kVar.isUnsubscribed()) {
            return;
        }
        if (!this.f23273g) {
            synchronized (this) {
                if (!this.f23273g) {
                    if (this.f23272f == null) {
                        this.f23272f = new HashSet(4);
                    }
                    this.f23272f.add(kVar);
                    return;
                }
            }
        }
        kVar.unsubscribe();
    }

    public void b() {
        Set<k> set;
        if (this.f23273g) {
            return;
        }
        synchronized (this) {
            if (!this.f23273g && (set = this.f23272f) != null) {
                this.f23272f = null;
                e(set);
            }
        }
    }

    public boolean c() {
        Set<k> set;
        boolean z = false;
        if (this.f23273g) {
            return false;
        }
        synchronized (this) {
            if (!this.f23273g && (set = this.f23272f) != null && !set.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    public void d(k kVar) {
        Set<k> set;
        if (this.f23273g) {
            return;
        }
        synchronized (this) {
            if (!this.f23273g && (set = this.f23272f) != null) {
                boolean remove = set.remove(kVar);
                if (remove) {
                    kVar.unsubscribe();
                }
            }
        }
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.f23273g;
    }

    @Override // rx.k
    public void unsubscribe() {
        if (this.f23273g) {
            return;
        }
        synchronized (this) {
            if (this.f23273g) {
                return;
            }
            this.f23273g = true;
            Set<k> set = this.f23272f;
            this.f23272f = null;
            e(set);
        }
    }
}
