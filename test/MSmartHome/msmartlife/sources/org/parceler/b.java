package org.parceler;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

/* compiled from: InjectionUtil.java */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: InjectionUtil.java */
    /* renamed from: org.parceler.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC0385b<T, E extends AccessibleObject> implements PrivilegedExceptionAction<T> {
        private final E a;

        protected AbstractC0385b(E e2) {
            this.a = e2;
        }

        public abstract T a(E e2) throws Exception;

        @Override // java.security.PrivilegedExceptionAction
        public T run() throws Exception {
            boolean isAccessible = this.a.isAccessible();
            this.a.setAccessible(true);
            T a = a(this.a);
            this.a.setAccessible(isAccessible);
            return a;
        }
    }

    /* compiled from: InjectionUtil.java */
    /* loaded from: classes2.dex */
    private static final class c<T> extends AbstractC0385b<T, Field> {

        /* renamed from: b, reason: collision with root package name */
        private final Object f22339b;

        @Override // org.parceler.b.AbstractC0385b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public T a(Field field) throws IllegalAccessException {
            return (T) field.get(this.f22339b);
        }

        private c(Field field, Object obj) {
            super(field);
            this.f22339b = obj;
        }
    }

    /* compiled from: InjectionUtil.java */
    /* loaded from: classes2.dex */
    private static final class d extends AbstractC0385b<Void, Field> {

        /* renamed from: b, reason: collision with root package name */
        private final Object f22340b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f22341c;

        @Override // org.parceler.b.AbstractC0385b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(Field field) throws IllegalAccessException {
            field.set(this.f22340b, this.f22341c);
            return null;
        }

        private d(Field field, Object obj, Object obj2) {
            super(field);
            this.f22340b = obj;
            this.f22341c = obj2;
        }
    }

    public static <T> T a(Class<T> cls, Class<?> cls2, Object obj, String str) {
        try {
            return (T) AccessController.doPrivileged(new c(cls2.getDeclaredField(str), obj));
        } catch (NoSuchFieldException e2) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e2);
        } catch (PrivilegedActionException e3) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e3);
        } catch (Exception e4) {
            throw new ParcelerRuntimeException("Exception during field injection", e4);
        }
    }

    public static void b(Class<?> cls, Object obj, String str, Object obj2) {
        try {
            AccessController.doPrivileged(new d(cls.getDeclaredField(str), obj, obj2));
        } catch (NoSuchFieldException e2) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e2);
        } catch (PrivilegedActionException e3) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e3);
        } catch (Exception e4) {
            throw new ParcelerRuntimeException("Exception during field injection", e4);
        }
    }
}
