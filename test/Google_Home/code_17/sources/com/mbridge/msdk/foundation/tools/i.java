package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i extends c {

    /* renamed from: w, reason: collision with root package name */
    public int f21136w;

    /* renamed from: x, reason: collision with root package name */
    public int f21137x;

    public i(Context context) {
        super(context);
        this.f21137x = z.o();
        this.f21136w = z.f();
    }

    @Override // com.mbridge.msdk.foundation.tools.c
    public JSONObject a() {
        JSONObject a8 = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f21137x + "");
                jSONObject.put("dmf", this.f21136w);
            }
        } catch (JSONException e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DomainDeviceInfo", e8.getMessage());
            }
        }
        return a8;
    }
}
