package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.AbstractC3255y;
import o2.f;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2789c implements y2.f {
    public static final Parcelable.Creator<C2789c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f31418a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31419b;

    /* renamed from: e3.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2789c createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2789c(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2789c[] newArray(int i8) {
            return new C2789c[i8];
        }
    }

    public C2789c(String low, String high) {
        AbstractC3255y.i(low, "low");
        AbstractC3255y.i(high, "high");
        this.f31418a = low;
        this.f31419b = high;
    }

    public final boolean a(f.b cardNumber) {
        boolean z8;
        boolean z9;
        AbstractC3255y.i(cardNumber, "cardNumber");
        String g8 = cardNumber.g();
        BigDecimal f8 = j6.n.f(g8);
        if (f8 == null) {
            return false;
        }
        if (g8.length() >= this.f31418a.length() ? new BigDecimal(j6.n.U0(g8, this.f31418a.length())).compareTo(new BigDecimal(this.f31418a)) >= 0 : f8.compareTo(new BigDecimal(j6.n.U0(this.f31418a, g8.length()))) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (g8.length() >= this.f31419b.length() ? new BigDecimal(j6.n.U0(g8, this.f31419b.length())).compareTo(new BigDecimal(this.f31419b)) <= 0 : f8.compareTo(new BigDecimal(j6.n.U0(this.f31419b, g8.length()))) <= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2789c)) {
            return false;
        }
        C2789c c2789c = (C2789c) obj;
        if (AbstractC3255y.d(this.f31418a, c2789c.f31418a) && AbstractC3255y.d(this.f31419b, c2789c.f31419b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f31418a.hashCode() * 31) + this.f31419b.hashCode();
    }

    public String toString() {
        return "BinRange(low=" + this.f31418a + ", high=" + this.f31419b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31418a);
        out.writeString(this.f31419b);
    }
}
