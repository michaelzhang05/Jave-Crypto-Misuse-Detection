package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwl;

/* loaded from: classes2.dex */
public final class zzcev implements zzdti<zzcez> {
    private static final zzcev a = new zzcev();

    public static zzcev a() {
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcez) zzdto.b(new zzcez(zzwl.zza.zzb.REQUEST_WILL_PROCESS_RESPONSE, zzwl.zza.zzb.REQUEST_DID_PROCESS_RESPONSE, zzwl.zza.zzb.REQUEST_FAILED_TO_PROCESS_RESPONSE), "Cannot return null from a non-@Nullable @Provides method");
    }
}
