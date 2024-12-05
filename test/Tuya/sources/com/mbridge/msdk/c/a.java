package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private String f17877e;

    /* renamed from: f, reason: collision with root package name */
    private String f17878f;

    /* renamed from: g, reason: collision with root package name */
    private int f17879g;

    /* renamed from: a, reason: collision with root package name */
    private int f17873a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f17874b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f17875c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f17876d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f17880h = 0;

    public static a a(String str) {
        Exception e8;
        a aVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            aVar = new a();
        } catch (Exception e9) {
            e8 = e9;
            aVar = null;
        }
        try {
            aVar.f17877e = jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f19700g);
            aVar.f17878f = jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f19704k);
            aVar.f17879g = jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.g.d.f().f19708o);
            aVar.f17880h = jSONObject.optInt("type", 0);
            int i8 = 1;
            int optInt = jSONObject.optInt("batch_size", 1);
            if (optInt >= 1) {
                i8 = optInt;
            }
            aVar.f17873a = i8;
            aVar.f17875c = jSONObject.optInt(TypedValues.TransitionType.S_DURATION, 0);
            aVar.f17874b = jSONObject.optInt("disable", 0);
            aVar.f17876d = jSONObject.optInt("e_t_l", 0);
        } catch (Exception e10) {
            e8 = e10;
            e8.printStackTrace();
            return aVar;
        }
        return aVar;
    }

    public final int b() {
        return this.f17874b;
    }

    public final int c() {
        return this.f17875c;
    }

    public final int d() {
        return this.f17876d;
    }

    public final String e() {
        return this.f17877e;
    }

    public final String f() {
        return this.f17878f;
    }

    public final int g() {
        return this.f17879g;
    }

    public final int h() {
        return this.f17880h;
    }

    public final int a() {
        return this.f17873a;
    }
}
