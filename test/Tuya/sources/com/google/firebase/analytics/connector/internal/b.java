package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC2135x3;
import com.google.android.gms.internal.measurement.AbstractC2143y3;
import com.google.android.gms.internal.measurement.C2103t3;
import com.mbridge.msdk.MBridgeConstans;
import m0.s;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2143y3 f17183a = AbstractC2143y3.q("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2135x3 f17184b = AbstractC2135x3.r("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2135x3 f17185c = AbstractC2135x3.q("auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2135x3 f17186d = AbstractC2135x3.p("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2135x3 f17187e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2135x3 f17188f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f17189g = 0;

    static {
        C2103t3 c2103t3 = new C2103t3();
        c2103t3.a(s.f34891a);
        c2103t3.a(s.f34892b);
        f17187e = c2103t3.b();
        f17188f = AbstractC2135x3.p("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        char c8;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!d(str) || bundle == null) {
            return false;
        }
        AbstractC2135x3 abstractC2135x3 = f17186d;
        int size = abstractC2135x3.size();
        int i8 = 0;
        while (i8 < size) {
            boolean containsKey = bundle.containsKey((String) abstractC2135x3.get(i8));
            i8++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c8 = 2;
                }
                c8 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c8 = 1;
                }
                c8 = 65535;
            }
        } else {
            if (str.equals("fcm")) {
                c8 = 0;
            }
            c8 = 65535;
        }
        if (c8 != 0) {
            if (c8 != 1) {
                if (c8 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean b(String str, Bundle bundle) {
        if (f17184b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            AbstractC2135x3 abstractC2135x3 = f17186d;
            int size = abstractC2135x3.size();
            int i8 = 0;
            while (i8 < size) {
                boolean containsKey = bundle.containsKey((String) abstractC2135x3.get(i8));
                i8++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean c(String str) {
        if (!f17183a.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean d(String str) {
        if (!f17185c.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean e(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            }
            if (f17187e.contains(str2)) {
                return false;
            }
            AbstractC2135x3 abstractC2135x3 = f17188f;
            int size = abstractC2135x3.size();
            int i8 = 0;
            while (i8 < size) {
                boolean matches = str2.matches((String) abstractC2135x3.get(i8));
                i8++;
                if (matches) {
                    return false;
                }
            }
            return true;
        }
        if (str.equals("fcm") || str.equals("frc")) {
            return true;
        }
        return false;
    }
}
