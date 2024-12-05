package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcef implements zzdti<zzwj> {
    private final zzdtu<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<String> f13961b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f13962c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<Integer> f13963d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<String> f13964e;

    private zzcef(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<Integer> zzdtuVar4, zzdtu<String> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13961b = zzdtuVar2;
        this.f13962c = zzdtuVar3;
        this.f13963d = zzdtuVar4;
        this.f13964e = zzdtuVar5;
    }

    public static zzcef a(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<Integer> zzdtuVar4, zzdtu<String> zzdtuVar5) {
        return new zzcef(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Context context = this.a.get();
        final String str = this.f13961b.get();
        zzbai zzbaiVar = this.f13962c.get();
        final int intValue = this.f13963d.get().intValue();
        final String str2 = this.f13964e.get();
        zzwj zzwjVar = new zzwj(new zzwo(context));
        final zzxo zzxoVar = new zzxo();
        zzxoVar.f15774c = Integer.valueOf(zzbaiVar.f13151g);
        zzxoVar.f15775d = Integer.valueOf(zzbaiVar.f13152h);
        zzxoVar.f15776e = Integer.valueOf(zzbaiVar.f13153i ? 0 : 2);
        zzwjVar.a(new zzwk(intValue, str, zzxoVar, str2) { // from class: com.google.android.gms.internal.ads.fi
            private final int a;

            /* renamed from: b, reason: collision with root package name */
            private final String f11422b;

            /* renamed from: c, reason: collision with root package name */
            private final zzxo f11423c;

            /* renamed from: d, reason: collision with root package name */
            private final String f11424d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = intValue;
                this.f11422b = str;
                this.f11423c = zzxoVar;
                this.f11424d = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            public final void a(zzxn zzxnVar) {
                int i2 = this.a;
                String str3 = this.f11422b;
                zzxo zzxoVar2 = this.f11423c;
                String str4 = this.f11424d;
                zzxnVar.l.f15743c = Integer.valueOf(i2);
                zzxl zzxlVar = zzxnVar.f15771i;
                zzxlVar.f15757c = str3;
                zzxlVar.f15760f = zzxoVar2;
                zzxnVar.f15766d = str4;
            }
        });
        return (zzwj) zzdto.b(zzwjVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
