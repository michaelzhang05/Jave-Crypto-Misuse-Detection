package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzciu implements zzczc<zzciv, zzciw> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14099b;

    /* renamed from: c, reason: collision with root package name */
    private final zzasm f14100c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14101d;

    public zzciu(Context context, String str, zzasm zzasmVar, String str2) {
        this.a = context;
        this.f14099b = str;
        this.f14100c = zzasmVar;
        this.f14101d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x020f, code lost:
    
        r2 = new java.lang.StringBuilder(46);
        r2.append("Received error HTTP response code: ");
        r2.append(r10);
        com.google.android.gms.internal.ads.zzbad.i(r2.toString());
        r4 = new java.lang.StringBuilder(46);
        r4.append("Received error HTTP response code: ");
        r4.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0237, code lost:
    
        throw new com.google.android.gms.internal.ads.zzcif(r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzciw b(java.lang.String r20, com.google.android.gms.internal.ads.zzasd r21, org.json.JSONObject r22, java.lang.String r23) throws com.google.android.gms.internal.ads.zzcif {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciu.b(java.lang.String, com.google.android.gms.internal.ads.zzasd, org.json.JSONObject, java.lang.String):com.google.android.gms.internal.ads.zzciw");
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final /* synthetic */ zzciw a(zzciv zzcivVar) throws Exception {
        zzasd zzasdVar;
        zzasd zzasdVar2;
        JSONObject jSONObject;
        zzciv zzcivVar2 = zzcivVar;
        zzasdVar = zzcivVar2.f14102b;
        String a = zzasdVar.a();
        zzasdVar2 = zzcivVar2.f14102b;
        jSONObject = zzcivVar2.a;
        return b(a, zzasdVar2, jSONObject, this.f14101d);
    }
}
