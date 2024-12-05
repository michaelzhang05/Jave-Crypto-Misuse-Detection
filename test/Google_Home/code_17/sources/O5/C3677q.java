package o5;

import P5.AbstractC1378t;
import a5.C1648o;
import a5.O;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3677q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36527a = new a(null);

    /* renamed from: o5.q$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: o5.q$b */
    /* loaded from: classes5.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }

    private final void l(Context context, File file, File file2) {
        Object obj;
        C3674n a8 = C3674n.f36505t.a(context);
        String name = file.getName();
        AbstractC3255y.h(name, "file.name");
        C1648o Y7 = a8.Y(name);
        if (Y7 != null) {
            Y7.D0(file2.getName());
            Y7.o0(file2.getAbsolutePath());
            a8.s1(Y7);
        }
        Iterator it = a8.v0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((O) obj).l(), file.getName())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        O o8 = (O) obj;
        if (o8 != null) {
            o8.U(file2.getName());
            a8.r1(o8);
        }
        a8.l();
    }

    public final ArrayList a(Context context) {
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        File dirDownloads = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (dirDownloads.exists() && dirDownloads.canRead() && dirDownloads.isDirectory()) {
            Q4.e eVar = new Q4.e();
            AbstractC3255y.h(dirDownloads, "dirDownloads");
            arrayList.addAll(eVar.i(dirDownloads, context));
        }
        return arrayList;
    }

    public final File b(Context context, File file) {
        PackageInfo packageInfo;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(file, "file");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        String name = file.getName();
        AbstractC3255y.h(name, "file.name");
        File file2 = null;
        if (j6.n.r(name, ".apk", false, 2, null)) {
            try {
                PackageManager pm = context.getPackageManager();
                AbstractC3255y.h(pm, "pm");
                String absolutePath = file.getAbsolutePath();
                AbstractC3255y.h(absolutePath, "file.absolutePath");
                packageInfo = Q4.q.c(pm, absolutePath, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
            if (packageInfo == null && (file2 = new C3671k().f(file, context)) != null) {
                l(context, file, file2);
            }
        } else {
            String name2 = file.getName();
            AbstractC3255y.h(name2, "file.name");
            if (j6.n.r(name2, ".xapk", false, 2, null) && (file2 = new C3671k().e(file, context)) != null) {
                l(context, file, file2);
            }
        }
        a8.l();
        return file2;
    }

    public final void c(Context context) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        ArrayList v02 = a8.v0();
        a8.l();
        Iterator it = new C3677q().e(context).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Iterator it2 = v02.iterator();
            while (true) {
                if (it2.hasNext()) {
                    O o8 = (O) it2.next();
                    if (o8.h() != 0 || o8.l() == null || !j6.n.s(o8.l(), file.getName(), true)) {
                    }
                } else {
                    file.delete();
                    break;
                }
            }
        }
    }

    public final ArrayList d(Context context) {
        AbstractC3255y.i(context, "context");
        return new Q4.e().i(f(context), context);
    }

    public final ArrayList e(Context context) {
        AbstractC3255y.i(context, "context");
        return new Q4.e().i(g(context), context);
    }

    public final File f(Context context) {
        AbstractC3255y.i(context, "context");
        return new Q4.f().a(context, "Apps");
    }

    public final File g(Context context) {
        AbstractC3255y.i(context, "context");
        return new Q4.f().a(context, "Updates");
    }

    public final File h(Context context) {
        AbstractC3255y.i(context, "context");
        ArrayList j8 = j(context);
        int size = j8.size();
        if (size != 0) {
            if (size != 1) {
                if (j8.size() > 1) {
                    AbstractC1378t.B(j8, new b());
                }
                return (File) j8.get(0);
            }
            return (File) j8.get(0);
        }
        return null;
    }

    public final String i(String fileNameParam) {
        int X7;
        AbstractC3255y.i(fileNameParam, "fileNameParam");
        String str = "uptodown-";
        if (!j6.n.C(fileNameParam, str, false, 2, null) || j6.n.s0(fileNameParam, new String[]{"-"}, false, 0, 6, null).size() != 2) {
            return null;
        }
        int S8 = j6.n.S(fileNameParam, " ", 0, false, 6, null);
        if (S8 > 0) {
            String substring = fileNameParam.substring(0, S8);
            AbstractC3255y.h(substring, "substring(...)");
            fileNameParam = substring + ".apk";
        }
        if (j6.n.H(fileNameParam, "(", false, 2, null) && j6.n.q(fileNameParam, ").apk", true)) {
            String substring2 = fileNameParam.substring(0, j6.n.S(fileNameParam, "(", 0, false, 6, null));
            AbstractC3255y.h(substring2, "substring(...)");
            String substring3 = substring2.substring(str.length());
            AbstractC3255y.h(substring3, "substring(...)");
            return substring3;
        }
        if (!j6.n.q(fileNameParam, ".apk", true) || (X7 = j6.n.X(fileNameParam, ".apk", 0, false, 6, null)) <= 0 || fileNameParam.length() != X7 + 4) {
            return null;
        }
        String substring4 = fileNameParam.substring(0, X7);
        AbstractC3255y.h(substring4, "substring(...)");
        String substring5 = substring4.substring(str.length());
        AbstractC3255y.h(substring5, "substring(...)");
        return substring5;
    }

    public final ArrayList j(Context context) {
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        PackageManager pm = context.getPackageManager();
        File dirDownloads = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (dirDownloads.exists() && dirDownloads.canRead() && dirDownloads.isDirectory()) {
            Q4.e eVar = new Q4.e();
            AbstractC3255y.h(dirDownloads, "dirDownloads");
            Iterator it = eVar.i(dirDownloads, context).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String name = file.getName();
                AbstractC3255y.h(name, "apk.name");
                if (j6.n.q(name, ".apk", true)) {
                    AbstractC3255y.h(pm, "pm");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3255y.h(absolutePath, "apk.absolutePath");
                    PackageInfo c8 = Q4.q.c(pm, absolutePath, 128);
                    if (c8 != null && c8.packageName.equals(context.getPackageName())) {
                        arrayList.add(file);
                    }
                }
            }
        }
        return arrayList;
    }

    public final long k(Context context, File storageDir) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(storageDir, "storageDir");
        Iterator it = new C3671k().k(context).iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += ((C1648o) it.next()).a0();
        }
        return storageDir.getUsableSpace() - j8;
    }
}
