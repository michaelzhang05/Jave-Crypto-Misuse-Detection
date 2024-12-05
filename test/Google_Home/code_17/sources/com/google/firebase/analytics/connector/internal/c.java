package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import l0.AbstractC3282q;
import l0.AbstractC3284s;
import x0.AbstractC4180o;
import x0.r;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final r f18223a = r.y("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4180o f18224b = AbstractC4180o.y("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4180o f18225c = AbstractC4180o.v("auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4180o f18226d = AbstractC4180o.u("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4180o f18227e = new AbstractC4180o.a().e(AbstractC3284s.f34219a).e(AbstractC3284s.f34220b).f();

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4180o f18228f = AbstractC4180o.u("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static String a(String str) {
        String a8 = AbstractC3282q.a(str);
        if (a8 != null) {
            return a8;
        }
        return str;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean c(String str, Bundle bundle) {
        if (f18224b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            AbstractC4180o abstractC4180o = f18226d;
            int size = abstractC4180o.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = abstractC4180o.get(i8);
                i8++;
                if (bundle.containsKey((String) obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean d(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            }
            if (f18227e.contains(str2)) {
                return false;
            }
            AbstractC4180o abstractC4180o = f18228f;
            int size = abstractC4180o.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = abstractC4180o.get(i8);
                i8++;
                if (str2.matches((String) obj)) {
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

    public static boolean e(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!g(str) || bundle == null) {
            return false;
        }
        AbstractC4180o abstractC4180o = f18226d;
        int size = abstractC4180o.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = abstractC4180o.get(i8);
            i8++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c8 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c8 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c8 = 2;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean f(String str) {
        if (!f18223a.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (!f18225c.contains(str)) {
            return true;
        }
        return false;
    }
}
