package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f12301f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f12302g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f12303h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzma f12304i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w00(zzma zzmaVar, String str, long j2, long j3) {
        this.f12304i = zzmaVar;
        this.f12301f = str;
        this.f12302g = j2;
        this.f12303h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlz zzlzVar;
        zzlzVar = this.f12304i.f15279b;
        zzlzVar.d(this.f12301f, this.f12302g, this.f12303h);
    }
}
