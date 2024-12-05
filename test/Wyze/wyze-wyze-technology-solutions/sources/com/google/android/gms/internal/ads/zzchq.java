package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.io.StringReader;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzchq {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbai f14074b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcxv f14075c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f14076d;

    public zzchq(Context context, zzbai zzbaiVar, zzcxv zzcxvVar, Executor executor) {
        this.a = context;
        this.f14074b = zzbaiVar;
        this.f14075c = zzcxvVar;
        this.f14076d = executor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbbh<zzcxu> a() {
        zzalr b2 = zzk.zzlt().b(this.a, this.f14074b);
        zzaln<JSONObject> zzalnVar = zzalo.f12779b;
        final zzalj a = b2.a("google.afma.response.normalize", zzalnVar, zzalnVar);
        final zzxt zzxtVar = this.f14075c.f14573d.x;
        return zzbar.c(zzbar.c(zzbar.c(zzbar.o(HttpUrl.FRAGMENT_ENCODE_SET), new zzbal(this, zzxtVar) { // from class: com.google.android.gms.internal.ads.ej
            private final zzchq a;

            /* renamed from: b, reason: collision with root package name */
            private final zzxt f11363b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.f11363b = zzxtVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                zzxt zzxtVar2 = this.f11363b;
                String str = zzxtVar2.f15787f;
                String str2 = zzxtVar2.f15788g;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str);
                jSONObject2.put("base_url", HttpUrl.FRAGMENT_ENCODE_SET);
                jSONObject2.put("signals", new JSONObject(str2));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return zzbar.o(jSONObject);
            }
        }, this.f14076d), new zzbal(a) { // from class: com.google.android.gms.internal.ads.fj
            private final zzalj a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = a;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.a((JSONObject) obj);
            }
        }, this.f14076d), new zzbal(this) { // from class: com.google.android.gms.internal.ads.gj
            private final zzchq a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.b((JSONObject) obj);
            }
        }, this.f14076d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh b(JSONObject jSONObject) throws Exception {
        return zzbar.o(new zzcxu(new zzcxr(this.f14075c), zzcxs.a(new StringReader(jSONObject.toString()))));
    }
}
