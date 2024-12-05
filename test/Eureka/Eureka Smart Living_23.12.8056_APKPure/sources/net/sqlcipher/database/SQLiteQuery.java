package net.sqlcipher.database;

import android.os.SystemClock;
import android.util.Log;
import net.sqlcipher.CursorWindow;

/* loaded from: classes.dex */
public class SQLiteQuery extends SQLiteProgram {

    /* renamed from: i, reason: collision with root package name */
    private int f8086i;

    /* renamed from: j, reason: collision with root package name */
    private String[] f8087j;

    /* renamed from: k, reason: collision with root package name */
    private Object[] f8088k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i6, Object[] objArr) {
        super(sQLiteDatabase, str);
        this.f8086i = i6;
        this.f8088k = objArr;
        this.f8087j = new String[objArr != null ? objArr.length : 0];
    }

    private final native int native_column_count();

    private final native String native_column_name(int i6);

    private final native int native_fill_window(CursorWindow cursorWindow, int i6, int i7, int i8, int i9, int i10);

    public void I(Object[] objArr) {
        int i6;
        long j6;
        Long valueOf;
        int i7;
        Double valueOf2;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                b(i8 + 1);
            } else {
                if (obj instanceof Double) {
                    i7 = i8 + 1;
                    valueOf2 = (Double) obj;
                } else if (obj instanceof Float) {
                    i7 = i8 + 1;
                    valueOf2 = Double.valueOf(((Number) obj).floatValue());
                } else {
                    if (obj instanceof Long) {
                        i6 = i8 + 1;
                        valueOf = (Long) obj;
                    } else if (obj instanceof Integer) {
                        i6 = i8 + 1;
                        valueOf = Long.valueOf(((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        i6 = i8 + 1;
                        j6 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        a(i6, j6);
                    } else if (obj instanceof byte[]) {
                        x(i8 + 1, (byte[]) obj);
                    } else {
                        p(i8 + 1, obj.toString());
                    }
                    j6 = valueOf.longValue();
                    a(i6, j6);
                }
                c(i7, valueOf2.doubleValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int J() {
        g();
        try {
            return native_column_count();
        } finally {
            G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String K(int i6) {
        g();
        try {
            return native_column_name(i6);
        } finally {
            G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L(CursorWindow cursorWindow, int i6, int i7) {
        SystemClock.uptimeMillis();
        this.f8080c.c0();
        try {
            g();
            try {
                cursorWindow.acquireReference();
                int native_fill_window = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), cursorWindow.w(), this.f8086i, i6, i7);
                if (SQLiteDebug.f8073a) {
                    Log.d("Cursor", "fillWindow(): " + this.f8081d);
                }
                return native_fill_window;
            } catch (IllegalStateException unused) {
                G();
                this.f8080c.t0();
                return 0;
            } finally {
                cursorWindow.releaseReference();
            }
        } finally {
            G();
            this.f8080c.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        String[] strArr = this.f8087j;
        if (strArr != null) {
            int length = strArr.length;
            Object[] objArr = this.f8088k;
            if (objArr != null) {
                I(objArr);
                return;
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = i6 + 1;
                super.p(i7, this.f8087j[i6]);
                i6 = i7;
            }
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram, j0.c
    public void a(int i6, long j6) {
        this.f8087j[i6 - 1] = Long.toString(j6);
        if (this.f8085h) {
            return;
        }
        super.a(i6, j6);
    }

    @Override // net.sqlcipher.database.SQLiteProgram, j0.c
    public void b(int i6) {
        this.f8087j[i6 - 1] = null;
        if (this.f8085h) {
            return;
        }
        super.b(i6);
    }

    @Override // net.sqlcipher.database.SQLiteProgram, j0.c
    public void c(int i6, double d6) {
        this.f8087j[i6 - 1] = Double.toString(d6);
        if (this.f8085h) {
            return;
        }
        super.c(i6, d6);
    }

    @Override // net.sqlcipher.database.SQLiteProgram, j0.c
    public void p(int i6, String str) {
        this.f8087j[i6 - 1] = str;
        if (this.f8085h) {
            return;
        }
        super.p(i6, str);
    }

    public String toString() {
        return "SQLiteQuery: " + this.f8081d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i6, String[] strArr) {
        super(sQLiteDatabase, str);
        this.f8086i = i6;
        this.f8087j = strArr;
    }
}
