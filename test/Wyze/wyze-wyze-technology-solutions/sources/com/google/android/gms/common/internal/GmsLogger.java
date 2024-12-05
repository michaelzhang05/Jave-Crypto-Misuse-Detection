package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public final class GmsLogger {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10864b;

    public GmsLogger(String str, String str2) {
        Preconditions.k(str, "log tag cannot be null");
        Preconditions.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        if (str2 != null && str2.length() > 0) {
            this.f10864b = str2;
        } else {
            this.f10864b = null;
        }
    }

    public GmsLogger(String str) {
        this(str, null);
    }
}
