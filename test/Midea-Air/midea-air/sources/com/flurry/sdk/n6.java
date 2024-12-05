package com.flurry.sdk;

import com.flurry.sdk.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n6 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f10059b = 3;

    /* renamed from: c, reason: collision with root package name */
    public final int f10060c = 328;

    /* renamed from: d, reason: collision with root package name */
    public final String f10061d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10063f;

    /* renamed from: g, reason: collision with root package name */
    public final d.EnumC0162d f10064g;

    public n6(String str, int i2, boolean z, d.EnumC0162d enumC0162d) {
        this.f10061d = str;
        this.f10062e = i2;
        this.f10063f = z;
        this.f10064g = enumC0162d;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.agent.version", this.f10060c);
        a.put("fl.agent.platform", this.f10059b);
        a.put("fl.apikey", this.f10061d);
        a.put("fl.agent.report.key", this.f10062e);
        a.put("fl.background.session.metrics", this.f10063f);
        a.put("fl.play.service.availability", this.f10064g.o);
        return a;
    }
}
