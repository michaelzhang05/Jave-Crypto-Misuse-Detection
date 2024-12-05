package i.a.g;

import androidx.recyclerview.widget.RecyclerView;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ListenerStatus.java */
/* loaded from: classes2.dex */
public class m<T extends EventListener> {
    private final T a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18362b;

    /* compiled from: ListenerStatus.java */
    /* loaded from: classes2.dex */
    public static class a extends m<i.a.e> {

        /* renamed from: c, reason: collision with root package name */
        private static k.b.b f18363c = k.b.c.i(a.class.getName());

        /* renamed from: d, reason: collision with root package name */
        private final ConcurrentMap<String, i.a.d> f18364d;

        public a(i.a.e eVar, boolean z) {
            super(eVar, z);
            this.f18364d = new ConcurrentHashMap(32);
        }

        private static final boolean c(i.a.d dVar, i.a.d dVar2) {
            if (dVar == null || dVar2 == null || !dVar.equals(dVar2)) {
                return false;
            }
            byte[] r = dVar.r();
            byte[] r2 = dVar2.r();
            if (r.length != r2.length) {
                return false;
            }
            for (int i2 = 0; i2 < r.length; i2++) {
                if (r[i2] != r2[i2]) {
                    return false;
                }
            }
            return dVar.v(dVar2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d(i.a.c cVar) {
            if (this.f18364d.putIfAbsent(cVar.e() + "." + cVar.g(), cVar.d().clone()) == null) {
                a().serviceAdded(cVar);
                i.a.d d2 = cVar.d();
                if (d2 == null || !d2.u()) {
                    return;
                }
                a().serviceResolved(cVar);
                return;
            }
            f18363c.c("Service Added called for a service already added: " + cVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(i.a.c cVar) {
            String str = cVar.e() + "." + cVar.g();
            ConcurrentMap<String, i.a.d> concurrentMap = this.f18364d;
            if (concurrentMap.remove(str, concurrentMap.get(str))) {
                a().serviceRemoved(cVar);
                return;
            }
            f18363c.c("Service Removed called for a service already removed: " + cVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public synchronized void f(i.a.c cVar) {
            i.a.d d2 = cVar.d();
            if (d2 != null && d2.u()) {
                String str = cVar.e() + "." + cVar.g();
                i.a.d dVar = this.f18364d.get(str);
                if (c(d2, dVar)) {
                    f18363c.c("Service Resolved called for a service already resolved: " + cVar);
                } else if (dVar == null) {
                    if (this.f18364d.putIfAbsent(str, d2.clone()) == null) {
                        a().serviceResolved(cVar);
                    }
                } else if (this.f18364d.replace(str, dVar, d2.clone())) {
                    a().serviceResolved(cVar);
                }
            } else {
                f18363c.h("Service Resolved called for an unresolved event: " + cVar);
            }
        }

        @Override // i.a.g.m
        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(a().toString());
            if (this.f18364d.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                Iterator<String> it = this.f18364d.keySet().iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: ListenerStatus.java */
    /* loaded from: classes2.dex */
    public static class b extends m<i.a.f> {

        /* renamed from: c, reason: collision with root package name */
        private static k.b.b f18365c = k.b.c.i(b.class.getName());

        /* renamed from: d, reason: collision with root package name */
        private final ConcurrentMap<String, String> f18366d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(i.a.c cVar) {
            if (this.f18366d.putIfAbsent(cVar.g(), cVar.g()) == null) {
                a().b(cVar);
                return;
            }
            f18365c.i("Service Type Added called for a service type already added: " + cVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d(i.a.c cVar) {
            if (this.f18366d.putIfAbsent(cVar.g(), cVar.g()) == null) {
                a().a(cVar);
                return;
            }
            f18365c.i("Service Sub Type Added called for a service sub type already added: " + cVar);
        }

        @Override // i.a.g.m
        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(a().toString());
            if (this.f18366d.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                Iterator<String> it = this.f18366d.keySet().iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public m(T t, boolean z) {
        this.a = t;
        this.f18362b = z;
    }

    public T a() {
        return this.a;
    }

    public boolean b() {
        return this.f18362b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && a().equals(((m) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "[Status for " + a().toString() + "]";
    }
}
