package N4;

import L5.I;
import android.content.Context;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.S;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7325a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    private int f7326b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7327a;

        /* renamed from: b, reason: collision with root package name */
        int f7328b;

        /* renamed from: c, reason: collision with root package name */
        int f7329c;

        /* renamed from: d, reason: collision with root package name */
        int f7330d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7331e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f7332f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f7333g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f7334h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, x xVar, P5.d dVar) {
            super(2, dVar);
            this.f7331e = documentFile;
            this.f7332f = zipOutputStream;
            this.f7333g = context;
            this.f7334h = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f7331e, this.f7332f, this.f7333g, this.f7334h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f7330d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f7329c
                int r3 = r8.f7328b
                java.lang.Object r4 = r8.f7327a
                androidx.documentfile.provider.DocumentFile[] r4 = (androidx.documentfile.provider.DocumentFile[]) r4
                L5.t.b(r9)
                goto Lb1
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                L5.t.b(r9)
                androidx.documentfile.provider.DocumentFile r9 = r8.f7331e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L7c
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                androidx.documentfile.provider.DocumentFile r0 = r8.f7331e
                java.lang.String r0 = r0.getName()
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f7332f
                r0.putNextEntry(r9)
                android.content.Context r9 = r8.f7333g
                android.content.ContentResolver r9 = r9.getContentResolver()
                r0 = 0
                if (r9 == 0) goto L50
                androidx.documentfile.provider.DocumentFile r2 = r8.f7331e
                android.net.Uri r2 = r2.getUri()
                java.io.InputStream r9 = r9.openInputStream(r2)
                goto L51
            L50:
                r9 = r0
            L51:
                N4.x r2 = r8.f7334h
                java.util.zip.ZipOutputStream r3 = r8.f7332f
                if (r9 == 0) goto L6b
            L57:
                byte[] r4 = N4.x.c(r2)     // Catch: java.lang.Throwable -> L69
                int r4 = r9.read(r4)     // Catch: java.lang.Throwable -> L69
                if (r4 <= 0) goto L6b
                byte[] r5 = N4.x.c(r2)     // Catch: java.lang.Throwable -> L69
                r3.write(r5, r1, r4)     // Catch: java.lang.Throwable -> L69
                goto L57
            L69:
                r0 = move-exception
                goto L76
            L6b:
                L5.I r1 = L5.I.f6487a     // Catch: java.lang.Throwable -> L69
                V5.b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f7332f
                r9.closeEntry()
                goto Lb3
            L76:
                throw r0     // Catch: java.lang.Throwable -> L77
            L77:
                r1 = move-exception
                V5.b.a(r9, r0)
                throw r1
            L7c:
                androidx.documentfile.provider.DocumentFile r9 = r8.f7331e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb3
                androidx.documentfile.provider.DocumentFile r9 = r8.f7331e
                androidx.documentfile.provider.DocumentFile[] r9 = r9.listFiles()
                java.lang.String r3 = "sourceFile.listFiles()"
                kotlin.jvm.internal.AbstractC3159y.h(r9, r3)
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L93:
                if (r3 >= r1) goto Lb3
                r9 = r4[r3]
                N4.x r5 = r8.f7334h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3159y.h(r9, r6)
                java.util.zip.ZipOutputStream r6 = r8.f7332f
                android.content.Context r7 = r8.f7333g
                r8.f7327a = r4
                r8.f7328b = r3
                r8.f7329c = r1
                r8.f7330d = r2
                java.lang.Object r9 = N4.x.a(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb1
                return r0
            Lb1:
                int r3 = r3 + r2
                goto L93
            Lb3:
                L5.I r9 = L5.I.f6487a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7335a;

        /* renamed from: b, reason: collision with root package name */
        int f7336b;

        /* renamed from: c, reason: collision with root package name */
        int f7337c;

        /* renamed from: d, reason: collision with root package name */
        int f7338d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f7339e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f7340f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f7341g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f7342h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, String str, ZipOutputStream zipOutputStream, x xVar, P5.d dVar) {
            super(2, dVar);
            this.f7339e = file;
            this.f7340f = str;
            this.f7341g = zipOutputStream;
            this.f7342h = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f7339e, this.f7340f, this.f7341g, this.f7342h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f7338d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f7337c
                int r3 = r8.f7336b
                java.lang.Object r4 = r8.f7335a
                java.io.File[] r4 = (java.io.File[]) r4
                L5.t.b(r9)
                goto Lb3
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                L5.t.b(r9)
                java.io.File r9 = r8.f7339e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L69
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                java.lang.String r0 = r8.f7340f
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f7341g
                r0.putNextEntry(r9)
                java.io.FileInputStream r9 = new java.io.FileInputStream
                java.io.File r0 = r8.f7339e
                r9.<init>(r0)
                N4.x r0 = r8.f7342h
                java.util.zip.ZipOutputStream r2 = r8.f7341g
            L43:
                byte[] r3 = N4.x.c(r0)     // Catch: java.lang.Throwable -> L55
                int r3 = r9.read(r3)     // Catch: java.lang.Throwable -> L55
                if (r3 <= 0) goto L57
                byte[] r4 = N4.x.c(r0)     // Catch: java.lang.Throwable -> L55
                r2.write(r4, r1, r3)     // Catch: java.lang.Throwable -> L55
                goto L43
            L55:
                r0 = move-exception
                goto L63
            L57:
                L5.I r0 = L5.I.f6487a     // Catch: java.lang.Throwable -> L55
                r0 = 0
                V5.b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f7341g
                r9.closeEntry()
                goto Lb5
            L63:
                throw r0     // Catch: java.lang.Throwable -> L64
            L64:
                r1 = move-exception
                V5.b.a(r9, r0)
                throw r1
            L69:
                java.io.File r9 = r8.f7339e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb5
                java.io.File r9 = r8.f7339e
                java.io.File[] r9 = r9.listFiles()
                if (r9 == 0) goto Lb5
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L7d:
                if (r3 >= r1) goto Lb5
                r9 = r4[r3]
                N4.x r5 = r8.f7342h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3159y.h(r9, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r8.f7340f
                r6.append(r7)
                r7 = 47
                r6.append(r7)
                java.lang.String r7 = r9.getName()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.util.zip.ZipOutputStream r7 = r8.f7341g
                r8.f7335a = r4
                r8.f7336b = r3
                r8.f7337c = r1
                r8.f7338d = r2
                java.lang.Object r9 = N4.x.b(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb3
                return r0
            Lb3:
                int r3 = r3 + r2
                goto L7d
            Lb5:
                L5.I r9 = L5.I.f6487a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.x.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7343a;

        /* renamed from: b, reason: collision with root package name */
        Object f7344b;

        /* renamed from: c, reason: collision with root package name */
        Object f7345c;

        /* renamed from: d, reason: collision with root package name */
        int f7346d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f7347e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f7348f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ x f7349g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ J4.c f7350h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7351a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7352b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f7353c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f7352b = cVar;
                this.f7353c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7352b, this.f7353c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7351a == 0) {
                    L5.t.b(obj);
                    this.f7352b.b(String.valueOf(this.f7353c.size()));
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7354a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7355b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f7356c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f7357d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f7358e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.c cVar, x xVar, ArrayList arrayList, String str, P5.d dVar) {
                super(2, dVar);
                this.f7355b = cVar;
                this.f7356c = xVar;
                this.f7357d = arrayList;
                this.f7358e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7355b, this.f7356c, this.f7357d, this.f7358e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7354a == 0) {
                    L5.t.b(obj);
                    this.f7355b.c((this.f7356c.f7326b * 100) / this.f7357d.size(), this.f7358e);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.x$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0159c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7359a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7360b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f7361c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0159c(J4.c cVar, File file, P5.d dVar) {
                super(2, dVar);
                this.f7360b = cVar;
                this.f7361c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0159c(this.f7360b, this.f7361c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0159c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7359a == 0) {
                    L5.t.b(obj);
                    J4.c cVar = this.f7360b;
                    String name = this.f7361c.getName();
                    AbstractC3159y.h(name, "destinationZip.name");
                    cVar.a(name);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, ArrayList arrayList, x xVar, J4.c cVar, P5.d dVar) {
            super(2, dVar);
            this.f7347e = file;
            this.f7348f = arrayList;
            this.f7349g = xVar;
            this.f7350h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f7347e, this.f7348f, this.f7349g, this.f7350h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: N4.x.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7362a;

        /* renamed from: b, reason: collision with root package name */
        Object f7363b;

        /* renamed from: c, reason: collision with root package name */
        Object f7364c;

        /* renamed from: d, reason: collision with root package name */
        int f7365d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f7366e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7367f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f7368g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x f7369h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ J4.c f7370i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7371a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7372b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f7373c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.c cVar, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f7372b = cVar;
                this.f7373c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7372b, this.f7373c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7371a == 0) {
                    L5.t.b(obj);
                    this.f7372b.b(String.valueOf(this.f7373c.size()));
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7374a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7375b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.c cVar, P5.d dVar) {
                super(2, dVar);
                this.f7375b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7375b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7374a == 0) {
                    L5.t.b(obj);
                    this.f7375b.onError("FileNotFoundException");
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7376a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7377b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f7378c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f7379d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f7380e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.c cVar, x xVar, ArrayList arrayList, String str, P5.d dVar) {
                super(2, dVar);
                this.f7377b = cVar;
                this.f7378c = xVar;
                this.f7379d = arrayList;
                this.f7380e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7377b, this.f7378c, this.f7379d, this.f7380e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7376a == 0) {
                    L5.t.b(obj);
                    this.f7377b.c((this.f7378c.f7326b * 100) / this.f7379d.size(), this.f7380e);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.x$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0160d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7381a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.c f7382b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f7383c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0160d(J4.c cVar, DocumentFile documentFile, P5.d dVar) {
                super(2, dVar);
                this.f7382b = cVar;
                this.f7383c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0160d(this.f7382b, this.f7383c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0160d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7381a == 0) {
                    L5.t.b(obj);
                    J4.c cVar = this.f7382b;
                    String name = this.f7383c.getName();
                    AbstractC3159y.f(name);
                    cVar.a(name);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, DocumentFile documentFile, ArrayList arrayList, x xVar, J4.c cVar, P5.d dVar) {
            super(2, dVar);
            this.f7366e = context;
            this.f7367f = documentFile;
            this.f7368g = arrayList;
            this.f7369h = xVar;
            this.f7370i = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f7366e, this.f7367f, this.f7368g, this.f7369h, this.f7370i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:(1:(1:(1:(3:8|9|10)(2:12|13))(4:14|15|16|(2:18|(1:20)(6:21|22|(1:24)|15|16|(6:25|(1:27)|28|(1:30)|9|10)(0)))(0)))(6:31|22|(0)|15|16|(0)(0)))(5:32|33|34|16|(0)(0)))(1:35))(2:44|(1:46))|36|37|(4:39|34|16|(0)(0))|33|34|16|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
        
            r2 = i6.C2812b0.c();
            r9 = new N4.x.d.b(r19.f7370i, null);
            r19.f7365d = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
        
            if (i6.AbstractC2825i.g(r2, r9, r19) == r1) goto L26;
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
            throw new UnsupportedOperationException("Method not decompiled: N4.x.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7384a;

        /* renamed from: b, reason: collision with root package name */
        Object f7385b;

        /* renamed from: c, reason: collision with root package name */
        Object f7386c;

        /* renamed from: d, reason: collision with root package name */
        Object f7387d;

        /* renamed from: e, reason: collision with root package name */
        Object f7388e;

        /* renamed from: f, reason: collision with root package name */
        Object f7389f;

        /* renamed from: g, reason: collision with root package name */
        long f7390g;

        /* renamed from: h, reason: collision with root package name */
        int f7391h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f7392i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f7393j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ x f7394k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ J4.e f7395l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7396a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7397b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7397b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7397b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7396a == 0) {
                    L5.t.b(obj);
                    this.f7397b.c();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7398a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7399b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7400c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7399b = eVar;
                this.f7400c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7399b, this.f7400c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7398a == 0) {
                    L5.t.b(obj);
                    this.f7399b.d(this.f7400c.f33760a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7401a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7402b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7403c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7402b = eVar;
                this.f7403c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7402b, this.f7403c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7401a == 0) {
                    L5.t.b(obj);
                    this.f7402b.b(this.f7403c.f33759a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, File file, x xVar, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7392i = str;
            this.f7393j = file;
            this.f7394k = xVar;
            this.f7395l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f7392i, this.f7393j, this.f7394k, this.f7395l, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: N4.x.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7404a;

        /* renamed from: b, reason: collision with root package name */
        Object f7405b;

        /* renamed from: c, reason: collision with root package name */
        Object f7406c;

        /* renamed from: d, reason: collision with root package name */
        Object f7407d;

        /* renamed from: e, reason: collision with root package name */
        Object f7408e;

        /* renamed from: f, reason: collision with root package name */
        Object f7409f;

        /* renamed from: g, reason: collision with root package name */
        Object f7410g;

        /* renamed from: h, reason: collision with root package name */
        int f7411h;

        /* renamed from: i, reason: collision with root package name */
        long f7412i;

        /* renamed from: j, reason: collision with root package name */
        int f7413j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ File f7414k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f7415l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f7416m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ J4.e f7417n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7418a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7419b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7419b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7419b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7418a == 0) {
                    L5.t.b(obj);
                    this.f7419b.c();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7420a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7421b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7421b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7421b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7420a == 0) {
                    L5.t.b(obj);
                    this.f7421b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7422a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7423b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7423b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7423b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7422a == 0) {
                    L5.t.b(obj);
                    this.f7423b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7424a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7425b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7426c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7425b = eVar;
                this.f7426c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f7425b, this.f7426c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7424a == 0) {
                    L5.t.b(obj);
                    this.f7425b.d(this.f7426c.f33760a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7427a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7428b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7429c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7428b = eVar;
                this.f7429c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f7428b, this.f7429c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7427a == 0) {
                    L5.t.b(obj);
                    this.f7428b.b(this.f7429c.f33759a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file, Uri uri, Context context, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7414k = file;
            this.f7415l = uri;
            this.f7416m = context;
            this.f7417n = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f7414k, this.f7415l, this.f7416m, this.f7417n, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: N4.x.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7430a;

        /* renamed from: b, reason: collision with root package name */
        Object f7431b;

        /* renamed from: c, reason: collision with root package name */
        Object f7432c;

        /* renamed from: d, reason: collision with root package name */
        Object f7433d;

        /* renamed from: e, reason: collision with root package name */
        Object f7434e;

        /* renamed from: f, reason: collision with root package name */
        Object f7435f;

        /* renamed from: g, reason: collision with root package name */
        long f7436g;

        /* renamed from: h, reason: collision with root package name */
        int f7437h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f7438i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f7439j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7440k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ x f7441l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ J4.e f7442m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7443a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7444b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7444b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7444b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7443a == 0) {
                    L5.t.b(obj);
                    this.f7444b.c();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7445a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7446b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7447c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7446b = eVar;
                this.f7447c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7446b, this.f7447c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7445a == 0) {
                    L5.t.b(obj);
                    this.f7446b.d(this.f7447c.f33760a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7448a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7449b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7450c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7449b = eVar;
                this.f7450c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7449b, this.f7450c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7448a == 0) {
                    L5.t.b(obj);
                    this.f7449b.b(this.f7450c.f33759a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Context context, DocumentFile documentFile, x xVar, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7438i = str;
            this.f7439j = context;
            this.f7440k = documentFile;
            this.f7441l = xVar;
            this.f7442m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f7438i, this.f7439j, this.f7440k, this.f7441l, this.f7442m, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: N4.x.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f7451a;

        /* renamed from: b, reason: collision with root package name */
        Object f7452b;

        /* renamed from: c, reason: collision with root package name */
        Object f7453c;

        /* renamed from: d, reason: collision with root package name */
        Object f7454d;

        /* renamed from: e, reason: collision with root package name */
        Object f7455e;

        /* renamed from: f, reason: collision with root package name */
        Object f7456f;

        /* renamed from: g, reason: collision with root package name */
        Object f7457g;

        /* renamed from: h, reason: collision with root package name */
        long f7458h;

        /* renamed from: i, reason: collision with root package name */
        int f7459i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f7460j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f7461k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f7462l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ J4.e f7463m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7464a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7465b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7465b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f7465b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7464a == 0) {
                    L5.t.b(obj);
                    this.f7465b.c();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7466a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7467b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7467b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f7467b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7466a == 0) {
                    L5.t.b(obj);
                    this.f7467b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7468a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7469b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J4.e eVar, P5.d dVar) {
                super(2, dVar);
                this.f7469b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f7469b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7468a == 0) {
                    L5.t.b(obj);
                    this.f7469b.a();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7470a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7471b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f7472c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(J4.e eVar, S s8, P5.d dVar) {
                super(2, dVar);
                this.f7471b = eVar;
                this.f7472c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f7471b, this.f7472c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7470a == 0) {
                    L5.t.b(obj);
                    this.f7471b.d(this.f7472c.f33760a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f7473a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J4.e f7474b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f7475c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(J4.e eVar, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f7474b = eVar;
                this.f7475c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f7474b, this.f7475c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f7473a == 0) {
                    L5.t.b(obj);
                    this.f7474b.b(this.f7475c.f33759a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, DocumentFile documentFile, Uri uri, J4.e eVar, P5.d dVar) {
            super(2, dVar);
            this.f7460j = context;
            this.f7461k = documentFile;
            this.f7462l = uri;
            this.f7463m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f7460j, this.f7461k, this.f7462l, this.f7463m, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: N4.x.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new a(documentFile, zipOutputStream, context, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(File file, String str, ZipOutputStream zipOutputStream, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(file, str, zipOutputStream, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final Object h(ArrayList arrayList, DocumentFile documentFile, J4.c cVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(context, documentFile, arrayList, this, cVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final Object i(ArrayList arrayList, File file, J4.c cVar, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(file, arrayList, this, cVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final Object j(DocumentFile documentFile, Uri uri, J4.e eVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new h(context, documentFile, uri, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final Object k(DocumentFile documentFile, String str, J4.e eVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(str, context, documentFile, this, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final Object l(File file, Uri uri, J4.e eVar, Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new f(file, uri, context, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public final Object m(File file, String str, J4.e eVar, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(str, file, this, eVar, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
