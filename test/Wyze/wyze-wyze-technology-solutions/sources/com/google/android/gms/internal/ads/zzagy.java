package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzagy implements zzaho<zzbgz> {
    @Override // com.google.android.gms.internal.ads.zzaho
    public final /* synthetic */ void a(zzbgz zzbgzVar, Map map) {
        zzbgz zzbgzVar2 = zzbgzVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbad.i("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzbad.i("No timestamp given for CSI tick.");
                return;
            }
            try {
                long b2 = zzk.zzln().b() + (Long.parseLong(str4) - zzk.zzln().a());
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzbgzVar2.n().b(str2, str3, b2);
                return;
            } catch (NumberFormatException e2) {
                zzbad.d("Malformed timestamp for CSI tick.", e2);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbad.i("No value given for CSI experiment.");
                return;
            }
            zzadi c2 = zzbgzVar2.n().c();
            if (c2 == null) {
                zzbad.i("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                c2.d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbad.i("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                zzbad.i("No name given for CSI extra.");
                return;
            }
            zzadi c3 = zzbgzVar2.n().c();
            if (c3 == null) {
                zzbad.i("No ticker for WebView, dropping extra parameter.");
            } else {
                c3.d(str6, str7);
            }
        }
    }
}
