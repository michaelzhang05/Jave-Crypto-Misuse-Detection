package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class mp implements zzcva<zzcuz<JSONObject>> {
    private final JSONObject a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mp(Context context) {
        this.a = zzasj.c(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.a);
        } catch (JSONException unused) {
            zzawz.m("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcuz<JSONObject>> b() {
        return zzbar.o(new zzcuz(this) { // from class: com.google.android.gms.internal.ads.np
            private final mp a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            public final void a(Object obj) {
                this.a.a((JSONObject) obj);
            }
        });
    }
}
