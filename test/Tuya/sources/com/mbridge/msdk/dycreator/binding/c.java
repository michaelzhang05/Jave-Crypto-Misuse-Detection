package com.mbridge.msdk.dycreator.binding;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f18618a;

    private c() {
    }

    public static c a() {
        if (f18618a == null) {
            synchronized (c.class) {
                try {
                    if (f18618a == null) {
                        f18618a = new c();
                    }
                } finally {
                }
            }
        }
        return f18618a;
    }
}
