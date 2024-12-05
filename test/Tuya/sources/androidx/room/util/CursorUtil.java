package androidx.room.util;

import M5.AbstractC1239l;
import V5.b;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.EnvironmentCompat;
import g6.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3159y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor c8) {
        AbstractC3159y.i(c8, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c8.getColumnNames(), c8.getCount());
            while (c8.moveToNext()) {
                Object[] objArr = new Object[c8.getColumnCount()];
                int columnCount = c8.getColumnCount();
                for (int i8 = 0; i8 < columnCount; i8++) {
                    int type = c8.getType(i8);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i8] = c8.getBlob(i8);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i8] = c8.getString(i8);
                                }
                            } else {
                                objArr[i8] = Double.valueOf(c8.getDouble(i8));
                            }
                        } else {
                            objArr[i8] = Long.valueOf(c8.getLong(i8));
                        }
                    } else {
                        objArr[i8] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            b.a(c8, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        AbstractC3159y.h(columnNames, "columnNames");
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(Cursor c8, String name) {
        AbstractC3159y.i(c8, "c");
        AbstractC3159y.i(name, "name");
        int columnIndex = c8.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c8.getColumnIndex('`' + name + '`');
        if (columnIndex2 < 0) {
            return findColumnIndexBySuffix(c8, name);
        }
        return columnIndex2;
    }

    public static final int getColumnIndexOrThrow(Cursor c8, String name) {
        String str;
        AbstractC3159y.i(c8, "c");
        AbstractC3159y.i(name, "name");
        int columnIndex = getColumnIndex(c8, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c8.getColumnNames();
            AbstractC3159y.h(columnNames, "c.columnNames");
            str = AbstractC1239l.z0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e8) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e8);
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    public static final <R> R useCursor(Cursor cursor, Function1 block) {
        AbstractC3159y.i(cursor, "<this>");
        AbstractC3159y.i(block, "block");
        try {
            R r8 = (R) block.invoke(cursor);
            AbstractC3157w.b(1);
            b.a(cursor, null);
            AbstractC3157w.a(1);
            return r8;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(final Cursor cursor, final String[] columnNames, final int[] mapping) {
        AbstractC3159y.i(cursor, "cursor");
        AbstractC3159y.i(columnNames, "columnNames");
        AbstractC3159y.i(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil$wrapMappedColumns$2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String columnName) {
                    AbstractC3159y.i(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length) {
                        int i10 = i9 + 1;
                        if (n.s(strArr[i8], columnName, true)) {
                            return iArr[i9];
                        }
                        i8++;
                        i9 = i10;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
    }

    @VisibleForTesting(otherwise = 2)
    public static final int findColumnIndexBySuffix(String[] columnNames, String name) {
        AbstractC3159y.i(columnNames, "columnNames");
        AbstractC3159y.i(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            String str3 = columnNames[i8];
            int i10 = i9 + 1;
            if (str3.length() >= name.length() + 2) {
                if (n.r(str3, str, false, 2, null)) {
                    return i9;
                }
                if (str3.charAt(0) == '`' && n.r(str3, str2, false, 2, null)) {
                    return i9;
                }
            }
            i8++;
            i9 = i10;
        }
        return -1;
    }
}
