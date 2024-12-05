package a5;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: a5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1651s implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f14330a;

    /* renamed from: b, reason: collision with root package name */
    private String f14331b;

    /* renamed from: a5.s$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1651s createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C1651s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1651s[] newArray(int i8) {
            return new C1651s[i8];
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1651s() {
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!jSONObject.isNull("antivirusName")) {
                this.f14330a = jSONObject.getString("antivirusName");
            }
            if (!jSONObject.isNull("virusName")) {
                this.f14331b = jSONObject.getString("virusName");
            }
        }
    }

    public final String b() {
        return this.f14330a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String g() {
        return this.f14331b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f14330a);
        parcel.writeString(this.f14331b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1651s(Parcel parcel) {
        this();
        AbstractC3255y.i(parcel, "parcel");
        this.f14330a = parcel.readString();
        this.f14331b = parcel.readString();
    }
}
