package l5;

import M5.AbstractC1246t;
import X4.C1505o;
import X4.O;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3329q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34526a = new a(null);

    /* renamed from: l5.q$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: l5.q$b */
    /* loaded from: classes5.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }

    private final void l(Context context, File file, File file2) {
        Object obj;
        C3326n a8 = C3326n.f34504t.a(context);
        String name = file.getName();
        AbstractC3159y.h(name, "file.name");
        C1505o Y7 = a8.Y(name);
        if (Y7 != null) {
            Y7.D0(file2.getName());
            Y7.o0(file2.getAbsolutePath());
            a8.s1(Y7);
        }
        Iterator it = a8.v0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((O) obj).j(), file.getName())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        O o8 = (O) obj;
        if (o8 != null) {
            o8.T(file2.getName());
            a8.r1(o8);
        }
        a8.g();
    }

    public final ArrayList a(Context context) {
        AbstractC3159y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        File dirDownloads = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (dirDownloads.exists() && dirDownloads.canRead() && dirDownloads.isDirectory()) {
            N4.e eVar = new N4.e();
            AbstractC3159y.h(dirDownloads, "dirDownloads");
            arrayList.addAll(eVar.i(dirDownloads, context));
        }
        return arrayList;
    }

    public final File b(Context context, File file) {
        PackageInfo packageInfo;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(file, "file");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        String name = file.getName();
        AbstractC3159y.h(name, "file.name");
        File file2 = null;
        if (g6.n.r(name, ".apk", false, 2, null)) {
            try {
                PackageManager pm = context.getPackageManager();
                AbstractC3159y.h(pm, "pm");
                String absolutePath = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath, "file.absolutePath");
                packageInfo = N4.q.c(pm, absolutePath, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
            if (packageInfo == null && (file2 = new C3323k().f(file, context)) != null) {
                l(context, file, file2);
            }
        } else {
            String name2 = file.getName();
            AbstractC3159y.h(name2, "file.name");
            if (g6.n.r(name2, ".xapk", false, 2, null) && (file2 = new C3323k().e(file, context)) != null) {
                l(context, file, file2);
            }
        }
        a8.g();
        return file2;
    }

    public final void c(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        ArrayList v02 = a8.v0();
        a8.g();
        Iterator it = new C3329q().e(context).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Iterator it2 = v02.iterator();
            while (true) {
                if (it2.hasNext()) {
                    O o8 = (O) it2.next();
                    if (o8.f() != 0 || o8.j() == null || !g6.n.s(o8.j(), file.getName(), true)) {
                    }
                } else {
                    file.delete();
                    break;
                }
            }
        }
    }

    public final ArrayList d(Context context) {
        AbstractC3159y.i(context, "context");
        return new N4.e().i(f(context), context);
    }

    public final ArrayList e(Context context) {
        AbstractC3159y.i(context, "context");
        return new N4.e().i(g(context), context);
    }

    public final File f(Context context) {
        AbstractC3159y.i(context, "context");
        return new N4.f().a(context, "Apps");
    }

    public final File g(Context context) {
        AbstractC3159y.i(context, "context");
        return new N4.f().a(context, "Updates");
    }

    public final File h(Context context) {
        AbstractC3159y.i(context, "context");
        ArrayList j8 = j(context);
        int size = j8.size();
        if (size != 0) {
            if (size != 1) {
                if (j8.size() > 1) {
                    AbstractC1246t.B(j8, new b());
                }
                return (File) j8.get(0);
            }
            return (File) j8.get(0);
        }
        return null;
    }

    public final String i(String fileNameParam) {
        int X7;
        AbstractC3159y.i(fileNameParam, "fileNameParam");
        String str = "uptodown-";
        if (!g6.n.C(fileNameParam, str, false, 2, null) || g6.n.s0(fileNameParam, new String[]{"-"}, false, 0, 6, null).size() != 2) {
            return null;
        }
        int S7 = g6.n.S(fileNameParam, " ", 0, false, 6, null);
        if (S7 > 0) {
            String substring = fileNameParam.substring(0, S7);
            AbstractC3159y.h(substring, "substring(...)");
            fileNameParam = substring + ".apk";
        }
        if (g6.n.H(fileNameParam, "(", false, 2, null) && g6.n.q(fileNameParam, ").apk", true)) {
            String substring2 = fileNameParam.substring(0, g6.n.S(fileNameParam, "(", 0, false, 6, null));
            AbstractC3159y.h(substring2, "substring(...)");
            String substring3 = substring2.substring(str.length());
            AbstractC3159y.h(substring3, "substring(...)");
            return substring3;
        }
        if (!g6.n.q(fileNameParam, ".apk", true) || (X7 = g6.n.X(fileNameParam, ".apk", 0, false, 6, null)) <= 0 || fileNameParam.length() != X7 + 4) {
            return null;
        }
        String substring4 = fileNameParam.substring(0, X7);
        AbstractC3159y.h(substring4, "substring(...)");
        String substring5 = substring4.substring(str.length());
        AbstractC3159y.h(substring5, "substring(...)");
        return substring5;
    }

    public final ArrayList j(Context context) {
        AbstractC3159y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        PackageManager pm = context.getPackageManager();
        File dirDownloads = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (dirDownloads.exists() && dirDownloads.canRead() && dirDownloads.isDirectory()) {
            N4.e eVar = new N4.e();
            AbstractC3159y.h(dirDownloads, "dirDownloads");
            Iterator it = eVar.i(dirDownloads, context).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String name = file.getName();
                AbstractC3159y.h(name, "apk.name");
                if (g6.n.q(name, ".apk", true)) {
                    AbstractC3159y.h(pm, "pm");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3159y.h(absolutePath, "apk.absolutePath");
                    PackageInfo c8 = N4.q.c(pm, absolutePath, 128);
                    if (c8 != null && c8.packageName.equals(context.getPackageName())) {
                        arrayList.add(file);
                    }
                }
            }
        }
        return arrayList;
    }

    public final long k(Context context, File storageDir) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(storageDir, "storageDir");
        Iterator it = new C3323k().k(context).iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += ((C1505o) it.next()).a0();
        }
        return storageDir.getUsableSpace() - j8;
    }
}
