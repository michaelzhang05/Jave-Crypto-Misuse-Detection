package s1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b0;
import v1.m;

/* loaded from: classes.dex */
public final class a extends w1.a {

    /* renamed from: a, reason: collision with root package name */
    final int f9207a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9208b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f9209c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9210d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f9206e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new n();

    public a(int i6) {
        this(i6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(int i6) {
        if (i6 == 99) {
            return "UNFINISHED";
        }
        if (i6 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i6) {
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
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
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
                switch (i6) {
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
                        return "UNKNOWN_ERROR_CODE(" + i6 + ")";
                }
        }
    }

    public int a() {
        return this.f9208b;
    }

    public String b() {
        return this.f9210d;
    }

    public PendingIntent c() {
        return this.f9209c;
    }

    public boolean d() {
        return (this.f9208b == 0 || this.f9209c == null) ? false : true;
    }

    public boolean e() {
        return this.f9208b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9208b == aVar.f9208b && v1.m.a(this.f9209c, aVar.f9209c) && v1.m.a(this.f9210d, aVar.f9210d);
    }

    public int hashCode() {
        return v1.m.b(Integer.valueOf(this.f9208b), this.f9209c, this.f9210d);
    }

    public String toString() {
        m.a c6 = v1.m.c(this);
        c6.a("statusCode", f(this.f9208b));
        c6.a("resolution", this.f9209c);
        c6.a("message", this.f9210d);
        return c6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f9207a);
        w1.c.f(parcel, 2, a());
        w1.c.i(parcel, 3, c(), i6, false);
        w1.c.j(parcel, 4, b(), false);
        w1.c.b(parcel, a6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i6, int i7, PendingIntent pendingIntent, String str) {
        this.f9207a = i6;
        this.f9208b = i7;
        this.f9209c = pendingIntent;
        this.f9210d = str;
    }

    public a(int i6, PendingIntent pendingIntent) {
        this(i6, pendingIntent, null);
    }

    public a(int i6, PendingIntent pendingIntent, String str) {
        this(1, i6, pendingIntent, str);
    }
}
