package s4;

import L5.I;
import L5.r;
import L5.s;
import L5.t;
import L5.x;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import i6.C2839p;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: s4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3753e {

    /* renamed from: a, reason: collision with root package name */
    private static final a f37887a = new a(null);

    /* renamed from: s4.e$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37888a;

        /* renamed from: b, reason: collision with root package name */
        Object f37889b;

        /* renamed from: c, reason: collision with root package name */
        Object f37890c;

        /* renamed from: d, reason: collision with root package name */
        int f37891d;

        /* renamed from: e, reason: collision with root package name */
        int f37892e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37893f;

        /* renamed from: h, reason: collision with root package name */
        int f37895h;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37893f = obj;
            this.f37895h |= Integer.MIN_VALUE;
            return C3753e.this.c(null, 0, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f37896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f37897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BitmapFactory.Options options, InputStream inputStream) {
            super(1);
            this.f37896a = options;
            this.f37897b = inputStream;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f6487a;
        }

        public final void invoke(Throwable th) {
            InputStream inputStream = this.f37897b;
            try {
                s.a aVar = s.f6511b;
                inputStream.close();
                s.b(I.f6487a);
            } catch (Throwable th2) {
                s.a aVar2 = s.f6511b;
                s.b(t.a(th2));
            }
        }
    }

    private final int b(BitmapFactory.Options options, int i8, int i9) {
        r a8 = x.a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) a8.a()).intValue();
        int intValue2 = ((Number) a8.b()).intValue();
        int i10 = 1;
        if (intValue > i9 || intValue2 > i8) {
            int i11 = intValue / 2;
            int i12 = intValue2 / 2;
            while (i11 / i10 >= i9 && i12 / i10 >= i8) {
                i10 *= 2;
            }
        }
        return i10;
    }

    private final Object e(BitmapFactory.Options options, String str, P5.d dVar) {
        Object b8;
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        try {
            s.a aVar = s.f6511b;
            InputStream f8 = f(new URL(str));
            c2839p.j(new c(options, f8));
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(f8, null, options);
                V5.b.a(f8, null);
                b8 = s.b(decodeStream);
            } finally {
            }
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 == null) {
            c2839p.resumeWith(s.b((Bitmap) b8));
        } else {
            c2839p.resumeWith(s.b(t.a(e8)));
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream f(URL url) {
        URLConnection openConnection = url.openConnection();
        AbstractC3159y.h(openConnection, "openConnection(...)");
        openConnection.setConnectTimeout(10000);
        openConnection.setReadTimeout(10000);
        InputStream inputStream = openConnection.getInputStream();
        AbstractC3159y.h(inputStream, "getInputStream(...)");
        return inputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, int r7, int r8, P5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof s4.C3753e.b
            if (r0 == 0) goto L13
            r0 = r9
            s4.e$b r0 = (s4.C3753e.b) r0
            int r1 = r0.f37895h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37895h = r1
            goto L18
        L13:
            s4.e$b r0 = new s4.e$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f37893f
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f37895h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r9)
            goto L81
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.f37892e
            int r7 = r0.f37891d
            java.lang.Object r6 = r0.f37890c
            android.graphics.BitmapFactory$Options r6 = (android.graphics.BitmapFactory.Options) r6
            java.lang.Object r2 = r0.f37889b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f37888a
            s4.e r4 = (s4.C3753e) r4
            L5.t.b(r9)
            goto L68
        L48:
            L5.t.b(r9)
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options
            r9.<init>()
            r9.inJustDecodeBounds = r4
            r0.f37888a = r5
            r0.f37889b = r6
            r0.f37890c = r9
            r0.f37891d = r7
            r0.f37892e = r8
            r0.f37895h = r4
            java.lang.Object r2 = r5.e(r9, r6, r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r4 = r5
            r2 = r6
            r6 = r9
        L68:
            int r7 = r4.b(r6, r7, r8)
            r6.inSampleSize = r7
            r7 = 0
            r6.inJustDecodeBounds = r7
            r7 = 0
            r0.f37888a = r7
            r0.f37889b = r7
            r0.f37890c = r7
            r0.f37895h = r3
            java.lang.Object r9 = r4.e(r6, r2, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3753e.c(java.lang.String, int, int, P5.d):java.lang.Object");
    }

    public final Object d(String str, P5.d dVar) {
        Object e8 = e(new BitmapFactory.Options(), str, dVar);
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return (Bitmap) e8;
    }
}
