package com.mbridge.msdk.video.dynview;

import android.view.View;
import com.mbridge.msdk.video.dynview.e.g;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f23053b;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f23054a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (f23053b == null) {
            synchronized (b.class) {
                try {
                    if (f23053b == null) {
                        f23053b = new b();
                    }
                    bVar = f23053b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }
        return f23053b;
    }

    public final void a(c cVar, g gVar) {
        new com.mbridge.msdk.video.dynview.h.a(cVar, gVar, new HashMap());
    }
}
