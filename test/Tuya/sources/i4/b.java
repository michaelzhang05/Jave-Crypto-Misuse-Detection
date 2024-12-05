package I4;

import L5.I;
import L5.t;
import X5.n;
import android.content.ContentResolver;
import android.content.Context;
import androidx.documentfile.provider.DocumentFile;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f4171a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4172b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.d f4173c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4174d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f4175e;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4176a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f4176a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f4176a = 1;
                if (bVar.l(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0066b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4178a;

        /* renamed from: b, reason: collision with root package name */
        Object f4179b;

        /* renamed from: c, reason: collision with root package name */
        Object f4180c;

        /* renamed from: d, reason: collision with root package name */
        Object f4181d;

        /* renamed from: e, reason: collision with root package name */
        int f4182e;

        /* renamed from: f, reason: collision with root package name */
        int f4183f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f4184g;

        /* renamed from: i, reason: collision with root package name */
        int f4186i;

        C0066b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4184g = obj;
            this.f4186i |= Integer.MIN_VALUE;
            return b.this.k(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f4187a;

        /* renamed from: b, reason: collision with root package name */
        Object f4188b;

        /* renamed from: c, reason: collision with root package name */
        Object f4189c;

        /* renamed from: d, reason: collision with root package name */
        int f4190d;

        /* renamed from: e, reason: collision with root package name */
        int f4191e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4193a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4194b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f4195c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f4196d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj, int i8, P5.d dVar) {
                super(2, dVar);
                this.f4194b = bVar;
                this.f4195c = obj;
                this.f4196d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f4194b, this.f4195c, this.f4196d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4193a == 0) {
                    t.b(obj);
                    J4.d dVar = this.f4194b.f4173c;
                    if (dVar != null) {
                        dVar.f(this.f4195c, this.f4196d);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I4.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0067b extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4197a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f4198b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f4199c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0067b(File file, b bVar, P5.d dVar) {
                super(2, dVar);
                this.f4198b = file;
                this.f4199c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0067b(this.f4198b, this.f4199c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0067b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                J4.d dVar;
                Q5.b.e();
                if (this.f4197a == 0) {
                    t.b(obj);
                    if (this.f4198b != null && (dVar = this.f4199c.f4173c) != null) {
                        dVar.h(this.f4198b);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I4.b$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0068c extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4200a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DocumentFile f4201b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f4202c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0068c(DocumentFile documentFile, b bVar, P5.d dVar) {
                super(2, dVar);
                this.f4201b = documentFile;
                this.f4202c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0068c(this.f4201b, this.f4202c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0068c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                J4.d dVar;
                Q5.b.e();
                if (this.f4200a == 0) {
                    t.b(obj);
                    if (this.f4201b != null && (dVar = this.f4202c.f4173c) != null) {
                        dVar.h(this.f4201b);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4203a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DocumentFile f4204b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f4205c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(DocumentFile documentFile, b bVar, P5.d dVar) {
                super(2, dVar);
                this.f4204b = documentFile;
                this.f4205c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f4204b, this.f4205c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                J4.d dVar;
                Q5.b.e();
                if (this.f4203a == 0) {
                    t.b(obj);
                    if (this.f4204b != null && (dVar = this.f4205c.f4173c) != null) {
                        dVar.h(this.f4204b);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4206a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4207b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, P5.d dVar) {
                super(2, dVar);
                this.f4207b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f4207b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4206a == 0) {
                    t.b(obj);
                    J4.d dVar = this.f4207b.f4173c;
                    if (dVar != null) {
                        dVar.i();
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: I4.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f4208a;

        /* renamed from: b, reason: collision with root package name */
        Object f4209b;

        /* renamed from: c, reason: collision with root package name */
        int f4210c;

        /* renamed from: d, reason: collision with root package name */
        int f4211d;

        /* renamed from: e, reason: collision with root package name */
        long f4212e;

        /* renamed from: f, reason: collision with root package name */
        int f4213f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InputStream f4214g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f4215h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OutputStream f4216i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ b f4217j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4218a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4219b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4220c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, int i8, P5.d dVar) {
                super(2, dVar);
                this.f4219b = bVar;
                this.f4220c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f4219b, this.f4220c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4218a == 0) {
                    t.b(obj);
                    J4.d dVar = this.f4219b.f4173c;
                    if (dVar != null) {
                        dVar.b(this.f4220c);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InputStream inputStream, long j8, OutputStream outputStream, b bVar, P5.d dVar) {
            super(2, dVar);
            this.f4214g = inputStream;
            this.f4215h = j8;
            this.f4216i = outputStream;
            this.f4217j = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f4214g, this.f4215h, this.f4216i, this.f4217j, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r14.f4213f
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1e
                long r4 = r14.f4212e
                int r1 = r14.f4211d
                int r6 = r14.f4210c
                java.lang.Object r7 = r14.f4209b
                kotlin.jvm.internal.Q r7 = (kotlin.jvm.internal.Q) r7
                java.lang.Object r8 = r14.f4208a
                byte[] r8 = (byte[]) r8
                L5.t.b(r15)
                goto L81
            L1e:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L26:
                L5.t.b(r15)
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
                java.io.InputStream r1 = r14.f4214g
                int r1 = r1.read(r8)
                r7.f33759a = r1
                if (r1 <= 0) goto L8d
                double r9 = (double) r6
                r11 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r9 = r9 * r11
                long r11 = r14.f4215h
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
                i6.J0 r15 = i6.C2812b0.c()
                I4.b$d$a r9 = new I4.b$d$a
                I4.b r10 = r14.f4217j
                r11 = 0
                r9.<init>(r10, r1, r11)
                r14.f4208a = r8
                r14.f4209b = r7
                r14.f4210c = r6
                r14.f4211d = r1
                r14.f4212e = r4
                r14.f4213f = r2
                java.lang.Object r15 = i6.AbstractC2825i.g(r15, r9, r14)
                if (r15 != r0) goto L81
                return r0
            L81:
                r15 = r1
            L82:
                java.io.OutputStream r1 = r14.f4216i
                int r9 = r7.f33759a
                r1.write(r8, r3, r9)
                int r1 = r7.f33759a
                int r6 = r6 + r1
                goto L38
            L8d:
                java.io.InputStream r15 = r14.f4214g
                r15.close()
                java.io.OutputStream r15 = r14.f4216i
                r15.close()
                L5.I r15 = L5.I.f6487a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: I4.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4221a;

        /* renamed from: b, reason: collision with root package name */
        Object f4222b;

        /* renamed from: c, reason: collision with root package name */
        Object f4223c;

        /* renamed from: d, reason: collision with root package name */
        int f4224d;

        /* renamed from: e, reason: collision with root package name */
        int f4225e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4226f;

        /* renamed from: h, reason: collision with root package name */
        int f4228h;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4226f = obj;
            this.f4228h |= Integer.MIN_VALUE;
            return b.this.o(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4229a;

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4229a == 0) {
                t.b(obj);
                J4.d dVar = b.this.f4173c;
                if (dVar != null) {
                    dVar.g();
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4231a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f4233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file, P5.d dVar) {
            super(2, dVar);
            this.f4233c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f4233c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4231a == 0) {
                t.b(obj);
                J4.d dVar = b.this.f4173c;
                if (dVar != null) {
                    dVar.e(this.f4233c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4234a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f4236c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(File file, P5.d dVar) {
            super(2, dVar);
            this.f4236c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f4236c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4234a == 0) {
                t.b(obj);
                J4.d dVar = b.this.f4173c;
                if (dVar != null) {
                    dVar.c(this.f4236c);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4237a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f4239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(T t8, P5.d dVar) {
            super(2, dVar);
            this.f4239c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f4239c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4237a == 0) {
                t.b(obj);
                J4.d dVar = b.this.f4173c;
                if (dVar != null) {
                    dVar.e((File) this.f4239c.f33761a);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4240a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f4242c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(T t8, P5.d dVar) {
            super(2, dVar);
            this.f4242c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f4242c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4240a == 0) {
                t.b(obj);
                J4.d dVar = b.this.f4173c;
                if (dVar != null) {
                    dVar.c((File) this.f4242c.f33761a);
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4243a;

        /* renamed from: b, reason: collision with root package name */
        Object f4244b;

        /* renamed from: c, reason: collision with root package name */
        Object f4245c;

        /* renamed from: d, reason: collision with root package name */
        int f4246d;

        /* renamed from: e, reason: collision with root package name */
        int f4247e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4248f;

        /* renamed from: h, reason: collision with root package name */
        int f4250h;

        k(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4248f = obj;
            this.f4250h |= Integer.MIN_VALUE;
            return b.this.n(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4251a;

        l(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4251a == 0) {
                t.b(obj);
                J4.d dVar = b.this.f4173c;
                if (dVar != null) {
                    dVar.g();
                    return I.f6487a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4253a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f4254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f4255c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DocumentFile f4256d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4257a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4258b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f4259c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, File file, P5.d dVar) {
                super(2, dVar);
                this.f4258b = bVar;
                this.f4259c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f4258b, this.f4259c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4257a == 0) {
                    t.b(obj);
                    J4.d dVar = this.f4258b.f4173c;
                    if (dVar != null) {
                        dVar.e(this.f4259c);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I4.b$m$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0069b extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4260a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4261b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f4262c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0069b(b bVar, File file, P5.d dVar) {
                super(2, dVar);
                this.f4261b = bVar;
                this.f4262c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0069b(this.f4261b, this.f4262c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0069b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4260a == 0) {
                    t.b(obj);
                    J4.d dVar = this.f4261b.f4173c;
                    if (dVar != null) {
                        dVar.c(this.f4262c);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4263a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4264b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f4265c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, DocumentFile documentFile, P5.d dVar) {
                super(2, dVar);
                this.f4264b = bVar;
                this.f4265c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f4264b, this.f4265c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4263a == 0) {
                    t.b(obj);
                    J4.d dVar = this.f4264b.f4173c;
                    if (dVar != null) {
                        DocumentFile documentFile = this.f4265c;
                        AbstractC3159y.f(documentFile);
                        dVar.d(documentFile);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4266a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4267b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f4268c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b bVar, DocumentFile documentFile, P5.d dVar) {
                super(2, dVar);
                this.f4267b = bVar;
                this.f4268c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f4267b, this.f4268c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4266a == 0) {
                    t.b(obj);
                    J4.d dVar = this.f4267b.f4173c;
                    if (dVar != null) {
                        DocumentFile documentFile = this.f4268c;
                        AbstractC3159y.f(documentFile);
                        dVar.a(documentFile);
                        return I.f6487a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(File file, b bVar, DocumentFile documentFile, P5.d dVar) {
            super(2, dVar);
            this.f4254b = file;
            this.f4255c = bVar;
            this.f4256d = documentFile;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(this.f4254b, this.f4255c, this.f4256d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            OutputStream outputStream;
            Object e8 = Q5.b.e();
            int i8 = this.f4253a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5) {
                                    t.b(obj);
                                    return I.f6487a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t.b(obj);
                            return I.f6487a;
                        }
                        t.b(obj);
                        return I.f6487a;
                    }
                    t.b(obj);
                    return I.f6487a;
                }
                t.b(obj);
                return I.f6487a;
            }
            t.b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f4254b);
                try {
                    ContentResolver contentResolver = this.f4255c.f4175e.getContentResolver();
                    if (contentResolver != null) {
                        DocumentFile documentFile = this.f4256d;
                        AbstractC3159y.f(documentFile);
                        outputStream = contentResolver.openOutputStream(documentFile.getUri());
                    } else {
                        outputStream = null;
                    }
                    if (outputStream == null) {
                        J0 c8 = C2812b0.c();
                        d dVar = new d(this.f4255c, this.f4256d, null);
                        this.f4253a = 4;
                        if (AbstractC2825i.g(c8, dVar, this) == e8) {
                            return e8;
                        }
                        return I.f6487a;
                    }
                    b bVar = this.f4255c;
                    long length = this.f4254b.length();
                    this.f4253a = 5;
                    if (bVar.m(fileInputStream, outputStream, length, this) == e8) {
                        return e8;
                    }
                    return I.f6487a;
                } catch (FileNotFoundException unused) {
                    J0 c9 = C2812b0.c();
                    c cVar = new c(this.f4255c, this.f4256d, null);
                    this.f4253a = 3;
                    if (AbstractC2825i.g(c9, cVar, this) == e8) {
                        return e8;
                    }
                }
            } catch (FileNotFoundException unused2) {
                J0 c10 = C2812b0.c();
                a aVar = new a(this.f4255c, this.f4254b, null);
                this.f4253a = 1;
                if (AbstractC2825i.g(c10, aVar, this) == e8) {
                    return e8;
                }
            } catch (SecurityException unused3) {
                J0 c11 = C2812b0.c();
                C0069b c0069b = new C0069b(this.f4255c, this.f4254b, null);
                this.f4253a = 2;
                if (AbstractC2825i.g(c11, c0069b, this) == e8) {
                    return e8;
                }
            }
        }
    }

    public b(ArrayList itemsToCopy, Object targetDir, J4.d dVar, boolean z8, Context context) {
        AbstractC3159y.i(itemsToCopy, "itemsToCopy");
        AbstractC3159y.i(targetDir, "targetDir");
        AbstractC3159y.i(context, "context");
        this.f4171a = itemsToCopy;
        this.f4172b = targetDir;
        this.f4173c = dVar;
        this.f4174d = z8;
        this.f4175e = context;
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(null), 3, null);
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
    public final java.lang.Object k(androidx.documentfile.provider.DocumentFile r12, androidx.documentfile.provider.DocumentFile r13, P5.d r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.b.k(androidx.documentfile.provider.DocumentFile, androidx.documentfile.provider.DocumentFile, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(InputStream inputStream, OutputStream outputStream, long j8, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(inputStream, j8, outputStream, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
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
    public final java.lang.Object n(java.io.File r20, androidx.documentfile.provider.DocumentFile r21, P5.d r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.b.n(java.io.File, androidx.documentfile.provider.DocumentFile, P5.d):java.lang.Object");
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
    public final java.lang.Object o(java.io.File r10, java.io.File r11, P5.d r12) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.b.o(java.io.File, java.io.File, P5.d):java.lang.Object");
    }

    private final DocumentFile p(DocumentFile documentFile, DocumentFile documentFile2) {
        if (!documentFile.isDirectory()) {
            if (documentFile.getName() != null) {
                if (documentFile.getType() != null) {
                    String type = documentFile.getType();
                    AbstractC3159y.f(type);
                    String name = documentFile.getName();
                    AbstractC3159y.f(name);
                    String name2 = documentFile.getName();
                    AbstractC3159y.f(name2);
                    String substring = name.substring(0, g6.n.X(name2, ".", 0, false, 6, null));
                    AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String name3 = documentFile.getName();
                    AbstractC3159y.f(name3);
                    if (g6.n.r(name3, ".xapk", false, 2, null)) {
                        substring = documentFile.getName();
                        AbstractC3159y.f(substring);
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

    private final Object q(File file, DocumentFile documentFile, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new m(file, this, documentFile, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
