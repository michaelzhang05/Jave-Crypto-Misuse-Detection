package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class e {
    public static final Bundle a(z4.g... gVarArr) {
        f5.h.e(gVarArr, "pairs");
        Bundle bundle = new Bundle(gVarArr.length);
        for (z4.g gVar : gVarArr) {
            String str = (String) gVar.a();
            Object b6 = gVar.b();
            if (b6 == null) {
                bundle.putString(str, null);
            } else if (b6 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b6).booleanValue());
            } else if (b6 instanceof Byte) {
                bundle.putByte(str, ((Number) b6).byteValue());
            } else if (b6 instanceof Character) {
                bundle.putChar(str, ((Character) b6).charValue());
            } else if (b6 instanceof Double) {
                bundle.putDouble(str, ((Number) b6).doubleValue());
            } else if (b6 instanceof Float) {
                bundle.putFloat(str, ((Number) b6).floatValue());
            } else if (b6 instanceof Integer) {
                bundle.putInt(str, ((Number) b6).intValue());
            } else if (b6 instanceof Long) {
                bundle.putLong(str, ((Number) b6).longValue());
            } else if (b6 instanceof Short) {
                bundle.putShort(str, ((Number) b6).shortValue());
            } else if (b6 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b6);
            } else if (b6 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b6);
            } else if (b6 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b6);
            } else if (b6 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b6);
            } else if (b6 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b6);
            } else if (b6 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b6);
            } else if (b6 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b6);
            } else if (b6 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b6);
            } else if (b6 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b6);
            } else if (b6 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b6);
            } else if (b6 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b6);
            } else if (b6 instanceof Object[]) {
                Class<?> componentType = b6.getClass().getComponentType();
                f5.h.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    f5.h.c(b6, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) b6);
                } else if (String.class.isAssignableFrom(componentType)) {
                    f5.h.c(b6, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) b6);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    f5.h.c(b6, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) b6);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) b6);
                }
            } else {
                if (!(b6 instanceof Serializable)) {
                    if (b6 instanceof IBinder) {
                        c.a(bundle, str, (IBinder) b6);
                    } else if (b6 instanceof Size) {
                        d.a(bundle, str, (Size) b6);
                    } else {
                        if (!(b6 instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + b6.getClass().getCanonicalName() + " for key \"" + str + '\"');
                        }
                        d.b(bundle, str, (SizeF) b6);
                    }
                }
                bundle.putSerializable(str, (Serializable) b6);
            }
        }
        return bundle;
    }
}
