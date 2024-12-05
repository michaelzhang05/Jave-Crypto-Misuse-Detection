package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;

/* loaded from: classes4.dex */
public class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f20140c;

    private c() {
        c();
    }

    public static void c(boolean z8) {
    }

    public static c j() {
        if (f20140c == null) {
            synchronized (c.class) {
                try {
                    if (f20140c == null) {
                        f20140c = new c();
                    }
                } finally {
                }
            }
        }
        return f20140c;
    }

    public static boolean k() {
        return true;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public final int b(String str) {
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return b8.av();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return b8.au();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return b8.aw();
        }
        return -1;
    }

    public final boolean c(String str) {
        boolean z8;
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
            z8 = true;
        } else {
            z8 = false;
        }
        int aj = b8.aj();
        boolean z9 = aj != 0 ? aj == 1 && b(str) == 1 : a(str) == 1 && b(str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z9 = a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && j().g() == 2) {
            return (b8.aG() || z8 || a(str) != 1) ? false : true;
        }
        return z9;
    }
}
