package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class b implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.zzb a(Context context, String str, DynamiteModule.VersionPolicy.zza zzaVar) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzbVar = new DynamiteModule.VersionPolicy.zzb();
        int b2 = zzaVar.b(context, str, true);
        zzbVar.f11035b = b2;
        if (b2 != 0) {
            zzbVar.f11036c = 1;
        } else {
            int a = zzaVar.a(context, str);
            zzbVar.a = a;
            if (a != 0) {
                zzbVar.f11036c = -1;
            }
        }
        return zzbVar;
    }
}
