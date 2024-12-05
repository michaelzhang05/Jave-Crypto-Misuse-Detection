package d5;

import f5.c;
import f5.h;

/* loaded from: classes.dex */
public abstract class a {
    public static final Class a(h5.a aVar) {
        h.e(aVar, "<this>");
        Class a6 = ((c) aVar).a();
        h.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a6;
    }

    public static final Class b(h5.a aVar) {
        h.e(aVar, "<this>");
        Class a6 = ((c) aVar).a();
        if (!a6.isPrimitive()) {
            h.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return a6;
        }
        String name = a6.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    a6 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    a6 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    a6 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    a6 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    a6 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    a6 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    a6 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    a6 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    a6 = Short.class;
                    break;
                }
                break;
        }
        h.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return a6;
    }
}
