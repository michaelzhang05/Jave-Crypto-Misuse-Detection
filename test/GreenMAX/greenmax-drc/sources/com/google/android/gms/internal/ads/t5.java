package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
final class t5 implements DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ s5 f12192f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t5(s5 s5Var) {
        this.f12192f = s5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        zzk.zzlg();
        zzaxi.j(this.f12192f.f12146f, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
