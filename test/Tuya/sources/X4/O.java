package X4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* loaded from: classes5.dex */
public final class O implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12423a;

    /* renamed from: b, reason: collision with root package name */
    private long f12424b;

    /* renamed from: c, reason: collision with root package name */
    private String f12425c;

    /* renamed from: d, reason: collision with root package name */
    private long f12426d;

    /* renamed from: e, reason: collision with root package name */
    private int f12427e;

    /* renamed from: f, reason: collision with root package name */
    private String f12428f;

    /* renamed from: g, reason: collision with root package name */
    private int f12429g;

    /* renamed from: h, reason: collision with root package name */
    private int f12430h;

    /* renamed from: i, reason: collision with root package name */
    private String f12431i;

    /* renamed from: j, reason: collision with root package name */
    private String f12432j;

    /* renamed from: k, reason: collision with root package name */
    private C1509t f12433k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f12422l = new b(null);
    public static Parcelable.Creator<O> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new O(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public O[] newArray(int i8) {
            return new O[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final int a(Context context) {
            C1496f S7;
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            Iterator it = a8.v0().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                O o8 = (O) it.next();
                if (!new N4.f().p(context, o8.n()) && o8.k() == 0) {
                    if (g6.n.s(o8.n(), context.getPackageName(), true) && o8.u() > 0) {
                        if (o8.u() > 627) {
                            i8++;
                        }
                    } else if (o8.f() == 0 && (S7 = a8.S(o8.n())) != null && S7.i() == 0 && S7.i0(context)) {
                        i8++;
                    }
                }
            }
            a8.g();
            return i8;
        }

        public final int b(Context context) {
            C1496f S7;
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            Iterator it = a8.v0().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                O o8 = (O) it.next();
                if (!new N4.f().p(context, o8.n())) {
                    if (g6.n.s(o8.n(), context.getPackageName(), true) && o8.u() > 0) {
                        if (o8.u() > 627) {
                            i8++;
                        }
                    } else if (o8.f() == 0 && (S7 = a8.S(o8.n())) != null && S7.i() == 0 && S7.i0(context)) {
                        i8++;
                    }
                }
            }
            a8.g();
            return i8;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public O(String packagename) {
        AbstractC3159y.i(packagename, "packagename");
        this.f12424b = -1L;
        this.f12423a = packagename;
    }

    public final void G(String str) {
        this.f12432j = str;
    }

    public final void I(String str) {
        this.f12431i = str;
    }

    public final void L(int i8) {
        this.f12430h = i8;
    }

    public final void Q(C1509t c1509t) {
        this.f12433k = c1509t;
    }

    public final void T(String str) {
        this.f12428f = str;
    }

    public final void V(int i8) {
        this.f12427e = i8;
    }

    public final void X(int i8) {
        this.f12429g = i8;
    }

    public final void Y(long j8) {
        this.f12426d = j8;
    }

    public final void Z(long j8) {
        this.f12424b = j8;
    }

    public final void a0(String str) {
        this.f12425c = str;
    }

    public final boolean b() {
        return UptodownApp.f28003B.P(this);
    }

    public final String c() {
        return this.f12432j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12431i;
    }

    public final int f() {
        return this.f12430h;
    }

    public final C1509t i() {
        return this.f12433k;
    }

    public final String j() {
        return this.f12428f;
    }

    public final int k() {
        return this.f12427e;
    }

    public final String n() {
        return this.f12423a;
    }

    public final int o() {
        return this.f12429g;
    }

    public final long s() {
        return this.f12426d;
    }

    public String toString() {
        return "Update{packagename='" + this.f12423a + "', versionCode='" + this.f12424b + "', versionName='" + this.f12425c + "', size=" + this.f12426d + ", notified=" + this.f12427e + ", nameApkFile='" + this.f12428f + "', progress=" + this.f12429g + ", ignoreVersion=" + this.f12430h + ", filehash='" + this.f12431i + "', fileId='" + this.f12432j + "'}";
    }

    public final long u() {
        return this.f12424b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12423a);
        parcel.writeLong(this.f12424b);
        parcel.writeString(this.f12425c);
        parcel.writeLong(this.f12426d);
        parcel.writeInt(this.f12427e);
        parcel.writeString(this.f12428f);
        parcel.writeInt(this.f12429g);
        parcel.writeInt(this.f12430h);
        parcel.writeString(this.f12431i);
        parcel.writeString(this.f12432j);
    }

    public final String z() {
        return this.f12425c;
    }

    public O(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12424b = -1L;
        String readString = source.readString();
        AbstractC3159y.f(readString);
        this.f12423a = readString;
        this.f12424b = source.readLong();
        this.f12425c = source.readString();
        this.f12426d = source.readLong();
        this.f12427e = source.readInt();
        this.f12428f = source.readString();
        this.f12429g = source.readInt();
        this.f12430h = source.readInt();
        this.f12431i = source.readString();
        this.f12432j = source.readString();
    }
}
