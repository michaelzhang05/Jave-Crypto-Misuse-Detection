package X3;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class q implements Parcelable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f12296a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f12295b = new a(null);
    public static final Parcelable.Creator<q> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final q a() {
            UUID randomUUID = UUID.randomUUID();
            AbstractC3159y.h(randomUUID, "randomUUID(...)");
            return new q(randomUUID);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new q(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q[] newArray(int i8) {
            return new q[i8];
        }
    }

    public q(String value) {
        AbstractC3159y.i(value, "value");
        this.f12296a = value;
    }

    public final String b() {
        return this.f12296a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && AbstractC3159y.d(this.f12296a, ((q) obj).f12296a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f12296a.hashCode();
    }

    public String toString() {
        return this.f12296a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f12296a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.util.UUID r2) {
        /*
            r1 = this;
            java.lang.String r0 = "uuidValue"
            kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.q.<init>(java.util.UUID):void");
    }
}
