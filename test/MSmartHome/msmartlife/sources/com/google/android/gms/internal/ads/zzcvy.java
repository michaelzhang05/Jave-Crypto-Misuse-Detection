package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvy implements zzcva<zzcvx> {
    private final zzasc a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14517b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14518c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbbl f14519d;

    public zzcvy(zzasc zzascVar, Context context, String str, zzbbl zzbblVar) {
        this.a = zzascVar;
        this.f14517b = context;
        this.f14518c = str;
        this.f14519d = zzbblVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcvx a() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzasc zzascVar = this.a;
        if (zzascVar != null) {
            zzascVar.a(this.f14517b, this.f14518c, jSONObject);
        }
        return new zzcvx(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcvx> b() {
        return this.f14519d.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.jp

            /* renamed from: f, reason: collision with root package name */
            private final zzcvy f11662f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11662f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11662f.a();
            }
        });
    }
}
