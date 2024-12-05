package l2;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class i implements InterfaceC3167b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3169d f33833a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3169d f33834b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3169d f33835c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3170e f33836d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f33837e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33838a;

        /* renamed from: b, reason: collision with root package name */
        Object f33839b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33840c;

        /* renamed from: e, reason: collision with root package name */
        int f33842e;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33840c = obj;
            this.f33842e |= Integer.MIN_VALUE;
            return i.this.b(null, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33843a = new b();

        b() {
            super(3);
        }

        public final Boolean a(boolean z8, boolean z9, boolean z10) {
            boolean z11;
            if (!z8 && !z9 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }
    }

    public i(InterfaceC3169d inMemorySource, InterfaceC3169d remoteSource, InterfaceC3169d staticSource, InterfaceC3170e store) {
        AbstractC3159y.i(inMemorySource, "inMemorySource");
        AbstractC3159y.i(remoteSource, "remoteSource");
        AbstractC3159y.i(staticSource, "staticSource");
        AbstractC3159y.i(store, "store");
        this.f33833a = inMemorySource;
        this.f33834b = remoteSource;
        this.f33835c = staticSource;
        this.f33836d = store;
        this.f33837e = v4.g.e(inMemorySource.a(), remoteSource.a(), staticSource.a(), b.f33843a);
    }

    @Override // l2.InterfaceC3167b
    public InterfaceC3349K a() {
        return this.f33837e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r10 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // l2.InterfaceC3167b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(l2.f.b r9, P5.d r10) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.i.b(l2.f$b, P5.d):java.lang.Object");
    }
}
