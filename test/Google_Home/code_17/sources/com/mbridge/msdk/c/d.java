package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private String f19061f;

    /* renamed from: g, reason: collision with root package name */
    private String f19062g;

    /* renamed from: h, reason: collision with root package name */
    private int f19063h;

    /* renamed from: a, reason: collision with root package name */
    private int f19056a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f19057b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f19058c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f19059d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f19060e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f19064i = 0;

    public static d a(String str) {
        Exception e8;
        d dVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            dVar = new d();
        } catch (Exception e9) {
            e8 = e9;
            dVar = null;
        }
        try {
            dVar.f19061f = jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.g.d.f().f20753e);
            dVar.f19062g = jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.g.d.f().f20758j);
            dVar.f19063h = jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.g.d.f().f20762n);
            dVar.f19064i = jSONObject.optInt("type", 1);
            dVar.f19059d = jSONObject.optInt("d_t", 30);
            dVar.f19058c = jSONObject.optInt("d_a", 0);
        } catch (Exception e10) {
            e8 = e10;
            e8.printStackTrace();
            return dVar;
        }
        return dVar;
    }

    public final int b() {
        return this.f19059d;
    }

    public final String c() {
        return this.f19061f;
    }

    public final String d() {
        return this.f19062g;
    }

    public final int e() {
        return this.f19063h;
    }

    public final int a() {
        return this.f19058c;
    }
}
