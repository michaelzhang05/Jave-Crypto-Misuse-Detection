package L4;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.content.ContentResolver;
import android.content.Context;
import androidx.documentfile.provider.DocumentFile;
import j6.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f6166a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6167b;

    /* renamed from: c, reason: collision with root package name */
    private final M4.d f6168c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6169d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f6170e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6171a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6171a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f6171a = 1;
                if (bVar.l(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0109b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6173a;

        /* renamed from: b, reason: collision with root package name */
        Object f6174b;

        /* renamed from: c, reason: collision with root package name */
        Object f6175c;

        /* renamed from: d, reason: collision with root package name */
        Object f6176d;

        /* renamed from: e, reason: collision with root package name */
        int f6177e;

        /* renamed from: f, reason: collision with root package name */
        int f6178f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f6179g;

        /* renamed from: i, reason: collision with root package name */
        int f6181i;

        C0109b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6179g = obj;
            this.f6181i |= Integer.MIN_VALUE;
            return b.this.k(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f6182a;

        /* renamed from: b, reason: collision with root package name */
        Object f6183b;

        /* renamed from: c, reason: collision with root package name */
        Object f6184c;

        /* renamed from: d, reason: collision with root package name */
        int f6185d;

        /* renamed from: e, reason: collision with root package name */
        int f6186e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6188a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6189b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f6190c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6191d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj, int i8, S5.d dVar) {
                super(2, dVar);
                this.f6189b = bVar;
                this.f6190c = obj;
                this.f6191d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f6189b, this.f6190c, this.f6191d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6188a == 0) {
                    t.b(obj);
                    M4.d dVar = this.f6189b.f6168c;
                    if (dVar != null) {
                        dVar.f(this.f6190c, this.f6191d);
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
        /* renamed from: L4.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0110b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6192a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f6193b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6194c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0110b(File file, b bVar, S5.d dVar) {
                super(2, dVar);
                this.f6193b = file;
                this.f6194c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0110b(this.f6193b, this.f6194c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                M4.d dVar;
                T5.b.e();
                if (this.f6192a == 0) {
                    t.b(obj);
                    if (this.f6193b != null && (dVar = this.f6194c.f6168c) != null) {
                        dVar.h(this.f6193b);
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0110b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L4.b$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0111c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6195a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6196b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6197c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0111c(DocumentFile documentFile, b bVar, S5.d dVar) {
                super(2, dVar);
                this.f6196b = documentFile;
                this.f6197c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0111c(this.f6196b, this.f6197c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                M4.d dVar;
                T5.b.e();
                if (this.f6195a == 0) {
                    t.b(obj);
                    if (this.f6196b != null && (dVar = this.f6197c.f6168c) != null) {
                        dVar.h(this.f6196b);
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0111c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6198a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6199b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6200c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(DocumentFile documentFile, b bVar, S5.d dVar) {
                super(2, dVar);
                this.f6199b = documentFile;
                this.f6200c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f6199b, this.f6200c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                M4.d dVar;
                T5.b.e();
                if (this.f6198a == 0) {
                    t.b(obj);
                    if (this.f6199b != null && (dVar = this.f6200c.f6168c) != null) {
                        dVar.h(this.f6199b);
                    }
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
            int f6201a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6202b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, S5.d dVar) {
                super(2, dVar);
                this.f6202b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f6202b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6201a == 0) {
                    t.b(obj);
                    M4.d dVar = this.f6202b.f6168c;
                    if (dVar != null) {
                        dVar.i();
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

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0103 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0166 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x016f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01ed A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010c -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x011a -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x011c -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012a -> B:12:0x0091). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x016d -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x016f -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017d -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x017f -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01e2 -> B:9:0x01e5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 574
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: L4.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
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
        Object f6203a;

        /* renamed from: b, reason: collision with root package name */
        Object f6204b;

        /* renamed from: c, reason: collision with root package name */
        int f6205c;

        /* renamed from: d, reason: collision with root package name */
        int f6206d;

        /* renamed from: e, reason: collision with root package name */
        long f6207e;

        /* renamed from: f, reason: collision with root package name */
        int f6208f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InputStream f6209g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f6210h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OutputStream f6211i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ b f6212j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6213a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6214b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f6215c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, int i8, S5.d dVar) {
                super(2, dVar);
                this.f6214b = bVar;
                this.f6215c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f6214b, this.f6215c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6213a == 0) {
                    t.b(obj);
                    M4.d dVar = this.f6214b.f6168c;
                    if (dVar != null) {
                        dVar.b(this.f6215c);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InputStream inputStream, long j8, OutputStream outputStream, b bVar, S5.d dVar) {
            super(2, dVar);
            this.f6209g = inputStream;
            this.f6210h = j8;
            this.f6211i = outputStream;
            this.f6212j = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f6209g, this.f6210h, this.f6211i, this.f6212j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005a -> B:6:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:6:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007e -> B:5:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r14.f6208f
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1e
                long r4 = r14.f6207e
                int r1 = r14.f6206d
                int r6 = r14.f6205c
                java.lang.Object r7 = r14.f6204b
                kotlin.jvm.internal.Q r7 = (kotlin.jvm.internal.Q) r7
                java.lang.Object r8 = r14.f6203a
                byte[] r8 = (byte[]) r8
                O5.t.b(r15)
                goto L81
            L1e:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L26:
                O5.t.b(r15)
                r15 = 1024(0x400, float:1.435E-42)
                byte[] r15 = new byte[r15]
                kotlin.jvm.internal.Q r1 = new kotlin.jvm.internal.Q
                r1.<init>()
                r4 = 0
                r8 = r15
                r7 = r1
                r15 = 0
                r6 = 0
            L38:
                java.io.InputStream r1 = r14.f6209g
                int r1 = r1.read(r8)
                r7.f34160a = r1
                if (r1 <= 0) goto L8d
                double r9 = (double) r6
                r11 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r9 = r9 * r11
                long r11 = r14.f6210h
                double r11 = (double) r11
                double r9 = r9 / r11
                int r1 = (int) r9
                int r9 = r15 + 10
                if (r1 > r9) goto L5e
                long r9 = java.lang.System.currentTimeMillis()
                r11 = 1000(0x3e8, float:1.401E-42)
                long r11 = (long) r11
                long r11 = r11 + r4
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 <= 0) goto L82
                if (r1 <= r15) goto L82
            L5e:
                long r4 = java.lang.System.currentTimeMillis()
                l6.J0 r15 = l6.C3347b0.c()
                L4.b$d$a r9 = new L4.b$d$a
                L4.b r10 = r14.f6212j
                r11 = 0
                r9.<init>(r10, r1, r11)
                r14.f6203a = r8
                r14.f6204b = r7
                r14.f6205c = r6
                r14.f6206d = r1
                r14.f6207e = r4
                r14.f6208f = r2
                java.lang.Object r15 = l6.AbstractC3360i.g(r15, r9, r14)
                if (r15 != r0) goto L81
                return r0
            L81:
                r15 = r1
            L82:
                java.io.OutputStream r1 = r14.f6211i
                int r9 = r7.f34160a
                r1.write(r8, r3, r9)
                int r1 = r7.f34160a
                int r6 = r6 + r1
                goto L38
            L8d:
                java.io.InputStream r15 = r14.f6209g
                r15.close()
                java.io.OutputStream r15 = r14.f6211i
                r15.close()
                O5.I r15 = O5.I.f8278a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: L4.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6216a;

        /* renamed from: b, reason: collision with root package name */
        Object f6217b;

        /* renamed from: c, reason: collision with root package name */
        Object f6218c;

        /* renamed from: d, reason: collision with root package name */
        int f6219d;

        /* renamed from: e, reason: collision with root package name */
        int f6220e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6221f;

        /* renamed from: h, reason: collision with root package name */
        int f6223h;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6221f = obj;
            this.f6223h |= Integer.MIN_VALUE;
            return b.this.o(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6224a;

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6224a == 0) {
                t.b(obj);
                M4.d dVar = b.this.f6168c;
                if (dVar != null) {
                    dVar.g();
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
        int f6226a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f6228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file, S5.d dVar) {
            super(2, dVar);
            this.f6228c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f6228c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6226a == 0) {
                t.b(obj);
                M4.d dVar = b.this.f6168c;
                if (dVar != null) {
                    dVar.e(this.f6228c);
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
        int f6229a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f6231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(File file, S5.d dVar) {
            super(2, dVar);
            this.f6231c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f6231c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6229a == 0) {
                t.b(obj);
                M4.d dVar = b.this.f6168c;
                if (dVar != null) {
                    dVar.c(this.f6231c);
                    return I.f8278a;
                }
                return null;
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
        int f6232a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f6234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(T t8, S5.d dVar) {
            super(2, dVar);
            this.f6234c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f6234c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6232a == 0) {
                t.b(obj);
                M4.d dVar = b.this.f6168c;
                if (dVar != null) {
                    dVar.e((File) this.f6234c.f34162a);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6235a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f6237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(T t8, S5.d dVar) {
            super(2, dVar);
            this.f6237c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(this.f6237c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6235a == 0) {
                t.b(obj);
                M4.d dVar = b.this.f6168c;
                if (dVar != null) {
                    dVar.c((File) this.f6237c.f34162a);
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6238a;

        /* renamed from: b, reason: collision with root package name */
        Object f6239b;

        /* renamed from: c, reason: collision with root package name */
        Object f6240c;

        /* renamed from: d, reason: collision with root package name */
        int f6241d;

        /* renamed from: e, reason: collision with root package name */
        int f6242e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6243f;

        /* renamed from: h, reason: collision with root package name */
        int f6245h;

        k(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6243f = obj;
            this.f6245h |= Integer.MIN_VALUE;
            return b.this.n(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6246a;

        l(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6246a == 0) {
                t.b(obj);
                M4.d dVar = b.this.f6168c;
                if (dVar != null) {
                    dVar.g();
                    return I.f8278a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f6249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f6250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DocumentFile f6251d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6252a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6253b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f6254c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, File file, S5.d dVar) {
                super(2, dVar);
                this.f6253b = bVar;
                this.f6254c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f6253b, this.f6254c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6252a == 0) {
                    t.b(obj);
                    M4.d dVar = this.f6253b.f6168c;
                    if (dVar != null) {
                        dVar.e(this.f6254c);
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
        /* renamed from: L4.b$m$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0112b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6255a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6256b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f6257c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0112b(b bVar, File file, S5.d dVar) {
                super(2, dVar);
                this.f6256b = bVar;
                this.f6257c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0112b(this.f6256b, this.f6257c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6255a == 0) {
                    t.b(obj);
                    M4.d dVar = this.f6256b.f6168c;
                    if (dVar != null) {
                        dVar.c(this.f6257c);
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0112b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6258a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6259b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6260c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, DocumentFile documentFile, S5.d dVar) {
                super(2, dVar);
                this.f6259b = bVar;
                this.f6260c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f6259b, this.f6260c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6258a == 0) {
                    t.b(obj);
                    M4.d dVar = this.f6259b.f6168c;
                    if (dVar != null) {
                        DocumentFile documentFile = this.f6260c;
                        AbstractC3255y.f(documentFile);
                        dVar.d(documentFile);
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
            int f6261a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6262b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6263c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b bVar, DocumentFile documentFile, S5.d dVar) {
                super(2, dVar);
                this.f6262b = bVar;
                this.f6263c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new d(this.f6262b, this.f6263c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6261a == 0) {
                    t.b(obj);
                    M4.d dVar = this.f6262b.f6168c;
                    if (dVar != null) {
                        DocumentFile documentFile = this.f6263c;
                        AbstractC3255y.f(documentFile);
                        dVar.a(documentFile);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(File file, b bVar, DocumentFile documentFile, S5.d dVar) {
            super(2, dVar);
            this.f6249b = file;
            this.f6250c = bVar;
            this.f6251d = documentFile;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(this.f6249b, this.f6250c, this.f6251d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            OutputStream outputStream;
            Object e8 = T5.b.e();
            int i8 = this.f6248a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5) {
                                    t.b(obj);
                                    return I.f8278a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t.b(obj);
                            return I.f8278a;
                        }
                        t.b(obj);
                        return I.f8278a;
                    }
                    t.b(obj);
                    return I.f8278a;
                }
                t.b(obj);
                return I.f8278a;
            }
            t.b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f6249b);
                try {
                    ContentResolver contentResolver = this.f6250c.f6170e.getContentResolver();
                    if (contentResolver != null) {
                        DocumentFile documentFile = this.f6251d;
                        AbstractC3255y.f(documentFile);
                        outputStream = contentResolver.openOutputStream(documentFile.getUri());
                    } else {
                        outputStream = null;
                    }
                    if (outputStream == null) {
                        J0 c8 = C3347b0.c();
                        d dVar = new d(this.f6250c, this.f6251d, null);
                        this.f6248a = 4;
                        if (AbstractC3360i.g(c8, dVar, this) == e8) {
                            return e8;
                        }
                        return I.f8278a;
                    }
                    b bVar = this.f6250c;
                    long length = this.f6249b.length();
                    this.f6248a = 5;
                    if (bVar.m(fileInputStream, outputStream, length, this) == e8) {
                        return e8;
                    }
                    return I.f8278a;
                } catch (FileNotFoundException unused) {
                    J0 c9 = C3347b0.c();
                    c cVar = new c(this.f6250c, this.f6251d, null);
                    this.f6248a = 3;
                    if (AbstractC3360i.g(c9, cVar, this) == e8) {
                        return e8;
                    }
                }
            } catch (FileNotFoundException unused2) {
                J0 c10 = C3347b0.c();
                a aVar = new a(this.f6250c, this.f6249b, null);
                this.f6248a = 1;
                if (AbstractC3360i.g(c10, aVar, this) == e8) {
                    return e8;
                }
            } catch (SecurityException unused3) {
                J0 c11 = C3347b0.c();
                C0112b c0112b = new C0112b(this.f6250c, this.f6249b, null);
                this.f6248a = 2;
                if (AbstractC3360i.g(c11, c0112b, this) == e8) {
                    return e8;
                }
            }
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public b(ArrayList itemsToCopy, Object targetDir, M4.d dVar, boolean z8, Context context) {
        AbstractC3255y.i(itemsToCopy, "itemsToCopy");
        AbstractC3255y.i(targetDir, "targetDir");
        AbstractC3255y.i(context, "context");
        this.f6166a = itemsToCopy;
        this.f6167b = targetDir;
        this.f6168c = dVar;
        this.f6169d = z8;
        this.f6170e = context;
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b2 -> B:17:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(androidx.documentfile.provider.DocumentFile r12, androidx.documentfile.provider.DocumentFile r13, S5.d r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.b.k(androidx.documentfile.provider.DocumentFile, androidx.documentfile.provider.DocumentFile, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(InputStream inputStream, OutputStream outputStream, long j8, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(inputStream, j8, outputStream, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0135 -> B:13:0x0137). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.io.File r20, androidx.documentfile.provider.DocumentFile r21, S5.d r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.b.n(java.io.File, androidx.documentfile.provider.DocumentFile, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x01a8 -> B:13:0x01ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.io.File r10, java.io.File r11, S5.d r12) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.b.o(java.io.File, java.io.File, S5.d):java.lang.Object");
    }

    private final DocumentFile p(DocumentFile documentFile, DocumentFile documentFile2) {
        if (!documentFile.isDirectory()) {
            if (documentFile.getName() != null) {
                if (documentFile.getType() != null) {
                    String type = documentFile.getType();
                    AbstractC3255y.f(type);
                    String name = documentFile.getName();
                    AbstractC3255y.f(name);
                    String name2 = documentFile.getName();
                    AbstractC3255y.f(name2);
                    String substring = name.substring(0, n.X(name2, ".", 0, false, 6, null));
                    AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String name3 = documentFile.getName();
                    AbstractC3255y.f(name3);
                    if (n.r(name3, ".xapk", false, 2, null)) {
                        substring = documentFile.getName();
                        AbstractC3255y.f(substring);
                        type = "xapk";
                    }
                    return documentFile2.createFile(type, substring);
                }
                throw new Exception("Source mimetype unknown");
            }
            throw new Exception("Source name unknown");
        }
        throw new Exception("Trying copying a directory into a file");
    }

    private final Object q(File file, DocumentFile documentFile, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new m(file, this, documentFile, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
