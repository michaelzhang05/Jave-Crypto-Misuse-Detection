package com.mbridge.msdk.foundation.same.report.c;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20885a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static a f20886b;

    private a() {
    }

    public static a a() {
        if (f20886b == null) {
            synchronized (a.class) {
                try {
                    if (f20886b == null) {
                        f20886b = new a();
                    }
                } finally {
                }
            }
        }
        return f20886b;
    }
}
