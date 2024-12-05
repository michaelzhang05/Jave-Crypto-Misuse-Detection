package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private String f18006f;

    /* renamed from: g, reason: collision with root package name */
    private String f18007g;

    /* renamed from: h, reason: collision with root package name */
    private int f18008h;

    /* renamed from: a, reason: collision with root package name */
    private int f18001a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f18002b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f18003c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f18004d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f18005e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f18009i = 0;

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
            dVar.f18006f = jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.g.d.f().f19698e);
            dVar.f18007g = jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.g.d.f().f19703j);
            dVar.f18008h = jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.g.d.f().f19707n);
            dVar.f18009i = jSONObject.optInt("type", 1);
            dVar.f18004d = jSONObject.optInt("d_t", 30);
            dVar.f18003c = jSONObject.optInt("d_a", 0);
        } catch (Exception e10) {
            e8 = e10;
            e8.printStackTrace();
            return dVar;
        }
        return dVar;
    }

    public final int b() {
        return this.f18004d;
    }

    public final String c() {
        return this.f18006f;
    }

    public final String d() {
        return this.f18007g;
    }

    public final int e() {
        return this.f18008h;
    }

    public final int a() {
        return this.f18003c;
    }
}
