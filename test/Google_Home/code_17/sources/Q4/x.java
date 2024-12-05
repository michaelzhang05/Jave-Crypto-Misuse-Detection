package Q4;

import O5.I;
import a6.InterfaceC1668n;
import android.content.Context;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.S;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9285a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    private int f9286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9287a;

        /* renamed from: b, reason: collision with root package name */
        int f9288b;

        /* renamed from: c, reason: collision with root package name */
        int f9289c;

        /* renamed from: d, reason: collision with root package name */
        int f9290d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9291e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f9292f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f9293g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f9294h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, x xVar, S5.d dVar) {
            super(2, dVar);
            this.f9291e = documentFile;
            this.f9292f = zipOutputStream;
            this.f9293g = context;
            this.f9294h = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f9291e, this.f9292f, this.f9293g, this.f9294h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x00ae -> B:5:0x00b1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r8.f9290d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f9289c
                int r3 = r8.f9288b
                java.lang.Object r4 = r8.f9287a
                androidx.documentfile.provider.DocumentFile[] r4 = (androidx.documentfile.provider.DocumentFile[]) r4
                O5.t.b(r9)
                goto Lb1
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                O5.t.b(r9)
                androidx.documentfile.provider.DocumentFile r9 = r8.f9291e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L7c
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                androidx.documentfile.provider.DocumentFile r0 = r8.f9291e
                java.lang.String r0 = r0.getName()
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f9292f
                r0.putNextEntry(r9)
                android.content.Context r9 = r8.f9293g
                android.content.ContentResolver r9 = r9.getContentResolver()
                r0 = 0
                if (r9 == 0) goto L50
                androidx.documentfile.provider.DocumentFile r2 = r8.f9291e
                android.net.Uri r2 = r2.getUri()
                java.io.InputStream r9 = r9.openInputStream(r2)
                goto L51
            L50:
                r9 = r0
            L51:
                Q4.x r2 = r8.f9294h
                java.util.zip.ZipOutputStream r3 = r8.f9292f
                if (r9 == 0) goto L6b
            L57:
                byte[] r4 = Q4.x.c(r2)     // Catch: java.lang.Throwable -> L69
                int r4 = r9.read(r4)     // Catch: java.lang.Throwable -> L69
                if (r4 <= 0) goto L6b
                byte[] r5 = Q4.x.c(r2)     // Catch: java.lang.Throwable -> L69
                r3.write(r5, r1, r4)     // Catch: java.lang.Throwable -> L69
                goto L57
            L69:
                r0 = move-exception
                goto L76
            L6b:
                O5.I r1 = O5.I.f8278a     // Catch: java.lang.Throwable -> L69
                Y5.b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f9292f
                r9.closeEntry()
                goto Lb3
            L76:
                throw r0     // Catch: java.lang.Throwable -> L77
            L77:
                r1 = move-exception
                Y5.b.a(r9, r0)
                throw r1
            L7c:
                androidx.documentfile.provider.DocumentFile r9 = r8.f9291e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb3
                androidx.documentfile.provider.DocumentFile r9 = r8.f9291e
                androidx.documentfile.provider.DocumentFile[] r9 = r9.listFiles()
                java.lang.String r3 = "sourceFile.listFiles()"
                kotlin.jvm.internal.AbstractC3255y.h(r9, r3)
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L93:
                if (r3 >= r1) goto Lb3
                r9 = r4[r3]
                Q4.x r5 = r8.f9294h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3255y.h(r9, r6)
                java.util.zip.ZipOutputStream r6 = r8.f9292f
                android.content.Context r7 = r8.f9293g
                r8.f9287a = r4
                r8.f9288b = r3
                r8.f9289c = r1
                r8.f9290d = r2
                java.lang.Object r9 = Q4.x.a(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb1
                return r0
            Lb1:
                int r3 = r3 + r2
                goto L93
            Lb3:
                O5.I r9 = O5.I.f8278a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9295a;

        /* renamed from: b, reason: collision with root package name */
        int f9296b;

        /* renamed from: c, reason: collision with root package name */
        int f9297c;

        /* renamed from: d, reason: collision with root package name */
        int f9298d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f9299e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9300f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f9301g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f9302h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, String str, ZipOutputStream zipOutputStream, x xVar, S5.d dVar) {
            super(2, dVar);
            this.f9299e = file;
            this.f9300f = str;
            this.f9301g = zipOutputStream;
            this.f9302h = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f9299e, this.f9300f, this.f9301g, this.f9302h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x00b0 -> B:5:0x00b3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r8.f9298d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f9297c
                int r3 = r8.f9296b
                java.lang.Object r4 = r8.f9295a
                java.io.File[] r4 = (java.io.File[]) r4
                O5.t.b(r9)
                goto Lb3
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                O5.t.b(r9)
                java.io.File r9 = r8.f9299e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L69
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                java.lang.String r0 = r8.f9300f
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f9301g
                r0.putNextEntry(r9)
                java.io.FileInputStream r9 = new java.io.FileInputStream
                java.io.File r0 = r8.f9299e
                r9.<init>(r0)
                Q4.x r0 = r8.f9302h
                java.util.zip.ZipOutputStream r2 = r8.f9301g
            L43:
                byte[] r3 = Q4.x.c(r0)     // Catch: java.lang.Throwable -> L55
                int r3 = r9.read(r3)     // Catch: java.lang.Throwable -> L55
                if (r3 <= 0) goto L57
                byte[] r4 = Q4.x.c(r0)     // Catch: java.lang.Throwable -> L55
                r2.write(r4, r1, r3)     // Catch: java.lang.Throwable -> L55
                goto L43
            L55:
                r0 = move-exception
                goto L63
            L57:
                O5.I r0 = O5.I.f8278a     // Catch: java.lang.Throwable -> L55
                r0 = 0
                Y5.b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f9301g
                r9.closeEntry()
                goto Lb5
            L63:
                throw r0     // Catch: java.lang.Throwable -> L64
            L64:
                r1 = move-exception
                Y5.b.a(r9, r0)
                throw r1
            L69:
                java.io.File r9 = r8.f9299e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb5
                java.io.File r9 = r8.f9299e
                java.io.File[] r9 = r9.listFiles()
                if (r9 == 0) goto Lb5
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L7d:
                if (r3 >= r1) goto Lb5
                r9 = r4[r3]
                Q4.x r5 = r8.f9302h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3255y.h(r9, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r8.f9300f
                r6.append(r7)
                r7 = 47
                r6.append(r7)
                java.lang.String r7 = r9.getName()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.util.zip.ZipOutputStream r7 = r8.f9301g
                r8.f9295a = r4
                r8.f9296b = r3
                r8.f9297c = r1
                r8.f9298d = r2
                java.lang.Object r9 = Q4.x.b(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb3
                return r0
            Lb3:
                int r3 = r3 + r2
                goto L7d
            Lb5:
                O5.I r9 = O5.I.f8278a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9303a;

        /* renamed from: b, reason: collision with root package name */
        Object f9304b;

        /* renamed from: c, reason: collision with root package name */
        Object f9305c;

        /* renamed from: d, reason: collision with root package name */
        int f9306d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f9307e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9308f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ x f9309g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ M4.c f9310h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9311a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.c f9312b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9313c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M4.c cVar, ArrayList arrayList, S5.d dVar) {
                super(2, dVar);
                this.f9312b = cVar;
                this.f9313c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9312b, this.f9313c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9311a == 0) {
                    O5.t.b(obj);
                    this.f9312b.b(String.valueOf(this.f9313c.size()));
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
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9314a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.c f9315b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f9316c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f9317d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9318e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M4.c cVar, x xVar, ArrayList arrayList, String str, S5.d dVar) {
                super(2, dVar);
                this.f9315b = cVar;
                this.f9316c = xVar;
                this.f9317d = arrayList;
                this.f9318e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f9315b, this.f9316c, this.f9317d, this.f9318e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9314a == 0) {
                    O5.t.b(obj);
                    this.f9315b.c((this.f9316c.f9286b * 100) / this.f9317d.size(), this.f9318e);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q4.x$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0188c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9319a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.c f9320b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f9321c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0188c(M4.c cVar, File file, S5.d dVar) {
                super(2, dVar);
                this.f9320b = cVar;
                this.f9321c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0188c(this.f9320b, this.f9321c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9319a == 0) {
                    O5.t.b(obj);
                    M4.c cVar = this.f9320b;
                    String name = this.f9321c.getName();
                    AbstractC3255y.h(name, "destinationZip.name");
                    cVar.a(name);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0188c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, ArrayList arrayList, x xVar, M4.c cVar, S5.d dVar) {
            super(2, dVar);
            this.f9307e = file;
            this.f9308f = arrayList;
            this.f9309g = xVar;
            this.f9310h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f9307e, this.f9308f, this.f9309g, this.f9310h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00fe -> B:14:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9322a;

        /* renamed from: b, reason: collision with root package name */
        Object f9323b;

        /* renamed from: c, reason: collision with root package name */
        Object f9324c;

        /* renamed from: d, reason: collision with root package name */
        int f9325d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f9326e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9327f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f9328g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f9329h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ M4.c f9330i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9331a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.c f9332b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9333c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M4.c cVar, ArrayList arrayList, S5.d dVar) {
                super(2, dVar);
                this.f9332b = cVar;
                this.f9333c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9332b, this.f9333c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9331a == 0) {
                    O5.t.b(obj);
                    this.f9332b.b(String.valueOf(this.f9333c.size()));
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
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9334a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.c f9335b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M4.c cVar, S5.d dVar) {
                super(2, dVar);
                this.f9335b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f9335b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9334a == 0) {
                    O5.t.b(obj);
                    this.f9335b.onError("FileNotFoundException");
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9336a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.c f9337b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f9338c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f9339d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9340e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M4.c cVar, x xVar, ArrayList arrayList, String str, S5.d dVar) {
                super(2, dVar);
                this.f9337b = cVar;
                this.f9338c = xVar;
                this.f9339d = arrayList;
                this.f9340e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f9337b, this.f9338c, this.f9339d, this.f9340e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9336a == 0) {
                    O5.t.b(obj);
                    this.f9337b.c((this.f9338c.f9286b * 100) / this.f9339d.size(), this.f9340e);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q4.x$d$d, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0189d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9341a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.c f9342b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f9343c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0189d(M4.c cVar, DocumentFile documentFile, S5.d dVar) {
                super(2, dVar);
                this.f9342b = cVar;
                this.f9343c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0189d(this.f9342b, this.f9343c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9341a == 0) {
                    O5.t.b(obj);
                    M4.c cVar = this.f9342b;
                    String name = this.f9343c.getName();
                    AbstractC3255y.f(name);
                    cVar.a(name);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0189d) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, DocumentFile documentFile, ArrayList arrayList, x xVar, M4.c cVar, S5.d dVar) {
            super(2, dVar);
            this.f9326e = context;
            this.f9327f = documentFile;
            this.f9328g = arrayList;
            this.f9329h = xVar;
            this.f9330i = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f9326e, this.f9327f, this.f9328g, this.f9329h, this.f9330i, dVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:(1:(1:(1:(3:8|9|10)(2:12|13))(4:14|15|16|(2:18|(1:20)(6:21|22|(1:24)|15|16|(6:25|(1:27)|28|(1:30)|9|10)(0)))(0)))(6:31|22|(0)|15|16|(0)(0)))(5:32|33|34|16|(0)(0)))(1:35))(2:44|(1:46))|36|37|(4:39|34|16|(0)(0))|33|34|16|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
        
            r2 = l6.C3347b0.c();
            r9 = new Q4.x.d.b(r19.f9330i, null);
            r19.f9325d = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
        
            if (l6.AbstractC3360i.g(r2, r9, r19) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0115 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0113 -> B:15:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9344a;

        /* renamed from: b, reason: collision with root package name */
        Object f9345b;

        /* renamed from: c, reason: collision with root package name */
        Object f9346c;

        /* renamed from: d, reason: collision with root package name */
        Object f9347d;

        /* renamed from: e, reason: collision with root package name */
        Object f9348e;

        /* renamed from: f, reason: collision with root package name */
        Object f9349f;

        /* renamed from: g, reason: collision with root package name */
        long f9350g;

        /* renamed from: h, reason: collision with root package name */
        int f9351h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f9352i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f9353j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ x f9354k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ M4.e f9355l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9356a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9357b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9357b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9357b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9356a == 0) {
                    O5.t.b(obj);
                    this.f9357b.c();
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
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9358a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9359b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9360c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M4.e eVar, S s8, S5.d dVar) {
                super(2, dVar);
                this.f9359b = eVar;
                this.f9360c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f9359b, this.f9360c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9358a == 0) {
                    O5.t.b(obj);
                    this.f9359b.d(this.f9360c.f34161a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9361a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9362b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9363c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M4.e eVar, Q q8, S5.d dVar) {
                super(2, dVar);
                this.f9362b = eVar;
                this.f9363c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f9362b, this.f9363c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9361a == 0) {
                    O5.t.b(obj);
                    this.f9362b.b(this.f9363c.f34160a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, File file, x xVar, M4.e eVar, S5.d dVar) {
            super(2, dVar);
            this.f9352i = str;
            this.f9353j = file;
            this.f9354k = xVar;
            this.f9355l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f9352i, this.f9353j, this.f9354k, this.f9355l, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00fc A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0157 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0169 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TRY_LEAVE, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipInputStream] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0136 -> B:19:0x013b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0145 -> B:20:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ca -> B:31:0x015c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00df -> B:21:0x00ee). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9364a;

        /* renamed from: b, reason: collision with root package name */
        Object f9365b;

        /* renamed from: c, reason: collision with root package name */
        Object f9366c;

        /* renamed from: d, reason: collision with root package name */
        Object f9367d;

        /* renamed from: e, reason: collision with root package name */
        Object f9368e;

        /* renamed from: f, reason: collision with root package name */
        Object f9369f;

        /* renamed from: g, reason: collision with root package name */
        Object f9370g;

        /* renamed from: h, reason: collision with root package name */
        int f9371h;

        /* renamed from: i, reason: collision with root package name */
        long f9372i;

        /* renamed from: j, reason: collision with root package name */
        int f9373j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ File f9374k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f9375l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f9376m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ M4.e f9377n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9378a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9379b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9379b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9379b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9378a == 0) {
                    O5.t.b(obj);
                    this.f9379b.c();
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
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9380a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9381b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9381b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f9381b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9380a == 0) {
                    O5.t.b(obj);
                    this.f9381b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9382a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9383b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9383b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f9383b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9382a == 0) {
                    O5.t.b(obj);
                    this.f9383b.a();
                    return I.f8278a;
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
            int f9384a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9385b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9386c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(M4.e eVar, S s8, S5.d dVar) {
                super(2, dVar);
                this.f9385b = eVar;
                this.f9386c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f9385b, this.f9386c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9384a == 0) {
                    O5.t.b(obj);
                    this.f9385b.d(this.f9386c.f34161a);
                    return I.f8278a;
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
            int f9387a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9388b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9389c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(M4.e eVar, Q q8, S5.d dVar) {
                super(2, dVar);
                this.f9388b = eVar;
                this.f9389c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f9388b, this.f9389c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9387a == 0) {
                    O5.t.b(obj);
                    this.f9388b.b(this.f9389c.f34160a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file, Uri uri, Context context, M4.e eVar, S5.d dVar) {
            super(2, dVar);
            this.f9374k = file;
            this.f9375l = uri;
            this.f9376m = context;
            this.f9377n = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f9374k, this.f9375l, this.f9376m, this.f9377n, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15, types: [androidx.documentfile.provider.DocumentFile] */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v19, types: [java.io.OutputStream, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v21, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0243 -> B:15:0x0245). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x024c -> B:16:0x024f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01db -> B:27:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01df -> B:17:0x01f9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 670
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9390a;

        /* renamed from: b, reason: collision with root package name */
        Object f9391b;

        /* renamed from: c, reason: collision with root package name */
        Object f9392c;

        /* renamed from: d, reason: collision with root package name */
        Object f9393d;

        /* renamed from: e, reason: collision with root package name */
        Object f9394e;

        /* renamed from: f, reason: collision with root package name */
        Object f9395f;

        /* renamed from: g, reason: collision with root package name */
        long f9396g;

        /* renamed from: h, reason: collision with root package name */
        int f9397h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f9398i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f9399j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9400k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ x f9401l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ M4.e f9402m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9403a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9404b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9404b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9404b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9403a == 0) {
                    O5.t.b(obj);
                    this.f9404b.c();
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
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9405a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9406b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9407c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M4.e eVar, S s8, S5.d dVar) {
                super(2, dVar);
                this.f9406b = eVar;
                this.f9407c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f9406b, this.f9407c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9405a == 0) {
                    O5.t.b(obj);
                    this.f9406b.d(this.f9407c.f34161a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9410c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M4.e eVar, Q q8, S5.d dVar) {
                super(2, dVar);
                this.f9409b = eVar;
                this.f9410c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f9409b, this.f9410c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9408a == 0) {
                    O5.t.b(obj);
                    this.f9409b.b(this.f9410c.f34160a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Context context, DocumentFile documentFile, x xVar, M4.e eVar, S5.d dVar) {
            super(2, dVar);
            this.f9398i = str;
            this.f9399j = context;
            this.f9400k = documentFile;
            this.f9401l = xVar;
            this.f9402m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f9398i, this.f9399j, this.f9400k, this.f9401l, this.f9402m, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x014a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00fa -> B:13:0x0124). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0121 -> B:14:0x0125). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:23:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c6 -> B:15:0x00dc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f9411a;

        /* renamed from: b, reason: collision with root package name */
        Object f9412b;

        /* renamed from: c, reason: collision with root package name */
        Object f9413c;

        /* renamed from: d, reason: collision with root package name */
        Object f9414d;

        /* renamed from: e, reason: collision with root package name */
        Object f9415e;

        /* renamed from: f, reason: collision with root package name */
        Object f9416f;

        /* renamed from: g, reason: collision with root package name */
        Object f9417g;

        /* renamed from: h, reason: collision with root package name */
        long f9418h;

        /* renamed from: i, reason: collision with root package name */
        int f9419i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f9420j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9421k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f9422l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ M4.e f9423m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9424a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9425b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9425b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f9425b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9424a == 0) {
                    O5.t.b(obj);
                    this.f9425b.c();
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
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f9426a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9427b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9427b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f9427b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9426a == 0) {
                    O5.t.b(obj);
                    this.f9427b.a();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9428a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9429b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M4.e eVar, S5.d dVar) {
                super(2, dVar);
                this.f9429b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f9429b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9428a == 0) {
                    O5.t.b(obj);
                    this.f9429b.a();
                    return I.f8278a;
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
            int f9430a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9431b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9432c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(M4.e eVar, S s8, S5.d dVar) {
                super(2, dVar);
                this.f9431b = eVar;
                this.f9432c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f9431b, this.f9432c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9430a == 0) {
                    O5.t.b(obj);
                    this.f9431b.d(this.f9432c.f34161a);
                    return I.f8278a;
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
            int f9433a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M4.e f9434b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9435c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(M4.e eVar, Q q8, S5.d dVar) {
                super(2, dVar);
                this.f9434b = eVar;
                this.f9435c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f9434b, this.f9435c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f9433a == 0) {
                    O5.t.b(obj);
                    this.f9434b.b(this.f9435c.f34160a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, DocumentFile documentFile, Uri uri, M4.e eVar, S5.d dVar) {
            super(2, dVar);
            this.f9420j = context;
            this.f9421k = documentFile;
            this.f9422l = uri;
            this.f9423m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f9420j, this.f9421k, this.f9422l, this.f9423m, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0300  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0319  */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v2, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v8, types: [java.io.OutputStream, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x02f1 -> B:15:0x02f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x02f5 -> B:16:0x02f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0296 -> B:27:0x030c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x029a -> B:17:0x02ad). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 835
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.x.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new a(documentFile, zipOutputStream, context, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(File file, String str, ZipOutputStream zipOutputStream, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(file, str, zipOutputStream, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final Object h(ArrayList arrayList, DocumentFile documentFile, M4.c cVar, Context context, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(context, documentFile, arrayList, this, cVar, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final Object i(ArrayList arrayList, File file, M4.c cVar, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(file, arrayList, this, cVar, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final Object j(DocumentFile documentFile, Uri uri, M4.e eVar, Context context, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new h(context, documentFile, uri, eVar, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final Object k(DocumentFile documentFile, String str, M4.e eVar, Context context, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new g(str, context, documentFile, this, eVar, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final Object l(File file, Uri uri, M4.e eVar, Context context, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new f(file, uri, context, eVar, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final Object m(File file, String str, M4.e eVar, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(str, file, this, eVar, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
