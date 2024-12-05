package a4;

import L5.I;
import L5.t;
import Z3.b;
import android.graphics.Bitmap;
import i6.AbstractC2825i;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1570n {

    /* renamed from: a, reason: collision with root package name */
    private final P5.g f13544a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.b f13545b;

    /* renamed from: c, reason: collision with root package name */
    private final a f13546c;

    /* renamed from: a4.n$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: a4.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0262a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final U3.c f13547a;

            /* renamed from: b, reason: collision with root package name */
            private final P5.g f13548b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: a4.n$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0263a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f13549a;

                /* renamed from: b, reason: collision with root package name */
                Object f13550b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f13551c;

                /* renamed from: e, reason: collision with root package name */
                int f13553e;

                C0263a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f13551c = obj;
                    this.f13553e |= Integer.MIN_VALUE;
                    return C0262a.this.a(null, this);
                }
            }

            public C0262a(U3.c errorReporter, P5.g workContext) {
                AbstractC3159y.i(errorReporter, "errorReporter");
                AbstractC3159y.i(workContext, "workContext");
                this.f13547a = errorReporter;
                this.f13548b = workContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // a4.C1570n.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object a(java.lang.String r13, P5.d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof a4.C1570n.a.C0262a.C0263a
                    if (r0 == 0) goto L13
                    r0 = r14
                    a4.n$a$a$a r0 = (a4.C1570n.a.C0262a.C0263a) r0
                    int r1 = r0.f13553e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13553e = r1
                    goto L18
                L13:
                    a4.n$a$a$a r0 = new a4.n$a$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f13551c
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f13553e
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r13 = r0.f13550b
                    java.lang.String r13 = (java.lang.String) r13
                    java.lang.Object r0 = r0.f13549a
                    a4.n$a$a r0 = (a4.C1570n.a.C0262a) r0
                    L5.t.b(r14)     // Catch: java.lang.Throwable -> L32
                    goto L5d
                L32:
                    r14 = move-exception
                    goto L78
                L34:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3c:
                    L5.t.b(r14)
                    L5.s$a r14 = L5.s.f6511b     // Catch: java.lang.Throwable -> L76
                    com.stripe.android.stripe3ds2.transaction.r r14 = new com.stripe.android.stripe3ds2.transaction.r     // Catch: java.lang.Throwable -> L76
                    U3.c r8 = r12.f13547a     // Catch: java.lang.Throwable -> L76
                    P5.g r9 = r12.f13548b     // Catch: java.lang.Throwable -> L76
                    r10 = 2
                    r11 = 0
                    r7 = 0
                    r5 = r14
                    r6 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L76
                    r0.f13549a = r12     // Catch: java.lang.Throwable -> L76
                    r0.f13550b = r13     // Catch: java.lang.Throwable -> L76
                    r0.f13553e = r3     // Catch: java.lang.Throwable -> L76
                    java.lang.Object r14 = r14.h(r0)     // Catch: java.lang.Throwable -> L76
                    if (r14 != r1) goto L5c
                    return r1
                L5c:
                    r0 = r12
                L5d:
                    java.io.InputStream r14 = (java.io.InputStream) r14     // Catch: java.lang.Throwable -> L32
                    if (r14 == 0) goto L70
                    android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r14)     // Catch: java.lang.Throwable -> L69
                    V5.b.a(r14, r4)     // Catch: java.lang.Throwable -> L32
                    goto L71
                L69:
                    r1 = move-exception
                    throw r1     // Catch: java.lang.Throwable -> L6b
                L6b:
                    r2 = move-exception
                    V5.b.a(r14, r1)     // Catch: java.lang.Throwable -> L32
                    throw r2     // Catch: java.lang.Throwable -> L32
                L70:
                    r1 = r4
                L71:
                    java.lang.Object r14 = L5.s.b(r1)     // Catch: java.lang.Throwable -> L32
                    goto L82
                L76:
                    r14 = move-exception
                    r0 = r12
                L78:
                    L5.s$a r1 = L5.s.f6511b
                    java.lang.Object r14 = L5.t.a(r14)
                    java.lang.Object r14 = L5.s.b(r14)
                L82:
                    java.lang.Throwable r1 = L5.s.e(r14)
                    if (r1 == 0) goto La8
                    U3.c r0 = r0.f13547a
                    java.lang.RuntimeException r2 = new java.lang.RuntimeException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r5 = "Could not get bitmap from url: "
                    r3.append(r5)
                    r3.append(r13)
                    java.lang.String r13 = "."
                    r3.append(r13)
                    java.lang.String r13 = r3.toString()
                    r2.<init>(r13, r1)
                    r0.i(r2)
                La8:
                    boolean r13 = L5.s.g(r14)
                    if (r13 == 0) goto Laf
                    goto Lb0
                Laf:
                    r4 = r14
                Lb0:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: a4.C1570n.a.C0262a.a(java.lang.String, P5.d):java.lang.Object");
            }
        }

        Object a(String str, P5.d dVar);
    }

    /* renamed from: a4.n$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f13554a;

        /* renamed from: b, reason: collision with root package name */
        Object f13555b;

        /* renamed from: c, reason: collision with root package name */
        int f13556c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13557d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1570n f13558e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C1570n c1570n, P5.d dVar) {
            super(2, dVar);
            this.f13557d = str;
            this.f13558e = c1570n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f13557d, this.f13558e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1570n c1570n;
            String str;
            Object e8 = Q5.b.e();
            int i8 = this.f13556c;
            if (i8 != 0) {
                if (i8 == 1) {
                    str = (String) this.f13555b;
                    c1570n = (C1570n) this.f13554a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                String str2 = this.f13557d;
                if (str2 != null) {
                    c1570n = this.f13558e;
                    Bitmap f8 = c1570n.f(str2);
                    if (f8 == null) {
                        this.f13554a = c1570n;
                        this.f13555b = str2;
                        this.f13556c = 1;
                        Object g8 = c1570n.g(str2, this);
                        if (g8 == e8) {
                            return e8;
                        }
                        str = str2;
                        obj = g8;
                    } else {
                        return f8;
                    }
                } else {
                    return null;
                }
            }
            Bitmap bitmap = (Bitmap) obj;
            c1570n.d(str, bitmap);
            return bitmap;
        }
    }

    public C1570n(P5.g workContext, Z3.b imageCache, a imageSupplier) {
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(imageCache, "imageCache");
        AbstractC3159y.i(imageSupplier, "imageSupplier");
        this.f13544a = workContext;
        this.f13545b = imageCache;
        this.f13546c = imageSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, Bitmap bitmap) {
        if (bitmap != null) {
            this.f13545b.a(str, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap f(String str) {
        return this.f13545b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(String str, P5.d dVar) {
        return this.f13546c.a(str, dVar);
    }

    public final Object e(String str, P5.d dVar) {
        return AbstractC2825i.g(this.f13544a, new b(str, this, null), dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1570n(U3.c errorReporter, P5.g workContext) {
        this(workContext, b.a.f13401a, new a.C0262a(errorReporter, workContext));
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
    }
}
