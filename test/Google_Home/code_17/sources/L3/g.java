package L3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final N2.d f6045a;

    /* renamed from: b, reason: collision with root package name */
    private final b f6046b;

    /* renamed from: c, reason: collision with root package name */
    private final W2.k f6047c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6044d = N2.d.f7669h;
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createFromParcel(Parcel parcel) {
            W2.k valueOf;
            AbstractC3255y.i(parcel, "parcel");
            N2.d dVar = (N2.d) parcel.readParcelable(g.class.getClassLoader());
            b valueOf2 = b.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = W2.k.valueOf(parcel.readString());
            }
            return new g(dVar, valueOf2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g[] newArray(int i8) {
            return new g[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6048a = new b("LoggedIn", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f6049b = new b("NeedsVerification", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f6050c = new b("LoggedOut", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f6051d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f6052e;

        static {
            b[] a8 = a();
            f6051d = a8;
            f6052e = U5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f6048a, f6049b, f6050c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f6051d.clone();
        }
    }

    public g(N2.d configuration, b loginState, W2.k kVar) {
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(loginState, "loginState");
        this.f6045a = configuration;
        this.f6046b = loginState;
        this.f6047c = kVar;
    }

    public final N2.d a() {
        return this.f6045a;
    }

    public final W2.k b() {
        return this.f6047c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3255y.d(this.f6045a, gVar.f6045a) && this.f6046b == gVar.f6046b && this.f6047c == gVar.f6047c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f6045a.hashCode() * 31) + this.f6046b.hashCode()) * 31;
        W2.k kVar = this.f6047c;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "LinkState(configuration=" + this.f6045a + ", loginState=" + this.f6046b + ", signupMode=" + this.f6047c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f6045a, i8);
        out.writeString(this.f6046b.name());
        W2.k kVar = this.f6047c;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(kVar.name());
        }
    }
}
