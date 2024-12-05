package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class zzbvz {
    private final zzbwz a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbgz f13584b;

    public zzbvz(zzbwz zzbwzVar) {
        this(zzbwzVar, null);
    }

    public Set<zzbuz<zzbrl>> a(zzbxc zzbxcVar) {
        return Collections.singleton(zzbuz.a(zzbxcVar, zzbbm.f13155b));
    }

    public final zzbgz b() {
        return this.f13584b;
    }

    public final zzbwz c() {
        return this.a;
    }

    public final View d() {
        zzbgz zzbgzVar = this.f13584b;
        if (zzbgzVar == null) {
            return null;
        }
        return zzbgzVar.getWebView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (this.f13584b.k0() != null) {
            this.f13584b.k0().close();
        }
    }

    public zzbvz(zzbwz zzbwzVar, zzbgz zzbgzVar) {
        this.a = zzbwzVar;
        this.f13584b = zzbgzVar;
    }
}
