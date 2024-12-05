package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zab();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10823f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10824g;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str) {
        this.f10823f = i2;
        this.f10824g = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (clientIdentity.f10823f == this.f10823f && Objects.a(clientIdentity.f10824g, this.f10824g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f10823f;
    }

    public String toString() {
        int i2 = this.f10823f;
        String str = this.f10824g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10823f);
        SafeParcelWriter.q(parcel, 2, this.f10824g, false);
        SafeParcelWriter.b(parcel, a);
    }
}
