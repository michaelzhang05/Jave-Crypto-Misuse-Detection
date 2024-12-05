package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    final b f3606a;

    /* renamed from: b, reason: collision with root package name */
    a f3607b = new a();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f3608a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f3609b;

        /* renamed from: c, reason: collision with root package name */
        int f3610c;

        /* renamed from: d, reason: collision with root package name */
        int f3611d;

        /* renamed from: e, reason: collision with root package name */
        int f3612e;

        a() {
        }

        void a(int i6) {
            this.f3608a = i6 | this.f3608a;
        }

        boolean b() {
            int i6 = this.f3608a;
            if ((i6 & 7) != 0 && (i6 & (c(this.f3611d, this.f3609b) << 0)) == 0) {
                return false;
            }
            int i7 = this.f3608a;
            if ((i7 & 112) != 0 && (i7 & (c(this.f3611d, this.f3610c) << 4)) == 0) {
                return false;
            }
            int i8 = this.f3608a;
            if ((i8 & 1792) != 0 && (i8 & (c(this.f3612e, this.f3609b) << 8)) == 0) {
                return false;
            }
            int i9 = this.f3608a;
            return (i9 & 28672) == 0 || (i9 & (c(this.f3612e, this.f3610c) << 12)) != 0;
        }

        int c(int i6, int i7) {
            if (i6 > i7) {
                return 1;
            }
            return i6 == i7 ? 2 : 4;
        }

        void d() {
            this.f3608a = 0;
        }

        void e(int i6, int i7, int i8, int i9) {
            this.f3609b = i6;
            this.f3610c = i7;
            this.f3611d = i8;
            this.f3612e = i9;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        View a(int i6);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(b bVar) {
        this.f3606a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i6, int i7, int i8, int i9) {
        int c6 = this.f3606a.c();
        int b6 = this.f3606a.b();
        int i10 = i7 > i6 ? 1 : -1;
        View view = null;
        while (i6 != i7) {
            View a6 = this.f3606a.a(i6);
            this.f3607b.e(c6, b6, this.f3606a.e(a6), this.f3606a.d(a6));
            if (i8 != 0) {
                this.f3607b.d();
                this.f3607b.a(i8);
                if (this.f3607b.b()) {
                    return a6;
                }
            }
            if (i9 != 0) {
                this.f3607b.d();
                this.f3607b.a(i9);
                if (this.f3607b.b()) {
                    view = a6;
                }
            }
            i6 += i10;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view, int i6) {
        this.f3607b.e(this.f3606a.c(), this.f3606a.b(), this.f3606a.e(view), this.f3606a.d(view));
        if (i6 == 0) {
            return false;
        }
        this.f3607b.d();
        this.f3607b.a(i6);
        return this.f3607b.b();
    }
}
