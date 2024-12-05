package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzcgm extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private final int f14032f;

    public zzcgm(int i2) {
        this.f14032f = i2;
    }

    public static int b(Throwable th) {
        if (th instanceof zzcgm) {
            return ((zzcgm) th).f14032f;
        }
        if (th instanceof zzayn) {
            return ((zzayn) th).a();
        }
        return 0;
    }

    public final int a() {
        return this.f14032f;
    }

    public zzcgm(String str, int i2) {
        super(str);
        this.f14032f = i2;
    }

    public zzcgm(String str, Throwable th, int i2) {
        super(str, th);
        this.f14032f = 0;
    }
}
