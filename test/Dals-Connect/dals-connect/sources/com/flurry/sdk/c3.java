package com.flurry.sdk;

import com.flurry.sdk.i2;
import com.flurry.sdk.x2;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public abstract class c3 extends l2 implements x2 {
    private x2 o;
    volatile int p;
    protected Queue<u6> q;
    protected y2 r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.d().length];
            a = iArr;
            try {
                iArr[c.f9783f - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.f9787j - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.f9784g - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.f9785h - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.f9786i - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements y2 {

        /* loaded from: classes2.dex */
        final class a extends f2 {

            /* renamed from: com.flurry.sdk.c3$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            final class C0160a extends f2 {
                C0160a() {
                }

                @Override // com.flurry.sdk.f2
                public final void a() {
                    y2 y2Var = c3.this.r;
                    if (y2Var != null) {
                        y2Var.a();
                    }
                }
            }

            a() {
            }

            @Override // com.flurry.sdk.f2
            public final void a() {
                c3.this.v();
                c3.this.p = c.f9786i;
                c3.this.m(new C0160a());
            }
        }

        private b() {
        }

        @Override // com.flurry.sdk.y2
        public final void a() {
            c3.this.m(new a());
        }

        /* synthetic */ b(c3 c3Var, byte b2) {
            this();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: f, reason: collision with root package name */
        public static final int f9783f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f9784g = 2;

        /* renamed from: h, reason: collision with root package name */
        public static final int f9785h = 3;

        /* renamed from: i, reason: collision with root package name */
        public static final int f9786i = 4;

        /* renamed from: j, reason: collision with root package name */
        public static final int f9787j = 5;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ int[] f9788k = {1, 2, 3, 4, 5};

        public static int[] d() {
            return (int[]) f9788k.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3(String str, x2 x2Var) {
        super(str, i2.a(i2.b.CORE));
        this.p = c.f9783f;
        this.o = x2Var;
        this.q = new ConcurrentLinkedQueue();
        this.p = c.f9784g;
    }

    protected abstract void b(u6 u6Var);

    public x2.a c(u6 u6Var) {
        x2.a aVar = x2.a.ERROR;
        x2 x2Var = this.o;
        return x2Var != null ? x2Var.c(u6Var) : aVar;
    }

    @Override // com.flurry.sdk.x2
    public final void g(y2 y2Var) {
        this.p = c.f9785h;
        this.r = y2Var;
        t();
        x2 x2Var = this.o;
        if (x2Var != null) {
            x2Var.g(new b(this, (byte) 0));
            return;
        }
        if (y2Var != null) {
            y2Var.a();
        }
        this.p = c.f9786i;
    }

    @Override // com.flurry.sdk.x2
    public final x2.a j(u6 u6Var) {
        x2.a aVar = x2.a.ERROR;
        int i2 = a.a[this.p - 1];
        if (i2 != 3 && i2 != 4) {
            if (i2 != 5) {
                return aVar;
            }
            x2.a aVar2 = x2.a.QUEUED;
            b(u6Var);
            return aVar2;
        }
        x2.a aVar3 = x2.a.DEFERRED;
        this.q.add(u6Var);
        d1.c(4, "StreamingCoreModule", "Adding frame to deferred queue:" + u6Var.d());
        return aVar3;
    }

    protected void t() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        while (this.q.peek() != null) {
            u6 poll = this.q.poll();
            d1.c(4, "StreamingCoreModule", "Processing deferred message status for module: " + poll.d());
            b(poll);
        }
    }

    public final void w(u6 u6Var) {
        x2 x2Var = this.o;
        if (x2Var != null) {
            d1.c(4, "StreamingCoreModule", "Enqueue message status for module: " + this.o + " is: " + x2Var.j(u6Var));
        }
    }
}
