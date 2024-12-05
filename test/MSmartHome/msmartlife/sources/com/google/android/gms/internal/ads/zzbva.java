package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzbva extends zzbts<zzue> implements zzue {

    /* renamed from: g, reason: collision with root package name */
    private Map<View, zzua> f13569g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f13570h;

    /* renamed from: i, reason: collision with root package name */
    private final zzcxm f13571i;

    public zzbva(Context context, Set<zzbuz<zzue>> set, zzcxm zzcxmVar) {
        super(set);
        this.f13569g = new WeakHashMap(1);
        this.f13570h = context;
        this.f13571i = zzcxmVar;
    }

    public final synchronized void Y(View view) {
        zzua zzuaVar = this.f13569g.get(view);
        if (zzuaVar == null) {
            zzuaVar = new zzua(this.f13570h, view);
            zzuaVar.d(this);
            this.f13569g.put(view, zzuaVar);
        }
        zzcxm zzcxmVar = this.f13571i;
        if (zzcxmVar != null && zzcxmVar.N) {
            if (((Boolean) zzyt.e().c(zzacu.R1)).booleanValue()) {
                zzuaVar.j(((Long) zzyt.e().c(zzacu.Q1)).longValue());
                return;
            }
        }
        zzuaVar.m();
    }

    public final synchronized void f0(View view) {
        if (this.f13569g.containsKey(view)) {
            this.f13569g.get(view).e(this);
            this.f13569g.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final synchronized void r0(final zzud zzudVar) {
        T(new zzbtu(zzudVar) { // from class: com.google.android.gms.internal.ads.af
            private final zzud a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzudVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                ((zzue) obj).r0(this.a);
            }
        });
    }
}
