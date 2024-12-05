package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.sentry.s4;
import io.sentry.w1;
import java.util.Arrays;
import java.util.List;

/* compiled from: ManifestMetadataReader.java */
/* loaded from: classes2.dex */
final class d1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c9 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d9 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0224 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x025b A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b2 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e9 A[Catch: all -> 0x0329, TryCatch #0 {all -> 0x0329, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0051, B:12:0x0079, B:14:0x0087, B:15:0x008a, B:18:0x00bc, B:22:0x00c5, B:23:0x00e0, B:25:0x01c9, B:26:0x01d3, B:28:0x01d9, B:30:0x01e7, B:31:0x01ea, B:33:0x0224, B:35:0x0232, B:36:0x0235, B:38:0x025b, B:39:0x0262, B:43:0x0270, B:45:0x0276, B:46:0x027a, B:48:0x0280, B:51:0x0292, B:52:0x0295, B:54:0x02b2, B:55:0x02b7, B:57:0x02e9, B:58:0x02ed, B:60:0x02f3, B:62:0x0301, B:64:0x0288, B:65:0x00d3, B:66:0x031b), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11, io.sentry.android.core.SentryAndroidOptions r12, io.sentry.android.core.s0 r13) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.d1.a(android.content.Context, io.sentry.android.core.SentryAndroidOptions, io.sentry.android.core.s0):void");
    }

    private static Bundle b(Context context, w1 w1Var, s0 s0Var) throws PackageManager.NameNotFoundException {
        if (s0Var == null) {
            s0Var = new s0(w1Var);
        }
        return t0.a(context, 128L, s0Var).metaData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context, w1 w1Var) {
        io.sentry.util.q.c(context, "The application context is required.");
        try {
            Bundle b2 = b(context, w1Var, null);
            r1 = b2 != null ? d(b2, w1Var, "io.sentry.auto-init", true) : true;
            w1Var.c(s4.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            w1Var.b(s4.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        return r1;
    }

    private static boolean d(Bundle bundle, w1 w1Var, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        w1Var.c(s4.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    private static Boolean e(Bundle bundle, w1 w1Var, String str, Boolean bool) {
        if (bundle.getSerializable(str) != null) {
            boolean z = bundle.getBoolean(str, bool != null);
            w1Var.c(s4.DEBUG, "%s read: %s", str, Boolean.valueOf(z));
            return Boolean.valueOf(z);
        }
        w1Var.c(s4.DEBUG, "%s used default %s", str, bool);
        return bool;
    }

    private static Double f(Bundle bundle, w1 w1Var, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        w1Var.c(s4.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    private static List<String> g(Bundle bundle, w1 w1Var, String str) {
        String string = bundle.getString(str);
        w1Var.c(s4.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long h(Bundle bundle, w1 w1Var, String str, long j2) {
        long j3 = bundle.getInt(str, (int) j2);
        w1Var.c(s4.DEBUG, "%s read: %s", str, Long.valueOf(j3));
        return j3;
    }

    private static String i(Bundle bundle, w1 w1Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        w1Var.c(s4.DEBUG, "%s read: %s", str, string);
        return string;
    }

    private static String j(Bundle bundle, w1 w1Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        w1Var.c(s4.DEBUG, "%s read: %s", str, string);
        return string;
    }
}
