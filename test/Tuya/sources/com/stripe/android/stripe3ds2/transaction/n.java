package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f26888a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26889b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26890c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26891d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f26886e = new a(null);
    public static final Parcelable.Creator<n> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final n f26887f = new n("", "", "", null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final n a() {
            return n.f26887f;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    public n(String clientSecret, String sourceId, String publishableKey, String str) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(sourceId, "sourceId");
        AbstractC3159y.i(publishableKey, "publishableKey");
        this.f26888a = clientSecret;
        this.f26889b = sourceId;
        this.f26890c = publishableKey;
        this.f26891d = str;
    }

    public final String c() {
        return this.f26891d;
    }

    public final String d() {
        return this.f26888a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f26890c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3159y.d(this.f26888a, nVar.f26888a) && AbstractC3159y.d(this.f26889b, nVar.f26889b) && AbstractC3159y.d(this.f26890c, nVar.f26890c) && AbstractC3159y.d(this.f26891d, nVar.f26891d);
    }

    public final String f() {
        return this.f26889b;
    }

    public int hashCode() {
        int hashCode = ((((this.f26888a.hashCode() * 31) + this.f26889b.hashCode()) * 31) + this.f26890c.hashCode()) * 31;
        String str = this.f26891d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.f26888a + ", sourceId=" + this.f26889b + ", publishableKey=" + this.f26890c + ", accountId=" + this.f26891d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f26888a);
        out.writeString(this.f26889b);
        out.writeString(this.f26890c);
        out.writeString(this.f26891d);
    }
}
