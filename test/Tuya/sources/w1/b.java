package W1;

import T1.g;
import T1.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class b implements e {
    @Override // W1.e
    public void a(Object obj, Appendable appendable, g gVar) {
        Method method;
        Object invoke;
        Class<?> type;
        try {
            gVar.n(appendable);
            boolean z8 = false;
            for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & 152) <= 0) {
                        if ((modifiers & 1) > 0) {
                            invoke = field.get(obj);
                        } else {
                            try {
                                method = cls.getDeclaredMethod(h.a(field.getName()), null);
                            } catch (Exception unused) {
                                method = null;
                            }
                            if (method == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                method = cls.getDeclaredMethod(h.b(field.getName()), null);
                            }
                            if (method != null) {
                                invoke = method.invoke(obj, null);
                            }
                        }
                        if (invoke != null || !gVar.g()) {
                            if (z8) {
                                gVar.m(appendable);
                            } else {
                                z8 = true;
                            }
                            d.g(field.getName(), invoke, appendable, gVar);
                        }
                    }
                }
            }
            gVar.o(appendable);
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
