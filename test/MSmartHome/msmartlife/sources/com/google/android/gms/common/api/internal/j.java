package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
final class j extends w {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f10632b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ i f10633c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, zabd zabdVar, ConnectionResult connectionResult) {
        super(zabdVar);
        this.f10633c = iVar;
        this.f10632b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void a() {
        this.f10633c.f10631h.y(this.f10632b);
    }
}
