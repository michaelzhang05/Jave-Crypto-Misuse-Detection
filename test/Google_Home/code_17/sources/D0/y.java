package D0;

import b1.InterfaceC1956b;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class y implements InterfaceC1956b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f1770b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f1769a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection collection) {
        this.f1769a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y b(Collection collection) {
        return new y((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f1769a.iterator();
            while (it.hasNext()) {
                this.f1770b.add(((InterfaceC1956b) it.next()).get());
            }
            this.f1769a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(InterfaceC1956b interfaceC1956b) {
        try {
            if (this.f1770b == null) {
                this.f1769a.add(interfaceC1956b);
            } else {
                this.f1770b.add(interfaceC1956b.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // b1.InterfaceC1956b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f1770b == null) {
            synchronized (this) {
                try {
                    if (this.f1770b == null) {
                        this.f1770b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f1770b);
    }
}
