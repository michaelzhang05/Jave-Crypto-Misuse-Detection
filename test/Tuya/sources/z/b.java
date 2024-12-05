package Z;

import R.AbstractC1319p;
import Z.a;
import android.os.IBinder;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class b extends a.AbstractBinderC0256a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13244a;

    private b(Object obj) {
        this.f13244a = obj;
    }

    public static Object l(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f13244a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i8 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i8++;
                field = field2;
            }
        }
        if (i8 == 1) {
            AbstractC1319p.l(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e8) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e8);
                } catch (NullPointerException e9) {
                    throw new IllegalArgumentException("Binder object is null.", e9);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }

    public static a m0(Object obj) {
        return new b(obj);
    }
}
