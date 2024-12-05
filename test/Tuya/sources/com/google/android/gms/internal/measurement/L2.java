package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* loaded from: classes3.dex */
public abstract class L2 {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayMap f15387a = new ArrayMap();

    public static synchronized Uri a(String str) {
        synchronized (L2.class) {
            ArrayMap arrayMap = f15387a;
            Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                arrayMap.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
