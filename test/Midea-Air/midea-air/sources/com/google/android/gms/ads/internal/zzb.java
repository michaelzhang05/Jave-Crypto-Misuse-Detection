package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzaxi;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzb {
    private boolean zzbqv;
    private zzavb zzbqw;
    private zzark zzbqx;
    private final Context zzlj;

    public zzb(Context context, zzavb zzavbVar, zzark zzarkVar) {
        this.zzlj = context;
        this.zzbqw = zzavbVar;
        this.zzbqx = null;
        if (0 == 0) {
            this.zzbqx = new zzark();
        }
    }

    private final boolean zzkw() {
        zzavb zzavbVar = this.zzbqw;
        return (zzavbVar != null && zzavbVar.h().f13005k) || this.zzbqx.f12923f;
    }

    public final void recordClick() {
        this.zzbqv = true;
    }

    public final void zzbk(String str) {
        List<String> list;
        if (zzkw()) {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            zzavb zzavbVar = this.zzbqw;
            if (zzavbVar != null) {
                zzavbVar.a(str, null, 3);
                return;
            }
            zzark zzarkVar = this.zzbqx;
            if (!zzarkVar.f12923f || (list = zzarkVar.f12924g) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzk.zzlg();
                    zzaxi.J(this.zzlj, HttpUrl.FRAGMENT_ENCODE_SET, replace);
                }
            }
        }
    }

    public final boolean zzkx() {
        return !zzkw() || this.zzbqv;
    }
}
