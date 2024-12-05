package a5;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* loaded from: classes5.dex */
public final class O implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f14044a;

    /* renamed from: b, reason: collision with root package name */
    private long f14045b;

    /* renamed from: c, reason: collision with root package name */
    private String f14046c;

    /* renamed from: d, reason: collision with root package name */
    private long f14047d;

    /* renamed from: e, reason: collision with root package name */
    private int f14048e;

    /* renamed from: f, reason: collision with root package name */
    private String f14049f;

    /* renamed from: g, reason: collision with root package name */
    private int f14050g;

    /* renamed from: h, reason: collision with root package name */
    private int f14051h;

    /* renamed from: i, reason: collision with root package name */
    private String f14052i;

    /* renamed from: j, reason: collision with root package name */
    private String f14053j;

    /* renamed from: k, reason: collision with root package name */
    private C1652t f14054k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f14043l = new b(null);
    public static Parcelable.Creator<O> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
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
            C1639f S8;
            AbstractC3255y.i(context, "context");
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            Iterator it = a8.v0().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                O o8 = (O) it.next();
                if (!new Q4.f().p(context, o8.s()) && o8.p() == 0) {
                    if (j6.n.s(o8.s(), context.getPackageName(), true) && o8.w() > 0) {
                        if (o8.w() > 628) {
                            i8++;
                        }
                    } else if (o8.h() == 0 && (S8 = a8.S(o8.s())) != null && S8.i() == 0 && S8.i0(context)) {
                        i8++;
                    }
                }
            }
            a8.l();
            return i8;
        }

        public final int b(Context context) {
            AbstractC3255y.i(context, "context");
            return c(context).size();
        }

        public final ArrayList c(Context context) {
            C1639f S8;
            AbstractC3255y.i(context, "context");
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            ArrayList arrayList = new ArrayList();
            Iterator it = a8.v0().iterator();
            while (it.hasNext()) {
                O o8 = (O) it.next();
                if (!new Q4.f().p(context, o8.s())) {
                    if (j6.n.s(o8.s(), context.getPackageName(), true) && o8.w() > 0) {
                        if (o8.w() > 628) {
                            arrayList.add(o8);
                        }
                    } else if (o8.h() == 0 && (S8 = a8.S(o8.s())) != null && S8.i() == 0 && S8.i0(context)) {
                        arrayList.add(o8);
                    }
                }
            }
            a8.l();
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public O(String packagename) {
        AbstractC3255y.i(packagename, "packagename");
        this.f14045b = -1L;
        this.f14044a = packagename;
    }

    public final void H(int i8) {
        this.f14051h = i8;
    }

    public final void J(C1652t c1652t) {
        this.f14054k = c1652t;
    }

    public final void U(String str) {
        this.f14049f = str;
    }

    public final void W(int i8) {
        this.f14048e = i8;
    }

    public final void X(int i8) {
        this.f14050g = i8;
    }

    public final void Y(long j8) {
        this.f14047d = j8;
    }

    public final void Z(long j8) {
        this.f14045b = j8;
    }

    public final boolean a() {
        return UptodownApp.f29058B.P(this);
    }

    public final void a0(String str) {
        this.f14046c = str;
    }

    public final String b() {
        return this.f14053j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String g() {
        return this.f14052i;
    }

    public final int h() {
        return this.f14051h;
    }

    public final C1652t i() {
        return this.f14054k;
    }

    public final String l() {
        return this.f14049f;
    }

    public final int p() {
        return this.f14048e;
    }

    public final String s() {
        return this.f14044a;
    }

    public String toString() {
        return "Update{packagename='" + this.f14044a + "', versionCode='" + this.f14045b + "', versionName='" + this.f14046c + "', size=" + this.f14047d + ", notified=" + this.f14048e + ", nameApkFile='" + this.f14049f + "', progress=" + this.f14050g + ", ignoreVersion=" + this.f14051h + ", filehash='" + this.f14052i + "', fileId='" + this.f14053j + "'}";
    }

    public final int u() {
        return this.f14050g;
    }

    public final long v() {
        return this.f14047d;
    }

    public final long w() {
        return this.f14045b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f14044a);
        parcel.writeLong(this.f14045b);
        parcel.writeString(this.f14046c);
        parcel.writeLong(this.f14047d);
        parcel.writeInt(this.f14048e);
        parcel.writeString(this.f14049f);
        parcel.writeInt(this.f14050g);
        parcel.writeInt(this.f14051h);
        parcel.writeString(this.f14052i);
        parcel.writeString(this.f14053j);
    }

    public final String x() {
        return this.f14046c;
    }

    public final void y(String str) {
        this.f14053j = str;
    }

    public final void z(String str) {
        this.f14052i = str;
    }

    public O(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14045b = -1L;
        String readString = source.readString();
        AbstractC3255y.f(readString);
        this.f14044a = readString;
        this.f14045b = source.readLong();
        this.f14046c = source.readString();
        this.f14047d = source.readLong();
        this.f14048e = source.readInt();
        this.f14049f = source.readString();
        this.f14050g = source.readInt();
        this.f14051h = source.readInt();
        this.f14052i = source.readString();
        this.f14053j = source.readString();
    }
}
