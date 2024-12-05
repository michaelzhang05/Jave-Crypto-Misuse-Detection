package A6;

import O5.C1352h;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0980c {
    public static final Void a(InterfaceC2963c subClass, InterfaceC2963c baseClass) {
        AbstractC3255y.i(subClass, "subClass");
        AbstractC3255y.i(baseClass, "baseClass");
        String b8 = subClass.b();
        if (b8 == null) {
            b8 = String.valueOf(subClass);
        }
        b(b8, baseClass);
        throw new C1352h();
    }

    public static final Void b(String str, InterfaceC2963c baseClass) {
        String str2;
        AbstractC3255y.i(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.b() + "' has to be sealed and '@Serializable'.";
        }
        throw new w6.h(str2);
    }
}
