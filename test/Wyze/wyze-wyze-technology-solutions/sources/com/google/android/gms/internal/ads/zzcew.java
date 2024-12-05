package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcew implements zzdti<Set<zzbuz<zzczz>>> {
    private final zzdtu<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13974b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<Executor> f13975c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<Map<zzczs, zzcez>> f13976d;

    public zzcew(zzdtu<String> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<Map<zzczs, zzcez>> zzdtuVar4) {
        this.a = zzdtuVar;
        this.f13974b = zzdtuVar2;
        this.f13975c = zzdtuVar3;
        this.f13976d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Set emptySet;
        final String str = this.a.get();
        Context context = this.f13974b.get();
        Executor executor = this.f13975c.get();
        Map<zzczs, zzcez> map = this.f13976d.get();
        if (((Boolean) zzyt.e().c(zzacu.S3)).booleanValue()) {
            zzwj zzwjVar = new zzwj(new zzwo(context));
            zzwjVar.a(new zzwk(str) { // from class: com.google.android.gms.internal.ads.hi
                private final String a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = str;
                }

                @Override // com.google.android.gms.internal.ads.zzwk
                public final void a(zzxn zzxnVar) {
                    zzxnVar.f15766d = this.a;
                }
            });
            emptySet = Collections.singleton(new zzbuz(new zzcex(zzwjVar, map), executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzdto.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
