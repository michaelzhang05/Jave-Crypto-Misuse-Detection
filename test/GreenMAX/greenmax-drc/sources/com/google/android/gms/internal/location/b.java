package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
final class b implements ListenerHolder.Notifier<LocationCallback> {
    private final /* synthetic */ LocationResult a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, LocationResult locationResult) {
        this.a = locationResult;
    }
}
