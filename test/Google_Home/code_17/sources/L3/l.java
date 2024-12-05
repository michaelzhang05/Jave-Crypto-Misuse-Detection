package L3;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C1970d;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final u.g f6067a;

    /* renamed from: b, reason: collision with root package name */
    private final L3.a f6068b;

    /* renamed from: c, reason: collision with root package name */
    private final g f6069c;

    /* renamed from: d, reason: collision with root package name */
    private final B3.f f6070d;

    /* renamed from: e, reason: collision with root package name */
    private final j f6071e;

    /* renamed from: f, reason: collision with root package name */
    private final C1970d f6072f;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            L3.a createFromParcel;
            AbstractC3255y.i(parcel, "parcel");
            u.g createFromParcel2 = u.g.CREATOR.createFromParcel(parcel);
            g gVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = L3.a.CREATOR.createFromParcel(parcel);
            }
            L3.a aVar = createFromParcel;
            if (parcel.readInt() != 0) {
                gVar = g.CREATOR.createFromParcel(parcel);
            }
            return new l(createFromParcel2, aVar, gVar, (B3.f) parcel.readParcelable(l.class.getClassLoader()), (j) parcel.readSerializable(), C1970d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i8) {
            return new l[i8];
        }
    }

    public l(u.g config, L3.a aVar, g gVar, B3.f fVar, j jVar, C1970d paymentMethodMetadata) {
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        this.f6067a = config;
        this.f6068b = aVar;
        this.f6069c = gVar;
        this.f6070d = fVar;
        this.f6071e = jVar;
        this.f6072f = paymentMethodMetadata;
    }

    public final u.g a() {
        return this.f6067a;
    }

    public final L3.a b() {
        return this.f6068b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3255y.d(this.f6067a, lVar.f6067a) && AbstractC3255y.d(this.f6068b, lVar.f6068b) && AbstractC3255y.d(this.f6069c, lVar.f6069c) && AbstractC3255y.d(this.f6070d, lVar.f6070d) && AbstractC3255y.d(this.f6071e, lVar.f6071e) && AbstractC3255y.d(this.f6072f, lVar.f6072f)) {
            return true;
        }
        return false;
    }

    public final g g() {
        return this.f6069c;
    }

    public final C1970d h() {
        return this.f6072f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f6067a.hashCode() * 31;
        L3.a aVar = this.f6068b;
        int i8 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i9 = (hashCode4 + hashCode) * 31;
        g gVar = this.f6069c;
        if (gVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        B3.f fVar = this.f6070d;
        if (fVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        j jVar = this.f6071e;
        if (jVar != null) {
            i8 = jVar.hashCode();
        }
        return ((i11 + i8) * 31) + this.f6072f.hashCode();
    }

    public final B3.f i() {
        return this.f6070d;
    }

    public final boolean l() {
        if ((this.f6068b != null && (!r0.h().isEmpty())) || this.f6072f.a0()) {
            return true;
        }
        return false;
    }

    public final StripeIntent p() {
        return this.f6072f.W();
    }

    public final j s() {
        return this.f6071e;
    }

    public String toString() {
        return "Full(config=" + this.f6067a + ", customer=" + this.f6068b + ", linkState=" + this.f6069c + ", paymentSelection=" + this.f6070d + ", validationError=" + this.f6071e + ", paymentMethodMetadata=" + this.f6072f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f6067a.writeToParcel(out, i8);
        L3.a aVar = this.f6068b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        g gVar = this.f6069c;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        out.writeParcelable(this.f6070d, i8);
        out.writeSerializable(this.f6071e);
        this.f6072f.writeToParcel(out, i8);
    }
}
