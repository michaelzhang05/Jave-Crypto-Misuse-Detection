package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public final class DeviceProperties {
    private static Boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f10991b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f10992c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f10993d;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean a(Context context) {
        if (f10992c == null) {
            PackageManager packageManager = context.getPackageManager();
            f10992c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f10992c.booleanValue();
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean b(Context context) {
        if (f10991b == null) {
            f10991b = Boolean.valueOf(PlatformVersion.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f10991b.booleanValue();
    }

    @KeepForSdk
    public static boolean c() {
        return "user".equals(Build.TYPE);
    }

    @KeepForSdk
    @TargetApi(20)
    public static boolean d(Context context) {
        if (a == null) {
            a = Boolean.valueOf(PlatformVersion.g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean e(Context context) {
        if (!d(context)) {
            return false;
        }
        if (PlatformVersion.j()) {
            return b(context) && !PlatformVersion.k();
        }
        return true;
    }

    public static boolean f(Context context) {
        if (f10993d == null) {
            f10993d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f10993d.booleanValue();
    }
}
