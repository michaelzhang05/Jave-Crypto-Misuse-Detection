package a5;

import Q4.w;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import o5.C3674n;
import o5.C3677q;
import o5.C3680t;

/* renamed from: a5.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1648o implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private int f14295a;

    /* renamed from: b, reason: collision with root package name */
    private String f14296b;

    /* renamed from: c, reason: collision with root package name */
    private String f14297c;

    /* renamed from: d, reason: collision with root package name */
    private int f14298d;

    /* renamed from: e, reason: collision with root package name */
    private int f14299e;

    /* renamed from: f, reason: collision with root package name */
    private int f14300f;

    /* renamed from: g, reason: collision with root package name */
    private long f14301g;

    /* renamed from: h, reason: collision with root package name */
    private long f14302h;

    /* renamed from: i, reason: collision with root package name */
    private String f14303i;

    /* renamed from: j, reason: collision with root package name */
    private long f14304j;

    /* renamed from: k, reason: collision with root package name */
    private int f14305k;

    /* renamed from: l, reason: collision with root package name */
    private long f14306l;

    /* renamed from: m, reason: collision with root package name */
    private int f14307m;

    /* renamed from: n, reason: collision with root package name */
    private String f14308n;

    /* renamed from: o, reason: collision with root package name */
    private String f14309o;

    /* renamed from: p, reason: collision with root package name */
    private String f14310p;

    /* renamed from: q, reason: collision with root package name */
    private String f14311q;

    /* renamed from: r, reason: collision with root package name */
    private int f14312r;

    /* renamed from: s, reason: collision with root package name */
    private String f14313s;

    /* renamed from: t, reason: collision with root package name */
    private String f14314t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f14315u;

    /* renamed from: v, reason: collision with root package name */
    private String f14316v;

    /* renamed from: w, reason: collision with root package name */
    private long f14317w;

    /* renamed from: x, reason: collision with root package name */
    private long f14318x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f14294y = new b(null);
    public static Parcelable.Creator<C1648o> CREATOR = new a();

    /* renamed from: a5.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1648o createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new C1648o(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1648o[] newArray(int i8) {
            return new C1648o[i8];
        }
    }

    /* renamed from: a5.o$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final C1648o a(Context context, File file) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(file, "file");
            w.a aVar = Q4.w.f9241b;
            String name = file.getName();
            AbstractC3255y.h(name, "file.name");
            if (aVar.a(name)) {
                C1648o c1648o = new C1648o();
                c1648o.D0(file.getName());
                N4.f e8 = new Q4.w().e(file, context);
                c1648o.z0(0);
                c1648o.F0(100);
                c1648o.G0(file.length());
                c1648o.o0(file.getAbsolutePath());
                if (e8 != null) {
                    c1648o.E0(e8.a());
                    c1648o.J0(e8.b());
                }
                return c1648o;
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3255y.h(packageManager, "context.packageManager");
                String absolutePath = file.getAbsolutePath();
                AbstractC3255y.h(absolutePath, "file.absolutePath");
                PackageInfo c8 = Q4.q.c(packageManager, absolutePath, 128);
                if (c8 == null) {
                    return null;
                }
                C1648o c1648o2 = new C1648o();
                c1648o2.D0(file.getName());
                c1648o2.E0(c8.packageName);
                c1648o2.J0(new Q4.f().m(c8));
                c1648o2.F0(100);
                c1648o2.z0(0);
                c1648o2.G0(file.length());
                c1648o2.o0(file.getAbsolutePath());
                c1648o2.H(context, file);
                return c1648o2;
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1648o() {
        this.f14295a = -1;
        this.f14300f = 1;
        this.f14304j = -1L;
        this.f14306l = -1L;
        this.f14317w = -1L;
        this.f14318x = -1L;
    }

    private final void j0(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String str = this.f14297c;
                AbstractC3255y.f(str);
                packageInfo = Q4.q.d(packageManager, str, 0);
            } else {
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f14318x = new Q4.f().m(packageInfo);
            }
        } catch (Exception unused) {
        }
    }

    public final void A0(String str) {
        this.f14303i = str;
    }

    public final void B0(String str) {
        this.f14310p = str;
    }

    public final void C0(int i8) {
        this.f14312r = i8;
    }

    public final void D0(String str) {
        this.f14296b = str;
    }

    public final void E0(String str) {
        this.f14297c = str;
    }

    public final void F0(int i8) {
        this.f14298d = i8;
    }

    public final void G0(long j8) {
        this.f14301g = j8;
    }

    public final void H(Context context, File file) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(file, "file");
        if (this.f14297c != null) {
            long j8 = this.f14304j;
            if (j8 > 0 && this.f14298d == 100) {
                this.f14317w = j8;
                j0(context);
                return;
            }
            String name = file.getName();
            AbstractC3255y.h(name, "file.name");
            if (j6.n.r(name, ".apk", false, 2, null) && this.f14298d == 100) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3255y.h(packageManager, "context.packageManager");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3255y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = Q4.q.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        this.f14317w = new Q4.f().m(c8);
                    }
                    if (c8 != null && j6.n.t(this.f14297c, c8.packageName, false, 2, null)) {
                        j0(context);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void H0(String str) {
        this.f14311q = str;
    }

    public final void I0(String str) {
        this.f14313s = str;
    }

    public final String J() {
        return this.f14303i;
    }

    public final void J0(long j8) {
        this.f14304j = j8;
    }

    public final String U() {
        return this.f14310p;
    }

    public final int W() {
        return this.f14312r;
    }

    public final String X() {
        return this.f14296b;
    }

    public final String Y() {
        return this.f14297c;
    }

    public final int Z() {
        return this.f14298d;
    }

    public final void a(C1641h appInfo) {
        String W02;
        AbstractC3255y.i(appInfo, "appInfo");
        if (this.f14297c == null) {
            this.f14297c = appInfo.y0();
        }
        if (this.f14304j <= 0) {
            if (appInfo.f1() > 0) {
                this.f14304j = appInfo.f1();
            } else if (appInfo.o0() > 0) {
                this.f14304j = appInfo.o0();
            }
        }
        if (this.f14306l <= 0) {
            this.f14306l = appInfo.i();
        }
        if (!C3680t.f36531a.f()) {
            this.f14307m = 1;
        }
        if (this.f14310p == null) {
            this.f14310p = appInfo.q0();
        }
        if (this.f14313s == null) {
            this.f14313s = appInfo.l0();
        }
        if (this.f14309o == null && appInfo.f0() > 0) {
            this.f14309o = String.valueOf(appInfo.f0());
        }
        if (this.f14301g <= 0 && (W02 = appInfo.W0()) != null && W02.length() != 0) {
            String W03 = appInfo.W0();
            AbstractC3255y.f(W03);
            this.f14301g = Long.parseLong(W03);
        }
        String str = this.f14314t;
        if (str == null || str.length() == 0) {
            this.f14314t = appInfo.s0();
        }
    }

    public final long a0() {
        return this.f14301g;
    }

    public final boolean b(Context context) {
        AbstractC3255y.i(context, "context");
        if (this.f14296b == null) {
            return false;
        }
        File f8 = new C3677q().f(context);
        String str = this.f14296b;
        AbstractC3255y.f(str);
        if (!new File(f8, str).exists() || this.f14298d != 100) {
            return false;
        }
        return true;
    }

    public final String b0() {
        return this.f14311q;
    }

    public final ArrayList c0() {
        return this.f14315u;
    }

    public final String d0() {
        return this.f14313s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final long e0() {
        return this.f14304j;
    }

    public final long f0() {
        return this.f14317w;
    }

    public final String g() {
        return this.f14316v;
    }

    public final long g0() {
        return this.f14318x;
    }

    public final long h() {
        return this.f14306l;
    }

    public final boolean h0() {
        if (this.f14297c != null && this.f14300f == 1 && this.f14310p != null && this.f14304j > 0 && this.f14305k < 4) {
            return true;
        }
        return false;
    }

    public final String i() {
        return this.f14314t;
    }

    public final boolean i0() {
        N4.a h8 = H4.j.f3824g.h();
        if (this.f14304j > 0 && this.f14297c != null && h8 != null && j6.n.s(h8.b(), this.f14297c, true) && h8.e() == this.f14304j) {
            return true;
        }
        return false;
    }

    public final void k0(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        this.f14297c = appInfo.y0();
        this.f14306l = appInfo.i();
        this.f14314t = appInfo.s0();
        if (!C3680t.f36531a.f()) {
            this.f14307m = 1;
        }
        if (appInfo.W0() != null) {
            String W02 = appInfo.W0();
            AbstractC3255y.f(W02);
            if (W02.length() > 0) {
                try {
                    String W03 = appInfo.W0();
                    AbstractC3255y.f(W03);
                    this.f14301g = Long.parseLong(W03);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f14310p = appInfo.q0();
        this.f14308n = appInfo.S0();
        this.f14311q = null;
        if (appInfo.X0() != null) {
            ArrayList X02 = appInfo.X0();
            AbstractC3255y.f(X02);
            if (X02.size() > 0) {
                ArrayList X03 = appInfo.X0();
                AbstractC3255y.f(X03);
                int size = X03.size();
                for (int i8 = 0; i8 < size; i8++) {
                    String str = this.f14311q;
                    if (str == null) {
                        ArrayList X04 = appInfo.X0();
                        AbstractC3255y.f(X04);
                        this.f14311q = (String) X04.get(i8);
                    } else {
                        Y y8 = Y.f34167a;
                        ArrayList X05 = appInfo.X0();
                        AbstractC3255y.f(X05);
                        String format = String.format("%s,%s", Arrays.copyOf(new Object[]{str, X05.get(i8)}, 2));
                        AbstractC3255y.h(format, "format(...)");
                        this.f14311q = format;
                    }
                }
            }
        }
        this.f14309o = String.valueOf(appInfo.f0());
        if (appInfo.r0() != null) {
            try {
                String r02 = appInfo.r0();
                AbstractC3255y.f(r02);
                this.f14312r = Integer.parseInt(r02);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        this.f14313s = appInfo.l0();
        this.f14315u = appInfo.Y0();
    }

    public final int l() {
        return this.f14305k;
    }

    public final int l0(Context context) {
        AbstractC3255y.i(context, "context");
        if (this.f14309o == null) {
            return -1;
        }
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        String str = this.f14309o;
        AbstractC3255y.f(str);
        C1648o Z7 = a8.Z(str);
        if (Z7 == null) {
            Z7 = a8.F0(this);
        }
        a8.l();
        return Z7.f14295a;
    }

    public final int m0(Context context) {
        C1648o c1648o;
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        String str = this.f14296b;
        if (str != null) {
            AbstractC3255y.f(str);
            c1648o = a8.Y(str);
        } else {
            c1648o = null;
        }
        if (c1648o == null) {
            c1648o = a8.F0(this);
        }
        a8.l();
        return c1648o.f14295a;
    }

    public final int n0(Context context) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        int A8 = a8.A(this);
        a8.l();
        return A8;
    }

    public final void o0(String str) {
        this.f14316v = str;
    }

    public final int p() {
        return this.f14299e;
    }

    public final void p0(long j8) {
        this.f14306l = j8;
    }

    public final void q0(String str) {
        this.f14314t = str;
    }

    public final void r0(int i8) {
        this.f14305k = i8;
    }

    public final int s() {
        return this.f14307m;
    }

    public final void s0(int i8) {
        this.f14299e = i8;
    }

    public final void t0(int i8) {
        this.f14307m = i8;
    }

    public String toString() {
        return "Download{id='" + this.f14295a + "', name='" + this.f14296b + "', packagename='" + this.f14297c + "', progress=" + this.f14298d + ", checkedByUser=" + this.f14299e + ", incomplete=" + this.f14300f + ", size=" + this.f14301g + ", downloadedSize=" + this.f14302h + ", md5='" + this.f14303i + "', versioncode='" + this.f14304j + "', attempts=" + this.f14305k + ", idPrograma=" + this.f14306l + ", downloadAnyway=" + this.f14307m + ", filehash=" + this.f14308n + ", fileId=" + this.f14309o + ", md5signature=" + this.f14310p + ", supportedAbis=" + this.f14311q + ", minsdk=" + this.f14312r + ", urlIcon=" + this.f14313s + ", absolutePath=" + this.f14316v + ", appName=" + this.f14314t + ", versioncodeFile=" + this.f14317w + ", versioncodeInstalled=" + this.f14318x + '}';
    }

    public final long u() {
        return this.f14302h;
    }

    public final void u0(Context context, long j8) {
        AbstractC3255y.i(context, "context");
        if (this.f14301g != j8) {
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            this.f14301g = j8;
            a8.s1(this);
            a8.l();
        }
    }

    public final File v(Context context) {
        AbstractC3255y.i(context, "context");
        if (this.f14316v != null) {
            String str = this.f14316v;
            AbstractC3255y.f(str);
            File file = new File(str);
            if (file.exists()) {
                return file;
            }
        }
        if (this.f14296b == null) {
            return null;
        }
        File f8 = new C3677q().f(context);
        String str2 = this.f14296b;
        AbstractC3255y.f(str2);
        File file2 = new File(f8, str2);
        if (!file2.exists()) {
            return null;
        }
        return file2;
    }

    public final void v0(long j8) {
        this.f14302h = j8;
    }

    public final String w() {
        return this.f14309o;
    }

    public final void w0(String str) {
        this.f14309o = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeInt(this.f14295a);
        parcel.writeString(this.f14296b);
        parcel.writeString(this.f14297c);
        parcel.writeInt(this.f14298d);
        parcel.writeInt(this.f14299e);
        parcel.writeInt(this.f14300f);
        parcel.writeLong(this.f14301g);
        parcel.writeLong(this.f14302h);
        parcel.writeString(this.f14303i);
        parcel.writeLong(this.f14304j);
        parcel.writeInt(this.f14305k);
        parcel.writeLong(this.f14306l);
        parcel.writeInt(this.f14307m);
        parcel.writeString(this.f14308n);
        parcel.writeString(this.f14309o);
        parcel.writeString(this.f14310p);
        parcel.writeString(this.f14311q);
        parcel.writeInt(this.f14312r);
        parcel.writeString(this.f14313s);
        parcel.writeString(this.f14314t);
    }

    public final String x() {
        return this.f14308n;
    }

    public final void x0(String str) {
        this.f14308n = str;
    }

    public final int y() {
        return this.f14295a;
    }

    public final void y0(int i8) {
        this.f14295a = i8;
    }

    public final int z() {
        return this.f14300f;
    }

    public final void z0(int i8) {
        this.f14300f = i8;
    }

    public C1648o(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14295a = -1;
        this.f14300f = 1;
        this.f14304j = -1L;
        this.f14306l = -1L;
        this.f14317w = -1L;
        this.f14318x = -1L;
        this.f14295a = source.readInt();
        this.f14296b = source.readString();
        this.f14297c = source.readString();
        this.f14298d = source.readInt();
        this.f14299e = source.readInt();
        this.f14300f = source.readInt();
        this.f14301g = source.readLong();
        this.f14302h = source.readLong();
        this.f14303i = source.readString();
        this.f14304j = source.readLong();
        this.f14305k = source.readInt();
        this.f14306l = source.readLong();
        this.f14307m = source.readInt();
        this.f14308n = source.readString();
        this.f14309o = source.readString();
        this.f14310p = source.readString();
        this.f14311q = source.readString();
        this.f14312r = source.readInt();
        this.f14313s = source.readString();
        this.f14314t = source.readString();
    }
}
