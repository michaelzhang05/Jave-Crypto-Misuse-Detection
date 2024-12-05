package net.sqlcipher;

import android.database.CharArrayBuffer;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import k5.f;
import k5.j;

/* loaded from: classes.dex */
public class CursorWindow extends android.database.CursorWindow implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private long f8032a;

    /* renamed from: b, reason: collision with root package name */
    private int f8033b;

    /* renamed from: c, reason: collision with root package name */
    private int f8034c;

    /* renamed from: d, reason: collision with root package name */
    private static f f8031d = new j();
    public static final Parcelable.Creator<CursorWindow> CREATOR = new a();

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CursorWindow createFromParcel(Parcel parcel) {
            return new CursorWindow(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CursorWindow[] newArray(int i6) {
            return new CursorWindow[i6];
        }
    }

    public CursorWindow(Parcel parcel, int i6) {
        super(true);
        IBinder readStrongBinder = parcel.readStrongBinder();
        this.f8033b = parcel.readInt();
        native_init(readStrongBinder);
    }

    private native boolean allocRow_native();

    private native void close_native();

    private native char[] copyStringToBuffer_native(int i6, int i7, int i8, CharArrayBuffer charArrayBuffer);

    private native void freeLastRow_native();

    private native byte[] getBlob_native(int i6, int i7);

    private native double getDouble_native(int i6, int i7);

    private native long getLong_native(int i6, int i7);

    private native int getNumRows_native();

    private native String getString_native(int i6, int i7);

    private native int getType_native(int i6, int i7);

    private native boolean isBlob_native(int i6, int i7);

    private native boolean isFloat_native(int i6, int i7);

    private native boolean isInteger_native(int i6, int i7);

    private native boolean isNull_native(int i6, int i7);

    private native boolean isString_native(int i6, int i7);

    private native void native_clear();

    private native IBinder native_getBinder();

    private native void native_init(IBinder iBinder);

    private native void native_init(boolean z5, long j6, long j7, long j8);

    private native boolean putBlob_native(byte[] bArr, int i6, int i7);

    private native boolean putDouble_native(double d6, int i6, int i7);

    private native boolean putLong_native(long j6, int i6, int i7);

    private native boolean putNull_native(int i6, int i7);

    private native boolean putString_native(String str, int i6, int i7);

    private native boolean setNumColumns_native(int i6);

    public void D(int i6) {
        this.f8034c = i6;
    }

    @Override // android.database.CursorWindow
    public boolean allocRow() {
        acquireReference();
        try {
            return allocRow_native();
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public void clear() {
        acquireReference();
        try {
            this.f8033b = 0;
            native_clear();
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.sqlite.SQLiteClosable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        releaseReference();
    }

    @Override // android.database.CursorWindow
    public void copyStringToBuffer(int i6, int i7, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
        if (charArrayBuffer.data == null) {
            charArrayBuffer.data = new char[64];
        }
        acquireReference();
        try {
            char[] copyStringToBuffer_native = copyStringToBuffer_native(i6 - this.f8033b, i7, charArrayBuffer.data.length, charArrayBuffer);
            if (copyStringToBuffer_native != null) {
                charArrayBuffer.data = copyStringToBuffer_native;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.database.CursorWindow
    protected void finalize() {
        if (this.f8032a == 0) {
            return;
        }
        close_native();
    }

    @Override // android.database.CursorWindow
    public void freeLastRow() {
        acquireReference();
        try {
            freeLastRow_native();
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public byte[] getBlob(int i6, int i7) {
        acquireReference();
        try {
            return getBlob_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public double getDouble(int i6, int i7) {
        acquireReference();
        try {
            return getDouble_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public float getFloat(int i6, int i7) {
        acquireReference();
        try {
            return (float) getDouble_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public int getInt(int i6, int i7) {
        acquireReference();
        try {
            return (int) getLong_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public long getLong(int i6, int i7) {
        acquireReference();
        try {
            return getLong_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public int getNumRows() {
        acquireReference();
        try {
            return getNumRows_native();
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public short getShort(int i6, int i7) {
        acquireReference();
        try {
            return (short) getLong_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public int getStartPosition() {
        return this.f8033b;
    }

    @Override // android.database.CursorWindow
    public String getString(int i6, int i7) {
        acquireReference();
        try {
            return getString_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public int getType(int i6, int i7) {
        acquireReference();
        try {
            return getType_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean isBlob(int i6, int i7) {
        acquireReference();
        try {
            return isBlob_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean isFloat(int i6, int i7) {
        acquireReference();
        try {
            return isFloat_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean isLong(int i6, int i7) {
        acquireReference();
        try {
            return isInteger_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean isNull(int i6, int i7) {
        acquireReference();
        try {
            return isNull_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean isString(int i6, int i7) {
        acquireReference();
        try {
            return isString_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow, android.database.sqlite.SQLiteClosable
    protected void onAllReferencesReleased() {
        close_native();
        super.onAllReferencesReleased();
    }

    @Override // android.database.CursorWindow
    public boolean putBlob(byte[] bArr, int i6, int i7) {
        acquireReference();
        try {
            return putBlob_native(bArr, i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean putDouble(double d6, int i6, int i7) {
        acquireReference();
        try {
            return putDouble_native(d6, i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean putLong(long j6, int i6, int i7) {
        acquireReference();
        try {
            return putLong_native(j6, i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean putNull(int i6, int i7) {
        acquireReference();
        try {
            return putNull_native(i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean putString(String str, int i6, int i7) {
        acquireReference();
        try {
            return putString_native(str, i6 - this.f8033b, i7);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public boolean setNumColumns(int i6) {
        acquireReference();
        try {
            return setNumColumns_native(i6);
        } finally {
            releaseReference();
        }
    }

    @Override // android.database.CursorWindow
    public void setStartPosition(int i6) {
        this.f8033b = i6;
    }

    public int w() {
        return this.f8034c;
    }

    @Override // android.database.CursorWindow, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStrongBinder(native_getBinder());
        parcel.writeInt(this.f8033b);
    }

    public CursorWindow(boolean z5) {
        super(z5);
        this.f8033b = 0;
        if (f8031d == null) {
            f8031d = new j();
        }
        native_init(z5, f8031d.c(), f8031d.b(), f8031d.a());
    }
}
