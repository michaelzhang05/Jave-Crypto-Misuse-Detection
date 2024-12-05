package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzagj extends UnifiedNativeAd {
    private final zzagg a;

    /* renamed from: c, reason: collision with root package name */
    private final zzael f12700c;

    /* renamed from: e, reason: collision with root package name */
    private final NativeAd.AdChoicesInfo f12702e;

    /* renamed from: g, reason: collision with root package name */
    private final UnifiedNativeAd.zza f12704g;

    /* renamed from: b, reason: collision with root package name */
    private final List<NativeAd.Image> f12699b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final VideoController f12701d = new VideoController();

    /* renamed from: f, reason: collision with root package name */
    private final List<MuteThisAdReason> f12703f = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(3:2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6)))|24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28))|41|42|(12:44|45|46|47|(7:49|50|51|52|(2:54|55)|57|58)|63|50|51|52|(0)|57|58)|67|45|46|47|(0)|63|50|51|52|(0)|57|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28))|41|42|(12:44|45|46|47|(7:49|50|51|52|(2:54|55)|57|58)|63|50|51|52|(0)|57|58)|67|45|46|47|(0)|63|50|51|52|(0)|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        com.google.android.gms.internal.ads.zzbad.c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bb, code lost:
    
        com.google.android.gms.internal.ads.zzbad.c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[Catch: RemoteException -> 0x00ba, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00ba, blocks: (B:47:0x00a6, B:49:0x00ae), top: B:46:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9 A[Catch: RemoteException -> 0x00d6, TRY_LEAVE, TryCatch #4 {RemoteException -> 0x00d6, blocks: (B:52:0x00c1, B:54:0x00c9), top: B:51:0x00c1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzagj(com.google.android.gms.internal.ads.zzagg r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f12699b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f12701d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f12703f = r1
            r5.a = r6
            r1 = 0
            java.util.List r6 = r6.f()     // Catch: android.os.RemoteException -> L5a
            if (r6 == 0) goto L5e
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5a
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5a
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5a
            if (r3 == 0) goto L4c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L4c
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5a
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzaei     // Catch: android.os.RemoteException -> L5a
            if (r4 == 0) goto L46
            com.google.android.gms.internal.ads.zzaei r3 = (com.google.android.gms.internal.ads.zzaei) r3     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L46:
            com.google.android.gms.internal.ads.zzaek r3 = new com.google.android.gms.internal.ads.zzaek     // Catch: android.os.RemoteException -> L5a
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L27
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f12699b     // Catch: android.os.RemoteException -> L5a
            com.google.android.gms.internal.ads.zzael r4 = new com.google.android.gms.internal.ads.zzael     // Catch: android.os.RemoteException -> L5a
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5a
            r2.add(r4)     // Catch: android.os.RemoteException -> L5a
            goto L27
        L5a:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        L5e:
            com.google.android.gms.internal.ads.zzagg r6 = r5.a     // Catch: android.os.RemoteException -> L8d
            java.util.List r6 = r6.z4()     // Catch: android.os.RemoteException -> L8d
            if (r6 == 0) goto L91
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8d
        L6a:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8d
            if (r2 == 0) goto L91
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8d
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8d
            if (r3 == 0) goto L7f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzaak r2 = com.google.android.gms.internal.ads.zzaal.H7(r2)     // Catch: android.os.RemoteException -> L8d
            goto L80
        L7f:
            r2 = r1
        L80:
            if (r2 == 0) goto L6a
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.f12703f     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzaan r4 = new com.google.android.gms.internal.ads.zzaan     // Catch: android.os.RemoteException -> L8d
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8d
            r3.add(r4)     // Catch: android.os.RemoteException -> L8d
            goto L6a
        L8d:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        L91:
            com.google.android.gms.internal.ads.zzagg r6 = r5.a     // Catch: android.os.RemoteException -> L9f
            com.google.android.gms.internal.ads.zzaei r6 = r6.h()     // Catch: android.os.RemoteException -> L9f
            if (r6 == 0) goto La3
            com.google.android.gms.internal.ads.zzael r2 = new com.google.android.gms.internal.ads.zzael     // Catch: android.os.RemoteException -> L9f
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L9f
            goto La4
        L9f:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        La3:
            r2 = r1
        La4:
            r5.f12700c = r2
            com.google.android.gms.internal.ads.zzagg r6 = r5.a     // Catch: android.os.RemoteException -> Lba
            com.google.android.gms.internal.ads.zzaea r6 = r6.a()     // Catch: android.os.RemoteException -> Lba
            if (r6 == 0) goto Lbe
            com.google.android.gms.internal.ads.zzaed r6 = new com.google.android.gms.internal.ads.zzaed     // Catch: android.os.RemoteException -> Lba
            com.google.android.gms.internal.ads.zzagg r2 = r5.a     // Catch: android.os.RemoteException -> Lba
            com.google.android.gms.internal.ads.zzaea r2 = r2.a()     // Catch: android.os.RemoteException -> Lba
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lba
            goto Lbf
        Lba:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        Lbe:
            r6 = r1
        Lbf:
            r5.f12702e = r6
            com.google.android.gms.internal.ads.zzagg r6 = r5.a     // Catch: android.os.RemoteException -> Ld6
            com.google.android.gms.internal.ads.zzaee r6 = r6.e2()     // Catch: android.os.RemoteException -> Ld6
            if (r6 == 0) goto Lda
            com.google.android.gms.internal.ads.zzaeh r6 = new com.google.android.gms.internal.ads.zzaeh     // Catch: android.os.RemoteException -> Ld6
            com.google.android.gms.internal.ads.zzagg r2 = r5.a     // Catch: android.os.RemoteException -> Ld6
            com.google.android.gms.internal.ads.zzaee r2 = r2.e2()     // Catch: android.os.RemoteException -> Ld6
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Ld6
            r1 = r6
            goto Lda
        Ld6:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.c(r0, r6)
        Lda:
            r5.f12704g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.<init>(com.google.android.gms.internal.ads.zzagg):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzkq() {
        try {
            return this.a.k();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.I();
        } catch (RemoteException e2) {
            zzbad.c("Failed to cancelUnconfirmedClick", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.a.destroy();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.Q();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f12702e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.a.m();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.a.d();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.a.c();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle extras = this.a.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.a.b();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.f12700c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.f12699b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f12703f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.a.i();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.a.getStore();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.a.getVideoController() != null) {
                this.f12701d.zza(this.a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbad.c("Exception occurred while getting video controller", e2);
        }
        return this.f12701d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.k2();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzbad.g("Ad is not custom mute enabled");
                return;
            }
            if (muteThisAdReason == null) {
                this.a.O(null);
            } else if (muteThisAdReason instanceof zzaan) {
                this.a.O(((zzaan) muteThisAdReason).a());
            } else {
                zzbad.g("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.n(bundle);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.a7();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.s(bundle);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.y(bundle);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.k0(new zzaaj(muteThisAdListener));
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.N(new zzagt(unconfirmedClickListener));
        } catch (RemoteException e2) {
            zzbad.c("Failed to setUnconfirmedClickListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzkv() {
        try {
            IObjectWrapper e2 = this.a.e();
            if (e2 != null) {
                return ObjectWrapper.R(e2);
            }
            return null;
        } catch (RemoteException e3) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
            return null;
        }
    }
}
