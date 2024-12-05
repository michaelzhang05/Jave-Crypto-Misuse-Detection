package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
/* loaded from: classes2.dex */
public class Logger {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10923b;

    /* renamed from: c, reason: collision with root package name */
    private final GmsLogger f10924c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10925d;

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Logger(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L6
            java.lang.String r8 = ""
            goto L36
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L28
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L22
            java.lang.String r4 = ","
            r0.append(r4)
        L22:
            r0.append(r3)
            int r2 = r2 + 1
            goto L12
        L28:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L36:
            r6.<init>(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.logging.Logger.<init>(java.lang.String, java.lang.String[]):void");
    }

    private final String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f10923b.concat(str);
    }

    @KeepForSdk
    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.a, c(str, objArr));
        }
    }

    @KeepForSdk
    public void b(String str, Object... objArr) {
        Log.e(this.a, c(str, objArr));
    }

    @KeepForSdk
    public boolean d(int i2) {
        return this.f10925d <= i2;
    }

    private Logger(String str, String str2) {
        this.f10923b = str2;
        this.a = str;
        this.f10924c = new GmsLogger(str);
        int i2 = 2;
        while (7 >= i2 && !Log.isLoggable(this.a, i2)) {
            i2++;
        }
        this.f10925d = i2;
    }
}
