package B0;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class y implements Z0.b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f664b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f663a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection collection) {
        this.f663a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y b(Collection collection) {
        return new y((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f663a.iterator();
            while (it.hasNext()) {
                this.f664b.add(((Z0.b) it.next()).get());
            }
            this.f663a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(Z0.b bVar) {
        try {
            if (this.f664b == null) {
                this.f663a.add(bVar);
            } else {
                this.f664b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Z0.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f664b == null) {
            synchronized (this) {
                try {
                    if (this.f664b == null) {
                        this.f664b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f664b);
    }
}
