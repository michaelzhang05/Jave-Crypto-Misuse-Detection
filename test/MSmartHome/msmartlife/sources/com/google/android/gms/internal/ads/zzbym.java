package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzbym extends zzaef {

    /* renamed from: f, reason: collision with root package name */
    private final zzbyt f13679f;

    public zzbym(zzbyt zzbytVar) {
        this.f13679f = zzbytVar;
    }

    private final float H7() {
        try {
            return this.f13679f.m().G();
        } catch (RemoteException e2) {
            zzbad.c("Remote exception getting video controller aspect ratio.", e2);
            return 0.0f;
        }
    }

    private final float I7() {
        zzadw zzadwVar = this.f13679f.h().get(0);
        if (zzadwVar.getWidth() != -1 && zzadwVar.getHeight() != -1) {
            return zzadwVar.getWidth() / zzadwVar.getHeight();
        }
        try {
            Drawable drawable = (Drawable) ObjectWrapper.R(zzadwVar.y4());
            if (drawable == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
                return 0.0f;
            }
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } catch (RemoteException e2) {
            zzbad.c("RemoteException getting Drawable for aspect ratio calculation.", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaee
    public final float G() {
        if (!((Boolean) zzyt.e().c(zzacu.e5)).booleanValue()) {
            return 0.0f;
        }
        if (this.f13679f.Y() != 0.0f) {
            return this.f13679f.Y();
        }
        if (this.f13679f.m() != null) {
            return H7();
        }
        return I7();
    }
}
