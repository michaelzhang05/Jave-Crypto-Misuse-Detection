package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

/* loaded from: classes2.dex */
final class a extends zzv {

    /* renamed from: f, reason: collision with root package name */
    private final ListenerHolder<LocationCallback> f15883f;

    @Override // com.google.android.gms.location.zzu
    public final void N3(LocationAvailability locationAvailability) {
        this.f15883f.c(new c(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzu
    public final void e5(LocationResult locationResult) {
        this.f15883f.c(new b(this, locationResult));
    }
}
