package V3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f10861a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10862b;

    /* renamed from: c, reason: collision with root package name */
    private final b f10863c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
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
        public static final b f10864a = new b("LOW", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f10865b = new b("MEDIUM", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f10866c = new b("HIGH", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f10867d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f10868e;

        static {
            b[] a8 = a();
            f10867d = a8;
            f10868e = U5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f10864a, f10865b, f10866c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10867d.clone();
        }
    }

    public n(String id, String message, b severity) {
        AbstractC3255y.i(id, "id");
        AbstractC3255y.i(message, "message");
        AbstractC3255y.i(severity, "severity");
        this.f10861a = id;
        this.f10862b = message;
        this.f10863c = severity;
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
        if (AbstractC3255y.d(this.f10861a, nVar.f10861a) && AbstractC3255y.d(this.f10862b, nVar.f10862b) && this.f10863c == nVar.f10863c) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f10861a;
    }

    public int hashCode() {
        return (((this.f10861a.hashCode() * 31) + this.f10862b.hashCode()) * 31) + this.f10863c.hashCode();
    }

    public String toString() {
        return "Warning(id=" + this.f10861a + ", message=" + this.f10862b + ", severity=" + this.f10863c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f10861a);
        out.writeString(this.f10862b);
        out.writeString(this.f10863c.name());
    }
}
