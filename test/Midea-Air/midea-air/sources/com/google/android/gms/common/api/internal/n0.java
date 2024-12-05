package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class n0 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectionResult f10643b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(ConnectionResult connectionResult, int i2) {
        Preconditions.j(connectionResult);
        this.f10643b = connectionResult;
        this.a = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ConnectionResult a() {
        return this.f10643b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.a;
    }
}
