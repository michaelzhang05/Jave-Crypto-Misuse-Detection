package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2258s2 extends AbstractC2253r2 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f16819b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2258s2(Y1 y12) {
        super(y12);
        this.f16777a.i();
    }

    protected void i() {
    }

    protected abstract boolean j();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        if (n()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (!this.f16819b) {
            if (!j()) {
                this.f16777a.g();
                this.f16819b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void m() {
        if (!this.f16819b) {
            i();
            this.f16777a.g();
            this.f16819b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        return this.f16819b;
    }
}
