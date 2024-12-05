package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0058b f3470a;

    /* renamed from: b, reason: collision with root package name */
    final a f3471b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List f3472c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f3473a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f3474b;

        a() {
        }

        private void c() {
            if (this.f3474b == null) {
                this.f3474b = new a();
            }
        }

        void a(int i6) {
            if (i6 < 64) {
                this.f3473a &= ~(1 << i6);
                return;
            }
            a aVar = this.f3474b;
            if (aVar != null) {
                aVar.a(i6 - 64);
            }
        }

        int b(int i6) {
            a aVar = this.f3474b;
            return aVar == null ? i6 >= 64 ? Long.bitCount(this.f3473a) : Long.bitCount(this.f3473a & ((1 << i6) - 1)) : i6 < 64 ? Long.bitCount(this.f3473a & ((1 << i6) - 1)) : aVar.b(i6 - 64) + Long.bitCount(this.f3473a);
        }

        boolean d(int i6) {
            if (i6 < 64) {
                return (this.f3473a & (1 << i6)) != 0;
            }
            c();
            return this.f3474b.d(i6 - 64);
        }

        void e(int i6, boolean z5) {
            if (i6 >= 64) {
                c();
                this.f3474b.e(i6 - 64, z5);
                return;
            }
            long j6 = this.f3473a;
            boolean z6 = (Long.MIN_VALUE & j6) != 0;
            long j7 = (1 << i6) - 1;
            this.f3473a = ((j6 & (~j7)) << 1) | (j6 & j7);
            if (z5) {
                h(i6);
            } else {
                a(i6);
            }
            if (z6 || this.f3474b != null) {
                c();
                this.f3474b.e(0, z6);
            }
        }

        boolean f(int i6) {
            if (i6 >= 64) {
                c();
                return this.f3474b.f(i6 - 64);
            }
            long j6 = 1 << i6;
            long j7 = this.f3473a;
            boolean z5 = (j7 & j6) != 0;
            long j8 = j7 & (~j6);
            this.f3473a = j8;
            long j9 = j6 - 1;
            this.f3473a = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
            a aVar = this.f3474b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3474b.f(0);
            }
            return z5;
        }

        void g() {
            this.f3473a = 0L;
            a aVar = this.f3474b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i6) {
            if (i6 < 64) {
                this.f3473a |= 1 << i6;
            } else {
                c();
                this.f3474b.h(i6 - 64);
            }
        }

        public String toString() {
            if (this.f3474b == null) {
                return Long.toBinaryString(this.f3473a);
            }
            return this.f3474b.toString() + "xx" + Long.toBinaryString(this.f3473a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0058b {
        View a(int i6);

        void b(View view);

        void c(int i6);

        void d();

        RecyclerView.c0 e(View view);

        void f(int i6);

        void g(View view);

        void h(View view, int i6, ViewGroup.LayoutParams layoutParams);

        void i(View view, int i6);

        int j(View view);

        int k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(InterfaceC0058b interfaceC0058b) {
        this.f3470a = interfaceC0058b;
    }

    private int h(int i6) {
        if (i6 < 0) {
            return -1;
        }
        int k6 = this.f3470a.k();
        int i7 = i6;
        while (i7 < k6) {
            int b6 = i6 - (i7 - this.f3471b.b(i7));
            if (b6 == 0) {
                while (this.f3471b.d(i7)) {
                    i7++;
                }
                return i7;
            }
            i7 += b6;
        }
        return -1;
    }

    private void l(View view) {
        this.f3472c.add(view);
        this.f3470a.b(view);
    }

    private boolean t(View view) {
        if (!this.f3472c.remove(view)) {
            return false;
        }
        this.f3470a.g(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i6, boolean z5) {
        int k6 = i6 < 0 ? this.f3470a.k() : h(i6);
        this.f3471b.e(k6, z5);
        if (z5) {
            l(view);
        }
        this.f3470a.i(view, k6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, boolean z5) {
        a(view, -1, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z5) {
        int k6 = i6 < 0 ? this.f3470a.k() : h(i6);
        this.f3471b.e(k6, z5);
        if (z5) {
            l(view);
        }
        this.f3470a.h(view, k6, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i6) {
        int h6 = h(i6);
        this.f3471b.f(h6);
        this.f3470a.f(h6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View e(int i6) {
        int size = this.f3472c.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) this.f3472c.get(i7);
            RecyclerView.c0 e6 = this.f3470a.e(view);
            if (e6.m() == i6 && !e6.t() && !e6.v()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f(int i6) {
        return this.f3470a.a(h(i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f3470a.k() - this.f3472c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View i(int i6) {
        return this.f3470a.a(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f3470a.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(View view) {
        int j6 = this.f3470a.j(view);
        if (j6 >= 0) {
            this.f3471b.h(j6);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(View view) {
        int j6 = this.f3470a.j(view);
        if (j6 == -1 || this.f3471b.d(j6)) {
            return -1;
        }
        return j6 - this.f3471b.b(j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f3472c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.f3471b.g();
        for (int size = this.f3472c.size() - 1; size >= 0; size--) {
            this.f3470a.g((View) this.f3472c.get(size));
            this.f3472c.remove(size);
        }
        this.f3470a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(View view) {
        int j6 = this.f3470a.j(view);
        if (j6 < 0) {
            return;
        }
        if (this.f3471b.f(j6)) {
            t(view);
        }
        this.f3470a.c(j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i6) {
        int h6 = h(i6);
        View a6 = this.f3470a.a(h6);
        if (a6 == null) {
            return;
        }
        if (this.f3471b.f(h6)) {
            t(a6);
        }
        this.f3470a.c(h6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(View view) {
        int j6 = this.f3470a.j(view);
        if (j6 == -1) {
            t(view);
            return true;
        }
        if (!this.f3471b.d(j6)) {
            return false;
        }
        this.f3471b.f(j6);
        t(view);
        this.f3470a.c(j6);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(View view) {
        int j6 = this.f3470a.j(view);
        if (j6 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3471b.d(j6)) {
            this.f3471b.a(j6);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3471b.toString() + ", hidden list:" + this.f3472c.size();
    }
}
