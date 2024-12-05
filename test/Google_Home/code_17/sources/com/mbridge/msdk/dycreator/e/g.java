package com.mbridge.msdk.dycreator.e;

import android.util.Log;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19742a = false;

    public static void a(String str) {
        if (f19742a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
