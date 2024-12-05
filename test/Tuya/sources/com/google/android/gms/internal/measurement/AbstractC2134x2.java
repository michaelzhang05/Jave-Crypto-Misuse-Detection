package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2134x2 {

    /* renamed from: a, reason: collision with root package name */
    private static UserManager f15953a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f15954b = !b();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r8) {
        /*
            boolean r0 = b()
            r1 = 0
            if (r0 == 0) goto L60
            boolean r0 = com.google.android.gms.internal.measurement.AbstractC2134x2.f15954b
            if (r0 == 0) goto Lc
            goto L60
        Lc:
            java.lang.Class<com.google.android.gms.internal.measurement.x2> r0 = com.google.android.gms.internal.measurement.AbstractC2134x2.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.AbstractC2134x2.f15954b     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L60
        L15:
            r8 = move-exception
            goto L5e
        L17:
            r2 = 1
            r3 = 1
        L19:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L43
            android.os.UserManager r4 = com.google.android.gms.internal.measurement.AbstractC2134x2.f15953a     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L2b
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = g.AbstractC2697d.a(r8, r4)     // Catch: java.lang.Throwable -> L15
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.measurement.AbstractC2134x2.f15953a = r4     // Catch: java.lang.Throwable -> L15
        L2b:
            android.os.UserManager r4 = com.google.android.gms.internal.measurement.AbstractC2134x2.f15953a     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L31
            r8 = 1
            goto L56
        L31:
            boolean r6 = com.google.android.gms.internal.measurement.AbstractC2126w2.a(r4)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r6 != 0) goto L41
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            boolean r8 = r4.isUserRunning(r6)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r8 != 0) goto L43
        L41:
            r8 = 1
            goto L52
        L43:
            r8 = 0
            goto L52
        L45:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.measurement.AbstractC2134x2.f15953a = r5     // Catch: java.lang.Throwable -> L15
            int r3 = r3 + 1
            goto L19
        L52:
            if (r8 == 0) goto L56
            com.google.android.gms.internal.measurement.AbstractC2134x2.f15953a = r5     // Catch: java.lang.Throwable -> L15
        L56:
            if (r8 == 0) goto L5a
            com.google.android.gms.internal.measurement.AbstractC2134x2.f15954b = r2     // Catch: java.lang.Throwable -> L15
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto L60
            return r2
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r8
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2134x2.a(android.content.Context):boolean");
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
