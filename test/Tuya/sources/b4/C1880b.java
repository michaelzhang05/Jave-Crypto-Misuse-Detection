package b4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import q4.C3659a;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1880b implements Parcelable {
    public static final Parcelable.Creator<C1880b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f14607a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14608b;

    /* renamed from: b4.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1880b createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1880b(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1880b[] newArray(int i8) {
            return new C1880b[i8];
        }
    }

    public C1880b(long j8, String currencyCode) {
        AbstractC3159y.i(currencyCode, "currencyCode");
        this.f14607a = j8;
        this.f14608b = currencyCode;
    }

    public final InterfaceC3983b b() {
        int i8 = n.f14693F;
        C3659a c3659a = C3659a.f37491a;
        long j8 = this.f14607a;
        String str = this.f14608b;
        Locale locale = AppCompatDelegate.getApplicationLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        AbstractC3159y.f(locale);
        return AbstractC3984c.f(i8, new Object[]{c3659a.a(j8, str, locale)}, null, 4, null);
    }

    public final String c() {
        return this.f14608b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f14607a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1880b)) {
            return false;
        }
        C1880b c1880b = (C1880b) obj;
        if (this.f14607a == c1880b.f14607a && AbstractC3159y.d(this.f14608b, c1880b.f14608b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f14607a) * 31) + this.f14608b.hashCode();
    }

    public String toString() {
        return "Amount(value=" + this.f14607a + ", currencyCode=" + this.f14608b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeLong(this.f14607a);
        out.writeString(this.f14608b);
    }
}
