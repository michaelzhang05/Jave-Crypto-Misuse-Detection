package l6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3159y;
import n6.C3486F;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.L, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3350L extends m6.b implements v, InterfaceC3358f, m6.p {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34605f = AtomicReferenceFieldUpdater.newUpdater(C3350L.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    private int f34606e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.L$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34607a;

        /* renamed from: b, reason: collision with root package name */
        Object f34608b;

        /* renamed from: c, reason: collision with root package name */
        Object f34609c;

        /* renamed from: d, reason: collision with root package name */
        Object f34610d;

        /* renamed from: e, reason: collision with root package name */
        Object f34611e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f34612f;

        /* renamed from: h, reason: collision with root package name */
        int f34614h;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34612f = obj;
            this.f34614h |= Integer.MIN_VALUE;
            return C3350L.this.collect(null, this);
        }
    }

    public C3350L(Object obj) {
        this._state = obj;
    }

    private final boolean p(Object obj, Object obj2) {
        int i8;
        m6.d[] m8;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34605f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC3159y.d(obj3, obj)) {
                return false;
            }
            if (AbstractC3159y.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f34606e;
            if ((i9 & 1) == 0) {
                int i10 = i9 + 1;
                this.f34606e = i10;
                m6.d[] m9 = m();
                L5.I i11 = L5.I.f6487a;
                while (true) {
                    C3352N[] c3352nArr = (C3352N[]) m9;
                    if (c3352nArr != null) {
                        for (C3352N c3352n : c3352nArr) {
                            if (c3352n != null) {
                                c3352n.g();
                            }
                        }
                    }
                    synchronized (this) {
                        i8 = this.f34606e;
                        if (i8 == i10) {
                            this.f34606e = i10 + 1;
                            return true;
                        }
                        m8 = m();
                        L5.I i12 = L5.I.f6487a;
                    }
                    m9 = m8;
                    i10 = i8;
                }
            } else {
                this.f34606e = i9 + 2;
                return true;
            }
        }
    }

    @Override // l6.v
    public boolean a(Object obj, Object obj2) {
        if (obj == null) {
            obj = m6.s.f35934a;
        }
        if (obj2 == null) {
            obj2 = m6.s.f35934a;
        }
        return p(obj, obj2);
    }

    @Override // m6.p
    public InterfaceC3358f b(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return AbstractC3351M.d(this, gVar, i8, enumC3132a);
    }

    @Override // l6.u
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c1 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // l6.z, l6.InterfaceC3358f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(l6.InterfaceC3359g r11, P5.d r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.C3350L.collect(l6.g, P5.d):java.lang.Object");
    }

    @Override // l6.u
    public boolean d(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // l6.u, l6.InterfaceC3359g
    public Object emit(Object obj, P5.d dVar) {
        setValue(obj);
        return L5.I.f6487a;
    }

    @Override // l6.v, l6.InterfaceC3349K
    public Object getValue() {
        C3486F c3486f = m6.s.f35934a;
        Object obj = f34605f.get(this);
        if (obj == c3486f) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3352N i() {
        return new C3352N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3352N[] j(int i8) {
        return new C3352N[i8];
    }

    @Override // l6.v
    public void setValue(Object obj) {
        if (obj == null) {
            obj = m6.s.f35934a;
        }
        p(null, obj);
    }
}
