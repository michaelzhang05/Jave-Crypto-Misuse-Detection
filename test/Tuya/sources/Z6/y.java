package z6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3156v;
import x6.C3961v;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final C3961v f40570a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40571b;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3156v implements X5.n {
        a(Object obj) {
            super(2, obj, y.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean d(v6.f p02, int i8) {
            AbstractC3159y.i(p02, "p0");
            return Boolean.valueOf(((y) this.receiver).e(p02, i8));
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d((v6.f) obj, ((Number) obj2).intValue());
        }
    }

    public y(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        this.f40570a = new C3961v(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(v6.f fVar, int i8) {
        boolean z8;
        if (!fVar.i(i8) && fVar.h(i8).c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f40571b = z8;
        return z8;
    }

    public final boolean b() {
        return this.f40571b;
    }

    public final void c(int i8) {
        this.f40570a.a(i8);
    }

    public final int d() {
        return this.f40570a.d();
    }
}
