package com.mbridge.msdk.foundation.same.report.c;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19830a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static a f19831b;

    private a() {
    }

    public static a a() {
        if (f19831b == null) {
            synchronized (a.class) {
                try {
                    if (f19831b == null) {
                        f19831b = new a();
                    }
                } finally {
                }
            }
        }
        return f19831b;
    }
}
