package A6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class V extends s0 {
    protected abstract String Z(String str, String str2);

    protected String a0(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return descriptor.f(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.s0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String V(y6.f fVar, int i8) {
        AbstractC3255y.i(fVar, "<this>");
        return c0(a0(fVar, i8));
    }

    protected final String c0(String nestedName) {
        AbstractC3255y.i(nestedName, "nestedName");
        String str = (String) U();
        if (str == null) {
            str = "";
        }
        return Z(str, nestedName);
    }
}
