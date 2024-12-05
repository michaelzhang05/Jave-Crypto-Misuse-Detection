package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f1072a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1073b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1074c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1075d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1076e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1077f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(CompoundButton compoundButton) {
        this.f1072a = compoundButton;
    }

    void a() {
        Drawable a6 = androidx.core.widget.c.a(this.f1072a);
        if (a6 != null) {
            if (this.f1075d || this.f1076e) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(a6).mutate();
                if (this.f1075d) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1073b);
                }
                if (this.f1076e) {
                    androidx.core.graphics.drawable.a.p(mutate, this.f1074c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1072a.getDrawableState());
                }
                this.f1072a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i6) {
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1073b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1074c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x005f, B:18:0x0067, B:19:0x0072, B:21:0x007a), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x005f, B:18:0x0067, B:19:0x0072, B:21:0x007a), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f1072a
            android.content.Context r0 = r0.getContext()
            int[] r1 = d.j.U0
            r2 = 0
            androidx.appcompat.widget.c3 r0 = androidx.appcompat.widget.c3.v(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f1072a
            android.content.Context r4 = r3.getContext()
            int[] r5 = d.j.U0
            android.content.res.TypedArray r7 = r0.r()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.b1.o0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = d.j.W0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L3f
            int r11 = d.j.W0     // Catch: java.lang.Throwable -> L8f
            int r11 = r0.n(r11, r2)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L3f
            android.widget.CompoundButton r12 = r10.f1072a     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            android.graphics.drawable.Drawable r11 = e.a.b(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8f
            r11 = 1
            goto L40
        L3e:
        L3f:
            r11 = 0
        L40:
            if (r11 != 0) goto L5f
            int r11 = d.j.V0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L5f
            int r11 = d.j.V0     // Catch: java.lang.Throwable -> L8f
            int r11 = r0.n(r11, r2)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L5f
            android.widget.CompoundButton r12 = r10.f1072a     // Catch: java.lang.Throwable -> L8f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L8f
            android.graphics.drawable.Drawable r11 = e.a.b(r1, r11)     // Catch: java.lang.Throwable -> L8f
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L8f
        L5f:
            int r11 = d.j.X0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L72
            android.widget.CompoundButton r11 = r10.f1072a     // Catch: java.lang.Throwable -> L8f
            int r12 = d.j.X0     // Catch: java.lang.Throwable -> L8f
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch: java.lang.Throwable -> L8f
            androidx.core.widget.c.d(r11, r12)     // Catch: java.lang.Throwable -> L8f
        L72:
            int r11 = d.j.Y0     // Catch: java.lang.Throwable -> L8f
            boolean r11 = r0.s(r11)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L8b
            android.widget.CompoundButton r11 = r10.f1072a     // Catch: java.lang.Throwable -> L8f
            int r12 = d.j.Y0     // Catch: java.lang.Throwable -> L8f
            r1 = -1
            int r12 = r0.k(r12, r1)     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.c2.d(r12, r1)     // Catch: java.lang.Throwable -> L8f
            androidx.core.widget.c.e(r11, r12)     // Catch: java.lang.Throwable -> L8f
        L8b:
            r0.w()
            return
        L8f:
            r11 = move-exception
            r0.w()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f1077f) {
            this.f1077f = false;
        } else {
            this.f1077f = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1073b = colorStateList;
        this.f1075d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1074c = mode;
        this.f1076e = true;
        a();
    }
}
