package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmw implements zzdti<Set<zzbuz<zzue>>> {
    private final zzdtu<zzbmn> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Executor> f13393b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<JSONObject> f13394c;

    private zzbmw(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        this.a = zzdtuVar;
        this.f13393b = zzdtuVar2;
        this.f13394c = zzdtuVar3;
    }

    public static zzbmw a(zzdtu<zzbmn> zzdtuVar, zzdtu<Executor> zzdtuVar2, zzdtu<JSONObject> zzdtuVar3) {
        return new zzbmw(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Set singleton;
        zzbmn zzbmnVar = this.a.get();
        Executor executor = this.f13393b.get();
        if (this.f13394c.get() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzbuz(zzbmnVar, executor));
        }
        return (Set) zzdto.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
    }
}