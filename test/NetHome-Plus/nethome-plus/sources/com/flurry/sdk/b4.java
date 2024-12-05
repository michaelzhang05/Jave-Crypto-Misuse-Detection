package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b4 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f9753b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9754c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9755d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9756e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9757f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9758g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9759h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9760i;

    public b4(int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3) {
        this.a = 2;
        this.f9753b = i2 < 0 ? -1 : i2;
        this.f9754c = str;
        this.f9755d = str2;
        this.f9756e = str3;
        this.f9757f = str4;
        this.f9758g = str5;
        this.f9759h = str6;
        this.f9760i = i3;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.network.status", this.f9753b);
        String str = this.f9754c;
        if (str != null) {
            a.put("fl.cellular.name", str);
            a.put("fl.cellular.operator", this.f9755d);
            a.put("fl.cellular.sim.operator", this.f9756e);
            a.put("fl.cellular.sim.id", this.f9757f);
            a.put("fl.cellular.sim.name", this.f9758g);
            a.put("fl.cellular.band", this.f9759h);
            a.put("fl.cellular.signal.strength", this.f9760i);
        }
        return a;
    }
}
