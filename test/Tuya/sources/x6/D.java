package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class D extends C3944e0 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f39508m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String name, C generatedSerializer) {
        super(name, generatedSerializer, 1);
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(generatedSerializer, "generatedSerializer");
        this.f39508m = true;
    }

    @Override // x6.C3944e0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            v6.f fVar = (v6.f) obj;
            if (AbstractC3159y.d(a(), fVar.a())) {
                D d8 = (D) obj;
                if (d8.isInline() && Arrays.equals(o(), d8.o()) && e() == fVar.e()) {
                    int e8 = e();
                    for (int i8 = 0; i8 < e8; i8++) {
                        if (AbstractC3159y.d(h(i8).a(), fVar.h(i8).a()) && AbstractC3159y.d(h(i8).getKind(), fVar.h(i8).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x6.C3944e0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // x6.C3944e0, v6.f
    public boolean isInline() {
        return this.f39508m;
    }
}
