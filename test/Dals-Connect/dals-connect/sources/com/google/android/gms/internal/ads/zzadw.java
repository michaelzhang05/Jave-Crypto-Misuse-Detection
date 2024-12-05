package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzadw extends zzaej {

    /* renamed from: f, reason: collision with root package name */
    private final Drawable f12664f;

    /* renamed from: g, reason: collision with root package name */
    private final Uri f12665g;

    /* renamed from: h, reason: collision with root package name */
    private final double f12666h;

    /* renamed from: i, reason: collision with root package name */
    private final int f12667i;

    /* renamed from: j, reason: collision with root package name */
    private final int f12668j;

    public zzadw(Drawable drawable, Uri uri, double d2, int i2, int i3) {
        this.f12664f = drawable;
        this.f12665g = uri;
        this.f12666h = d2;
        this.f12667i = i2;
        this.f12668j = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final double T3() {
        return this.f12666h;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getHeight() {
        return this.f12668j;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getWidth() {
        return this.f12667i;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final Uri n0() throws RemoteException {
        return this.f12665g;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final IObjectWrapper y4() throws RemoteException {
        return ObjectWrapper.i0(this.f12664f);
    }
}
