package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbmg {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final zzaly f13361b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f13362c;

    /* renamed from: d, reason: collision with root package name */
    private zzbmn f13363d;

    /* renamed from: e, reason: collision with root package name */
    private final zzaho<Object> f13364e = new rc(this);

    /* renamed from: f, reason: collision with root package name */
    private final zzaho<Object> f13365f = new tc(this);

    public zzbmg(String str, zzaly zzalyVar, Executor executor) {
        this.a = str;
        this.f13361b = zzalyVar;
        this.f13362c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.a);
    }

    public final void b(zzbmn zzbmnVar) {
        this.f13361b.b("/updateActiveView", this.f13364e);
        this.f13361b.b("/untrackActiveViewUnit", this.f13365f);
        this.f13363d = zzbmnVar;
    }

    public final void d() {
        this.f13361b.c("/updateActiveView", this.f13364e);
        this.f13361b.c("/untrackActiveViewUnit", this.f13365f);
    }

    public final void f(zzbgz zzbgzVar) {
        zzbgzVar.f("/updateActiveView", this.f13364e);
        zzbgzVar.f("/untrackActiveViewUnit", this.f13365f);
    }

    public final void g(zzbgz zzbgzVar) {
        zzbgzVar.i("/updateActiveView", this.f13364e);
        zzbgzVar.i("/untrackActiveViewUnit", this.f13365f);
    }
}
