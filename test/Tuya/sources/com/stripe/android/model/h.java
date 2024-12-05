package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.K;
import com.stripe.android.model.SourceTypeModel;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class h extends g {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Source f24259a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new h(Source.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h[] newArray(int i8) {
            return new h[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Source source) {
        super(null);
        AbstractC3159y.i(source, "source");
        this.f24259a = source;
    }

    @Override // com.stripe.android.model.g
    public K b() {
        if (this.f24259a.e() instanceof SourceTypeModel.Card) {
            return ((SourceTypeModel.Card) this.f24259a.e()).b();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && AbstractC3159y.d(this.f24259a, ((h) obj).f24259a);
    }

    public int hashCode() {
        return this.f24259a.hashCode();
    }

    public String toString() {
        return "CustomerSource(source=" + this.f24259a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f24259a.writeToParcel(out, i8);
    }
}
