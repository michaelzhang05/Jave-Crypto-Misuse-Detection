package j2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class t extends AbstractC3059K {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.n f33068b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33069c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33070d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new t(com.stripe.android.model.n.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i8) {
            return new t[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.stripe.android.model.n intent, int i8, String str) {
        super(i8);
        AbstractC3159y.i(intent, "intent");
        this.f33068b = intent;
        this.f33069c = i8;
        this.f33070d = str;
    }

    @Override // j2.AbstractC3059K
    public String c() {
        return this.f33070d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3159y.d(this.f33068b, tVar.f33068b) && this.f33069c == tVar.f33069c && AbstractC3159y.d(this.f33070d, tVar.f33070d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f33068b.hashCode() * 31) + this.f33069c) * 31;
        String str = this.f33070d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // j2.AbstractC3059K
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.n e() {
        return this.f33068b;
    }

    public String toString() {
        return "PaymentIntentResult(intent=" + this.f33068b + ", outcomeFromFlow=" + this.f33069c + ", failureMessage=" + this.f33070d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f33068b.writeToParcel(out, i8);
        out.writeInt(this.f33069c);
        out.writeString(this.f33070d);
    }
}
