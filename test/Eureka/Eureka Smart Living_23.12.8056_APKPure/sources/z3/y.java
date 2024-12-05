package z3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y implements k4.b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f10045b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f10044a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection collection) {
        this.f10044a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y b(Collection collection) {
        return new y((Set) collection);
    }

    private synchronized void d() {
        Iterator it = this.f10044a.iterator();
        while (it.hasNext()) {
            this.f10045b.add(((k4.b) it.next()).get());
        }
        this.f10044a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(k4.b bVar) {
        Set set;
        Object obj;
        if (this.f10045b == null) {
            set = this.f10044a;
            obj = bVar;
        } else {
            set = this.f10045b;
            obj = bVar.get();
        }
        set.add(obj);
    }

    @Override // k4.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f10045b == null) {
            synchronized (this) {
                if (this.f10045b == null) {
                    this.f10045b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f10045b);
    }
}
