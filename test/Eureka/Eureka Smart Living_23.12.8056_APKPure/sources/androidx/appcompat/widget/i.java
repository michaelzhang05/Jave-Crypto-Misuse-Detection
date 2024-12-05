package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f1051a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1052b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1053c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1054d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1055e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1056f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(CheckedTextView checkedTextView) {
        this.f1051a = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Drawable a6 = androidx.core.widget.b.a(this.f1051a);
        if (a6 != null) {
            if (this.f1054d || this.f1055e) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(a6).mutate();
                if (this.f1054d) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1052b);
                }
                if (this.f1055e) {
                    androidx.core.graphics.drawable.a.p(mutate, this.f1053c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1051a.getDrawableState());
                }
                this.f1051a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f1052b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f1053c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x005f, B:18:0x0067, B:19:0x0072, B:21:0x007a), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x005f, B:18:0x0067, B:19:0x0072, B:21:0x007a), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f1051a
            android.content.Context r0 = r0.getContext()
            int[] r1 = d.j.P0
            r2 = 0
            androidx.appcompat.widget.c3 r0 = androidx.appcompat.widget.c3.v(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.f1051a
            android.content.Context r4 = r3.getContext()
            int[] r5 = d.j.P0
            android.content.res.TypedArray r7 = r0.r()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.b1.o0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = d.j.R0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L3f
            int r11 = d.j.R0     // Catch: java.lang.Throwable -> L8f
            int r11 = r0.n(r11, r2)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L3f
            android.widget.CheckedTextView r12 = r10.f1051a     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            android.graphics.drawable.Drawable r11 = e.a.b(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            r12.setCheckMarkDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            r11 = 1
            goto L40
        L3e:
        L3f:
            r11 = 0
        L40:
            if (r11 != 0) goto L5f
            int r11 = d.j.Q0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L5f
            int r11 = d.j.Q0     // Catch: java.lang.Throwable -> L8f
            int r11 = r0.n(r11, r2)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L5f
            android.widget.CheckedTextView r12 = r10.f1051a     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L8f
            android.graphics.drawable.Drawable r11 = e.a.b(r1, r11)     // Catch: java.lang.Throwable -> L8f
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L8f
        L5f:
            int r11 = d.j.S0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L72
            android.widget.CheckedTextView r11 = r10.f1051a     // Catch: java.lang.Throwable -> L8f
            int r12 = d.j.S0     // Catch: java.lang.Throwable -> L8f
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch: java.lang.Throwable -> L8f
            androidx.core.widget.b.b(r11, r12)     // Catch: java.lang.Throwable -> L8f
        L72:
            int r11 = d.j.T0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L8b
            android.widget.CheckedTextView r11 = r10.f1051a     // Catch: java.lang.Throwable -> L8f
            int r12 = d.j.T0     // Catch: java.lang.Throwable -> L8f
            r1 = -1
            int r12 = r0.k(r12, r1)     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.c2.d(r12, r1)     // Catch: java.lang.Throwable -> L8f
            androidx.core.widget.b.c(r11, r12)     // Catch: java.lang.Throwable -> L8f
        L8b:
            r0.w()
            return
        L8f:
            r11 = move-exception
            r0.w()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.d(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f1056f) {
            this.f1056f = false;
        } else {
            this.f1056f = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f1052b = colorStateList;
        this.f1054d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f1053c = mode;
        this.f1055e = true;
        a();
    }
}
