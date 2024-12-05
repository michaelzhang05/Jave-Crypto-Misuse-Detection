package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcrd implements zzcuz<Bundle> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzyd f14382b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Parcelable> f14383c;

    public zzcrd(Context context, zzyd zzydVar, List<Parcelable> list) {
        this.a = context;
        this.f14382b = zzydVar;
        this.f14383c = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzk.zzlg();
        bundle2.putString("activity", zzaxi.z(this.a));
        Bundle bundle3 = new Bundle();
        bundle3.putInt("width", this.f14382b.f15814j);
        bundle3.putInt("height", this.f14382b.f15811g);
        bundle2.putBundle("size", bundle3);
        if (this.f14383c.size() > 0) {
            List<Parcelable> list = this.f14383c;
            bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
    }
}
