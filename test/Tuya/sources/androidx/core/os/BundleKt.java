package androidx.core.os;

import L5.r;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class BundleKt {
    public static final Bundle bundleOf(r... rVarArr) {
        Bundle bundle = new Bundle(rVarArr.length);
        for (r rVar : rVarArr) {
            String str = (String) rVar.a();
            Object b8 = rVar.b();
            if (b8 == null) {
                bundle.putString(str, null);
            } else if (b8 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b8).booleanValue());
            } else if (b8 instanceof Byte) {
                bundle.putByte(str, ((Number) b8).byteValue());
            } else if (b8 instanceof Character) {
                bundle.putChar(str, ((Character) b8).charValue());
            } else if (b8 instanceof Double) {
                bundle.putDouble(str, ((Number) b8).doubleValue());
            } else if (b8 instanceof Float) {
                bundle.putFloat(str, ((Number) b8).floatValue());
            } else if (b8 instanceof Integer) {
                bundle.putInt(str, ((Number) b8).intValue());
            } else if (b8 instanceof Long) {
                bundle.putLong(str, ((Number) b8).longValue());
            } else if (b8 instanceof Short) {
                bundle.putShort(str, ((Number) b8).shortValue());
            } else if (b8 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b8);
            } else if (b8 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b8);
            } else if (b8 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b8);
            } else if (b8 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b8);
            } else if (b8 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b8);
            } else if (b8 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b8);
            } else if (b8 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b8);
            } else if (b8 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b8);
            } else if (b8 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b8);
            } else if (b8 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b8);
            } else if (b8 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b8);
            } else if (b8 instanceof Object[]) {
                Class<?> componentType = b8.getClass().getComponentType();
                AbstractC3159y.f(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC3159y.g(b8, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) b8);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC3159y.g(b8, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) b8);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC3159y.g(b8, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) b8);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b8);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (b8 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b8);
            } else if (b8 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b8);
            } else if (b8 instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, str, (Size) b8);
            } else if (b8 instanceof SizeF) {
                BundleApi21ImplKt.putSizeF(bundle, str, (SizeF) b8);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b8.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
