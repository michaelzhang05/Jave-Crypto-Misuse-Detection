package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

@zzard
/* loaded from: classes2.dex */
public final class zzasp extends zzass {

    /* renamed from: f, reason: collision with root package name */
    private final String f12969f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12970g;

    public zzasp(String str, int i2) {
        this.f12969f = str;
        this.f12970g = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzasp)) {
            zzasp zzaspVar = (zzasp) obj;
            if (Objects.a(this.f12969f, zzaspVar.f12969f) && Objects.a(Integer.valueOf(this.f12970g), Integer.valueOf(zzaspVar.f12970g))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final int getAmount() {
        return this.f12970g;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final String getType() {
        return this.f12969f;
    }
}
