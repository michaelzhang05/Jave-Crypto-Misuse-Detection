package A6;

import h6.InterfaceC2963c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0979b0 {
    private static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final w6.b b(InterfaceC2963c interfaceC2963c) {
        AbstractC3255y.i(interfaceC2963c, "<this>");
        return c(interfaceC2963c, new w6.b[0]);
    }

    public static final w6.b c(InterfaceC2963c interfaceC2963c, w6.b... args) {
        AbstractC3255y.i(interfaceC2963c, "<this>");
        AbstractC3255y.i(args, "args");
        return d(Z5.a.a(interfaceC2963c), (w6.b[]) Arrays.copyOf(args, args.length));
    }

    public static final w6.b d(Class cls, w6.b... args) {
        w6.b i8;
        AbstractC3255y.i(cls, "<this>");
        AbstractC3255y.i(args, "args");
        if (cls.isEnum() && l(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (i8 = i(cls)) != null) {
            return i8;
        }
        w6.b k8 = k(cls, (w6.b[]) Arrays.copyOf(args, args.length));
        if (k8 != null) {
            return k8;
        }
        w6.b h8 = h(cls);
        if (h8 != null) {
            return h8;
        }
        w6.b f8 = f(cls, (w6.b[]) Arrays.copyOf(args, args.length));
        if (f8 != null) {
            return f8;
        }
        if (m(cls)) {
            return new w6.e(Z5.a.c(cls));
        }
        return null;
    }

    private static final w6.b e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        AbstractC3255y.h(canonicalName, "getCanonicalName(...)");
        AbstractC3255y.g(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C1004x(canonicalName, (Enum[]) enumConstants);
    }

    private static final w6.b f(Class cls, w6.b... bVarArr) {
        Object obj;
        Field field;
        w6.b j8;
        Object g8 = g(cls);
        if (g8 != null && (j8 = j(g8, (w6.b[]) Arrays.copyOf(bVarArr, bVarArr.length))) != null) {
            return j8;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            AbstractC3255y.h(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i8 = 0;
            Class<?> cls2 = null;
            boolean z8 = false;
            while (true) {
                if (i8 < length) {
                    Class<?> cls3 = declaredClasses[i8];
                    if (AbstractC3255y.d(cls3.getSimpleName(), "$serializer")) {
                        if (z8) {
                            break;
                        }
                        z8 = true;
                        cls2 = cls3;
                    }
                    i8++;
                } else if (!z8) {
                }
            }
            cls2 = null;
            if (cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                obj = field.get(null);
            } else {
                obj = null;
            }
            if (!(obj instanceof w6.b)) {
                return null;
            }
            return (w6.b) obj;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final Object g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        AbstractC3255y.h(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                cls2 = declaredClasses[i8];
                if (cls2.getAnnotation(U.class) != null) {
                    break;
                }
                i8++;
            } else {
                cls2 = null;
                break;
            }
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        AbstractC3255y.h(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0056, code lost:
    
        if (r5 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final w6.b h(java.lang.Class r11) {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = j6.n.C(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = j6.n.C(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = 0
            r5 = 0
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.AbstractC3255y.d(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.AbstractC3255y.d(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r6 = r8
            r5 = 1
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = 0
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.AbstractC3255y.d(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<w6.b> r9 = w6.b.class
            boolean r8 = kotlin.jvm.internal.AbstractC3255y.d(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = 1
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof w6.b
            if (r0 == 0) goto Lae
            r1 = r11
            w6.b r1 = (w6.b) r1
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.AbstractC0979b0.h(java.lang.Class):w6.b");
    }

    private static final w6.b i(Class cls) {
        w6.g gVar = (w6.g) cls.getAnnotation(w6.g.class);
        if (gVar != null && !AbstractC3255y.d(kotlin.jvm.internal.U.b(gVar.with()), kotlin.jvm.internal.U.b(w6.e.class))) {
            return null;
        }
        return new w6.e(Z5.a.c(cls));
    }

    private static final w6.b j(Object obj, w6.b... bVarArr) {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i8 = 0; i8 < length; i8++) {
                    clsArr2[i8] = w6.b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (!(invoke instanceof w6.b)) {
                return null;
            }
            return (w6.b) invoke;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e8.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e8;
        }
    }

    private static final w6.b k(Class cls, w6.b... bVarArr) {
        Object a8 = a(cls, "Companion");
        if (a8 == null) {
            return null;
        }
        return j(a8, (w6.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    private static final boolean l(Class cls) {
        if (cls.getAnnotation(w6.g.class) == null && cls.getAnnotation(w6.d.class) == null) {
            return true;
        }
        return false;
    }

    private static final boolean m(Class cls) {
        if (cls.getAnnotation(w6.d.class) != null) {
            return true;
        }
        w6.g gVar = (w6.g) cls.getAnnotation(w6.g.class);
        if (gVar != null && AbstractC3255y.d(kotlin.jvm.internal.U.b(gVar.with()), kotlin.jvm.internal.U.b(w6.e.class))) {
            return true;
        }
        return false;
    }
}
