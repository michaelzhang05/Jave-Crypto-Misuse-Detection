package m2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m2.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3410H extends AbstractC3413K {
    public static final Parcelable.Creator<C3410H> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.u f34907b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34908c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34909d;

    /* renamed from: m2.H$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3410H createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C3410H(com.stripe.android.model.u.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3410H[] newArray(int i8) {
            return new C3410H[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3410H(com.stripe.android.model.u intent, int i8, String str) {
        super(i8);
        AbstractC3255y.i(intent, "intent");
        this.f34907b = intent;
        this.f34908c = i8;
        this.f34909d = str;
    }

    @Override // m2.AbstractC3413K
    public String b() {
        return this.f34909d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3410H)) {
            return false;
        }
        C3410H c3410h = (C3410H) obj;
        if (AbstractC3255y.d(this.f34907b, c3410h.f34907b) && this.f34908c == c3410h.f34908c && AbstractC3255y.d(this.f34909d, c3410h.f34909d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f34907b.hashCode() * 31) + this.f34908c) * 31;
        String str = this.f34909d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // m2.AbstractC3413K
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.u g() {
        return this.f34907b;
    }

    public String toString() {
        return "SetupIntentResult(intent=" + this.f34907b + ", outcomeFromFlow=" + this.f34908c + ", failureMessage=" + this.f34909d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f34907b.writeToParcel(out, i8);
        out.writeInt(this.f34908c);
        out.writeString(this.f34909d);
    }
}
