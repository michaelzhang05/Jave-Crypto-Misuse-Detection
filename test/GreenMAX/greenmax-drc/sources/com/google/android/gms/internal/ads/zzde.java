package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class zzde extends zzdf {
    private AdvertisingIdClient.Info I;

    @Override // com.google.android.gms.internal.ads.zzdf, com.google.android.gms.internal.ads.zzdd
    protected final zzbp.zza.C0173zza b(Context context, View view, Activity activity) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void h(zzdy zzdyVar, Context context, zzbp.zza.C0173zza c0173zza, zzbk.zza zzaVar) {
        if (zzdyVar.n) {
            AdvertisingIdClient.Info info = this.I;
            if (info != null) {
                String id = info.getId();
                if (!TextUtils.isEmpty(id)) {
                    c0173zza.B(zzef.e(id));
                    c0173zza.W(zzbp.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    c0173zza.a0(this.I.isLimitAdTrackingEnabled());
                }
                this.I = null;
                return;
            }
            return;
        }
        zzdf.i(k(zzdyVar, context, c0173zza, zzaVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdf
    public final List<Callable<Void>> k(zzdy zzdyVar, Context context, zzbp.zza.C0173zza c0173zza, zzbk.zza zzaVar) {
        ArrayList arrayList = new ArrayList();
        if (zzdyVar.r() == null) {
            return arrayList;
        }
        arrayList.add(new zzes(zzdyVar, "3pegtvj7nkb7e3rwh5b+3dnQATJj6aqtaosJ3DkOYPzNGN2w+CoarbJEsY1UQgeA", "/kRTFQbKQx44ublaFMNQ8yNL6QxOrgEofiWDpZSH6zA=", c0173zza, zzdyVar.q(), 24));
        return arrayList;
    }
}
