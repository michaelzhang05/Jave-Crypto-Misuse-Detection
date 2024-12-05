package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzasj extends zzasl {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f12965b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f12966c;

    /* renamed from: d, reason: collision with root package name */
    private final zzalj<JSONObject, JSONObject> f12967d;

    public zzasj(Context context, zzalj<JSONObject, JSONObject> zzaljVar) {
        this.f12965b = context.getApplicationContext();
        this.f12967d = zzaljVar;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbai.w().f13150f);
            jSONObject.put("mf", zzyt.e().c(zzacu.E2));
            jSONObject.put("cl", "248613007");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 11140);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final zzbbh<Void> a() {
        synchronized (this.a) {
            if (this.f12966c == null) {
                this.f12966c = this.f12965b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzk.zzln().a() - this.f12966c.getLong("js_last_update", 0L) < ((Long) zzyt.e().c(zzacu.D2)).longValue()) {
            return zzbar.o(null);
        }
        return zzbar.d(this.f12967d.a(c(this.f12965b)), new zzbam(this) { // from class: com.google.android.gms.internal.ads.u3
            private final zzasj a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj) {
                return this.a.b((JSONObject) obj);
            }
        }, zzbbm.f13155b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void b(JSONObject jSONObject) {
        zzacu.b(this.f12965b, 1, jSONObject);
        this.f12966c.edit().putLong("js_last_update", zzk.zzln().a()).apply();
        return null;
    }
}
