package e3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2779C implements y2.f, InterfaceC2784H {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.model.a f31278a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31279b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31280c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f31277d = new a(null);
    public static final Parcelable.Creator<C2779C> CREATOR = new b();

    /* renamed from: e3.C$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: e3.C$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2779C createFromParcel(Parcel parcel) {
            com.stripe.android.model.a createFromParcel;
            AbstractC3255y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
            }
            return new C2779C(createFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2779C[] newArray(int i8) {
            return new C2779C[i8];
        }
    }

    public C2779C(com.stripe.android.model.a aVar, String str, String str2) {
        this.f31278a = aVar;
        this.f31279b = str;
        this.f31280c = str2;
    }

    public final com.stripe.android.model.a a() {
        return this.f31278a;
    }

    public final String b() {
        return this.f31279b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2779C)) {
            return false;
        }
        C2779C c2779c = (C2779C) obj;
        if (AbstractC3255y.d(this.f31278a, c2779c.f31278a) && AbstractC3255y.d(this.f31279b, c2779c.f31279b) && AbstractC3255y.d(this.f31280c, c2779c.f31280c)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f31280c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        com.stripe.android.model.a aVar = this.f31278a;
        int i8 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f31279b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31280c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "ShippingInformation(address=" + this.f31278a + ", name=" + this.f31279b + ", phone=" + this.f31280c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        com.stripe.android.model.a aVar = this.f31278a;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f31279b);
        out.writeString(this.f31280c);
    }
}
