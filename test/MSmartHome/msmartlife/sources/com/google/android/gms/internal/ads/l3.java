package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class l3 implements DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzapu f11748f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l3(zzapu zzapuVar) {
        this.f11748f = zzapuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f11748f.e("User canceled the download.");
    }
}
