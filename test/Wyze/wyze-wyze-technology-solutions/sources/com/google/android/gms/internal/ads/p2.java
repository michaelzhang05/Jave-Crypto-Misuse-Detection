package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p2 implements zzahw {
    private final zzbbr a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzamd f11970b;

    public p2(zzamd zzamdVar, zzbbr zzbbrVar) {
        this.f11970b = zzamdVar;
        this.a = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void a(JSONObject jSONObject) {
        zzall zzallVar;
        try {
            zzbbr zzbbrVar = this.a;
            zzallVar = this.f11970b.a;
            zzbbrVar.b(zzallVar.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.a.b(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.a.c(new zzali());
            } else {
                this.a.c(new zzali(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
