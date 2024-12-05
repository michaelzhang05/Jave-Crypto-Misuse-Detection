package N;

import Q.AbstractC1398n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: N.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1331b extends R.a {

    /* renamed from: a, reason: collision with root package name */
    final int f7453a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7454b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f7455c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7456d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1331b f7452e = new C1331b(0);

    @NonNull
    public static final Parcelable.Creator<C1331b> CREATOR = new r();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1331b(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f7453a = i8;
        this.f7454b = i9;
        this.f7455c = pendingIntent;
        this.f7456d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String H(int i8) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1331b)) {
            return false;
        }
        C1331b c1331b = (C1331b) obj;
        if (this.f7454b == c1331b.f7454b && AbstractC1398n.a(this.f7455c, c1331b.f7455c) && AbstractC1398n.a(this.f7456d, c1331b.f7456d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1398n.b(Integer.valueOf(this.f7454b), this.f7455c, this.f7456d);
    }

    public int p() {
        return this.f7454b;
    }

    public String toString() {
        AbstractC1398n.a c8 = AbstractC1398n.c(this);
        c8.a("statusCode", H(this.f7454b));
        c8.a("resolution", this.f7455c);
        c8.a("message", this.f7456d);
        return c8.toString();
    }

    public String u() {
        return this.f7456d;
    }

    public PendingIntent v() {
        return this.f7455c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f7453a;
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.k(parcel, 2, p());
        R.c.p(parcel, 3, v(), i8, false);
        R.c.q(parcel, 4, u(), false);
        R.c.b(parcel, a8);
    }

    public boolean y() {
        if (this.f7454b != 0 && this.f7455c != null) {
            return true;
        }
        return false;
    }

    public boolean z() {
        if (this.f7454b == 0) {
            return true;
        }
        return false;
    }

    public C1331b(int i8) {
        this(i8, null, null);
    }

    public C1331b(int i8, PendingIntent pendingIntent) {
        this(i8, pendingIntent, null);
    }

    public C1331b(int i8, PendingIntent pendingIntent, String str) {
        this(1, i8, pendingIntent, str);
    }
}
