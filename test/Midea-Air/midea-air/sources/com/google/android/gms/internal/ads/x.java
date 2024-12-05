package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

/* loaded from: classes2.dex */
final class x implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ PublisherAdView f12362f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzzk f12363g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzagq f12364h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(zzagq zzagqVar, PublisherAdView publisherAdView, zzzk zzzkVar) {
        this.f12364h = zzagqVar;
        this.f12362f = publisherAdView;
        this.f12363g = zzzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener;
        if (this.f12362f.zza(this.f12363g)) {
            onPublisherAdViewLoadedListener = this.f12364h.f12709f;
            onPublisherAdViewLoadedListener.onPublisherAdViewLoaded(this.f12362f);
        } else {
            zzbad.i("Could not bind.");
        }
    }
}
