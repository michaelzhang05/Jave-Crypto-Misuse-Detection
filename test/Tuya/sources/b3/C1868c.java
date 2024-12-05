package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1868c implements v2.f {
    public static final Parcelable.Creator<C1868c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14412a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14413b;

    /* renamed from: b3.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1868c createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1868c(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1868c[] newArray(int i8) {
            return new C1868c[i8];
        }
    }

    public C1868c(String low, String high) {
        AbstractC3159y.i(low, "low");
        AbstractC3159y.i(high, "high");
        this.f14412a = low;
        this.f14413b = high;
    }

    public final boolean b(f.b cardNumber) {
        boolean z8;
        boolean z9;
        AbstractC3159y.i(cardNumber, "cardNumber");
        String g8 = cardNumber.g();
        BigDecimal f8 = g6.n.f(g8);
        if (f8 == null) {
            return false;
        }
        if (g8.length() >= this.f14412a.length() ? new BigDecimal(g6.n.U0(g8, this.f14412a.length())).compareTo(new BigDecimal(this.f14412a)) >= 0 : f8.compareTo(new BigDecimal(g6.n.U0(this.f14412a, g8.length()))) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (g8.length() >= this.f14413b.length() ? new BigDecimal(g6.n.U0(g8, this.f14413b.length())).compareTo(new BigDecimal(this.f14413b)) <= 0 : f8.compareTo(new BigDecimal(g6.n.U0(this.f14413b, g8.length()))) <= 0) {
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
        if (!(obj instanceof C1868c)) {
            return false;
        }
        C1868c c1868c = (C1868c) obj;
        if (AbstractC3159y.d(this.f14412a, c1868c.f14412a) && AbstractC3159y.d(this.f14413b, c1868c.f14413b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f14412a.hashCode() * 31) + this.f14413b.hashCode();
    }

    public String toString() {
        return "BinRange(low=" + this.f14412a + ", high=" + this.f14413b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14412a);
        out.writeString(this.f14413b);
    }
}
