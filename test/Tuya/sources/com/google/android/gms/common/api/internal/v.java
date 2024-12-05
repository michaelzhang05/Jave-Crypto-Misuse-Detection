package com.google.android.gms.common.api.internal;

import R.AbstractC1319p;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class v extends y {

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC1938b f15202b;

    public v(int i8, AbstractC1938b abstractC1938b) {
        super(i8);
        this.f15202b = (AbstractC1938b) AbstractC1319p.m(abstractC1938b, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        try {
            this.f15202b.o(status);
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        try {
            this.f15202b.o(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(n nVar) {
        try {
            this.f15202b.m(nVar.v());
        } catch (RuntimeException e8) {
            b(e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void d(g gVar, boolean z8) {
        gVar.c(this.f15202b, z8);
    }
}
