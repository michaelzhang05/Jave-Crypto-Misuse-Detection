package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
enum EnumC2385l {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: a, reason: collision with root package name */
    private final char f17690a;

    EnumC2385l(char c8) {
        this.f17690a = c8;
    }

    public static EnumC2385l b(char c8) {
        for (EnumC2385l enumC2385l : values()) {
            if (enumC2385l.f17690a == c8) {
                return enumC2385l;
            }
        }
        return UNSET;
    }
}
