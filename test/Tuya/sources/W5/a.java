package W5;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.InterfaceC3148m;
import kotlin.jvm.internal.U;

/* loaded from: classes5.dex */
public abstract class a {
    public static final Class a(InterfaceC2643c interfaceC2643c) {
        AbstractC3159y.i(interfaceC2643c, "<this>");
        Class d8 = ((InterfaceC3148m) interfaceC2643c).d();
        AbstractC3159y.g(d8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return d8;
    }

    public static final Class b(InterfaceC2643c interfaceC2643c) {
        AbstractC3159y.i(interfaceC2643c, "<this>");
        Class d8 = ((InterfaceC3148m) interfaceC2643c).d();
        if (!d8.isPrimitive()) {
            AbstractC3159y.g(d8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return d8;
        }
        String name = d8.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    d8 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    d8 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    d8 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    d8 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    d8 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    d8 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    d8 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    d8 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    d8 = Short.class;
                    break;
                }
                break;
        }
        AbstractC3159y.g(d8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return d8;
    }

    public static final InterfaceC2643c c(Class cls) {
        AbstractC3159y.i(cls, "<this>");
        return U.b(cls);
    }
}
