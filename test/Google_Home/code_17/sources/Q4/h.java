package Q4;

import O5.I;
import a6.InterfaceC1668n;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.os.Build;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3389x;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9175d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC3389x f9176e;

    /* renamed from: f, reason: collision with root package name */
    private static InterfaceC3389x f9177f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9178a;

    /* renamed from: b, reason: collision with root package name */
    private final M4.h f9179b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9180c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final InterfaceC3389x a() {
            return h.f9176e;
        }

        public final InterfaceC3389x b() {
            return h.f9177f;
        }

        public final void c(InterfaceC3389x interfaceC3389x) {
            h.f9176e = interfaceC3389x;
        }

        public final void d(InterfaceC3389x interfaceC3389x) {
            h.f9177f = interfaceC3389x;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9181a;

        /* renamed from: b, reason: collision with root package name */
        Object f9182b;

        /* renamed from: c, reason: collision with root package name */
        Object f9183c;

        /* renamed from: d, reason: collision with root package name */
        int f9184d;

        /* renamed from: e, reason: collision with root package name */
        int f9185e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f9187g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9188a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9189b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f9190c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, String str, S5.d dVar) {
                super(2, dVar);
                this.f9189b = hVar;
                this.f9190c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9189b, this.f9190c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9188a == 0) {
                    O5.t.b(obj);
                    M4.h r8 = this.f9189b.r();
                    if (r8 != null) {
                        r8.b(this.f9190c);
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
        /* renamed from: Q4.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0183b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9191a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9192b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f9193c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0183b(h hVar, String str, S5.d dVar) {
                super(2, dVar);
                this.f9192b = hVar;
                this.f9193c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0183b(this.f9192b, this.f9193c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9191a == 0) {
                    O5.t.b(obj);
                    M4.h r8 = this.f9192b.r();
                    if (r8 != null) {
                        r8.b(this.f9193c);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0183b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f9187g = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f9187g, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0386, code lost:
        
            if (r0 == null) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0388, code lost:
        
            r0.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x03cd, code lost:
        
            return O5.I.f8278a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x03c8, code lost:
        
            if (r0 == null) goto L148;
         */
        /* JADX WARN: Removed duplicated region for block: B:129:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02f7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0346  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x03bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x03be  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x037b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x037c  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01f2 A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01fe A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0214 A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x021d A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0222 A[Catch: all -> 0x013c, Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, all -> 0x013c, blocks: (B:68:0x00be, B:71:0x00ca, B:73:0x00d9, B:75:0x00f7, B:76:0x01e6, B:78:0x01f2, B:80:0x01f6, B:82:0x01fe, B:83:0x020c, B:85:0x0214, B:86:0x0217, B:88:0x021d, B:90:0x0222, B:91:0x0225, B:141:0x014a, B:142:0x0150, B:144:0x0156, B:147:0x015e, B:150:0x017b, B:153:0x0186, B:154:0x01c4, B:156:0x01ca, B:158:0x01dc), top: B:67:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0244 A[Catch: all -> 0x0280, Exception -> 0x0287, TRY_LEAVE, TryCatch #13 {Exception -> 0x0287, all -> 0x0280, blocks: (B:93:0x0232, B:94:0x023e, B:96:0x0244, B:106:0x027c, B:124:0x029b, B:125:0x029e, B:127:0x029f, B:130:0x02b7, B:98:0x0255, B:105:0x0279, B:115:0x0294, B:116:0x0297, B:100:0x025d, B:102:0x0261, B:103:0x026d, B:111:0x0291, B:120:0x0298), top: B:92:0x0232, inners: #5, #7 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 984
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9194a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f9196c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f9196c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f9196c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f9194a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                h hVar = h.this;
                ArrayList arrayList = this.f9196c;
                this.f9194a = 1;
                if (hVar.w(arrayList, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public h(Context context, M4.h hVar) {
        AbstractC3255y.i(context, "context");
        this.f9178a = context;
        this.f9179b = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(PackageInstaller packageInstaller) {
        Iterator<PackageInstaller.SessionInfo> it = packageInstaller.getMySessions().iterator();
        while (it.hasNext()) {
            try {
                packageInstaller.abandonSession(it.next().getSessionId());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i8, PackageInstaller packageInstaller) {
        try {
            packageInstaller.abandonSession(i8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(int i8, PackageInstaller.Session session, int i9) {
        if (i8 == 0) {
            String string = this.f9178a.getString(H4.h.f3758G, "102");
            AbstractC3255y.h(string, "context.getString(R.stri…RROR_CODE_CREATE_SESSION)");
            return string;
        }
        if (session == null) {
            String string2 = this.f9178a.getString(H4.h.f3758G, "103");
            AbstractC3255y.h(string2, "context.getString(R.stri….ERROR_CODE_OPEN_SESSION)");
            return string2;
        }
        if (i9 == 0) {
            String string3 = this.f9178a.getString(H4.h.f3769R);
            AbstractC3255y.h(string3, "context.getString(R.stri…n_status_failure_storage)");
            return string3;
        }
        if (i9 == 1) {
            String string4 = this.f9178a.getString(H4.h.f3758G, "105");
            AbstractC3255y.h(string4, "context.getString(R.stri….ERROR_CODE_FSYNC_FAILED)");
            return string4;
        }
        if (i9 == 2) {
            String string5 = this.f9178a.getString(H4.h.f3758G, "106");
            AbstractC3255y.h(string5, "context.getString(R.stri…ROR_CODE_CALLBACK_INTENT)");
            return string5;
        }
        if (i9 == 3) {
            String string6 = this.f9178a.getString(H4.h.f3758G, "107");
            AbstractC3255y.h(string6, "context.getString(R.stri…NDING_INTENT_GET_SERVICE)");
            return string6;
        }
        if (i9 == 4) {
            String string7 = this.f9178a.getString(H4.h.f3758G, "108");
            AbstractC3255y.h(string7, "context.getString(R.stri…RROR_CODE_SESSION_COMMIT)");
            return string7;
        }
        String string8 = this.f9178a.getString(H4.h.f3758G, "101");
        AbstractC3255y.h(string8, "context.getString(R.stri…re, Const.ERROR_CODE_101)");
        return string8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream q(Object obj) {
        if (obj instanceof File) {
            return new FileInputStream((File) obj);
        }
        if (obj instanceof DocumentFile) {
            ContentResolver contentResolver = this.f9178a.getContentResolver();
            if (contentResolver != null) {
                return contentResolver.openInputStream(((DocumentFile) obj).getUri());
            }
            return null;
        }
        throw new Exception("getInputStream: Illegal parameter type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutputStream s(PackageInstaller.Session session, Object obj) {
        String name;
        long length;
        if (obj instanceof File) {
            File file = (File) obj;
            name = file.getName();
            AbstractC3255y.h(name, "any.name");
            length = file.length();
        } else if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.getName() != null) {
                name = documentFile.getName();
                AbstractC3255y.f(name);
                length = documentFile.length();
            } else {
                throw new Exception("getOutputStream: DocumentFile name is null");
            }
        } else {
            throw new Exception("getOutputStream: Illegal parameter type");
        }
        OutputStream openWrite = session.openWrite(name, 0L, length);
        AbstractC3255y.h(openWrite, "session.openWrite(name, 0, length)");
        return openWrite;
    }

    public static /* synthetic */ void u(h hVar, File file, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        hVar.t(file, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(ArrayList arrayList, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new b(arrayList, null), dVar);
    }

    private final void x(ArrayList arrayList) {
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new c(arrayList, null), 3, null);
    }

    public final Context o() {
        return this.f9178a;
    }

    public final M4.h r() {
        return this.f9179b;
    }

    public final void t(File apk, boolean z8) {
        AbstractC3255y.i(apk, "apk");
        this.f9180c = z8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(apk);
        x(arrayList);
    }

    public final void v(ArrayList apks, boolean z8) {
        AbstractC3255y.i(apks, "apks");
        this.f9180c = z8;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(apks);
        x(arrayList);
    }

    public final boolean y(int i8) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31) {
            return false;
        }
        if (i9 == 31 && i8 >= 29) {
            return true;
        }
        if (i9 == 32 && i8 >= 29) {
            return true;
        }
        if (i9 == 33 && i8 >= 30) {
            return true;
        }
        if (i9 < 34 || i8 < 31) {
            return false;
        }
        return true;
    }
}
