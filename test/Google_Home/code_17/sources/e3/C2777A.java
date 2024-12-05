package e3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2777A implements y2.f {
    public static final Parcelable.Creator<C2777A> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final a f31274a;

    /* renamed from: e3.A$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0720a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f31275a;

        /* renamed from: e3.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0720a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3255y.i(parcel, "parcel");
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
            this.f31275a = z8;
        }

        public final boolean a() {
            return this.f31275a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f31275a == ((a) obj).f31275a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f31275a);
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.f31275a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f31275a ? 1 : 0);
        }
    }

    /* renamed from: e3.A$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2777A createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2777A(a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2777A[] newArray(int i8) {
            return new C2777A[i8];
        }
    }

    public C2777A(a cardBrandChoice) {
        AbstractC3255y.i(cardBrandChoice, "cardBrandChoice");
        this.f31274a = cardBrandChoice;
    }

    public final a a() {
        return this.f31274a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2777A) && AbstractC3255y.d(this.f31274a, ((C2777A) obj).f31274a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31274a.hashCode();
    }

    public String toString() {
        return "MobileCardElementConfig(cardBrandChoice=" + this.f31274a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f31274a.writeToParcel(out, i8);
    }
}
