package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzapx {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12880b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12881c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12882d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12883e;

    private zzapx(zzapz zzapzVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z = zzapzVar.a;
        this.a = z;
        z2 = zzapzVar.f12884b;
        this.f12880b = z2;
        z3 = zzapzVar.f12885c;
        this.f12881c = z3;
        z4 = zzapzVar.f12886d;
        this.f12882d = z4;
        z5 = zzapzVar.f12887e;
        this.f12883e = z5;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.a).put("tel", this.f12880b).put("calendar", this.f12881c).put("storePicture", this.f12882d).put("inlineVideo", this.f12883e);
        } catch (JSONException e2) {
            zzbad.c("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
