package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzapu extends zzaqb {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f12878c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12879d;

    public zzapu(zzbgz zzbgzVar, Map<String, String> map) {
        super(zzbgzVar, "storePicture");
        this.f12878c = map;
        this.f12879d = zzbgzVar.a();
    }

    public final void h() {
        if (this.f12879d == null) {
            e("Activity context is not available");
            return;
        }
        zzk.zzlg();
        if (!zzaxi.y(this.f12879d).d()) {
            e("Feature is not supported by the device.");
            return;
        }
        String str = this.f12878c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            e("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            e(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        zzk.zzlg();
        if (!zzaxi.R(lastPathSegment)) {
            String valueOf2 = String.valueOf(lastPathSegment);
            e(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources b2 = zzk.zzlk().b();
        zzk.zzlg();
        AlertDialog.Builder x = zzaxi.x(this.f12879d);
        x.setTitle(b2 != null ? b2.getString(R.string.s1) : "Save image");
        x.setMessage(b2 != null ? b2.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        x.setPositiveButton(b2 != null ? b2.getString(R.string.s3) : "Accept", new k3(this, str, lastPathSegment));
        x.setNegativeButton(b2 != null ? b2.getString(R.string.s4) : "Decline", new l3(this));
        x.create().show();
    }
}
