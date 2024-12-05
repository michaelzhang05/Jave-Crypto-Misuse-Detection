package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public abstract class zzbgl extends zzbft {

    /* renamed from: i, reason: collision with root package name */
    private final zzbdk f13263i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13264j;

    /* renamed from: k, reason: collision with root package name */
    private String f13265k;
    private boolean l;

    public zzbgl(zzbdf zzbdfVar) {
        super(zzbdfVar);
        this.f13265k = null;
        zzbdk zzbdkVar = new zzbdk();
        this.f13263i = zzbdkVar;
        zzbdkVar.c(new ja(this));
    }

    protected abstract zzhn C(String str);

    protected abstract int D();

    public final void E() {
        synchronized (this) {
            this.l = true;
            this.f13263i.a();
        }
    }

    public final zzbdk F() {
        return this.f13263i;
    }

    @Override // com.google.android.gms.internal.ads.zzbft, com.google.android.gms.common.api.Releasable
    public void a() {
        this.f13263i.i();
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void c() {
        synchronized (this) {
            this.f13264j = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        java.lang.Thread.sleep(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        throw new java.io.IOException("Interrupted sleep.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
    
        r0 = java.lang.Long.toString(r20);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 27);
        r3.append("Timeout reached. Limit: ");
        r3.append(r0);
        r3.append(" ms");
        r2 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:
    
        throw new java.io.IOException("Timed out while buffering.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [long] */
    /* JADX WARN: Type inference failed for: r1v34 */
    @Override // com.google.android.gms.internal.ads.zzbft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgl.y(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbft
    public final String z(String str) {
        String valueOf = String.valueOf(super.z(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }
}
