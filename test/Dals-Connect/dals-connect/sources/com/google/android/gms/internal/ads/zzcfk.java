package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcfk implements zzczz {

    /* renamed from: g, reason: collision with root package name */
    private final zzcfi f13992g;

    /* renamed from: h, reason: collision with root package name */
    private final Clock f13993h;

    /* renamed from: f, reason: collision with root package name */
    private final Map<zzczs, Long> f13991f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Map<zzczs, ii> f13994i = new HashMap();

    public zzcfk(zzcfi zzcfiVar, Set<ii> set, Clock clock) {
        zzczs zzczsVar;
        this.f13992g = zzcfiVar;
        for (ii iiVar : set) {
            Map<zzczs, ii> map = this.f13994i;
            zzczsVar = iiVar.f11604c;
            map.put(zzczsVar, iiVar);
        }
        this.f13993h = clock;
    }

    private final void a(zzczs zzczsVar, boolean z) {
        zzczs zzczsVar2;
        String str;
        zzczsVar2 = this.f13994i.get(zzczsVar).f11603b;
        String str2 = z ? "s." : "f.";
        if (this.f13991f.containsKey(zzczsVar2)) {
            long b2 = this.f13993h.b() - this.f13991f.get(zzczsVar2).longValue();
            Map<String, String> c2 = this.f13992g.c();
            str = this.f13994i.get(zzczsVar).a;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            c2.put(concat, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void b(zzczs zzczsVar, String str, Throwable th) {
        if (this.f13991f.containsKey(zzczsVar)) {
            long b2 = this.f13993h.b() - this.f13991f.get(zzczsVar).longValue();
            Map<String, String> c2 = this.f13992g.c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            c2.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f13994i.containsKey(zzczsVar)) {
            a(zzczsVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void c(zzczs zzczsVar, String str) {
        if (this.f13991f.containsKey(zzczsVar)) {
            long b2 = this.f13993h.b() - this.f13991f.get(zzczsVar).longValue();
            Map<String, String> c2 = this.f13992g.c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            c2.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f13994i.containsKey(zzczsVar)) {
            a(zzczsVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void d(zzczs zzczsVar, String str) {
        this.f13991f.put(zzczsVar, Long.valueOf(this.f13993h.b()));
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void e(zzczs zzczsVar, String str) {
    }
}
