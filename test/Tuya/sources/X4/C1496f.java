package X4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3141f;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* renamed from: X4.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1496f implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private ArrayList f12508A;

    /* renamed from: B, reason: collision with root package name */
    private ArrayList f12509B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f12510C;

    /* renamed from: a, reason: collision with root package name */
    private long f12511a;

    /* renamed from: b, reason: collision with root package name */
    private String f12512b;

    /* renamed from: c, reason: collision with root package name */
    private String f12513c;

    /* renamed from: d, reason: collision with root package name */
    private long f12514d;

    /* renamed from: e, reason: collision with root package name */
    private String f12515e;

    /* renamed from: f, reason: collision with root package name */
    private String f12516f;

    /* renamed from: g, reason: collision with root package name */
    private c f12517g;

    /* renamed from: h, reason: collision with root package name */
    private int f12518h;

    /* renamed from: i, reason: collision with root package name */
    private int f12519i;

    /* renamed from: j, reason: collision with root package name */
    private String f12520j;

    /* renamed from: k, reason: collision with root package name */
    private int f12521k;

    /* renamed from: l, reason: collision with root package name */
    private int f12522l;

    /* renamed from: m, reason: collision with root package name */
    private String f12523m;

    /* renamed from: n, reason: collision with root package name */
    private int f12524n;

    /* renamed from: o, reason: collision with root package name */
    private long f12525o;

    /* renamed from: p, reason: collision with root package name */
    private long f12526p;

    /* renamed from: q, reason: collision with root package name */
    private int f12527q;

    /* renamed from: r, reason: collision with root package name */
    private String f12528r;

    /* renamed from: s, reason: collision with root package name */
    private long f12529s;

    /* renamed from: t, reason: collision with root package name */
    private String f12530t;

    /* renamed from: u, reason: collision with root package name */
    private int f12531u;

    /* renamed from: v, reason: collision with root package name */
    private C f12532v;

    /* renamed from: w, reason: collision with root package name */
    private String f12533w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12534x;

    /* renamed from: y, reason: collision with root package name */
    private long f12535y;

    /* renamed from: z, reason: collision with root package name */
    private int f12536z;

    /* renamed from: D, reason: collision with root package name */
    public static final b f12507D = new b(null);
    public static Parcelable.Creator<C1496f> CREATOR = new a();

    /* renamed from: X4.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1496f createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1496f(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1496f[] newArray(int i8) {
            return new C1496f[i8];
        }
    }

    /* renamed from: X4.f$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: X4.f$c */
    /* loaded from: classes5.dex */
    public enum c {
        OUTDATED,
        UPDATED,
        UNAVAILABLE
    }

    /* renamed from: X4.f$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12541a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.OUTDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12541a = iArr;
        }
    }

    public C1496f() {
        this.f12511a = -1L;
        this.f12514d = -1L;
        this.f12517g = c.UPDATED;
    }

    public final void A0(String str) {
        this.f12520j = str;
    }

    public final void B0(String str) {
        this.f12523m = str;
    }

    public final void C0(String str) {
        this.f12512b = str;
    }

    public final void D0(String str) {
        this.f12513c = str;
    }

    public final void E0(C c8) {
        this.f12532v = c8;
    }

    public final void F0(int i8) {
        this.f12531u = i8;
    }

    public final int G() {
        return this.f12521k;
    }

    public final void G0(String str) {
        this.f12530t = str;
    }

    public final void H0(boolean z8) {
        this.f12534x = z8;
    }

    public final String I() {
        return this.f12512b;
    }

    public final void I0(long j8) {
        this.f12525o = j8;
    }

    public final void J0(c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f12517g = cVar;
    }

    public final void K0(int i8) {
        this.f12518h = i8;
    }

    public final ArrayList L() {
        return this.f12509B;
    }

    public final void L0(int i8) {
        this.f12519i = i8;
    }

    public final void M0(String str) {
        this.f12516f = str;
    }

    public final void N0(long j8) {
        this.f12514d = j8;
    }

    public final void O0(String str) {
        this.f12533w = str;
    }

    public final void P0(String str) {
        this.f12515e = str;
    }

    public final String Q() {
        return this.f12513c;
    }

    public final C T() {
        return this.f12532v;
    }

    public final int V() {
        return this.f12531u;
    }

    public final String X() {
        return this.f12530t;
    }

    public final boolean Y() {
        return this.f12534x;
    }

    public final long Z() {
        return this.f12525o;
    }

    public final String a0() {
        return new N4.g().c(this.f12525o);
    }

    public final void b(String path, ArrayList appFilesStored, C3326n dbManager, C1496f appStored, ArrayList out) {
        AbstractC3159y.i(path, "path");
        AbstractC3159y.i(appFilesStored, "appFilesStored");
        AbstractC3159y.i(dbManager, "dbManager");
        AbstractC3159y.i(appStored, "appStored");
        AbstractC3159y.i(out, "out");
        r rVar = new r();
        rVar.i(new File(path).length());
        rVar.f(path);
        Iterator it = appFilesStored.iterator();
        int i8 = -1;
        int i9 = 0;
        while (it.hasNext()) {
            int i10 = i9 + 1;
            r rVar2 = (r) it.next();
            if (g6.n.t(rVar2.a(), rVar.a(), false, 2, null) && rVar2.e() == rVar.e()) {
                if (rVar2.b() != null) {
                    rVar.g(rVar2.b());
                }
                if (rVar2.d() != null) {
                    rVar.h(rVar2.d());
                }
                i8 = i9;
            }
            i9 = i10;
        }
        if (i8 == -1) {
            if (dbManager.D0(appStored.f12511a, rVar) >= 0) {
                out.add(rVar);
            }
        } else {
            appFilesStored.remove(i8);
            out.add(rVar);
        }
    }

    public final ArrayList b0() {
        return this.f12508A;
    }

    public final long c() {
        return this.f12535y;
    }

    public final c c0() {
        return this.f12517g;
    }

    public final int d0() {
        return this.f12522l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12528r;
    }

    public final String e0() {
        return this.f12516f;
    }

    public final boolean f() {
        return this.f12510C;
    }

    public final long f0() {
        return this.f12514d;
    }

    public final String g0() {
        return this.f12533w;
    }

    public final String h0() {
        return this.f12515e;
    }

    public final int i() {
        return this.f12524n;
    }

    public final boolean i0(Context context) {
        AbstractC3159y.i(context, "context");
        if (this.f12513c == null) {
            return false;
        }
        if (n0()) {
            return SettingsPreferences.f29323b.i0(context);
        }
        if (l0()) {
            return SettingsPreferences.f29323b.h0(context);
        }
        return true;
    }

    public final int j() {
        return this.f12527q;
    }

    public final boolean j0() {
        long j8 = this.f12526p;
        long j9 = this.f12529s;
        long currentTimeMillis = System.currentTimeMillis();
        if (j9 != j8 && currentTimeMillis - j8 < 604800000) {
            return true;
        }
        return false;
    }

    public final long k() {
        return this.f12529s;
    }

    public final int k0() {
        return this.f12518h;
    }

    public final boolean l0() {
        if (this.f12518h == 1) {
            return true;
        }
        return false;
    }

    public final int m0() {
        return this.f12519i;
    }

    public final int n() {
        return this.f12536z;
    }

    public final boolean n0() {
        if (this.f12519i == 1) {
            return true;
        }
        return false;
    }

    public final long o() {
        return this.f12511a;
    }

    public final void o0(C3326n dbManager) {
        AbstractC3159y.i(dbManager, "dbManager");
        this.f12509B = new ArrayList();
        N4.u uVar = new N4.u();
        String str = this.f12513c;
        AbstractC3159y.f(str);
        ArrayList a8 = uVar.a(str);
        if (!a8.isEmpty()) {
            String str2 = this.f12513c;
            AbstractC3159y.f(str2);
            C1496f S7 = dbManager.S(str2);
            if (S7 != null) {
                ArrayList T7 = dbManager.T(S7.f12511a);
                Iterator it = a8.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.isFile()) {
                        String name = file.getName();
                        AbstractC3159y.h(name, "obbFile.name");
                        if (g6.n.r(name, ".obb", false, 2, null)) {
                            String absolutePath = file.getAbsolutePath();
                            AbstractC3159y.h(absolutePath, "obbFile.absolutePath");
                            ArrayList arrayList = this.f12509B;
                            AbstractC3159y.f(arrayList);
                            b(absolutePath, T7, dbManager, S7, arrayList);
                        }
                    }
                }
            }
        }
    }

    public final void p0(ApplicationInfo applicationInfo, C3326n dbManager) {
        AbstractC3159y.i(applicationInfo, "applicationInfo");
        AbstractC3159y.i(dbManager, "dbManager");
        this.f12508A = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            String str = this.f12513c;
            AbstractC3159y.f(str);
            C1496f S7 = dbManager.S(str);
            if (S7 != null) {
                ArrayList T7 = dbManager.T(S7.f12511a);
                Iterator a8 = AbstractC3141f.a(strArr);
                while (a8.hasNext()) {
                    String splitSourceDir = (String) a8.next();
                    AbstractC3159y.h(splitSourceDir, "splitSourceDir");
                    if (g6.n.r(splitSourceDir, ".apk", false, 2, null)) {
                        ArrayList arrayList = this.f12508A;
                        AbstractC3159y.f(arrayList);
                        b(splitSourceDir, T7, dbManager, S7, arrayList);
                    }
                }
                if (!T7.isEmpty()) {
                    Iterator it = T7.iterator();
                    while (it.hasNext()) {
                        r appfile = (r) it.next();
                        AbstractC3159y.h(appfile, "appfile");
                        dbManager.u(appfile);
                    }
                }
            }
        }
    }

    public final void q0(long j8) {
        this.f12535y = j8;
    }

    public final void r0(String str) {
        this.f12528r = str;
    }

    public final long s() {
        return this.f12526p;
    }

    public final void s0(boolean z8) {
        this.f12510C = z8;
    }

    public final void t0(int i8) {
        this.f12524n = i8;
    }

    public String toString() {
        return "App{id='" + this.f12511a + "', name='" + this.f12512b + "', packagename='" + this.f12513c + "', versionCode='" + this.f12514d + "', versionName='" + this.f12515e + "', urlFicha='" + this.f12516f + "', status=" + this.f12517g + ", isSystemApp=" + this.f12518h + ", isSystemService=" + this.f12519i + ", md5='" + this.f12520j + "', minSdkVersion=" + this.f12521k + ", targetSdkVersion=" + this.f12522l + ", md5signature='" + this.f12523m + "', exclude=" + this.f12524n + ", size=" + this.f12525o + ", lastUpdateTime=" + this.f12526p + ", excludeFromTracking=" + this.f12527q + ", defaultName='" + this.f12528r + "', firstInstallTime=" + this.f12529s + ", sha256=" + this.f12530t + ", versionDetails=" + this.f12533w + ", appID=" + this.f12535y + ", hasOldVersions=" + this.f12536z + '}';
    }

    public final String u() {
        return this.f12520j;
    }

    public final void u0(int i8) {
        this.f12527q = i8;
    }

    public final void v0(boolean z8, boolean z9) {
        if (l0()) {
            if (!z8) {
                this.f12527q = 1;
            } else {
                this.f12527q = 0;
            }
        }
        if (n0()) {
            if (!z9) {
                this.f12527q = 1;
            } else {
                this.f12527q = 0;
            }
        }
    }

    public final void w0(long j8) {
        this.f12529s = j8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeLong(this.f12511a);
        parcel.writeString(this.f12512b);
        parcel.writeString(this.f12513c);
        parcel.writeLong(this.f12514d);
        parcel.writeString(this.f12515e);
        parcel.writeString(this.f12516f);
        int i9 = d.f12541a[this.f12517g.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                parcel.writeInt(2);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f12518h);
        parcel.writeInt(this.f12519i);
        parcel.writeString(this.f12520j);
        parcel.writeInt(this.f12521k);
        parcel.writeInt(this.f12522l);
        parcel.writeString(this.f12523m);
        parcel.writeInt(this.f12524n);
        parcel.writeLong(this.f12525o);
        parcel.writeLong(this.f12526p);
        parcel.writeInt(this.f12527q);
        parcel.writeString(this.f12528r);
        parcel.writeLong(this.f12529s);
        parcel.writeString(this.f12530t);
        parcel.writeInt(this.f12531u);
        parcel.writeString(this.f12533w);
        parcel.writeLong(this.f12535y);
        parcel.writeInt(this.f12536z);
        parcel.writeInt(this.f12510C ? 1 : 0);
    }

    public final void x0(int i8) {
        this.f12536z = i8;
    }

    public final void y0(long j8) {
        this.f12511a = j8;
    }

    public final String z() {
        return this.f12523m;
    }

    public final void z0(long j8) {
        this.f12526p = j8;
    }

    public C1496f(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12511a = -1L;
        this.f12514d = -1L;
        c cVar = c.UPDATED;
        this.f12517g = cVar;
        this.f12511a = source.readLong();
        this.f12512b = source.readString();
        this.f12513c = source.readString();
        this.f12514d = source.readLong();
        this.f12515e = source.readString();
        this.f12516f = source.readString();
        int readInt = source.readInt();
        if (readInt == 0) {
            this.f12517g = c.OUTDATED;
        } else if (readInt != 1) {
            this.f12517g = c.UNAVAILABLE;
        } else {
            this.f12517g = cVar;
        }
        this.f12518h = source.readInt();
        this.f12519i = source.readInt();
        this.f12520j = source.readString();
        this.f12521k = source.readInt();
        this.f12522l = source.readInt();
        this.f12523m = source.readString();
        this.f12524n = source.readInt();
        this.f12525o = source.readLong();
        this.f12526p = source.readLong();
        this.f12527q = source.readInt();
        this.f12528r = source.readString();
        this.f12529s = source.readLong();
        this.f12530t = source.readString();
        this.f12531u = source.readInt();
        this.f12533w = source.readString();
        this.f12535y = source.readLong();
        this.f12536z = source.readInt();
        this.f12510C = source.readInt() == 1;
    }
}
