package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public class a implements m.a {
    private c.h.j.g<b> a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f1493b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f1494c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0027a f1495d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f1496e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f1497f;

    /* renamed from: g, reason: collision with root package name */
    final m f1498g;

    /* renamed from: h, reason: collision with root package name */
    private int f1499h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0027a {
        void a(int i2, int i3);

        void b(b bVar);

        void c(int i2, int i3, Object obj);

        void d(b bVar);

        RecyclerView.c0 e(int i2);

        void f(int i2, int i3);

        void g(int i2, int i3);

        void h(int i2, int i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1500b;

        /* renamed from: c, reason: collision with root package name */
        Object f1501c;

        /* renamed from: d, reason: collision with root package name */
        int f1502d;

        b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.f1500b = i3;
            this.f1502d = i4;
            this.f1501c = obj;
        }

        String a() {
            int i2 = this.a;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f1502d - this.f1500b) == 1 && this.f1502d == bVar.f1500b && this.f1500b == bVar.f1502d) {
                return true;
            }
            if (this.f1502d != bVar.f1502d || this.f1500b != bVar.f1500b) {
                return false;
            }
            Object obj2 = this.f1501c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f1501c)) {
                    return false;
                }
            } else if (bVar.f1501c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.f1500b) * 31) + this.f1502d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1500b + "c:" + this.f1502d + ",p:" + this.f1501c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0027a interfaceC0027a) {
        this(interfaceC0027a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z;
        char c2;
        int i2 = bVar.f1500b;
        int i3 = bVar.f1502d + i2;
        char c3 = 65535;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.f1495d.e(i4) != null || h(i4)) {
                if (c3 == 0) {
                    k(b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    v(b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c3 = c2;
        }
        if (i5 != bVar.f1502d) {
            a(bVar);
            bVar = b(2, i2, i5, null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i2 = bVar.f1500b;
        int i3 = bVar.f1502d + i2;
        int i4 = i2;
        char c2 = 65535;
        int i5 = 0;
        while (i2 < i3) {
            if (this.f1495d.e(i2) != null || h(i2)) {
                if (c2 == 0) {
                    k(b(4, i4, i5, bVar.f1501c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    v(b(4, i4, i5, bVar.f1501c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != bVar.f1502d) {
            Object obj = bVar.f1501c;
            a(bVar);
            bVar = b(4, i4, i5, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i2) {
        int size = this.f1494c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f1494c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (n(bVar.f1502d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f1500b;
                int i6 = bVar.f1502d + i5;
                while (i5 < i6) {
                    if (n(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 != 1 && i3 != 8) {
            int z = z(bVar.f1500b, i3);
            int i4 = bVar.f1500b;
            int i5 = bVar.a;
            if (i5 == 2) {
                i2 = 0;
            } else {
                if (i5 != 4) {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
                i2 = 1;
            }
            int i6 = 1;
            for (int i7 = 1; i7 < bVar.f1502d; i7++) {
                int z2 = z(bVar.f1500b + (i2 * i7), bVar.a);
                int i8 = bVar.a;
                if (i8 == 2 ? z2 == z : i8 == 4 && z2 == z + 1) {
                    i6++;
                } else {
                    b b2 = b(i8, z, i6, bVar.f1501c);
                    l(b2, i4);
                    a(b2);
                    if (bVar.a == 4) {
                        i4 += i6;
                    }
                    z = z2;
                    i6 = 1;
                }
            }
            Object obj = bVar.f1501c;
            a(bVar);
            if (i6 > 0) {
                b b3 = b(bVar.a, z, i6, obj);
                l(b3, i4);
                a(b3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void v(b bVar) {
        this.f1494c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            this.f1495d.g(bVar.f1500b, bVar.f1502d);
            return;
        }
        if (i2 == 2) {
            this.f1495d.f(bVar.f1500b, bVar.f1502d);
            return;
        }
        if (i2 == 4) {
            this.f1495d.c(bVar.f1500b, bVar.f1502d, bVar.f1501c);
        } else {
            if (i2 == 8) {
                this.f1495d.a(bVar.f1500b, bVar.f1502d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.f1494c.size() - 1; size >= 0; size--) {
            b bVar = this.f1494c.get(size);
            int i6 = bVar.a;
            if (i6 == 8) {
                int i7 = bVar.f1500b;
                int i8 = bVar.f1502d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            bVar.f1500b = i7 + 1;
                            bVar.f1502d = i8 + 1;
                        } else if (i3 == 2) {
                            bVar.f1500b = i7 - 1;
                            bVar.f1502d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        bVar.f1502d = i8 + 1;
                    } else if (i3 == 2) {
                        bVar.f1502d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        bVar.f1500b = i7 + 1;
                    } else if (i3 == 2) {
                        bVar.f1500b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = bVar.f1500b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= bVar.f1502d;
                    } else if (i6 == 2) {
                        i2 += bVar.f1502d;
                    }
                } else if (i3 == 1) {
                    bVar.f1500b = i9 + 1;
                } else if (i3 == 2) {
                    bVar.f1500b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f1494c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1494c.get(size2);
            if (bVar2.a == 8) {
                int i10 = bVar2.f1502d;
                if (i10 == bVar2.f1500b || i10 < 0) {
                    this.f1494c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f1502d <= 0) {
                this.f1494c.remove(size2);
                a(bVar2);
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.m.a
    public void a(b bVar) {
        if (this.f1497f) {
            return;
        }
        bVar.f1501c = null;
        this.a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.m.a
    public b b(int i2, int i3, int i4, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i2, i3, i4, obj);
        }
        b2.a = i2;
        b2.f1500b = i3;
        b2.f1502d = i4;
        b2.f1501c = obj;
        return b2;
    }

    public int e(int i2) {
        int size = this.f1493b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f1493b.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.f1500b;
                    if (i5 <= i2) {
                        int i6 = bVar.f1502d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.f1500b;
                    if (i7 == i2) {
                        i2 = bVar.f1502d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f1502d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.f1500b <= i2) {
                i2 += bVar.f1502d;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.f1494c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1495d.d(this.f1494c.get(i2));
        }
        x(this.f1494c);
        this.f1499h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f1493b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1493b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                this.f1495d.d(bVar);
                this.f1495d.g(bVar.f1500b, bVar.f1502d);
            } else if (i3 == 2) {
                this.f1495d.d(bVar);
                this.f1495d.h(bVar.f1500b, bVar.f1502d);
            } else if (i3 == 4) {
                this.f1495d.d(bVar);
                this.f1495d.c(bVar.f1500b, bVar.f1502d, bVar.f1501c);
            } else if (i3 == 8) {
                this.f1495d.d(bVar);
                this.f1495d.a(bVar.f1500b, bVar.f1502d);
            }
            Runnable runnable = this.f1496e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f1493b);
        this.f1499h = 0;
    }

    void l(b bVar, int i2) {
        this.f1495d.b(bVar);
        int i3 = bVar.a;
        if (i3 == 2) {
            this.f1495d.h(i2, bVar.f1502d);
        } else {
            if (i3 == 4) {
                this.f1495d.c(i2, bVar.f1502d, bVar.f1501c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i2) {
        return n(i2, 0);
    }

    int n(int i2, int i3) {
        int size = this.f1494c.size();
        while (i3 < size) {
            b bVar = this.f1494c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.f1500b;
                if (i5 == i2) {
                    i2 = bVar.f1502d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f1502d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f1500b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f1502d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f1502d;
                }
            }
            i3++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i2) {
        return (i2 & this.f1499h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f1493b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return (this.f1494c.isEmpty() || this.f1493b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.f1493b.add(b(4, i2, i3, obj));
        this.f1499h |= 4;
        return this.f1493b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f1493b.add(b(1, i2, i3, null));
        this.f1499h |= 1;
        return this.f1493b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 == 1) {
            this.f1493b.add(b(8, i2, i3, null));
            this.f1499h |= 8;
            return this.f1493b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f1493b.add(b(2, i2, i3, null));
        this.f1499h |= 2;
        return this.f1493b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f1498g.b(this.f1493b);
        int size = this.f1493b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1493b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                c(bVar);
            } else if (i3 == 2) {
                f(bVar);
            } else if (i3 == 4) {
                g(bVar);
            } else if (i3 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f1496e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1493b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(list.get(i2));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        x(this.f1493b);
        x(this.f1494c);
        this.f1499h = 0;
    }

    a(InterfaceC0027a interfaceC0027a, boolean z) {
        this.a = new c.h.j.h(30);
        this.f1493b = new ArrayList<>();
        this.f1494c = new ArrayList<>();
        this.f1499h = 0;
        this.f1495d = interfaceC0027a;
        this.f1497f = z;
        this.f1498g = new m(this);
    }
}
