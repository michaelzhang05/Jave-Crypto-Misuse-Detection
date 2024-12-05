package u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4059a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f39973a;

    /* renamed from: b, reason: collision with root package name */
    private final u.a f39974b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39975c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f39976d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0895a f39972e = new C0895a(null);
    public static final Parcelable.Creator<C4059a> CREATOR = new b();

    /* renamed from: u3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0895a {
        private C0895a() {
        }

        public /* synthetic */ C0895a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: u3.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4059a createFromParcel(Parcel parcel) {
            u.a createFromParcel;
            boolean z8;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = u.a.CREATOR.createFromParcel(parcel);
            }
            u.a aVar = createFromParcel;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bool = Boolean.valueOf(z8);
            }
            return new C4059a(readString, aVar, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4059a[] newArray(int i8) {
            return new C4059a[i8];
        }
    }

    public C4059a(String str, u.a aVar, String str2, Boolean bool) {
        this.f39973a = str;
        this.f39974b = aVar;
        this.f39975c = str2;
        this.f39976d = bool;
    }

    public final u.a a() {
        return this.f39974b;
    }

    public final String b() {
        return this.f39973a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4059a)) {
            return false;
        }
        C4059a c4059a = (C4059a) obj;
        if (AbstractC3255y.d(this.f39973a, c4059a.f39973a) && AbstractC3255y.d(this.f39974b, c4059a.f39974b) && AbstractC3255y.d(this.f39975c, c4059a.f39975c) && AbstractC3255y.d(this.f39976d, c4059a.f39976d)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f39975c;
    }

    public final Boolean h() {
        return this.f39976d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f39973a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        u.a aVar = this.f39974b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f39975c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.f39976d;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        return i11 + i8;
    }

    public String toString() {
        return "AddressDetails(name=" + this.f39973a + ", address=" + this.f39974b + ", phoneNumber=" + this.f39975c + ", isCheckboxSelected=" + this.f39976d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f39973a);
        u.a aVar = this.f39974b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f39975c);
        Boolean bool = this.f39976d;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ C4059a(String str, u.a aVar, String str2, Boolean bool, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : bool);
    }
}
