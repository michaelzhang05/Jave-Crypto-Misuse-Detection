package Q4;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9241b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f9242a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(String filename) {
            AbstractC3255y.i(filename, "filename");
            if (!j6.n.r(filename, ".xapk", false, 2, null) && !j6.n.r(filename, ".apks", false, 2, null) && !j6.n.r(filename, ".apkm", false, 2, null)) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9243a;

        /* renamed from: b, reason: collision with root package name */
        int f9244b;

        /* renamed from: c, reason: collision with root package name */
        int f9245c;

        /* renamed from: d, reason: collision with root package name */
        int f9246d;

        /* renamed from: e, reason: collision with root package name */
        Object f9247e;

        /* renamed from: f, reason: collision with root package name */
        Object f9248f;

        /* renamed from: g, reason: collision with root package name */
        Object f9249g;

        /* renamed from: h, reason: collision with root package name */
        Object f9250h;

        /* renamed from: i, reason: collision with root package name */
        Object f9251i;

        /* renamed from: j, reason: collision with root package name */
        Object f9252j;

        /* renamed from: k, reason: collision with root package name */
        Object f9253k;

        /* renamed from: l, reason: collision with root package name */
        Object f9254l;

        /* renamed from: m, reason: collision with root package name */
        Object f9255m;

        /* renamed from: n, reason: collision with root package name */
        long f9256n;

        /* renamed from: o, reason: collision with root package name */
        int f9257o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ File f9258p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w f9259q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ File f9260r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ M4.m f9261s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9262a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9263b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M4.m mVar, S5.d dVar) {
                super(2, dVar);
                this.f9263b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9263b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9262a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9263b;
                    if (mVar != null) {
                        mVar.i();
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q4.w$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0187b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9264a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9265b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0187b(M4.m mVar, S5.d dVar) {
                super(2, dVar);
                this.f9265b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0187b(this.f9265b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9264a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9265b;
                    if (mVar != null) {
                        mVar.g();
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0187b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9266a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9267b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9268c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M4.m mVar, T t8, S5.d dVar) {
                super(2, dVar);
                this.f9267b = mVar;
                this.f9268c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f9267b, this.f9268c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9266a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9267b;
                    if (mVar != null) {
                        mVar.e((File) this.f9268c.f34162a);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9269a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9270b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f9271c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(M4.m mVar, int i8, S5.d dVar) {
                super(2, dVar);
                this.f9270b = mVar;
                this.f9271c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f9270b, this.f9271c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9269a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9270b;
                    if (mVar != null) {
                        mVar.c(this.f9271c);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9272a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9273b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(M4.m mVar, S5.d dVar) {
                super(2, dVar);
                this.f9273b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f9273b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9272a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9273b;
                    if (mVar != null) {
                        mVar.c(100);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9275b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9276c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(M4.m mVar, T t8, S5.d dVar) {
                super(2, dVar);
                this.f9275b = mVar;
                this.f9276c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new f(this.f9275b, this.f9276c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9274a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9275b;
                    if (mVar != null) {
                        mVar.d((File) this.f9276c.f34162a);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9277a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9278b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(M4.m mVar, S5.d dVar) {
                super(2, dVar);
                this.f9278b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new g(this.f9278b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9277a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9278b;
                    if (mVar != null) {
                        mVar.f();
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File[] f9280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ M4.m f9281c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f9282d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(File[] fileArr, M4.m mVar, File file, S5.d dVar) {
                super(2, dVar);
                this.f9280b = fileArr;
                this.f9281c = mVar;
                this.f9282d = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new h(this.f9280b, this.f9281c, this.f9282d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9279a == 0) {
                    O5.t.b(obj);
                    File[] fileArr = this.f9280b;
                    if (fileArr.length == 1) {
                        M4.m mVar = this.f9281c;
                        if (mVar == null) {
                            return null;
                        }
                        File file = fileArr[0];
                        AbstractC3255y.h(file, "tmp[0]");
                        mVar.b(file);
                        return I.f8278a;
                    }
                    ArrayList arrayList = new ArrayList();
                    File[] tmp = this.f9280b;
                    AbstractC3255y.h(tmp, "tmp");
                    AbstractC1378t.E(arrayList, tmp);
                    M4.m mVar2 = this.f9281c;
                    if (mVar2 == null) {
                        return null;
                    }
                    mVar2.a(this.f9282d, arrayList);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9283a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.m f9284b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(M4.m mVar, S5.d dVar) {
                super(2, dVar);
                this.f9284b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new i(this.f9284b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9283a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f9284b;
                    if (mVar != null) {
                        mVar.i();
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, w wVar, File file2, M4.m mVar, S5.d dVar) {
            super(2, dVar);
            this.f9258p = file;
            this.f9259q = wVar;
            this.f9260r = file2;
            this.f9261s = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f9258p, this.f9259q, this.f9260r, this.f9261s, dVar);
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
            throw new UnsupportedOperationException("Method not decompiled: Q4.w.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    private final boolean h(File file, File file2) {
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String entryName = nextElement.getName();
                AbstractC3255y.h(entryName, "entryName");
                if (j6.n.r(entryName, ".apk", false, 2, null)) {
                    if (nextElement.getSize() >= file2.getUsableSpace()) {
                        return false;
                    }
                    File file3 = new File(file2, entryName);
                    InputStream inputStream = zipFile.getInputStream(nextElement);
                    AbstractC3255y.h(inputStream, "zipFile.getInputStream(element)");
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
        this.f9242a = true;
    }

    public final boolean c(File file) {
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(file).entries();
            while (entries.hasMoreElements()) {
                String entryName = entries.nextElement().getName();
                AbstractC3255y.h(entryName, "entryName");
                if (j6.n.r(entryName, ".obb", false, 2, null)) {
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
        AbstractC3255y.i(xapkFile, "xapkFile");
        AbstractC3255y.i(context, "context");
        Drawable drawable = (Drawable) t.f9230a.a().get(xapkFile.getName());
        if (drawable == null) {
            File g8 = new f().g(context);
            String name = xapkFile.getName();
            AbstractC3255y.h(name, "xapkFile.name");
            String name2 = xapkFile.getName();
            AbstractC3255y.h(name2, "xapkFile.name");
            int i8 = 0;
            String substring = name.substring(0, j6.n.X(name2, ".", 0, false, 6, null));
            AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
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
                            AbstractC3255y.h(absolutePath, "item.absolutePath");
                            Drawable h8 = fVar.h(context, absolutePath);
                            HashMap a8 = t.f9230a.a();
                            String name3 = xapkFile.getName();
                            AbstractC3255y.h(name3, "xapkFile.name");
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

    public final N4.f e(File xapkFile, Context context) {
        boolean z8;
        N4.f fVar;
        AbstractC3255y.i(xapkFile, "xapkFile");
        AbstractC3255y.i(context, "context");
        File g8 = new f().g(context);
        String name = xapkFile.getName();
        AbstractC3255y.h(name, "xapkFile.name");
        String name2 = xapkFile.getName();
        AbstractC3255y.h(name2, "xapkFile.name");
        String substring = name.substring(0, j6.n.X(name2, ".", 0, false, 6, null));
        AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        File file = new File(g8, substring);
        if (!file.exists()) {
            file.mkdirs();
        }
        N4.f fVar2 = null;
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
                        AbstractC3255y.h(pm, "pm");
                        String absolutePath = file2.getAbsolutePath();
                        AbstractC3255y.h(absolutePath, "item.absolutePath");
                        PackageInfo c8 = q.c(pm, absolutePath, 128);
                        if (c8 != null) {
                            try {
                                long m8 = new f().m(c8);
                                String str = c8.packageName;
                                AbstractC3255y.h(str, "pi.packageName");
                                fVar = new N4.f(str, m8);
                            } catch (Exception e8) {
                                e = e8;
                            }
                            try {
                                t tVar = t.f9230a;
                                if (((Drawable) tVar.a().get(xapkFile.getName())) == null) {
                                    f fVar3 = new f();
                                    String absolutePath2 = file2.getAbsolutePath();
                                    AbstractC3255y.h(absolutePath2, "item.absolutePath");
                                    Drawable h8 = fVar3.h(context, absolutePath2);
                                    HashMap a8 = tVar.a();
                                    String name3 = xapkFile.getName();
                                    AbstractC3255y.h(name3, "xapkFile.name");
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
            kotlin.jvm.internal.AbstractC3255y.h(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = ".apk"
            r4 = 2
            r5 = 0
            boolean r2 = j6.n.r(r2, r3, r0, r4, r5)     // Catch: java.lang.Exception -> L2d
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
        throw new UnsupportedOperationException("Method not decompiled: Q4.w.f(java.io.File):boolean");
    }

    public final Object g(File file, File file2, M4.m mVar, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new b(file, this, file2, mVar, null), dVar);
    }
}
