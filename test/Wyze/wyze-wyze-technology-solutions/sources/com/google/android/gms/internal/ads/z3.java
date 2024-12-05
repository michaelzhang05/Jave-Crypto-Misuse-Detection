package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
final class z3 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Bitmap f12498f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzauq f12499g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(zzauq zzauqVar, Bitmap bitmap) {
        this.f12499g = zzauqVar;
        this.f12498f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zzdsj zzdsjVar;
        zzdsj zzdsjVar2;
        zzdsj zzdsjVar3;
        zzdsj zzdsjVar4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f12498f.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        obj = this.f12499g.l;
        synchronized (obj) {
            zzdsjVar = this.f12499g.f12991c;
            zzdsjVar.f14941k = new zzdso();
            zzdsjVar2 = this.f12499g.f12991c;
            zzdsjVar2.f14941k.f14953e = byteArrayOutputStream.toByteArray();
            zzdsjVar3 = this.f12499g.f12991c;
            zzdsjVar3.f14941k.f14952d = "image/png";
            zzdsjVar4 = this.f12499g.f12991c;
            zzdsjVar4.f14941k.f14951c = 1;
        }
    }
}
