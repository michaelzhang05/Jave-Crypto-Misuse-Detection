package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2190f4 extends AbstractC2184e4 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16495c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2190f4(r4 r4Var) {
        super(r4Var);
        this.f16482b.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (k()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.f16495c) {
            l();
            this.f16482b.m();
            this.f16495c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f16495c;
    }

    protected abstract boolean l();
}
