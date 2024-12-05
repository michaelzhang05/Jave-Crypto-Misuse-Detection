package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes2.dex */
final class t4 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Context f12190f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzbbr f12191g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4(zzawg zzawgVar, Context context, zzbbr zzbbrVar) {
        this.f12190f = context;
        this.f12191g = zzbbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f12191g.b(AdvertisingIdClient.getAdvertisingIdInfo(this.f12190f));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.f12191g.c(e2);
            zzbad.c("Exception while getting advertising Id info", e2);
        }
    }
}
