package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class g implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.zzb a(Context context, String str, DynamiteModule.VersionPolicy.zza zzaVar) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzbVar = new DynamiteModule.VersionPolicy.zzb();
        int a = zzaVar.a(context, str);
        zzbVar.a = a;
        if (a != 0) {
            zzbVar.f11035b = zzaVar.b(context, str, false);
        } else {
            zzbVar.f11035b = zzaVar.b(context, str, true);
        }
        int i2 = zzbVar.a;
        if (i2 == 0 && zzbVar.f11035b == 0) {
            zzbVar.f11036c = 0;
        } else if (zzbVar.f11035b >= i2) {
            zzbVar.f11036c = 1;
        } else {
            zzbVar.f11036c = -1;
        }
        return zzbVar;
    }
}
