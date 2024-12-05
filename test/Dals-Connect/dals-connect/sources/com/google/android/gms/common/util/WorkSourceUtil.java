package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.reflect.Method;

@KeepForSdk
/* loaded from: classes2.dex */
public class WorkSourceUtil {
    private static final int a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f10998b = e();

    /* renamed from: c, reason: collision with root package name */
    private static final Method f10999c = f();

    /* renamed from: d, reason: collision with root package name */
    private static final Method f11000d = g();

    /* renamed from: e, reason: collision with root package name */
    private static final Method f11001e = a();

    /* renamed from: f, reason: collision with root package name */
    private static final Method f11002f = b();

    /* renamed from: g, reason: collision with root package name */
    private static final Method f11003g = c();

    /* renamed from: h, reason: collision with root package name */
    private static final Method f11004h = d();

    private WorkSourceUtil() {
    }

    private static Method a() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method b() {
        if (PlatformVersion.e()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method c() {
        if (PlatformVersion.l()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static final Method d() {
        if (PlatformVersion.l()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        return null;
    }

    private static Method e() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method f() {
        if (PlatformVersion.e()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method g() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
