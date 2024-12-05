package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10299f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f10300g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10301h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10302i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10303j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10304k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AccountChangeEvent(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) String str2) {
        this.f10299f = i2;
        this.f10300g = j2;
        this.f10301h = (String) Preconditions.j(str);
        this.f10302i = i3;
        this.f10303j = i4;
        this.f10304k = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            if (this.f10299f == accountChangeEvent.f10299f && this.f10300g == accountChangeEvent.f10300g && Objects.a(this.f10301h, accountChangeEvent.f10301h) && this.f10302i == accountChangeEvent.f10302i && this.f10303j == accountChangeEvent.f10303j && Objects.a(this.f10304k, accountChangeEvent.f10304k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f10299f), Long.valueOf(this.f10300g), this.f10301h, Integer.valueOf(this.f10302i), Integer.valueOf(this.f10303j), this.f10304k);
    }

    public String toString() {
        int i2 = this.f10302i;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f10301h;
        String str3 = this.f10304k;
        int i3 = this.f10303j;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10299f);
        SafeParcelWriter.l(parcel, 2, this.f10300g);
        SafeParcelWriter.q(parcel, 3, this.f10301h, false);
        SafeParcelWriter.i(parcel, 4, this.f10302i);
        SafeParcelWriter.i(parcel, 5, this.f10303j);
        SafeParcelWriter.q(parcel, 6, this.f10304k, false);
        SafeParcelWriter.b(parcel, a);
    }
}
