package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final /* synthetic */ class vp implements Callable {

    /* renamed from: f, reason: collision with root package name */
    static final Callable f12296f = new vp();

    private vp() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzyt.e().c(zzacu.R);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzyt.e().c(zzacu.S)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzazr.b(str2));
                }
            }
        }
        return new zzcxg(hashMap);
    }
}
