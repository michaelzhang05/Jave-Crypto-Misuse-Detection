package v4;

import O5.I;
import O5.r;
import O5.s;
import O5.t;
import O5.x;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.C3374p;

/* renamed from: v4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4106e {

    /* renamed from: a, reason: collision with root package name */
    private static final a f40160a = new a(null);

    /* renamed from: v4.e$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40161a;

        /* renamed from: b, reason: collision with root package name */
        Object f40162b;

        /* renamed from: c, reason: collision with root package name */
        Object f40163c;

        /* renamed from: d, reason: collision with root package name */
        int f40164d;

        /* renamed from: e, reason: collision with root package name */
        int f40165e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40166f;

        /* renamed from: h, reason: collision with root package name */
        int f40168h;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40166f = obj;
            this.f40168h |= Integer.MIN_VALUE;
            return C4106e.this.c(null, 0, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f40169a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f40170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BitmapFactory.Options options, InputStream inputStream) {
            super(1);
            this.f40169a = options;
            this.f40170b = inputStream;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8278a;
        }

        public final void invoke(Throwable th) {
            InputStream inputStream = this.f40170b;
            try {
                s.a aVar = s.f8302b;
                inputStream.close();
                s.b(I.f8278a);
            } catch (Throwable th2) {
                s.a aVar2 = s.f8302b;
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

    private final Object e(BitmapFactory.Options options, String str, S5.d dVar) {
        Object b8;
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        try {
            s.a aVar = s.f8302b;
            InputStream f8 = f(new URL(str));
            c3374p.i(new c(options, f8));
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(f8, null, options);
                Y5.b.a(f8, null);
                b8 = s.b(decodeStream);
            } finally {
            }
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 == null) {
            c3374p.resumeWith(s.b((Bitmap) b8));
        } else {
            c3374p.resumeWith(s.b(t.a(e8)));
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream f(URL url) {
        URLConnection openConnection = url.openConnection();
        AbstractC3255y.h(openConnection, "openConnection(...)");
        openConnection.setConnectTimeout(10000);
        openConnection.setReadTimeout(10000);
        InputStream inputStream = openConnection.getInputStream();
        AbstractC3255y.h(inputStream, "getInputStream(...)");
        return inputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, int r7, int r8, S5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof v4.C4106e.b
            if (r0 == 0) goto L13
            r0 = r9
            v4.e$b r0 = (v4.C4106e.b) r0
            int r1 = r0.f40168h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40168h = r1
            goto L18
        L13:
            v4.e$b r0 = new v4.e$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f40166f
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f40168h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r9)
            goto L81
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.f40165e
            int r7 = r0.f40164d
            java.lang.Object r6 = r0.f40163c
            android.graphics.BitmapFactory$Options r6 = (android.graphics.BitmapFactory.Options) r6
            java.lang.Object r2 = r0.f40162b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f40161a
            v4.e r4 = (v4.C4106e) r4
            O5.t.b(r9)
            goto L68
        L48:
            O5.t.b(r9)
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options
            r9.<init>()
            r9.inJustDecodeBounds = r4
            r0.f40161a = r5
            r0.f40162b = r6
            r0.f40163c = r9
            r0.f40164d = r7
            r0.f40165e = r8
            r0.f40168h = r4
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
            r0.f40161a = r7
            r0.f40162b = r7
            r0.f40163c = r7
            r0.f40168h = r3
            java.lang.Object r9 = r4.e(r6, r2, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4106e.c(java.lang.String, int, int, S5.d):java.lang.Object");
    }

    public final Object d(String str, S5.d dVar) {
        Object e8 = e(new BitmapFactory.Options(), str, dVar);
        if (e8 == T5.b.e()) {
            return e8;
        }
        return (Bitmap) e8;
    }
}
