package I3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final K2.d f4050a;

    /* renamed from: b, reason: collision with root package name */
    private final b f4051b;

    /* renamed from: c, reason: collision with root package name */
    private final T2.k f4052c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4049d = K2.d.f5890h;
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createFromParcel(Parcel parcel) {
            T2.k valueOf;
            AbstractC3159y.i(parcel, "parcel");
            K2.d dVar = (K2.d) parcel.readParcelable(g.class.getClassLoader());
            b valueOf2 = b.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = T2.k.valueOf(parcel.readString());
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
        public static final b f4053a = new b("LoggedIn", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f4054b = new b("NeedsVerification", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f4055c = new b("LoggedOut", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f4056d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f4057e;

        static {
            b[] a8 = a();
            f4056d = a8;
            f4057e = R5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f4053a, f4054b, f4055c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4056d.clone();
        }
    }

    public g(K2.d configuration, b loginState, T2.k kVar) {
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(loginState, "loginState");
        this.f4050a = configuration;
        this.f4051b = loginState;
        this.f4052c = kVar;
    }

    public final K2.d b() {
        return this.f4050a;
    }

    public final T2.k c() {
        return this.f4052c;
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
        if (AbstractC3159y.d(this.f4050a, gVar.f4050a) && this.f4051b == gVar.f4051b && this.f4052c == gVar.f4052c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f4050a.hashCode() * 31) + this.f4051b.hashCode()) * 31;
        T2.k kVar = this.f4052c;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "LinkState(configuration=" + this.f4050a + ", loginState=" + this.f4051b + ", signupMode=" + this.f4052c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f4050a, i8);
        out.writeString(this.f4051b.name());
        T2.k kVar = this.f4052c;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(kVar.name());
        }
    }
}
