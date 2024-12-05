package kotlin.reflect.x.internal.l0.i.w;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends kotlin.reflect.x.internal.l0.i.w.a {

    /* renamed from: b, reason: collision with root package name */
    private final i<h> f20927b;

    /* compiled from: LazyScopeAdapter.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<h> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<h> f20928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends h> function0) {
            super(0);
            this.f20928f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h invoke = this.f20928f.invoke();
            return invoke instanceof kotlin.reflect.x.internal.l0.i.w.a ? ((kotlin.reflect.x.internal.l0.i.w.a) invoke).h() : invoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Function0<? extends h> function0) {
        this(null, function0, 1, 0 == true ? 1 : 0);
        l.f(function0, "getScope");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ g(kotlin.reflect.x.internal.l0.k.n r1, kotlin.jvm.functions.Function0 r2, int r3, kotlin.jvm.internal.g r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            kotlin.f0.x.e.l0.k.n r1 = kotlin.reflect.x.internal.l0.k.f.f21159b
            java.lang.String r3 = "NO_LOCKS"
            kotlin.jvm.internal.l.e(r1, r3)
        Lb:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.i.w.g.<init>(kotlin.f0.x.e.l0.k.n, kotlin.a0.c.a, int, kotlin.a0.d.g):void");
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.a
    protected h i() {
        return this.f20927b.invoke();
    }

    public g(n nVar, Function0<? extends h> function0) {
        l.f(nVar, "storageManager");
        l.f(function0, "getScope");
        this.f20927b = nVar.d(new a(function0));
    }
}
