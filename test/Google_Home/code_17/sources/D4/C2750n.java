package d4;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.graphics.Bitmap;
import c4.InterfaceC2044b;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;

/* renamed from: d4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2750n {

    /* renamed from: a, reason: collision with root package name */
    private final S5.g f31207a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2044b f31208b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31209c;

    /* renamed from: d4.n$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: d4.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0716a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final X3.c f31210a;

            /* renamed from: b, reason: collision with root package name */
            private final S5.g f31211b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: d4.n$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0717a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f31212a;

                /* renamed from: b, reason: collision with root package name */
                Object f31213b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f31214c;

                /* renamed from: e, reason: collision with root package name */
                int f31216e;

                C0717a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f31214c = obj;
                    this.f31216e |= Integer.MIN_VALUE;
                    return C0716a.this.a(null, this);
                }
            }

            public C0716a(X3.c errorReporter, S5.g workContext) {
                AbstractC3255y.i(errorReporter, "errorReporter");
                AbstractC3255y.i(workContext, "workContext");
                this.f31210a = errorReporter;
                this.f31211b = workContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // d4.C2750n.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object a(java.lang.String r13, S5.d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof d4.C2750n.a.C0716a.C0717a
                    if (r0 == 0) goto L13
                    r0 = r14
                    d4.n$a$a$a r0 = (d4.C2750n.a.C0716a.C0717a) r0
                    int r1 = r0.f31216e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31216e = r1
                    goto L18
                L13:
                    d4.n$a$a$a r0 = new d4.n$a$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f31214c
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f31216e
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r13 = r0.f31213b
                    java.lang.String r13 = (java.lang.String) r13
                    java.lang.Object r0 = r0.f31212a
                    d4.n$a$a r0 = (d4.C2750n.a.C0716a) r0
                    O5.t.b(r14)     // Catch: java.lang.Throwable -> L32
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
                    O5.t.b(r14)
                    O5.s$a r14 = O5.s.f8302b     // Catch: java.lang.Throwable -> L76
                    com.stripe.android.stripe3ds2.transaction.r r14 = new com.stripe.android.stripe3ds2.transaction.r     // Catch: java.lang.Throwable -> L76
                    X3.c r8 = r12.f31210a     // Catch: java.lang.Throwable -> L76
                    S5.g r9 = r12.f31211b     // Catch: java.lang.Throwable -> L76
                    r10 = 2
                    r11 = 0
                    r7 = 0
                    r5 = r14
                    r6 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L76
                    r0.f31212a = r12     // Catch: java.lang.Throwable -> L76
                    r0.f31213b = r13     // Catch: java.lang.Throwable -> L76
                    r0.f31216e = r3     // Catch: java.lang.Throwable -> L76
                    java.lang.Object r14 = r14.h(r0)     // Catch: java.lang.Throwable -> L76
                    if (r14 != r1) goto L5c
                    return r1
                L5c:
                    r0 = r12
                L5d:
                    java.io.InputStream r14 = (java.io.InputStream) r14     // Catch: java.lang.Throwable -> L32
                    if (r14 == 0) goto L70
                    android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r14)     // Catch: java.lang.Throwable -> L69
                    Y5.b.a(r14, r4)     // Catch: java.lang.Throwable -> L32
                    goto L71
                L69:
                    r1 = move-exception
                    throw r1     // Catch: java.lang.Throwable -> L6b
                L6b:
                    r2 = move-exception
                    Y5.b.a(r14, r1)     // Catch: java.lang.Throwable -> L32
                    throw r2     // Catch: java.lang.Throwable -> L32
                L70:
                    r1 = r4
                L71:
                    java.lang.Object r14 = O5.s.b(r1)     // Catch: java.lang.Throwable -> L32
                    goto L82
                L76:
                    r14 = move-exception
                    r0 = r12
                L78:
                    O5.s$a r1 = O5.s.f8302b
                    java.lang.Object r14 = O5.t.a(r14)
                    java.lang.Object r14 = O5.s.b(r14)
                L82:
                    java.lang.Throwable r1 = O5.s.e(r14)
                    if (r1 == 0) goto La8
                    X3.c r0 = r0.f31210a
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
                    r0.l(r2)
                La8:
                    boolean r13 = O5.s.g(r14)
                    if (r13 == 0) goto Laf
                    goto Lb0
                Laf:
                    r4 = r14
                Lb0:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: d4.C2750n.a.C0716a.a(java.lang.String, S5.d):java.lang.Object");
            }
        }

        Object a(String str, S5.d dVar);
    }

    /* renamed from: d4.n$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f31217a;

        /* renamed from: b, reason: collision with root package name */
        Object f31218b;

        /* renamed from: c, reason: collision with root package name */
        int f31219c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31220d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2750n f31221e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C2750n c2750n, S5.d dVar) {
            super(2, dVar);
            this.f31220d = str;
            this.f31221e = c2750n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f31220d, this.f31221e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C2750n c2750n;
            String str;
            Object e8 = T5.b.e();
            int i8 = this.f31219c;
            if (i8 != 0) {
                if (i8 == 1) {
                    str = (String) this.f31218b;
                    c2750n = (C2750n) this.f31217a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                String str2 = this.f31220d;
                if (str2 != null) {
                    c2750n = this.f31221e;
                    Bitmap f8 = c2750n.f(str2);
                    if (f8 == null) {
                        this.f31217a = c2750n;
                        this.f31218b = str2;
                        this.f31219c = 1;
                        Object g8 = c2750n.g(str2, this);
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
            c2750n.d(str, bitmap);
            return bitmap;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C2750n(S5.g workContext, InterfaceC2044b imageCache, a imageSupplier) {
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(imageCache, "imageCache");
        AbstractC3255y.i(imageSupplier, "imageSupplier");
        this.f31207a = workContext;
        this.f31208b = imageCache;
        this.f31209c = imageSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, Bitmap bitmap) {
        if (bitmap != null) {
            this.f31208b.a(str, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap f(String str) {
        return this.f31208b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(String str, S5.d dVar) {
        return this.f31209c.a(str, dVar);
    }

    public final Object e(String str, S5.d dVar) {
        return AbstractC3360i.g(this.f31207a, new b(str, this, null), dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2750n(X3.c errorReporter, S5.g workContext) {
        this(workContext, InterfaceC2044b.a.f15725a, new a.C0716a(errorReporter, workContext));
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
    }
}
