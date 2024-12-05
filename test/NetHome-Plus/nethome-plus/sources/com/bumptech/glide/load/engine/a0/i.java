package com.bumptech.glide.load.engine.a0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class i {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8472b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f8473c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8474d;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class a {
        static final int a;

        /* renamed from: b, reason: collision with root package name */
        final Context f8475b;

        /* renamed from: c, reason: collision with root package name */
        ActivityManager f8476c;

        /* renamed from: d, reason: collision with root package name */
        c f8477d;

        /* renamed from: f, reason: collision with root package name */
        float f8479f;

        /* renamed from: e, reason: collision with root package name */
        float f8478e = 2.0f;

        /* renamed from: g, reason: collision with root package name */
        float f8480g = 0.4f;

        /* renamed from: h, reason: collision with root package name */
        float f8481h = 0.33f;

        /* renamed from: i, reason: collision with root package name */
        int f8482i = 4194304;

        static {
            a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f8479f = a;
            this.f8475b = context;
            this.f8476c = (ActivityManager) context.getSystemService("activity");
            this.f8477d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f8476c)) {
                return;
            }
            this.f8479f = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    private static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.a0.i.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.a0.i.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        int i2;
        this.f8473c = aVar.f8475b;
        if (e(aVar.f8476c)) {
            i2 = aVar.f8482i / 2;
        } else {
            i2 = aVar.f8482i;
        }
        this.f8474d = i2;
        int c2 = c(aVar.f8476c, aVar.f8480g, aVar.f8481h);
        float b2 = aVar.f8477d.b() * aVar.f8477d.a() * 4;
        int round = Math.round(aVar.f8479f * b2);
        int round2 = Math.round(b2 * aVar.f8478e);
        int i3 = c2 - i2;
        int i4 = round2 + round;
        if (i4 <= i3) {
            this.f8472b = round2;
            this.a = round;
        } else {
            float f2 = i3;
            float f3 = aVar.f8479f;
            float f4 = aVar.f8478e;
            float f5 = f2 / (f3 + f4);
            this.f8472b = Math.round(f4 * f5);
            this.a = Math.round(f5 * aVar.f8479f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f8472b));
            sb.append(", pool size: ");
            sb.append(f(this.a));
            sb.append(", byte array size: ");
            sb.append(f(i2));
            sb.append(", memory class limited? ");
            sb.append(i4 > c2);
            sb.append(", max size: ");
            sb.append(f(c2));
            sb.append(", memoryClass: ");
            sb.append(aVar.f8476c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f8476c));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f2, float f3) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e(activityManager)) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i2) {
        return Formatter.formatFileSize(this.f8473c, i2);
    }

    public int a() {
        return this.f8474d;
    }

    public int b() {
        return this.a;
    }

    public int d() {
        return this.f8472b;
    }
}
