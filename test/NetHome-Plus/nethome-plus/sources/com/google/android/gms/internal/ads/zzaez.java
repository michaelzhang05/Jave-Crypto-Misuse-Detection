package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzaez extends NativeAppInstallAd {
    private final zzaew a;

    /* renamed from: c, reason: collision with root package name */
    private final zzael f12683c;

    /* renamed from: e, reason: collision with root package name */
    private final NativeAd.AdChoicesInfo f12685e;

    /* renamed from: b, reason: collision with root package name */
    private final List<NativeAd.Image> f12682b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final VideoController f12684d = new VideoController();

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(3:2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6)))|(2:24|25)|(7:27|28|29|30|(2:32|33)|35|36)|41|28|29|30|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        com.google.android.gms.internal.ads.zzbad.c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: RemoteException -> 0x0081, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0081, blocks: (B:30:0x006c, B:32:0x0074), top: B:29:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzaez(com.google.android.gms.internal.ads.zzaew r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f12682b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f12684d = r1
            r5.a = r6
            r1 = 0
            java.util.List r6 = r6.f()     // Catch: android.os.RemoteException -> L53
            if (r6 == 0) goto L57
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L53
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L57
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L53
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L53
            if (r3 == 0) goto L45
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L45
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L53
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzaei     // Catch: android.os.RemoteException -> L53
            if (r4 == 0) goto L3f
            com.google.android.gms.internal.ads.zzaei r3 = (com.google.android.gms.internal.ads.zzaei) r3     // Catch: android.os.RemoteException -> L53
            goto L46
        L3f:
            com.google.android.gms.internal.ads.zzaek r3 = new com.google.android.gms.internal.ads.zzaek     // Catch: android.os.RemoteException -> L53
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L53
            goto L46
        L45:
            r3 = r1
        L46:
            if (r3 == 0) goto L20
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f12682b     // Catch: android.os.RemoteException -> L53
            com.google.android.gms.internal.ads.zzael r4 = new com.google.android.gms.internal.ads.zzael     // Catch: android.os.RemoteException -> L53
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L53
            r2.add(r4)     // Catch: android.os.RemoteException -> L53
            goto L20
        L53:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        L57:
            com.google.android.gms.internal.ads.zzaew r6 = r5.a     // Catch: android.os.RemoteException -> L65
            com.google.android.gms.internal.ads.zzaei r6 = r6.h()     // Catch: android.os.RemoteException -> L65
            if (r6 == 0) goto L69
            com.google.android.gms.internal.ads.zzael r2 = new com.google.android.gms.internal.ads.zzael     // Catch: android.os.RemoteException -> L65
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L65
            goto L6a
        L65:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        L69:
            r2 = r1
        L6a:
            r5.f12683c = r2
            com.google.android.gms.internal.ads.zzaew r6 = r5.a     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzaea r6 = r6.a()     // Catch: android.os.RemoteException -> L81
            if (r6 == 0) goto L85
            com.google.android.gms.internal.ads.zzaed r6 = new com.google.android.gms.internal.ads.zzaed     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzaew r2 = r5.a     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzaea r2 = r2.a()     // Catch: android.os.RemoteException -> L81
            r6.<init>(r2)     // Catch: android.os.RemoteException -> L81
            r1 = r6
            goto L85
        L81:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        L85:
            r5.f12685e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaez.<init>(com.google.android.gms.internal.ads.zzaew):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzkq() {
        try {
            return this.a.k();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final void destroy() {
        try {
            this.a.destroy();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f12685e;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getBody() {
        try {
            return this.a.d();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getCallToAction() {
        try {
            return this.a.c();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Bundle getExtras() {
        try {
            return this.a.getExtras();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getHeadline() {
        try {
            return this.a.b();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.Image getIcon() {
        return this.f12683c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final List<NativeAd.Image> getImages() {
        return this.f12682b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getPrice() {
        try {
            return this.a.i();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Double getStarRating() {
        try {
            double l = this.a.l();
            if (l == -1.0d) {
                return null;
            }
            return Double.valueOf(l);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getStore() {
        try {
            return this.a.getStore();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final VideoController getVideoController() {
        try {
            if (this.a.getVideoController() != null) {
                this.f12684d.zza(this.a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbad.c("Exception occurred while getting video controller", e2);
        }
        return this.f12684d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.n(bundle);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.s(bundle);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.y(bundle);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
