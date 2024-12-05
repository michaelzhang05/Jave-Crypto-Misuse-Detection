package S3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9218a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9219b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9220c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9221a = new b("LOW", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f9222b = new b("MEDIUM", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f9223c = new b("HIGH", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f9224d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f9225e;

        static {
            b[] a8 = a();
            f9224d = a8;
            f9225e = R5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f9221a, f9222b, f9223c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9224d.clone();
        }
    }

    public n(String id, String message, b severity) {
        AbstractC3159y.i(id, "id");
        AbstractC3159y.i(message, "message");
        AbstractC3159y.i(severity, "severity");
        this.f9218a = id;
        this.f9219b = message;
        this.f9220c = severity;
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
        if (AbstractC3159y.d(this.f9218a, nVar.f9218a) && AbstractC3159y.d(this.f9219b, nVar.f9219b) && this.f9220c == nVar.f9220c) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f9218a;
    }

    public int hashCode() {
        return (((this.f9218a.hashCode() * 31) + this.f9219b.hashCode()) * 31) + this.f9220c.hashCode();
    }

    public String toString() {
        return "Warning(id=" + this.f9218a + ", message=" + this.f9219b + ", severity=" + this.f9220c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f9218a);
        out.writeString(this.f9219b);
        out.writeString(this.f9220c.name());
    }
}
