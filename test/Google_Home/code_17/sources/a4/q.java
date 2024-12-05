package a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class q implements Parcelable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f13917a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f13916b = new a(null);
    public static final Parcelable.Creator<q> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final q a() {
            UUID randomUUID = UUID.randomUUID();
            AbstractC3255y.h(randomUUID, "randomUUID(...)");
            return new q(randomUUID);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new q(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q[] newArray(int i8) {
            return new q[i8];
        }
    }

    public q(String value) {
        AbstractC3255y.i(value, "value");
        this.f13917a = value;
    }

    public final String a() {
        return this.f13917a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && AbstractC3255y.d(this.f13917a, ((q) obj).f13917a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f13917a.hashCode();
    }

    public String toString() {
        return this.f13917a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f13917a);
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
            kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.q.<init>(java.util.UUID):void");
    }
}
