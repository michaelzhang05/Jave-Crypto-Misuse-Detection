package m2;

import android.os.Parcel;
import android.os.Parcelable;
import e3.C2779C;
import e3.C2780D;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35064a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35065b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35066c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35067d;

    /* renamed from: e, reason: collision with root package name */
    private final C2779C f35068e;

    /* renamed from: f, reason: collision with root package name */
    private final C2780D f35069f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.model.o f35070g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35071h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            C2779C createFromParcel;
            C2780D createFromParcel2;
            boolean z10;
            AbstractC3255y.i(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            com.stripe.android.model.o oVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C2779C.CREATOR.createFromParcel(parcel);
            }
            C2779C c2779c = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = C2780D.CREATOR.createFromParcel(parcel);
            }
            C2780D c2780d = createFromParcel2;
            if (parcel.readInt() != 0) {
                oVar = com.stripe.android.model.o.CREATOR.createFromParcel(parcel);
            }
            com.stripe.android.model.o oVar2 = oVar;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new v(z8, z9, readLong, readLong2, c2779c, c2780d, oVar2, z10);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v[] newArray(int i8) {
            return new v[i8];
        }
    }

    public v(boolean z8, boolean z9, long j8, long j9, C2779C c2779c, C2780D c2780d, com.stripe.android.model.o oVar, boolean z10) {
        this.f35064a = z8;
        this.f35065b = z9;
        this.f35066c = j8;
        this.f35067d = j9;
        this.f35068e = c2779c;
        this.f35069f = c2780d;
        this.f35070g = oVar;
        this.f35071h = z10;
    }

    public static /* synthetic */ v b(v vVar, boolean z8, boolean z9, long j8, long j9, C2779C c2779c, C2780D c2780d, com.stripe.android.model.o oVar, boolean z10, int i8, Object obj) {
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        C2779C c2779c2;
        C2780D c2780d2;
        com.stripe.android.model.o oVar2;
        boolean z13;
        if ((i8 & 1) != 0) {
            z11 = vVar.f35064a;
        } else {
            z11 = z8;
        }
        if ((i8 & 2) != 0) {
            z12 = vVar.f35065b;
        } else {
            z12 = z9;
        }
        if ((i8 & 4) != 0) {
            j10 = vVar.f35066c;
        } else {
            j10 = j8;
        }
        if ((i8 & 8) != 0) {
            j11 = vVar.f35067d;
        } else {
            j11 = j9;
        }
        if ((i8 & 16) != 0) {
            c2779c2 = vVar.f35068e;
        } else {
            c2779c2 = c2779c;
        }
        if ((i8 & 32) != 0) {
            c2780d2 = vVar.f35069f;
        } else {
            c2780d2 = c2780d;
        }
        if ((i8 & 64) != 0) {
            oVar2 = vVar.f35070g;
        } else {
            oVar2 = oVar;
        }
        if ((i8 & 128) != 0) {
            z13 = vVar.f35071h;
        } else {
            z13 = z10;
        }
        return vVar.a(z11, z12, j10, j11, c2779c2, c2780d2, oVar2, z13);
    }

    public final v a(boolean z8, boolean z9, long j8, long j9, C2779C c2779c, C2780D c2780d, com.stripe.android.model.o oVar, boolean z10) {
        return new v(z8, z9, j8, j9, c2779c, c2780d, oVar, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f35064a == vVar.f35064a && this.f35065b == vVar.f35065b && this.f35066c == vVar.f35066c && this.f35067d == vVar.f35067d && AbstractC3255y.d(this.f35068e, vVar.f35068e) && AbstractC3255y.d(this.f35069f, vVar.f35069f) && AbstractC3255y.d(this.f35070g, vVar.f35070g) && this.f35071h == vVar.f35071h) {
            return true;
        }
        return false;
    }

    public final C2779C g() {
        return this.f35068e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a8 = ((((((androidx.compose.foundation.a.a(this.f35064a) * 31) + androidx.compose.foundation.a.a(this.f35065b)) * 31) + androidx.collection.a.a(this.f35066c)) * 31) + androidx.collection.a.a(this.f35067d)) * 31;
        C2779C c2779c = this.f35068e;
        int i8 = 0;
        if (c2779c == null) {
            hashCode = 0;
        } else {
            hashCode = c2779c.hashCode();
        }
        int i9 = (a8 + hashCode) * 31;
        C2780D c2780d = this.f35069f;
        if (c2780d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2780d.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        com.stripe.android.model.o oVar = this.f35070g;
        if (oVar != null) {
            i8 = oVar.hashCode();
        }
        return ((i10 + i8) * 31) + androidx.compose.foundation.a.a(this.f35071h);
    }

    public String toString() {
        return "PaymentSessionData(isShippingInfoRequired=" + this.f35064a + ", isShippingMethodRequired=" + this.f35065b + ", cartTotal=" + this.f35066c + ", shippingTotal=" + this.f35067d + ", shippingInformation=" + this.f35068e + ", shippingMethod=" + this.f35069f + ", paymentMethod=" + this.f35070g + ", useGooglePay=" + this.f35071h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeInt(this.f35064a ? 1 : 0);
        out.writeInt(this.f35065b ? 1 : 0);
        out.writeLong(this.f35066c);
        out.writeLong(this.f35067d);
        C2779C c2779c = this.f35068e;
        if (c2779c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2779c.writeToParcel(out, i8);
        }
        C2780D c2780d = this.f35069f;
        if (c2780d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2780d.writeToParcel(out, i8);
        }
        com.stripe.android.model.o oVar = this.f35070g;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f35071h ? 1 : 0);
    }
}
