package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.ArrayMap;

/* loaded from: classes3.dex */
public abstract class O3 {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayMap f16240a = new ArrayMap();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (O3.class) {
            ArrayMap arrayMap = f16240a;
            uri = (Uri) arrayMap.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                arrayMap.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            return str + "#" + context.getPackageName();
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            if (!str2.contains("dev-keys") && !str2.contains("test-keys")) {
                return false;
            }
            return true;
        }
        return false;
    }
}
