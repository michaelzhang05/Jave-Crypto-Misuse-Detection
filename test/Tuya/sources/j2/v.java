package j2;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C1858C;
import b3.C1859D;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33088a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33089b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33090c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33091d;

    /* renamed from: e, reason: collision with root package name */
    private final C1858C f33092e;

    /* renamed from: f, reason: collision with root package name */
    private final C1859D f33093f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.model.o f33094g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33095h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            C1858C createFromParcel;
            C1859D createFromParcel2;
            boolean z10;
            AbstractC3159y.i(parcel, "parcel");
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
                createFromParcel = C1858C.CREATOR.createFromParcel(parcel);
            }
            C1858C c1858c = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = C1859D.CREATOR.createFromParcel(parcel);
            }
            C1859D c1859d = createFromParcel2;
            if (parcel.readInt() != 0) {
                oVar = com.stripe.android.model.o.CREATOR.createFromParcel(parcel);
            }
            com.stripe.android.model.o oVar2 = oVar;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new v(z8, z9, readLong, readLong2, c1858c, c1859d, oVar2, z10);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v[] newArray(int i8) {
            return new v[i8];
        }
    }

    public v(boolean z8, boolean z9, long j8, long j9, C1858C c1858c, C1859D c1859d, com.stripe.android.model.o oVar, boolean z10) {
        this.f33088a = z8;
        this.f33089b = z9;
        this.f33090c = j8;
        this.f33091d = j9;
        this.f33092e = c1858c;
        this.f33093f = c1859d;
        this.f33094g = oVar;
        this.f33095h = z10;
    }

    public static /* synthetic */ v c(v vVar, boolean z8, boolean z9, long j8, long j9, C1858C c1858c, C1859D c1859d, com.stripe.android.model.o oVar, boolean z10, int i8, Object obj) {
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        C1858C c1858c2;
        C1859D c1859d2;
        com.stripe.android.model.o oVar2;
        boolean z13;
        if ((i8 & 1) != 0) {
            z11 = vVar.f33088a;
        } else {
            z11 = z8;
        }
        if ((i8 & 2) != 0) {
            z12 = vVar.f33089b;
        } else {
            z12 = z9;
        }
        if ((i8 & 4) != 0) {
            j10 = vVar.f33090c;
        } else {
            j10 = j8;
        }
        if ((i8 & 8) != 0) {
            j11 = vVar.f33091d;
        } else {
            j11 = j9;
        }
        if ((i8 & 16) != 0) {
            c1858c2 = vVar.f33092e;
        } else {
            c1858c2 = c1858c;
        }
        if ((i8 & 32) != 0) {
            c1859d2 = vVar.f33093f;
        } else {
            c1859d2 = c1859d;
        }
        if ((i8 & 64) != 0) {
            oVar2 = vVar.f33094g;
        } else {
            oVar2 = oVar;
        }
        if ((i8 & 128) != 0) {
            z13 = vVar.f33095h;
        } else {
            z13 = z10;
        }
        return vVar.b(z11, z12, j10, j11, c1858c2, c1859d2, oVar2, z13);
    }

    public final v b(boolean z8, boolean z9, long j8, long j9, C1858C c1858c, C1859D c1859d, com.stripe.android.model.o oVar, boolean z10) {
        return new v(z8, z9, j8, j9, c1858c, c1859d, oVar, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final C1858C e() {
        return this.f33092e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f33088a == vVar.f33088a && this.f33089b == vVar.f33089b && this.f33090c == vVar.f33090c && this.f33091d == vVar.f33091d && AbstractC3159y.d(this.f33092e, vVar.f33092e) && AbstractC3159y.d(this.f33093f, vVar.f33093f) && AbstractC3159y.d(this.f33094g, vVar.f33094g) && this.f33095h == vVar.f33095h) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a8 = ((((((androidx.compose.foundation.a.a(this.f33088a) * 31) + androidx.compose.foundation.a.a(this.f33089b)) * 31) + androidx.collection.a.a(this.f33090c)) * 31) + androidx.collection.a.a(this.f33091d)) * 31;
        C1858C c1858c = this.f33092e;
        int i8 = 0;
        if (c1858c == null) {
            hashCode = 0;
        } else {
            hashCode = c1858c.hashCode();
        }
        int i9 = (a8 + hashCode) * 31;
        C1859D c1859d = this.f33093f;
        if (c1859d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c1859d.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        com.stripe.android.model.o oVar = this.f33094g;
        if (oVar != null) {
            i8 = oVar.hashCode();
        }
        return ((i10 + i8) * 31) + androidx.compose.foundation.a.a(this.f33095h);
    }

    public String toString() {
        return "PaymentSessionData(isShippingInfoRequired=" + this.f33088a + ", isShippingMethodRequired=" + this.f33089b + ", cartTotal=" + this.f33090c + ", shippingTotal=" + this.f33091d + ", shippingInformation=" + this.f33092e + ", shippingMethod=" + this.f33093f + ", paymentMethod=" + this.f33094g + ", useGooglePay=" + this.f33095h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(this.f33088a ? 1 : 0);
        out.writeInt(this.f33089b ? 1 : 0);
        out.writeLong(this.f33090c);
        out.writeLong(this.f33091d);
        C1858C c1858c = this.f33092e;
        if (c1858c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1858c.writeToParcel(out, i8);
        }
        C1859D c1859d = this.f33093f;
        if (c1859d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1859d.writeToParcel(out, i8);
        }
        com.stripe.android.model.o oVar = this.f33094g;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f33095h ? 1 : 0);
    }
}
