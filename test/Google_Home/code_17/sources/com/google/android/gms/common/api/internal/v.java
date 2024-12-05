package com.google.android.gms.common.api.internal;

import Q.AbstractC1400p;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class v extends y {

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC2062b f16003b;

    public v(int i8, AbstractC2062b abstractC2062b) {
        super(i8);
        this.f16003b = (AbstractC2062b) AbstractC1400p.m(abstractC2062b, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void a(Status status) {
        try {
            this.f16003b.o(status);
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void b(Exception exc) {
        try {
            this.f16003b.o(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void c(n nVar) {
        try {
            this.f16003b.m(nVar.v());
        } catch (RuntimeException e8) {
            b(e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final void d(g gVar, boolean z8) {
        gVar.c(this.f16003b, z8);
    }
}
