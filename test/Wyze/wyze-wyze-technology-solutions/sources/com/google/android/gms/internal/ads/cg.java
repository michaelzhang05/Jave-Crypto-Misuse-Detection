package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cg implements zzaho<Object> {
    private final /* synthetic */ zzagd a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzbzq f11248b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cg(zzbzq zzbzqVar, zzagd zzagdVar) {
        this.f11248b = zzbzqVar;
        this.a = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final void a(Object obj, Map<String, String> map) {
        try {
            this.f11248b.f13764k = Long.valueOf(Long.parseLong(map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzbad.g("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f11248b.f13763j = map.get(DeepLinkIntentReceiver.DeepLinksKeys.ID);
        String str = map.get("asset_id");
        zzagd zzagdVar = this.a;
        if (zzagdVar == null) {
            zzbad.e("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzagdVar.onUnconfirmedClickReceived(str);
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }
}
