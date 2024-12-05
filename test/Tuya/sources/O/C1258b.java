package O;

import R.AbstractC1317n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1258b extends S.a {

    /* renamed from: a, reason: collision with root package name */
    final int f7652a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7653b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f7654c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7655d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1258b f7651e = new C1258b(0);

    @NonNull
    public static final Parcelable.Creator<C1258b> CREATOR = new r();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1258b(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f7652a = i8;
        this.f7653b = i9;
        this.f7654c = pendingIntent;
        this.f7655d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String L(int i8) {
        if (i8 != 99) {
            if (i8 != 1500) {
                switch (i8) {
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
                        switch (i8) {
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
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i8 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean G() {
        if (this.f7653b != 0 && this.f7654c != null) {
            return true;
        }
        return false;
    }

    public boolean I() {
        if (this.f7653b == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1258b)) {
            return false;
        }
        C1258b c1258b = (C1258b) obj;
        if (this.f7653b == c1258b.f7653b && AbstractC1317n.a(this.f7654c, c1258b.f7654c) && AbstractC1317n.a(this.f7655d, c1258b.f7655d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1317n.b(Integer.valueOf(this.f7653b), this.f7654c, this.f7655d);
    }

    public int s() {
        return this.f7653b;
    }

    public String toString() {
        AbstractC1317n.a c8 = AbstractC1317n.c(this);
        c8.a("statusCode", L(this.f7653b));
        c8.a("resolution", this.f7654c);
        c8.a("message", this.f7655d);
        return c8.toString();
    }

    public String u() {
        return this.f7655d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f7652a;
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, i9);
        S.c.k(parcel, 2, s());
        S.c.p(parcel, 3, z(), i8, false);
        S.c.q(parcel, 4, u(), false);
        S.c.b(parcel, a8);
    }

    public PendingIntent z() {
        return this.f7654c;
    }

    public C1258b(int i8) {
        this(i8, null, null);
    }

    public C1258b(int i8, PendingIntent pendingIntent) {
        this(i8, pendingIntent, null);
    }

    public C1258b(int i8, PendingIntent pendingIntent, String str) {
        this(1, i8, pendingIntent, str);
    }
}
