package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzatj implements RewardedVideoAd {
    private final zzasw a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12976b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f12977c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final zzatg f12978d = new zzatg(null);

    /* renamed from: e, reason: collision with root package name */
    private String f12979e;

    /* renamed from: f, reason: collision with root package name */
    private String f12980f;

    public zzatj(Context context, zzasw zzaswVar) {
        this.a = zzaswVar == null ? new zzabx() : zzaswVar;
        this.f12976b = context.getApplicationContext();
    }

    private final void a(String str, zzaaz zzaazVar) {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.h4(new zzath(zzyc.a(this.f12976b, zzaazVar), str));
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy() {
        destroy(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final Bundle getAdMetadata() {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar != null) {
                try {
                    return zzaswVar.getAdMetadata();
                } catch (RemoteException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getCustomData() {
        String str;
        synchronized (this.f12977c) {
            str = this.f12980f;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getMediationAdapterClassName() {
        try {
            zzasw zzaswVar = this.a;
            if (zzaswVar != null) {
                return zzaswVar.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener I7;
        synchronized (this.f12977c) {
            I7 = this.f12978d.I7();
        }
        return I7;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getUserId() {
        String str;
        synchronized (this.f12977c) {
            str = this.f12979e;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final boolean isLoaded() {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar == null) {
                return false;
            }
            try {
                return zzaswVar.isLoaded();
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, AdRequest adRequest) {
        a(str, adRequest.zzde());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause() {
        pause(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume() {
        resume(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.c0(new zzxy(adMetadataListener));
                } catch (RemoteException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setCustomData(String str) {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.setCustomData(str);
                    this.f12980f = str;
                } catch (RemoteException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setImmersiveMode(boolean z) {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.setImmersiveMode(z);
                } catch (RemoteException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f12977c) {
            this.f12978d.J7(rewardedVideoAdListener);
            zzasw zzaswVar = this.a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.P(this.f12978d);
                } catch (RemoteException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setUserId(String str) {
        synchronized (this.f12977c) {
            this.f12979e = str;
            zzasw zzaswVar = this.a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.setUserId(str);
                } catch (RemoteException e2) {
                    zzbad.f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void show() {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.show();
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy(Context context) {
        synchronized (this.f12977c) {
            this.f12978d.J7(null);
            zzasw zzaswVar = this.a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.T1(ObjectWrapper.i0(context));
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        a(str, publisherAdRequest.zzde());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause(Context context) {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.l7(ObjectWrapper.i0(context));
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume(Context context) {
        synchronized (this.f12977c) {
            zzasw zzaswVar = this.a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.k6(ObjectWrapper.i0(context));
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
            }
        }
    }
}
