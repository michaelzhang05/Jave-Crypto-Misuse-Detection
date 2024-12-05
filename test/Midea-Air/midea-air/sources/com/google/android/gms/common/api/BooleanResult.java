package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public class BooleanResult implements Result {

    /* renamed from: f, reason: collision with root package name */
    private final Status f10528f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10529g;

    @KeepForSdk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f10528f.equals(booleanResult.f10528f) && this.f10529g == booleanResult.f10529g;
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public Status getStatus() {
        return this.f10528f;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f10528f.hashCode() + 527) * 31) + (this.f10529g ? 1 : 0);
    }
}
