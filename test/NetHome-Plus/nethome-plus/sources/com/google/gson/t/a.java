package com.google.gson.t;

/* compiled from: $Gson$Preconditions.java */
/* loaded from: classes2.dex */
public final class a {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t) {
        t.getClass();
        return t;
    }
}
