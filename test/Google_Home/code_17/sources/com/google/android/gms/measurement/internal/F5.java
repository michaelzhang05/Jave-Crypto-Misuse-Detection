package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class F5 extends C5 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f17032c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F5(I5 i52) {
        super(i52);
        this.f16988b.C0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        if (t()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void s() {
        if (!this.f17032c) {
            u();
            this.f16988b.B0();
            this.f17032c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t() {
        if (this.f17032c) {
            return true;
        }
        return false;
    }

    protected abstract boolean u();
}
