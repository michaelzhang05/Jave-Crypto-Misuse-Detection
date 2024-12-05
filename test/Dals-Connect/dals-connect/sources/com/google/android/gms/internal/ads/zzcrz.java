package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcrz implements zzcva<Object> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14407b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbqe f14408c;

    /* renamed from: d, reason: collision with root package name */
    private final zzcyi f14409d;

    /* renamed from: e, reason: collision with root package name */
    private final zzcxv f14410e;

    public zzcrz(String str, String str2, zzbqe zzbqeVar, zzcyi zzcyiVar, zzcxv zzcxvVar) {
        this.a = str;
        this.f14407b = str2;
        this.f14408c = zzbqeVar;
        this.f14409d = zzcyiVar;
        this.f14410e = zzcxvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        this.f14408c.b(this.f14410e.f14573d);
        bundle.putBundle("quality_signals", this.f14409d.b());
        bundle.putString("seq_num", this.a);
        bundle.putString("session_id", this.f14407b);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<Object> b() {
        return zzbar.o(new zzcuz(this) { // from class: com.google.android.gms.internal.ads.xn
            private final zzcrz a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            public final void a(Object obj) {
                this.a.a((Bundle) obj);
            }
        });
    }
}
