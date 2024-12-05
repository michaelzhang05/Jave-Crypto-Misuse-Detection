package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2118v2 {

    /* renamed from: f, reason: collision with root package name */
    static HashMap f15926f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f15931k;

    /* renamed from: l, reason: collision with root package name */
    static boolean f15932l;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f15921a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f15922b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15923c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15924d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f15925e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    static final HashMap f15927g = new HashMap(16, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    static final HashMap f15928h = new HashMap(16, 1.0f);

    /* renamed from: i, reason: collision with root package name */
    static final HashMap f15929i = new HashMap(16, 1.0f);

    /* renamed from: j, reason: collision with root package name */
    static final HashMap f15930j = new HashMap(16, 1.0f);

    /* renamed from: m, reason: collision with root package name */
    static final String[] f15933m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC2118v2.class) {
            try {
                String str3 = null;
                if (f15926f == null) {
                    f15925e.set(false);
                    f15926f = new HashMap(16, 1.0f);
                    f15931k = new Object();
                    f15932l = false;
                    contentResolver.registerContentObserver(f15921a, true, new C2102t2(null));
                } else if (f15925e.getAndSet(false)) {
                    f15926f.clear();
                    f15927g.clear();
                    f15928h.clear();
                    f15929i.clear();
                    f15930j.clear();
                    f15931k = new Object();
                    f15932l = false;
                }
                Object obj = f15931k;
                if (f15926f.containsKey(str)) {
                    String str4 = (String) f15926f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f15933m.length;
                Cursor query = contentResolver.query(f15921a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        c(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string == null) {
                        return null;
                    }
                    return string;
                } finally {
                    query.close();
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (AbstractC2118v2.class) {
            try {
                if (obj == f15931k) {
                    f15926f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
