package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final int f25f;

    /* renamed from: g, reason: collision with root package name */
    private final float f26g;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    RatingCompat(int i2, float f2) {
        this.f25f = i2;
        this.f26g = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f25f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f25f);
        sb.append(" rating=");
        float f2 = this.f26g;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f25f);
        parcel.writeFloat(this.f26g);
    }
}
