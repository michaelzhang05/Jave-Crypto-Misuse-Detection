package o2;

import a6.InterfaceC1669o;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class i implements InterfaceC3515b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3517d f35834a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3517d f35835b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3517d f35836c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3518e f35837d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f35838e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35839a;

        /* renamed from: b, reason: collision with root package name */
        Object f35840b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f35841c;

        /* renamed from: e, reason: collision with root package name */
        int f35843e;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35841c = obj;
            this.f35843e |= Integer.MIN_VALUE;
            return i.this.b(null, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35844a = new b();

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

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }
    }

    public i(InterfaceC3517d inMemorySource, InterfaceC3517d remoteSource, InterfaceC3517d staticSource, InterfaceC3518e store) {
        AbstractC3255y.i(inMemorySource, "inMemorySource");
        AbstractC3255y.i(remoteSource, "remoteSource");
        AbstractC3255y.i(staticSource, "staticSource");
        AbstractC3255y.i(store, "store");
        this.f35834a = inMemorySource;
        this.f35835b = remoteSource;
        this.f35836c = staticSource;
        this.f35837d = store;
        this.f35838e = y4.g.e(inMemorySource.a(), remoteSource.a(), staticSource.a(), b.f35844a);
    }

    @Override // o2.InterfaceC3515b
    public InterfaceC3698L a() {
        return this.f35838e;
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
    @Override // o2.InterfaceC3515b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(o2.f.b r9, S5.d r10) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.b(o2.f$b, S5.d):java.lang.Object");
    }
}
