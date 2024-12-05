package Q4;

import O5.I;
import Q4.w;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.widget.Toast;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3237f;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;

/* loaded from: classes5.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f9163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, S5.d dVar) {
            super(2, dVar);
            this.f9163b = context;
            this.f9164c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f9163b, this.f9164c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f9162a == 0) {
                O5.t.b(obj);
                Toast.makeText(this.f9163b, this.f9164c, 0).show();
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        int f9165a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9166b;

        /* renamed from: d, reason: collision with root package name */
        int f9168d;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9166b = obj;
            this.f9168d |= Integer.MIN_VALUE;
            return e.this.d(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f9169a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f9169a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m63invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m63invoke() {
            this.f9169a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f9170a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(0);
            this.f9170a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m64invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke() {
            this.f9170a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q4.e$e, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0182e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f9172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f9174d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0182e(Context context, String str, Function0 function0, S5.d dVar) {
            super(2, dVar);
            this.f9172b = context;
            this.f9173c = str;
            this.f9174d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0182e(this.f9172b, this.f9173c, this.f9174d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f9171a == 0) {
                O5.t.b(obj);
                Toast.makeText(this.f9172b, this.f9173c, 0).show();
                this.f9174d.invoke();
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0182e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    private final boolean a(String str) {
        return !j6.n.F(str, "Backups", true);
    }

    private final Object c(Context context, String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new a(context, str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final Object e(Context context, String str, Function0 function0, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new C0182e(context, str, function0, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final ArrayList j(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList b8 = new u().b(context);
        if (b8.size() > 0) {
            Iterator it = b8.iterator();
            while (it.hasNext()) {
                File file = new File(((N4.e) it.next()).b());
                if (file.exists() && file.isDirectory()) {
                    arrayList.addAll(i(file, context));
                }
            }
        } else {
            File rootDir = Environment.getExternalStorageDirectory();
            AbstractC3255y.h(rootDir, "rootDir");
            arrayList.addAll(i(rootDir, context));
        }
        return arrayList;
    }

    private final ArrayList n(ArrayList arrayList, Context context) {
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        AbstractC3255y.h(packageManager, "context.packageManager");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            AbstractC3255y.h(name, "file.name");
            if (!j6.n.C(name, ".", false, 2, null)) {
                String name2 = file.getName();
                AbstractC3255y.h(name2, "file.name");
                if (j6.n.r(name2, ".apk", false, 2, null)) {
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3255y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = q.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        if (!k(c8)) {
                            arrayList2.add(file);
                        }
                    } else {
                        String name3 = file.getName();
                        AbstractC3255y.h(name3, "file.name");
                        if (!j6.n.C(name3, "split_config", false, 2, null)) {
                            arrayList2.add(file);
                        }
                    }
                } else {
                    w.a aVar = w.f9241b;
                    String name4 = file.getName();
                    AbstractC3255y.h(name4, "file.name");
                    if (aVar.a(name4)) {
                        arrayList2.add(file);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final String b(Object directory) {
        AbstractC3255y.i(directory, "directory");
        int i8 = 0;
        if (directory instanceof File) {
            File[] listFiles = ((File) directory).listFiles();
            if (listFiles != null) {
                i8 = listFiles.length;
            }
        } else if (directory instanceof DocumentFile) {
            i8 = ((DocumentFile) directory).listFiles().length;
        }
        return String.valueOf(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Object r11, java.lang.String r12, android.content.Context r13, kotlin.jvm.functions.Function0 r14, S5.d r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.e.d(java.lang.Object, java.lang.String, android.content.Context, kotlin.jvm.functions.Function0, S5.d):java.lang.Object");
    }

    public final long f(String realPath) {
        AbstractC3255y.i(realPath, "realPath");
        try {
            return new File(realPath).length();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final String g(long j8) {
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.setTimeInMillis(j8);
        return DateFormat.format("dd MMM yyyy hh:mm", calendar).toString();
    }

    public final long h(File dir) {
        File[] fileArr;
        AbstractC3255y.i(dir, "dir");
        if (dir.isDirectory()) {
            try {
                fileArr = dir.listFiles();
            } catch (SecurityException e8) {
                e8.printStackTrace();
                fileArr = null;
            }
            long j8 = 0;
            if (fileArr == null) {
                return 0L;
            }
            Iterator a8 = AbstractC3237f.a(fileArr);
            while (a8.hasNext()) {
                j8 += h((File) a8.next());
            }
            return j8;
        }
        return dir.length();
    }

    public final ArrayList i(File directory, Context context) {
        AbstractC3255y.i(directory, "directory");
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        File[] listFiles = directory.listFiles();
        if (listFiles != null) {
            String packageName = context.getPackageName();
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3255y.h(absolutePath, "file.absolutePath");
                    if (!j6.n.r(absolutePath, "Android/data/" + packageName, false, 2, null)) {
                        String name = file.getName();
                        AbstractC3255y.h(name, "file.name");
                        if (a(name)) {
                            AbstractC3255y.h(file, "file");
                            arrayList.addAll(i(file, context));
                        }
                    }
                } else {
                    String name2 = file.getName();
                    AbstractC3255y.h(name2, "file.name");
                    if (l(name2)) {
                        arrayList.add(file);
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean k(PackageInfo pi) {
        AbstractC3255y.i(pi, "pi");
        try {
            Bundle bundle = pi.applicationInfo.metaData;
            if (bundle == null || !bundle.containsKey("com.android.vending.splits.required")) {
                return false;
            }
            return pi.applicationInfo.metaData.getBoolean("com.android.vending.splits.required");
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public final boolean l(String name) {
        AbstractC3255y.i(name, "name");
        if ((!j6.n.r(name, ".apk", false, 2, null) && !w.f9241b.a(name)) || j6.n.C(name, ".", false, 2, null)) {
            return false;
        }
        return true;
    }

    public final String m(String fileName) {
        AbstractC3255y.i(fileName, "fileName");
        return new j6.j("[/\\\\:*?\"<>|]").f(fileName, "");
    }

    public final ArrayList o(Context context) {
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j(context));
        return n(arrayList, context);
    }
}
