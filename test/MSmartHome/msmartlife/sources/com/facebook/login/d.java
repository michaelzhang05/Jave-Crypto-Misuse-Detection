package com.facebook.login;

/* compiled from: LoginBehavior.java */
/* loaded from: classes.dex */
public enum d {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);

    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;

    d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        return this.p;
    }
}
