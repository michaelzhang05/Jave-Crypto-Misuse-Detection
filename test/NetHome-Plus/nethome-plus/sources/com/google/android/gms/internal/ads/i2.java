package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i2 implements zzahw {
    private final zzakw a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbbr f11567b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzalu f11568c;

    public i2(zzalu zzaluVar, zzakw zzakwVar, zzbbr zzbbrVar) {
        this.f11568c = zzaluVar;
        this.a = zzakwVar;
        this.f11567b = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void a(JSONObject jSONObject) {
        zzall zzallVar;
        try {
            try {
                zzbbr zzbbrVar = this.f11567b;
                zzallVar = this.f11568c.a;
                zzbbrVar.b(zzallVar.a(jSONObject));
                this.a.f();
            } catch (IllegalStateException unused) {
                this.a.f();
            } catch (JSONException e2) {
                this.f11567b.b(e2);
                this.a.f();
            }
        } catch (Throwable th) {
            this.a.f();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.f11567b.c(new zzali());
            } else {
                this.f11567b.c(new zzali(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.a.f();
        }
    }
}
