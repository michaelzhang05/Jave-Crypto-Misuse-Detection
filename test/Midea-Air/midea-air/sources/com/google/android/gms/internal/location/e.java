package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzy;

/* loaded from: classes2.dex */
final class e extends zzy {

    /* renamed from: f, reason: collision with root package name */
    private final ListenerHolder<LocationListener> f15884f;

    @Override // com.google.android.gms.location.zzx
    public final synchronized void P6(Location location) {
        this.f15884f.c(new f(this, location));
    }
}
