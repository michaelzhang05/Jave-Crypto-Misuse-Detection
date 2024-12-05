package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes2.dex */
public final class zzp {
    private static Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10919b;

    /* renamed from: c, reason: collision with root package name */
    private static String f10920c;

    /* renamed from: d, reason: collision with root package name */
    private static int f10921d;

    public static String a(Context context) {
        c(context);
        return f10920c;
    }

    public static int b(Context context) {
        c(context);
        return f10921d;
    }

    private static void c(Context context) {
        Bundle bundle;
        synchronized (a) {
            if (f10919b) {
                return;
            }
            f10919b = true;
            try {
                bundle = Wrappers.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("MetadataValueReader", "This should never happen.", e2);
            }
            if (bundle == null) {
                return;
            }
            f10920c = bundle.getString("com.google.app.id");
            f10921d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
