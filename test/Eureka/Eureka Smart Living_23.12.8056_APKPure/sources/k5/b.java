package k5;

import android.database.CharArrayBuffer;
import net.sqlcipher.CursorWindow;

/* loaded from: classes.dex */
public abstract class b extends a {

    /* renamed from: n, reason: collision with root package name */
    protected CursorWindow f7205n;

    @Override // android.database.CrossProcessCursor
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public CursorWindow getWindow() {
        return this.f7205n;
    }

    @Override // k5.a, android.database.Cursor
    public void copyStringToBuffer(int i6, CharArrayBuffer charArrayBuffer) {
        g();
        synchronized (this.f7194d) {
            if (D(i6)) {
                super.copyStringToBuffer(i6, charArrayBuffer);
            }
        }
        this.f7205n.copyStringToBuffer(this.f7196f, i6, charArrayBuffer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k5.a
    public void g() {
        super.g();
        if (this.f7205n == null) {
            throw new m("Access closed cursor");
        }
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i6) {
        g();
        synchronized (this.f7194d) {
            if (!D(i6)) {
                return this.f7205n.getBlob(this.f7196f, i6);
            }
            return (byte[]) w(i6);
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i6) {
        g();
        synchronized (this.f7194d) {
            if (!D(i6)) {
                return this.f7205n.getDouble(this.f7196f, i6);
            }
            return ((Number) w(i6)).doubleValue();
        }
    }

    @Override // android.database.Cursor
    public float getFloat(int i6) {
        g();
        synchronized (this.f7194d) {
            if (!D(i6)) {
                return this.f7205n.getFloat(this.f7196f, i6);
            }
            return ((Number) w(i6)).floatValue();
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i6) {
        g();
        synchronized (this.f7194d) {
            if (!D(i6)) {
                return this.f7205n.getInt(this.f7196f, i6);
            }
            return ((Number) w(i6)).intValue();
        }
    }

    @Override // k5.a, android.database.Cursor
    public long getLong(int i6) {
        g();
        synchronized (this.f7194d) {
            if (!D(i6)) {
                return this.f7205n.getLong(this.f7196f, i6);
            }
            return ((Number) w(i6)).longValue();
        }
    }

    @Override // android.database.Cursor
    public short getShort(int i6) {
        g();
        synchronized (this.f7194d) {
            if (!D(i6)) {
                return this.f7205n.getShort(this.f7196f, i6);
            }
            return ((Number) w(i6)).shortValue();
        }
    }

    @Override // k5.a, android.database.Cursor
    public String getString(int i6) {
        g();
        synchronized (this.f7194d) {
            if (!D(i6)) {
                return this.f7205n.getString(this.f7196f, i6);
            }
            return (String) w(i6);
        }
    }

    @Override // android.database.Cursor, k5.d
    public int getType(int i6) {
        g();
        return this.f7205n.getType(this.f7196f, i6);
    }

    @Override // android.database.Cursor
    public boolean isNull(int i6) {
        g();
        synchronized (this.f7194d) {
            if (D(i6)) {
                return w(i6) == null;
            }
            return this.f7205n.isNull(this.f7196f, i6);
        }
    }
}
