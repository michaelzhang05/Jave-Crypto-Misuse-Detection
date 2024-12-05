package com.mbridge.msdk.f;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f20046a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Boolean f20047b;

    public static boolean a() {
        boolean z8;
        if (f20046a == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                f20046a = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isChina", e8);
                }
            }
        }
        if (f20046a == null || !f20046a.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        boolean z8;
        if (f20047b == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                f20047b = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isOversea", e8);
                }
            }
        }
        if (f20047b == null || !f20047b.booleanValue()) {
            return false;
        }
        return true;
    }
}
