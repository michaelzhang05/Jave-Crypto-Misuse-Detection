package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2444t3 extends AbstractC2451u3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f17837b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2444t3(R2 r22) {
        super(r22);
        this.f17844a.k();
    }

    protected void l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        if (p()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void n() {
        if (!this.f17837b) {
            if (!q()) {
                this.f17844a.R();
                this.f17837b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void o() {
        if (!this.f17837b) {
            l();
            this.f17844a.R();
            this.f17837b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        if (this.f17837b) {
            return true;
        }
        return false;
    }

    protected abstract boolean q();
}
