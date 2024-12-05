package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f4 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f9872b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9873c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9874d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9875e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f9876f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9877g;

    public f4(c0 c0Var) {
        this.f9872b = c0Var.a;
        this.f9873c = c0Var.f9766b;
        this.f9874d = c0Var.f9767c;
        this.f9875e = c0Var.f9768d;
        this.f9876f = c0Var.f9769e;
        this.f9877g = c0Var.f9770f;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.session.timestamp", this.f9873c);
        a.put("fl.initial.timestamp", this.f9874d);
        a.put("fl.continue.session.millis", this.f9875e);
        a.put("fl.session.state", this.f9872b.f9851j);
        a.put("fl.session.event", this.f9876f.name());
        a.put("fl.session.manual", this.f9877g);
        return a;
    }
}
