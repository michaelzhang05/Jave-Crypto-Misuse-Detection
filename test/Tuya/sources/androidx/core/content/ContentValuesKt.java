package androidx.core.content;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(L5.r... rVarArr) {
        ContentValues contentValues = new ContentValues(rVarArr.length);
        for (L5.r rVar : rVarArr) {
            String str = (String) rVar.a();
            Object b8 = rVar.b();
            if (b8 == null) {
                contentValues.putNull(str);
            } else if (b8 instanceof String) {
                contentValues.put(str, (String) b8);
            } else if (b8 instanceof Integer) {
                contentValues.put(str, (Integer) b8);
            } else if (b8 instanceof Long) {
                contentValues.put(str, (Long) b8);
            } else if (b8 instanceof Boolean) {
                contentValues.put(str, (Boolean) b8);
            } else if (b8 instanceof Float) {
                contentValues.put(str, (Float) b8);
            } else if (b8 instanceof Double) {
                contentValues.put(str, (Double) b8);
            } else if (b8 instanceof byte[]) {
                contentValues.put(str, (byte[]) b8);
            } else if (b8 instanceof Byte) {
                contentValues.put(str, (Byte) b8);
            } else if (b8 instanceof Short) {
                contentValues.put(str, (Short) b8);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b8.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return contentValues;
    }
}
