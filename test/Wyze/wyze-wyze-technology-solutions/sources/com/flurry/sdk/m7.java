package com.flurry.sdk;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class m7 {
    private static SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    public String f10037b;

    /* renamed from: c, reason: collision with root package name */
    public long f10038c;

    public m7(String str, long j2) {
        this.f10037b = str;
        this.f10038c = j2;
    }

    public final String toString() {
        return a.format(Long.valueOf(this.f10038c)) + ": " + this.f10037b + "\n";
    }
}
