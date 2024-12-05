package com.google.gson.t.o;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes2.dex */
final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    private static Class f16981b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f16982c = d();

    /* renamed from: d, reason: collision with root package name */
    private final Field f16983d = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f16981b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.t.o.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f16982c != null && this.f16983d != null) {
            try {
                f16981b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f16982c, accessibleObject, Long.valueOf(((Long) f16981b.getMethod("objectFieldOffset", Field.class).invoke(this.f16982c, this.f16983d)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
