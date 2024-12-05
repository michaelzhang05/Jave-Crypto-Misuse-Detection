package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private androidx.core.util.e f3458a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f3459b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f3460c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0057a f3461d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f3462e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f3463f;

    /* renamed from: g, reason: collision with root package name */
    final h f3464g;

    /* renamed from: h, reason: collision with root package name */
    private int f3465h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057a {
        void a(int i6, int i7);

        void b(b bVar);

        RecyclerView.c0 c(int i6);

        void d(int i6, int i7);

        void e(int i6, int i7);

        void f(b bVar);

        void g(int i6, int i7);

        void h(int i6, int i7, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f3466a;

        /* renamed from: b, reason: collision with root package name */
        int f3467b;

        /* renamed from: c, reason: collision with root package name */
        Object f3468c;

        /* renamed from: d, reason: collision with root package name */
        int f3469d;

        b(int i6, int i7, int i8, Object obj) {
            this.f3466a = i6;
            this.f3467b = i7;
            this.f3469d = i8;
            this.f3468c = obj;
        }

        String a() {
            int i6 = this.f3466a;
            return i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i6 = this.f3466a;
            if (i6 != bVar.f3466a) {
                return false;
            }
            if (i6 == 8 && Math.abs(this.f3469d - this.f3467b) == 1 && this.f3469d == bVar.f3467b && this.f3467b == bVar.f3469d) {
                return true;
            }
            if (this.f3469d != bVar.f3469d || this.f3467b != bVar.f3467b) {
                return false;
            }
            Object obj2 = this.f3468c;
            Object obj3 = bVar.f3468c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3466a * 31) + this.f3467b) * 31) + this.f3469d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3467b + "c:" + this.f3469d + ",p:" + this.f3468c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0057a interfaceC0057a) {
        this(interfaceC0057a, false);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        boolean z5;
        char c6;
        int i6 = bVar.f3467b;
        int i7 = bVar.f3469d + i6;
        char c7 = 65535;
        int i8 = i6;
        int i9 = 0;
        while (i8 < i7) {
            if (this.f3461d.c(i8) != null || h(i8)) {
                if (c7 == 0) {
                    k(b(2, i6, i9, null));
                    z5 = true;
                } else {
                    z5 = false;
                }
                c6 = 1;
            } else {
                if (c7 == 1) {
                    r(b(2, i6, i9, null));
                    z5 = true;
                } else {
                    z5 = false;
                }
                c6 = 0;
            }
            if (z5) {
                i8 -= i9;
                i7 -= i9;
                i9 = 1;
            } else {
                i9++;
            }
            i8++;
            c7 = c6;
        }
        if (i9 != bVar.f3469d) {
            a(bVar);
            bVar = b(2, i6, i9, null);
        }
        if (c7 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i6 = bVar.f3467b;
        int i7 = bVar.f3469d + i6;
        int i8 = i6;
        char c6 = 65535;
        int i9 = 0;
        while (i6 < i7) {
            if (this.f3461d.c(i6) != null || h(i6)) {
                if (c6 == 0) {
                    k(b(4, i8, i9, bVar.f3468c));
                    i8 = i6;
                    i9 = 0;
                }
                c6 = 1;
            } else {
                if (c6 == 1) {
                    r(b(4, i8, i9, bVar.f3468c));
                    i8 = i6;
                    i9 = 0;
                }
                c6 = 0;
            }
            i9++;
            i6++;
        }
        if (i9 != bVar.f3469d) {
            Object obj = bVar.f3468c;
            a(bVar);
            bVar = b(4, i8, i9, obj);
        }
        if (c6 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i6) {
        int size = this.f3460c.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f3460c.get(i7);
            int i8 = bVar.f3466a;
            if (i8 == 8) {
                if (n(bVar.f3469d, i7 + 1) == i6) {
                    return true;
                }
            } else if (i8 == 1) {
                int i9 = bVar.f3467b;
                int i10 = bVar.f3469d + i9;
                while (i9 < i10) {
                    if (n(i9, i7 + 1) == i6) {
                        return true;
                    }
                    i9++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i6;
        int i7 = bVar.f3466a;
        if (i7 == 1 || i7 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v5 = v(bVar.f3467b, i7);
        int i8 = bVar.f3467b;
        int i9 = bVar.f3466a;
        if (i9 == 2) {
            i6 = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i6 = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < bVar.f3469d; i11++) {
            int v6 = v(bVar.f3467b + (i6 * i11), bVar.f3466a);
            int i12 = bVar.f3466a;
            if (i12 == 2 ? v6 == v5 : i12 == 4 && v6 == v5 + 1) {
                i10++;
            } else {
                b b6 = b(i12, v5, i10, bVar.f3468c);
                l(b6, i8);
                a(b6);
                if (bVar.f3466a == 4) {
                    i8 += i10;
                }
                v5 = v6;
                i10 = 1;
            }
        }
        Object obj = bVar.f3468c;
        a(bVar);
        if (i10 > 0) {
            b b7 = b(bVar.f3466a, v5, i10, obj);
            l(b7, i8);
            a(b7);
        }
    }

    private void r(b bVar) {
        this.f3460c.add(bVar);
        int i6 = bVar.f3466a;
        if (i6 == 1) {
            this.f3461d.g(bVar.f3467b, bVar.f3469d);
            return;
        }
        if (i6 == 2) {
            this.f3461d.e(bVar.f3467b, bVar.f3469d);
            return;
        }
        if (i6 == 4) {
            this.f3461d.h(bVar.f3467b, bVar.f3469d, bVar.f3468c);
        } else {
            if (i6 == 8) {
                this.f3461d.a(bVar.f3467b, bVar.f3469d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int v(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        for (int size = this.f3460c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f3460c.get(size);
            int i14 = bVar.f3466a;
            if (i14 == 8) {
                int i15 = bVar.f3467b;
                int i16 = bVar.f3469d;
                if (i15 < i16) {
                    i10 = i15;
                    i9 = i16;
                } else {
                    i9 = i15;
                    i10 = i16;
                }
                if (i6 < i10 || i6 > i9) {
                    if (i6 < i15) {
                        if (i7 == 1) {
                            bVar.f3467b = i15 + 1;
                            i11 = i16 + 1;
                        } else if (i7 == 2) {
                            bVar.f3467b = i15 - 1;
                            i11 = i16 - 1;
                        }
                        bVar.f3469d = i11;
                    }
                } else if (i10 == i15) {
                    if (i7 == 1) {
                        i13 = i16 + 1;
                    } else {
                        if (i7 == 2) {
                            i13 = i16 - 1;
                        }
                        i6++;
                    }
                    bVar.f3469d = i13;
                    i6++;
                } else {
                    if (i7 == 1) {
                        i12 = i15 + 1;
                    } else {
                        if (i7 == 2) {
                            i12 = i15 - 1;
                        }
                        i6--;
                    }
                    bVar.f3467b = i12;
                    i6--;
                }
            } else {
                int i17 = bVar.f3467b;
                if (i17 > i6) {
                    if (i7 == 1) {
                        i8 = i17 + 1;
                    } else if (i7 == 2) {
                        i8 = i17 - 1;
                    }
                    bVar.f3467b = i8;
                } else if (i14 == 1) {
                    i6 -= bVar.f3469d;
                } else if (i14 == 2) {
                    i6 += bVar.f3469d;
                }
            }
        }
        for (int size2 = this.f3460c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f3460c.get(size2);
            if (bVar2.f3466a == 8) {
                int i18 = bVar2.f3469d;
                if (i18 != bVar2.f3467b && i18 >= 0) {
                }
                this.f3460c.remove(size2);
                a(bVar2);
            } else {
                if (bVar2.f3469d > 0) {
                }
                this.f3460c.remove(size2);
                a(bVar2);
            }
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f3463f) {
            return;
        }
        bVar.f3468c = null;
        this.f3458a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i6, int i7, int i8, Object obj) {
        b bVar = (b) this.f3458a.b();
        if (bVar == null) {
            return new b(i6, i7, i8, obj);
        }
        bVar.f3466a = i6;
        bVar.f3467b = i7;
        bVar.f3469d = i8;
        bVar.f3468c = obj;
        return bVar;
    }

    public int e(int i6) {
        int size = this.f3459b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f3459b.get(i7);
            int i8 = bVar.f3466a;
            if (i8 != 1) {
                if (i8 == 2) {
                    int i9 = bVar.f3467b;
                    if (i9 <= i6) {
                        int i10 = bVar.f3469d;
                        if (i9 + i10 > i6) {
                            return -1;
                        }
                        i6 -= i10;
                    } else {
                        continue;
                    }
                } else if (i8 == 8) {
                    int i11 = bVar.f3467b;
                    if (i11 == i6) {
                        i6 = bVar.f3469d;
                    } else {
                        if (i11 < i6) {
                            i6--;
                        }
                        if (bVar.f3469d <= i6) {
                            i6++;
                        }
                    }
                }
            } else if (bVar.f3467b <= i6) {
                i6 += bVar.f3469d;
            }
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.f3460c.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f3461d.b((b) this.f3460c.get(i6));
        }
        t(this.f3460c);
        this.f3465h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f3459b.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = (b) this.f3459b.get(i6);
            int i7 = bVar.f3466a;
            if (i7 == 1) {
                this.f3461d.b(bVar);
                this.f3461d.g(bVar.f3467b, bVar.f3469d);
            } else if (i7 == 2) {
                this.f3461d.b(bVar);
                this.f3461d.d(bVar.f3467b, bVar.f3469d);
            } else if (i7 == 4) {
                this.f3461d.b(bVar);
                this.f3461d.h(bVar.f3467b, bVar.f3469d, bVar.f3468c);
            } else if (i7 == 8) {
                this.f3461d.b(bVar);
                this.f3461d.a(bVar.f3467b, bVar.f3469d);
            }
            Runnable runnable = this.f3462e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f3459b);
        this.f3465h = 0;
    }

    void l(b bVar, int i6) {
        this.f3461d.f(bVar);
        int i7 = bVar.f3466a;
        if (i7 == 2) {
            this.f3461d.d(i6, bVar.f3469d);
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f3461d.h(i6, bVar.f3469d, bVar.f3468c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i6) {
        return n(i6, 0);
    }

    int n(int i6, int i7) {
        int size = this.f3460c.size();
        while (i7 < size) {
            b bVar = (b) this.f3460c.get(i7);
            int i8 = bVar.f3466a;
            if (i8 == 8) {
                int i9 = bVar.f3467b;
                if (i9 == i6) {
                    i6 = bVar.f3469d;
                } else {
                    if (i9 < i6) {
                        i6--;
                    }
                    if (bVar.f3469d <= i6) {
                        i6++;
                    }
                }
            } else {
                int i10 = bVar.f3467b;
                if (i10 > i6) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = bVar.f3469d;
                    if (i6 < i10 + i11) {
                        return -1;
                    }
                    i6 -= i11;
                } else if (i8 == 1) {
                    i6 += bVar.f3469d;
                }
            }
            i7++;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i6) {
        return (i6 & this.f3465h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f3459b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return (this.f3460c.isEmpty() || this.f3459b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        this.f3464g.b(this.f3459b);
        int size = this.f3459b.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = (b) this.f3459b.get(i6);
            int i7 = bVar.f3466a;
            if (i7 == 1) {
                c(bVar);
            } else if (i7 == 2) {
                f(bVar);
            } else if (i7 == 4) {
                g(bVar);
            } else if (i7 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3462e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3459b.clear();
    }

    void t(List list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            a((b) list.get(i6));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        t(this.f3459b);
        t(this.f3460c);
        this.f3465h = 0;
    }

    a(InterfaceC0057a interfaceC0057a, boolean z5) {
        this.f3458a = new androidx.core.util.f(30);
        this.f3459b = new ArrayList();
        this.f3460c = new ArrayList();
        this.f3465h = 0;
        this.f3461d = interfaceC0057a;
        this.f3463f = z5;
        this.f3464g = new h(this);
    }
}
