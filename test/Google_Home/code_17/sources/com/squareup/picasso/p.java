package com.squareup.picasso;

/* loaded from: classes4.dex */
public enum p {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);


    /* renamed from: a, reason: collision with root package name */
    final int f24362a;

    p(int i8) {
        this.f24362a = i8;
    }

    public static boolean a(int i8) {
        if ((i8 & OFFLINE.f24362a) != 0) {
            return true;
        }
        return false;
    }

    public static boolean b(int i8) {
        if ((i8 & NO_CACHE.f24362a) == 0) {
            return true;
        }
        return false;
    }

    public static boolean c(int i8) {
        if ((i8 & NO_STORE.f24362a) == 0) {
            return true;
        }
        return false;
    }
}
