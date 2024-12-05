package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10494g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10495h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final PendingIntent f10496i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10497j;

    /* renamed from: f, reason: collision with root package name */
    @KeepForSdk
    public static final ConnectionResult f10493f = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ConnectionResult(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) String str) {
        this.f10494g = i2;
        this.f10495h = i3;
        this.f10496i = pendingIntent;
        this.f10497j = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String Y(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final PendingIntent D() {
        return this.f10496i;
    }

    public final boolean J() {
        return (this.f10495h == 0 || this.f10496i == null) ? false : true;
    }

    public final boolean L() {
        return this.f10495h == 0;
    }

    public final void P(Activity activity, int i2) throws IntentSender.SendIntentException {
        if (J()) {
            activity.startIntentSenderForResult(this.f10496i.getIntentSender(), i2, null, 0, 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f10495h == connectionResult.f10495h && Objects.a(this.f10496i, connectionResult.f10496i) && Objects.a(this.f10497j, connectionResult.f10497j);
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f10495h), this.f10496i, this.f10497j);
    }

    public final String toString() {
        return Objects.c(this).a("statusCode", Y(this.f10495h)).a("resolution", this.f10496i).a("message", this.f10497j).toString();
    }

    public final int w() {
        return this.f10495h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10494g);
        SafeParcelWriter.i(parcel, 2, w());
        SafeParcelWriter.o(parcel, 3, D(), i2, false);
        SafeParcelWriter.q(parcel, 4, z(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public final String z() {
        return this.f10497j;
    }

    public ConnectionResult(int i2) {
        this(i2, null, null);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }
}
