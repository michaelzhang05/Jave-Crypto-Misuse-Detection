package b3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1856A implements v2.f {
    public static final Parcelable.Creator<C1856A> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final a f14268a;

    /* renamed from: b3.A$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0352a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f14269a;

        /* renamed from: b3.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0352a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3159y.i(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new a(z8);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(boolean z8) {
            this.f14269a = z8;
        }

        public final boolean b() {
            return this.f14269a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f14269a == ((a) obj).f14269a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f14269a);
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.f14269a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f14269a ? 1 : 0);
        }
    }

    /* renamed from: b3.A$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1856A createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1856A(a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1856A[] newArray(int i8) {
            return new C1856A[i8];
        }
    }

    public C1856A(a cardBrandChoice) {
        AbstractC3159y.i(cardBrandChoice, "cardBrandChoice");
        this.f14268a = cardBrandChoice;
    }

    public final a b() {
        return this.f14268a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1856A) && AbstractC3159y.d(this.f14268a, ((C1856A) obj).f14268a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14268a.hashCode();
    }

    public String toString() {
        return "MobileCardElementConfig(cardBrandChoice=" + this.f14268a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f14268a.writeToParcel(out, i8);
    }
}
