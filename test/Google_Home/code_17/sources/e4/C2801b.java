package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import t4.C4038a;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2801b implements Parcelable {
    public static final Parcelable.Creator<C2801b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f31613a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31614b;

    /* renamed from: e4.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2801b createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2801b(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2801b[] newArray(int i8) {
            return new C2801b[i8];
        }
    }

    public C2801b(long j8, String currencyCode) {
        AbstractC3255y.i(currencyCode, "currencyCode");
        this.f31613a = j8;
        this.f31614b = currencyCode;
    }

    public final B2.b a() {
        int i8 = n.f31699F;
        C4038a c4038a = C4038a.f39813a;
        long j8 = this.f31613a;
        String str = this.f31614b;
        Locale locale = AppCompatDelegate.getApplicationLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        AbstractC3255y.f(locale);
        return B2.c.f(i8, new Object[]{c4038a.a(j8, str, locale)}, null, 4, null);
    }

    public final String b() {
        return this.f31614b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2801b)) {
            return false;
        }
        C2801b c2801b = (C2801b) obj;
        if (this.f31613a == c2801b.f31613a && AbstractC3255y.d(this.f31614b, c2801b.f31614b)) {
            return true;
        }
        return false;
    }

    public final long g() {
        return this.f31613a;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f31613a) * 31) + this.f31614b.hashCode();
    }

    public String toString() {
        return "Amount(value=" + this.f31613a + ", currencyCode=" + this.f31614b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeLong(this.f31613a);
        out.writeString(this.f31614b);
    }
}
