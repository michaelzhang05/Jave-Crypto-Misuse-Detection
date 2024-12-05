package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f27943a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27944b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27945c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27946d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f27941e = new a(null);
    public static final Parcelable.Creator<n> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final n f27942f = new n("", "", "", null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final n a() {
            return n.f27942f;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    public n(String clientSecret, String sourceId, String publishableKey, String str) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(sourceId, "sourceId");
        AbstractC3255y.i(publishableKey, "publishableKey");
        this.f27943a = clientSecret;
        this.f27944b = sourceId;
        this.f27945c = publishableKey;
        this.f27946d = str;
    }

    public final String b() {
        return this.f27946d;
    }

    public final String d() {
        return this.f27943a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3255y.d(this.f27943a, nVar.f27943a) && AbstractC3255y.d(this.f27944b, nVar.f27944b) && AbstractC3255y.d(this.f27945c, nVar.f27945c) && AbstractC3255y.d(this.f27946d, nVar.f27946d);
    }

    public final String g() {
        return this.f27945c;
    }

    public final String h() {
        return this.f27944b;
    }

    public int hashCode() {
        int hashCode = ((((this.f27943a.hashCode() * 31) + this.f27944b.hashCode()) * 31) + this.f27945c.hashCode()) * 31;
        String str = this.f27946d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.f27943a + ", sourceId=" + this.f27944b + ", publishableKey=" + this.f27945c + ", accountId=" + this.f27946d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f27943a);
        out.writeString(this.f27944b);
        out.writeString(this.f27945c);
        out.writeString(this.f27946d);
    }
}
