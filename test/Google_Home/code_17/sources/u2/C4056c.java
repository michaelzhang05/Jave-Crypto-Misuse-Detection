package u2;

import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4056c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f39946a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39947b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39948c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39949d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f39945e = new a(null);
    public static final Parcelable.Creator<C4056c> CREATOR = new b();

    /* renamed from: u2.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: u2.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4056c createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C4056c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4056c[] newArray(int i8) {
            return new C4056c[i8];
        }
    }

    public C4056c(String name, String str, String str2, String str3) {
        AbstractC3255y.i(name, "name");
        this.f39946a = name;
        this.f39947b = str;
        this.f39948c = str2;
        this.f39949d = str3;
    }

    public final Map a() {
        return Q.e(x.a(MimeTypes.BASE_TYPE_APPLICATION, b()));
    }

    public final Map b() {
        return Q.k(x.a("name", this.f39946a), x.a("version", this.f39947b), x.a("url", this.f39948c), x.a("partner_id", this.f39949d));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4056c)) {
            return false;
        }
        C4056c c4056c = (C4056c) obj;
        if (AbstractC3255y.d(this.f39946a, c4056c.f39946a) && AbstractC3255y.d(this.f39947b, c4056c.f39947b) && AbstractC3255y.d(this.f39948c, c4056c.f39948c) && AbstractC3255y.d(this.f39949d, c4056c.f39949d)) {
            return true;
        }
        return false;
    }

    public final String g() {
        String str;
        String str2 = this.f39946a;
        String str3 = this.f39947b;
        String str4 = null;
        if (str3 != null) {
            str = "/" + str3;
        } else {
            str = null;
        }
        String str5 = this.f39948c;
        if (str5 != null) {
            str4 = " (" + str5 + ")";
        }
        return AbstractC1378t.w0(AbstractC1378t.r(str2, str, str4), "", null, null, 0, null, null, 62, null);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f39946a.hashCode() * 31;
        String str = this.f39947b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f39948c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f39949d;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "AppInfo(name=" + this.f39946a + ", version=" + this.f39947b + ", url=" + this.f39948c + ", partnerId=" + this.f39949d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f39946a);
        out.writeString(this.f39947b);
        out.writeString(this.f39948c);
        out.writeString(this.f39949d);
    }
}
