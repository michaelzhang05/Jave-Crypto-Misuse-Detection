package N4;

import L5.I;
import N4.w;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.widget.Toast;
import androidx.documentfile.provider.DocumentFile;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3141f;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f7202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f7203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, P5.d dVar) {
            super(2, dVar);
            this.f7203b = context;
            this.f7204c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f7203b, this.f7204c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f7202a == 0) {
                L5.t.b(obj);
                Toast.makeText(this.f7203b, this.f7204c, 0).show();
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        int f7205a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7206b;

        /* renamed from: d, reason: collision with root package name */
        int f7208d;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7206b = obj;
            this.f7208d |= Integer.MIN_VALUE;
            return e.this.d(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f7209a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m58invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m58invoke() {
            this.f7209a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(0);
            this.f7210a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m59invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m59invoke() {
            this.f7210a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N4.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0153e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f7211a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f7212b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7213c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7214d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0153e(Context context, String str, Function0 function0, P5.d dVar) {
            super(2, dVar);
            this.f7212b = context;
            this.f7213c = str;
            this.f7214d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0153e(this.f7212b, this.f7213c, this.f7214d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0153e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f7211a == 0) {
                L5.t.b(obj);
                Toast.makeText(this.f7212b, this.f7213c, 0).show();
                this.f7214d.invoke();
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final boolean a(String str) {
        return !g6.n.F(str, "Backups", true);
    }

    private final Object c(Context context, String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new a(context, str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final Object e(Context context, String str, Function0 function0, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new C0153e(context, str, function0, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final ArrayList j(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList b8 = new u().b(context);
        if (b8.size() > 0) {
            Iterator it = b8.iterator();
            while (it.hasNext()) {
                File file = new File(((K4.e) it.next()).b());
                if (file.exists() && file.isDirectory()) {
                    arrayList.addAll(i(file, context));
                }
            }
        } else {
            File rootDir = Environment.getExternalStorageDirectory();
            AbstractC3159y.h(rootDir, "rootDir");
            arrayList.addAll(i(rootDir, context));
        }
        return arrayList;
    }

    private final ArrayList n(ArrayList arrayList, Context context) {
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        AbstractC3159y.h(packageManager, "context.packageManager");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            if (!g6.n.C(name, ".", false, 2, null)) {
                String name2 = file.getName();
                AbstractC3159y.h(name2, "file.name");
                if (g6.n.r(name2, ".apk", false, 2, null)) {
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3159y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = q.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        if (!k(c8)) {
                            arrayList2.add(file);
                        }
                    } else {
                        String name3 = file.getName();
                        AbstractC3159y.h(name3, "file.name");
                        if (!g6.n.C(name3, "split_config", false, 2, null)) {
                            arrayList2.add(file);
                        }
                    }
                } else {
                    w.a aVar = w.f7281b;
                    String name4 = file.getName();
                    AbstractC3159y.h(name4, "file.name");
                    if (aVar.a(name4)) {
                        arrayList2.add(file);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final String b(Object directory) {
        AbstractC3159y.i(directory, "directory");
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
    public final java.lang.Object d(java.lang.Object r11, java.lang.String r12, android.content.Context r13, kotlin.jvm.functions.Function0 r14, P5.d r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.e.d(java.lang.Object, java.lang.String, android.content.Context, kotlin.jvm.functions.Function0, P5.d):java.lang.Object");
    }

    public final long f(String realPath) {
        AbstractC3159y.i(realPath, "realPath");
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
        AbstractC3159y.i(dir, "dir");
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
            Iterator a8 = AbstractC3141f.a(fileArr);
            while (a8.hasNext()) {
                j8 += h((File) a8.next());
            }
            return j8;
        }
        return dir.length();
    }

    public final ArrayList i(File directory, Context context) {
        AbstractC3159y.i(directory, "directory");
        AbstractC3159y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        File[] listFiles = directory.listFiles();
        if (listFiles != null) {
            String packageName = context.getPackageName();
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3159y.h(absolutePath, "file.absolutePath");
                    if (!g6.n.r(absolutePath, "Android/data/" + packageName, false, 2, null)) {
                        String name = file.getName();
                        AbstractC3159y.h(name, "file.name");
                        if (a(name)) {
                            AbstractC3159y.h(file, "file");
                            arrayList.addAll(i(file, context));
                        }
                    }
                } else {
                    String name2 = file.getName();
                    AbstractC3159y.h(name2, "file.name");
                    if (l(name2)) {
                        arrayList.add(file);
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean k(PackageInfo pi) {
        AbstractC3159y.i(pi, "pi");
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
        AbstractC3159y.i(name, "name");
        if ((!g6.n.r(name, ".apk", false, 2, null) && !w.f7281b.a(name)) || g6.n.C(name, ".", false, 2, null)) {
            return false;
        }
        return true;
    }

    public final String m(String fileName) {
        AbstractC3159y.i(fileName, "fileName");
        return new g6.j("[/\\\\:*?\"<>|]").f(fileName, "");
    }

    public final ArrayList o(Context context) {
        AbstractC3159y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j(context));
        return n(arrayList, context);
    }
}
