package N4;

import L5.I;
import M5.AbstractC1246t;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7281b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f7282a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(String filename) {
            AbstractC3159y.i(filename, "filename");
            if (!g6.n.r(filename, ".xapk", false, 2, null) && !g6.n.r(filename, ".apks", false, 2, null) && !g6.n.r(filename, ".apkm", false, 2, null)) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f7283a;

        /* renamed from: b, reason: collision with root package name */
        int f7284b;

        /* renamed from: c, reason: collision with root package name */
        int f7285c;

        /* renamed from: d, reason: collision with root package name */
        int f7286d;

        /* renamed from: e, reason: collision with root package name */
        Object f7287e;

        /* renamed from: f, reason: collision with root package name */
        Object f7288f;

        /* renamed from: g, reason: collision with root package name */
        Object f7289g;

        /* renamed from: h, reason: collision with root package name */
        Object f7290h;

        /* renamed from: i, reason: collision with root package name */
        Object f7291i;

        /* renamed from: j, reason: collision with root package name */
        Object f7292j;

        /* renamed from: k, reason: collision with root package name */
        Object f7293k;

        /* renamed from: l, reason: collision with root package name */
        Object f7294l;

        /* renamed from: m, reason: collision with root package name */
        Object f7295m;

        /* renamed from: n, reason: collision with root package name */
        long f7296n;

        /* renamed from: o, reason: collision with root package name */
        int f7297o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ File f7298p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w f7299q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ File f7300r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ J4.m f7301s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7302a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7303b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.m mVar, P5.d dVar) {
                super(2, dVar);
                this.f7303b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7303b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7302a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7303b;
                    if (mVar != null) {
                        mVar.i();
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.w$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0158b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7304a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7305b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0158b(J4.m mVar, P5.d dVar) {
                super(2, dVar);
                this.f7305b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0158b(this.f7305b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0158b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7304a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7305b;
                    if (mVar != null) {
                        mVar.g();
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7306a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7307b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f7308c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.m mVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f7307b = mVar;
                this.f7308c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7307b, this.f7308c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7306a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7307b;
                    if (mVar != null) {
                        mVar.e((File) this.f7308c.f33761a);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7309a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7310b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f7311c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(J4.m mVar, int i8, P5.d dVar) {
                super(2, dVar);
                this.f7310b = mVar;
                this.f7311c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f7310b, this.f7311c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7309a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7310b;
                    if (mVar != null) {
                        mVar.c(this.f7311c);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7312a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7313b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(J4.m mVar, P5.d dVar) {
                super(2, dVar);
                this.f7313b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f7313b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7312a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7313b;
                    if (mVar != null) {
                        mVar.c(100);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7314a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7315b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f7316c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(J4.m mVar, T t8, P5.d dVar) {
                super(2, dVar);
                this.f7315b = mVar;
                this.f7316c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new f(this.f7315b, this.f7316c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7314a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7315b;
                    if (mVar != null) {
                        mVar.d((File) this.f7316c.f33761a);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7317a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7318b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(J4.m mVar, P5.d dVar) {
                super(2, dVar);
                this.f7318b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new g(this.f7318b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7317a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7318b;
                    if (mVar != null) {
                        mVar.f();
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7319a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File[] f7320b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ J4.m f7321c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f7322d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(File[] fileArr, J4.m mVar, File file, P5.d dVar) {
                super(2, dVar);
                this.f7320b = fileArr;
                this.f7321c = mVar;
                this.f7322d = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new h(this.f7320b, this.f7321c, this.f7322d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7319a == 0) {
                    L5.t.b(obj);
                    File[] fileArr = this.f7320b;
                    if (fileArr.length == 1) {
                        J4.m mVar = this.f7321c;
                        if (mVar == null) {
                            return null;
                        }
                        File file = fileArr[0];
                        AbstractC3159y.h(file, "tmp[0]");
                        mVar.b(file);
                        return I.f6487a;
                    }
                    ArrayList arrayList = new ArrayList();
                    File[] tmp = this.f7320b;
                    AbstractC3159y.h(tmp, "tmp");
                    AbstractC1246t.E(arrayList, tmp);
                    J4.m mVar2 = this.f7321c;
                    if (mVar2 == null) {
                        return null;
                    }
                    mVar2.a(this.f7322d, arrayList);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.m f7324b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(J4.m mVar, P5.d dVar) {
                super(2, dVar);
                this.f7324b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new i(this.f7324b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7323a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f7324b;
                    if (mVar != null) {
                        mVar.i();
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, w wVar, File file2, J4.m mVar, P5.d dVar) {
            super(2, dVar);
            this.f7298p = file;
            this.f7299q = wVar;
            this.f7300r = file2;
            this.f7301s = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f7298p, this.f7299q, this.f7300r, this.f7301s, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:75|76|77|78|79|80|81|(5:83|84|85|86|(2:88|(1:90)))(1:136)|91|20|21|(0)) */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:116:0x04cd  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x04ee  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x052a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x03fb  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0350  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x035d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x013c A[Catch: Exception -> 0x0406, TryCatch #9 {Exception -> 0x0406, blocks: (B:23:0x013c, B:25:0x0144, B:27:0x014a, B:33:0x016c, B:35:0x017a, B:42:0x026c, B:163:0x01cc, B:207:0x012c), top: B:206:0x012c }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0337 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0338  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x03b7 A[Catch: Exception -> 0x03f9, TRY_LEAVE, TryCatch #6 {Exception -> 0x03f9, blocks: (B:70:0x036d, B:81:0x03af, B:83:0x03b7), top: B:69:0x036d }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x043f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0350 -> B:41:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0434 -> B:17:0x0437). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0401 -> B:18:0x03f0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 1350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.w.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final boolean h(File file, File file2) {
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String entryName = nextElement.getName();
                AbstractC3159y.h(entryName, "entryName");
                if (g6.n.r(entryName, ".apk", false, 2, null)) {
                    if (nextElement.getSize() >= file2.getUsableSpace()) {
                        return false;
                    }
                    File file3 = new File(file2, entryName);
                    InputStream inputStream = zipFile.getInputStream(nextElement);
                    AbstractC3159y.h(inputStream, "zipFile.getInputStream(element)");
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            inputStream.close();
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            inputStream.close();
                        }
                        fileOutputStream.close();
                    } finally {
                    }
                }
            }
            return true;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final void b() {
        this.f7282a = true;
    }

    public final boolean c(File file) {
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(file).entries();
            while (entries.hasMoreElements()) {
                String entryName = entries.nextElement().getName();
                AbstractC3159y.h(entryName, "entryName");
                if (g6.n.r(entryName, ".obb", false, 2, null)) {
                    return true;
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return false;
    }

    public final Drawable d(File xapkFile, Context context) {
        boolean z8;
        AbstractC3159y.i(xapkFile, "xapkFile");
        AbstractC3159y.i(context, "context");
        Drawable drawable = (Drawable) t.f7270a.a().get(xapkFile.getName());
        if (drawable == null) {
            File g8 = new f().g(context);
            String name = xapkFile.getName();
            AbstractC3159y.h(name, "xapkFile.name");
            String name2 = xapkFile.getName();
            AbstractC3159y.h(name2, "xapkFile.name");
            int i8 = 0;
            String substring = name.substring(0, g6.n.X(name2, ".", 0, false, 6, null));
            AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            File file = new File(g8, substring);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (h(xapkFile, file)) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (listFiles.length == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        int length = listFiles.length;
                        while (i8 < length) {
                            File file2 = listFiles[i8];
                            f fVar = new f();
                            String absolutePath = file2.getAbsolutePath();
                            AbstractC3159y.h(absolutePath, "item.absolutePath");
                            Drawable h8 = fVar.h(context, absolutePath);
                            HashMap a8 = t.f7270a.a();
                            String name3 = xapkFile.getName();
                            AbstractC3159y.h(name3, "xapkFile.name");
                            a8.put(name3, h8);
                            try {
                                file2.delete();
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                            i8++;
                            drawable = h8;
                        }
                    }
                }
                if (file.exists()) {
                    new g().a(file);
                }
            }
        }
        return drawable;
    }

    public final K4.f e(File xapkFile, Context context) {
        boolean z8;
        K4.f fVar;
        AbstractC3159y.i(xapkFile, "xapkFile");
        AbstractC3159y.i(context, "context");
        File g8 = new f().g(context);
        String name = xapkFile.getName();
        AbstractC3159y.h(name, "xapkFile.name");
        String name2 = xapkFile.getName();
        AbstractC3159y.h(name2, "xapkFile.name");
        String substring = name.substring(0, g6.n.X(name2, ".", 0, false, 6, null));
        AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        File file = new File(g8, substring);
        if (!file.exists()) {
            file.mkdirs();
        }
        K4.f fVar2 = null;
        if (h(xapkFile, file)) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    PackageManager pm = context.getPackageManager();
                    for (File file2 : listFiles) {
                        AbstractC3159y.h(pm, "pm");
                        String absolutePath = file2.getAbsolutePath();
                        AbstractC3159y.h(absolutePath, "item.absolutePath");
                        PackageInfo c8 = q.c(pm, absolutePath, 128);
                        if (c8 != null) {
                            try {
                                long m8 = new f().m(c8);
                                String str = c8.packageName;
                                AbstractC3159y.h(str, "pi.packageName");
                                fVar = new K4.f(str, m8);
                            } catch (Exception e8) {
                                e = e8;
                            }
                            try {
                                t tVar = t.f7270a;
                                if (((Drawable) tVar.a().get(xapkFile.getName())) == null) {
                                    f fVar3 = new f();
                                    String absolutePath2 = file2.getAbsolutePath();
                                    AbstractC3159y.h(absolutePath2, "item.absolutePath");
                                    Drawable h8 = fVar3.h(context, absolutePath2);
                                    HashMap a8 = tVar.a();
                                    String name3 = xapkFile.getName();
                                    AbstractC3159y.h(name3, "xapkFile.name");
                                    a8.put(name3, h8);
                                }
                                fVar2 = fVar;
                            } catch (Exception e9) {
                                e = e9;
                                fVar2 = fVar;
                                e.printStackTrace();
                                file2.delete();
                            }
                        }
                        try {
                            file2.delete();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
            if (file.exists()) {
                new g().a(file);
            }
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.io.File r7) {
        /*
            r6 = this;
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> L2f
            r1.<init>(r7)     // Catch: java.lang.Exception -> L2f
            java.util.Enumeration r7 = r1.entries()     // Catch: java.lang.Exception -> L2f
            r1 = 0
        Lb:
            boolean r2 = r7.hasMoreElements()     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto L34
            java.lang.Object r2 = r7.nextElement()     // Catch: java.lang.Exception -> L2d
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = "entryName"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = ".apk"
            r4 = 2
            r5 = 0
            boolean r2 = g6.n.r(r2, r3, r0, r4, r5)     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto Lb
            int r1 = r1 + 1
            goto Lb
        L2d:
            r7 = move-exception
            goto L31
        L2f:
            r7 = move-exception
            r1 = 0
        L31:
            r7.printStackTrace()
        L34:
            if (r1 <= 0) goto L37
            r0 = 1
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.w.f(java.io.File):boolean");
    }

    public final Object g(File file, File file2, J4.m mVar, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new b(file, this, file2, mVar, null), dVar);
    }
}
