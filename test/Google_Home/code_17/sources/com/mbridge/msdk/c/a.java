package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private String f18932e;

    /* renamed from: f, reason: collision with root package name */
    private String f18933f;

    /* renamed from: g, reason: collision with root package name */
    private int f18934g;

    /* renamed from: a, reason: collision with root package name */
    private int f18928a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f18929b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f18930c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f18931d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f18935h = 0;

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
            aVar.f18932e = jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f20755g);
            aVar.f18933f = jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f20759k);
            aVar.f18934g = jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.g.d.f().f20763o);
            aVar.f18935h = jSONObject.optInt("type", 0);
            int i8 = 1;
            int optInt = jSONObject.optInt("batch_size", 1);
            if (optInt >= 1) {
                i8 = optInt;
            }
            aVar.f18928a = i8;
            aVar.f18930c = jSONObject.optInt(TypedValues.TransitionType.S_DURATION, 0);
            aVar.f18929b = jSONObject.optInt("disable", 0);
            aVar.f18931d = jSONObject.optInt("e_t_l", 0);
        } catch (Exception e10) {
            e8 = e10;
            e8.printStackTrace();
            return aVar;
        }
        return aVar;
    }

    public final int b() {
        return this.f18929b;
    }

    public final int c() {
        return this.f18930c;
    }

    public final int d() {
        return this.f18931d;
    }

    public final String e() {
        return this.f18932e;
    }

    public final String f() {
        return this.f18933f;
    }

    public final int g() {
        return this.f18934g;
    }

    public final int h() {
        return this.f18935h;
    }

    public final int a() {
        return this.f18928a;
    }
}
