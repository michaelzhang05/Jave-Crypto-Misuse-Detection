package com.bumptech.glide.load.o.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes.dex */
final class q {
    private static final File a = new File("/proc/self/fd");

    /* renamed from: b, reason: collision with root package name */
    private static volatile q f8790b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f8791c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f8792d = true;

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q a() {
        if (f8790b == null) {
            synchronized (q.class) {
                if (f8790b == null) {
                    f8790b = new q();
                }
            }
        }
        return f8790b;
    }

    private synchronized boolean b() {
        boolean z = true;
        int i2 = this.f8791c + 1;
        this.f8791c = i2;
        if (i2 >= 50) {
            this.f8791c = 0;
            int length = a.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f8792d = z;
            if (!this.f8792d && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700");
            }
        }
        return this.f8792d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean c(int i2, int i3, BitmapFactory.Options options, com.bumptech.glide.load.b bVar, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i2 >= 128 && i3 >= 128 && b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
