package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f23057a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f23057a == null) {
            synchronized (b.class) {
                try {
                    if (f23057a == null) {
                        f23057a = new b();
                    }
                    bVar = f23057a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }
        return f23057a;
    }

    public final void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int h8 = cVar.h();
        if (h8 == 1) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, map);
            return;
        }
        if (h8 == 2) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar, map);
            return;
        }
        if (h8 == 3) {
            new com.mbridge.msdk.video.dynview.j.b().a(view, cVar);
        } else if (h8 == 4) {
            new com.mbridge.msdk.video.dynview.j.b().b(view, cVar, map);
        } else {
            if (h8 != 5) {
                return;
            }
            new com.mbridge.msdk.video.dynview.j.b();
        }
    }
}