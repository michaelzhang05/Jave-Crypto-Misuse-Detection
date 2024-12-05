package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzaup extends zzatr {

    /* renamed from: f, reason: collision with root package name */
    private final String f12988f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12989g;

    public zzaup(zzato zzatoVar) {
        this(zzatoVar != null ? zzatoVar.f12981f : HttpUrl.FRAGMENT_ENCODE_SET, zzatoVar != null ? zzatoVar.f12982g : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final int getAmount() throws RemoteException {
        return this.f12989g;
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final String getType() throws RemoteException {
        return this.f12988f;
    }

    public zzaup(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : HttpUrl.FRAGMENT_ENCODE_SET, rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzaup(String str, int i2) {
        this.f12988f = str;
        this.f12989g = i2;
    }
}
