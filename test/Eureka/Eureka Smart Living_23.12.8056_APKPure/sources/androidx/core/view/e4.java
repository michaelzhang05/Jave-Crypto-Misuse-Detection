package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.e4;

/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    private final e f2385a;

    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f2386a;

        /* renamed from: b, reason: collision with root package name */
        private final View f2387b;

        a(Window window, View view) {
            this.f2386a = window;
            this.f2387b = view;
        }

        private void g(int i6) {
            if (i6 == 1) {
                i(4);
            } else if (i6 == 2) {
                i(2);
            } else {
                if (i6 != 8) {
                    return;
                }
                ((InputMethodManager) this.f2386a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2386a.getDecorView().getWindowToken(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void h(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        private void k(int i6) {
            if (i6 == 1) {
                l(4);
                m(1024);
                return;
            }
            if (i6 == 2) {
                l(2);
                return;
            }
            if (i6 != 8) {
                return;
            }
            final View view = this.f2387b;
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = this.f2386a.getCurrentFocus();
            }
            if (view == null) {
                view = this.f2386a.findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.d4
                @Override // java.lang.Runnable
                public final void run() {
                    e4.a.h(view);
                }
            });
        }

        @Override // androidx.core.view.e4.e
        void a(int i6) {
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    g(i7);
                }
            }
        }

        @Override // androidx.core.view.e4.e
        void e(int i6) {
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    k(i7);
                }
            }
        }

        protected void i(int i6) {
            View decorView = this.f2386a.getDecorView();
            decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
        }

        protected void j(int i6) {
            this.f2386a.addFlags(i6);
        }

        protected void l(int i6) {
            View decorView = this.f2386a.getDecorView();
            decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
        }

        protected void m(int i6) {
            this.f2386a.clearFlags(i6);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.e4.e
        public boolean b() {
            return (this.f2386a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.e4.e
        public void d(boolean z5) {
            if (!z5) {
                l(8192);
                return;
            }
            m(67108864);
            j(Integer.MIN_VALUE);
            i(8192);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.e4.e
        public void c(boolean z5) {
            if (!z5) {
                l(16);
                return;
            }
            m(134217728);
            j(Integer.MIN_VALUE);
            i(16);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final e4 f2388a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f2389b;

        /* renamed from: c, reason: collision with root package name */
        private final l.g f2390c;

        /* renamed from: d, reason: collision with root package name */
        protected Window f2391d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(android.view.Window r2, androidx.core.view.e4 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.i4.a(r2)
                r1.<init>(r0, r3)
                r1.f2391d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.e4.d.<init>(android.view.Window, androidx.core.view.e4):void");
        }

        @Override // androidx.core.view.e4.e
        void a(int i6) {
            this.f2389b.hide(i6);
        }

        @Override // androidx.core.view.e4.e
        public boolean b() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f2389b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.e4.e
        public void c(boolean z5) {
            if (z5) {
                if (this.f2391d != null) {
                    f(16);
                }
                this.f2389b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f2391d != null) {
                    g(16);
                }
                this.f2389b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.e4.e
        public void d(boolean z5) {
            if (z5) {
                if (this.f2391d != null) {
                    f(8192);
                }
                this.f2389b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f2391d != null) {
                    g(8192);
                }
                this.f2389b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.e4.e
        void e(int i6) {
            Window window = this.f2391d;
            if (window != null && (i6 & 8) != 0 && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f2389b.show(i6);
        }

        protected void f(int i6) {
            View decorView = this.f2391d.getDecorView();
            decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
        }

        protected void g(int i6) {
            View decorView = this.f2391d.getDecorView();
            decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, e4 e4Var) {
            this.f2390c = new l.g();
            this.f2389b = windowInsetsController;
            this.f2388a = e4Var;
        }
    }

    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        abstract void a(int i6);

        public boolean b() {
            return false;
        }

        public void c(boolean z5) {
        }

        public void d(boolean z5) {
        }

        abstract void e(int i6);
    }

    public e4(Window window, View view) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            this.f2385a = new d(window, this);
        } else {
            this.f2385a = i6 >= 26 ? new c(window, view) : i6 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public void a(int i6) {
        this.f2385a.a(i6);
    }

    public boolean b() {
        return this.f2385a.b();
    }

    public void c(boolean z5) {
        this.f2385a.c(z5);
    }

    public void d(boolean z5) {
        this.f2385a.d(z5);
    }

    public void e(int i6) {
        this.f2385a.e(i6);
    }
}
