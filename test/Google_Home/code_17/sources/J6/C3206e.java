package j6;

import a6.InterfaceC1668n;
import b6.InterfaceC1985a;
import i6.InterfaceC2998g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3206e implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f34026a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34027b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34028c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1668n f34029d;

    /* renamed from: j6.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private int f34030a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f34031b;

        /* renamed from: c, reason: collision with root package name */
        private int f34032c;

        /* renamed from: d, reason: collision with root package name */
        private g6.i f34033d;

        /* renamed from: e, reason: collision with root package name */
        private int f34034e;

        a() {
            int k8 = g6.m.k(C3206e.this.f34027b, 0, C3206e.this.f34026a.length());
            this.f34031b = k8;
            this.f34032c = k8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f34035f.f34028c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f34032c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f34030a = r1
                r0 = 0
                r6.f34033d = r0
                goto L9e
            Lc:
                j6.e r0 = j6.C3206e.this
                int r0 = j6.C3206e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f34034e
                int r0 = r0 + r3
                r6.f34034e = r0
                j6.e r4 = j6.C3206e.this
                int r4 = j6.C3206e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f34032c
                j6.e r4 = j6.C3206e.this
                java.lang.CharSequence r4 = j6.C3206e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                g6.i r0 = new g6.i
                int r1 = r6.f34031b
                j6.e r4 = j6.C3206e.this
                java.lang.CharSequence r4 = j6.C3206e.c(r4)
                int r4 = j6.n.M(r4)
                r0.<init>(r1, r4)
                r6.f34033d = r0
                r6.f34032c = r2
                goto L9c
            L47:
                j6.e r0 = j6.C3206e.this
                a6.n r0 = j6.C3206e.b(r0)
                j6.e r4 = j6.C3206e.this
                java.lang.CharSequence r4 = j6.C3206e.c(r4)
                int r5 = r6.f34032c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                O5.r r0 = (O5.r) r0
                if (r0 != 0) goto L77
                g6.i r0 = new g6.i
                int r1 = r6.f34031b
                j6.e r4 = j6.C3206e.this
                java.lang.CharSequence r4 = j6.C3206e.c(r4)
                int r4 = j6.n.M(r4)
                r0.<init>(r1, r4)
                r6.f34033d = r0
                r6.f34032c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f34031b
                g6.i r4 = g6.m.s(r4, r2)
                r6.f34033d = r4
                int r2 = r2 + r0
                r6.f34031b = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f34032c = r2
            L9c:
                r6.f34030a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j6.C3206e.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g6.i next() {
            if (this.f34030a == -1) {
                a();
            }
            if (this.f34030a != 0) {
                g6.i iVar = this.f34033d;
                AbstractC3255y.g(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f34033d = null;
                this.f34030a = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34030a == -1) {
                a();
            }
            if (this.f34030a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3206e(CharSequence input, int i8, int i9, InterfaceC1668n getNextMatch) {
        AbstractC3255y.i(input, "input");
        AbstractC3255y.i(getNextMatch, "getNextMatch");
        this.f34026a = input;
        this.f34027b = i8;
        this.f34028c = i9;
        this.f34029d = getNextMatch;
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a();
    }
}
