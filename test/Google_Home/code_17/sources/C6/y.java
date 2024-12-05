package C6;

import A6.C1002v;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3252v;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final C1002v f1688a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1689b;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3252v implements InterfaceC1668n {
        a(Object obj) {
            super(2, obj, y.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean d(y6.f p02, int i8) {
            AbstractC3255y.i(p02, "p0");
            return Boolean.valueOf(((y) this.receiver).e(p02, i8));
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d((y6.f) obj, ((Number) obj2).intValue());
        }
    }

    public y(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        this.f1688a = new C1002v(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(y6.f fVar, int i8) {
        boolean z8;
        if (!fVar.i(i8) && fVar.h(i8).c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f1689b = z8;
        return z8;
    }

    public final boolean b() {
        return this.f1689b;
    }

    public final void c(int i8) {
        this.f1688a.a(i8);
    }

    public final int d() {
        return this.f1688a.d();
    }
}
