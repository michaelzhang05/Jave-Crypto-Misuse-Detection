package c2;

import android.os.IBinder;
import c2.a;
import java.lang.reflect.Field;
import v1.n;

/* loaded from: classes.dex */
public final class b extends a.AbstractBinderC0071a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4020a;

    private b(Object obj) {
        this.f4020a = obj;
    }

    public static Object b(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f4020a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i6 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i6++;
                field = field2;
            }
        }
        if (i6 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        n.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e6) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e6);
        } catch (NullPointerException e7) {
            throw new IllegalArgumentException("Binder object is null.", e7);
        }
    }

    public static a c(Object obj) {
        return new b(obj);
    }
}
