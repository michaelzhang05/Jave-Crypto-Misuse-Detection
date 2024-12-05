package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzccd extends zzaff {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13870f;

    /* renamed from: g, reason: collision with root package name */
    private final zzbyt f13871g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbzl f13872h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbyn f13873i;

    public zzccd(Context context, zzbyt zzbytVar, zzbzl zzbzlVar, zzbyn zzbynVar) {
        this.f13870f = context;
        this.f13871g = zzbytVar;
        this.f13872h = zzbzlVar;
        this.f13873i = zzbynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final zzaei B1(String str) {
        return this.f13871g.D().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final boolean D3(IObjectWrapper iObjectWrapper) {
        Object R = ObjectWrapper.R(iObjectWrapper);
        if (!(R instanceof ViewGroup) || !this.f13872h.b((ViewGroup) R)) {
            return false;
        }
        this.f13871g.A().x0(new ih(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final String E0(String str) {
        return this.f13871g.E().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final IObjectWrapper c5() {
        return ObjectWrapper.i0(this.f13870f);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void destroy() {
        this.f13873i.a();
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final List<String> getAvailableAssetNames() {
        c.e.g<String, zzadw> D = this.f13871g.D();
        c.e.g<String, String> E = this.f13871g.E();
        String[] strArr = new String[D.size() + E.size()];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < D.size()) {
            strArr[i4] = D.i(i3);
            i3++;
            i4++;
        }
        while (i2 < E.size()) {
            strArr[i4] = E.i(i2);
            i2++;
            i4++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final String getCustomTemplateId() {
        return this.f13871g.e();
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final zzaar getVideoController() {
        return this.f13871g.m();
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final IObjectWrapper k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void performClick(String str) {
        this.f13873i.x(str);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void recordImpression() {
        this.f13873i.p();
    }
}
