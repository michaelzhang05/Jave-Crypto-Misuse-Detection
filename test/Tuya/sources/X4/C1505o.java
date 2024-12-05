package X4;

import N4.w;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import l5.C3326n;
import l5.C3329q;
import l5.C3332t;

/* renamed from: X4.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1505o implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private int f12674a;

    /* renamed from: b, reason: collision with root package name */
    private String f12675b;

    /* renamed from: c, reason: collision with root package name */
    private String f12676c;

    /* renamed from: d, reason: collision with root package name */
    private int f12677d;

    /* renamed from: e, reason: collision with root package name */
    private int f12678e;

    /* renamed from: f, reason: collision with root package name */
    private int f12679f;

    /* renamed from: g, reason: collision with root package name */
    private long f12680g;

    /* renamed from: h, reason: collision with root package name */
    private long f12681h;

    /* renamed from: i, reason: collision with root package name */
    private String f12682i;

    /* renamed from: j, reason: collision with root package name */
    private long f12683j;

    /* renamed from: k, reason: collision with root package name */
    private int f12684k;

    /* renamed from: l, reason: collision with root package name */
    private long f12685l;

    /* renamed from: m, reason: collision with root package name */
    private int f12686m;

    /* renamed from: n, reason: collision with root package name */
    private String f12687n;

    /* renamed from: o, reason: collision with root package name */
    private String f12688o;

    /* renamed from: p, reason: collision with root package name */
    private String f12689p;

    /* renamed from: q, reason: collision with root package name */
    private String f12690q;

    /* renamed from: r, reason: collision with root package name */
    private int f12691r;

    /* renamed from: s, reason: collision with root package name */
    private String f12692s;

    /* renamed from: t, reason: collision with root package name */
    private String f12693t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f12694u;

    /* renamed from: v, reason: collision with root package name */
    private String f12695v;

    /* renamed from: w, reason: collision with root package name */
    private long f12696w;

    /* renamed from: x, reason: collision with root package name */
    private long f12697x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f12673y = new b(null);
    public static Parcelable.Creator<C1505o> CREATOR = new a();

    /* renamed from: X4.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1505o createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1505o(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1505o[] newArray(int i8) {
            return new C1505o[i8];
        }
    }

    /* renamed from: X4.o$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final C1505o a(Context context, File file) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(file, "file");
            w.a aVar = N4.w.f7281b;
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            if (aVar.a(name)) {
                C1505o c1505o = new C1505o();
                c1505o.D0(file.getName());
                K4.f e8 = new N4.w().e(file, context);
                c1505o.z0(0);
                c1505o.F0(100);
                c1505o.G0(file.length());
                c1505o.o0(file.getAbsolutePath());
                if (e8 != null) {
                    c1505o.E0(e8.a());
                    c1505o.J0(e8.b());
                }
                return c1505o;
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3159y.h(packageManager, "context.packageManager");
                String absolutePath = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath, "file.absolutePath");
                PackageInfo c8 = N4.q.c(packageManager, absolutePath, 128);
                if (c8 == null) {
                    return null;
                }
                C1505o c1505o2 = new C1505o();
                c1505o2.D0(file.getName());
                c1505o2.E0(c8.packageName);
                c1505o2.J0(new N4.f().m(c8));
                c1505o2.F0(100);
                c1505o2.z0(0);
                c1505o2.G0(file.length());
                c1505o2.o0(file.getAbsolutePath());
                c1505o2.L(context, file);
                return c1505o2;
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1505o() {
        this.f12674a = -1;
        this.f12679f = 1;
        this.f12683j = -1L;
        this.f12685l = -1L;
        this.f12696w = -1L;
        this.f12697x = -1L;
    }

    private final void j0(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String str = this.f12676c;
                AbstractC3159y.f(str);
                packageInfo = N4.q.d(packageManager, str, 0);
            } else {
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f12697x = new N4.f().m(packageInfo);
            }
        } catch (Exception unused) {
        }
    }

    public final void A0(String str) {
        this.f12682i = str;
    }

    public final void B0(String str) {
        this.f12689p = str;
    }

    public final void C0(int i8) {
        this.f12691r = i8;
    }

    public final void D0(String str) {
        this.f12675b = str;
    }

    public final void E0(String str) {
        this.f12676c = str;
    }

    public final void F0(int i8) {
        this.f12677d = i8;
    }

    public final int G() {
        return this.f12674a;
    }

    public final void G0(long j8) {
        this.f12680g = j8;
    }

    public final void H0(String str) {
        this.f12690q = str;
    }

    public final int I() {
        return this.f12679f;
    }

    public final void I0(String str) {
        this.f12692s = str;
    }

    public final void J0(long j8) {
        this.f12683j = j8;
    }

    public final void L(Context context, File file) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(file, "file");
        if (this.f12676c != null) {
            long j8 = this.f12683j;
            if (j8 > 0 && this.f12677d == 100) {
                this.f12696w = j8;
                j0(context);
                return;
            }
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            if (g6.n.r(name, ".apk", false, 2, null) && this.f12677d == 100) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3159y.h(packageManager, "context.packageManager");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3159y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = N4.q.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        this.f12696w = new N4.f().m(c8);
                    }
                    if (c8 != null && g6.n.t(this.f12676c, c8.packageName, false, 2, null)) {
                        j0(context);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final String Q() {
        return this.f12682i;
    }

    public final String T() {
        return this.f12689p;
    }

    public final int V() {
        return this.f12691r;
    }

    public final String X() {
        return this.f12675b;
    }

    public final String Y() {
        return this.f12676c;
    }

    public final int Z() {
        return this.f12677d;
    }

    public final long a0() {
        return this.f12680g;
    }

    public final void b(C1498h appInfo) {
        String W02;
        AbstractC3159y.i(appInfo, "appInfo");
        if (this.f12676c == null) {
            this.f12676c = appInfo.y0();
        }
        if (this.f12683j <= 0) {
            if (appInfo.f1() > 0) {
                this.f12683j = appInfo.f1();
            } else if (appInfo.o0() > 0) {
                this.f12683j = appInfo.o0();
            }
        }
        if (this.f12685l <= 0) {
            this.f12685l = appInfo.i();
        }
        if (!C3332t.f34530a.f()) {
            this.f12686m = 1;
        }
        if (this.f12689p == null) {
            this.f12689p = appInfo.q0();
        }
        if (this.f12692s == null) {
            this.f12692s = appInfo.l0();
        }
        if (this.f12688o == null && appInfo.f0() > 0) {
            this.f12688o = String.valueOf(appInfo.f0());
        }
        if (this.f12680g <= 0 && (W02 = appInfo.W0()) != null && W02.length() != 0) {
            String W03 = appInfo.W0();
            AbstractC3159y.f(W03);
            this.f12680g = Long.parseLong(W03);
        }
        String str = this.f12693t;
        if (str == null || str.length() == 0) {
            this.f12693t = appInfo.s0();
        }
    }

    public final String b0() {
        return this.f12690q;
    }

    public final boolean c(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12675b == null) {
            return false;
        }
        File f8 = new C3329q().f(context);
        String str = this.f12675b;
        AbstractC3159y.f(str);
        if (!new File(f8, str).exists() || this.f12677d != 100) {
            return false;
        }
        return true;
    }

    public final ArrayList c0() {
        return this.f12694u;
    }

    public final String d0() {
        return this.f12692s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12695v;
    }

    public final long e0() {
        return this.f12683j;
    }

    public final long f() {
        return this.f12685l;
    }

    public final long f0() {
        return this.f12696w;
    }

    public final long g0() {
        return this.f12697x;
    }

    public final boolean h0() {
        if (this.f12676c != null && this.f12679f == 1 && this.f12689p != null && this.f12683j > 0 && this.f12684k < 4) {
            return true;
        }
        return false;
    }

    public final String i() {
        return this.f12693t;
    }

    public final boolean i0() {
        K4.a h8 = E4.j.f2274g.h();
        if (this.f12683j > 0 && this.f12676c != null && h8 != null && g6.n.s(h8.b(), this.f12676c, true) && h8.e() == this.f12683j) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f12684k;
    }

    public final int k() {
        return this.f12678e;
    }

    public final void k0(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        this.f12676c = appInfo.y0();
        this.f12685l = appInfo.i();
        this.f12693t = appInfo.s0();
        if (!C3332t.f34530a.f()) {
            this.f12686m = 1;
        }
        if (appInfo.W0() != null) {
            String W02 = appInfo.W0();
            AbstractC3159y.f(W02);
            if (W02.length() > 0) {
                try {
                    String W03 = appInfo.W0();
                    AbstractC3159y.f(W03);
                    this.f12680g = Long.parseLong(W03);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f12689p = appInfo.q0();
        this.f12687n = appInfo.S0();
        this.f12690q = null;
        if (appInfo.X0() != null) {
            ArrayList X02 = appInfo.X0();
            AbstractC3159y.f(X02);
            if (X02.size() > 0) {
                ArrayList X03 = appInfo.X0();
                AbstractC3159y.f(X03);
                int size = X03.size();
                for (int i8 = 0; i8 < size; i8++) {
                    String str = this.f12690q;
                    if (str == null) {
                        ArrayList X04 = appInfo.X0();
                        AbstractC3159y.f(X04);
                        this.f12690q = (String) X04.get(i8);
                    } else {
                        Y y8 = Y.f33766a;
                        ArrayList X05 = appInfo.X0();
                        AbstractC3159y.f(X05);
                        String format = String.format("%s,%s", Arrays.copyOf(new Object[]{str, X05.get(i8)}, 2));
                        AbstractC3159y.h(format, "format(...)");
                        this.f12690q = format;
                    }
                }
            }
        }
        this.f12688o = String.valueOf(appInfo.f0());
        if (appInfo.r0() != null) {
            try {
                String r02 = appInfo.r0();
                AbstractC3159y.f(r02);
                this.f12691r = Integer.parseInt(r02);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        this.f12692s = appInfo.l0();
        this.f12694u = appInfo.Y0();
    }

    public final int l0(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12688o == null) {
            return -1;
        }
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        String str = this.f12688o;
        AbstractC3159y.f(str);
        C1505o Z7 = a8.Z(str);
        if (Z7 == null) {
            Z7 = a8.F0(this);
        }
        a8.g();
        return Z7.f12674a;
    }

    public final int m0(Context context) {
        C1505o c1505o;
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        String str = this.f12675b;
        if (str != null) {
            AbstractC3159y.f(str);
            c1505o = a8.Y(str);
        } else {
            c1505o = null;
        }
        if (c1505o == null) {
            c1505o = a8.F0(this);
        }
        a8.g();
        return c1505o.f12674a;
    }

    public final int n() {
        return this.f12686m;
    }

    public final int n0(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        int x8 = a8.x(this);
        a8.g();
        return x8;
    }

    public final long o() {
        return this.f12681h;
    }

    public final void o0(String str) {
        this.f12695v = str;
    }

    public final void p0(long j8) {
        this.f12685l = j8;
    }

    public final void q0(String str) {
        this.f12693t = str;
    }

    public final void r0(int i8) {
        this.f12684k = i8;
    }

    public final File s(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12695v != null) {
            String str = this.f12695v;
            AbstractC3159y.f(str);
            File file = new File(str);
            if (file.exists()) {
                return file;
            }
        }
        if (this.f12675b == null) {
            return null;
        }
        File f8 = new C3329q().f(context);
        String str2 = this.f12675b;
        AbstractC3159y.f(str2);
        File file2 = new File(f8, str2);
        if (!file2.exists()) {
            return null;
        }
        return file2;
    }

    public final void s0(int i8) {
        this.f12678e = i8;
    }

    public final void t0(int i8) {
        this.f12686m = i8;
    }

    public String toString() {
        return "Download{id='" + this.f12674a + "', name='" + this.f12675b + "', packagename='" + this.f12676c + "', progress=" + this.f12677d + ", checkedByUser=" + this.f12678e + ", incomplete=" + this.f12679f + ", size=" + this.f12680g + ", downloadedSize=" + this.f12681h + ", md5='" + this.f12682i + "', versioncode='" + this.f12683j + "', attempts=" + this.f12684k + ", idPrograma=" + this.f12685l + ", downloadAnyway=" + this.f12686m + ", filehash=" + this.f12687n + ", fileId=" + this.f12688o + ", md5signature=" + this.f12689p + ", supportedAbis=" + this.f12690q + ", minsdk=" + this.f12691r + ", urlIcon=" + this.f12692s + ", absolutePath=" + this.f12695v + ", appName=" + this.f12693t + ", versioncodeFile=" + this.f12696w + ", versioncodeInstalled=" + this.f12697x + '}';
    }

    public final String u() {
        return this.f12688o;
    }

    public final void u0(Context context, long j8) {
        AbstractC3159y.i(context, "context");
        if (this.f12680g != j8) {
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            this.f12680g = j8;
            a8.s1(this);
            a8.g();
        }
    }

    public final void v0(long j8) {
        this.f12681h = j8;
    }

    public final void w0(String str) {
        this.f12688o = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeInt(this.f12674a);
        parcel.writeString(this.f12675b);
        parcel.writeString(this.f12676c);
        parcel.writeInt(this.f12677d);
        parcel.writeInt(this.f12678e);
        parcel.writeInt(this.f12679f);
        parcel.writeLong(this.f12680g);
        parcel.writeLong(this.f12681h);
        parcel.writeString(this.f12682i);
        parcel.writeLong(this.f12683j);
        parcel.writeInt(this.f12684k);
        parcel.writeLong(this.f12685l);
        parcel.writeInt(this.f12686m);
        parcel.writeString(this.f12687n);
        parcel.writeString(this.f12688o);
        parcel.writeString(this.f12689p);
        parcel.writeString(this.f12690q);
        parcel.writeInt(this.f12691r);
        parcel.writeString(this.f12692s);
        parcel.writeString(this.f12693t);
    }

    public final void x0(String str) {
        this.f12687n = str;
    }

    public final void y0(int i8) {
        this.f12674a = i8;
    }

    public final String z() {
        return this.f12687n;
    }

    public final void z0(int i8) {
        this.f12679f = i8;
    }

    public C1505o(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12674a = -1;
        this.f12679f = 1;
        this.f12683j = -1L;
        this.f12685l = -1L;
        this.f12696w = -1L;
        this.f12697x = -1L;
        this.f12674a = source.readInt();
        this.f12675b = source.readString();
        this.f12676c = source.readString();
        this.f12677d = source.readInt();
        this.f12678e = source.readInt();
        this.f12679f = source.readInt();
        this.f12680g = source.readLong();
        this.f12681h = source.readLong();
        this.f12682i = source.readString();
        this.f12683j = source.readLong();
        this.f12684k = source.readInt();
        this.f12685l = source.readLong();
        this.f12686m = source.readInt();
        this.f12687n = source.readString();
        this.f12688o = source.readString();
        this.f12689p = source.readString();
        this.f12690q = source.readString();
        this.f12691r = source.readInt();
        this.f12692s = source.readString();
        this.f12693t = source.readString();
    }
}
