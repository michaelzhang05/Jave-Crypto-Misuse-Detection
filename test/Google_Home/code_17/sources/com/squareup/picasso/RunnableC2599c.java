package com.squareup.picasso;

import S6.InterfaceC1419g;
import S6.L;
import S6.Z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.squareup.picasso.q;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import l2.InterfaceC3308a;
import l2.InterfaceC3312e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class RunnableC2599c implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final Object f24278t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static final ThreadLocal f24279u = new a();

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f24280v = new AtomicInteger();

    /* renamed from: w, reason: collision with root package name */
    private static final x f24281w = new b();

    /* renamed from: a, reason: collision with root package name */
    final int f24282a = f24280v.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    final s f24283b;

    /* renamed from: c, reason: collision with root package name */
    final g f24284c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC3308a f24285d;

    /* renamed from: e, reason: collision with root package name */
    final z f24286e;

    /* renamed from: f, reason: collision with root package name */
    final String f24287f;

    /* renamed from: g, reason: collision with root package name */
    final v f24288g;

    /* renamed from: h, reason: collision with root package name */
    final int f24289h;

    /* renamed from: i, reason: collision with root package name */
    int f24290i;

    /* renamed from: j, reason: collision with root package name */
    final x f24291j;

    /* renamed from: k, reason: collision with root package name */
    AbstractC2597a f24292k;

    /* renamed from: l, reason: collision with root package name */
    List f24293l;

    /* renamed from: m, reason: collision with root package name */
    Bitmap f24294m;

    /* renamed from: n, reason: collision with root package name */
    Future f24295n;

    /* renamed from: o, reason: collision with root package name */
    s.e f24296o;

    /* renamed from: p, reason: collision with root package name */
    Exception f24297p;

    /* renamed from: q, reason: collision with root package name */
    int f24298q;

    /* renamed from: r, reason: collision with root package name */
    int f24299r;

    /* renamed from: s, reason: collision with root package name */
    s.f f24300s;

    /* renamed from: com.squareup.picasso.c$a */
    /* loaded from: classes4.dex */
    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    /* loaded from: classes4.dex */
    static class b extends x {
        b() {
        }

        @Override // com.squareup.picasso.x
        public boolean c(v vVar) {
            return true;
        }

        @Override // com.squareup.picasso.x
        public x.a f(v vVar, int i8) {
            throw new IllegalStateException("Unrecognized type of request: " + vVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class RunnableC0437c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3312e f24301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RuntimeException f24302b;

        RunnableC0437c(InterfaceC3312e interfaceC3312e, RuntimeException runtimeException) {
            this.f24301a = interfaceC3312e;
            this.f24302b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f24301a.key() + " crashed with exception.", this.f24302b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$d */
    /* loaded from: classes4.dex */
    public static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f24303a;

        d(StringBuilder sb) {
            this.f24303a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f24303a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$e */
    /* loaded from: classes4.dex */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3312e f24304a;

        e(InterfaceC3312e interfaceC3312e) {
            this.f24304a = interfaceC3312e;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f24304a.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$f */
    /* loaded from: classes4.dex */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3312e f24305a;

        f(InterfaceC3312e interfaceC3312e) {
            this.f24305a = interfaceC3312e;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f24305a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    RunnableC2599c(s sVar, g gVar, InterfaceC3308a interfaceC3308a, z zVar, AbstractC2597a abstractC2597a, x xVar) {
        this.f24283b = sVar;
        this.f24284c = gVar;
        this.f24285d = interfaceC3308a;
        this.f24286e = zVar;
        this.f24292k = abstractC2597a;
        this.f24287f = abstractC2597a.d();
        this.f24288g = abstractC2597a.i();
        this.f24300s = abstractC2597a.h();
        this.f24289h = abstractC2597a.e();
        this.f24290i = abstractC2597a.f();
        this.f24291j = xVar;
        this.f24299r = xVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            InterfaceC3312e interfaceC3312e = (InterfaceC3312e) list.get(i8);
            try {
                Bitmap a8 = interfaceC3312e.a(bitmap);
                if (a8 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(interfaceC3312e.key());
                    sb.append(" returned null after ");
                    sb.append(i8);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(((InterfaceC3312e) it.next()).key());
                        sb.append('\n');
                    }
                    s.f24370o.post(new d(sb));
                    return null;
                }
                if (a8 == bitmap && bitmap.isRecycled()) {
                    s.f24370o.post(new e(interfaceC3312e));
                    return null;
                }
                if (a8 != bitmap && !bitmap.isRecycled()) {
                    s.f24370o.post(new f(interfaceC3312e));
                    return null;
                }
                i8++;
                bitmap = a8;
            } catch (RuntimeException e8) {
                s.f24370o.post(new RunnableC0437c(interfaceC3312e, e8));
                return null;
            }
        }
        return bitmap;
    }

    private s.f d() {
        boolean z8;
        s.f fVar = s.f.LOW;
        List list = this.f24293l;
        if (list != null && !list.isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC2597a abstractC2597a = this.f24292k;
        if (abstractC2597a == null && !z8) {
            return fVar;
        }
        if (abstractC2597a != null) {
            fVar = abstractC2597a.h();
        }
        if (z8) {
            int size = this.f24293l.size();
            for (int i8 = 0; i8 < size; i8++) {
                s.f h8 = ((AbstractC2597a) this.f24293l.get(i8)).h();
                if (h8.ordinal() > fVar.ordinal()) {
                    fVar = h8;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(Z z8, v vVar) {
        InterfaceC1419g d8 = L.d(z8);
        boolean s8 = C.s(d8);
        boolean z9 = vVar.f24436r;
        BitmapFactory.Options d9 = x.d(vVar);
        boolean g8 = x.g(d9);
        if (!s8) {
            InputStream inputStream = d8.inputStream();
            if (g8) {
                m mVar = new m(inputStream);
                mVar.a(false);
                long f8 = mVar.f(1024);
                BitmapFactory.decodeStream(mVar, null, d9);
                x.b(vVar.f24426h, vVar.f24427i, d9, vVar);
                mVar.b(f8);
                mVar.a(true);
                inputStream = mVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, d9);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] readByteArray = d8.readByteArray();
        if (g8) {
            BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d9);
            x.b(vVar.f24426h, vVar.f24427i, d9, vVar);
        }
        return BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RunnableC2599c g(s sVar, g gVar, InterfaceC3308a interfaceC3308a, z zVar, AbstractC2597a abstractC2597a) {
        v i8 = abstractC2597a.i();
        List i9 = sVar.i();
        int size = i9.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) i9.get(i10);
            if (xVar.c(i8)) {
                return new RunnableC2599c(sVar, gVar, interfaceC3308a, zVar, abstractC2597a, xVar);
            }
        }
        return new RunnableC2599c(sVar, gVar, interfaceC3308a, zVar, abstractC2597a, f24281w);
    }

    static int l(int i8) {
        switch (i8) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }

    static int m(int i8) {
        return (i8 == 2 || i8 == 7 || i8 == 4 || i8 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z8, int i8, int i9, int i10, int i11) {
        return !z8 || (i10 != 0 && i8 > i10) || (i11 != 0 && i9 > i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.graphics.Bitmap y(com.squareup.picasso.v r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC2599c.y(com.squareup.picasso.v, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(v vVar) {
        String a8 = vVar.a();
        StringBuilder sb = (StringBuilder) f24279u.get();
        sb.ensureCapacity(a8.length() + 8);
        sb.replace(8, sb.length(), a8);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AbstractC2597a abstractC2597a) {
        boolean z8 = this.f24283b.f24384m;
        v vVar = abstractC2597a.f24262b;
        if (this.f24292k == null) {
            this.f24292k = abstractC2597a;
            if (z8) {
                List list = this.f24293l;
                if (list != null && !list.isEmpty()) {
                    C.u("Hunter", "joined", vVar.d(), C.l(this, "to "));
                    return;
                } else {
                    C.u("Hunter", "joined", vVar.d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.f24293l == null) {
            this.f24293l = new ArrayList(3);
        }
        this.f24293l.add(abstractC2597a);
        if (z8) {
            C.u("Hunter", "joined", vVar.d(), C.l(this, "to "));
        }
        s.f h8 = abstractC2597a.h();
        if (h8.ordinal() > this.f24300s.ordinal()) {
            this.f24300s = h8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        Future future;
        if (this.f24292k != null) {
            return false;
        }
        List list = this.f24293l;
        if ((list != null && !list.isEmpty()) || (future = this.f24295n) == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(AbstractC2597a abstractC2597a) {
        boolean z8;
        if (this.f24292k == abstractC2597a) {
            this.f24292k = null;
            z8 = true;
        } else {
            List list = this.f24293l;
            if (list != null) {
                z8 = list.remove(abstractC2597a);
            } else {
                z8 = false;
            }
        }
        if (z8 && abstractC2597a.h() == this.f24300s) {
            this.f24300s = d();
        }
        if (this.f24283b.f24384m) {
            C.u("Hunter", "removed", abstractC2597a.f24262b.d(), C.l(this, "from "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2597a h() {
        return this.f24292k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List i() {
        return this.f24293l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v j() {
        return this.f24288g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Exception k() {
        return this.f24297p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        return this.f24287f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.e o() {
        return this.f24296o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f24289h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s q() {
        return this.f24283b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.f r() {
        return this.f24300s;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f24288g);
                        if (this.f24283b.f24384m) {
                            C.t("Hunter", "executing", C.k(this));
                        }
                        Bitmap t8 = t();
                        this.f24294m = t8;
                        if (t8 == null) {
                            this.f24284c.e(this);
                        } else {
                            this.f24284c.d(this);
                        }
                    } catch (OutOfMemoryError e8) {
                        StringWriter stringWriter = new StringWriter();
                        this.f24286e.a().a(new PrintWriter(stringWriter));
                        this.f24297p = new RuntimeException(stringWriter.toString(), e8);
                        this.f24284c.e(this);
                    }
                } catch (IOException e9) {
                    this.f24297p = e9;
                    this.f24284c.g(this);
                }
            } catch (q.b e10) {
                if (!p.a(e10.f24366b) || e10.f24365a != 504) {
                    this.f24297p = e10;
                }
                this.f24284c.e(this);
            } catch (Exception e11) {
                this.f24297p = e11;
                this.f24284c.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap s() {
        return this.f24294m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:43:0x009a, B:45:0x00a2, B:48:0x00c4, B:50:0x00cc, B:52:0x00da, B:53:0x00e9, B:57:0x00a9, B:59:0x00b7), top: B:42:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap t() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC2599c.t():android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        Future future = this.f24295n;
        if (future != null && future.isCancelled()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(boolean z8, NetworkInfo networkInfo) {
        int i8 = this.f24299r;
        if (i8 > 0) {
            this.f24299r = i8 - 1;
            return this.f24291j.h(z8, networkInfo);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f24291j.i();
    }
}
