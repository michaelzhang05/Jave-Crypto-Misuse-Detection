package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: PropertyReference1Impl.java */
/* loaded from: classes2.dex */
public class v extends u {
    public v(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(c.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).a(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public v(Class cls, String str, String str2, int i2) {
        super(c.NO_RECEIVER, cls, str, str2, i2);
    }
}
