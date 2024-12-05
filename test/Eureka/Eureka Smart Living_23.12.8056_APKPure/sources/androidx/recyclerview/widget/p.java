package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    final l.g f3613a = new l.g();

    /* renamed from: b, reason: collision with root package name */
    final l.d f3614b = new l.d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        static androidx.core.util.e f3615d = new androidx.core.util.f(20);

        /* renamed from: a, reason: collision with root package name */
        int f3616a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.l.b f3617b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.b f3618c;

        private a() {
        }

        static void a() {
            do {
            } while (f3615d.b() != null);
        }

        static a b() {
            a aVar = (a) f3615d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f3616a = 0;
            aVar.f3617b = null;
            aVar.f3618c = null;
            f3615d.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.c0 c0Var);

        void b(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void c(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    private RecyclerView.l.b l(RecyclerView.c0 c0Var, int i6) {
        a aVar;
        RecyclerView.l.b bVar;
        int f6 = this.f3613a.f(c0Var);
        if (f6 >= 0 && (aVar = (a) this.f3613a.m(f6)) != null) {
            int i7 = aVar.f3616a;
            if ((i7 & i6) != 0) {
                int i8 = (~i6) & i7;
                aVar.f3616a = i8;
                if (i6 == 4) {
                    bVar = aVar.f3617b;
                } else {
                    if (i6 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f3618c;
                }
                if ((i8 & 12) == 0) {
                    this.f3613a.k(f6);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.c0 c0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.f3613a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3613a.put(c0Var, aVar);
        }
        aVar.f3616a |= 2;
        aVar.f3617b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.c0 c0Var) {
        a aVar = (a) this.f3613a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3613a.put(c0Var, aVar);
        }
        aVar.f3616a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j6, RecyclerView.c0 c0Var) {
        this.f3614b.j(j6, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.c0 c0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.f3613a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3613a.put(c0Var, aVar);
        }
        aVar.f3618c = bVar;
        aVar.f3616a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.c0 c0Var, RecyclerView.l.b bVar) {
        a aVar = (a) this.f3613a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3613a.put(c0Var, aVar);
        }
        aVar.f3617b = bVar;
        aVar.f3616a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f3613a.clear();
        this.f3614b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.c0 g(long j6) {
        return (RecyclerView.c0) this.f3614b.e(j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.c0 c0Var) {
        a aVar = (a) this.f3613a.get(c0Var);
        return (aVar == null || (aVar.f3616a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.c0 c0Var) {
        a aVar = (a) this.f3613a.get(c0Var);
        return (aVar == null || (aVar.f3616a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.c0 c0Var) {
        p(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.b m(RecyclerView.c0 c0Var) {
        return l(c0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.b n(RecyclerView.c0 c0Var) {
        return l(c0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        RecyclerView.l.b bVar2;
        RecyclerView.l.b bVar3;
        for (int size = this.f3613a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 c0Var = (RecyclerView.c0) this.f3613a.i(size);
            a aVar = (a) this.f3613a.k(size);
            int i6 = aVar.f3616a;
            if ((i6 & 3) != 3) {
                if ((i6 & 1) != 0) {
                    bVar2 = aVar.f3617b;
                    bVar3 = bVar2 != null ? aVar.f3618c : null;
                } else {
                    if ((i6 & 14) != 14) {
                        if ((i6 & 12) == 12) {
                            bVar.d(c0Var, aVar.f3617b, aVar.f3618c);
                        } else if ((i6 & 4) != 0) {
                            bVar2 = aVar.f3617b;
                        } else if ((i6 & 8) == 0) {
                        }
                        a.c(aVar);
                    }
                    bVar.b(c0Var, aVar.f3617b, aVar.f3618c);
                    a.c(aVar);
                }
                bVar.c(c0Var, bVar2, bVar3);
                a.c(aVar);
            }
            bVar.a(c0Var);
            a.c(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.c0 c0Var) {
        a aVar = (a) this.f3613a.get(c0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3616a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.c0 c0Var) {
        int m6 = this.f3614b.m() - 1;
        while (true) {
            if (m6 < 0) {
                break;
            }
            if (c0Var == this.f3614b.n(m6)) {
                this.f3614b.l(m6);
                break;
            }
            m6--;
        }
        a aVar = (a) this.f3613a.remove(c0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
