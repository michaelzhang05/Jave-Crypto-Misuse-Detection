package androidx.work.impl.m.e;

import androidx.work.impl.n.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class c<T> implements androidx.work.impl.m.a<T> {
    private final List<String> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private T f1979b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.impl.m.f.d<T> f1980c;

    /* renamed from: d, reason: collision with root package name */
    private a f1981d;

    /* compiled from: ConstraintController.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(androidx.work.impl.m.f.d<T> dVar) {
        this.f1980c = dVar;
    }

    private void h(a aVar, T t) {
        if (this.a.isEmpty() || aVar == null) {
            return;
        }
        if (t != null && !c(t)) {
            aVar.a(this.a);
        } else {
            aVar.b(this.a);
        }
    }

    @Override // androidx.work.impl.m.a
    public void a(T t) {
        this.f1979b = t;
        h(this.f1981d, t);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t);

    public boolean d(String str) {
        T t = this.f1979b;
        return t != null && c(t) && this.a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.a.add(pVar.f2018c);
            }
        }
        if (this.a.isEmpty()) {
            this.f1980c.c(this);
        } else {
            this.f1980c.a(this);
        }
        h(this.f1981d, this.f1979b);
    }

    public void f() {
        if (this.a.isEmpty()) {
            return;
        }
        this.a.clear();
        this.f1980c.c(this);
    }

    public void g(a aVar) {
        if (this.f1981d != aVar) {
            this.f1981d = aVar;
            h(aVar, this.f1979b);
        }
    }
}
