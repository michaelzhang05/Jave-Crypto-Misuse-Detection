package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l6 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final long f10010b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10011c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10012d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10013e;

    public l6(long j2, long j3, long j4, int i2) {
        this.f10010b = j2;
        this.f10011c = j3;
        this.f10012d = j4;
        this.f10013e = i2;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.session.id", this.f10010b);
        a.put("fl.session.elapsed.start.time", this.f10011c);
        long j2 = this.f10012d;
        if (j2 >= this.f10011c) {
            a.put("fl.session.elapsed.end.time", j2);
        }
        a.put("fl.session.id.current.state", this.f10013e);
        return a;
    }
}
