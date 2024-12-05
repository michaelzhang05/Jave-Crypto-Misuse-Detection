package j2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j2.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3056H extends AbstractC3059K {
    public static final Parcelable.Creator<C3056H> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.u f32931b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32932c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32933d;

    /* renamed from: j2.H$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3056H createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C3056H(com.stripe.android.model.u.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3056H[] newArray(int i8) {
            return new C3056H[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3056H(com.stripe.android.model.u intent, int i8, String str) {
        super(i8);
        AbstractC3159y.i(intent, "intent");
        this.f32931b = intent;
        this.f32932c = i8;
        this.f32933d = str;
    }

    @Override // j2.AbstractC3059K
    public String c() {
        return this.f32933d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3056H)) {
            return false;
        }
        C3056H c3056h = (C3056H) obj;
        if (AbstractC3159y.d(this.f32931b, c3056h.f32931b) && this.f32932c == c3056h.f32932c && AbstractC3159y.d(this.f32933d, c3056h.f32933d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f32931b.hashCode() * 31) + this.f32932c) * 31;
        String str = this.f32933d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // j2.AbstractC3059K
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.u e() {
        return this.f32931b;
    }

    public String toString() {
        return "SetupIntentResult(intent=" + this.f32931b + ", outcomeFromFlow=" + this.f32932c + ", failureMessage=" + this.f32933d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f32931b.writeToParcel(out, i8);
        out.writeInt(this.f32932c);
        out.writeString(this.f32933d);
    }
}
