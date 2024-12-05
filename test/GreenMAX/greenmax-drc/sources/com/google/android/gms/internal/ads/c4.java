package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzard
@TargetApi(21)
/* loaded from: classes2.dex */
final class c4 {
    private static final Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11209b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f11210c;

    /* renamed from: d, reason: collision with root package name */
    private final zzauq f11211d;

    static {
        HashMap hashMap = new HashMap();
        if (PlatformVersion.h()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        a = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(Context context, List<String> list, zzauq zzauqVar) {
        this.f11209b = context;
        this.f11210c = list;
        this.f11211d = zzauqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> a(String[] strArr) {
        boolean z;
        boolean z2;
        String next;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = this.f11210c.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                next = it.next();
                if (next.equals(str)) {
                    break;
                }
            } while (!(next.length() != 0 ? "android.webkit.resource.".concat(next) : new String("android.webkit.resource.")).equals(str));
            z2 = true;
            if (z2) {
                Map<String, String> map = a;
                if (map.containsKey(str)) {
                    zzk.zzlg();
                    if (!zzaxi.f0(this.f11209b, map.get(str))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                } else {
                    this.f11211d.l(str);
                }
            } else {
                this.f11211d.k(str);
            }
        }
        return arrayList;
    }
}
