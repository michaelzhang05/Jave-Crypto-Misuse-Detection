package com.mbridge.msdk.dycreator.binding;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f19673a;

    private c() {
    }

    public static c a() {
        if (f19673a == null) {
            synchronized (c.class) {
                try {
                    if (f19673a == null) {
                        f19673a = new c();
                    }
                } finally {
                }
            }
        }
        return f19673a;
    }
}
