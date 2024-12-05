package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaso implements zzasb {
    private zzalj<JSONObject, JSONObject> a;

    /* renamed from: b, reason: collision with root package name */
    private zzalj<JSONObject, JSONObject> f12968b;

    public zzaso(Context context) {
        zzalr a = zzk.zzlt().a(context, zzbai.w());
        zzaln<JSONObject> zzalnVar = zzalo.f12779b;
        this.a = a.a("google.afma.request.getAdDictionary", zzalnVar, zzalnVar);
        this.f12968b = zzk.zzlt().a(context, zzbai.w()).a("google.afma.sdkConstants.getSdkConstants", zzalnVar, zzalnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final zzalj<JSONObject, JSONObject> a() {
        return this.f12968b;
    }
}
