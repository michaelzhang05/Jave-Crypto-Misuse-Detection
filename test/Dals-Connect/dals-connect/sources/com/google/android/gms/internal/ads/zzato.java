package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzato extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzato> CREATOR = new zzatp();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f12981f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f12982g;

    public zzato(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public static zzato w(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzato(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzato)) {
            zzato zzatoVar = (zzato) obj;
            if (Objects.a(this.f12981f, zzatoVar.f12981f) && Objects.a(Integer.valueOf(this.f12982g), Integer.valueOf(zzatoVar.f12982g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f12981f, Integer.valueOf(this.f12982g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f12981f, false);
        SafeParcelWriter.i(parcel, 3, this.f12982g);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzato(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        this.f12981f = str;
        this.f12982g = i2;
    }
}
