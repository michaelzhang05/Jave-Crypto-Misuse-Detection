package o6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3255y;
import n6.EnumC3487a;
import q6.C3865F;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.M, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3699M extends p6.b implements w, InterfaceC3706f, p6.p {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36606f = AtomicReferenceFieldUpdater.newUpdater(C3699M.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    private int f36607e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.M$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36608a;

        /* renamed from: b, reason: collision with root package name */
        Object f36609b;

        /* renamed from: c, reason: collision with root package name */
        Object f36610c;

        /* renamed from: d, reason: collision with root package name */
        Object f36611d;

        /* renamed from: e, reason: collision with root package name */
        Object f36612e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f36613f;

        /* renamed from: h, reason: collision with root package name */
        int f36615h;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36613f = obj;
            this.f36615h |= Integer.MIN_VALUE;
            return C3699M.this.collect(null, this);
        }
    }

    public C3699M(Object obj) {
        this._state = obj;
    }

    private final boolean p(Object obj, Object obj2) {
        int i8;
        p6.d[] m8;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36606f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC3255y.d(obj3, obj)) {
                return false;
            }
            if (AbstractC3255y.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f36607e;
            if ((i9 & 1) == 0) {
                int i10 = i9 + 1;
                this.f36607e = i10;
                p6.d[] m9 = m();
                O5.I i11 = O5.I.f8278a;
                while (true) {
                    O[] oArr = (O[]) m9;
                    if (oArr != null) {
                        for (O o8 : oArr) {
                            if (o8 != null) {
                                o8.g();
                            }
                        }
                    }
                    synchronized (this) {
                        i8 = this.f36607e;
                        if (i8 == i10) {
                            this.f36607e = i10 + 1;
                            return true;
                        }
                        m8 = m();
                        O5.I i12 = O5.I.f8278a;
                    }
                    m9 = m8;
                    i10 = i8;
                }
            } else {
                this.f36607e = i9 + 2;
                return true;
            }
        }
    }

    @Override // p6.p
    public InterfaceC3706f a(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return AbstractC3700N.d(this, gVar, i8, enumC3487a);
    }

    @Override // o6.w
    public boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = p6.s.f37960a;
        }
        if (obj2 == null) {
            obj2 = p6.s.f37960a;
        }
        return p(obj, obj2);
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
    @Override // o6.InterfaceC3687A, o6.InterfaceC3706f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(o6.InterfaceC3707g r11, S5.d r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3699M.collect(o6.g, S5.d):java.lang.Object");
    }

    @Override // o6.v
    public void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // o6.v
    public boolean e(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // o6.v, o6.InterfaceC3707g
    public Object emit(Object obj, S5.d dVar) {
        setValue(obj);
        return O5.I.f8278a;
    }

    @Override // o6.w, o6.InterfaceC3698L
    public Object getValue() {
        C3865F c3865f = p6.s.f37960a;
        Object obj = f36606f.get(this);
        if (obj == c3865f) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p6.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public O i() {
        return new O();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p6.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public O[] j(int i8) {
        return new O[i8];
    }

    @Override // o6.w
    public void setValue(Object obj) {
        if (obj == null) {
            obj = p6.s.f37960a;
        }
        p(null, obj);
    }
}
