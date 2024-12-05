package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public class t {
    final c.e.g<RecyclerView.c0, a> a = new c.e.g<>();

    /* renamed from: b, reason: collision with root package name */
    final c.e.d<RecyclerView.c0> f1602b = new c.e.d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {
        static c.h.j.g<a> a = new c.h.j.h(20);

        /* renamed from: b, reason: collision with root package name */
        int f1603b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.c f1604c;

        /* renamed from: d, reason: collision with root package name */
        RecyclerView.l.c f1605d;

        private a() {
        }

        static void a() {
            do {
            } while (a.b() != null);
        }

        static a b() {
            a b2 = a.b();
            return b2 == null ? new a() : b2;
        }

        static void c(a aVar) {
            aVar.f1603b = 0;
            aVar.f1604c = null;
            aVar.f1605d = null;
            a.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.c0 c0Var);

        void b(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    private RecyclerView.l.c l(RecyclerView.c0 c0Var, int i2) {
        a m;
        RecyclerView.l.c cVar;
        int f2 = this.a.f(c0Var);
        if (f2 >= 0 && (m = this.a.m(f2)) != null) {
            int i3 = m.f1603b;
            if ((i3 & i2) != 0) {
                int i4 = (i2 ^ (-1)) & i3;
                m.f1603b = i4;
                if (i2 == 4) {
                    cVar = m.f1604c;
                } else if (i2 == 8) {
                    cVar = m.f1605d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    this.a.k(f2);
                    a.c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.f1603b |= 2;
        aVar.f1604c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.f1603b |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j2, RecyclerView.c0 c0Var) {
        this.f1602b.k(j2, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.f1605d = cVar;
        aVar.f1603b |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.f1604c = cVar;
        aVar.f1603b |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.a.clear();
        this.f1602b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.c0 g(long j2) {
        return this.f1602b.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.f1603b & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.f1603b & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.c0 c0Var) {
        p(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.c m(RecyclerView.c0 c0Var) {
        return l(c0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.c n(RecyclerView.c0 c0Var) {
        return l(c0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 i2 = this.a.i(size);
            a k2 = this.a.k(size);
            int i3 = k2.f1603b;
            if ((i3 & 3) == 3) {
                bVar.a(i2);
            } else if ((i3 & 1) != 0) {
                RecyclerView.l.c cVar = k2.f1604c;
                if (cVar == null) {
                    bVar.a(i2);
                } else {
                    bVar.c(i2, cVar, k2.f1605d);
                }
            } else if ((i3 & 14) == 14) {
                bVar.b(i2, k2.f1604c, k2.f1605d);
            } else if ((i3 & 12) == 12) {
                bVar.d(i2, k2.f1604c, k2.f1605d);
            } else if ((i3 & 4) != 0) {
                bVar.c(i2, k2.f1604c, null);
            } else if ((i3 & 8) != 0) {
                bVar.b(i2, k2.f1604c, k2.f1605d);
            }
            a.c(k2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            return;
        }
        aVar.f1603b &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.c0 c0Var) {
        int n = this.f1602b.n() - 1;
        while (true) {
            if (n < 0) {
                break;
            }
            if (c0Var == this.f1602b.p(n)) {
                this.f1602b.m(n);
                break;
            }
            n--;
        }
        a remove = this.a.remove(c0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
