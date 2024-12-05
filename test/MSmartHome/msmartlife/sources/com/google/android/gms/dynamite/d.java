package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class d implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.zzb a(Context context, String str, DynamiteModule.VersionPolicy.zza zzaVar) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzbVar = new DynamiteModule.VersionPolicy.zzb();
        zzbVar.a = zzaVar.a(context, str);
        int b2 = zzaVar.b(context, str, true);
        zzbVar.f11035b = b2;
        int i2 = zzbVar.a;
        if (i2 == 0 && b2 == 0) {
            zzbVar.f11036c = 0;
        } else if (i2 >= b2) {
            zzbVar.f11036c = -1;
        } else {
            zzbVar.f11036c = 1;
        }
        return zzbVar;
    }
}
