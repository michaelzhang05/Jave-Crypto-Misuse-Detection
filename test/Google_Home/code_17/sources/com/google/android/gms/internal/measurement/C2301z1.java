package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2077b1;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2301z1 extends C2077b1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f16915e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Activity f16916f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C2077b1.b f16917g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2301z1(C2077b1.b bVar, Bundle bundle, Activity activity) {
        super(C2077b1.this);
        this.f16915e = bundle;
        this.f16916f = activity;
        this.f16917g = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C2077b1.a
    final void a() {
        Bundle bundle;
        Q0 q02;
        if (this.f16915e != null) {
            bundle = new Bundle();
            if (this.f16915e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f16915e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        q02 = C2077b1.this.f16562i;
        ((Q0) AbstractC1400p.l(q02)).onActivityCreated(Y.b.s0(this.f16916f), bundle, this.f16564b);
    }
}
