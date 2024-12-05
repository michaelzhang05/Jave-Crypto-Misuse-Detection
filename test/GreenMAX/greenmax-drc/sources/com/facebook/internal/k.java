package com.facebook.internal;

import android.R;
import com.facebook.internal.l;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: FeatureManager.java */
/* loaded from: classes.dex */
public final class k {
    private static final Map<d, String[]> a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeatureManager.java */
    /* loaded from: classes.dex */
    public static class a implements l.c {
        final /* synthetic */ c a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f9160b;

        a(c cVar, d dVar) {
            this.a = cVar;
            this.f9160b = dVar;
        }

        @Override // com.facebook.internal.l.c
        public void onCompleted() {
            this.a.a(k.g(this.f9160b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeatureManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.RestrictiveDataFiltering.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.Instrument.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.ErrorReport.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.AAM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.PrivacyProtection.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.SuggestedEvents.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.IntelligentIntegrity.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[d.ModelRequest.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[d.EventDeactivation.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[d.ChromeCustomTabsPrefetching.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[d.Monitoring.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[d.IgnoreAppSwitchToLoggedOut.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[d.Core.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[d.AppEvents.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[d.CodelessEvents.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[d.Login.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[d.Share.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[d.Places.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* compiled from: FeatureManager.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(boolean z);
    }

    /* compiled from: FeatureManager.java */
    /* loaded from: classes.dex */
    public enum d {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        Monitoring(196608),
        Login(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        Share(33554432),
        Places(50331648);

        private final int C;

        d(int i2) {
            this.C = i2;
        }

        static d d(int i2) {
            for (d dVar : values()) {
                if (dVar.C == i2) {
                    return dVar;
                }
            }
            return Unknown;
        }

        public d f() {
            int i2 = this.C;
            if ((i2 & 255) > 0) {
                return d(i2 & (-256));
            }
            if ((65280 & i2) > 0) {
                return d(i2 & (-65536));
            }
            if ((16711680 & i2) > 0) {
                return d(i2 & (-16777216));
            }
            return d(0);
        }

        String i() {
            return "FBSDKFeature" + toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (b.a[ordinal()]) {
                case 1:
                    return "RestrictiveDataFiltering";
                case 2:
                    return "Instrument";
                case 3:
                    return "CrashReport";
                case 4:
                    return "CrashShield";
                case 5:
                    return "ThreadCheck";
                case 6:
                    return "ErrorReport";
                case 7:
                    return "AAM";
                case 8:
                    return "PrivacyProtection";
                case 9:
                    return "SuggestedEvents";
                case 10:
                    return "IntelligentIntegrity";
                case 11:
                    return "ModelRequest";
                case 12:
                    return "EventDeactivation";
                case 13:
                    return "ChromeCustomTabsPrefetching";
                case 14:
                    return "Monitoring";
                case 15:
                    return "IgnoreAppSwitchToLoggedOut";
                case 16:
                    return "CoreKit";
                case 17:
                    return "AppEvents";
                case 18:
                    return "CodelessEvents";
                case 19:
                    return "LoginKit";
                case 20:
                    return "ShareKit";
                case 21:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    public static void a(d dVar, c cVar) {
        l.j(new a(cVar, dVar));
    }

    private static boolean b(d dVar) {
        switch (b.a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return false;
            default:
                return true;
        }
    }

    public static void c(d dVar) {
        com.facebook.f.e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(dVar.i(), com.facebook.f.t()).apply();
    }

    public static d d(String str) {
        f();
        for (Map.Entry<d, String[]> entry : a.entrySet()) {
            for (String str2 : entry.getValue()) {
                if (str.startsWith(str2)) {
                    return entry.getKey();
                }
            }
        }
        return d.Unknown;
    }

    private static boolean e(d dVar) {
        return l.g(dVar.i(), com.facebook.f.f(), b(dVar));
    }

    private static synchronized void f() {
        synchronized (k.class) {
            Map<d, String[]> map = a;
            if (map.isEmpty()) {
                map.put(d.AAM, new String[]{"com.facebook.appevents.aam."});
                map.put(d.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                map.put(d.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                map.put(d.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                map.put(d.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                map.put(d.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                map.put(d.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                map.put(d.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                map.put(d.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            }
        }
    }

    public static boolean g(d dVar) {
        if (d.Unknown == dVar) {
            return false;
        }
        if (d.Core == dVar) {
            return true;
        }
        String string = com.facebook.f.e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(dVar.i(), null);
        if (string != null && string.equals(com.facebook.f.t())) {
            return false;
        }
        d f2 = dVar.f();
        if (f2 == dVar) {
            return e(dVar);
        }
        return g(f2) && e(dVar);
    }
}
