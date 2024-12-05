package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzauy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzauy> CREATOR = new zzauz();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f13000f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f13001g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f13002h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f13003i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    public final List<String> f13004j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f13005k;

    @SafeParcelable.Field
    public final boolean l;

    @SafeParcelable.Field
    public final List<String> m;

    @SafeParcelable.Constructor
    public zzauy(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) List<String> list2) {
        this.f13000f = str;
        this.f13001g = str2;
        this.f13002h = z;
        this.f13003i = z2;
        this.f13004j = list;
        this.f13005k = z3;
        this.l = z4;
        this.m = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzauy w(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzauy(jSONObject.optString("click_string", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optString("report_url", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzazc.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzazc.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f13000f, false);
        SafeParcelWriter.q(parcel, 3, this.f13001g, false);
        SafeParcelWriter.c(parcel, 4, this.f13002h);
        SafeParcelWriter.c(parcel, 5, this.f13003i);
        SafeParcelWriter.s(parcel, 6, this.f13004j, false);
        SafeParcelWriter.c(parcel, 7, this.f13005k);
        SafeParcelWriter.c(parcel, 8, this.l);
        SafeParcelWriter.s(parcel, 9, this.m, false);
        SafeParcelWriter.b(parcel, a);
    }
}
