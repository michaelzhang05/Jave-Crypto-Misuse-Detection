package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzapt {
    private final zzbgz a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12876b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12877c;

    public zzapt(zzbgz zzbgzVar, Map<String, String> map) {
        this.a = zzbgzVar;
        this.f12877c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f12876b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f12876b = true;
        }
    }

    public final void a() {
        int s;
        if (this.a == null) {
            zzbad.i("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f12877c)) {
            zzk.zzli();
            s = 7;
        } else if ("landscape".equalsIgnoreCase(this.f12877c)) {
            zzk.zzli();
            s = 6;
        } else {
            s = this.f12876b ? -1 : zzk.zzli().s();
        }
        this.a.setRequestedOrientation(s);
    }
}
