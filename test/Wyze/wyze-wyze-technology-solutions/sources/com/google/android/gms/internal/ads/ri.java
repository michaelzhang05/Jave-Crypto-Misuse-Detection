package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ri extends zzair {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Object f12108f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f12109g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f12110h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbbr f12111i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ zzcgb f12112j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ri(zzcgb zzcgbVar, Object obj, String str, long j2, zzbbr zzbbrVar) {
        this.f12112j = zzcgbVar;
        this.f12108f = obj;
        this.f12109g = str;
        this.f12110h = j2;
        this.f12111i = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final void onInitializationFailed(String str) {
        synchronized (this.f12108f) {
            this.f12112j.d(this.f12109g, false, str, (int) (zzk.zzln().b() - this.f12110h));
            this.f12111i.b(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final void onInitializationSucceeded() {
        synchronized (this.f12108f) {
            this.f12112j.d(this.f12109g, true, HttpUrl.FRAGMENT_ENCODE_SET, (int) (zzk.zzln().b() - this.f12110h));
            this.f12111i.b(Boolean.TRUE);
        }
    }
}
