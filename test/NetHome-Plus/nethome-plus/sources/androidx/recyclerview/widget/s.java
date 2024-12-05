package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
class s {
    final b a;

    /* renamed from: b, reason: collision with root package name */
    a f1597b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    static class a {
        int a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f1598b;

        /* renamed from: c, reason: collision with root package name */
        int f1599c;

        /* renamed from: d, reason: collision with root package name */
        int f1600d;

        /* renamed from: e, reason: collision with root package name */
        int f1601e;

        a() {
        }

        void a(int i2) {
            this.a = i2 | this.a;
        }

        boolean b() {
            int i2 = this.a;
            if ((i2 & 7) != 0 && (i2 & (c(this.f1600d, this.f1598b) << 0)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 112) != 0 && (i3 & (c(this.f1600d, this.f1599c) << 4)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 1792) != 0 && (i4 & (c(this.f1601e, this.f1598b) << 8)) == 0) {
                return false;
            }
            int i5 = this.a;
            return (i5 & 28672) == 0 || (i5 & (c(this.f1601e, this.f1599c) << 12)) != 0;
        }

        int c(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        void d() {
            this.a = 0;
        }

        void e(int i2, int i3, int i4, int i5) {
            this.f1598b = i2;
            this.f1599c = i3;
            this.f1600d = i4;
            this.f1601e = i5;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    interface b {
        View a(int i2);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(b bVar) {
        this.a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i2, int i3, int i4, int i5) {
        int c2 = this.a.c();
        int d2 = this.a.d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View a2 = this.a.a(i2);
            this.f1597b.e(c2, d2, this.a.b(a2), this.a.e(a2));
            if (i4 != 0) {
                this.f1597b.d();
                this.f1597b.a(i4);
                if (this.f1597b.b()) {
                    return a2;
                }
            }
            if (i5 != 0) {
                this.f1597b.d();
                this.f1597b.a(i5);
                if (this.f1597b.b()) {
                    view = a2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view, int i2) {
        this.f1597b.e(this.a.c(), this.a.d(), this.a.b(view), this.a.e(view));
        if (i2 == 0) {
            return false;
        }
        this.f1597b.d();
        this.f1597b.a(i2);
        return this.f1597b.b();
    }
}
