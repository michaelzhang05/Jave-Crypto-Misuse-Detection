package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public enum zzxx {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(zzte.f16104f),
    ENUM(null),
    MESSAGE(null);

    private final Object p;

    zzxx(Object obj) {
        this.p = obj;
    }
}
