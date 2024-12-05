package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcpl extends zzaoz {

    /* renamed from: f, reason: collision with root package name */
    private final zzcpk f14321f;

    /* renamed from: g, reason: collision with root package name */
    private zzbbr<JSONObject> f14322g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f14323h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14324i;

    public zzcpl(zzcpk zzcpkVar, zzbbr<JSONObject> zzbbrVar) {
        JSONObject jSONObject = new JSONObject();
        this.f14323h = jSONObject;
        this.f14324i = false;
        this.f14322g = zzbbrVar;
        this.f14321f = zzcpkVar;
        try {
            jSONObject.put("adapter_version", zzcpkVar.f14320d.s6().toString());
            jSONObject.put("sdk_version", zzcpkVar.f14320d.t5().toString());
            jSONObject.put("name", zzcpkVar.a);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final synchronized void I2(String str) throws RemoteException {
        if (this.f14324i) {
            return;
        }
        if (str == null) {
            onFailure("Adapter returned null signals");
            return;
        }
        try {
            this.f14323h.put("signals", str);
        } catch (JSONException unused) {
        }
        this.f14322g.b(this.f14323h);
        this.f14324i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final synchronized void onFailure(String str) throws RemoteException {
        if (this.f14324i) {
            return;
        }
        try {
            this.f14323h.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.f14322g.b(this.f14323h);
        this.f14324i = true;
    }
}
