package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a extends g implements Map {

    /* renamed from: h, reason: collision with root package name */
    f f7213h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0112a extends f {
        C0112a() {
        }

        @Override // l.f
        protected void a() {
            a.this.clear();
        }

        @Override // l.f
        protected Object b(int i6, int i7) {
            return a.this.f7262b[(i6 << 1) + i7];
        }

        @Override // l.f
        protected Map c() {
            return a.this;
        }

        @Override // l.f
        protected int d() {
            return a.this.f7263c;
        }

        @Override // l.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // l.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // l.f
        protected void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        @Override // l.f
        protected void h(int i6) {
            a.this.k(i6);
        }

        @Override // l.f
        protected Object i(int i6, Object obj) {
            return a.this.l(i6, obj);
        }
    }

    public a() {
    }

    public a(int i6) {
        super(i6);
    }

    private f n() {
        if (this.f7213h == null) {
            this.f7213h = new C0112a();
        }
        return this.f7213h;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public boolean o(Collection collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f7263c + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }

    public a(g gVar) {
        super(gVar);
    }
}
