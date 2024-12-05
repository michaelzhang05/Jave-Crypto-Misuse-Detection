package a5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3237f;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* renamed from: a5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1639f implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private ArrayList f14129A;

    /* renamed from: B, reason: collision with root package name */
    private ArrayList f14130B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f14131C;

    /* renamed from: a, reason: collision with root package name */
    private long f14132a;

    /* renamed from: b, reason: collision with root package name */
    private String f14133b;

    /* renamed from: c, reason: collision with root package name */
    private String f14134c;

    /* renamed from: d, reason: collision with root package name */
    private long f14135d;

    /* renamed from: e, reason: collision with root package name */
    private String f14136e;

    /* renamed from: f, reason: collision with root package name */
    private String f14137f;

    /* renamed from: g, reason: collision with root package name */
    private c f14138g;

    /* renamed from: h, reason: collision with root package name */
    private int f14139h;

    /* renamed from: i, reason: collision with root package name */
    private int f14140i;

    /* renamed from: j, reason: collision with root package name */
    private String f14141j;

    /* renamed from: k, reason: collision with root package name */
    private int f14142k;

    /* renamed from: l, reason: collision with root package name */
    private int f14143l;

    /* renamed from: m, reason: collision with root package name */
    private String f14144m;

    /* renamed from: n, reason: collision with root package name */
    private int f14145n;

    /* renamed from: o, reason: collision with root package name */
    private long f14146o;

    /* renamed from: p, reason: collision with root package name */
    private long f14147p;

    /* renamed from: q, reason: collision with root package name */
    private int f14148q;

    /* renamed from: r, reason: collision with root package name */
    private String f14149r;

    /* renamed from: s, reason: collision with root package name */
    private long f14150s;

    /* renamed from: t, reason: collision with root package name */
    private String f14151t;

    /* renamed from: u, reason: collision with root package name */
    private int f14152u;

    /* renamed from: v, reason: collision with root package name */
    private C1631C f14153v;

    /* renamed from: w, reason: collision with root package name */
    private String f14154w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14155x;

    /* renamed from: y, reason: collision with root package name */
    private long f14156y;

    /* renamed from: z, reason: collision with root package name */
    private int f14157z;

    /* renamed from: D, reason: collision with root package name */
    public static final b f14128D = new b(null);
    public static Parcelable.Creator<C1639f> CREATOR = new a();

    /* renamed from: a5.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1639f createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new C1639f(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1639f[] newArray(int i8) {
            return new C1639f[i8];
        }
    }

    /* renamed from: a5.f$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: a5.f$c */
    /* loaded from: classes5.dex */
    public enum c {
        OUTDATED,
        UPDATED,
        UNAVAILABLE
    }

    /* renamed from: a5.f$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14162a;

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
            f14162a = iArr;
        }
    }

    public C1639f() {
        this.f14132a = -1L;
        this.f14135d = -1L;
        this.f14138g = c.UPDATED;
    }

    public final void A0(String str) {
        this.f14141j = str;
    }

    public final void B0(String str) {
        this.f14144m = str;
    }

    public final void C0(String str) {
        this.f14133b = str;
    }

    public final void D0(String str) {
        this.f14134c = str;
    }

    public final void E0(C1631C c1631c) {
        this.f14153v = c1631c;
    }

    public final void F0(int i8) {
        this.f14152u = i8;
    }

    public final void G0(String str) {
        this.f14151t = str;
    }

    public final ArrayList H() {
        return this.f14130B;
    }

    public final void H0(boolean z8) {
        this.f14155x = z8;
    }

    public final void I0(long j8) {
        this.f14146o = j8;
    }

    public final String J() {
        return this.f14134c;
    }

    public final void J0(c cVar) {
        AbstractC3255y.i(cVar, "<set-?>");
        this.f14138g = cVar;
    }

    public final void K0(int i8) {
        this.f14139h = i8;
    }

    public final void L0(int i8) {
        this.f14140i = i8;
    }

    public final void M0(String str) {
        this.f14137f = str;
    }

    public final void N0(long j8) {
        this.f14135d = j8;
    }

    public final void O0(String str) {
        this.f14154w = str;
    }

    public final void P0(String str) {
        this.f14136e = str;
    }

    public final C1631C U() {
        return this.f14153v;
    }

    public final int W() {
        return this.f14152u;
    }

    public final String X() {
        return this.f14151t;
    }

    public final boolean Y() {
        return this.f14155x;
    }

    public final long Z() {
        return this.f14146o;
    }

    public final void a(String path, ArrayList appFilesStored, C3674n dbManager, C1639f appStored, ArrayList out) {
        AbstractC3255y.i(path, "path");
        AbstractC3255y.i(appFilesStored, "appFilesStored");
        AbstractC3255y.i(dbManager, "dbManager");
        AbstractC3255y.i(appStored, "appStored");
        AbstractC3255y.i(out, "out");
        r rVar = new r();
        rVar.i(new File(path).length());
        rVar.f(path);
        Iterator it = appFilesStored.iterator();
        int i8 = -1;
        int i9 = 0;
        while (it.hasNext()) {
            int i10 = i9 + 1;
            r rVar2 = (r) it.next();
            if (j6.n.t(rVar2.a(), rVar.a(), false, 2, null) && rVar2.e() == rVar.e()) {
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
            if (dbManager.D0(appStored.f14132a, rVar) >= 0) {
                out.add(rVar);
            }
        } else {
            appFilesStored.remove(i8);
            out.add(rVar);
        }
    }

    public final String a0() {
        return new Q4.g().c(this.f14146o);
    }

    public final long b() {
        return this.f14156y;
    }

    public final ArrayList b0() {
        return this.f14129A;
    }

    public final c c0() {
        return this.f14138g;
    }

    public final int d0() {
        return this.f14143l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e0() {
        return this.f14137f;
    }

    public final long f0() {
        return this.f14135d;
    }

    public final String g() {
        return this.f14149r;
    }

    public final String g0() {
        return this.f14154w;
    }

    public final boolean h() {
        return this.f14131C;
    }

    public final String h0() {
        return this.f14136e;
    }

    public final int i() {
        return this.f14145n;
    }

    public final boolean i0(Context context) {
        AbstractC3255y.i(context, "context");
        if (this.f14134c == null) {
            return false;
        }
        if (n0()) {
            return SettingsPreferences.f30353b.i0(context);
        }
        if (l0()) {
            return SettingsPreferences.f30353b.h0(context);
        }
        return true;
    }

    public final boolean j0() {
        long j8 = this.f14147p;
        long j9 = this.f14150s;
        long currentTimeMillis = System.currentTimeMillis();
        if (j9 != j8 && currentTimeMillis - j8 < 604800000) {
            return true;
        }
        return false;
    }

    public final int k0() {
        return this.f14139h;
    }

    public final int l() {
        return this.f14148q;
    }

    public final boolean l0() {
        if (this.f14139h == 1) {
            return true;
        }
        return false;
    }

    public final int m0() {
        return this.f14140i;
    }

    public final boolean n0() {
        if (this.f14140i == 1) {
            return true;
        }
        return false;
    }

    public final void o0(C3674n dbManager) {
        AbstractC3255y.i(dbManager, "dbManager");
        this.f14130B = new ArrayList();
        Q4.u uVar = new Q4.u();
        String str = this.f14134c;
        AbstractC3255y.f(str);
        ArrayList a8 = uVar.a(str);
        if (!a8.isEmpty()) {
            String str2 = this.f14134c;
            AbstractC3255y.f(str2);
            C1639f S8 = dbManager.S(str2);
            if (S8 != null) {
                ArrayList T8 = dbManager.T(S8.f14132a);
                Iterator it = a8.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.isFile()) {
                        String name = file.getName();
                        AbstractC3255y.h(name, "obbFile.name");
                        if (j6.n.r(name, ".obb", false, 2, null)) {
                            String absolutePath = file.getAbsolutePath();
                            AbstractC3255y.h(absolutePath, "obbFile.absolutePath");
                            ArrayList arrayList = this.f14130B;
                            AbstractC3255y.f(arrayList);
                            a(absolutePath, T8, dbManager, S8, arrayList);
                        }
                    }
                }
            }
        }
    }

    public final long p() {
        return this.f14150s;
    }

    public final void p0(ApplicationInfo applicationInfo, C3674n dbManager) {
        AbstractC3255y.i(applicationInfo, "applicationInfo");
        AbstractC3255y.i(dbManager, "dbManager");
        this.f14129A = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            String str = this.f14134c;
            AbstractC3255y.f(str);
            C1639f S8 = dbManager.S(str);
            if (S8 != null) {
                ArrayList T8 = dbManager.T(S8.f14132a);
                Iterator a8 = AbstractC3237f.a(strArr);
                while (a8.hasNext()) {
                    String splitSourceDir = (String) a8.next();
                    AbstractC3255y.h(splitSourceDir, "splitSourceDir");
                    if (j6.n.r(splitSourceDir, ".apk", false, 2, null)) {
                        ArrayList arrayList = this.f14129A;
                        AbstractC3255y.f(arrayList);
                        a(splitSourceDir, T8, dbManager, S8, arrayList);
                    }
                }
                if (!T8.isEmpty()) {
                    Iterator it = T8.iterator();
                    while (it.hasNext()) {
                        r appfile = (r) it.next();
                        AbstractC3255y.h(appfile, "appfile");
                        dbManager.x(appfile);
                    }
                }
            }
        }
    }

    public final void q0(long j8) {
        this.f14156y = j8;
    }

    public final void r0(String str) {
        this.f14149r = str;
    }

    public final int s() {
        return this.f14157z;
    }

    public final void s0(boolean z8) {
        this.f14131C = z8;
    }

    public final void t0(int i8) {
        this.f14145n = i8;
    }

    public String toString() {
        return "App{id='" + this.f14132a + "', name='" + this.f14133b + "', packagename='" + this.f14134c + "', versionCode='" + this.f14135d + "', versionName='" + this.f14136e + "', urlFicha='" + this.f14137f + "', status=" + this.f14138g + ", isSystemApp=" + this.f14139h + ", isSystemService=" + this.f14140i + ", md5='" + this.f14141j + "', minSdkVersion=" + this.f14142k + ", targetSdkVersion=" + this.f14143l + ", md5signature='" + this.f14144m + "', exclude=" + this.f14145n + ", size=" + this.f14146o + ", lastUpdateTime=" + this.f14147p + ", excludeFromTracking=" + this.f14148q + ", defaultName='" + this.f14149r + "', firstInstallTime=" + this.f14150s + ", sha256=" + this.f14151t + ", versionDetails=" + this.f14154w + ", appID=" + this.f14156y + ", hasOldVersions=" + this.f14157z + '}';
    }

    public final long u() {
        return this.f14132a;
    }

    public final void u0(int i8) {
        this.f14148q = i8;
    }

    public final long v() {
        return this.f14147p;
    }

    public final void v0(boolean z8, boolean z9) {
        if (l0()) {
            if (!z8) {
                this.f14148q = 1;
            } else {
                this.f14148q = 0;
            }
        }
        if (n0()) {
            if (!z9) {
                this.f14148q = 1;
            } else {
                this.f14148q = 0;
            }
        }
    }

    public final String w() {
        return this.f14141j;
    }

    public final void w0(long j8) {
        this.f14150s = j8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeLong(this.f14132a);
        parcel.writeString(this.f14133b);
        parcel.writeString(this.f14134c);
        parcel.writeLong(this.f14135d);
        parcel.writeString(this.f14136e);
        parcel.writeString(this.f14137f);
        int i9 = d.f14162a[this.f14138g.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                parcel.writeInt(2);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f14139h);
        parcel.writeInt(this.f14140i);
        parcel.writeString(this.f14141j);
        parcel.writeInt(this.f14142k);
        parcel.writeInt(this.f14143l);
        parcel.writeString(this.f14144m);
        parcel.writeInt(this.f14145n);
        parcel.writeLong(this.f14146o);
        parcel.writeLong(this.f14147p);
        parcel.writeInt(this.f14148q);
        parcel.writeString(this.f14149r);
        parcel.writeLong(this.f14150s);
        parcel.writeString(this.f14151t);
        parcel.writeInt(this.f14152u);
        parcel.writeString(this.f14154w);
        parcel.writeLong(this.f14156y);
        parcel.writeInt(this.f14157z);
        parcel.writeInt(this.f14131C ? 1 : 0);
    }

    public final String x() {
        return this.f14144m;
    }

    public final void x0(int i8) {
        this.f14157z = i8;
    }

    public final int y() {
        return this.f14142k;
    }

    public final void y0(long j8) {
        this.f14132a = j8;
    }

    public final String z() {
        return this.f14133b;
    }

    public final void z0(long j8) {
        this.f14147p = j8;
    }

    public C1639f(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14132a = -1L;
        this.f14135d = -1L;
        c cVar = c.UPDATED;
        this.f14138g = cVar;
        this.f14132a = source.readLong();
        this.f14133b = source.readString();
        this.f14134c = source.readString();
        this.f14135d = source.readLong();
        this.f14136e = source.readString();
        this.f14137f = source.readString();
        int readInt = source.readInt();
        if (readInt == 0) {
            this.f14138g = c.OUTDATED;
        } else if (readInt != 1) {
            this.f14138g = c.UNAVAILABLE;
        } else {
            this.f14138g = cVar;
        }
        this.f14139h = source.readInt();
        this.f14140i = source.readInt();
        this.f14141j = source.readString();
        this.f14142k = source.readInt();
        this.f14143l = source.readInt();
        this.f14144m = source.readString();
        this.f14145n = source.readInt();
        this.f14146o = source.readLong();
        this.f14147p = source.readLong();
        this.f14148q = source.readInt();
        this.f14149r = source.readString();
        this.f14150s = source.readLong();
        this.f14151t = source.readString();
        this.f14152u = source.readInt();
        this.f14154w = source.readString();
        this.f14156y = source.readLong();
        this.f14157z = source.readInt();
        this.f14131C = source.readInt() == 1;
    }
}
