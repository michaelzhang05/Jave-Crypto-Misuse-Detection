package com.capacitorjs.plugins.keyboard;

import android.R;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private androidx.appcompat.app.c f4210a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f4211b;

    /* renamed from: c, reason: collision with root package name */
    private View f4212c;

    /* renamed from: d, reason: collision with root package name */
    private View f4213d;

    /* renamed from: e, reason: collision with root package name */
    private int f4214e;

    /* renamed from: f, reason: collision with root package name */
    private FrameLayout.LayoutParams f4215f;

    /* renamed from: g, reason: collision with root package name */
    private b f4216g;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        int f4217a = 0;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4218b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4219c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f4220d;

        a(float f6, boolean z5, androidx.appcompat.app.c cVar) {
            this.f4218b = f6;
            this.f4219c = z5;
            this.f4220d = cVar;
        }

        private int a() {
            Rect rect = new Rect();
            c.this.f4213d.getWindowVisibleDisplayFrame(rect);
            return b() ? rect.bottom : rect.height();
        }

        private boolean b() {
            return (this.f4220d.getWindow().getDecorView().getSystemUiVisibility() & 1024) == 1024;
        }

        private void c(boolean z5) {
            int a6 = z5 ? a() : -1;
            if (c.this.f4214e != a6) {
                c.this.f4215f.height = a6;
                c.this.f4213d.requestLayout();
                c.this.f4214e = a6;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onGlobalLayout() {
            /*
                r4 = this;
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                com.capacitorjs.plugins.keyboard.c r1 = com.capacitorjs.plugins.keyboard.c.this
                android.view.View r1 = com.capacitorjs.plugins.keyboard.c.d(r1)
                r1.getWindowVisibleDisplayFrame(r0)
                com.capacitorjs.plugins.keyboard.c r1 = com.capacitorjs.plugins.keyboard.c.this
                android.view.View r1 = com.capacitorjs.plugins.keyboard.c.d(r1)
                android.view.View r1 = r1.getRootView()
                int r1 = r1.getHeight()
                int r0 = r0.bottom
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r2 < r3) goto L3c
                com.capacitorjs.plugins.keyboard.c r2 = com.capacitorjs.plugins.keyboard.c.this
                android.view.View r2 = com.capacitorjs.plugins.keyboard.c.d(r2)
                android.view.WindowInsets r2 = androidx.core.view.d1.a(r2)
                int r3 = com.capacitorjs.plugins.keyboard.a.a()
                android.graphics.Insets r2 = com.capacitorjs.plugins.keyboard.b.a(r2, r3)
                int r2 = androidx.core.graphics.e.a(r2)
            L3a:
                int r0 = r0 + r2
                goto L59
            L3c:
                r3 = 23
                if (r2 < r3) goto L51
                com.capacitorjs.plugins.keyboard.c r2 = com.capacitorjs.plugins.keyboard.c.this
                android.view.View r2 = com.capacitorjs.plugins.keyboard.c.d(r2)
                android.view.WindowInsets r2 = androidx.core.view.d1.a(r2)
                com.capacitorjs.plugins.keyboard.c r3 = com.capacitorjs.plugins.keyboard.c.this
                int r2 = com.capacitorjs.plugins.keyboard.c.h(r3, r2)
                goto L3a
            L51:
                com.capacitorjs.plugins.keyboard.c r1 = com.capacitorjs.plugins.keyboard.c.this
                android.graphics.Point r1 = com.capacitorjs.plugins.keyboard.c.g(r1)
                int r1 = r1.y
            L59:
                int r1 = r1 - r0
                float r0 = (float) r1
                float r1 = r4.f4218b
                float r0 = r0 / r1
                int r0 = (int) r0
                java.lang.String r1 = "Native Keyboard Event Listener not found"
                r2 = 100
                if (r0 <= r2) goto L94
                int r3 = r4.f4217a
                if (r0 == r3) goto L94
                boolean r2 = r4.f4219c
                if (r2 == 0) goto L71
                r2 = 1
                r4.c(r2)
            L71:
                com.capacitorjs.plugins.keyboard.c r2 = com.capacitorjs.plugins.keyboard.c.this
                com.capacitorjs.plugins.keyboard.c$b r2 = com.capacitorjs.plugins.keyboard.c.b(r2)
                if (r2 == 0) goto L90
                com.capacitorjs.plugins.keyboard.c r1 = com.capacitorjs.plugins.keyboard.c.this
                com.capacitorjs.plugins.keyboard.c$b r1 = com.capacitorjs.plugins.keyboard.c.b(r1)
                java.lang.String r2 = "keyboardWillShow"
                r1.a(r2, r0)
                com.capacitorjs.plugins.keyboard.c r1 = com.capacitorjs.plugins.keyboard.c.this
                com.capacitorjs.plugins.keyboard.c$b r1 = com.capacitorjs.plugins.keyboard.c.b(r1)
                java.lang.String r2 = "keyboardDidShow"
                r1.a(r2, r0)
                goto Lc1
            L90:
                com.getcapacitor.l0.n(r1)
                goto Lc1
            L94:
                int r3 = r4.f4217a
                if (r0 == r3) goto Lc1
                int r3 = r3 - r0
                if (r3 <= r2) goto Lc1
                boolean r2 = r4.f4219c
                r3 = 0
                if (r2 == 0) goto La3
                r4.c(r3)
            La3:
                com.capacitorjs.plugins.keyboard.c r2 = com.capacitorjs.plugins.keyboard.c.this
                com.capacitorjs.plugins.keyboard.c$b r2 = com.capacitorjs.plugins.keyboard.c.b(r2)
                if (r2 == 0) goto L90
                com.capacitorjs.plugins.keyboard.c r1 = com.capacitorjs.plugins.keyboard.c.this
                com.capacitorjs.plugins.keyboard.c$b r1 = com.capacitorjs.plugins.keyboard.c.b(r1)
                java.lang.String r2 = "keyboardWillHide"
                r1.a(r2, r3)
                com.capacitorjs.plugins.keyboard.c r1 = com.capacitorjs.plugins.keyboard.c.this
                com.capacitorjs.plugins.keyboard.c$b r1 = com.capacitorjs.plugins.keyboard.c.b(r1)
                java.lang.String r2 = "keyboardDidHide"
                r1.a(r2, r3)
            Lc1:
                r4.f4217a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.capacitorjs.plugins.keyboard.c.a.onGlobalLayout():void");
        }
    }

    /* loaded from: classes.dex */
    interface b {
        void a(String str, int i6);
    }

    public c(androidx.appcompat.app.c cVar, boolean z5) {
        this.f4210a = cVar;
        float f6 = cVar.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = (FrameLayout) cVar.getWindow().getDecorView().findViewById(R.id.content);
        this.f4212c = frameLayout.getRootView();
        this.f4211b = new a(f6, z5, cVar);
        this.f4213d = frameLayout.getChildAt(0);
        this.f4212c.getViewTreeObserver().addOnGlobalLayoutListener(this.f4211b);
        this.f4215f = (FrameLayout.LayoutParams) this.f4213d.getLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point i() {
        Display defaultDisplay = this.f4210a.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j(WindowInsets windowInsets) {
        return windowInsets.getStableInsetBottom();
    }

    public boolean k() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4210a.getSystemService("input_method");
        View currentFocus = this.f4210a.getCurrentFocus();
        if (currentFocus == null) {
            return false;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        return true;
    }

    public void l(b bVar) {
        this.f4216g = bVar;
    }

    public void m() {
        ((InputMethodManager) this.f4210a.getSystemService("input_method")).showSoftInput(this.f4210a.getCurrentFocus(), 0);
    }
}
