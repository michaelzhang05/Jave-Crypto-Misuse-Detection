package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvn implements zzcuz<JSONObject> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final AdvertisingIdClient.Info f14506b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14507c;

    public zzcvn(AdvertisingIdClient.Info info, Context context, String str) {
        this.a = context;
        this.f14506b = info;
        this.f14507c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject k2 = zzazc.k(jSONObject, "pii");
            String str = null;
            boolean z = false;
            AdvertisingIdClient.Info info = this.f14506b;
            if (info != null) {
                str = info.getId();
                z = this.f14506b.isLimitAdTrackingEnabled();
            }
            if (!TextUtils.isEmpty(str)) {
                k2.put("rdid", str);
                k2.put("is_lat", z);
                k2.put("idtype", "adid");
            } else {
                k2.put("pdid", this.f14507c);
                k2.put("pdidtype", "ssaid");
            }
        } catch (JSONException e2) {
            zzawz.l("Failed putting Ad ID.", e2);
        }
    }
}
