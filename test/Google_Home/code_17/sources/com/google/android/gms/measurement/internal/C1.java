package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class C1 extends AbstractC2325c2 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f16985b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(R2 r22) {
        super(r22);
        this.f17844a.k();
    }

    protected abstract boolean A();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        if (z()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (!this.f16985b) {
            if (!A()) {
                this.f17844a.R();
                this.f16985b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void u() {
        if (!this.f16985b) {
            v();
            this.f17844a.R();
            this.f16985b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected void v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z() {
        if (this.f16985b) {
            return true;
        }
        return false;
    }
}
